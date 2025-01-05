package DSA.Strings;

public class String_Operations {

    public static void shiftingLetter(String s, int shift){
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            char res = (char)((c - 'a' + shift + 26) % 26 + 'a');
            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        String s = "abaca";

        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            char c = sb.charAt(i);
            sb.setCharAt(i, ++c);
//            System.out.println(sb);
        }
        System.out.println(sb);

        shiftingLetter(s, -4);
    }
}
