package Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cases")
public class Case {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private String caseNumber;

	    @Column(nullable = false)
	    private String description;

	    
	    @OneToMany(mappedBy = "case")
	    private List<Evidence> evidences;


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getCaseNumber() {
			return caseNumber;
		}


		public void setCaseNumber(String caseNumber) {
			this.caseNumber = caseNumber;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public List<Evidence> getEvidences() {
			return evidences;
		}


		public void setEvidences(List<Evidence> evidences) {
			this.evidences = evidences;
		}


		public Case(Long id, String caseNumber, String description, List<Evidence> evidences) {
			super();
			this.id = id;
			this.caseNumber = caseNumber;
			this.description = description;
			this.evidences = evidences;
		}
	    
	    
}
