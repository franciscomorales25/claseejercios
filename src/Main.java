//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      
        // Crear un objeto de tipo Coche
        Coche coche1 = new Coche("Toyota", "Yaris", "Gris");

         // Mostrar información inicial del coche
public void describir() { 
    String estado = this.encendido ? "encendido" : 
"apagado"; 
    System.out.println("Este es un " + this.marca + " " + 
    this.modelo + " de color " + this.color + " y está " + estado 
    + "."); 
    } 
    }

    coche1.describir();

        // Encender el coche
    coche1.arrancar();
    

                // Cambiar el color del coche
    coche1.pintarCoche("coche1");

                // Apagar el coche
    coche1.apagar();
     
        }
    }
}
