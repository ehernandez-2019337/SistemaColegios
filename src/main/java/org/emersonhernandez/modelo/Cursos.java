package org.emersonhernandez.modelo;
public class Cursos {
	//fase de declaración de variables de instancia
	private int idACurso;
	private String nombreCurso;
	private String profesorCurso;
	private String carreraCurso;
	
	//fase de declaración y definición de métodos
	public Cursos() {} //Constructor nulo, sólo crea una instancia vacía
	public Cursos(int idACurso, String nombreCurso, String profesorCurso, String carreraCurso) {//Constructor
		this.idACurso = idACurso;
		this.nombreCurso = nombreCurso;
		this.profesorCurso = profesorCurso;
                this.carreraCurso= carreraCurso;
	}
	public int getId() {
		return idACurso;
	}	
	public void setId(int id) {
		this.idACurso = id;
	}
	
	public String getNombre() {
		return nombreCurso;
	}
	public void setNombre(String nombre) {
		this.nombreCurso = nombre;
	}
	
	public String getProfesor() {
		return profesorCurso;
	}
	public void setProfesor(String telefono) {
		this.profesorCurso = telefono;
	}
	
        public String getCarrera(){
		return carreraCurso;
	}
	public void setCarrera(String carrera){
		this.carreraCurso = carrera;
	}

}