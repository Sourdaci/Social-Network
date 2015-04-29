import java.util.ArrayList;
import java.util.Calendar;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost
{
    // instance variables - replace the example below with your own
    private String username;
    private String filename;
    private String caption;
    private long timeStamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class MessagePost
     */
    public PhotoPost(String author, String filename, String caption){
        username = author;
        this.caption = caption;
        this.filename = filename;
        comments = new ArrayList<String>();
        Calendar partida = Calendar.getInstance();
        partida.set(1970, 1, 1, 0, 0, 0);
        timeStamp = System.currentTimeMillis() - partida.getTime().getTime();
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
    
    public String getCaption(){
        return caption;
    }
    
    public long getTimeStamp(){
        return timeStamp;
    }
    
    public void display(){
        System.out.println(username + " ha publicado:");
        System.out.println("\t" + filename);
        System.out.println(caption);
        System.out.println("Hace " + timeString(timeStamp));
        System.out.println("Le gusta a " + likes + " personas");
    }
    
    private String timeString(long time){
        Calendar partida = Calendar.getInstance();
        partida.set(1970, 1, 1, 0, 0, 0);
        long current = (System.currentTimeMillis() / 1000) - (partida.getTime().getTime() / 1000);
        long resultado = current - (time / 1000);
        long minutos = resultado / 60;
        resultado = resultado % 60;
        return minutos + " minuto(s) y " + resultado + " segundos";
    }
}
