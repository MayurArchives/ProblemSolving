public class day34_ques4 {

    public static int day34_ques4(String s) {
        int count = 0;
        int prevLength = 0, currLength = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currLength++;
            } else {
                count += Math.min(prevLength, currLength);
                prevLength = currLength;
                currLength = 1; // Reset current group length
            }
        }

        count += Math.min(prevLength, currLength);

        return count;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(countBinarySubstrings(s));

        scanner.close();
    }
}
