import java.util.*;
public class A47_RearrangeArrayInAlternatinPositiveAndNegativeItems{
    public static void bubble_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("The sorted Array is: ");
        for(int i=0;i<arr.length;i++){
        System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

    public static void selection_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minpos=i;
            for(int j=i+1;j<n;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        System.out.print("The sorted Array is: ");
        for(int i=0;i<n;i++){
        System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

    public static void insertion_sort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        System.out.print("The sorted Array is: ");
        for(int i=0;i<n;i++){
        System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    
    public static void counting_sort(int arr[]){
        int largest=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<n;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        System.out.print("The sorted Array is: ");
        for(int i=0;i<n;i++){
        System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter The Choice: ");
        String choice=sc.next();
        switch(choice){
            case "bubblesort":
            bubble_sort(arr);
            break;
            case "selectionsort":
            selection_sort(arr);
            break;
            case "insertion_sort":
            insertion_sort(arr);
            break;
            case "countingsort":
            counting_sort(arr);
            break;
            default:
            System.out.println("Invalid Choice!!!");
        }
    }
}





