package gov.ga.gdc.fprs.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MilitaryBranchRef {
	
	private Integer militaryBranchCd;
	private String militaryBranchDesc;
	private String isObsolete;

	public Integer getMilitaryBranchCd() {
		return militaryBranchCd;
	}

	public void setMilitaryBranchCd(Integer militaryBranchCd) {
		this.militaryBranchCd = militaryBranchCd;
	}

	public String getMilitaryBranchDesc() {
		return militaryBranchDesc;
	}

	public void setMilitaryBranchDesc(String militaryBranchDesc) {
		this.militaryBranchDesc = militaryBranchDesc;
	}

	public String getIsObsolete() {
		return isObsolete;
	}

	public void setIsObsolete(String isObsolete) {
		this.isObsolete = isObsolete;
	}
	
	
}