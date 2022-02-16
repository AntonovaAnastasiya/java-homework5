package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldSqrtCeilFirstSqrt() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int expected = 225;
        int lower_limit = 200;
        int upper_limit = 300;

        // вызываем целевой метод:
        int actual = service.sqrtCeil(lower_limit, upper_limit);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrtCeilSecondSqrt() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int expected = 256;
        int lower_limit = 200;
        int upper_limit = 300;

        // вызываем целевой метод:
        int actual = service.sqrtCeil(lower_limit, upper_limit);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrtCeilLowerLimit() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int expected = 100;
        int lower_limit = 200;
        int upper_limit = 300;

        // вызываем целевой метод:
        int actual = service.sqrtCeil(lower_limit, upper_limit);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrtCeilUpperLimit() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int expected = 9801;
        int lower_limit = 200;
        int upper_limit = 300;

        // вызываем целевой метод:
        int actual = service.sqrtCeil(lower_limit, upper_limit);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrtCeilNoRange() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int expected = 36;
        int lower_limit = 200;
        int upper_limit = 300;

        // вызываем целевой метод:
        int actual = service.sqrtCeil(lower_limit, upper_limit);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}