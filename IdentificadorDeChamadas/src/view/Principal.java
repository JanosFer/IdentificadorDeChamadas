package view;

import javax.swing.JOptionPane;

import controller.TelefoneController;
import br.com.filagenerica.Fila;

public class Principal {
	static int i = 1;
	public static void main(String[] args) {
		Fila<String> fila = new Fila<String>();
		
		TelefoneController tc = new TelefoneController();
		
		int opc = 0;
		String numero = "";
		
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n 1 - Adicionar um número na lista; \n 2 - Consultar ligações perdidas; \n 9 - Sair."));
			switch(opc) {
				case 1:
					numero = JOptionPane.showInputDialog("Informe um número de telefone: ");
					
					tc.insereLigacao(fila, numero);
					break;
				case 2:
					tc.consultaLigacao(fila);
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		}
	}
}
