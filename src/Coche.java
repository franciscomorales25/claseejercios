public class Coche {

    private String marca;
    private String modelo;
    private String color;
    private boolean encendido  ;

// constructor
    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.encendido = false;


    }
    //metodos
    public void arrancar(){
        this.encendido = true;
        System.out.println("El coche arranca ");
    }
    public void apagar(){
        this.encendido = false;
        System.out.println("El coche apagado ");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", encendido=" + encendido +
                '}';
    }
}
