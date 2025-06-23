package Practice;

public class LargestElement {
    public static void main(String[] args) {
//        System.out.println("largest");
        int [] arr = {9,36,26,4,76};
        int largest = arr[0];

        for(int i = 0; i < arr.length; i++ ){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("largest:" +largest);
    }



}
