package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        // входные данные:
        int counter = 1;
        int lower_limit = 200;
        int upper_limit = 300;
        int number = 225;
        int expected = 15;

        // логика:
        for ( int i = 10; i <= 99; i++) {
            if (i * i >= 200 && i * i <= 300) {

                if (counter > 0) {
                    System.out.println("Количество вхождений: " + counter++);
                }
            }
        }
    }
}
