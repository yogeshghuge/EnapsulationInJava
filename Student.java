class Student
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

	public void setSid(int sid){this.sid=sid;}
	public void setSname(String sname){this.sname=sname;}
	public void setScity(String scity){ this.scity=scity;}
	public void setSpercentage(double spercentage){ this.spercentage=spercentage;}

	public int getSid(){return sid;}
	public String getSname(){return sname;}
	public String getScity(){return scity;}
	public double getSpercentage(){ return spercentage;}

	public String toString()
	{
		return "Student[sid="+sid+",sname="+sname+",scity="+scity+",spercentage="+spercentage+"]";
	}
	
}
	
	
	
		
		
