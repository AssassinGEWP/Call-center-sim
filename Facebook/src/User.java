import java.util.*;

public class User {
    protected String firstName;
    protected String secondName;
    protected int userID;
    protected String username;
    protected String password;
    protected String workExpreience;
    protected String educationLevel;
    protected String Gender;
    protected Date dateCreated;

    protected ArrayList<User> friendList = new ArrayList<User>();
    protected ArrayList<User> followingList = new ArrayList<User>();
    protected ArrayList<User> followerList = new ArrayList<User>();
    protected ArrayList<pagesAndGroups> pagesAndGroupsJoined = new ArrayList<pagesAndGroups>();
    protected static ArrayList<User> allUsers = new ArrayList<User>();
    protected ArrayList<Post> allUserPosts = new ArrayList<>();

    public User() {
        Scanner console= new Scanner(System.in);
        System.out.print("First Name: ");
        this.firstName = console.next();
        System.out.print("Second Name: ");
        this.secondName = console.next();
        System.out.print("Password (Don't Worry! Your Password (Will Hopefully) be Encrypted!): ");
        this.password = console.next();
        System.out.println("Work Experience: ");
        this.workExpreience=console.nextLine();
        System.out.print("Education Level: ");
        this.educationLevel = console.nextLine();
        System.out.print("Gender (1:Prefer Not To Say, 2:Male, 3:Female");
        char tempGender = console.next().charAt(0);
        switch(tempGender){
            case 1:
                this.Gender="Prefer not to say";
                break;
            case 2:
                this.Gender="Male";
                break;
            case 3:
                this.Gender="Female";
                break;
            default:
                System.out.println("Please Enter a Correct Number!");
        }
        this.userID = (int) (Math.random() * 1000000000);
        dateCreated = new Date();

    }

    public ArrayList<Post> getAllUserPosts() {
        return allUserPosts;
    }

    public ArrayList<pagesAndGroups> getPagesAndGroupsJoined() {
        return pagesAndGroupsJoined;
    }

    public ArrayList<User> getFollowingList() {
        return followingList;
    }

    public ArrayList<User> getFriendList() {
        return friendList;
    }

    public String getName() {
        return firstName + " " + secondName;
    }

    public String getUsername() {
        return username;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getWorkExpreience() {
        return workExpreience;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String username, String password, String newFirstName) {
        if (authorize(username, password)) {
            this.firstName = newFirstName;
        }
    }

    public void setSecondName(String username, String password, String newSecondName) {
        if (authorize(username, password)) {
            this.secondName = newSecondName;
        }
    }

    public void setUsername(String username, String password, String newUsername) {
        if (authorize(username, password)) {
            this.username = newUsername;
        }
    }
    public void setPassword(String username, String password, String newPassword){
        if(authorize(username, password)){
            this.password = newPassword;
        }
    }
    public void setWorkExpreience(String username, String password, String newWorkExperience) {
        if (authorize(username, password)) {
            this.workExpreience = newWorkExperience;
        }
    }
    public void setEducationLevel(String username, String password, String newEducationLevel){
        if (authorize(username, password)){
            this.educationLevel = newEducationLevel;
        }
    }
    public boolean authorize(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            return true;
        }
        else{
            return false;
        }
    }
    public boolean sendMessage(User this, User reciever, String Content){
        new message(this, reciever, Content);
        return true;
    }

}
