package mipaquete;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class agenda {
	private String nombre;
	private int numero;
	private String email;
	private main main;
	private vista vis;
	private File f;
	private String lista;
	private String texto;
	private String texto2;
	private String bus;

	public agenda() {
		f = new File("D://agenda.csv");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertar(String texto) {
		FileWriter fw;
		try {
			fw = new FileWriter(f, true);
			fw.write(texto + "\n");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void listar() {
		FileReader fr;
		try {
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			texto = br.readLine();
			texto2 = "";
			while (texto != null) {
//				Hacer que en este metodo no haya syso
				texto2 = texto2 + texto + "\n";
//				System.out.println(texto);
				texto = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getTexto2() {
		return texto2;

	}

	public void buscar(String textoN) {

		FileReader fr;
		try {
			bus = "";
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String t = br.readLine();
			while (t != null) {
				String[] tex = t.split(",");
				if (textoN.equalsIgnoreCase(tex[0])) {
					bus = bus + t + "\n";
//					System.out.println(t);
				}
				t = br.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getBus() {
		return bus;
	}

	public void cambiar(String camb) throws IOException {
		f = new File(camb);
		if (!f.exists()) {
			f.createNewFile();

		}
	}
}
