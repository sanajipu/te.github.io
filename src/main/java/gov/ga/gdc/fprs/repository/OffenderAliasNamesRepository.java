package gov.ga.gdc.fprs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gov.ga.gdc.fprs.entity.OffenderAliasNames;

@Repository
public interface OffenderAliasNamesRepository extends JpaRepository<OffenderAliasNames, String>{

	public List<OffenderAliasNames> findByUno(String unoNo);
}
