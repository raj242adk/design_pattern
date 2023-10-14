package sevensem.advancejava.thread.classassignment;

public class PeakArray {

    public static void main(String[] args) {
        int[] array ={1,6,7,10};
        int n = array.length;
        System.out.println("Index of peak point is "+findPeak(array,n));

    }
    private static int findPeak(int[] array, int n) {
        if(n==1){
            return 0;
        }
        if(array[0]>=array[1]){
            return 0;
        }
        if(array[n-1]>=array[n-2]){
            return n-1;
        }
        for (int i=1;i<=n-1;i++){
            if (array[i]>=array[i-1] && array[i]>=array[i+1]){
                return i;
            }
        }
        return 0;
    }
}
