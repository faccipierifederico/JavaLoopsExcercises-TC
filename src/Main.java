import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // EXC 1: Realizar un programa que dado por teclado un límite numérico muestre por pantalla todos los números hasta dicho límite

/*        System.out.println("Choose a number to apply a limit for the aplication: ");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int count = 1;

        while (count <= limit) {
            System.out.println("The count is: " + count);
            count = count + 1;
        }*/

        // EXC 2: Realizar un programa que muestre en pantalla palbras que sean ingresadas por teclado hasta que se ingrese la palabra "salir".

/*        System.out.println("Type a word to introduce it in the application");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        while (!word.equalsIgnoreCase("salir")) {
            System.out.println("The word you write is: " + word);
            System.out.println("Type another word to introduce it in the application");
            word = scanner.nextLine();
        }*/

        // Dada una maratón, realizar un programa que el fin sea informarle a los posibles participantes a qué categoría pertenecen. Para ello,
        // pedir los siguientes datos: dni, nombre y edad; de acuerdo a ello, mostrar por pantalla la categoría correspondiente.
        // Las categorías son: Menores A (de 6 a 10); Menores B (de 11 a 17); Juveniles (de 18 a 30); Adultos (31 a 50); Adultos mayores (mayores de 50).
        // Para finalizar el programa ingresar un valor de DNI 0 y nombre con la palabra "fin".

        System.out.println("Hi! Write your DNI: ");
        Scanner scannerDni = new Scanner(System.in);
        String dni = scannerDni.nextLine();
        System.out.println("Now write your first name:");
        Scanner scannerName = new Scanner(System.in);
        String name = scannerName.nextLine();
        System.out.println("Write your last name:");
        Scanner scannerLastName = new Scanner(System.in);
        String lastName = scannerLastName.nextLine();
        System.out.println("And finally, tell me your age:");
        Scanner scannerAge = new Scanner(System.in);
        int age = scannerAge.nextInt();

        while (!dni.equals("0") && (!name.equalsIgnoreCase("fin"))) {
            if (age < 6) {
                System.out.println("I'm sorry. You are too little to join the tournament.");
            } else if (age >= 6 && age <= 10) {
                System.out.println("You have to subscribe por this category: 'Menores A'");
            } else if (age >= 11 && age <= 17) {
                System.out.println("You have to subscribe por this category: 'Menores B'");
            } else if (age >= 18 && age <= 30) {
                System.out.println("You have to subscribe por this category: 'Juveniles'");
            } else if (age >= 31 && age <= 50) {
                System.out.println("You have to subscribe por this category: 'Adultos'");
            } else if (age > 50 && age < 120) {
                System.out.println("You have more than 50 years. Subscribe to: 'Adultos mayores'");
            } else {
                System.out.println("You write a wrong age. Please, do it again.");
            }

            System.out.println("Hi! Write your DNI: ");
            dni = scannerDni.nextLine();
            System.out.println("Now write your first name:");
            name = scannerName.nextLine();
            System.out.println("Write your last name:");
            lastName = scannerLastName.nextLine();
            System.out.println("And finally, tell me your age:");
            age = scannerAge.nextInt();
        }

        System.out.println("You finished the application. Good bye!");
    }
}