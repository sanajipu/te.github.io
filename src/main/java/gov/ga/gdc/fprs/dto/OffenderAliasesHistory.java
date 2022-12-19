package gov.ga.gdc.fprs.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;


//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OffenderAliasesHistory {
	
	private List<gov.ga.gdc.fprs.entity.OffenderAliasDob> offenderAliasDobList;
	private List<gov.ga.gdc.fprs.entity.OffenderAliasSid> offenderAliasSidList;
	private List<gov.ga.gdc.fprs.entity.OffenderAliasFbi> offenderAliasFbiList;
	private List<gov.ga.gdc.fprs.entity.OffenderAliasSsn> offenderAliasSsnList;
	private List<gov.ga.gdc.fprs.entity.OffenderAliasNames> offenderAliasNamesList;
	public List<gov.ga.gdc.fprs.entity.OffenderAliasDob> getOffenderAliasDobList() {
		return offenderAliasDobList;
	}
	public void setOffenderAliasDobList(List<gov.ga.gdc.fprs.entity.OffenderAliasDob> offenderAliasDobList) {
		this.offenderAliasDobList = offenderAliasDobList;
	}
	public List<gov.ga.gdc.fprs.entity.OffenderAliasSid> getOffenderAliasSidList() {
		return offenderAliasSidList;
	}
	public void setOffenderAliasSidList(List<gov.ga.gdc.fprs.entity.OffenderAliasSid> offenderAliasSidList) {
		this.offenderAliasSidList = offenderAliasSidList;
	}
	public List<gov.ga.gdc.fprs.entity.OffenderAliasFbi> getOffenderAliasFbiList() {
		return offenderAliasFbiList;
	}
	public void setOffenderAliasFbiList(List<gov.ga.gdc.fprs.entity.OffenderAliasFbi> offenderAliasFbiList) {
		this.offenderAliasFbiList = offenderAliasFbiList;
	}
	public List<gov.ga.gdc.fprs.entity.OffenderAliasSsn> getOffenderAliasSsnList() {
		return offenderAliasSsnList;
	}
	public void setOffenderAliasSsnList(List<gov.ga.gdc.fprs.entity.OffenderAliasSsn> offenderAliasSsnList) {
		this.offenderAliasSsnList = offenderAliasSsnList;
	}
	public List<gov.ga.gdc.fprs.entity.OffenderAliasNames> getOffenderAliasNamesList() {
		return offenderAliasNamesList;
	}
	public void setOffenderAliasNamesList(List<gov.ga.gdc.fprs.entity.OffenderAliasNames> offenderAliasNamesList) {
		this.offenderAliasNamesList = offenderAliasNamesList;
	}
	
	
	
//	public List<OffenderAliasDob> getOffenderAliasDobList() {
//		return offenderAliasDobList;
//	}
//	public void setOffenderAliasDobList(List<OffenderAliasDob> offenderAliasDobList) {
//		this.offenderAliasDobList = offenderAliasDobList;
//	}
//	public List<OffenderAliasSid> getOffenderAliasSidList() {
//		return offenderAliasSidList;
//	}
//	public void setOffenderAliasSidList(List<OffenderAliasSid> offenderAliasSidList) {
//		this.offenderAliasSidList = offenderAliasSidList;
//	}
//	public List<OffenderAliasFbi> getOffenderAliasFbiList() {
//		return offenderAliasFbiList;
//	}
//	public void setOffenderAliasFbiList(List<OffenderAliasFbi> offenderAliasFbiList) {
//		this.offenderAliasFbiList = offenderAliasFbiList;
//	}
//	public List<OffenderAliasSsn> getOffenderAliasSsnList() {
//		return offenderAliasSsnList;
//	}
//	public void setOffenderAliasSsnList(List<OffenderAliasSsn> offenderAliasSsnList) {
//		this.offenderAliasSsnList = offenderAliasSsnList;
//	}
//	public List<OffenderAliasNames> getOffenderAliasNamesList() {
//		return offenderAliasNamesList;
//	}
//	public void setOffenderAliasNamesList(List<OffenderAliasNames> offenderAliasNamesList) {
//		this.offenderAliasNamesList = offenderAliasNamesList;
//	}
	
	
	
	
}
