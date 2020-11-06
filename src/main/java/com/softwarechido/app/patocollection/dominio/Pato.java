package com.softwarechido.app.patocollection.dominio;

public class Pato implements Comparable<Pato>{
	
	String nombre;
	float peso;
	Color color;
	
	public Pato( String nombre, float peso, Color color) {		
		this.nombre = nombre;
		this.peso = peso;
		this.color = color;		
	}
	
	public String toString() {
		return nombre+","+peso+","+color;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}

	public int compareTo(Pato in) {		
		return (int)(this.peso-in.peso);
	}
	
}
