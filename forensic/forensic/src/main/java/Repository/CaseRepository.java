package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Case;

public interface CaseRepository extends JpaRepository<Case, Long> {

}
