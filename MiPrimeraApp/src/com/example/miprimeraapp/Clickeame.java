/**
 * 
 */
package com.example.miprimeraapp;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;

/**
 * @author Alberto Vivas
 *
 * 
 */
public class Clickeame implements android.view.View.OnClickListener{

	/* (non-Javadoc)
	 * @see android.view.View.OnClickListener#onClick(android.view.View)
	 */
	@Override
	public void onClick(View v) {
		String entrada = MainActivity.getTextoEntrada().getText().toString();
		TextView textoSalida = MainActivity.getTextoSalida();
		textoSalida.setText(VolteaPalabra(entrada));
	}

	public String VolteaPalabra(String palabra) {
		String respuesta="";
		int max = palabra.length();
		
		for (int i = max-1; i>=0; i--) {
			respuesta+=palabra.charAt(i);
		}
		return respuesta;
	}
	

}
