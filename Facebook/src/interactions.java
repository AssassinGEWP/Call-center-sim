import java.util.*;

public abstract class interactions{
    protected int interactionCount=0;

    public void Interaction(User mainUser, Post post){
        Scanner console = new Scanner(System.in);
        System.out.println("What do you want to do, 1:React, 2:Comment");
        char i = console.next().charAt(0);

        switch(i){
            case 1:
                react react = new react(mainUser, post);
                post.postInteractions.add(react);

            case 2:
                comment comment = new comment(mainUser, post);
                post.postInteractions.add(comment);
                break;

            default:
                System.out.println("Please enter a functional number");

        }


    }

    }
class react extends interactions{


    static protected ArrayList<String> reactedLike = new ArrayList<String>();
    static protected ArrayList<String> reactedLove = new ArrayList<String>();
    static protected ArrayList<String> reactedCare = new ArrayList<String>();
    static protected ArrayList<String> reactedLaugh = new ArrayList<String>();
    static protected ArrayList<String> reactedWow = new ArrayList<String>();
    static protected ArrayList<String> reactedSad = new ArrayList<String>();
    static protected ArrayList<String> reactedAngry = new ArrayList<String>();


    public react(User user, Post Post){
        Scanner console = new Scanner(System.in);
        System.out.println("Which React you want to use ? 1:Like, 2:Love, 3:Care, 4:Laugh, 5:Wow, 6:Sad, 7:Angry");
        char whichReact = console.next().charAt(0);
        switch (whichReact) {
            case 1:
                reactedLike.add(user.getName());
                Post.postInteractions.add(this);
                ++super.interactionCount;
                break;
            case 2:
                reactedLove.add(user.getName());
                Post.postInteractions.add(this);
                ++super.interactionCount;
                break;
            case 3:
                reactedCare.add(user.getName());
                Post.postInteractions.add(this);
                ++super.interactionCount;
                break;
            case 4:
                reactedLaugh.add(user.getName());
                Post.postInteractions.add(this);
                ++super.interactionCount;
                break;
            case 5:
                reactedWow.add(user.getName());
                Post.postInteractions.add(this);
                ++super.interactionCount;
                break;
            case 6:
                reactedSad.add(user.getName());
                Post.postInteractions.add(this);
                ++super.interactionCount;
                break;
            case 7:
                reactedAngry.add(user.getName());
                Post.postInteractions.add(this);
                ++super.interactionCount;
                break;
        }
    }
    public react(char whichReact, User user, comment Comment){
        switch (whichReact) {
            case 1:
                reactedLike.add(user.getName());
                Comment.addInteraction(this);
                ++super.interactionCount;

                break;
            case 2:
                reactedLove.add(user.getName());
                Comment.addInteraction(this);
                ++super.interactionCount;
                break;
            case 3:
                reactedCare.add(user.getName());
                Comment.addInteraction(this);
                ++super.interactionCount;
                break;
            case 4:
                reactedLaugh.add(user.getName());
                Comment.addInteraction(this);
                ++super.interactionCount;
                break;
            case 5:
                reactedWow.add(user.getName());
                Comment.addInteraction(this);
                ++super.interactionCount;
                break;
            case 6:
                reactedSad.add(user.getName());
                Comment.addInteraction(this);
                ++super.interactionCount;
                break;
            case 7:
                reactedAngry.add(user.getName());
                Comment.addInteraction(this);
                ++super.interactionCount;
                break;
        }
    }
    public int getReactCountTotal(){
        int total = reactedLike.size() + reactedLaugh.size() + reactedAngry.size() + reactedLove.size() + reactedWow.size() + reactedSad.size() + reactedCare.size();
        return total;
    }
    public int getReactCountEach(char whichReact){
        int t = 0;
        switch(whichReact) {
            case 1:
                t = reactedLike.size();
                break;
            case 2:
                t = reactedLove.size();
                break;
            case 3:
                t = reactedCare.size();
                break;
            case 4:
                t = reactedLaugh.size();
                break;
            case 5:
                t = reactedWow.size();
                break;
            case 6:
                t = reactedSad.size();
                break;
            case 7:
                t = reactedAngry.size();
                break;
        }
        return t;
    }
}

class comment extends interactions{
    protected String commentContent;
    protected User originalCommenter;
    protected ArrayList<interactions> reactionsAndReplys = new ArrayList<interactions>();

    public comment(User originalCommenter, Post post ){
        Scanner console = new Scanner(System.in);

        System.out.print("What Do you want to comment : ");
        commentContent = console.nextLine();
        this.originalCommenter = originalCommenter;
    }
    public String getCommentContent(){
        return commentContent;
    }
    public User getOriginalCommenter(){
        return originalCommenter;
    }
    public ArrayList<interactions> getInteractions(){
        return reactionsAndReplys;
    }
    public void addInteraction(comment Reply){
        reactionsAndReplys.add(Reply);
    }
    public void addInteraction(react Reaction){
        reactionsAndReplys.add(Reaction);
    }

}


