package gov.ga.gdc.fprs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "religion_ref")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReligionRef {
	
	
	@Id
	@Column(name = "RELIGION_CD")
	private Integer religionCd;
	
	@Column(name = "RELIGION_DESC")
	private String religionDesc;
	
	@Column(name = "IS_OBSOLETE")
	private String isObsolete;

	public Integer getReligionCd() {
		return religionCd;
	}

	public void setReligionCd(Integer religionCd) {
		this.religionCd = religionCd;
	}

	public String getReligionDesc() {
		return religionDesc;
	}

	public void setReligionDesc(String religionDesc) {
		this.religionDesc = religionDesc;
	}

	public String getIsObsolete() {
		return isObsolete;
	}

	public void setIsObsolete(String isObsolete) {
		this.isObsolete = isObsolete;
	}
	
	
	
}