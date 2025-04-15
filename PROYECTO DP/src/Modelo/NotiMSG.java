package Modelo;
import InterfacesMetodos.EnviarNotificacion;
import javax.swing.JOptionPane;
public class NotiMSG extends Notificacion implements EnviarNotificacion{

    public NotiMSG() {
    }
    
    @Override
    public String Notificador() {
        String mensaje = "Usted tiene un nuevo mensaje de parte de RECOLECCION DE RESIDUO GENERALES";
    
        // Mostrar el mensaje en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, mensaje, "Notificación", JOptionPane.INFORMATION_MESSAGE);

        return mensaje;
    }
}
