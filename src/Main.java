//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Crear un objeto de tipo Coche
        Coche coche = New Coche("Toyota", "123", "Rojo");

         // Mostrar información inicial del coche
        coche.getMarca(); coche.getModelo(); coche.getColor();

        // Encender el coche
        coche.arrancar();

                // Cambiar el color del coche
                coche.setColor("Azul");

                // Apagar el coche
                coche.apagar();
     
        }
    }
}
