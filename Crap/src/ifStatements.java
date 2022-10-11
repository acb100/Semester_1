public class ifStatements {
    public static void main(String[] args) {
        int x = 30;
        int y = 30;

        if (x==y) {
            System.out.println(x + " og " + y + " er lig hinanden.");
        } else if (x>y) {
            System.out.println(x + " er større end " + y + ".");
        } else if (x<y) {
            System.out.println(x + " er mindre end " + y + ".");
        } else {
            System.out.println(x + " og " + y + " er ikke lig hinanden.");
        }
    }
}

