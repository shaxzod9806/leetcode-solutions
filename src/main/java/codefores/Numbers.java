package codefores;

public class Numbers {
    public static void main(String[] args) {
//        numbers
        System.out.println(oneRoomNumber(66));
    }

    public static boolean oneRoomNumber(int number){
//        64
        for (int i = 0; i <number; i++) {
            if (Math.pow(2,i)==number){
                return true;
            }
        }return false;
    }
}
