// Tower Of Hanoi problem.

public class Solution{

    public static void towerOfHanoi(int n, String src, String helper, String dest){

        if(n == 1){
            System.out.println("Transfering disk "+n+ " from "+src+ " to "+dest);
            return;
        }

        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfering disk "+(n-1)+ " from "+src+ " to "+helper);
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void main(String[] args){

        int n = 4;
        towerOfHanoi(n, "Source", "Helper", "Destination");
    }
}