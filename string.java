public class Main {
    public static void main(String[] args) {
        String input = "Hello, Java!";
        reverseString(input);

    }
    public static void reverseString(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= s.length(); i++){
            sb.append(s.charAt(s.length() - i));
        }
        System.out.println(sb.toString());
    }
}
