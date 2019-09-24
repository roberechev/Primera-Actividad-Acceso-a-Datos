package mipaquete;

import java.io.IOException;
import java.util.Scanner;

public class vista {
	private agenda agen;
	private main main;
	private String texto;
	private String textoN;
	private String camb;
	Scanner sc = new Scanner(System.in);

	public void insertarV() {
		String separador = ",";
		System.out.println("Nombre: ");
		System.out.println();
		String texto1 = sc.nextLine();
		System.out.println("email: ");
		String texto2 = sc.nextLine();
		System.out.println("telefono: ");
		String texto3 = sc.nextLine();
		texto = texto1 + separador + texto2 + separador + texto3;
		agen.insertar(texto);

	}

	public void listarV() {
		agen.listar();
		System.out.println(agen.getTexto2());
	}

	public void setAgen(agenda agen) {
		this.agen = agen;
	}

	public void buscarV() {
		System.out.println("Buscar por(nombre): ");
		textoN = sc.nextLine();
		agen.buscar(textoN);
		System.out.println(agen.getBus());

	}

	public void cambiarV() {
		System.out.println("Escriba la ruta del fichero que quieres: ");
		camb = sc.nextLine();
		try {
			agen.cambiar(camb);
		} catch (IOException e) {
			System.err.println("Algo a fallado");
			cambiarV();
		}
	}
}
