import java.util.Scanner;

public class BMExercio07{
    public static void main(String[] args){
        Scanner valor = new Scanner(System.in);

        System.out.print("Insira um valor: ");
        int x = valor.nextInt();

        while(x > 1){
            if(x % 2 == 0){
                int y = x/2;
                x = y;
                System.out.printf("Valor y: %d\n", y);
            } else{
                int y = (3 * x) + 1;
                x = y;
                System.out.printf("Valor y: %d\n", y);
            }
        }
    }
}