public class A06_ConvertASentenceInToItsEquivalentMobileNumericKeypadSequence {
    static String strToNum(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = Character.toUpperCase(str.charAt(i));
            if(ch >= 'A' && ch <= 'C'){
              String s ="2".repeat(ch - 64);
              sb.append(s);
          }
          else if(ch >= 'D' && ch <= 'F'){
              String s ="3".repeat(ch - 'C');
              sb.append(s);
          }
          else if(ch >= 'G' && ch <= 'I'){
              String s ="4".repeat(ch - 'F');
              sb.append(s);
          }
          else if(ch >= 'J' && ch <= 'L'){
              String s ="5".repeat(ch - 'I');
              sb.append(s);
          }
          else if(ch >= 'M' && ch <= 'O'){ 
              String s ="6".repeat(ch - 'L');
              sb.append(s);
          }
          else if(ch >= 'P' && ch <= 'S'){
              String s ="7".repeat(ch - 'O');
              sb.append(s);
          }
          else if(ch >= 'T' && ch <= 'V'){
              String s ="8".repeat(ch - 'S');
              sb.append(s);
          }
          else if(ch >= 'X' && ch <= 'Z'){
              String s ="9".repeat(ch - 'V');
              sb.append(s);
          }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="GEEKSFORGEEKS";
        System.out.println("The equivalent mobile numeric keypad sequence for the given sentence is: "+strToNum(str));
    }
}
