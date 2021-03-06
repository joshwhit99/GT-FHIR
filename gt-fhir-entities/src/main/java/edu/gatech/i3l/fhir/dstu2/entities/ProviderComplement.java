/**
 * 
 */
package edu.gatech.i3l.fhir.dstu2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import ca.uhn.fhir.model.dstu2.resource.Practitioner;

/**
 * @author Myung Choi
 *
 */
@Entity
@Table(name="f_provider")
@PrimaryKeyJoinColumn(name="provider_id")
public class ProviderComplement extends Provider {
	
	@Column(name="name")
	private String name;
	
	@Column(name="year_of_birth")
	private Integer yearOfBirth;
	
	@Column(name="month_of_birth")
	private Integer monthOfBirth;
	
	@Column(name="day_of_birth")
	private Integer dayOfBirth;
	
	@ManyToOne
	@JoinColumn(name="gender_concept_id")
	private Concept genderConcept;
	
	public ProviderComplement() {
		super();
	}
	
	public ProviderComplement(Long id, String npi, String dea, Concept specialtyConcept, 
			CareSite careSite, String providerSourceValue, String specialtySourceValue,
			String name, Integer yearOfBirth, Integer monthOfBirth, Integer dayOfBirth, Concept genderConcept) {
		super(id, npi, dea, specialtyConcept, careSite, providerSourceValue, specialtySourceValue);
		
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.dayOfBirth = dayOfBirth;
		this.genderConcept = genderConcept;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getYearOfBirth() {
		return yearOfBirth;
	}
	
	public void setYearOfBirth(Integer yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	public Integer getMonthOfBirth() {
		return monthOfBirth;
	}
	
	public void setMonthOfBirth(Integer monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}
	
	public Integer getDayOfBirth() {
		return dayOfBirth;
	}
	
	public void setDayOfBirth(Integer dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	
	public Concept getGenderConcept() {
		return genderConcept;
	}
	
	public void setGenderConcept(Concept genderConcept) {
		this.genderConcept = genderConcept;
	}
	
	@Override
	public Practitioner getRelatedResource() {
		Practitioner practitioner = super.getRelatedResource();
		
		// Set extended parameters here
		
		return practitioner;
	}

}
