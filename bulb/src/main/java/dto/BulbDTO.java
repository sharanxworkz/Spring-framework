package dto;

public class BulbDTO {
	private String name;

	private String email;

	public BulbDTO() {
		// TODO Auto-generated constructor stub
	}

	public BulbDTO(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "BulbDTO [name=" + name + ", email=" + email + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
