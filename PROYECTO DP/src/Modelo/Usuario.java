package Modelo;
import InterfacesMetodos.IngresarDatos;
import javax.swing.JOptionPane;
import InterfacesMetodos.MostrarInformacion;
public class Usuario implements MostrarInformacion, IngresarDatos {
    //Atributos
    private int idUsuario;
    private String nombre;
    private String correo;
    private String direccion;
    
    
    //Constructor
    public Usuario(int idUsuario, String nombre, String correo, String direccion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
      
    }
    
    //Constructor vacio
    public Usuario() {
        
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
    public String mostrarDatos() {
        String mensaje = "ID Usuario: " + getIdUsuario() + "\n"
                       + "Nombre: " + getNombre() + "\n"
                       + "Correo: " + getCorreo() + "\n"
                       + "Dirección: " + getDireccion() + "\n";
                      
        return mensaje;
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


    
    
    
    
}
