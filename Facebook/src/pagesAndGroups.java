import java.util.*;
public abstract class pagesAndGroups {
    protected String name;
    protected String description;
    protected ArrayList<User> userList = new ArrayList<>();
    protected static ArrayList<pagesAndGroups> allPagesAndGroups = new ArrayList<pagesAndGroups>();
    protected ArrayList<Post> allPosts = new ArrayList<>();
        /*
        This Defines which status the page is, whether it is a "For Fun" page, a "Business/Company" page,
        or a "Generic/Uncatogrized" page
        */
    protected char status;

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
}
class page extends pagesAndGroups{
    public page (String pageName, String pageDescription, char pageStatus){
        super.name = pageName;
        super.description = pageDescription;
        allPagesAndGroups.add(this);
        super.status = pageStatus;
    }
    public String getStatus(){
        String statusValue;
        switch(status){
            case 1:
                statusValue = "For Fun";
                break;
            case 2:
                statusValue = "Business or Organization";
                break;
            case 3:
                statusValue = "Generic or Uncategorized";
                break;
            default:
                statusValue = "N/A";
        }
        return statusValue;
    }

}
class group extends pagesAndGroups{
    public group (String groupName, String groupDescription, char groupStatus){
        super.name = groupName;
        super.description = groupDescription;
        allPagesAndGroups.add(this);
        super.status = groupStatus;
    }
    public String getStatus(){
        String statusValue;
        switch(status){
            case 1:
                statusValue = "Public";
                break;
            case 2:
                statusValue = "Private";
                break;
            case 3:
                statusValue = "Secret";
                break;
            default:
                statusValue = "N/A";
        }
        return statusValue;
    }

}