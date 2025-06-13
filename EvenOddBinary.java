public class EvenOdd {
    public static String EvenOddNumber(int num){
        if((num&1)==0){
            return "Even";
        }else{
            return "Odd";
        }
    }
    public static void main(String[] args) {
        System.out.println(EvenOddNumber(2));
    }
}
