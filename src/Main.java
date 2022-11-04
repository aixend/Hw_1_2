import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(condition(20,30));
        System.out.println(condition(-15,45));
        System.out.println(condition(10,10));
        System.out.println(condition(45,65));
        System.out.println(condition(29,25));
        System.out.println(condition(20,generateRandomAge()));
    }

    public static String condition(int temperature, int age) {

        if (temperature < 30 && temperature > -20 && age < 45 && age > 20) {
            return "Можно идти гулять!";

        } else if (temperature < 28 && temperature > 0 && age < 20) {
            return "Можно идти гулять";

        } else if (age > 45 && temperature < 25 && temperature > -10) {
            return "Можно идти гулять";

        }

        else{
            return "Оставайтесь дома!";
        }
    }

    //дз на сообразительность
    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(20);
    }
}
