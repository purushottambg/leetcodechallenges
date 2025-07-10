import java.util.Stack;

public class ValidStringParenthesis {
    public static void main(String[] args) {

        String string =  "{{}{}()[]}[]()}";
        System.out.println("Is Boolean:"+isValid(string));
    }
    private static boolean isValid(String s) {

        char[] chars = s.toCharArray();
        Stack<Character> braces = new Stack<>();

        for (char c: chars){
            if(c=='{' || c=='(' || c=='['){
                braces.push(c);
                System.out.println("adding "+c+", to -> "+braces);
            } else if(braces.isEmpty()) {
                System.out.println(c+" can't be first element");
                return false;
            }else if (braces.peek()=='{' && c=='}' || braces.peek()=='(' && c==')' || braces.peek()=='[' && c==']' ) {
                System.out.println(c+" poped!");
                braces.pop();
            }else{
                return false;
            }
        }

        if (braces.isEmpty()){
            return true;
        }
        return false;

    }
}
