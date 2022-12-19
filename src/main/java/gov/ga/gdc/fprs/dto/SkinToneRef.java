package gov.ga.gdc.fprs.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SkinToneRef {
	
	private Integer skinToneCd;
	private String skinToneDesc;
	private String isObsolete;

	public Integer getSkinToneCd() {
		return skinToneCd;
	}

	public void setSkinToneCd(Integer skinToneCd) {
		this.skinToneCd = skinToneCd;
	}

	public String getSkinToneDesc() {
		return skinToneDesc;
	}

	public void setSkinToneDesc(String skinToneDesc) {
		this.skinToneDesc = skinToneDesc;
	}

	public String getIsObsolete() {
		return isObsolete;
	}

	public void setIsObsolete(String isObsolete) {
		this.isObsolete = isObsolete;
	}

	
}