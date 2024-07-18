package org.emersonhernandez.controlador;
import java.util.ArrayList;
import org.emersonhernandez.modelo.Alumno;
public class ControlDeAlumno{
	//fase de declaración de variables
	private ArrayList<Alumno> listaDeAlumnos;
	private static ControlDeAlumno instancia;
	 
	//fase de declaración y definición de métodos
	public ControlDeAlumno() {//Constructor privado		
		listaDeAlumnos = new ArrayList<Alumno>();
	}
	
	public int cantidadDeElementos(){
		return listaDeAlumnos.size();
	}
		
	public static ControlDeAlumno getInstancia() {
		if(instancia == null) {
			instancia = new ControlDeAlumno();
		} return instancia; 
	}//getInstancia
		
	public void agregarAlumno(Alumno alumno) {
		listaDeAlumnos.add(alumno);
	}
	
	public ArrayList<Alumno> getListaDeAlumnos() {
		return listaDeAlumnos;
	}//ArrayList
	
	public void eliminarAlumno(Alumno alumnoEliminar){
		listaDeAlumnos.remove(alumnoEliminar);
	}
	public void eliminarAlumno(int id){
		Alumno alumnoEliminar = new Alumno();
		for(Alumno alumno : listaDeAlumnos){
			if(alumno.getCarnet()== id){
				alumnoEliminar = alumno;
				listaDeAlumnos.remove(alumnoEliminar);
				break;
			}
		}
	}
        //eliminar
	
	public Alumno buscarAlumno( int id ){
		Alumno alumno = new  Alumno();
		for( Alumno elemento : listaDeAlumnos ){
			if( elemento.getCarnet() == id){
				alumno = elemento;
			break;
			}//if 
		}//for 
		return alumno;   
	}//buscar
	
	public void actualizarAlumno(Alumno antiguo, Alumno actualizado){
		int indice = listaDeAlumnos.indexOf(antiguo);
		if( indice >= 0 )
			listaDeAlumnos.set(indice,actualizado);
	}

    
}//class ControlDeContacto