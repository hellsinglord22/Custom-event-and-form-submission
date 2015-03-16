import java.util.EventObject;

/**
 * @Author: Scorpion
 * @Date: 3/14/2015.
 */
public class FormEvent extends EventObject {

    /*Attributes*/
    private String username , email;


    /*Constructor*/
    public FormEvent(Object source) {
        super(source);
    }
    public FormEvent(Object source, String username, String email) {
        super(source);
        this.username = username;
        this.email = email;
    }

    /*Getter and setters*/
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }


}
