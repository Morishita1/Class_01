package com.biz.exec;

import com.biz.mode.Student;
import com.biz.mode.StudentArray;

public class Exec_05 {

	public static void main(String[] args) {

		StudentArray sArray = new StudentArray();
		Student[] stdScore = sArray.makeScore(50);
		sArray.viewScore(stdScore);
		
		
		
		
	}

}
