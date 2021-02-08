class Kid4<T>{
	T school,uni;
	public void setSchool(T school){
		this.school=school;
	}
	public void setUni(T uni){
		this.uni=uni;
	}
	public void printEdu(){
		System.out.print("Edu: ");
		System.out.print(school);
		System.out.print(" ");
		System.out.println(uni);		
	}

	public static void main(String[] args) {
		Kid4<Integer> kx=new Kid4<Integer>();
		kx.setSchool(15);
		kx.setUni(2);
		kx.printEdu();

		Kid4<String> ky=new Kid4<String>();
		ky.setSchool("CentralCollege");
		ky.setUni("Pera");
		ky.printEdu();

	}
}