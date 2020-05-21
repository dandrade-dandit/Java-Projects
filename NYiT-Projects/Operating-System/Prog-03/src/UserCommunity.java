import java.util.Date;
import java.util.concurrent.TimeUnit;

public class UserCommunity {
    private String userName;
    private Date dateCreated;

    // Constructor
    public UserCommunity(String userName) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1/60);
        this.userName = userName;
        this.dateCreated = new Date();
    }

    // Print person data
    public void printUser(){
        System.out.println(
                "Username: " + userName
                        + 	"\nUser Created in    : " + dateCreated
                        +   "\n---------------------------------------------------------------"); //ft.format(dateCreated)
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
