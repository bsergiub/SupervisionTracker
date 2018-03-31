
package supervisiontracker;

import java.util.Date;
import java.util.prefs.Preferences;

/**
 *
 * @author Sergiu Borlovan <sergiuborlovan.co.uk>
 */
public class SupervisionCore {
    
    private Date date;
    private String notes;
    
    Preferences systemPref = Preferences.userRoot();  
    
    public SupervisionCore(){
        this.notes = "";
}
    
    public Date getDate(){
        return date;
    }
    
    public void setDate(Date s){
        date = s;
    }
    
    
    public String getSupervisionNotes(String s){
        String result = systemPref.get(s, notes);
        return result;
    }
    
    public void setSupervisionNotes(String s1, String s2){
        systemPref.put(s1, s2);
    }
    
    
}
