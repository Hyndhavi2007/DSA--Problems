import java.util.Scanner;
public class SecondLargestElement{
    public static int secondlargestelement(int[]arr){
    if(arr == null || arr.length < 2) return -1;
    int largest = Integer.MIN_VALUE;
    int second_Largest = Integer.MIN_VALUE;
    for(int nums: arr){
        if(nums > largest) {
            second_Largest = largest;
            largest = nums;
        }else if( nums > second_Largest && nums < largest){
            second_Largest = nums;
    
        }
    }
     return (second_Largest == Integer.MIN_VALUE ? -1: second_Largest);
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int a = scanner.nextInt();
        int[]arr = new int[a];
        System.out.println();
        System.out.println("Enter the " +a+" elements");
        for(int i = 0; i< a;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.print("The array you have enterd is ");
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();
        int result = secondlargestelement(arr);
        if(result == -1){
            System.out.println("All Elements are the same OR second largest element does not exist.");
        }else{
        System.out.print("The Second Largest Element in the array is: " + result);
        }
        scanner.close();

    }
}