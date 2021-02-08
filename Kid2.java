class Kid2{
	String uni,school,total;

	public void setUni(String uni){
		this.uni=uni;
	}
	public void setSchool(String school){
		this.school=school;
	}
	public void printEdu(){
		System.out.print("Edu: ");
		System.out.print(school);
		System.out.print(" ");
		System.out.println(uni);
	}

	// public void printTotal(){
	// 	total=school+uni;
	// 	System.out.print("Total: ");
	// 	System.out.println(total);
	// }

	public static void main(String[] args) {
		Kid2 kidb=new Kid2();
		kidb.setSchool("Central college");
		kidb.setUni("UoP");
		kidb.printEdu();
		// kidb.printTotal();
	}
}