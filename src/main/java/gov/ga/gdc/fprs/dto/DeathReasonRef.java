package gov.ga.gdc.fprs.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeathReasonRef {
	
	private Integer alienStatusCd;
	private String alienStatusDesc;
	private String isObsolete;

	public Integer getAlienStatusCd() {
		return alienStatusCd;
	}

	public void setAlienStatusCd(Integer alienStatusCd) {
		this.alienStatusCd = alienStatusCd;
	}

	public String getAlienStatusDesc() {
		return alienStatusDesc;
	}

	public void setAlienStatusDesc(String alienStatusDesc) {
		this.alienStatusDesc = alienStatusDesc;
	}

	public String getIsObsolete() {
		return isObsolete;
	}

	public void setIsObsolete(String isObsolete) {
		this.isObsolete = isObsolete;
	}
	
	
}
