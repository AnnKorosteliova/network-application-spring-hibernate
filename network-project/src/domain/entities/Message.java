package domain.entities;

public class Message implements HasAuthor, HasSentiment, IsChronological{

	private String body;

	public Message(String body) {
		super();
		setBody(body);
	}

	public Message() {
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
		return "Message [body=" + body + "]";
	}
	
}
