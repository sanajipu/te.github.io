package gov.ga.gdc.fprs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;



@Entity
@Table(name = "RACE_REF")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RaceRef {
	
	@Id
	@Column(name = "race_code")
	private Integer raceCode;
	
	@Column(name = "race_desc")
	private String raceDesc;
	
	
	@Column(name = "gcic_mapping_cd")
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
