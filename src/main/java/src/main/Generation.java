package src.main;

import java.math.BigInteger;

public class Generation {
    int yearStart = 2019;
    int countGeneration = 65;

    public String calculationBigInteger(int yearStart, int countGeneration) {
        String result = "";
        this.yearStart = yearStart;
        this.countGeneration = countGeneration;

        BigInteger count = new BigInteger("2");
        BigInteger multiply = new BigInteger("2");

        int minYear;
        //System.out.println("год рождения " + yearStart);

        for (int i = 1; i <= countGeneration; i++) {
            count = count.multiply(multiply);

            yearStart = yearStart - 33;
            if (yearStart > 0) {
                result = result + i + ". на: " + yearStart + " год" + " - количество предков: " + count + " человека"+"\n";
                // System.out.println(i + ". на: " + yearStart + " год" + " - количество предков: " + count + " человека");
            } else {
                minYear = yearStart;
                minYear = -minYear;
                result = result + i + ". на: " + minYear + " год до Н.Э." + " - количество предков: " + count + " человека"+"\n";
                //System.out.println(i + ". на: " + minYear + " год до Н.Э." + " - количество предков: " + count + " человека");
            }
        }
        return result;
    }
}
