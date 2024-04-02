package org.gongreung.kh;

public class guide {
	private String pname;
	private String ptype;
	private String paddr;
	private String ptel;
	private String pgps;
	private String pcoment;
	private String premark;
	
	public guide() {}
	public guide(String pname, String ptype, String paddr, String ptel, String pgps, String pcoment, String premark) {
		super();
		this.pname = pname;
		this.ptype = ptype;
		this.paddr = paddr;
		this.ptel = ptel;
		this.pgps = pgps;
		this.pcoment = pcoment;
		this.premark = premark;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public String getPaddr() {
		return paddr;
	}
	public void setPaddr(String paddr) {
		this.paddr = paddr;
	}
	public String getPtel() {
		return ptel;
	}
	public void setPtel(String ptel) {
		this.ptel = ptel;
	}
	public String getPgps() {
		return pgps;
	}
	public void setPgps(String pgps) {
		this.pgps = pgps;
	}
	public String getPcoment() {
		return pcoment;
	}
	public void setPcoment(String pcoment) {
		this.pcoment = pcoment;
	}
	public String getPremark() {
		return premark;
	}
	public void setPremark(String premark) {
		this.premark = premark;
	}
	@Override
	public String toString() {
		return "guide [pname=" + pname + ", ptype=" + ptype + ", paddr=" + paddr + ", ptel=" + ptel + ", pgps=" + pgps
				+ ", pcoment=" + pcoment + ", premark=" + premark + "]";
	}
	
	
}
