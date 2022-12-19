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
public class OffenderAliasSsn {
	private String uno;
	private Date ssn;
	private String enteredBy;
	private Date enteredDt;
	private String status;
	
	public String getUno() {
		return uno;
	}
	public void setUno(String uno) {
		this.uno = uno;
	}
	public Date getSsn() {
		return ssn;
	}
	public void setSsn(Date ssn) {
		this.ssn = ssn;
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
	
	
}