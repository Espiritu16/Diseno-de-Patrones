/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import InterfacesMetodos.IngresarDatos;
import InterfacesMetodos.ResumenUsuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author felix
 */
public class Usuario implements ResumenUsuario, IngresarDatos {
    //Atributos
    private int idUsuario;
    private String nombre;
    private String correo;
    private String direccion;
    // private List<Residuo> residuosGenerados;
    

    public Usuario(int idUsuario, String nombre, String correo, String direccion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
       // this.residuosGenerados = new ArrayList<>();
    }

    public Usuario() {
        
    }


    //Getter and setter

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //METODOS
    @Override
    public void ingresarDatos() {
        try {
            setIdUsuario(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del usuario:")));
            setNombre(JOptionPane.showInputDialog("Ingrese el nombre:"));
            setCorreo(JOptionPane.showInputDialog("Ingrese el correo:"));
            setDireccion(JOptionPane.showInputDialog("Ingrese la dirección:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido para el ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    @Override
    public String mostrarDatosUsuario() {
        String mensaje = "ID Usuario: " + getIdUsuario() + "\n"
                       + "Nombre: " + getNombre() + "\n"
                       + "Correo: " + getCorreo() + "\n"
                       + "Dirección: " + getDireccion() + "\n";
                      // + "Cantidad de Residuos: " + getResiduosGenerados().size();
        return mensaje;
        // JOptionPane.showMessageDialog(null, mensaje, "Información del Usuario", JOptionPane.INFORMATION_MESSAGE);
    }

    
    

    
    
    
    
}
