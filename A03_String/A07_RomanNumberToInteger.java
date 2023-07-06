public class A07_RomanNumberToInteger {
    public static int romanToDecimal(String str) {
        int[] romanValues = new int[26];
        romanValues['I' - 'A'] = 1;
        romanValues['V' - 'A'] = 5;
        romanValues['X' - 'A'] = 10;
        romanValues['L' - 'A'] = 50;
        romanValues['C' - 'A'] = 100;
        romanValues['D' - 'A'] = 500;
        romanValues['M' - 'A'] = 1000;

        int sum = 0; 
        int prevValue = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int currValue = romanValues[ch - 'A'];

            if (currValue < prevValue) {
                sum -= currValue;
            } else {
                sum += currValue;
                prevValue = currValue;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        String s="CMIVIIV";
        System.out.println("Input: "+s+" Output:"+romanToDecimal(s));
        
    }
}
