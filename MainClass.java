class MainClass
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.setSid(10);
		s.setSname("Amol");
		s.setScity("Delhi");
		s.setSpercentage(90.60);
		System.out.println("ID:"+s.getSid());
		System.out.println("NAME:"+s.getSname());
		System.out.println("CITY:"+s.getScity());
		System.out.println("PERCENTAGE:"+s.getSpercentage());

		Student s1=new Student(20,"DEF","Mumbai",75.12);
		System.out.println(s1);
	}
}