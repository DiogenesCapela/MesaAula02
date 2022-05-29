import java.util.Scanner;

public class MesaAula02 {
    public static void main(String [] args) {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Diigte o valor de n1: ");
        n1 = sc.nextInt();

        System.out.println("Digite o valor de n2: ");
        n2 = sc.nextInt();

        System.out.println("Digite o valor de n3: ");
        n3 = sc.nextInt();

        System.out.println("O maior dos tres valores: " + maiorDeTres(n1, n2, n3));
    }
    public static int maiorDeTres(int n1, int n2, int n3) {
        int auxiliar;
        auxiliar = Math.max(n1, n2);
        if (auxiliar < n3) {
            return n3;
        }
        return auxiliar;
    }

}
