package gov.ga.gdc.fprs.dto;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OffenderAliasNames {

	private String uno;
	private Integer seqNo;
	private String lastName;
	private String firstName;
	private String middleName;
	private String suffix;
	private String enteredBy;
	private Date enteredDt;
	private String status;
	private String soundexKey;
	
	public String getUno() {
		return uno;
	}
	public void setUno(String uno) {
		this.uno = uno;
	}
	public Integer getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getEnteredBy() {
		return enteredBy;
	}
	public void setEnteredBy(String enteredBy) {
		this.enteredBy = enteredBy;
	}
	public Date getEnteredDt() {
		return enteredDt;
	}
	public void setEnteredDt(Date enteredDt) {
		this.enteredDt = enteredDt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSoundexKey() {
		return soundexKey;
	}
	public void setSoundexKey(String soundexKey) {
		this.soundexKey = soundexKey;
	}
	
	
}





