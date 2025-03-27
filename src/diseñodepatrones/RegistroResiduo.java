package diseñodepatrones;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class RegistroResiduo implements AccionesGenerales {
    Scanner sc=new Scanner(System.in);
    public String usuario;
    public String ubicacion;
    public String estado;
    public String metodoRecomendado;
    public String tipo;
    public double peso;

    public RegistroResiduo(String usuario, String ubicacion, String estado, String metodoRecomendado, String tipo, double peso) {
        this.usuario = usuario;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.metodoRecomendado = metodoRecomendado;
        this.tipo = tipo;
        this.peso = peso;
    }
    public RegistroResiduo(){
        
    }
    
    @Override
    public void mostrarResiduos(){
        System.out.println("el usuario: "+usuario+" registro un residuo con peso de: "+peso);
    }
    
    @Override
    public void ingresarDatos(){
        usuario=JOptionPane.showInputDialog("Ingrese su usuario");
        tipo=JOptionPane.showInputDialog("Ingrese el tipo de residuo");
        peso=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de su residuo"));
    }

    @Override
    public void mostrarSugerencia() {
        
    }

    @Override
    public void mostrarInformacion() {
       
    }

    @Override
    public void mostrarEstadisticas() {

    }
    
    
   
}
