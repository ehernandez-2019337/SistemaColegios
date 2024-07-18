package org.emersonhernandez.controlador;
import java.util.ArrayList;
import org.emersonhernandez.modelo.Cursos;
public class ControlDeCursos{
	//fase de declaración de variables
	private ArrayList<Cursos> listaDeCursos;
	private static ControlDeCursos instancia;
	 
	//fase de declaración y definición de métodos
	public ControlDeCursos() {//Constructor privado		
		listaDeCursos = new ArrayList<Cursos>();
	}
	
	public int cantidadDeCursos(){
		return listaDeCursos.size();
	}
		
	public static ControlDeCursos getInstancia() {
		if(instancia == null) {
			instancia = new ControlDeCursos();
		} return instancia; 
	}//getInstancia
		
	public void agregarCurso(Cursos curso) {
		listaDeCursos.add(curso);
	}
	
	public ArrayList<Cursos> getListaDeCursos() {
		return listaDeCursos;
	}//ArrayList
	
	public void eliminarCurso(Cursos cursoEliminar){
		listaDeCursos.remove(cursoEliminar);
	}
	public void eliminarCurso(int id){
		Cursos cursoEliminar = new Cursos();
		for(Cursos curso : listaDeCursos){
			if(curso.getId()== id){
				cursoEliminar = curso;
				listaDeCursos.remove(cursoEliminar);
				break;
			}
		}
	}
        //eliminar
	
	public Cursos buscarAlumno( int id ){
		Cursos curso = new  Cursos();
		for( Cursos elemento : listaDeCursos ){
			if( elemento.getId() == id){
				curso = elemento;
			break;
			}//if 
		}//for 
		return curso;   
	}//buscar
	
	public void actualizarCurso(Cursos antiguo, Cursos actualizado){
		int indice = listaDeCursos.indexOf(antiguo);
		if( indice >= 0 )
			listaDeCursos.set(indice,actualizado);
	}

   

    
}//class ControlDeContacto