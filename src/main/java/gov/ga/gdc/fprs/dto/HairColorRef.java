package gov.ga.gdc.fprs.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HairColorRef {

	private Integer hairCode;
	private String hairDesc;
	private String gcicMappingCd;

	public Integer getHairCode() {
		return hairCode;
	}


	public void setHairCode(Integer hairCode) {
		this.hairCode = hairCode;
	}


	public String getHairDesc() {
		return hairDesc;
	}


	public void setHairDesc(String hairDesc) {
		this.hairDesc = hairDesc;
	}


	public String getGcicMappingCd() {
		return gcicMappingCd;
	}


	public void setGcicMappingCd(String gcicMappingCd) {
		this.gcicMappingCd = gcicMappingCd;
	}
	
	
	
}