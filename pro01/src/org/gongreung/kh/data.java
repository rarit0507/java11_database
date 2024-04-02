package org.gongreung.kh;

public class data {
	private int dno;
	private String title;
	private String content;
	private String datafile;
	private String resdate;
	private int visited;
	
	public data() {}
	public data(int dno, String title, String content, String datafile, String resdate, int visited) {
		super();
		this.dno = dno;
		this.title = title;
		this.content = content;
		this.datafile = datafile;
		this.resdate = resdate;
		this.visited = visited;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
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
	public String getDatafile() {
		return datafile;
	}
	public void setDatafile(String datafile) {
		this.datafile = datafile;
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
	@Override
	public String toString() {
		return "data [dno=" + dno + ", title=" + title + ", content=" + content + ", datafile=" + datafile
				+ ", resdate=" + resdate + ", visited=" + visited + "]";
	}
	
	
}
