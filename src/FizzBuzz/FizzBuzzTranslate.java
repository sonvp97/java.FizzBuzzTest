package FizzBuzz;

public class FizzBuzzTranslate {
    public static String getFizzBuzz(String string) {
        int number = Integer.parseInt(string);
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else {
            if (string.indexOf("3") != -1) {
                return "Fizz";
            } else if (string.indexOf("5") != -1) {
                return "Buzz";
            } else {
                String resuilt = "";
                String num = "0123456789";
                String[] arr = {"khong","mot","hai","ba","bon","nam","sau","bay","tam","chin"};
                for (int i = 0;i<string.length();i++){
                    if(num.indexOf(string.charAt(i)) != -1){
                        resuilt += arr[num.indexOf(string.charAt(i))] + " ";
                    }
                }

                return resuilt.strip();
            }
        }

    }
public static void main(String[] args) {
    System.out.println(getFizzBuzz("22"));

}
}
