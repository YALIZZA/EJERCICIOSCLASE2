import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        
        var entrada = new Scanner(System.in);
        
         System.out.println("Introduzca sus nombres: ");
         var nombres = entrada.nextLine();
         System.out.println("Introduzca sus apellidos: ");
         var apellidos = entrada.nextLine();
         System.out.println("Introduzca su edad: ");
         var edad = entrada.nextInt();
         entrada.close();


    }
}
