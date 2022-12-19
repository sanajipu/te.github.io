package gov.ga.gdc.fprs.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EducationRef {
	
	private Integer educCode;
	private String educDesc;
	private String isObsolete;

	public Integer getEducCode() {
		return educCode;
	}

	public void setEducCode(Integer educCode) {
		this.educCode = educCode;
	}

	public String getEducDesc() {
		return educDesc;
	}

	public void setEducDesc(String educDesc) {
		this.educDesc = educDesc;
	}

	public String getIsObsolete() {
		return isObsolete;
	}

	public void setIsObsolete(String isObsolete) {
		this.isObsolete = isObsolete;
	}
	
	
}
