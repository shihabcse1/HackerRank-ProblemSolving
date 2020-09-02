import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {

    public static double[] getMedians(int[] arr) {

        PriorityQueue<Integer> lowers = new PriorityQueue<>(new Comparator<Integer>() { // Creating Max Heap by override compare function by passing Anonymous Class
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * o1.compareTo(o2);
            }
        });

        PriorityQueue<Integer> highers = new PriorityQueue<>(); // Min Heap

        double[] median = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            addNumberIntoHeap(number, lowers, highers); // Step 1 : Add Number into Heap
            reBalanceHeaps(lowers, highers); // Step 2 : Try to make both heaps equal or closest size
            median[i] = getMedian(lowers, highers); // Step 3 : Return median of each item
            System.out.println(median[i]);
        }
        return median;
    }

    private static void addNumberIntoHeap(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        if (lowers.size() == 0 || number < lowers.peek()) {
            lowers.add(number);
        } else {
            highers.add(number);
        }
    }

    private static void reBalanceHeaps(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {

        PriorityQueue<Integer> biggerHeap = (lowers.size() > highers.size() ? lowers : highers);
        PriorityQueue<Integer> smallerHeap = (lowers.size() > highers.size() ? highers : lowers);

        if (biggerHeap.size() - smallerHeap.size() >= 2) {
            smallerHeap.add(biggerHeap.poll());
        }
    }

    private static double getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {

        PriorityQueue<Integer> biggerHeap = (lowers.size() > highers.size() ? lowers : highers);
        PriorityQueue<Integer> smallerHeap = (lowers.size() > highers.size() ? highers : lowers);

        if (biggerHeap.size() == smallerHeap.size()) {
            return ((double) biggerHeap.peek() + smallerHeap.peek()) / 2;
        } else {
            return biggerHeap.peek();
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = myScanner.nextInt();
        }
        getMedians(numbers);
    }
}
