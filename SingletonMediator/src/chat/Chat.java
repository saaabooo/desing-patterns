package chat;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {

	private List<User> users;
	Singleton connection = null;
	
	public Chat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, User user) {
		
		if(message.equals("addBot")) {
			activateBot();
		}
		
		if(message.equals("cat")) {
			if(connection != null) {
				connection.postMessage("cat is a bannned word.");
				removeUser(user);
			}
			
		}

		for(User chatUser: this.users) {
			// Skip the one who sends the message
			if(chatUser != user) {
				chatUser.receive(message);
			}
		}

	}

	private void activateBot() {
		connection = Singleton.getInstance();
		System.out.println("*addBot entered the chat*");
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

	@Override
	public void removeUser(User user) {
		this.users.remove(user);
		System.out.println("*" + user.name + " has been removed from the chat*");
	}

}
