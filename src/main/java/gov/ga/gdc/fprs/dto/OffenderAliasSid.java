package gov.ga.gdc.fprs.dto;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OffenderAliasSid {
	private String uno;
	private Date sid;
	private String enteredBy;
	private Date enteredDate;
	private String status;
	
	public String getUno() {
		return uno;
	}
	public void setUno(String uno) {
		this.uno = uno;
	}
	public Date getSid() {
		return sid;
	}
	public void setSid(Date sid) {
		this.sid = sid;
	}
	public String getEnteredBy() {
		return enteredBy;
	}
	public void setEnteredBy(String enteredBy) {
		this.enteredBy = enteredBy;
	}
	
	public Date getEnteredDate() {
		return enteredDate;
	}
	public void setEnteredDate(Date enteredDate) {
		this.enteredDate = enteredDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}