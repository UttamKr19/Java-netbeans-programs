
package thisisatreeee;

public class ThisIsATreeeee {

    public static void main(String[] args) {

        String s="This is a treeeee jaf lajfl flj dfjlasjf a laflalj ldjsa";
        String sArr[]=s.split(" ");
        char dfa='s';
        
  
        int arr[]=new int[sArr.length];
        for(int a=0;a<arr.length;a++){
            arr[a]=sArr[a].length();
        }
        
        for(int i:arr)
            System.out.print(" "+i);
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                    
                    String stemp=sArr[j];
                    sArr[j]=sArr[j+1];
                    sArr[j+1]=stemp;
                }
            }
        }
        
        System.out.println("");
        for(int i:arr)
            System.out.print(" "+i);
        
        System.out.println("");
        for(String i:sArr)
            System.out.print(" "+i);
        
        System.out.println("");
        
        
    }
    
}
