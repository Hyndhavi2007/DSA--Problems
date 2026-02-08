import java.util.Scanner;
 class LargestElementArray {
    public static int largestElement(int[] nums){
        int largestElement = nums[0];
        for(int i = 0; i < nums.length; i++){
           if(nums[i] > largestElement){
            largestElement = nums[i];
        }
    }
    return largestElement;
    }
}
public class LargestElement{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        int largest = LargestElementArray.largestElement(nums);
        System.out.println("The Largest Element in the array is: " + largest);
        scanner.close();    
    }
}
