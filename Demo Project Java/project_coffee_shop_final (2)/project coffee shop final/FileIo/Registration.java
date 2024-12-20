package FileIo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class Registration{
	
	private String username;
	private String password;
	
	LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

	String timeDate= myDateObj.format(myFormatObj);
	
	public Registration(String username,String password){
		this.username=username;
		this.password=password;
		try {
			File file = new File(".\\data\\user_data.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println("-------## User Info ##--------");
            pw.println("User Name  : " + username);
            pw.println("Password   : " + password);
            pw.println("Time & Date: " + timeDate);
            pw.println("===============================");
			
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
		}
		catch (Exception ex) {
            System.out.print(ex);
        }
		
	}
}