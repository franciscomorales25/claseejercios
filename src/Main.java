//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      
        // Crear un objeto de tipo Coche
        Coche coche = new Coche("Honda", "Civic", "Azul");

        // Mostrar información inicial del coche
        System.out.println("Información inicial: ");
        System.out.println("Marca " + coche.getMarca());
        System.out.println("Modelo " + coche.getModelo());
        System.out.println("Color " + coche.getColor());

        // Encender el coche
        coche.arrancar();
        // Cambiar el color del coche
        coche.setColor("Rojo");
        System.out.println("Nuevo color: " + coche.getColor());
        // Apagar el coche
        coche.apagar();
        }
}
