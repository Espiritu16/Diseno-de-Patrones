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
public class NotiWhatsAPP extends Notificacion implements EnviarNotificacion {

    public NotiWhatsAPP() {
    }    
    
    @Override
    public String Notificador() {
        String mensaje = "Tiene un nuevo mensaje en WhatsApp.";
    
        // Mostrar el mensaje en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, mensaje, "Notificación", JOptionPane.INFORMATION_MESSAGE);

        return mensaje; 
    }
}
