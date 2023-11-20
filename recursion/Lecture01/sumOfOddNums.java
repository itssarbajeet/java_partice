package recursion.Lecture01;

public class sumOfOddNums {
    public static void main(String[] args) {
        System.out.println(sum(0,5));
    }

    public static int sum(int i, int j) {
        if(i>j){
            return 0;
        }
        if(i%2==0){
            i=i+1;
        }
        if(i==j && j%2==0){
            return 0;
        }
        else if(i==j && j%2!=0){
            return j;
        }
        return i+sum(i+2,j);

        

    }
}

