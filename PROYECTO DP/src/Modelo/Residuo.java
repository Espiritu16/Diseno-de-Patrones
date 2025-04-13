package Modelo;



import InterfacesMetodos.IngresarDatos;
import InterfacesMetodos.MostrarInformacion;
import javax.swing.JOptionPane;


public class Residuo implements MostrarInformacion,IngresarDatos {
    
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
    public void ingresarDatos() {
        try {
            setNombreResiduo(JOptionPane.showInputDialog("Ingrese el nombre del residuo:"));
            setPeso(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del residuo: ")));
            setEstado(JOptionPane.showInputDialog("Ingrese el estado del residuo:"));
        } catch (Exception e) {
            JOptionPane.showInputDialog(null,"Error: DEBE INGRESAR UN RESIDUO AL MENOS","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    @Override
    public void mostrarDatos() {
        String mensaje1 = "=== Información del Residuo ===\n" +
                         "Nombre de residuo: "+getNombreResiduo() + "\n" + 
                         "Peso: " + String.format("%.2f", getPeso()) + " kg\n" +
                         "Estado: " + getEstado() + "\n" +
                         "===============================";
        JOptionPane.showMessageDialog(null, mensaje1, "Información del Residuo", JOptionPane.INFORMATION_MESSAGE);
    }

    
   
   
}
