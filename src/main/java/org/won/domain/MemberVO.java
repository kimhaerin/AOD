package org.won.domain;

public class MemberVO {
	private String userid, userpw, uname, uphoto;

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

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUphoto() {
		return uphoto;
	}

	public void setUphoto(String uphoto) {
		this.uphoto = uphoto;
	}

	@Override
	public String toString() {
		return "MmeberVO [userid=" + userid + ", userpw=" + userpw + ", uname=" + uname + ", uphoto=" + uphoto + "]";
	}

}
