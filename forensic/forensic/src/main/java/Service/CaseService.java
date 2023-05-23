package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Entity.Case;
import Repository.CaseRepository;

public class CaseService {

	 private final CaseRepository caseRepository;

	    @Autowired
	    public CaseService(CaseRepository caseRepository) {
	        this.caseRepository = caseRepository;
	    }

	    public Case saveCase(Case forensicCase) {
	        // Additional validation or business logic before saving
	        return caseRepository.save(forensicCase);
	    }

	    public void deleteCaseById(Long caseId) {
	        // Additional logic before deleting
	        caseRepository.deleteById(caseId);
	    }

		public List<Case> getAllCases() {
			// TODO Auto-generated method stub
			return null;
		}
	
}
