package com.jsp.teacher.controller;

import com.jsp.teacher.dao.TeacherDao;
import com.jsp.teacher.dto.Teacher;

public class UpdateTeacher {

	public static void main(String[] args) {
		Teacher teacher=new Teacher();
		teacher.setId(3);
		teacher.setName("nuthan");
		teacher.setLoc("navi mumbai");
		
		TeacherDao teacherDao=new TeacherDao();
		Teacher teacher2= teacherDao.updateTeacher(teacher);
		if(teacher2!=null) {
			System.out.println("record updated");
		}
		else {
			System.out.println("record not found");
		}
		
	}

}
