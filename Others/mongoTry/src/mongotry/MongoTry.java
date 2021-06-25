/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongotry;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.*;
import org.bson.Document;
import java.util.*;

/**
 *
 * @author Uttam
 */
public class MongoTry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MongoClient client=new MongoClient("localhost",27017);
        System.out.println("connected...");
        MongoDatabase db=client.getDatabase("uttam");
        System.out.println("database uttam selected...");
//        db.createCollection("java");
//        System.out.println("collection created...");
        MongoCollection<Document> collection=db.getCollection("java");
//        
//        Document doc=new Document("title","mongodb").append("likes",1000);
//        collection.insertOne(doc);
//        System.out.println("one document inserted...");
//        
//        doc=new Document("title","mongo").append("likes",5000);
//        List list=new ArrayList<>();
//        list.add(doc);
//        doc=new Document("title","mon").append("likes",9000);
//        list.add(doc);
//        
//        collection.insertMany(list);
//        System.out.println("multiple document inserted...");
        
        collection.updateOne(Filters.eq("title","mongo"),Updates.set("title","mmmmm"));
        

        FindIterable<Document> iter=collection.find(Filters.eq("likes",1000));
        
        Iterator it=iter.iterator();
        while(it.hasNext()){
            Object ob=it.next();
            System.out.println(ob);
            
        }
        
        
        
               
        
        
        
    }
    
}
