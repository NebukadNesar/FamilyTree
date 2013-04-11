package models;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import play.data.validation.Required;
import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Person extends Model {

	@Required
	private String name;
	@Required
	private String surname;
	@Required
	private String gender;
	@Required
	private Date birthdate;
	private Date deathdate;
	private String eyecolor;
	private int height;

	@Required
	private String mothername;
	@Required
	private String fathername;
	private int childrennumber;
	@Required
	private String primaryschoolname;
	@Required
	private String secondaryschoolname;
	@Required
	private String universityname;
	@Required
	private String job;

	private String generaldescription;
	private ArrayList<Blob> pictures;

	@OneToMany
	private ArrayList<Person> listOfChilds;

	@OneToOne
	private Person marriedWith;

	@ManyToOne
	private Person dad;

	@ManyToOne
	private Person mom;

	/**
	 * default constructor
	 */
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Date getDeathdate() {
		return deathdate;
	}

	public void setDeathdate(Date deathdate) {
		this.deathdate = deathdate;
	}

	public String getEyecolor() {
		return eyecolor;
	}

	public void setEyecolor(String eyecolor) {
		this.eyecolor = eyecolor;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public int getChildrennumber() {
		return childrennumber;
	}

	public void setChildrennumber(int childrennumber) {
		this.childrennumber = childrennumber;
	}

	public String getPrimaryschoolname() {
		return primaryschoolname;
	}

	public void setPrimaryschoolname(String primaryschoolname) {
		this.primaryschoolname = primaryschoolname;
	}

	public String getSecondaryschoolname() {
		return secondaryschoolname;
	}

	public void setSecondaryschoolname(String secondaryschoolname) {
		this.secondaryschoolname = secondaryschoolname;
	}

	public String getUniversityname() {
		return universityname;
	}

	public void setUniversityname(String universityname) {
		this.universityname = universityname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getGeneraldescription() {
		return generaldescription;
	}

	public void setGeneraldescription(String generaldescription) {
		this.generaldescription = generaldescription;
	}

	public ArrayList<Blob> getPictures() {
		return pictures;
	}

	public void setPictures(ArrayList<Blob> pictures) {
		this.pictures = pictures;
	}

	public ArrayList<Person> getListOfChilds() {
		return listOfChilds;
	}

	public void setListOfChilds(ArrayList<Person> listOfChilds) {
		this.listOfChilds = listOfChilds;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Person getMarriedWith() {
		return marriedWith;
	}

	public void setMarriedWith(Person marriedWith) {
		this.marriedWith = marriedWith;
	}

	public Person getDad() {
		return dad;
	}

	public void setDad(Person dad) {
		this.dad = dad;
	}

	public Person getMom() {
		return mom;
	}

	public void setMom(Person mom) {
		this.mom = mom;
	}
}
