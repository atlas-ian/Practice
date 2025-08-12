package arrays;

public class largest {
    public static void main(String[] args) {
        int [] arr = {9,1,3,25,2,5,2};
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
