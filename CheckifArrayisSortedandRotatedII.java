import java.util.Scanner;
public class CheckifArrayisSortedandRotatedII {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) { 
                count++;
                if (count > 1) {
                    return false; 
                }
            }
        }
        return true; 
    }
    public int findRotationCount(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                return (i + 1) % n; 
            }
        }
        return 0; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckifArrayisSortedandRotatedII obj = new CheckifArrayisSortedandRotatedII();
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        boolean result = obj.check(nums);
        if (result) {
            int rotations = obj.findRotationCount(nums);
            System.out.println("The array is sorted and rotated.");
            System.out.println("It was rotated " + rotations + " time(s).");
        } else {
            System.out.println("The array is NOT sorted and rotated.");
        }
        scanner.close();
    }
}
