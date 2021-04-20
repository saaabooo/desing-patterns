public class PageFollower implements Observer {

	private String name;
	private Observable page;
	
	public PageFollower(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.page == null) {
			System.out.println(this.getName() + " doesn't follow any page.");
			return;
		}
		String latestNotification = this.page.getUpdate();
		System.out.println(this.getName() + " received a new notification: " + latestNotification);
	}

	@Override
	public void setPage(Observable page) {
		this.page = page;
	}

	public String getName() {
		return name;
	}

}
