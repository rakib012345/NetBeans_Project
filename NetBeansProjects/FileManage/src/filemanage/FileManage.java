
package filemanage;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class FileManage {

    public static void main(String[] args) {
        
        File dir =  new File("C:/Users/Lenovo/Documents/NetBeansProjects/FileManage//src/person");
        dir.mkdir();
        String dirlocation = dir.getAbsolutePath();
        System.out.println(dirlocation);
        System.out.println(dir.getName());
        
        File file1 = new File("C:/Users/Lenovo/Documents/NetBeansProjects/FileManage/src/person/Student.txt");
        File file2 = new File(dirlocation+"/Teacher.txt");
        
        try {
            
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("File are created");
             
        } catch (Exception e) {
            System.out.println(e);
        }

        
    String id, name;
        try {
           Formatter formatter = new Formatter("C:/Users/Lenovo/Documents/NetBeansProjects/FileManage/src/person/Student.txt");
            
            
            Scanner input = new Scanner(System.in);
            System.out.println("How many students : ");
            int num = input.nextInt();
            
            for(int i = 1; i <= num; i++){
               System.out.println("Enter Students Id and Name : ");
               id = input.next();
               name = input.next();
               
               formatter.format("%s %s \r\n", id,name);
               

               
            }
            
            formatter.close();
        } 
        catch (Exception e)
        {
            System.out.println("e");
        }   
        
        
        
      //  try {
         //   File file = new File("C:/Users/Lenovo/Documents/NetBeansProjects/FileManage/src/person/Student.txt");
          //  Scanner scanner = new Scanner(file);
           // while(scanner.hasNext()){
            
           //   String id = scanner.Next();
           //   String name = scanner.Next();
              
             //   System.out.println("id  :"+id+"name  :"+name);
            
        //    }
         //   scanner.close();
      //  } catch (Exception e) {
            
        //    System.out.println("e");
      //  }
        
        
        
        
        
        
        
        
       //file2.delete();
        
       // if(file2.delete())
       // {
           // System.out.println("are deleted");
       // }
     //   else
       // {
         //   System.out.println("are not deleted");
       // }
            
            
      //  if(dir.delete()){
       //     System.out.println(dir.getName() + "has been delete");
        
       // }
    
   }
}
