package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = " ";
		String outroVazio = vazio.trim();
		
		System.out.println(outroVazio.isEmpty());
		
		String nome = "BCM"; //object literal
		//String outro = new String("Teste");
		
		System.out.println(nome.contains("CM"));
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		char teste = nome.charAt(2);
		int pos = nome.indexOf("CM");
		System.out.println(pos);
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		char c = 'B';
		char d = 'b';
		
		String nome2 = nome.replace(c, d);
		String nome3 = nome.toLowerCase();
		
		System.out.println(nome2);
		System.out.println(nome3);
		System.out.println(teste);

	}

}
