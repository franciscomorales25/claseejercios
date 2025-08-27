//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      
        // Crear un objeto de tipo Coche

coche cocheali = new Coche ("Toyota", "Supra", "Amarillo");
         // Mostrar información inicial del coche
    System.out.println("Marca: " + cocheali.getMarca());
    System.out.println("Modelo: " + cocheali.getModelo());
    System.out.println("Color: " + cocheali.getColor());
    System.out.println("¿Está encendido? " + cocheali.isEncendido());
        // Encender el coche
    cocheali.arrancar();
                // Cambiar el color del coche
        cocheali.setColor("Azul");
        System.out.println("Nuevo color del coche: " + cocheali.getColor());
        
                // Apagar el coche
     cocheali.apagar();
        }
    }
}
