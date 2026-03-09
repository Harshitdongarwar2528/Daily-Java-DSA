package Strings;

class Sum {
    public int sumOfNumbers(String s) {
        int sum = 0;
        String temp = "";

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                temp += c;
            } else {
                if (!temp.equals("")) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        if (!temp.equals("")) {
            sum += Integer.parseInt(temp);
        }
        return sum;
    }
}

public class SumOfTheNo {
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.sumOfNumbers("123xyz"));
        System.out.println(s.sumOfNumbers("1xy23z"));
    }

}
