import java.util.Scanner;
public class CheckifArrayisSortedandRotated {
    public static boolean check(int[]arr) {
    int count = 0;
    int n = arr.length;
    for(int i =0;i<arr.length;i++){
        if(arr[i]>arr[(i+1 )% n]) {
            count++;
            if(count > 1) {
                return false;
            }
            }
        }
        return true;
    }
    public static int findRotationCount(int[]arr){
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(arr[i] > arr[(i+1) % n]) {
                return i + 1;
            }
        }
        return 0;
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int a = scanner.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[] = new int[a];
        for(int i = 0; i < arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        if(check(arr)) {
            int rotations = findRotationCount(arr);
            System.out.println("Array is sorted and rotated.");
            System.err.println("Rotated " + rotations + " times(s)");
        }else{
            System.out.println("Array is Not sorted and rotated.");
        }
        scanner.close();
    }
}
