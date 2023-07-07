package kh.lclass.openapi.model.service;

public class EvInfoVo {
//	private String resultCode;
//	private String resultMsg;
//	private String numOFRows;
//	private String pageNo;
	private String totalCount;
	//
	
	private String addr;
	private Integer chargeTp;
	private String cpId;
	private String cpNm;
	private String cpStat;
	private String csId;
	private String csNm;
	private String lat;
	private String longi;
	private String statUpdateDatetime;
	@Override
	public String toString() {
		return "EvInfoVo [totalCount=" + totalCount + ", addr=" + addr + ", chargeTp=" + chargeTp + ", cpId=" + cpId
				+ ", cpNm=" + cpNm + ", cpStat=" + cpStat + ", csId=" + csId + ", csNm=" + csNm + ", lat=" + lat
				+ ", longi=" + longi + ", statUpdateDatetime=" + statUpdateDatetime + "]";
	}
	public String getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Integer getChargeTp() {
		return chargeTp;
	}
	public void setChargeTp(Integer chargeTp) {
		this.chargeTp = chargeTp;
	}
	public String getCpId() {
		return cpId;
	}
	public void setCpId(String cpId) {
		this.cpId = cpId;
	}
	public String getCpNm() {
		return cpNm;
	}
	public void setCpNm(String cpNm) {
		this.cpNm = cpNm;
	}
	public String getCpStat() {
		return cpStat;
	}
	public void setCpStat(String cpStat) {
		this.cpStat = cpStat;
	}
	public String getCsId() {
		return csId;
	}
	public void setCsId(String csId) {
		this.csId = csId;
	}
	public String getCsNm() {
		return csNm;
	}
	public void setCsNm(String csNm) {
		this.csNm = csNm;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLongi() {
		return longi;
	}
	public void setLongi(String longi) {
		this.longi = longi;
	}
	public String getStatUpdateDatetime() {
		return statUpdateDatetime;
	}
	public void setStatUpdateDatetime(String statUpdateDatetime) {
		this.statUpdateDatetime = statUpdateDatetime;
	}
	
}
