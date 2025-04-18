/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainProyecto;
import InterfacesMetodos.GeneradorSugerencia;
import Modelo.NotiEMAIL;
import Modelo.NotiMSG;
import Modelo.NotiWhatsAPP;
import Modelo.Notificacion;
import Modelo.Residuo;
import Modelo.Sugerencia;
import Modelo.SugerenciaBasica;
import Modelo.Usuario;

/**
 *
 * @author felix
 */
public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        //Llamamos metodos
        u1.ingresarDatos();
        u1.mostrarDatos();
        //Residuo
        Residuo r1= new Residuo();
        r1.ingresarDatos();
        r1.mostrarDatos();
        //Notificaciones
        Notificacion n1= new Notificacion();
        n1.Notificador();
        NotiEMAIL ne= new NotiEMAIL();
        ne.Notificador();
        NotiMSG nm= new NotiMSG();
        nm.Notificador();
        NotiWhatsAPP nw= new NotiWhatsAPP();
        nw.Notificador();
        
        //Sugerencias
        GeneradorSugerencia sugerenciaBasica = new SugerenciaBasica();
        Sugerencia sugerencia1 = new Sugerencia(sugerenciaBasica);
        sugerencia1.sendSugerencia("Reduce, reutiliza y recicla tus residuos según el tipo.");
        
        
        
        
    }
}
