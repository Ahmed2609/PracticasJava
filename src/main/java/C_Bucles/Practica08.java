    /*  Practica 08:
        Pedir un número N, y mostrar todos los números del 1 a N
    */
    package C_Bucles;

    import java.util.Scanner;

    /**
     * @author Ahmed Darhbane
     */
    public class Practica08 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num;

            System.out.print("Digite un numero: ");
            num = sc.nextInt();

            for (int i=1; i<=num; i++) {
                if (i == num) {
                    System.out.print(i+"\n");
                }else{
                    System.out.print(i+" - ");
                }
            }
        }
    }
