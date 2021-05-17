package ar.edu.unnoba.pdyc.mymusics.dto;

import java.util.List;

public class AgregarCancionesLista {
	
	
	private Long id;
    private String nombre;
    private UserDTO propio;
    private List<SongDTO> songs;

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

	public UserDTO getPropio() {
		return propio;
	}

	public void setPropio(UserDTO propio) {
		this.propio = propio;
	}

	public List<SongDTO> getSongs() {
        return songs;
    }

    public void setSongs(List<SongDTO> songs) {
        this.songs = songs;
    }

}
