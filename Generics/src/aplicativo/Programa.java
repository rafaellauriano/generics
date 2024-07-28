package aplicativo;

import java.util.Scanner;

import servico.PrintService;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("Quantos valores ? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			Integer valor = sc.nextInt();
			ps.addValor(valor);
		}
		
		ps.imprimir();
		Integer x = ps.primeiro();
		System.out.println("Primeiro: " + x);
		
		sc.close();
		
	}

}
