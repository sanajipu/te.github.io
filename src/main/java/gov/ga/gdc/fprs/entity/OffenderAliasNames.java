package gov.ga.gdc.fprs.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "offender_alias_names")
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OffenderAliasNames {
	
	@Column(name = "uno#", nullable = false)
	private String uno;
	
	@Id
	@Column(name = "seq_no", unique = true, nullable = false)
	private Integer seqNo;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "suffix")
	private String suffix;
	
	@Column(name = "entered_by", nullable = false)
	private String enteredBy;
	
	@Column(name = "entered_dt", nullable = false)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy@hh:mm aa", timezone = "US/Eastern")	
	private Date enteredDt;
	
	@Column(name = "status")
	private String status;

	@Column(name = "soundex_key")
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
