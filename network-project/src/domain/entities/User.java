package domain.entities;

public class User implements IsCommentable{

	private String name;
	private String password;
	
	public User(String name, String password) {
		super();
		setName(name);
		setPassword(password);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void finalize() throws Throwable{
		System.out.println("The objects is deleted by the Garbage Collector");
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}
	
}
