package gov.ga.gdc.fprs.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RaceRef {
	
	private Integer raceCode;
	private String raceDesc;
	private String gcicMappingCd;

	public Integer getRaceCode() {
		return raceCode;
	}


	public void setRaceCode(Integer raceCode) {
		this.raceCode = raceCode;
	}


	public String getRaceDesc() {
		return raceDesc;
	}


	public void setRaceDesc(String raceDesc) {
		this.raceDesc = raceDesc;
	}


	public String getGcicMappingCd() {
		return gcicMappingCd;
	}


	public void setGcicMappingCd(String gcicMappingCd) {
		this.gcicMappingCd = gcicMappingCd;
	}
	
	
}
