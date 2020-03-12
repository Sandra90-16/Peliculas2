package Peliculas2;

import java.time.Year;
import java.util.ArrayList;
import java.util.Collection;

import Peliculas1.Genero;

public class Pelicula {

	Collection actores = new ArrayList<Actor>();
	Collection guionistas = new ArrayList<Guionista>();
	Collection director = new ArrayList<Director>();
	Collection editor = new ArrayList<Editor>();
	Collection productor = new ArrayList<Productor>();
	
	public Collection getActores() {
		return actores;
	}
	public void setActores(Collection actores) {
		this.actores = actores;
	}
	public Collection getGuionistas() {
		return guionistas;
	}
	public void setGuionistas(Collection guionistas) {
		this.guionistas = guionistas;
	}
	public Collection getDirector() {
		return director;
	}
	public void setDirector(Collection director) {
		this.director = director;
	}
	public Collection getEditor() {
		return editor;
	}
	public void setEditor(Collection editor) {
		this.editor = editor;
	}
	public Collection getProductor() {
		return productor;
	}
	public void setProductor(Collection productor) {
		this.productor = productor;
	}
	private String titulo;
	private Year agno;
	private String sinopsis;
	private Genero genero;
	private String pais;
	
		
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Year getAgno() {
		return agno;
	}
	public void setAgno(Year agno) {
		this.agno = agno;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Pelicula() {
		super();
	
		}
	}
