class Kid1{
	int uni,school,total;

	public void setUni(int uni){
		this.uni=uni;
	}
	public void setSchool(int school){
		this.school=school;
	}
	public void printEdu(){
		System.out.print("Edu: ");
		System.out.print(school);
		System.out.print(" ");
		System.out.println(uni);
	}

	public void printTotal(){
		total=school+uni;
		System.out.print("Total: ");
		System.out.println(total);
	}

	public static void main(String[] args) {
		Kid1 kida=new Kid1();
		kida.setSchool(12);
		kida.setUni(4);
		kida.printEdu();
		kida.printTotal();
	}
}