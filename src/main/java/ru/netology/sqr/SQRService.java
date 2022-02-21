package ru.netology.sqr;

public class SQRService {
    public int sqrtCeil(int lower_limit, int upper_limit) {
        
        int sqrtCeil = 100;
        int counter = 0;
        
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerLimit && i * i <= upperLimit) {
                sqrtCeil = i * i;
                counter++;
                }
        }
        return counter;
    }
}
