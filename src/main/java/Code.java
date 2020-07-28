import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class Code {


        public static String highAndLow(String numbers) {
            IntSummaryStatistics summary = Arrays
                    .stream(numbers.split(" "))
                    .collect(Collectors.summarizingInt(n -> Integer.parseInt(n)));
            return String.format("%d %d", summary.getMax(), summary.getMin());
        }
}
