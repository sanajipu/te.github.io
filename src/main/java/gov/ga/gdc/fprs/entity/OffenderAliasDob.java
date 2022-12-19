package gov.ga.gdc.fprs.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

//import lombok.AllArgsConstructor;
////import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;




@Entity
@Table(name = "offender_alias_dob")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OffenderAliasDob {
	
	@Id
	@Column(name = "uno#", nullable = false)
	private String uno;
	
	@Column(name = "dob", nullable = false)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy@hh:mm aa", timezone = "US/Eastern")
	private Date dob;
	
	@Column(name = "entered_by", nullable = false)
	private String enteredBy;
	
	@Column(name = "entered_dt", nullable = false)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy@hh:mm aa", timezone = "US/Eastern")	
	private Date enteredDt;
	
	@Column(name = "status")
	private String status;

	public String getUno() {
		return uno;
	}

	public void setUno(String uno) {
		this.uno = uno;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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





