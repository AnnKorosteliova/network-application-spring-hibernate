package domain.entities;

public class Post implements HasAuthor, HasSentiment, IsCommentable, IsChronological{

	private String body;
	private String title;
	private String subject;
	
	public Post(String body, String title, String subject) {
		super();
		setBody(body);
		setTitle(title);
		setSubject(subject);
	}
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void finalize() throws Throwable{
		System.out.println("The objects is deleted by the Garbage Collector");
	}
	
	@Override
	public String toString() {
		return "Post [title=" + title + ", subject=" + subject + ", body=" + body + "]";
	}
	
	
}
