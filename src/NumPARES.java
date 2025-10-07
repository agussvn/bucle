import java.util.Scanner;
public class NumPARES {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = new Scanner(System.in).nextInt();

        System.out.println("Números pares hasta " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);


}
}
    }
}