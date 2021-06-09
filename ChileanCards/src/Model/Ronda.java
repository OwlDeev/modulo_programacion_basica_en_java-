package Model;

import java.util.ArrayList;

public class Ronda {

	private int id;
	private int numeroRonda;
	private ArrayList<Turno> turnos = new ArrayList<Turno>();
	
	//METODO
	
	public Ronda(int id, int numeroRonda, ArrayList<Turno> turnos) {
		super();
		this.id = id;
		this.numeroRonda = numeroRonda;
		this.turnos = turnos;
	}
	
	private void iniciarRonda() {
		
	}
	
	private void finalizarRonda() {
		
	}
	private void reasignarGambas() {
		
	}

	//GETTER AND SETTER
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumeroRonda() {
		return numeroRonda;
	}
	public void setNumeroRonda(int numeroRonda) {
		this.numeroRonda = numeroRonda;
	}
	public ArrayList<Turno> getTurnos() {
		return turnos;
	}
	public void setTurnos(ArrayList<Turno> turnos) {
		this.turnos = turnos;
	}
}
