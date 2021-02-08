class Kid5<T extends Number>{
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

	public void printTotal(){
		// total=school+uni;
		T total=(T)(Integer.valueOf(((Integer)school+(Integer)uni)));
		System.out.print("Total: ");
		System.out.println(total);
	}

	public static void main(String[] args) {
		// Kid5<String> kzz=new Kid5<String>();		

		Kid5<Integer> kz=new Kid5<Integer>();
		kz.setSchool(10);
		kz.setUni(6);
		kz.printEdu();
		kz.printTotal();
	}

}