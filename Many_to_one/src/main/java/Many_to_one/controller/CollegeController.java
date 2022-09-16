package Many_to_one.controller;

import Many_to_one.dao.CollegeDao;
import Many_to_one.dto.Building;
import Many_to_one.dto.College;

public class CollegeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollegeDao collegeDao = new CollegeDao();
		College college = new College();
		college.setCollegeName("Ramahiya-Institute-and-Technology");
		college.setCollegeAddress("bangalore");
		Building buiding1 = new Building();
		Building buiding2 = new Building();

		buiding1.setBuildingName("Physiotheapy");
		buiding1.setBuildingColor("Blue");
		buiding1.setCollege(college);

		buiding2.setBuildingName("Operation-room");
		buiding2.setBuildingColor("Pink");
		buiding2.setCollege(college);

		collegeDao.saveBuildingCollege(college, buiding1, buiding2);
	}

}
