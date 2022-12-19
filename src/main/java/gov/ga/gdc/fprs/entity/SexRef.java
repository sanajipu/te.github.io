package gov.ga.gdc.fprs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;


@Entity
@Table(name = "SEX_REF")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SexRef {
	
	@Id
	@Column(name = "sex_code")
	private String sexCode;
	
	@Column(name = "sex_desc")
	private String sexDesc;

	

	public String getSexCode() {
		return sexCode;
	}

	public void setSexCode(String sexCode) {
		this.sexCode = sexCode;
	}

	public String getSexDesc() {
		return sexDesc;
	}

	public void setSexDesc(String sexDesc) {
		this.sexDesc = sexDesc;
	}
	
	
}