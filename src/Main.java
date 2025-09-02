//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear un objeto de tipo Coche
        Coche miCoche = new Coche("Toyota", "Corolla", "Rojo");

        // Mostrar información inicial del coche
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Modelo: " + miCoche.getModelo());
        System.out.println("Color: " + miCoche.getColor());
        System.out.println("¿Está encendido el coche? " + miCoche.isEncendido());

        // Encender el coche
        miCoche.arrancar();
        System.out.println("¿Está encendido? " + miCoche.isEncendido());

        // Cambiar el color del coche
        System.out.print("Ingrese el nuevo color del coche porfi: ");
        String nuevoColor = sc.nextLine();
        miCoche.setColor(nuevoColor);
        System.out.println("El nuevo color es : " + miCoche.getColor());

        // Apagar el coche
        miCoche.apagar();
        System.out.println("¿Está encendido el coche? " + miCoche.isEncendido());

        sc.close();
    }
}
