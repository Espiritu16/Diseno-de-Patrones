package Modelo;



import InterfacesMetodos.IngresarDatos;
import InterfacesMetodos.ResumenResiduo;
import javax.swing.JOptionPane;


public class Residuo implements ResumenResiduo,IngresarDatos {
    
    public String nombreResiduo;
    public String estado;  //Sólidos, Semisólidos, Líquidos, Gaseosos
    public String[] tiposDeResiduos = {
            "1. Residuos orgánicos",
            "2. Residuos inorgánicos reciclables",
            "3. Residuos inorgánicos no reciclables",
            "4. Residuos peligrosos",
            "5. Residuos de construcción y demolición"
        };  
    public double peso;

    public Residuo(String nombreResiduo, String estado, double peso) {
        this.nombreResiduo = nombreResiduo;
        this.estado = estado;
        this.peso = peso;
    }

    
    public Residuo(){
        
    }
    //Getter and setters
    
    public String getNombreResiduo() {
        return nombreResiduo;
    }

    public void setNombreResiduo(String nombreResiduo) {
        this.nombreResiduo = nombreResiduo;
    }
  

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
                         "Nombre de residuo: "+getNombreResiduo() + "\n" + 
                         "Peso: " + String.format("%.2f", getPeso()) + " kg\n" +
                         "Estado: " + getEstado() + "\n" +
                         "===============================";
        JOptionPane.showMessageDialog(null, mensaje1, "Información del Residuo", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void ingresarDatos() {
        try {
            setNombreResiduo(nombreResiduo);
            setPeso(peso);
            setEstado(estado);
        } catch (Exception e) {
        }
    }
    
   
   
}
