package gov.ga.gdc.fprs.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OffenderEmploymentStatusRef {
	
	private Integer employabilityStatusCd;
	private String employabilityStatusDesc;
	private String isObsolete;

	public Integer getEmployabilityStatusCd() {
		return employabilityStatusCd;
	}

	public void setEmployabilityStatusCd(Integer employabilityStatusCd) {
		this.employabilityStatusCd = employabilityStatusCd;
	}

	public String getEmployabilityStatusDesc() {
		return employabilityStatusDesc;
	}

	public void setEmployabilityStatusDesc(String employabilityStatusDesc) {
		this.employabilityStatusDesc = employabilityStatusDesc;
	}

	public String getIsObsolete() {
		return isObsolete;
	}

	public void setIsObsolete(String isObsolete) {
		this.isObsolete = isObsolete;
	}

	
	
}
