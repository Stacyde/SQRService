package ru.netology.sqr;

public class SQRService {
    public int calcSqrt(int beginning, int end) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= beginning) & (i * i <= end)) {
                count += 1;
            }
        }
        return count;
    }
}
