package org.gongreung.kh;

public class qna {
	private int qno;
	private String plevel;
	private int parno;
	private String title;
	private String content;
	private String resdate;
	private int visited;
	private String aid;
	
	public qna() {}
	public qna(int qno, String plevel, int parno, String title, String content, String resdate, int visited,
			String aid) {
		super();
		this.qno = qno;
		this.plevel = plevel;
		this.parno = parno;
		this.title = title;
		this.content = content;
		this.resdate = resdate;
		this.visited = visited;
		this.aid = aid;
	}
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getPlevel() {
		return plevel;
	}
	public void setPlevel(String plevel) {
		this.plevel = plevel;
	}
	public int getParno() {
		return parno;
	}
	public void setParno(int parno) {
		this.parno = parno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	@Override
	public String toString() {
		return "qna [qno=" + qno + ", plevel=" + plevel + ", parno=" + parno + ", title=" + title + ", content="
				+ content + ", resdate=" + resdate + ", visited=" + visited + ", aid=" + aid + "]";
	}
	
	
	
}
