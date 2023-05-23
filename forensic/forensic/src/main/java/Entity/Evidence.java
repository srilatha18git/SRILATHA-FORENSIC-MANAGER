package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "evidence")
public class Evidence {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    
    @ManyToOne
    @JoinColumn(name = "case_id", nullable = false)
    private Case caseId;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Case getCaseId() {
		return caseId;
	}


	public void setCaseId(Case caseId) {
		this.caseId = caseId;
	}


	public Evidence(Long id, String name, String description, Case caseId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.caseId = caseId;
	}

    

}
