package Service;

import org.springframework.beans.factory.annotation.Autowired;

import Entity.Report;
import Repository.ReportRepository;

public class ReportService {

	private final ReportRepository reportRepository;

    @Autowired
    public ReportService(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    public Report saveReport(Report report) {
        // Additional validation or business logic before saving
        return reportRepository.save(report);
    }

    public void deleteReportById(Long reportId) {
        // Additional logic before deleting
        reportRepository.deleteById(reportId);
    }
	
}
