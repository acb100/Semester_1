public class TotA {
    public static void main(String[] args) {
        int[] values = {2, 5, 4, 6, 8, 10, 4, 5};
        int[] values2 = {2, 5, 5, 6, 8, 10, 4, 5};
        int[] values3 = {2, 1, 5, 3, 8, 10, 13, 5};

        int totA = 0;
        for (int i = 0; i < values.length; i = i + 1) {
            totA = totA + values[i];
        }
        System.out.println(totA); //44

        int totB = 0;
        for (int i = 0; i < values.length; i = i + 2) {
            totB = totB + values[i]; //18
        }
        System.out.println(totB);

        int totC = 0;
        for (int i = 1; i < values.length; i = i + 2) {
            totC = totC + values[i]; //26
        }
        System.out.println(totC);

        int a = 0;
        while (values2[a] <= values2[a + 1]) {
            System.out.println(values2[a]);
            a = a + 1;
        } // Tæller de 5 første tal.

        int b = 0;
        while (b <= values3[b]) {
            System.out.println(values3[b]);
            b++;
        } // Tæller de 7 første tal


    }
}