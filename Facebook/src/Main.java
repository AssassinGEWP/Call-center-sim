import java.util.*;
public class Main {
    public static void main(String[] args){
        ArrayList<User> allUsers  = new ArrayList<>();
        ArrayList<Post> allPosts = new ArrayList<>();
        ArrayList<pagesAndGroups> allGroupsAndPages = new ArrayList<>();
        Scanner console=new Scanner(System.in);
        User mainUser;

        System.out.println("Welcome to Facebook! Would you like to 1:Login, 2:Register");
        char n = console.next().charAt(0);

        switch (n){
            case 1 :
                System.out.print("Username: ");
                String username = console.nextLine();
                System.out.print("Password: ");
                String password = console.nextLine();
                boolean foundLogin = false;
                for(int i = 0; i < allUsers.size(); i++){
                    if(allUsers.get(i).authorize(username, password)){
                        mainUser = allUsers.get(i);
                        foundLogin = true;
                    }
                }
                if(foundLogin==false){
                    System.out.print("Incorrect Info");
                }
            case 2:
                User user = new User();
                allUsers.add(user);
        }

    }
}
