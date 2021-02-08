class Kid3{
	Object uni,school;

	public void setSchool(Object school){
		this.school=school;
	}
	public void setUni(Object uni){
		this.uni=uni;
	}
	public void printEdu(){
		System.out.print("Edu: ");
		System.out.print(school);
		System.out.print(" ");
		System.out.println(uni);		
	}

	public static void main(String[] args) {
		Kid3 kc=new Kid3();
		kc.setUni((Object)"PDN");
		kc.setSchool((Object)"schoolX");
		kc.printEdu();

		String sch=(String)kc.school;
		System.out.print(sch);
		System.out.println("----");


		Kid3 kd=new Kid3();
		kd.setUni((Object)3);
		kd.setSchool((Object)14);
		kd.printEdu();

		int sch2=(int)kd.school;
		System.out.print(sch2);
		System.out.println("----");


	}
}