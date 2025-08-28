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
    //getter lectura de atributos
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }public String getColor() {

        return color;

    }public boolean isEncendido() {

        return encendido;
    }
    //setter (modificacion de atributos
    public void setColor(String color) {
        this.color=color;

    }    
}
