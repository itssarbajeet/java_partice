 import java.util.*;
public class A47_RearrangeArrayInAlternatinPositiveAndNegativeItems{
    public static String compression(String str){
        StringBuilder newStr=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr=newStr.append(str.charAt(i));
            if(count>1){
                newStr=newStr.append(count.toString());
            }
        }
        return newStr.toString();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter str: ");
        String str=sc.nextLine();
        System.out.println(compression(str));
    }
}