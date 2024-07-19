import javax.swing.*;

public class largest {
    public static void main(String[] args) {
        int arr[]=new int[]{4,465,92,43,80};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max)
                max=arr[i];
        }
        System.out.println("largest element in given array: " +max);
    }
}
