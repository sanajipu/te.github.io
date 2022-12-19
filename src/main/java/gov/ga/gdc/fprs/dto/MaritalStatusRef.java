package gov.ga.gdc.fprs.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MaritalStatusRef {
	
	private String maritalCode;
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
