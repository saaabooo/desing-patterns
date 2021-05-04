package chat;

public class MediatorMain {

	
	public static void main(String[] args) {
		
		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Milen");
		User user2 = new ChatUser(chat, "Nikolai");
		User user3 = new ChatUser(chat, "Shaban");
		
		user2.send("cat");
		user1.send("addBot");
		user3.send("cat");

	}

}
