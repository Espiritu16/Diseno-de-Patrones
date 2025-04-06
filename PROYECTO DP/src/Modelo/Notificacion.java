package Modelo;
import javax.swing.JOptionPane;
import InterfacesMetodos.EnviarNotificacion;
import java.time.LocalDateTime;

public class Notificacion implements EnviarNotificacion {
    private static int contadorID=1;
    private int idNotificacion;
    private String mensaje;
    private LocalDateTime fechaEnvio;
    private Usuario usuario;
    //private TipoNotificacion tipo;
    //private boolean leido;

    public Notificacion(Usuario usuario) {
        this.idNotificacion = contadorID++;
        this.mensaje=JOptionPane.showInputDialog(null,"¡Recordatorio! Mañana es el día de recolección de tus residuos.");
        this.fechaEnvio = LocalDateTime.now();
        this.usuario = usuario;
        //this.tipo = tipo;
       // this.leido = leido;
    }

    public Notificacion() {
    }

    //Enviar notificacion por SMS
    @Override
    public String notificacionSMS() {
        return mensaje;
    }
    
    //Enviar notificacion por Whastapp
    @Override
    public String notificacionWhatsAPP() {
        return mensaje;
    }
    
    //Enviar notificacion por Correo
    @Override
    public String notificacionCorreo() {
        return mensaje;
    }
    
    
    
    
}
