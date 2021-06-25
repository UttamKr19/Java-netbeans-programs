
package videoinventory;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Uttam
 */

class Video
{
	String title;
	boolean checkedOut;
	double rating;
        
        double totalRatings;
        int ratedBy;
        
        Video(){
            title="";
            rating=8;
            totalRatings=80;
            ratedBy=10;
            checkedOut=false;
        }
        
        public void beingCheckedOut(){
            checkedOut=true;
        }
        
        public void beingReturned(){
            checkedOut=false;
        }
        

}

class VideoStore extends Video
{   
    ArrayList<Video> al=new ArrayList<>();

    void addVideo(String str){
        
        int flag=0;
        for(int j=0;j<al.size();j++){
            Video v=al.get(j);
            if(v.title.equals(str)){
                flag=1;
                break;
            }
        }
        
        if(flag==1)
            System.out.println("Movie already in the inventory");
        else{
            Video v=new Video();
            v.title=str;
            al.add(v);
        }
        
        
    }
    
    void checkOut(String str){
        int flag=0;
        for(int j=0;j<al.size();j++){
            Video v=al.get(j);
            if(v.title.equals(str)){
                v.beingCheckedOut();
                al.remove(j);
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Movie not found");
    }
    
    void returnVideo(String str){
      addVideo(str);
    }
    
    void receiveRating(String str, double rate){
        int flag=0;
        for(int j=0;j<al.size();j++){
            Video v=al.get(j);
            if(v.title.equals(str)){
                v.totalRatings=v.totalRatings+rate;
                v.ratedBy++;
                v.rating=(double)v.totalRatings/v.ratedBy;
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Movie not found");
    }
    
    void listInventory(){
        System.out.println("\n===========Inventory============");
        for(int j=0;j<al.size();j++){
            Video v=al.get(j);
            System.out.println((j+1)+" Movie: "+v.title);
            System.out.format("  Rating: %.2f",v.rating);
            System.out.println("\n---------------------------");
        }
    }
    
    
}

public class VideoInventory {

    
    public static void main(String[] args) {
    
        VideoStore v=new VideoStore();

        v.addVideo("Avengers");
        v.receiveRating("Avengers", 8);
        
        v.addVideo("Joker");
        v.receiveRating("Joker", 10);
        
        v.listInventory();
       
        
        
        while(true){
            System.out.println("\n1.Add Video\n"+"2.Check Out\n"
                +"3.Return Video\n"+"4.Recieve Rating\n"
                +"5.List Inventory\n"+"6.Exit\n");
        
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            sc.nextLine();

            switch(n){

                case 1:
                    System.out.println("Enter the movie name:");
                    String name=sc.nextLine();
                    System.out.println("Enter rating:");
                    double r=sc.nextDouble();
                    sc.nextLine();

                    v.addVideo(name);
                    v.receiveRating(name, r);
                    break;

                case 2:
                    System.out.println("Enter the movie name:");
                    name=sc.nextLine();
                    v.checkOut(name);
                    break;

                case 3:
                    System.out.println("Enter the movie name:");
                    name=sc.nextLine();
                    v.returnVideo(name);
                    break;

                case 4:
                    System.out.println("Enter the movie name:");
                    name=sc.nextLine();
                    r=sc.nextDouble();
                    v.receiveRating(name, r);
                    break;

                case 5:
                    v.listInventory();
                    break;

                case 6:
                    return;

                default:
                    System.out.println("INVALID INPUT! Try again");
            }

        }
        
        	    
    }
    
}
