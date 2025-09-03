//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Crear un objeto de tipo Coche

        Coche coche1 = new Coche("Toyota", "Corolla", "Rojo");

        // Mostrar información inicial del coche
        System.out.println("Coche 1 -> Marca: " + coche1.getMarca() +
                ", Modelo: " + coche1.getModelo() +
                ", Color: " + coche1.getColor() +
                ", Encendido: " + coche1.isEncendido());
        // Encender el coche
        coche1.arrancar();
        // Cambiar el color del coche
        coche1.setColor("Azul");
        System.out.println("Nuevo color del coche 1: " + coche1.getColor());
        // Apagar el coche
        coche1.apagar();
        System.out.println("\n============================\n");

        System.out.println("Este en un comentario");
        System.out.println("Este es un segundo comentario ");
        System.out.println("gg22088@ues.edu.sv");

    }
}

