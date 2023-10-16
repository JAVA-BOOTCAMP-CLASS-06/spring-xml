package beans;

public class MessageBean {
	
	private String message;
	
	public MessageBean() {
		this("");
	}

	public MessageBean(String msg) {
		this.setMessage(msg);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return message;
	}
}
