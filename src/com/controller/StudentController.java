package com.controller;

import java.sql.SQLException;

import com.service.StudentService;

public class StudentController {

	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		try {
			studentService.insertRecord();
//			studentService.updateRecord();
//			studentService.fetchAllRecord();
//			studentService.deleteRecord();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
