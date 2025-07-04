// Check whether the array is Sorted(Ascending) or not.

public class Solution {

    public static boolean checkSorted(int arr[], int idx){

        if(idx == arr.length-1){
            return true;
        }

        if(arr[idx] < arr[idx+1]){
            return checkSorted(arr, idx+1);
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5};
        // int arr2[] = {1, 2, 6, 4, 5};
        // int arr3[] = {1, 2, 2, 4, 5};
        System.out.println(checkSorted(arr, 0));
    }
}
