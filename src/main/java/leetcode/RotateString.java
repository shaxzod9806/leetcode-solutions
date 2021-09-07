package leetcode;

public class RotateString {
    public static void main(String[] args) {
//        System.out.println(rotateString("abcde","cdeab"));
        System.out.println(rotateString2("abcde","cdeab"));
    }

    public static boolean rotateString(String s, String goal) {

//        s = salom
//        goal = lomsa
        String str="";
        for (int i = 0; i <s.length(); i++) {
            str = s.substring(i) + s.substring(0, i);
            if (str.equals(goal)) {
                return true;
            }
        }
        return false;
    }
    public static boolean rotateString2(String s, String goal) {
        String str="";
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)!=goal.charAt(0))
                continue;
            str = s.substring(i) + s.substring(0, i);
            if (str.equals(goal)) {
                return true;
            }
        }
        return false;
    }
}
//  s  =  abcde"
//  goal="cdeab"