package com.example.miprimeraapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private static EditText textoEntrada;
	private static TextView textoSalida;

	@Override //este es lo que dibuja al principio
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button boton = (Button) findViewById(R.id.button1);
		textoEntrada= (EditText) findViewById(R.id.EditTextEntrada);
		textoSalida= (TextView) findViewById(R.id.textViewSalida);
		boton.setOnClickListener(new Clickeame());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		switch (id) {
		case  R.id.action_close:
			finish();
			break;
		case R.id.action_9gag:
			Intent i = new Intent("android.intent.action.VIEW", Uri.parse("http://www.9gag.com"));
			startActivity(i);
			break;
		case R.id.action_google:
			Intent i2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com"));
			startActivity(i2);
			break;
		case R.id.action_yout:
			Intent i3 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.youtuve.com"));
			startActivity(i3);
			break;
		case R.id.action_Seg_act:
			Intent i4 = new Intent(this,SegundaActividad.class);
			startActivity(i4);
			break;
		default:
			break;
		}
		
		
		
		
		
		
		return super.onOptionsItemSelected(item);
	}

	public static EditText getTextoEntrada() {
		return textoEntrada;
	}

	public static TextView getTextoSalida() {
		return textoSalida;
	}
	
	public void mostrar(View v){
		Intent i = new Intent(this, SegundaActividad.class);
		EditText nombre = (EditText) findViewById(R.id.editTextNombre);
		EditText pass   = (EditText) findViewById(R.id.editTextPass);
		EditText fecha  = (EditText) findViewById(R.id.editTextFecha);
		
		i.putExtra("nombre",nombre.getText().toString());
		i.putExtra("pass",pass.getText().toString());
		i.putExtra("fecha",fecha.getText().toString());
		startActivity(i);
	}
	
	
}
