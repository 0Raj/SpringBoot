package question1;

public class SocialMediaContext {
	private SocialMedia socialMeadia;

	public void setSocialmediaStrategy(SocialMedia socialMeadia) {	
		this.socialMeadia = socialMeadia;
	}

	public void connect(String string) {
		
		this.socialMeadia.connect(string);
	}

}
