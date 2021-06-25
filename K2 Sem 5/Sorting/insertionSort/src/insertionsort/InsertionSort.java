
package insertionsort;
public class InsertionSort {

    public static void main(String[] args) {
        int arr[]={1,3,4,12,13,14,15,5,90,-21,-90};
        int n=arr.length;
        
        for(int i=1 ;i<n;i++)
        {
            int curElem=arr[i];
            //int ind=i;
            int j=i-1;
            for(   ;j>=0 && curElem<arr[j];j--){
                
                arr[j+1]=arr[j];
                //ind=j;
            }
            arr[j+1]=curElem;
        }
        
        for(int a:arr){
            System.out.print(" "+a);
        }
    }
    
}
