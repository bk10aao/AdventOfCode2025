package CustomSetV2;

import java.io.IOException;
import java.util.List;

public class Day01 {

    public static int partOne(List<String> input) {
        int count = 0;
        int dial = 50;
        for(String s: input) {
            int amount = Integer.parseInt(s.substring(1));
            dial = s.charAt(0) == 'R' ? (dial + amount) % 100 : (dial - amount) % 100;
            if(dial == 0)
                count++;
        }
        return count;
    }

    public static int partTwo(List<String> input) {
        int count = 0;
        int dial = 50;
        for(String s: input) {
            int amount = Integer.parseInt(s.substring(1));
            if(s.charAt(0) == 'R') {
                dial = dial + amount;
                if(dial >= 100) {
                    count += dial / 100;
                    dial %= 100;
                }
            } else {
                boolean hit = dial == 0;
                dial = dial - amount;
                if(dial <= 0) {
                    count += Math.abs(dial / 100) + (hit ? 0 : 1);
                    dial %= 100;
                    if(dial < 0)
                        dial += 100;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        List<String> input = FileLoader.loadResourceFile("day_01.txt");
        System.out.printf("Part one: %d\n", Day01.partOne(input));
        System.out.printf("Part two: %d\n", Day01.partTwo(input));
    }
}
