class Student1
{
	Student(){ }
	Student(int sid, String sname, String scity, double spercentage)
	{
		this.sid=sid;
		this.sname=sname;
		this.scity=scity;
		this.spercentage=spercentage;
	}
	private int sid;
	private String sname;
	private String scity;
	private double spercentage;

	public Student1 setSid(int sid){this.sid=sid;return }
	public Student1 setSname(String sname){this.sname=sname;}
	public Student1 setScity(String scity){ this.scity=scity;}
	public Student1 setSpercentage(double spercentage){ this.spercentage=spercentage;}

	public int getSid(){return sid;}
	public String getSname(){return sname;}
	public String getScity(){return scity;}
	public double getSpercentage(){ return spercentage;}

	public String toString()
	{
		return "Student1[sid="+sid+",sname="+sname+",scity="+scity+",spercentage="+spercentage+"]";
	}
	
}
