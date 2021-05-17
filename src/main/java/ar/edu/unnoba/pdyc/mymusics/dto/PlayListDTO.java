package ar.edu.unnoba.pdyc.mymusics.dto;

public class PlayListDTO {
	
	    private Long id;
	    private String nombre;
	    private UserDTO propio;

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
	    

}
