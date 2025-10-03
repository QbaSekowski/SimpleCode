package mate.academy;

public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int average = 0;
        for (int point : classPoints) {
            average += point;
        }
        average /= classPoints.length;
        return yourPoints > average;
    }
}