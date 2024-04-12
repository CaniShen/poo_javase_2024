package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Movimiento;
import service.Cuenta;
import service.CuentaLimite;
import service.CuentaMovimiento;

public class Banco {
	static CuentaMovimiento cuentamov;
	static Cuenta service = new Cuenta();

	public static void main(String[] args) {
		/*
		 * Pide el saldo inicial y limite, después: 1.- Ingresar 2.- Extraer 3.- Saldo y
		 * movimientos 4.- Salir
		 */
		double saldo, limite;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca saldo inicial: ");
		saldo = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca límite: ");
		limite = Double.parseDouble(sc.nextLine());
		cuentamov = new CuentaMovimiento(saldo, limite);
		// ahora viene el rollo menú...
		int opcion;
		do {
			// presentar menu
			// leer opción y comprobar opción elegida
			mostrarMenu();
			opcion = sc.nextInt();// lee la opción elegida
			switch (opcion) { /// evaluamos
			case 1:
				intresar();
				break;
			case 2:
				extraer();
			case 3:
				mostrarMovimientos();
				break;
			case 4:
				System.out.println("----Adios!-----");
				break;

			}

		} while (opcion != 4);// mienstras no seleccione 4)

	}

	// resto de métodos
	static void mostrarMenu() {
		System.out.println("1.- Ingresar dinero");
		System.out.println("2.- Extraer dinero");
		System.out.println("3.- Mostrar movimientos");
		System.out.println("4.- Salir");
	}

	static void intresar() {
		Scanner sc = new Scanner(System.in);
		double cantidad;
		System.out.println("Introduce cantidad");
		cantidad = Double.parseDouble(sc.nextLine());
		cuentamov.ingresar(cantidad);

	}
	static void extraer() {
		Scanner sc=new Scanner(
System.in
);
		double cantidad;
		System.out.println("Introduce cantidad");
		cantidad=Double.parseDouble(sc.nextLine());
		cuentamov.extraer(cantidad);
	}
	static void mostrarMovimientos() {
		ArrayList<Movimiento> movs=cuentamov.obtenerMovimiento();
		/*for(Movimiento m:movs) {
			System.out.println(m);
		}*/
		System.out.println(movs);
		System.out.println("Saldo final: "+cuentamov.obtenerSaldo());
	}
} 