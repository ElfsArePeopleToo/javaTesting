package JavaTesting.Entity;
import javax.persistence.*;

@Entity
@Table(name = "Security")
public class Security {

    @Column(name = "userId")
    private int userId;

    @Column(name = "login", unique = true, nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    public Security(int userId, String login, String password) {
        this.userId = userId;
        this.login = login;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
