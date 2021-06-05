import java.util.HashMap;
import java.util.Set;

public class HashMapPractice{

    public static void main(String[] args) {
        
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Red Swan", "'Like a fallen angel somethin somethin'");
        trackList.put("Unravel", "'Ya this is lyrics to the songs'");
        trackList.put("Rise", "'Now nobody can't stop me no way'");
        trackList.put("Misery Business", "'I am in the business of misery let's take it from the top'");

        System.out.println("Pulling track from title 'Red Swan'...");
        String redSwan = trackList.get("Red Swan");
        System.out.println(redSwan);

        System.out.println("\nDisplaying all tracks...");
        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key + ": " + trackList.get(key));
        }

    }

}