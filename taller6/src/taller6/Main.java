package taller6;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		
	}
	
	public void punto7() {
		/*En una clase determinada, existen 5 pruebas que valen 100 puntos cada una. Escriba un programa que tome los 5 resultados
        de las pruebas para el usuario, guarde los resultados de las pruebas en un array y, luego, calcule el promedio de los
        estudiantes.*/
		
		Double[] resultados=new Double [4];
		double acumulador=0, total;
		
		for (int i = 0; i < resultados.length; i++) {
			resultados[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la prueba"));
			acumulador=resultados[i]+acumulador;
		}
		total=acumulador/5;
	    JOptionPane.showMessageDialog(null,"El promedio de los estudiantes es: "+ total);
	}
	
	public void punto8() {
		Scanner in= new Scanner(System.in);
		String opciones;
		int[][] A= new int[2][2];
		int[][] B=new int [2][2];
		int[][] suma=new int [2][2];
		opciones=JOptionPane.showInputDialog("Menu \n"
				+ "A. Enter arreglo A\n"
				+ "B. Enter arreglo B\n"
				+ "C. Display A+B\n"
				+ "D. Display A-B\n"
				+ "E. Display A*B\n"
				+ "F. Exit");
		
		switch (opciones) {
		case "A":
			for (int i = 0; i < A.length; i++) {
				for (int j = 0; j < A[i].length; j++) {
					System.out.println("Digite el valor de la fila "+i+", columna "+j);
					A[i][j]=in.nextInt();
				}
			}
			break;
        case "B":
        	for (int i = 0; i < A.length; i++) {
				for (int j = 0; j < B[i].length; j++) {
					System.out.println("Digite el valor de la fila "+i+", columna "+j);
					B[i][j]=in.nextInt();
				}
        	}
			
			break;
        case "C":
			for (int i = 0; i < A[i].length; i++) {
				for (int j = 0; j < B[i].length; j++) {
					suma[i]=A[i]+B[j];
				}
			}
			break;
        case "D":
			
			break;
        case "E":
			
			break;
        case "F":
			
			break;

		default:
			break;
		}
		
	}
	
	public void Punto9() {
		
	}

}
