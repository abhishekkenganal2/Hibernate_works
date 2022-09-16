package Many_to_one.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CollegeId;
	private String CollegeName;
	private String CollegeAddress;

	public int getCollegeId() {
	return CollegeId;
	}

	public void setCollegeId(int collegeId) {
	CollegeId = collegeId;
	}

	public String getCollegeName() {
	return CollegeName;
	}

	public void setCollegeName(String collegeName) {
	CollegeName = collegeName;
	}

	public String getCollegeAddress() {
	return CollegeAddress;
	}

	public void setCollegeAddress(String collegeAddress) {
	CollegeAddress = collegeAddress;
	}

}
