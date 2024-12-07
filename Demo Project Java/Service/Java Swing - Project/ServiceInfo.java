import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class ServiceInfo {
    private String phoneNumber;
    private String vehicalName;
    private String location;
    private File file;
    private FileWriter writer;
    private Scanner sc;

    //Empty Const
    public ServiceInfo()
    {
        this.phoneNumber="";
    }

    public ServiceInfo(String phoneNumber,String vehicalName,String location)
    {
        this.phoneNumber=phoneNumber;
        this.vehicalName=vehicalName;
        this.location=location;
        
    }



    public void setphoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setvehicalName(String vehicalName) {
        this.vehicalName = vehicalName;
    }
    public void setlocation(String location) {
        this.location = location;
    }
    
    public String getphoneNumber() {
        return phoneNumber;
    }
    public String getvehicalName() {
        return vehicalName;
    }
    public String getlocation() {
        return location;
    }
   

    public void addService()
    {
		try{
            BufferedReader b=null;
            FileReader f=null;
            f=new FileReader("Data/Temp.txt");
            b =new BufferedReader(f);
			String a="",temp;
            while((temp=b.readLine())!=null) {    
			a=temp;
			try
			{
            file = new File("Data/ServiceInfo.txt");
            file.createNewFile();
            writer  = new FileWriter(file,true);
			writer.write(a+"\t");
            writer.write(getphoneNumber()+"\t");
            writer.write(getvehicalName()+"\t");
            writer.write(getlocation()+"\n");
			writer.write("\r\n");
			
            writer.flush();
            writer.close();
			}
			catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
			}
		}  
        catch(Exception e)
        {
          e.printStackTrace();
        }
    }



}
