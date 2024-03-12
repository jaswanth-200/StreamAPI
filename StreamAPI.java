import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String args[]) {
        // Create a list of integers
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        // Convert the list to a stream
        Stream<Integer> data = nums.stream();

        // Sort the stream
        Stream<Integer> sortedData = data.sorted();

        // Filter even numbers from the sorted stream
        Stream<Integer> filterData = sortedData.filter(n -> n % 2 == 0);

        // Perform mapping operation (double each element)
        Stream<Integer> operation = filterData.map(n -> n * 2);

        // Reduce the stream to calculate sum
        int result = operation.reduce(0, (a, b) -> a + b);

        // Print the result
        System.out.println(result);
    }
}
