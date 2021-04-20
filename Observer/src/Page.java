import java.util.ArrayList;
import java.util.List;

public class Page implements Observable {

	private List<Observer> followers;
	private String page;
	
	public Page() {
		this.followers = new ArrayList<>();
	}

	@Override
	public void follow(Observer follower) {
		this.followers.add(follower);
		follower.setPage(this);
	}

	@Override
	public void unfollow(Observer follower) {
		this.followers.remove(follower);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.followers) {
			observer.update();
		}
	}
	
	public void setNotification(String page) {
		this.page = page;
		this.notifyObservers();
	}


	@Override
	public String getUpdate() {
		return this.page;
	}

}
