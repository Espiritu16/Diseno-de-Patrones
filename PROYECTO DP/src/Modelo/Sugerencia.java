package Modelo;

import InterfacesMetodos.MostrarInformacion;
import InterfacesMetodos.GeneradorSugerencia;
import javax.swing.JOptionPane;

public class Sugerencia implements MostrarInformacion{
    
    
    private static int contadorID=1;
    private int idSugerencia;
    private String titulo;
    private String descripcion;
    private GeneradorSugerencia generador;  // <<<<< DEPENDENCIA INVERTIDA
    
    //Constructor
    
    public Sugerencia(GeneradorSugerencia generador){
        this.idSugerencia = idSugerencia;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.generador = generador;
    }

    public Sugerencia() {
    }

    public void sendSugerencia(String sugerencia) {
        JOptionPane.showMessageDialog(null, sugerencia, "Sugerencia", JOptionPane.INFORMATION_MESSAGE);
        generador.generar(sugerencia);
    }

    @Override
    public void mostrarDatos() {
       String mensaje = "Título: " + titulo + "\n"
                   + "Descripción: " + descripcion + "\n";
    
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
