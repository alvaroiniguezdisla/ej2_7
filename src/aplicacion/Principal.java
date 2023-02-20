package aplicacion;
import java.util.Scanner;
import dominio.ej2_7;


public class Principal {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero ");
        int n=sc.nextInt();
        System.out.println("La suma de los números pares hasta "+n+" es igual a "+ej2_7.sumapares(n));

    }

}
