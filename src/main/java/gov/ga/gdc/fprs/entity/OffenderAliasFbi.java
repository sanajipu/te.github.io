package gov.ga.gdc.fprs.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;


@Entity
@Table(name = "offender_alias_fbi")
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OffenderAliasFbi {
	
	@Id
	@Column(name = "uno#", nullable = false)
	private String uno;
	
	@Column(name = "fbi", nullable = false)
	private String fbi;
	
	@Column(name = "entered_by", nullable = false)
	private String enteredBy;
	
	@Column(name = "entered_date", nullable = false)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy@hh:mm aa", timezone = "US/Eastern")	
	private Date enteredDate;
	
	@Column(name = "status")
	private String status;

}
