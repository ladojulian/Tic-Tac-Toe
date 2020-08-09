import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var length = scanner.nextInt();
        var max = 0;
        for (var i = 0; i < length; i++) {
            var temp = scanner.nextInt();
            max = temp > max && temp % 4 == 0 ? temp : max;
        }

        System.out.println(max);
    }
}