package org.emersonhernandez.controlador;
import java.util.ArrayList;
import org.emersonhernandez.modelo.Profesor;
public class ControlDeProfesor{
	//fase de declaración de variables
	private ArrayList<Profesor> listaDeProfesores;
	private static ControlDeProfesor instancia;
	 
	//fase de declaración y definición de métodos
	public ControlDeProfesor() {//Constructor privado		
		listaDeProfesores = new ArrayList<Profesor>();
	}
	
	public int cantidadDeProfesores(){
		return listaDeProfesores.size();
	}
		
	public static ControlDeProfesor getInstancia() {
		if(instancia == null) {
			instancia = new ControlDeProfesor();
		} return instancia; 
	}//getInstancia
		
	public void agregarProfesor(Profesor profesor) {
		listaDeProfesores.add(profesor);
	}
	
	public ArrayList<Profesor> getListaDeProfesores() {
		return listaDeProfesores;
	}//ArrayList
	
	public void eliminarProfesor(Profesor alumnoEliminar){
		listaDeProfesores.remove(alumnoEliminar);
	}
	public void eliminarProfesor(int id){
		Profesor alumnoEliminar = new Profesor();
		for(Profesor profesor : listaDeProfesores){
			if(profesor.getCarnet()== id){
				alumnoEliminar = profesor;
				listaDeProfesores.remove(alumnoEliminar);
				break;
			}
		}
	}
        //eliminar
	
	public Profesor buscarAlumno( int id ){
		Profesor profesor = new  Profesor();
		for( Profesor elemento : listaDeProfesores ){
			if( elemento.getCarnet() == id){
				profesor = elemento;
			break;
			}//if 
		}//for 
		return profesor;   
	}//buscar
	
	public void actualizarProfesor(Profesor antiguo, Profesor actualizado){
		int indice = listaDeProfesores.indexOf(antiguo);
		if( indice >= 0 )
			listaDeProfesores.set(indice,actualizado);
	}

    
}//class ControlDeContacto