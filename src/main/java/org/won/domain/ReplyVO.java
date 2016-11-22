package org.won.domain;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class ReplyVO {

	private int rno, bno;
	private String userid, rcontent;
	private Date replyregdate;

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getRcontent() {
		return rcontent;
	}

	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}

	public Date getRepleyregdate() {
		return replyregdate;
	}

	public void setRepleyregdate(Date repleyregdate) {
		this.replyregdate = repleyregdate;
	}

	@Override
	public String toString() {
		return "ReplyVO [rno=" + rno + ", bno=" + bno + ", userid=" + userid + ", rcontent=" + rcontent
				+ ", repleyregdate=" + replyregdate + "]";
	}

}