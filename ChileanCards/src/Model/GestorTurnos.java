package Model;

public class GestorTurnos {

	private int id;
	private Ronda rondas;
	
	//METODOS
	public GestorTurnos(int id, Ronda rondas) {
		super();
		this.id = id;
		this.rondas = rondas;
	}
	
	private void asignarTurno() {
		
	}
	
	private void contadorTurno() {
		
	}
	
	//GETTER AND SETTER
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Ronda getRondas() {
		return rondas;
	}
	public void setRondas(Ronda rondas) {
		this.rondas = rondas;
	}
}
