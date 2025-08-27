
public class Main {
    public static void main(String[] args) {
        //Creacion de objetos de tipo coche
        Coche coche1 = new Coche("Lamborghini " , "Urus" , "Naranja");
        Coche coche2 = new Coche("Ferrari " , "250 GTO" , "Amarillo");
        Coche coche3 = new Coche("Ford " , "Mustang" , "Rojo");

        // Mensaje inicial del estado
        System.out.println("-".repeat(40));
        System.out.println("📊 ESTADO INICIAL DE LOS COCHES");
        System.out.println("-".repeat(40));
        coche1.describir();
        coche2.describir();
        coche3.describir();
        
        System.out.println("-".repeat(40));
        System.out.println("🚦 PINTANDO LOS COCHES");
        System.out.println("-".repeat(40));
        coche1.pintar("Rojo");
        coche2.pintar("Morado");
        coche3.pintar("Verde");

        System.out.println("-".repeat(40));
        System.out.println("📊 ESTADO TRAS PINTAR");
        System.out.println("-".repeat(40));
        coche1.describir();
        coche2.describir();
        coche3.describir();

        System.out.println("-".repeat(40));
        System.out.println("🔥 ARRANCANDO LOS COCHES");
        System.out.println("-".repeat(40));
        coche1.arrancar();
        coche2.arrancar();
        coche3.arrancar();

        // Sección: Estado tras arrancar
        System.out.println("-".repeat(40));
        System.out.println("📊 ESTADO TRAS ARRANCAR");
        System.out.println("-".repeat(40));
        coche1.describir();
        coche2.describir();
        coche3.describir();

        // Sección: Apagar coches
        System.out.println("-".repeat(40));
        System.out.println("🏁 APAGANDO LOS COCHES");
        System.out.println("-".repeat(40));
        coche1.apagar();
        coche2.apagar();
        coche3.apagar();

        // Mensaje final
        System.out.println("=".repeat(60));
        System.out.println("✅ Simulación finalizada. ¡Hasta la próxima!");
        System.out.println("=".repeat(60));



    }
}