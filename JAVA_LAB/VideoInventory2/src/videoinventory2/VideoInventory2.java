/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoinventory2;

import java.util.ArrayList;
import java.util.Arrays;
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
        int stock;
        
        Video(){
            title="";
            rating=8;
            totalRatings=80;
            ratedBy=10;
            checkedOut=false;
            stock=50;
        }
        
        public void beingCheckedOut(){
            checkedOut=true;
            stock--;
        }
        
        public void beingReturned(){
            checkedOut=false;
            stock++;
        }
        

}

class VideoStore extends Video
{   
    ArrayList<Video> al=new ArrayList<>();
    Video arr[]=new Video[20];
    //Arrays.fill(arr,);
    int i=0;
    

    void addVideo(String str){
        
        int flag=0;
        for(int j=0;j<arr.length;j++){
            Video v=arr[j];
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
            arr[i++]=v;
        }
        
        
    }
    
    void checkOut(String str){
        int flag=0;
        for(int j=0;j<arr.length;j++){
            Video v=arr[j];
            if(v.title.equals(str)){
                v.beingCheckedOut();
                //al.remove(j);
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Movie not found");
    }
    
    void returnVideo(String str){
//        int flag=0;
//        for(int j=0;j<arr.length;j++){
//            Video v=arr[j];
//            if(v.title.equals(str)){
//                v.beingReturned();
//                flag=1;
//                break;
//            }
//        }
//        if(flag==0)
//            System.out.println("Movie not found");
        
        addVideo(str);
    }
    
    void receiveRating(String str, double rate){
        int flag=0;
        for(int j=0;j<arr.length;j++){
            Video v=arr[j];
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
        for(int j=0;j<i;j++){
            Video v=arr[j];
            System.out.println((j+1)+" Movie: "+v.title);
            System.out.format("  Rating: %.2f",v.rating);
            System.out.println("\n---------------------------");
        }
    }
    
    
}

public class VideoInventory2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VideoStore v=new VideoStore();

        v.addVideo("Avengers");
        //v.receiveRating("Avengers", 9);
        
        v.addVideo("Joker");
        //v.receiveRating("Joker", 10);
        
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
                    System.out.println("Enter rating:");
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
    
