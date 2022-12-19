package gov.ga.gdc.fprs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;


@Entity
@Table(name = "death_reason_ref")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeathReasonRef {
	
	
	@Id
	@Column(name = "DEATH_REASON_CD")
	private Integer alienStatusCd;
	
	@Column(name = "DEATH_REASON_DESC")
	private String alienStatusDesc;
	
	@Column(name = "IS_OBSOLETE")
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
