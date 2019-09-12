package br.edu.ifpr.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import br.edu.ifpr.entidades.Exemplar;
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
		
		//ADICIONAR ELEMENTOS DE UMA COLEÇÃO EM OUTRA COLEÇÃO
		Set<Livro> livrosAdicionais = new HashSet<Livro>();
		
		Livro livroAdicional1 = new Livro("987456", "PostgreSQL 9");
		Livro livroAdicional2 = new Livro("321789", "SQLite");
		
		livrosAdicionais.add(livroAdicional1);
		livrosAdicionais.add(livroAdicional2);
		
		listaLivros.addAll(livrosAdicionais);
		
		System.out.println("ADICIONAR ELEMENTOS DE UMA COLEÇÃO EM OUTRA COLEÇÃO: listaLivros");
		for (Livro livro : listaLivros) {
			System.out.println(livro);
		}
		
		//REMOVER ELEMENTOS DE UMA COLEÇÃO EM OUTRA COLEÇÃO
		
		listaLivros.removeAll(livrosAdicionais);
		System.out.println("REMOVER ELEMENTOS DE UMA COLEÇÃO EM OUTRA COLEÇÃO: listaLivros");
		for (Livro livro : listaLivros) {
			System.out.println(livro);
		}
		
		//VERIFICAR SE UM ELEMENTO ESTÁ PRESENTE NA COLEÇÃO
		
		System.out.println(
				"O elemento está presente na coleção? " 
						+ (listaLivros.contains(livro1)?"Sim":"Não"));
		
		System.out.println(
				"O elemento está presente na coleção? " 
						+ (listaLivros.contains(livroAdicional2) ? "Sim": "Não"));
		
		//ADICIONAR ELEMENTOS DUPLICADOS NA COLEÇÃO
		
		System.out.println(
				"Foi possível adicionar o elemento na coleção? "
						+ (listaLivros.add(livro1)? "Sim" : "Não"));
		
		
		
		
		//VERIFICAR O NÚMERO DE ELEMENTOS CONTIDOS NA COLEÇÃO
		
		System.out.println("O número de elementos contidos na coleção é: " 
						+ listaLivros.size());
		
		
		//VERIFICAR SE A COLEÇÃO ESTÁ VAZIA
		System.out.println("A coleção está vazia? "
				+ (listaLivros.isEmpty() ? "Sim" : "Não"));
		
		//LIMPAR A COLEÇÃO
		listaLivros.clear();
		
		
		//VERIFICAR SE A COLEÇÃO ESTÁ VAZIA
		System.out.println("A coleção está vazia? "
				+ (listaLivros.isEmpty() ? "Sim" : "Não"));
		
		//EXEMPLARES DE LIVRO
		
		Exemplar ex1 = new Exemplar("111");
		Exemplar ex2 = new Exemplar("222");
		Exemplar ex3 = new Exemplar("333");
		
		
		livro1.getExemplares().add(ex1);
		livro1.getExemplares().add(ex2);
		livro1.getExemplares().add(ex3);
		
		System.out.println("Os exemplares do livro: \n" 
		+ livro1 + "\nSão: ");
		for(Exemplar exemplar : livro1.getExemplares()){
			System.out.println(exemplar);
		}
		
		
		
		
		
		
		
	}

}
