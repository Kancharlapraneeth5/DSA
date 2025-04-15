package arrays;

public class ProductOfArrayExceptSelf {
    public int [] productOfArrayExceptSelf (int [] arr){
        int [] leftPass = new int [arr.length];
        int [] rightPass = new int [arr.length];
        int [] result = new int [arr.length];
        int leftToRight_product = 1;
        int rightToLeft_product = 1;

        // iterate left to right..
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                leftPass[i] = leftToRight_product;
                leftToRight_product = arr[i];
            }
            else{
                leftPass[i] = leftToRight_product;
                leftToRight_product = leftToRight_product * arr[i];
            }
        }
        // iterate right to left...
        for (int i = arr.length - 1; i >= 0; i--){
            if(i == arr.length - 1){
                rightPass[i] = rightToLeft_product;
                rightToLeft_product = arr[i];
            }
            else{
                rightPass[i] = rightToLeft_product;
                rightToLeft_product = rightToLeft_product * arr[i];
            }
        }
        // iterate to get the final result..
        for (int i = 0; i < leftPass.length; i++){
            result[i] = leftPass[i] * rightPass[i];
        }
        return result;
    }
}
