import java.util.EventObject;

/**
 * @Author: Scorpion
 * @Date: 3/14/2015.
 */
public class FormEvent extends EventObject {

    /*Attributes*/
    private String username , email;

    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(Object source, String username, String email) {
        super(source);
        this.username = username;
        this.email = email;
    }
}
