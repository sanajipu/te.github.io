package gov.ga.gdc.fprs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gov.ga.gdc.fprs.entity.OffenderAliasFbi;


@Repository
public interface OffenderAliasFbiRepository extends JpaRepository<OffenderAliasFbi, String>{

	public List<OffenderAliasFbi> findByUno(String unoNo);
}
