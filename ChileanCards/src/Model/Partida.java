package Model;

public class Partida {

	private int id;
	private GestorTurnos gestorTurnos;
	
	//METODOS	
	
	public Partida(int id, GestorTurnos gestorTurnos) {
		super();
		this.id = id;
		this.gestorTurnos = gestorTurnos;
	}
	
	private void iniciar() {
		
	}
	
	private void finalizar() {
		
	}
	
	//GETTER AND SETTER
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public GestorTurnos getGestorTurnos() {
		return gestorTurnos;
	}
	public void setGestorTurnos(GestorTurnos gestorTurnos) {
		this.gestorTurnos = gestorTurnos;
	}
}
