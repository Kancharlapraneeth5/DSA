package arrays;

public class ProductOfArrayExceptSelf {

    public int [] productOfArrayExceptSelf (int [] arr){
        
        // check if the array is empty or null.
        if (arr == null || arr.length == 0){
            System.out.println("The array is empty.");
            return new int[0];
        }

        int [] result = new int [arr.length];
        int leftToRight_product = 1;
        int rightToLeft_product = 1;


        // iterate left to right..
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                result[i] = leftToRight_product;
                leftToRight_product = arr[i];
            }
            else{
                result[i] = leftToRight_product;
                leftToRight_product = leftToRight_product * arr[i];
            }
        }
        // iterate right to left...
        for (int i = arr.length - 1; i >= 0; i--){
            if(i == arr.length - 1){
                result[i] = result[i] * rightToLeft_product;
                rightToLeft_product = arr[i];
            }
            else{
                result[i] = result[i] * rightToLeft_product;
                rightToLeft_product = rightToLeft_product * arr[i];
            }
        }
        return result;
    }
}
