import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cân nặng của bạn: ");
        Double weight = scanner.nextDouble();
        System.out.println("nhập số chiều cao của bạn: ");
        Double height = scanner.nextDouble();
        Double BMI = weight / (height * height);
        if (BMI < 18.5) {
            System.out.println("mày quá gày ");
        } else {
            if (BMI < 25) {
                System.out.println("mày chuẩn đấy ");
            } else if (BMI < 30) {
                System.out.println("mày hơi thừa cân");
            } else {
                System.out.println("mày béo phì rồi");
            }
        }
    }
}