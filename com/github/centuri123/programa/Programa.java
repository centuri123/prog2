package com.github.centuri123.programa;

public class Programa {

	public static void main(String[] args) {
		int soma = 0;
		for(int i = 0; i < args.length; i++) {
			if(args != null) {
				soma += Integer.parseInt(args[i]);
			}
		}
		System.out.println("Soma dos valores contidos nos argumentos " + soma);
	}

}
