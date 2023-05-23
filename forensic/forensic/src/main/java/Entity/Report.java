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
@Table(name = "Reports")
public class Report {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private String title;

	    @Column(nullable = false, columnDefinition = "TEXT")
	    private String content;

	   
	    @ManyToOne
	    @JoinColumn(name = "case_id", nullable = false)
	    private Case caseId;
	
}
