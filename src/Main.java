//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      
        // Crear un objeto de tipo Coche
        Coche coche1 = new Coche("Toyota", "Hilux", "Rojo");

        // Mostrar información inicial del coche
        System.out.println(coche1);
        // Encender el coche
        coche1.arrancar();
        // Cambiar el color del coche
        coche1.setColor("Azul");
        // Apagar el coche
        coche1.apagar();

        System.out.println(coche1);
    }

}
