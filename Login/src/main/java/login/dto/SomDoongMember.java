package login.dto;

public class SomDoongMember {

	private String userid;
	private String userpw;
	private String username;
	private String userphone;
	private String useradd;
	private String useraddd;
	private String email;

	public SomDoongMember() {
		
	}

	@Override
	public String toString() {
		return "SomDoongMember [userid=" + userid + ", userpw=" + userpw + ", username=" + username + ", userphone="
				+ userphone + ", useradd=" + useradd + ", useraddd=" + useraddd + ", email=" + email + "]";
	}

	public SomDoongMember(String userid, String userpw, String username, String userphone, String useradd,
			String useraddd, String email) {
		super();
		this.userid = userid;
		this.userpw = userpw;
		this.username = username;
		this.userphone = userphone;
		this.useradd = useradd;
		this.useraddd = useraddd;
		this.email = email;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	public String getUseradd() {
		return useradd;
	}

	public void setUseradd(String useradd) {
		this.useradd = useradd;
	}

	public String getUseraddd() {
		return useraddd;
	}

	public void setUseraddd(String useraddd) {
		this.useraddd = useraddd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
