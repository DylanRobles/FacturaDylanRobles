
package co.edu.konradlorenz.model;


public class Vehiculo {
    
        private String placa;
    private String tipoVehiculo;
    static private final byte precioMoto = 43;
    static private final byte precioBici = 13;
    static private final byte precioCarro = 71;
    
    private int duracion;
    private String fecha;
    private double valorPagar;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar, String tipoVehiculo) {
        this.valorPagar = valorPagar;
        this.tipoVehiculo = tipoVehiculo;
        
        switch(tipoVehiculo){
            case "Moto":
                valorPagar = this.duracion*this.precioMoto;
            break;
            case "Bicicleta":
                valorPagar = this.duracion*this.precioBici;
            break;
            case "Carro":
                valorPagar = this.duracion*this.precioCarro;
                break;
            default:
                
                break;
        }
        
        
    }
    
    public double calcularIVA(){
        double valorIva = (valorPagar*0.19);
        
        
        return valorIva;
    }
    
    public double calcularPrecio() {
        double total = calcularIVA()+valorPagar;
        return total;
        
    }
    public void calcularMultiplo50(){
        int residuo =(int) calcularPrecio()%50;
        int totalPagar =(int) calcularPrecio()+residuo;
        
        
    }
    
    
}
