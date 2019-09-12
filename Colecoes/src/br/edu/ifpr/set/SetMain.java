package br.edu.ifpr.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import br.edu.ifpr.entidades.Livro;

public class SetMain {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro("12345", "Java 8");
		Livro livro2 = new Livro("87654", "PHP completo");
		Livro livro3 = new Livro("76543", "Avançado: Java");
		
		//============== HASHSET ==============
		System.out.println("============== HASHSET ==============");

		Set<Livro> listaLivros = new HashSet<Livro>();
		
		listaLivros.add(livro1);
		listaLivros.add(livro2);
		listaLivros.add(livro3);
		
		
		for (Livro livro : listaLivros) {
			System.out.println(livro);
		}
		
		System.out.println("============== LINKEDHASHSET ==============");

		Set<Livro> listaLivrosLinked = new LinkedHashSet<Livro>();
		
		listaLivrosLinked.add(livro1);
		listaLivrosLinked.add(livro2);
		listaLivrosLinked.add(livro3);
		
		
		for (Livro livro : listaLivrosLinked) {
			System.out.println(livro);
		}
		
		System.out.println("============== TREESET ==============");

		Set<Livro> listaLivrosTree = new TreeSet<Livro>();
		
		listaLivrosTree.add(livro1);
		listaLivrosTree.add(livro2);
		listaLivrosTree.add(livro3);
		
		for (Livro livro : listaLivrosTree) {
			System.out.println(livro);
		}
		
		
		//================== PRÁTICA ======
		
		//REMOVER UM ELEMENTO DA LISTA listaLivros
		
		listaLivros.remove(livro2);
		System.out.println("REMOVER UM ELEMENTO DA LISTA listaLivros");
		for (Livro livro : listaLivros) {
			System.out.println(livro);
		}
		
		
		
		
		
		
	}

}
