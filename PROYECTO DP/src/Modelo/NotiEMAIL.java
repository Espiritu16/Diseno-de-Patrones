/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import InterfacesMetodos.EnviarNotificacion;
import javax.swing.JOptionPane;

/**
 *
 * @author felix
 */
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
