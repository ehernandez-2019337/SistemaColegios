package org.emersonhernandez.controlador;
import java.util.ArrayList;
import org.emersonhernandez.modelo.Carrera;
public class ControlDeCarrera{
	//fase de declaración de variables
	private ArrayList<Carrera> listaDeCarreras;
	private static ControlDeCarrera instancia;
	 
	//fase de declaración y definición de métodos
	public ControlDeCarrera() {//Constructor privado		
		listaDeCarreras = new ArrayList<Carrera>();
	}
	
	public int cantidadDeCarreras(){
		return listaDeCarreras.size();
	}
		
	public static ControlDeCarrera getInstancia() {
		if(instancia == null) {
			instancia = new ControlDeCarrera();
		} return instancia; 
	}//getInstancia
		
	public void agregarCarrera(Carrera carrera) {
		listaDeCarreras.add(carrera);
	}
	
	public ArrayList<Carrera> getListaDeCarreras() {
		return listaDeCarreras;
	}//ArrayList
	
	public void eliminarCarrera(Carrera carreraAEliminar){
		listaDeCarreras.remove(carreraAEliminar);
	}
	public void eliminarCarrera(int id){
		Carrera carreraAEliminar = new Carrera();
		for(Carrera carrera : listaDeCarreras){
			if(carrera.getId()== id){
				carreraAEliminar = carrera;
				listaDeCarreras.remove(carreraAEliminar);
				break;
			}
		}
	}
        //eliminar
	
	public Carrera buscarAlumno( int id ){
		Carrera carrera = new  Carrera();
		for( Carrera elemento : listaDeCarreras ){
			if( elemento.getId() == id){
				carrera = elemento;
			break;
			}//if 
		}//for 
		return carrera;   
	}//buscar
	
	public void actualizarCarrera(Carrera antiguo, Carrera actualizado){
		int indice = listaDeCarreras.indexOf(antiguo);
		if( indice >= 0 )
			listaDeCarreras.set(indice,actualizado);
	}

    
}//class ControlDeContacto