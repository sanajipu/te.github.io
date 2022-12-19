package gov.ga.gdc.fprs.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReligionRef {
	
	private Integer religionCd;
	private String religionDesc;
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