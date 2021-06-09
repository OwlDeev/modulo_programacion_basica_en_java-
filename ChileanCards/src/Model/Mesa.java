package Model;

import java.util.ArrayList;

public class Mesa {

	private int id;
	private int limiteCartas;
	private ArrayList<Carta> posicionCartas = new ArrayList<Carta>();
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private Partida partida;
	
	
	//METODOS
	public Mesa(int id, int limiteCartas, ArrayList<Carta> posicionCartas, ArrayList<Jugador> jugadores,
			ArrayList<Usuario> usuarios, Partida partida) {
		super();
		this.id = id;
		this.limiteCartas = limiteCartas;
		this.posicionCartas = posicionCartas;
		this.jugadores = jugadores;
		this.usuarios = usuarios;
		this.partida = partida;
	}
	
	//GETTER AND SETTER
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLimiteCartas() {
		return limiteCartas;
	}
	public void setLimiteCartas(int limiteCartas) {
		this.limiteCartas = limiteCartas;
	}
	public ArrayList<Carta> getPosicionCartas() {
		return posicionCartas;
	}
	public void setPosicionCartas(ArrayList<Carta> posicionCartas) {
		this.posicionCartas = posicionCartas;
	}
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public Partida getPartida() {
		return partida;
	}
	public void setPartida(Partida partida) {
		this.partida = partida;
	}
}
