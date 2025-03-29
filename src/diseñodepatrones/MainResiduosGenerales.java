/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diseñodepatrones;

import javax.swing.JOptionPane;

/**
 *
 * @author felix
 */
public class MainResiduosGenerales {
    public static void main(String[] args) {
        //Creamos objeto
        RegistroResiduo rr1= new RegistroResiduo();
        //Rellenamos los datos
        rr1.setUsuario(JOptionPane.showInputDialog("Ingrese su usuario: "));
        rr1.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del residuo: ")));
        rr1.setEstado(JOptionPane.showInputDialog("Ingrese el estado del residuo: "));
        //Llamamos a uno de los metodos
        rr1.mostrarResiduos();
        
        System.out.println("Hola ya se hacer un commit");
        
    }
}
