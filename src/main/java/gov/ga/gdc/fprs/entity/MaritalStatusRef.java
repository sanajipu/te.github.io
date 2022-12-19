package gov.ga.gdc.fprs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "marital_status_ref")
@JsonInclude(JsonInclude.Include.NON_NULL)

public class MaritalStatusRef {
	
	@Id
	@Column(name = "MARITAL_CODE", nullable = false)
	private String maritalCode;
	
	@Column(name = "MARITAL_DESC")
	private String maritalDesc;

	public String getMaritalCode() {
		return maritalCode;
	}

	public void setMaritalCode(String maritalCode) {
		this.maritalCode = maritalCode;
	}

	public String getMaritalDesc() {
		return maritalDesc;
	}

	public void setMaritalDesc(String maritalDesc) {
		this.maritalDesc = maritalDesc;
	}
	
	
	

}
