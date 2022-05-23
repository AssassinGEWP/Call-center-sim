import java.util.*;
public class Post {
    protected User originalPoster;
    protected Date datePosted;
    protected String postTitle;
    protected String postContent;
    protected ArrayList<interactions> postInteractions= new ArrayList<interactions>();


    public Post(User originalPoser, String postTitle, String postContent){
        this.originalPoster = originalPoser;
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.datePosted = new Date();
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public User getOriginalPoster() {
        return originalPoster;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public String toString(User user){
        String str;
        str= getOriginalPoster().getName() +"\n" + getPostTitle() + "\n" + getPostContent() + "\n";

        return str;
    }


}
