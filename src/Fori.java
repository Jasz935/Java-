import java.util.Scanner;

public class Fori {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = 0; // Suma de números <= 10
        int c = 0; // Contador de números > 10
        for (int k = 1; k <= 6; k++) {
            System.out.print("Ingrese un número: ");
            int n = sc.nextInt();
            if (n > 10) {
                c = c + 1;
            } else {
                a = a + n;
            }
        }

        System.out.println("Suma de números menores o iguales a 10: " + a);

        System.out.println("Cantidad de números mayores a 10: " + c);

        sc.close();





    }
}
