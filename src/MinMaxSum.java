import java.util.Scanner;

public class MinMaxSum {
    int minmaxsum(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i]){
                min=arr[i];
            }
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max+min;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();

        }
        MinMaxSum sum=new MinMaxSum();
        System.out.println(sum.minmaxsum(array));

    }
}
