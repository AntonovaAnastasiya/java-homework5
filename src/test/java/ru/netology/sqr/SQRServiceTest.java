package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

   @Test
    void shouldCounterSqrtCeil() {
        SQRService service = new SQRService();

        // подготавливаем данные:

        int expected = 3;
        int lowerLimit = 200;
        int upperLimit = 300;

        // вызываем целевой метод:
        int actual = service.sqrtCeil(lowerLimit, upperLimit);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrtCeilMinSqrt() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int expected = 5;
        int lowerLimit = 100;
        int upperLimit = 199;

        // вызываем целевой метод:
        int actual = service.sqrtCeil(lowerLimit, upperLimit);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrtCeilMaxSqrt() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int expected = 4;
        int lowerLimit = 9100;
        int upperLimit = 9850;

        // вызываем целевой метод:
        int actual = service.sqrtCeil(lowerLimit, upperLimit);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
