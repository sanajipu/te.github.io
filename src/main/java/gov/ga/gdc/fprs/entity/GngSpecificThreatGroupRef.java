package gov.ga.gdc.fprs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "gng_specific_threat_group_ref")
@JsonInclude(JsonInclude.Include.NON_NULL)

public class GngSpecificThreatGroupRef {


	@Id
	@Column(name = "SPECIFIC_THREAT_GROUP_CD", nullable = false)
	private Integer specificThreatGroupCd;
	
	@Column(name = "SPECIFIC_THREAT_GROUP_DESC", nullable = false)
	private String specificThreatGroupDesc;
	
	@Column(name = "IS_OBSOLETE")
	private String is_obsolete;
	
	@Column(name = "GNG_CLASS_CD")
	private Integer gngClassCd;
	
	@Column(name = "GNG_NATION_CD")
	private Integer gngNationCd;

	public Integer getSpecificThreatGroupCd() {
		return specificThreatGroupCd;
	}

	public void setSpecificThreatGroupCd(Integer specificThreatGroupCd) {
		this.specificThreatGroupCd = specificThreatGroupCd;
	}

	public String getSpecificThreatGroupDesc() {
		return specificThreatGroupDesc;
	}

	public void setSpecificThreatGroupDesc(String specificThreatGroupDesc) {
		this.specificThreatGroupDesc = specificThreatGroupDesc;
	}

	public String getIs_obsolete() {
		return is_obsolete;
	}

	public void setIs_obsolete(String is_obsolete) {
		this.is_obsolete = is_obsolete;
	}

	public Integer getGngClassCd() {
		return gngClassCd;
	}

	public void setGngClassCd(Integer gngClassCd) {
		this.gngClassCd = gngClassCd;
	}

	public Integer getGngNationCd() {
		return gngNationCd;
	}

	public void setGngNationCd(Integer gngNationCd) {
		this.gngNationCd = gngNationCd;
	}
	
	
	
}
