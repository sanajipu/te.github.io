package gov.ga.gdc.fprs.dto;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlienClassRef {
	
	
	private Integer alienClassCd;
	private String alienClassDesc;
	private String isObsolete;

	public Integer getAlienClassCd() {
		return alienClassCd;
	}

	public void setAlienClassCd(Integer alienClassCd) {
		this.alienClassCd = alienClassCd;
	}

	public String getAlienClassDesc() {
		return alienClassDesc;
	}

	public void setAlienClassDesc(String alienClassDesc) {
		this.alienClassDesc = alienClassDesc;
	}

	public String getIsObsolete() {
		return isObsolete;
	}

	public void setIsObsolete(String isObsolete) {
		this.isObsolete = isObsolete;
	}
	
	
}

