/**
 * 
 */
package com.example.miprimeraapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author Alberto Vivas
 *
 * 
 */
public class SegundaActividad extends Activity {
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		
		
		
		TextView mostrar_nombre = (TextView) findViewById(R.id.textViewNombre);
		TextView mostrar_fecha = (TextView) findViewById(R.id.textViewFecha);
		TextView mostrar_pass = (TextView) findViewById(R.id.textViewPass);
		
		mostrar_nombre.setText((String)getIntent().getExtras().get("nombre"));
		mostrar_fecha.setText((String)getIntent().getExtras().get("fecha"));
		mostrar_pass.setText((String)getIntent().getExtras().get("pass"));
		
	}
}
