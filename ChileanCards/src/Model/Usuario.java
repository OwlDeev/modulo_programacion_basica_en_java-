package Model;

public class Usuario {
	private int Usuario;

	private String nombre;
	
	//METODOS
	
	public Usuario(int usuario, String nombre) {
		super();
		Usuario = usuario;
		this.nombre = nombre;
	}
	
	public void buscarPartida() {
		
	}
	
	
	public void salirDelJuego() {
		
	}
	
	public void elegirMazo() {
		
	}
	
	public void logearse() {
		
	}
	
	public void cerrarSesion() {
		
	}
	//GETTER AND SETTER
	public int getUsuario() {
		return Usuario;
	}

	public void setUsuario(int usuario) {
		Usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
