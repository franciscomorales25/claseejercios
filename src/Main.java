public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", "Rojo");
        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModelo());
        System.out.println("Color: " + coche1.getColor());
        coche1.arrancar();
        System.out.println("Encendido: " + coche1.isEncendido());
        coche1.apagar();
        System.out.println("Encendido: " + coche1.isEncendido());
    }
}