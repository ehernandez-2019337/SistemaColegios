package org.emersonhernandez.modelo;
public class Profesor {
	//fase de declaración de variables de instancia
	private int carnetProfesor;
	private String nombreProfesor;
	private String telefonoProfesor;
	private String carreraProfesor;
	
	//fase de declaración y definición de métodos
	public Profesor() {} //Constructor nulo, sólo crea una instancia vacía
	public Profesor(int carnetProfesor, String nombreProfesor, String telefonoProfesor, String carreraProfesor) {//Constructor
		this.carnetProfesor = carnetProfesor;
		this.nombreProfesor = nombreProfesor;
		this.telefonoProfesor = telefonoProfesor;
                this.carreraProfesor= carreraProfesor;
	}
	public int getCarnet() {
		return carnetProfesor;
	}	
	public void setCarnet(int carnet) {
		this.carnetProfesor = carnet;
	}
	
	public String getNombre() {
		return nombreProfesor;
	}
	public void setNombre(String nombre) {
		this.nombreProfesor = nombre;
	}
	
	public String getTelefono() {
		return telefonoProfesor;
	}
	public void setTelefono(String telefono) {
		this.telefonoProfesor = telefono;
	}
	
        public String getCarrera(){
		return carreraProfesor;
	}
	public void setCarrera(String carrera){
		this.carreraProfesor = carrera;
	}

}