//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      
        // Crear un objeto de tipo Coche
        Coche miCoche = new Coche("Toyota", "Corolla", "Rojo");


        // Mostrar información inicial del coche
        System.out.println("Información del coche:");
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Modelo: " + miCoche.getModelo());
        System.out.println("Color: " + miCoche.getColor());
        System.out.println("¿Encendido?: " + miCoche.isEncendido());
        System.out.println("--------------------");

        // Encender el coche
        miCoche.arrancar();
        System.out.println("Estado actual: ¿Encendido?: " + miCoche.isEncendido());
        System.out.println("--------------------");

        // Cambiar el color del coche
        miCoche.setColor("Azul");
        System.out.println("Nuevo color: " + miCoche.getColor());
        System.out.println("--------------------");
                
        // Apagar el coche
        miCoche.apagar();
        System.out.println("Estado actual: ¿Encendido?: " + miCoche.isEncendido());
    }   
}
