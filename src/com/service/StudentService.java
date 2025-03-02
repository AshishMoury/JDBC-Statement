package com.service;

import java.sql.SQLException;

import com.dao.StudentDao;

public class StudentService {

	public void insertRecord() throws ClassNotFoundException, SQLException {
		StudentDao sd = new StudentDao();
		sd.insertData();
	}
	
	public void updateRecord() throws ClassNotFoundException, SQLException {
		StudentDao sd = new StudentDao();
		sd.UpdateData();
	}
	
	public void fetchAllRecord() throws ClassNotFoundException, SQLException {
		StudentDao sd = new StudentDao();
		sd.fetchAllRecords();
	}
	
	public void deleteRecord() throws ClassNotFoundException, SQLException {
		StudentDao sd = new StudentDao();
		sd.deleteData();
	}
}
