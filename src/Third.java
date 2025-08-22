import java.util.Scanner;

public class Third {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa cuantas horas entrenaste");
        Float hr = scan.nextFloat();
        if(hr>=2 && hr<=3){
            System.out.println("Tuviste un buen entreno!");
        } else if(hr>3){
            System.out.println("Mucho cuidado con el sobre entrenamiento, revisa tus ejercicios y volumen de entrenamiento");
        } else {
            System.out.println("Pudiste haber entrenado un poco más!");
        }


    }
}
