
package newpackage;
public class NewClass {
    protected void meth0()
    {
        System.out.println("meth0");
    }
    
    
    protected void sor()
    {
        
        int[] ar={6,2,9,1,4};
       
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=0;j<ar.length-1;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    int t=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=t;
                }
            }
        }
        
        for(int x:ar)
        {
            System.out.print(x+ " ");
        }
    }
    
    public void ssort()
    {
        int[] ar={6,2,9,1,4,89,43,2,13};
        int n=ar.length;
        int min,ind,tmp;
        
        for(int i=0;i<n;i++){
            min=ar[i];
            ind=i;
            for(int j=i;j<n;j++){
                if(ar[j]<min){
                    min=ar[j];
                    ind=j;
                }
            }
            
            tmp=ar[i];
            ar[i]=ar[ind];
            ar[ind]=tmp;
            
        }
        
        for(int x:ar)
        {
            System.out.print(x+ " ");
        }
    }
    
    void isort(){
        int ar[]={8,4,96,32,2,47,15,2};
        int tmp;
        for(int i=0;i<n;i++){
            for(j=1;j<i;j++){
                if(ar[j]>ar[j-1]){
                    
                }
            }
        }
    }
    
   public void bsearch()
    {
        int a[]={1,4,12,16,68,89,478};
        int n=a.length;
        int f=0;
        int l=n-1;
        int m=(f+l)/2;
        int s=89;
        for(;m>0;){
            m=(f+l)/2;
            if(a[m]==s){
                System.out.println("found at "+m );
                break;
            }
            else if(s<a[m]){
                l=m-1;
            }
            else if(s>a[m]){
                f=m+1;
            }
            
        }
    }
   
}
