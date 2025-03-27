package diseñodepatrones;
import javax.swing.JOptionPane;


public class RegistroResiduo implements AccionesGenerales {
    
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
    //Getter and setters

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMetodoRecomendado() {
        return metodoRecomendado;
    }

    public void setMetodoRecomendado(String metodoRecomendado) {
        this.metodoRecomendado = metodoRecomendado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public void mostrarResiduos(){
        System.out.println("=== Información del Residuo ===");
        System.out.println("Usuario: " + usuario);
        System.out.println("Peso: " + String.format("%.2f", peso) + " kg");
        System.out.println("Estado: " + estado);
        System.out.println("===============================");
    }
    
    /*@Override
    public void ingresarDatos(){
        usuario=JOptionPane.showInputDialog("Ingrese su usuario");
        tipo=JOptionPane.showInputDialog("Ingrese el tipo de residuo");
        peso=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de su residuo"));
    } */

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
