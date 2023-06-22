package chatProgram;

public class Main {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        chatRoom.addUser("홍길동");
        chatRoom.addUser("홍길동1");
        chatRoom.addUser("홍길동2");
        chatRoom.addUser("홍길동1");

        User hong = new User("홍길동");
        User hong1= new User("홍길동1");
        User hong2 = new User("홍길동2");

        chatRoom.broadcastMessage(hong, "안녕하세요1");
        chatRoom.broadcastMessage(hong1, "안녕하세요1");
        chatRoom.broadcastMessage(hong, "안녕하세요2");
        chatRoom.broadcastMessage(hong1, "안녕하세요2");
        chatRoom.broadcastMessage(hong1, "안녕하세요3");

        chatRoom.printRecentMessages("홍길동");  // 안녕하세요2
        chatRoom.printRecentMessages("홍길동1"); // 안녕하세요3
        chatRoom.printRecentMessages("홍길동2"); // 최근에 보내신 메시지를 찾을 수 없습니다.


    }
}
