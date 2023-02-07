import java.io.File;   
class DeleteFile {  
  public static void main(String[] args) {   
    File f = new File("Demo.txt");   
    if (f.delete()) {   
      System.out.println(f.getName()+ " file is deleted successfully.");  
    } else {  
      System.out.println("Unexpected error found in deletion of the file.");  
    }   
  }   
}  