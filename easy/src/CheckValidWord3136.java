public class CheckValidWord3136 {
    public static void main(String[] args) {
        String str = "Word234";
        System.out.println("Is valid:"+isValid(str));
    }
    public static boolean isValid(String str){
        boolean vowel=false;
        boolean consonant =false;
        boolean digit =false;
        boolean specialChar =true;
         for (char c: str.toCharArray()){
             if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ||c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ){
                 vowel=true;
             }
             if(c>'a' && c<'e' || c>'e' && c<'i' || c>'i' && c<'o' || c>'o' && c<'u' || c>'v' && c<'z'){
                consonant=true;
             }
             if(c>'A' && c<'E' || c>'E' && c<'I' || c>'I' && c<'O' || c>'O' && c<'U' || c>'V' && c<'Z')
                 consonant=true;
             if (c>='0' && c<='9' ){
                 digit=true;
             }
             if(c>=':' && c<='@'){
                 specialChar=false;
             }
         }
         return vowel&&consonant&&digit&&specialChar;
    }
}
