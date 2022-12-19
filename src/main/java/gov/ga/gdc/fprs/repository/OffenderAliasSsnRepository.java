package gov.ga.gdc.fprs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gov.ga.gdc.fprs.entity.OffenderAliasSsn;

@Repository
public interface OffenderAliasSsnRepository extends JpaRepository<OffenderAliasSsn, String>{

	public List<OffenderAliasSsn> findByUno(String unoNo);

}
