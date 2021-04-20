public class Main {

	
	
	public static void main(String[] args) {


		Page page = new Page();
		
		Observer follower1 = new PageFollower("Follower 01");
		Observer follower2 = new PageFollower("Follower 02");
		Observer follower3 = new PageFollower("Follower 03");
		
		page.follow(follower1);
		page.follow(follower2);
		page.follow(follower3);
		
		
		page.setNotification("This page has a new post.");
		
		page.setNotification("This page has a new story.");
		

	}

}
