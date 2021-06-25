import java.util.ArrayList;
import java.util.Scanner;

class Video
{
	String title;
	boolean checkedOut;
	int rating;
        
        int totalRatings;
        boolean inStore;
        
        Video(){
            
        }
        
        public void beingCheckedOut(){
            checkedOut=false;
        }
        
        public void beingReturned(){
            inStore=true;
        }
        
        public void receivingRating(){
            Scanner s=new Scanner(System.in);
            rating=s.nextInt();
            
            totalRatings++;
        }
}

class VideoStore extends Video
{   
    ArrayList<Video> al=new ArrayList<>();
    ArrayList brr=new ArrayList();
    Video arr[]=new Video[5];
    int i=0;
    
    void addVideo(String str){
        Video v=new Video();
        v.title=str;
        al.add(v);
        
    }
    
    void checkOut(String str){
        for(int j=0;j<al.size();j++){
            Video v=al.get(i);
            if(v.title.equals(str)){
                v.inStore=false;
                break;
            }
        }
    }
    
    void returnVideo(String str){
        for(int j=0;j<al.size();j++){
            Video v=al.get(i);
            if(v.title.equals(str)){
                v.inStore=true;
                break;
            }
        }
    }
    
    void receiveRating(String str, int rate){
        for(int j=0;j<al.size();j++){
            Video v=al.get(i);
            if(v.title.equals(str)){
                v.totalRatings++;
                v.rating=(v.rating+rate)/totalRatings;
                break;
            }
        }
    }
    
    
}
public class video {

    public static void main(String[] args) {
	VideoStore ob=new VideoStore();
        ob.addVideo("fdklfj");
        //System.out.println(ob.al.get(0).title);
    }

}

