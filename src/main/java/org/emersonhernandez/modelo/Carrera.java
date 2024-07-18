package org.emersonhernandez.modelo;
public class Carrera {
	//fase de declaración de variables de instancia
	private int idCarrera;
	private String nombreCarrera;
	private String seccionCarrera;
	
	//fase de declaración y definición de métodos
	public Carrera() {} //Constructor nulo, sólo crea una instancia vacía
	public Carrera(int idCarrera, String nombreCarrera, String seccionCarrera) {//Constructor
		this.idCarrera = idCarrera;
		this.nombreCarrera = nombreCarrera;
                this.seccionCarrera= seccionCarrera;
	}
	public int getId() {
		return idCarrera;
	}	
	public void setCarnet(int id) {
		this.idCarrera = id;
	}
	
	public String getNombre() {
		return nombreCarrera;
	}
	public void setNombre(String nombre) {
		this.nombreCarrera = nombre;
	}
	
        public String getSeccion(){
		return seccionCarrera;
	}
	public void setSeccion(String seccion){
		this.seccionCarrera = seccion;
	}


}