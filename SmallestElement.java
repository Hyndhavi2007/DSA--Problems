import java.util.Scanner;
class SmallestElementArray{
    public static int smallest(int[]nums){
        int smallest = nums[0];
        for(int i = 0; i< nums.length; i++){
            if(nums[i] < smallest){
                smallest = nums[i];
            }
        }
        return smallest;
    }
}
public class SmallestElement {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }
        int smallest = SmallestElementArray.smallest(nums);
        System.out.println("The Smallest element of the Array is " + smallest);
        scanner.close();
    }
}
