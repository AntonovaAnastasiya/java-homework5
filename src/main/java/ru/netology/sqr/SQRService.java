package ru.netology.sqr;

public class SQRService {
    public int sqrtCeil(int lower_limit, int upper_limit) {
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lower_limit && i * i <= upper_limit) {
                return i * i;
            }
        }
        return 0;
    }
}
