package gov.ga.gdc.fprs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "offender_employment_status_ref")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OffenderEmploymentStatusRef {
	
	@Id
	@Column(name = "employability_status_cd", nullable = false)
	private Integer employabilityStatusCd;
	
	@Column(name = "employability_status_desc", nullable = false)
	private String employabilityStatusDesc;

	@Column(name = "is_obsolete", nullable = false)
	private String isObsolete;

	public Integer getEmployabilityStatusCd() {
		return employabilityStatusCd;
	}

	public void setEmployabilityStatusCd(Integer employabilityStatusCd) {
		this.employabilityStatusCd = employabilityStatusCd;
	}

	public String getEmployabilityStatusDesc() {
		return employabilityStatusDesc;
	}

	public void setEmployabilityStatusDesc(String employabilityStatusDesc) {
		this.employabilityStatusDesc = employabilityStatusDesc;
	}

	public String getIsObsolete() {
		return isObsolete;
	}

	public void setIsObsolete(String isObsolete) {
		this.isObsolete = isObsolete;
	}

	
	
}
