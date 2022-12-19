package gov.ga.gdc.fprs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;


@Entity
@Table(name = "military_branch_ref")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MilitaryBranchRef {
	
	
	@Id
	@Column(name = "MILITARY_BRANCH_CD")
	private Integer militaryBranchCd;
	
	@Column(name = "MILITARY_BRANCH_DESC")
	private String militaryBranchDesc;
	
	@Column(name = "IS_OBSOLETE")
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