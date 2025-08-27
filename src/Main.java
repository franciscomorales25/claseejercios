//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      
        // Crear un objeto de tipo Coche
        Coche ejemploCoche = new Coche("Subaru","Impreza","Negro");

        // Mostrar información inicial del coche
        System.out.println("El coche ingresado es:");
        System.out.println("Marca: " + ejemploCoche.getMarca());
        System.out.println("Modelo: " + ejemploCoche.getModelo());
        System.out.println("Color: " + ejemploCoche.getColor() + "\n");
        
        // Encender el coche
        ejemploCoche.arrancar();

                // Cambiar el color del coche
                ejemploCoche.setColor("Rojo");
                
                // Apagar el coche
                ejemploCoche.apagar();
        }
    }