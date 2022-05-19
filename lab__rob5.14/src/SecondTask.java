import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        String a, b, c, d, e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше слово: ");
        a = sc.nextLine();
        System.out.println("Введіть друге слово: ");
        b = sc.nextLine();
        System.out.println("Введіть третє слово: ");
        c = sc.nextLine();
        System.out.println("Введіть четверте слово: ");
        d = sc.nextLine();
        System.out.println("Введіть п'яте слово: ");
        e = sc.nextLine();
        System.out.println(a.substring(0,1));
        System.out.println(b.substring(0,1));
        System.out.println(c.substring(0,1));
        System.out.println(d.substring(0,1));
        System.out.println(e.substring(0,1));

    }
}
