package application;

import java.util.Scanner;

import entities.Triangle;

public class Programa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite os valores dos lados do triângulo X: ");
		x.a = entrada.nextDouble();
		x.b = entrada.nextDouble();
		x.c = entrada.nextDouble();
		
		System.out.println("Digite os valores dos lados do triângulo Y: ");
		y.a = entrada.nextDouble();
		y.b = entrada.nextDouble();
		y.c = entrada.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println("Área do triângulo X: " + areaX);
		System.out.println("Área do triângulo Y: " + areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior área: X");
		}
		else {
			System.out.println("Maior área: Y");
		}
	}

}
