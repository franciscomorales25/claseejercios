//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
      
        // Crear un objeto de tipo Coche
        Coche primerCoche = new Coche("Nissan", "Sentra", "Azul");


        // Mostrar información inicial del coche
        System.out.println("Marca: " + primerCoche.getMarca());
        System.out.println("Modelo: " + primerCoche.getModelo());
        System.out.println("Color: " + primerCoche.getColor());

        // Encender el coche
        primerCoche.arrancar();

        // Cambiar el color del coche
        primerCoche.setColor("Negro");

        // Apagar el coche
        primerCoche.apagar();
        }
    }
