package domain.entities;

public class Comment implements HasSentiment, IsCommentable, IsChronological{

	private String body;

	public Comment(String body) {
		super();
		setBody(body);
	}

	public Comment() {
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
		return "Comment [body=" + body + "]";
	}
	
}
