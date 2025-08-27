//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static void main(String[] args) {

        Coche coche1 = new Coche("Kia", "Soul", "Negro");
        System.out.println("Información\n" + "Marca: " + coche1.getMarca() + "\n" + "Modelo: " + coche1.getModelo() + "\n" + "Color: " + coche1.getColor());
        System.out.println("---------------------------------");

        coche1.arrancar();
        coche1.setColor("Azul");
        System.out.println("---------------------------------");
        System.out.println("Información\n" + "Marca: " + coche1.getMarca() + "\n" + "Modelo: " + coche1.getModelo() + "\n" + "Color: " + coche1.getColor());
        System.out.println("---------------------------------");
        coche1.apagar();
    }
}
