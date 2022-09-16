package Many_to_one.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Building {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int BuildingId;
	private String BuildingName;
	private String BuildingColor;

	@ManyToOne
	private College college;

	public int getBuildingId() {
	return BuildingId;
	}

	public void setBuildingId(int buildingId) {
	BuildingId = buildingId;
	}

	public String getBuildingName() {
	return BuildingName;
	}

	public void setBuildingName(String buildingName) {
	BuildingName = buildingName;
	}

	public String getBuildingColor() {
	return BuildingColor;
	}

	public void setBuildingColor(String buildingColor) {
	BuildingColor = buildingColor;
	}

	public College getCollege() {
	return college;
	}

	public void setCollege(College college) {
	this.college = college;
	}
}
