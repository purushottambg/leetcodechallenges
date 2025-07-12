public class LastWordLength {
    public static void main(String[] args) {
        String str = "I love my dreams and will achieve them indeed";
        String[] strArray=str.split(" ");
        System.out.println("Last word length: "+strArray[strArray.length-1].length());
    }
}
