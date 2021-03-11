package domain.entities;

public class Sentiment implements HasAuthor, IsChronological{

	private String body;

	public Sentiment(String body) {
		super();
		setBody(body);
	}

	public Sentiment() {
		super();
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	public void finalize() throws Throwable{
		System.out.println("The objects is deleted by the Garbage Collector");
	}

	@Override
	public String toString() {
		return "Sentiment [body=" + body + "]";
	}
}
