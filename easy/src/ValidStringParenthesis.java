public class ValidStringParenthesis {
    public static void main(String[] args) {

        String string =  "{{}{()[}]}";
        System.out.println("Is Boolean:"+isValid(string));
    }
    private static boolean isValid(String s) {
        int curly=0;
        int soft=0;
        int square=0;
        char[] chars = s.toCharArray();

        for (char c: chars){
            switch (c){
                case '{':
                    curly++;
                    break;
                case '(':
                    soft++;
                    break;
                case '[':
                    square++;
                    break;
                case '}':
                    curly--;
                    break;
                case ')':
                    soft--;
                    break;
                case ']':
                    square++;
                    break;
            }
        }

        if (curly==0 && soft==0 && square==0){
            return true;
        }
        return false;

    }
}
