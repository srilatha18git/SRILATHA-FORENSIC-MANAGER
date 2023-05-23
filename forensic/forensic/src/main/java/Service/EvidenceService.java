package Service;

import org.springframework.beans.factory.annotation.Autowired;

import Entity.Evidence;
import Repository.EvidenceRepository;

public class EvidenceService {

	private final EvidenceRepository evidenceRepository;

    @Autowired
    public EvidenceService(EvidenceRepository evidenceRepository) {
        this.evidenceRepository = evidenceRepository;
    }

    public Evidence saveEvidence(Evidence evidence) {
        // Additional validation or business logic before saving
        return evidenceRepository.save(evidence);
    }

    public void deleteEvidenceById(Long evidenceId) {
        // Additional logic before deleting
        evidenceRepository.deleteById(evidenceId);
    }

    // Add more methods as per your requirements
}
	

