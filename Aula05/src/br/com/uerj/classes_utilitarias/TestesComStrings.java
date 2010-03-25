package br.com.uerj.classes_utilitarias;

public class TestesComStrings {


	public static void main(String[] args) {
		
		String palavra = "palavra";
		palavra = palavra + " outra";
		
		System.out.println(palavra);

		StringBuilder sb = new StringBuilder();
		sb.append("palavra");
		sb.append(" outra");
		
		System.out.println(sb);
		
	}

}
