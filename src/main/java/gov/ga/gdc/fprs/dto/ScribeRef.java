package gov.ga.gdc.fprs.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScribeRef {
	
	private String scribeCode;
	private String scribeDesc;

	public String getScribeCode() {
		return scribeCode;
	}

	public void setScribeCode(String scribeCode) {
		this.scribeCode = scribeCode;
	}

	public String getScribeDesc() {
		return scribeDesc;
	}

	public void setScribeDesc(String scribeDesc) {
		this.scribeDesc = scribeDesc;
	}
	
	
	
}
