package chatProgram;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChatRoom {
    private List<User> users = new ArrayList<>();
    private List<Message> messages = new ArrayList<>();

    public void addUser(String userName) {
        boolean flag = false;
        if (users.size() == 0) {
            User newuser = new User(userName);
            users.add(newuser);
            System.out.println(userName + "님이 채팅방에 들어오셨습니다.");
            return;
        }

        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getUsername().equals(userName)){
                flag = true;
            }
        }

        if (flag == false) {
            User newuser = new User(userName);
            users.add(newuser);
            System.out.println(userName + "님이 채팅방에 들어오셨습니다.");
        } else {
            System.out.println("같은 이름의 사용자가 있습니다. 이름을 변경해 주세요.");
        }
    }

    public void broadcastMessage(User user, String message) {
        System.out.println(user.getUsername() + ": " + message);
        Message newMessage = new Message(user.getUsername(), message,new Date());
        messages.add(newMessage);
    }

    public void printRecentMessages(String userName) {
        int index = -1;
        for(int i = messages.size(); i>0; i--) {
            if (messages.get(i-1).getSender().equals(userName)) {
                index = i-1;
                break;
            }
        }
        if (index == -1) {
            System.out.println("최근에 보내신 메시지를 찾을 수 없습니다.");
        }else{
            System.out.println("보낸 시각: "+ messages.get(index).getTimestamp());
            System.out.println("메시지 내용: ");
            System.out.println(messages.get(index).getSender() + ": " + messages.get(index).getContent());
        }
    }

}
