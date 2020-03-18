package kr.kosmo.jobkorea.manageA.model;

public class ExsubjectMgtDtlModel {
	
	//게시판 글번호
	private int row_num;
	//
	private int no;
	//과정명
	private String title;
	//구분-재시험
	private String re;
	//대상자수
	private String cnt;
	//로그인 아이디
	private String loginID;
	//시험점수
	private String mainscore;
	//재시험점수
	private String rescore;
	//출석
	private String attend;
	//시퀀스
	private String seq;
	//통과여부 메세지
	private String passmsg;
	
	
	
	
	public String getPassmsg() {
		return passmsg;
	}
	public void setPassmsg(String passmsg) {
		this.passmsg = passmsg;
	}
	public String getMainscore() {
		return mainscore;
	}
	public void setMainscore(String mainscore) {
		this.mainscore = mainscore;
	}
	public String getRescore() {
		return rescore;
	}
	public void setRescore(String rescore) {
		this.rescore = rescore;
	}
	public String getCnt() {
		return cnt;
	}
	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	public String getAttend() {
		return attend;
	}
	public void setAttend(String attend) {
		this.attend = attend;
	}
	public int getRow_num() {
		return row_num;
	}
	public void setRow_num(int row_num) {
		this.row_num = row_num;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRe() {
		return re;
	}
	public void setRe(String re) {
		this.re = re;
	}
	public String getloginID() {
		return loginID;
	}
	public void setloginID(String loginID) {
		this.loginID = loginID;
	}
	
	
	
	
	
	
}
