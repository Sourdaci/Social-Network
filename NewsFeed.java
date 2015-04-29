import java.util.ArrayList;
/**
 * Write a description of class NewsFeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed
{
    // instance variables - replace the example below with your own
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos;

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        messages = new ArrayList<MessagePost>();
        photos = new ArrayList<PhotoPost>();
    }

    public void addMessagePost(MessagePost message){
        messages.add(message);
    }
    
    public void addPhotoPost(PhotoPost photo){
        photos.add(photo);
    }
    
    public void show(){
        if(messages.size() > 0){
            for (MessagePost message: messages){
                message.display();
            }
        }else{
            System.out.println("No hay mensajes en tu muro");
        }
        if(photos.size() > 0){
            for (PhotoPost message: photos){
                message.display();
            }
        }else{
            System.out.println("No hay mensajes con foto en tu muro");
        }
    }
}
