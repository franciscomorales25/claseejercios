//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      
        // Crear un objeto de tipo Coche

        Coche miCoche = new Coche("Toyota", "Rojo");
         // Mostrar información inicial del coche
        miCoche.mostrarInfo();

        // Encender el coche
        miCoche.encender();

                // Cambiar el color del coche
                miCoche.cambiarColor("Negro");
                miCoche.mostrarInfo();

                // Apagar el coche
                miCoche.apagar();
     
        }
    }
}
