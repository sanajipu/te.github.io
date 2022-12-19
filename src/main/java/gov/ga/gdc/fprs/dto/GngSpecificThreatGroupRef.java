package gov.ga.gdc.fprs.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class GngSpecificThreatGroupRef {

	private Integer specificThreatGroupCd;
	private String specificThreatGroupDesc;
	private String is_obsolete;
	private Integer gngClassCd;
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
