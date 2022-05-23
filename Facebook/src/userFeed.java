import java.lang.reflect.Array;
import java.util.*;

public class userFeed{
  protected User mainUser;
  protected ArrayList<Post> postsToShow = new ArrayList<Post>();
  protected ArrayList<User> usersToGetPostsFrom = new ArrayList<User>();
  protected ArrayList<pagesAndGroups> pagesAndGroupsToGetPostsFrom = new ArrayList<>();
  protected ArrayList<pagesAndGroups> recoPagesAndGroups = new ArrayList<pagesAndGroups>();

    public userFeed(User mainUser) {
      this.usersToGetPostsFrom = mainUser.getFriendList();
      this.pagesAndGroupsToGetPostsFrom = mainUser.getPagesAndGroupsJoined();

        for (int i = 0; i < usersToGetPostsFrom.size(); i++){
          for(int j = 0; j !=3; j++){
            postsToShow.add(usersToGetPostsFrom.get(i).allUserPosts.get(j));
            postsToShow.add(pagesAndGroupsToGetPostsFrom.get(i).allPosts.get(j));
          }
        }
    }
    public ArrayList<Post> retrieveFeed(User mainUser) {
      userFeed feed = new userFeed(mainUser);
      return feed.postsToShow;
    }
    public void printFeed(User mainUser){
      userFeed feed = new userFeed(mainUser);
      for(int k = 0; k != feed.postsToShow.size(); k++){
        feed.postsToShow.get(k).toString();
      }
    }
}
