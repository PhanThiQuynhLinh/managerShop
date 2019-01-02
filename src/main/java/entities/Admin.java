package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "admin")
public class Admin {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer memberId;
	
	@Column(name = "memberLogin")
    private String memberLogin;
	
	@Column(name = "memberPass")
    private String memberPass;
	
	@Column(name = "memberMail")
    private String memberMail;

	public Admin() {
	}

	public Admin(Integer memberId, String memberLogin, String memberPass, String memberMail) {
		super();
		this.memberId = memberId;
		this.memberLogin = memberLogin;
		this.memberPass = memberPass;
		this.memberMail = memberMail;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getMemberLogin() {
		return memberLogin;
	}

	public void setMemberLogin(String memberLogin) {
		this.memberLogin = memberLogin;
	}

	public String getMemberPass() {
		return memberPass;
	}

	public void setMemberPass(String memberPass) {
		this.memberPass = memberPass;
	}

	public String getMemberMail() {
		return memberMail;
	}

	public void setMemberMail(String memberMail) {
		this.memberMail = memberMail;
	}
	
	
}
