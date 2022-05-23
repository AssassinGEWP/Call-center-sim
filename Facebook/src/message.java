import java.util.*;

public class message {
    protected User Sender;
    protected User Receiver;
    protected Date dateReceived;
    protected char readReceipts = 0; //Is 1 when the message is read, is 0 when the message is unread
    protected String messageContent;
    protected static ArrayList<message> allMessages = new ArrayList<>();


    public message(User sender, User receiver, String messageContent) {
        this.Sender = sender;
        this.Receiver = receiver;
        dateReceived = new Date();
        this.messageContent = messageContent;
        allMessages.add(this);
    }
    public String getMessage(User user, String Username, String Password){
        if(user.authorize(Username, Password) && (user.equals(Sender)||user.equals(Receiver))){
            return messageContent;
        }
        else{
            return "Unauthorized";
        }
    }
    public boolean setMessage(User sender, String Username, String Password, String newMessage){
        if(sender.authorize(Username, Password) && sender.equals(Sender)){
            this.messageContent = newMessage;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean readMessage(User user, String Username, String Password){
        if(user.authorize(Username, Password) && (user.equals(Sender)||user.equals(Receiver))){
            readReceipts = 1;
            return true;
        }
        else{
            return false;
        }
    }
    public void constructChat(User receiver, User sender, String username, String password){
        if(receiver.authorize(username, password) || sender.authorize(username, password) ){
            for(int i = 0; i!=allMessages.size(); i++){
                if(allMessages.get(i).Sender.equals(sender)||allMessages.get(i).Receiver.equals(receiver)){
                    System.out.println(Sender.firstName + Sender.secondName +" :\n" + allMessages.get(i).messageContent+"\n"+allMessages.get(i).dateReceived +"\n");
                }
            }
        }

    }
}
