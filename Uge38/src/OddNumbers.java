public class OddNumbers {
    public static void main(String[] args) {
        int[] field = {2,20,3,13,15,3,9,10,1,5,8};

        for (int i = 0; i < field.length; i++){
            if(field[i]%2 != 0){
                System.out.println(field[i]);
            }
        }
    }
}