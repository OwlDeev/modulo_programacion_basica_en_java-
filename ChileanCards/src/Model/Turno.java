package Model;

import java.util.ArrayList;

public class Turno {

	private int id;

	private int numeroTurno;
	private ArrayList<Integer> Turnos = new ArrayList<Integer>();
	
	//METODOS
	
	public Turno(int id, int numeroTurno, ArrayList<Integer> turnos) {
		super();
		this.id = id;
		this.numeroTurno = numeroTurno;
		Turnos = turnos;
	}
	
	public void finalizarTurno() {
		
	}
	
	public void iniciarTurno() {
		
	}
	
	//GETTER AND SETTER
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumeroTurno() {
		return numeroTurno;
	}
	public void setNumeroTurno(int numeroTurno) {
		this.numeroTurno = numeroTurno;
	}
	public ArrayList<Integer> getTurnos() {
		return Turnos;
	}
	public void setTurnos(ArrayList<Integer> turnos) {
		Turnos = turnos;
	}
}
