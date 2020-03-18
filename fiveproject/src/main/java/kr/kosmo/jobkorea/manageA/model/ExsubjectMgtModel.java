package kr.kosmo.jobkorea.manageA.model;

public class ExsubjectMgtModel {
	// 게시판 글 번호
	private int row_num;
	//
	private int no;
	//과정명
	private String title;
	//시험명
	private String testname;
	//구분-재시험
	private String re;
	//구분-본시험
	private String main;
	//강의 시작일
	private String startdate;
	//상태
	private String status;
	//대상자수
	private String cnt;
	//응시자수
	private String accnt;
	//미응시자수
	private String nocnt;
	//로그인 아이디
	private String loginId;
	//시퀀스
	private String seq;
	
	
	
	
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getAccnt() {
		return accnt;
	}
	public void setAccnt(String accnt) {
		this.accnt = accnt;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getTestname() {
		return testname;
	}
	public void setTestname(String testname) {
		this.testname = testname;
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
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCnt() {
		return cnt;
	}
	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
	public String getNocnt() {
		return nocnt;
	}
	public void setNocnt(String nocnt) {
		this.nocnt = nocnt;
	}
	
	
	
}
