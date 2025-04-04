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
        RegistroResiduo rr1= new RegistroResiduo();
        rr1.setUsuario(JOptionPane.showInputDialog("Ingrese su usuario: "));
        rr1.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del residuo: ")));
        rr1.setEstado(JOptionPane.showInputDialog("Ingrese el estado del residuo: "));
        rr1.setNombreResiduo(JOptionPane.showInputDialog("Ingrese el nombre del residuo"));
        rr1.setTipo(JOptionPane.showInputDialog("Ingrese el tipo del residuo"));
        //Llamamos a los metodos
        rr1.CrearResultados();

        System.out.println("Hola KEVIN");
        
        
        
    }
}
