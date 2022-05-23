
import java.util.*;
public class Search {
    protected ArrayList<Object> objectsToReturn = new ArrayList<>();
    public Search(ArrayList<User> allUsers, ArrayList<pagesAndGroups> allPagesAndGroups, String nameToSearch){
        for(int i = 0; i!=10;i++){
            if(allUsers.get(i).getName().equals(nameToSearch)){
                objectsToReturn.add(allUsers.get(i));
            }
            if(allPagesAndGroups.get(i).getName().equals(nameToSearch)){
                objectsToReturn.add(allPagesAndGroups.get(i));
            }
        }
    }
    public ArrayList<Object> getSearch(ArrayList<User> allUsers, ArrayList<pagesAndGroups> allPagesAndGroups, String nameToSearch){
        Search search = new Search(allUsers, allPagesAndGroups, nameToSearch);
        return search.objectsToReturn;
    }
}
