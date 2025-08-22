import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class First {
    public static void main(String[] args) {

        Scanner sam = new Scanner(System.in);

        System.out.println("Cual es tu nombre?");
        String nomb = sam.nextLine();
        System.out.println("Cual es tu estatura en cm?");
        Float height = sam.nextFloat();
        System.out.println("Cual es tu edad "+ nomb);
        int age = sam.nextInt();
        System.out.println("Hola! Tu nombre es "+ nomb + " tu edad es " + age + " y mides "+ height + " Centimentros");
        System.out.println("Ingrese su salario mensual en pesos");
        Float wage = sam.nextFloat();
        System.out.println(nomb+ " tu salario mensual es de $" + wage);

        System.out.println("Ingresa la altura de un réctangulo");
        Float h = sam.nextFloat();
        System.out.println("Ingresa la base del rectángulo");
        Float b = sam.nextFloat();
        Float p = (2*h) + (2*b);
        Float ar = h * b ;
        System.out.println("El perímetro del rectángulo es= "+ p);
        System.out.println("Y su área es= "+ ar);


    }
}