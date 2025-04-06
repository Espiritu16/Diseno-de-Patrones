package Modelo;
import javax.swing.JOptionPane;
import InterfacesMetodos.EnviarNotificacion;
import java.time.LocalDateTime;

//CLASE PADRE DE NOTIFIACIONES
public class Notificacion {
    private static int contadorID=1;
    private int idNotificacion;
    private LocalDateTime fechaEnvio;
    private Usuario usuario;
    

    public Notificacion(Usuario usuario) {
        this.idNotificacion = contadorID++;
        this.fechaEnvio = LocalDateTime.now();
        this.usuario = usuario;
    }

    public Notificacion() {
    }
    public String avisoGeneral(){
        String mensaje = "\"¡Recordatorio! Mañana es el día de recolección de tus residuos.\"";
    
        // Mostrar el mensaje en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, mensaje, "Notificación", JOptionPane.INFORMATION_MESSAGE);

        return mensaje; 
    }
    
}
