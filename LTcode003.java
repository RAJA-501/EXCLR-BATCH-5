public class LTcode003 {
    public int myAtoi(String s) {
        s = s.trim();
        
        if (s.length() == 0) {
            return 0;
        }
        
        int index = 0;
        int sign = 1;
        long result = 0;
        
        if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(index) == '+') {
            index++;
        }
        
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0'; 
            result = result * 10 + digit;
            
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            
            index++;
        }
        

        return (int) (result * sign);
    }

    public static void main(String[] args) {
        LTcode003 solution = new LTcode003();
        
        System.out.println(solution.myAtoi("42")); 
        System.out.println(solution.myAtoi(" -042")); 
        System.out.println(solution.myAtoi("1337c0d3")); 
        System.out.println(solution.myAtoi("0-1")); 
        System.out.println(solution.myAtoi("words and 987"));
    }
}