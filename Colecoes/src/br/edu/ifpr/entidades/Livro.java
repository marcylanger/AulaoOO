package br.edu.ifpr.entidades;

import java.util.HashSet;
import java.util.Set;

public class Livro implements Comparable<Livro> {

	private String isbn;
	private String titulo;
	private Set<Exemplar> exemplares = new HashSet<Exemplar>();
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
	public Set<Exemplar> getExemplares() {
		return exemplares;
	}
	public void setExemplares(Set<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}
	@Override
	public String toString() {
		return "Livro [isbn=" + isbn + ", titulo=" + titulo + "]";
	}
	
	public Livro(){
		
	}
	
	public Livro(String isbn, String titulo) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	@Override
	public int compareTo(Livro livro) {
		return this.isbn.compareTo(livro.getIsbn());
	}
	
	
	
	
	
	
	
	
	
}
