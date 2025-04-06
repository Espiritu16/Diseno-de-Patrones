package Modelo;

import InterfacesMetodos.MostrarInformacion;

public class Sugerencia implements MostrarInformacion{
    private static int contadorID=1;
    private int idSugerencia;
    private String titulo;
    private String descripcion;
    
    
    //Constructor
    public Sugerencia() {
        this.idSugerencia = contadorID++;
        this.titulo = "Sugerencia";
        this.descripcion = "Descripcion de la clase sugerencia";
    }


    @Override
    public String mostrarDatos() {
       String mensaje = "Título: " + titulo + "\n"
                   + "Descripción: " + descripcion + "\n";
    
    return mensaje;
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //getter y setters
    public int getIdSugerencia() {
        return idSugerencia;
    }

    public void setIdSugerencia(int idSugerencia) {
        this.idSugerencia = idSugerencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
       
    
    
    
    
    
}
