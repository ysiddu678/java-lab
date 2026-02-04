class Student 
{
int rollno;
String name;
String branch;
int marks;
void getData(int rollno,String name,String branch,int marks)
{
this.rollno=rollno;
this.name=name;
this.branch=branch;
this.marks=marks;
}
void display()
{
System.out.println("Rollno="+rollno);
System.out.println("Name="+name);
System.out.println("branch="+branch);
System.out.println("Marks="+marks);
}

	public static void main(String[] args) 
	{
		Student s1=new Student();
        Student s2=new Student();
        s1.getData(1,"abc","cse",90);
        s2.getData(2,"bcd","eee",90);
        s1.display();
        s2.display();
	}
}