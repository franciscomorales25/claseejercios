public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private boolean encendido;

    // constructor
    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.encendido = false;


    }

    //metodos
    public void arrancar() {
        this.encendido = true;
        System.out.println("✅ El coche " + this.marca + " ha arrancado ");
        System.out.println();
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("🛑 El coche " + this.marca + " se ha apagado ");
        System.out.println();
    }

    public void describir() {
        String estado = this.encendido ? "encendido" : "apagado";
        System.out.println("🚗 Este es un coche " + getMarca() + " de color " + getColor() + " y se encuentra " + estado);
        System.out.println();
    }

    //getter lectura de atributos
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

    public void pintar(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("🎨 Coche " + this.marca + " ha sido pintado de color " + this.color);
        System.out.println();
    }
}






