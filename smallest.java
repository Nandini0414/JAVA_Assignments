public class smallest {
    public static void main(String[] args) {
        int arr[]=new int[]{26,77,354,78,54};
        int min=arr[0];
       for(int i=0;i<arr.length;i++){
           if(arr[i]<min)
               min=arr[i];
           }
        System.out.println("Smallest element in given array: " + min);
    }
    }

