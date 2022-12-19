package gov.ga.gdc.fprs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gov.ga.gdc.fprs.entity.OffenderDemographics;

public interface OffenderDemographicsRepository extends JpaRepository<OffenderDemographics, String>{

	public OffenderDemographics findByUno(String unoNo);
}
