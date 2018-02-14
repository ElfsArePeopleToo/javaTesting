package JavaTesting.Entity;
import javax.persistence.*;

@Entity
@Table(name = "TestResult")
public class TestResult {

    @Column(name = "userId")
    private int userId;

    @Column(name = "partOneResult")
    private int partOneResult;

    public TestResult(int userId, int partOneResult) {
        this.userId = userId;
        this.partOneResult = partOneResult;
    }

    public int getPartOneResult() {
        return partOneResult;
    }

    public void setPartOneResult(int partOneResult) {
        this.partOneResult = partOneResult;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
