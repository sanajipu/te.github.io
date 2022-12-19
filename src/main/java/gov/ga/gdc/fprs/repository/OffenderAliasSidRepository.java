package gov.ga.gdc.fprs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gov.ga.gdc.fprs.entity.OffenderAliasSid;

@Repository
public interface OffenderAliasSidRepository extends JpaRepository<OffenderAliasSid, String>{

	public List<OffenderAliasSid> findByUno(String unoNo);
}
