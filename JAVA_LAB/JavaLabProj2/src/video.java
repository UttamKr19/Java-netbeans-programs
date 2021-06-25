import java.util.Scanner;

class Video1
{
	String Vname;
	boolean ckot[]=new boolean[50];
	int rating;
}
class VideoStore1 extends Video1
{   int count=0,count2=0;
	String Vid_name[]=new String[50];
	int rat[]=new int[50];
	Scanner sc=new Scanner(System.in);
	void getname()
	{
		System.out.println("Enter the name of video");
		Vname=sc.next();
		Vid_name[count]=Vname;
		rat[count]=0;
		ckot[count]=true;
		count++;
	}
	void addrating(int n,String name)
	{
		for(int i=0;i<count;i++)
		{
			if(name.equals(Vid_name[i]))
			{
				rat[i]=n;
				System.out.println("Rating added Successfully");
				count2+=1;
		    
			}
		}
		if(count2==0)
		{   count2=0;
			System.out.println("Video not found");
		}
	}
	void docheckout(String name)
	{
		for(int i=0;i<count;i++)
		{
			if(name.equals(Vid_name[i]))
			{
				ckot[i]=false;
				count2+=1;
			}
		}
		if(count2==0)
		{   count2=0;
			System.out.println("Video not found");
		}
	}
	void doreturn(String name)
	{
		for(int i=0;i<count;i++)
		{
			if(name.equals(Vid_name[i]))
			{
				ckot[i]=true;
				count2+=1;
			}
		}
		if(count2==0)
		{   count2=0;
			System.out.println("Video not found");
		}
	}
	void listinventory()
	{
		for(int i=0;i<count;i++)
		{
			if(ckot[i]==true)
			{
				System.out.println(Vid_name[i]+" "+rat[i]);
			}
		}	
	}
	
	
}
public class video {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		VideoStore1 v=new VideoStore1();
		for(;;)
		{
			System.out.println("\n\n1.Add Video\n"+"2.Checked out Video\n"+"3.Return Video\n"+"4.Recieve Rating\n"+"5.List Inventory\n"+"6.Exit\n");
		    n=sc.nextInt();
		    switch(n)
		    {
		    case 1:
		    	v.getname();
		    	break;
		    case 2:
		    	System.out.println("Enter Video Name");
		    	String s=sc.next();
		    	v.docheckout(s);
		    	break;
		    case 3:
		    	System.out.println("Enter Video Name");
		    	String s2=sc.next();
		    	v.doreturn(s2);
		    	break;
		    case 4:
		    	System.out.println("Enter Video Name");
		    	String s1=sc.next();
		    	System.out.println("Enter Rating");
		    	int n1=sc.nextInt();
		    	v.addrating(n1, s1);
		    	break;
		    case 5:
		    	v.listinventory();
		    	break;
		    case 6:
		    	System.out.println("System Exit Successfully");
		    	return ;
		    }
		}
		

	}

}

