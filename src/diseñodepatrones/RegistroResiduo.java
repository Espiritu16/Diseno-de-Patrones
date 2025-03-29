package diseñodepatrones;
import javax.swing.JOptionPane;


public class RegistroResiduo implements ResumenResiduo {
    
    public String nombreResiduo;
    public String usuario;
    public String ubicacion;
    public String estado;
    public String metodoRecomendado;
    public String tipo;
    public double peso;

    public RegistroResiduo(String nombreResiduo, String usuario, String ubicacion, String estado, String metodoRecomendado, String tipo, double peso) {
        this.nombreResiduo= nombreResiduo;
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
    
    public String getNombreResiduo() {
        return nombreResiduo;
    }

    public void setNombreResiduo(String nombreResiduo) {
        this.nombreResiduo = nombreResiduo;
    }
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
    public void CrearResultados() {
        String mensaje1 = "=== Información del Residuo ===\n" +
                         "Usuario: " + getUsuario() + "\n" +
                         "Nombre de residuo: "+getNombreResiduo() + "\n" + 
                         "Peso: " + String.format("%.2f", getPeso()) + " kg\n" +
                         "Estado: " + getEstado() + "\n" +
                         "Tipo: " + getTipo() + "\n" +
                         "===============================";
        JOptionPane.showMessageDialog(null, mensaje1, "Información del Residuo", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    
    

    
   
}
