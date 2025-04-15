package Modelo;
import InterfacesMetodos.EnviarNotificacion;
import javax.swing.JOptionPane;
public class NotiEMAIL extends Notificacion implements EnviarNotificacion {
    public NotiEMAIL() {
    }
    @Override
    public String Notificador() {
        String mensaje = "Usted tiene un nuevo correo en bandeja";
    
        // Mostrar el mensaje en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, mensaje, "Notificación", JOptionPane.INFORMATION_MESSAGE);
        return mensaje;
    }
}
