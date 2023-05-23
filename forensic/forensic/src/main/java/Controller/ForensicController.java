package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Entity.Case;
import Entity.Evidence;
import Entity.Report;
import Service.CaseService;
import Service.EvidenceService;
import Service.ReportService;

@RestController
public class ForensicController {

	private final CaseService caseService;
    private final EvidenceService evidenceService;
    private final ReportService reportService;

    @Autowired
    public ForensicController(CaseService caseService, EvidenceService evidenceService, ReportService reportService) {
        this.caseService = caseService;
        this.evidenceService = evidenceService;
        this.reportService = reportService;
    }

    // Endpoint for creating a new case
    @PostMapping("/cases")
    public ResponseEntity<Case> createCase(@RequestBody Case forensicCase) {
        Case createdCase = caseService.saveCase(forensicCase);
        return new ResponseEntity<>(createdCase, HttpStatus.CREATED);
    }

    // Endpoint for retrieving all cases
    @GetMapping("/cases")
    public ResponseEntity<List<Case>> getAllCases() {
        List<Case> cases = caseService.getAllCases();
        return new ResponseEntity<>(cases, HttpStatus.OK);
    }

    // Endpoint for creating new evidence for a case
    @PostMapping("/cases/{caseId}/evidence")
    public ResponseEntity<Evidence> createEvidence(@PathVariable Long caseId, @RequestBody Evidence evidence) {
        // Additional logic to associate the evidence with the specified case
        // You can fetch the case using caseService.findById(caseId) and update the evidence's case association accordingly

        Evidence createdEvidence = evidenceService.saveEvidence(evidence);
        return new ResponseEntity<>(createdEvidence, HttpStatus.CREATED);
    }

    // Endpoint for creating a new report for a case
    @PostMapping("/cases/{caseId}/reports")
    public ResponseEntity<Report> createReport(@PathVariable Long caseId, @RequestBody Report report) {
        // Additional logic to associate the report with the specified case
        // You can fetch the case using caseService.findById(caseId) and update the report's case association accordingly

        Report createdReport = reportService.saveReport(report);
        return new ResponseEntity<>(createdReport, HttpStatus.CREATED);
    }

	
}
