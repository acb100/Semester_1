public class ReverseNames {
    public static void main(String[] args) {
        String[] names = {"Jonas", "Tina", "Tom", "Steve", "Amanda", "Hanna", "Rebecca", "Carl"};
        System.out.println("\nReverse: ");
        for (int i = names.length-1; i >= 0; i--){
            System.out.println(names[i]);
        }
    }
}
