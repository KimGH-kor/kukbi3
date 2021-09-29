package ch01.학점산출프로그램.school;

import java.util.ArrayList;

import ch01.학점산출프로그램.util.Define;


public class Subject {
	private int subjectId;
	private String subjectName;
	private int gradeType;
	ArrayList<Student> arr = new ArrayList<>();
	
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE;
	}
	
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getGradeType() {
		return gradeType;
	}
	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
	public ArrayList<Student> getArr() {
		return arr;
	}
	public void setArr(ArrayList<Student> arr) {
		this.arr = arr;
	}
}
