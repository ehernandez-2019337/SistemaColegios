package org.emersonhernandez.modelo;
public class Alumno {
	//fase de declaración de variables de instancia
	private int carnetAlumno;
	private String nombreAlumno;
	private String telefonoAlumno;
	private String carreraAlumno;
	
	//fase de declaración y definición de métodos
	public Alumno() {} //Constructor nulo, sólo crea una instancia vacía
	public Alumno(int carnetAlumno, String nombreAlumno, String telefonoAlumno, String carreraAlumno) {//Constructor
		this.carnetAlumno = carnetAlumno;
		this.nombreAlumno = nombreAlumno;
		this.telefonoAlumno = telefonoAlumno;
                this.carreraAlumno= carreraAlumno;
	}
	public int getCarnet() {
		return carnetAlumno;
	}	
	public void setCarnet(int carnet) {
		this.carnetAlumno = carnet;
	}
	
	public String getNombre() {
		return nombreAlumno;
	}
	public void setNombre(String nombre) {
		this.nombreAlumno = nombre;
	}
	
	public String getTelefono() {
		return telefonoAlumno;
	}
	public void setTelefono(String telefono) {
		this.telefonoAlumno = telefono;
	}
	
        public String getCarrera(){
		return carreraAlumno;
	}
	public void setCarrera(String carrera){
		this.carreraAlumno = carrera;
	}

}