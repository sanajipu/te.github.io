package gov.ga.gdc.fprs.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EyeColorRef {

	private Integer eyeCode;
	private String eyeDesc;
	private String gcicMappingCd;


	public Integer getEyeCode() {
		return eyeCode;
	}


	public void setEyeCode(Integer eyeCode) {
		this.eyeCode = eyeCode;
	}


	public String getEyeDesc() {
		return eyeDesc;
	}


	public void setEyeDesc(String eyeDesc) {
		this.eyeDesc = eyeDesc;
	}


	public String getGcicMappingCd() {
		return gcicMappingCd;
	}


	public void setGcicMappingCd(String gcicMappingCd) {
		this.gcicMappingCd = gcicMappingCd;
	}
	
	
	
}
