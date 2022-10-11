public class AlphabetForLoop {
    public static void main(String[] args) {
        //A-Z
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
        }

        System.out.println();

        //Z-A
        for (char c = 'Z'; c >= 'A'; c--) {
            System.out.print(c);
        }
    }
}
