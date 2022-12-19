package gov.ga.gdc.fprs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;


@Entity
@Table(name = "alien_class_ref")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlienClassRef {
	
	
	@Id
	@Column(name = "ALIEN_CLASS_CD")
	private Integer alienClassCd;
	
	@Column(name = "ALIEN_CLASS_DESC")
	private String alienClassDesc;
	
	@Column(name = "IS_OBSOLETE")
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

