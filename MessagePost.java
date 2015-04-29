import java.util.ArrayList;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost
{
    // instance variables - replace the example below with your own
    private String username;
    private String message;
    private long timeStamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text){
        username = author;
        message = text;
        comments = new ArrayList<String>();
        timeStamp = System.currentTimeMillis();
        likes = 0;
    }
    
    public void addComment(String text){
        comments.add(text);
    }
    
    public void like(){
        likes++;
    }
    
    public void unlike(){
        if(likes > 0){
            likes--;
        }
    }
}
