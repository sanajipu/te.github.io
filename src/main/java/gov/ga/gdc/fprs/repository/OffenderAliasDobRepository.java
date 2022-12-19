package gov.ga.gdc.fprs.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import gov.ga.gdc.fprs.dto.OffenderParoleData;
import gov.ga.gdc.fprs.entity.OffenderAliasDob;

@Repository
public interface OffenderAliasDobRepository extends JpaRepository<OffenderAliasDob, String> {

	public List<OffenderAliasDob> findByUno(String unoNo);
	

	
	@Query(
			value = 
					" SELECT  " +
							"     PAR_INM_CASE_NO as parInmCaeNo,   " +
							"     PAR_DATE_PAR_PLAN_VERIF as parDateParPlanVerif, " +
							"     PAR_EMPLOYER_NAME as parEmployerName,  " +
							"     PAR_EMPLOYER_PHONE as parEmployerPhone, " +
							"     PAR_EMPLOYER_ADD_STREET as parEmployerAddStreet,  " +
							"     PAR_EMPLOYER_ADD_CITY as parEmployerAddCity, " +
							"     PAR_EMPLOYER_ADD_STATE as parEmployerAddState,  " +
							"     PAR_EMPLOYER_ADD_COUNTY as parEmployerAddCounty, " +
							"     PAR_EMPLOYER_ADD_ZIP as parEmployerAddZip,  " +
							"     PAR_EMPLR_ADD_ZIP_SUFF as parEmplrAddZipSuff " +
							" FROM " +
							"     OTIS_OWNER.PAR " +
							" WHERE  " +
							"     PAR_INM_CASE_NO IN (SELECT TO_NUMBER(CASE_NO) FROM OFFENDERS WHERE UNO# = ?1) " +
							" ORDER BY  " +
							"     PAR_DATE_PAR_PLAN_VERIF DESC ", nativeQuery = true
			)
			Collection<OffenderParoleData> getOffenderParoleData(String unoNo);
}
