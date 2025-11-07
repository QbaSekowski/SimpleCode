package mate.academy;

import java.util.LinkedList;
import java.util.Queue;

public class Rotator {

    public Object[] rotate(Object[] data, int n) {
        if (n == 0) {
            return data;
        }
        int counter = 0;
        if (n > 0) {
            while (counter < n) {
                data = rotateOnceForward(data);
                counter++;
            }
        }
        if (n < 0) {
            while (counter > n) {
                data = rotateOnceBackward(data);
                counter--;
            }
        }
        return data;
    }

    private Object[] rotateOnceBackward(Object[] data) {
        if (data == null || data.length == 0) {
            return data;
        }
        Queue<Object> result = new LinkedList<>();
        for (int i = 1; i < data.length; i++) {
            result.add(data[i]);
        }
        result.add(data[0]);
        return result.toArray();
    }

    private Object[] rotateOnceForward(Object[] data) {
        if (data == null || data.length == 0) {
            return data;
        }
        Queue<Object> result = new LinkedList<>();
        result.add(data[data.length - 1]);
        for (int i = 0; i < data.length - 1; i++) {
            result.add(data[i]);
        }
        return result.toArray();
    }

}