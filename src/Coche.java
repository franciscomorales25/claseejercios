public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private boolean encendido;

    // Constructor
    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.encendido = false;
    }

    // Métodos para encender y apagar
    public void arrancar() {
        this.encendido = true;
        System.out.println("El coche arranca");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("El coche apagado");
    }

    // Getters (lectura de atributos)
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public boolean isEncendido() {
        return encendido;
    }

    // Setters (modificación de atributos)
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
