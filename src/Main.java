import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Crear un objeto de tipo Coche
        Coche c1 = new Coche("Mitsubishi", "Lancer", "Azul");

        // Mostrar información inicial del coche
        System.out.println("\n Marca: " + c1.getMarca() + "\n MOdelo: " + c1.getModelo() + "\n Color: " + c1.getColor());


        // Encender el coche
        c1.arrancar();

        // Cambiar el color del coche
        c1.setColor("Rojo");
        System.out.println("El nuevo color del coche es: "+c1.getColor());

        // Apagar el coche
        c1.apagar();
    }
}


