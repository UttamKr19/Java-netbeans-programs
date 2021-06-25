package selectionsort;

/**
 *
 * @author Uttam
 */
public class SelectionSort {

    
    public static void main(String[] args) {
      int arr[]={1,3,4,5,5,9,89,45,9,43,0,-21,-90};
        int n=arr.length;
        //int min=arr[0];
        int t;
        for(int i=0;i<n-1;i++)
        {

            
            int mi=i;
            for(int j=i+1;j<n;j++){
                
                if(arr[j]<arr[mi]){
                    //min=arr[j];
                    mi=j;
                }
                //System.out.println(min);
            }
            //System.out.println(min);
            
            //arr[i]=min;
            t=arr[mi];
            arr[mi]=arr[i];
            arr[i]=t;
            
            

        }
        
        
        for(int a:arr){
            System.out.print(" "+a);
        }
    }

    public SelectionSort() {
    }

    @Override
    public String toString() {
        return "SelectionSort{" + '}';
    }
    
}
