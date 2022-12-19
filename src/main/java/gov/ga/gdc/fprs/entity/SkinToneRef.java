package gov.ga.gdc.fprs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;


@Entity
@Table(name = "skin_tone_ref")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SkinToneRef {
	
	
	@Id
	@Column(name = "SKIN_TONE_CD")
	private Integer skinToneCd;
	
	@Column(name = "SKIN_TONE_DESC")
	private String skinToneDesc;
	
	@Column(name = "IS_OBSOLETE")
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