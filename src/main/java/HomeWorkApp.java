public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    static void printThreeWords() {
        System.out.println("Orange \nBanana \nApple");
    }

    static void checkSumSign() {
        int a, b, c;
        a = 10;
        b = 100;
        c = a + b;


        if (c >= 0) {
            System.out.println("Больше нуля");
        } else if (c < 0) {
            System.out.println("Меньше нуля");

        }
    }

    static void printColor() {
        int value, red, yelow, green;
        value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value >= 1 && value <= 100) {
            System.out.println("Желтый");
        } else if (value >= 101) {
            System.out.println("Зеленый");
        }

    }

    static void compareNumbers() {
        int a, b;
    a = 10;
    b = 15;


        if (a>=b) {
            System.out.println("a >= b");
        }else if (a<b){
            System.out.println("a < b");
        }
    }


}


