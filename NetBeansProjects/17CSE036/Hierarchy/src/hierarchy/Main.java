
package hierarchy;


public class Main {
    
    
         public static void main (String[] args) 
	{
		Person obj = new Person();
		obj.setName("Harsh");
		obj.setage(19);
                obj.setQualification("GraduateMuster");
                obj.setcgpa(3);
		System.out.println("Name of Person: " + obj.getName());
		System.out.println("Age of Person: " + obj.getage()); 
                System.out.println("CGPA: " + obj.getcgpa());
                System.out.println("Qualification: " + obj.getQualification());
                
                Employee e = new Employee();
                e.setemployeeID("Barisal/12/Am");
                e.setsalary(200000);
                System.out.println("EmployeeID: " + e.getemployeeID());
                System.out.println("Salary: " + e.getsalary());
                
                
                Student s = new Student();
                s.setaddress("Barisal");
                s.setid("17cse036");
                System.out.println("Student_Address: " + s.getaddress());
                System.out.println("Student_ID: " + s.getid());
                
                Faculty f = new  Faculty();
                f.setGovtSector("Bangladesh_police");
                f.setPrivateSector("Pran");
                System.out.println("Faculty of Govt job : " + f.getGovtSector());
                System.out.println("Faculty of private job : " + f.getPrivateSector());
                
               Staff s1 = new Staff();
               s1.setPosition("first");
               s1.setWorkingHour(12);
               System.out.println("Position of staff : " + s1.getPosition());
               System.out.println("Position of staff : " + s1.getWorkingHour());
   }
}
