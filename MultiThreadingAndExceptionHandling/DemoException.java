import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) throws Exception {
        // int i=8,j=2,k=0;
        // int a[]=new int[4];
        // //ArithmeticException
        // try {
        //     //unchecked Exception
        //     k=l/j;
        //     for(int i=0;i<=4;i++){
        //         a[i]=i+1;
        //     }
        //     for(int value : a){
        //         System.out.println(value);
        //     }
        // } catch (ArithmeticException e) {
        //     // TODO: handle exception
        //     System.out.println("Cann't Divide By Zero");
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Maximum number of value is 4");
        // }
        // catch(Exception e){
        //     System.out.println("Unkonwn Exception");
        // }
        // System.out.println(k);


        // int i,j,k=0;
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // i=8;
        // try {
        //     System.out.println("Enter a number");
        //     j=Integer.parseInt(br.readLine());
        //     k=i/j;
        //     System.out.println("Output is : "+k);
        // }catch (IOException e) {
        //     // TODO: handle exception
        //     System.out.println("Some IO Error");
        // }catch(ArithmeticException e){
        //     System.out.println("Cann't Divide By Zero"+e);
        // }
        // catch(Exception e){
        //     System.out.println("Unknown Exception");
        // }
        // finally{
        //     System.out.println("Bye");
        // }

        
        // try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
        //     String str = "";
            
        //     str = br.readLine();
        // }
        // //  catch (Exception e) {
        // //     // TODO: handle exception
        // //     System.out.println(e);
        // // }
        // // finally{
        // //     br.close();
        // // }


        //throw and throws

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // i=8;
        // try {
        //     System.out.println("Enter a number");
        //     j=Integer.parseInt(br.readLine());
        //     k=i+j;
        //     if(k<10){
        //         throw new ArithmeticException();
        //     }
        //     System.out.println("Output is : "+k);
        // }catch (IOException e) {
        //     // TODO: handle exception
        //     System.out.println("Some IO Error");
        // }catch(ArithmeticException e){
        //     System.out.println("Mininmum value for the output is 10 "+e);
        // }
        // catch(Exception e){
        //     System.out.println("Unknown Exception");
        // }
        // finally{
        //     System.out.println("Bye");
        // }





        // user define Exception

        int i=5;
        try{
            if(i<10){
                throw new MyException("Errrorrr");
            }
        }
        
        catch(MyException e){
            System.out.println(e);
        }

    }
}
class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}