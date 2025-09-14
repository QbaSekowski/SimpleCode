package mate.academy;

import java.util.PriorityQueue;
import java.util.Queue;

class Kata {
    public static long sumTwoSmallestNumbers(long[] numbers) {
        Queue<Long> queue = new PriorityQueue<>();
        for (int i = 0; i < numbers.length; i++) {
            queue.add(numbers[i]);
        }
        return queue.poll() + queue.poll();
    }
}
