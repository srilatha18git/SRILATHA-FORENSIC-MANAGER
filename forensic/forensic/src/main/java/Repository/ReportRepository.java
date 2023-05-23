package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Report;

public interface ReportRepository extends JpaRepository<Report, Long> {

}
