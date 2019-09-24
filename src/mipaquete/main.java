package mipaquete;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		agenda agenda = new agenda();
		vista vista = new vista();

		vista.setAgen(agenda);
		vista.cambiarV();

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Escribe 1 para insertar, 2 para listar, 3 para buscar, 4 cambiar sitio de guardado o 5 Salir");
		int num = sc.nextInt();
		while (num != 5) {
			if (num == 1) {
				vista.insertarV();
			} else if (num == 2) { 
				vista.listarV();
			} else if (num == 3) {
				vista.buscarV();
			} else if (num == 4) {
				vista.cambiarV();
			} else {
				System.out.println("Intruduzca un número valido");
			}
			System.out.println(
					"Escribe 1 para insertar, 2 para listar, 3 para buscar, 4 cambiar sitio de guardado o 5 Salir");
			num = sc.nextInt();
		}
		System.out.println("Finalizado con exito");

	}

}
