import java.util.Scanner;

class firstclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lo world");
        System.out.println("pattern");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        int a = sc.nextInt();
        System.out.println(a);
    }
}
