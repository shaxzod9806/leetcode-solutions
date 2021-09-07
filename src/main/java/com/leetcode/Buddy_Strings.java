//package leetcode;
//
//import java.util.HashMap;
//
//public class Buddy_Strings {
//    public static void main(String[] args) {
//        System.out.println(buddyStrings("ab", "ba"));
//    }
//    public static boolean buddyStrings(String s, String goal) {
//        int counter = 0;
//        if (s.length() != goal.length()) {
//            return false;
//        }
//        for (int i = 0; i < s.length() && s.length() > 2; i++) {
//            if (s.charAt(i) != goal.charAt(i)) {
//                counter++;
//            }
//        }
//        boolean b=false;
//        if ( s.length()<=2&&!s.equals(goal)){
//
//            if((counter == 2||counter==0 )&&s.length()>2){
//
//            }
//        }
//
//        return ;
//    }
//
//
//
////    public boolean buddyStrings2(String A, String B) {
////        if(A.equals(B)) {
////            HashMap<Character, Integer> hm = new HashMap<>();
////            for (char ch : A.toCharArray()) {
////                hm.put(ch, 1);
////            }
////
////        }
////    }
//}
