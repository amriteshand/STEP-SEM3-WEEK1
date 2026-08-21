import java.util.Scanner;

public class TrafficSignalStreakAnalyzer {

    // Method to find the longest continuous signal streak
    static void findLongestStreak(String signalLog) {

        if (signalLog.length() == 0) {
            System.out.println("Signal log is empty.");
            return;
        }

        int currentStreak = 1;
        int longestStreak = 1;

        char longestColor = signalLog.charAt(0);

        // Traverse the signal log
        for (int i = 1; i < signalLog.length(); i++) {

            // If current signal is same as previous signal
            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }

            // Update longest streak
            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
                longestColor = signalLog.charAt(i);
            }
        }

        System.out.println("Longest Streak: '" + longestColor
                + "' repeated " + longestStreak + " times");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter signal log: ");
        String signalLog = sc.nextLine();

        findLongestStreak(signalLog);

        sc.close();
    }
}