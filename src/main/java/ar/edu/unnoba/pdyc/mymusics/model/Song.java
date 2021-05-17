package ar.edu.unnoba.pdyc.mymusics.model;



import javax.persistence.Entity;
import javax.persistence.Table;

import org.dom4j.tree.AbstractEntity;

@Entity
@Table(name="songs")
public class Song extends AbstractEntity {

	private String nombre;
	private String autorr;
	private Genre genre;
	
	
	
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutorr() {
		return autorr;
	}
	public void setAutorr(String autorr) {
		this.autorr = autorr;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
}
