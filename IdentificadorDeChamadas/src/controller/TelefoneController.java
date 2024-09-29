package controller;

import br.com.filagenerica.Fila;

public class TelefoneController {
	public void insereLigacao(Fila<String> f, String numeroTelefone) {
		f.insert(numeroTelefone);
	}
	
	public void consultaLigacao(Fila<String> fila) {
		try {
			fila.list();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
