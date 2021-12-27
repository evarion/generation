import java.math.BigInteger;

public class Generation {
    int yearStart = 2019;
    int countGeneration = 65;

    public void calculationBigInteger(int yearStart, int countGeneration) {
        this.yearStart = yearStart;
        this.countGeneration = countGeneration;

        BigInteger count = new BigInteger("2");
        BigInteger multiply = new BigInteger("2");

        int minYear;
        System.out.println("год рождения " + yearStart);

        for (int i = 1; i <= countGeneration; i++) {
            count = count.multiply(multiply);

            yearStart = yearStart - 33;
            if (yearStart > 0) {
                System.out.println(i + ". на: " + yearStart + " год" + " - количество предков: " + count + " человека");
            } else {
                minYear = yearStart;
                minYear = -minYear;
                System.out.println(i + ". на: " + minYear + " год до Н.Э." + " - количество предков: " + count + " человека");
            }
        }
    }
}
