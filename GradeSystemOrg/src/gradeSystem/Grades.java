package gradeSystem;

//class Grades �x�s ID, name, lab1, lab2, lab3, midTerm, finalExam, and totalGrade
//calculateTotalGrade(weights)
//Grades () { } //�غc�l


public class Grades {
	private String ID;
	private String name;
	private int lab1;
	private int lab2;
	private int lab3;
	private int midTerm;
	private int finalExam;
	private int totalGrade;

	/*
	 * method calculateTotalGrade ----------------------------------------------
	 * �Q�ΦU���Z���񭫡A��XtotalGrades
	 * 
	 * @param lab1Weight ���Zlab1����
	 * 
	 * @param lab2Weight ���Zlab2����
	 * 
	 * @param lab3Weight ���Zlab3����
	 * 
	 * @param midTermWeight ���ZmidTerm����
	 * 
	 * @param finalExamWeight ���ZfinalExam����
	 * 
	 * Time estimate : O(1)
	 * -------------------------------------------------------------------------
	 */

	// public calculateTotalGrade(weights) {totalGrade���|�ˤ��J}
	public void calculateTotalGrade(double lab1Weight, double lab2Weight,
			double lab3Weight, double midTermWeight, double finalExamWeight) {
		totalGrade = (int) Math.round(lab1 * lab1Weight + lab2 * lab2Weight
				+ lab3 * lab3Weight + midTerm * midTermWeight + finalExam
				* finalExamWeight);
	}

	// public Grades () { } //�غc�l
	public Grades() {
	}

	public int getFinalExam() {
		return finalExam;
	}

	public String getID() {
		return ID;
	}

	public int getLab1() {
		return lab1;
	}

	public int getLab2() {
		return lab2;
	}

	public int getLab3() {
		return lab3;
	}

	public int getMidTerm() {
		return midTerm;
	}

	public String getName() {
		return name;
	}

	public int getTotalGrade() {
		return totalGrade;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFinalExam(int finalExam) {
		this.finalExam = finalExam;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public void setLab1(int lab1) {
		this.lab1 = lab1;
	}

	public void setLab2(int lab2) {
		this.lab2 = lab2;
	}

	public void setLab3(int lab3) {
		this.lab3 = lab3;
	}

	public void setMidTerm(int midTerm) {
		this.midTerm = midTerm;
	}

	public void setTotalGrade(int totalGrade) {
		this.totalGrade = totalGrade;
	}

}
