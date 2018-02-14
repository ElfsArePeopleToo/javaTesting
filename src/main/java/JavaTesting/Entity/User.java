package JavaTesting.Entity;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private int userId;

    @Column(name = "name", nullable = false)
    private String userName;

    @Column(name = "age")
    private int age;

    @Column(name = "country")
    private String country;


    public User(int userId, String userName, int age, String country) {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
        this.country = country;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

