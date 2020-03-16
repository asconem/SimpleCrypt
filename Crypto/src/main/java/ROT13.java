import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    int difference;

    public ROT13(Character cs, Character cf) {
        difference = (cf - cs);
    }

    public ROT13() {
        difference = 13;
    }


    public String crypt(String text) throws UnsupportedOperationException {
        String rotate = "";
        for (Character c : text.toCharArray()) {
            if(Character.isAlphabetic(c)) {
                int code = c - difference;
                if (Character.isUpperCase(c)) {
                    if (code < 'A') {
                        code = (1 + 'Z') - ('A' - code);
                    }
                } else {
                    if (code < 'a') {
                        code = (1 + 'z') - ('a' - code);
                    }
                }
                rotate += (char) code;
            } else {
                rotate += c;
            }
        }
        System.out.println(rotate);
        return rotate;
    }


    public String encrypt(String text) {
        String rotate = "";
        for (Character c : text.toCharArray()) {
            if(Character.isAlphabetic(c)) {
                int code = c - difference;
                if (Character.isUpperCase(c)) {
                    if (code < 'A') {
                        code = (1 + 'Z') - ('A' - code);
                    }
                } else {
                    if (code < 'a') {
                        code = (1 + 'z') - ('a' - code);
                    }
                }
                rotate += (char) code;
            } else {
                rotate += c;
            }
        }
        System.out.println(rotate);
        return rotate;
    }

    public String decrypt(String text) {
        String rotate = "";
        for (Character c : text.toCharArray()) {
            if(Character.isAlphabetic(c)) {
                int code = c + difference;
                if (Character.isUpperCase(c)) {
                    if (code > 'Z') {
                        code = ('A' - 1) + (code - 'Z');
                    }
                } else {
                    if (code > 'z') {
                        code = ('a' - 1) + (code - 'z');
                    }
                }
                rotate += (char) code;
            } else {
                rotate += c;
            }
        }
        System.out.println(rotate);
        return rotate;
    }

    public static String rotate(String s, Character c) {
        return null;
    }

}