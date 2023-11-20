package recursion.Lecture02;

import recursion.Lecture01.printNto1;

public class MazePath {
    public static void main(String[] args) {
        //for number of ways 
        System.out.println(maze(1,1,3,3));
        //for teh path printing
        printpaths(1,1,3,3,"");
        //using only 2 parameter
        System.out.println(maze2(3,3));

    }

    //Number of ways
    public static int maze(int i, int j, int k, int l) {
        if(i>k || j>l){
            return 0;
        }
        if(i==k && j==l){
            return 1;
        }
        int rightways=maze(i,j+1,k,l);
        int leftways=maze(i+1,j,k,l);
        return rightways+leftways;

    }
    //print the paths
    static void printpaths(int i, int j, int k, int l,String s){
        if(i>k || j>l){
            return ;
        }
        if(i==k && j==l){
            System.out.println(s);
        }
        printpaths(i,j+1,k,l,s+'R');
        printpaths(i+1,j,k,l,s+'D');
    }
    //without any 4 variable as parameter 
    //using 2 parameter only
    public static int maze2(int i, int j) {
        if(i<1 || j<1){
            return 0;
        }
        if(i==1 && j==1){
            return 1;
        }
        int rightways=maze2(i,j-1);
        int leftways=maze2(i-1,j);
        return rightways+leftways;

    }

}
