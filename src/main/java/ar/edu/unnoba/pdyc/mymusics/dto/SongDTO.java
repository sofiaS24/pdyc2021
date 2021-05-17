package ar.edu.unnoba.pdyc.mymusics.dto;

import ar.edu.unnoba.pdyc.mymusics.model.Genre;

public class SongDTO {
	
	 private Long id;
	    private String nombre;
	    private String autor;
	    private Genre genre;

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	   
	    public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public Genre getGenre() {
	        return genre;
	    }

	    public void setGenre(Genre genre) {
	        this.genre = genre;
	    }

}
