package _02_Chat_Application;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Client02 extends Thread {
	 String ip = "127.0.0.1";
     //2. Create an integer for the server's port number
     int pn = 1000;
     
     Socket s; 
    
    
public void run() {
	  boolean c = true;
	
    try {
    	 s = new Socket(ip,pn);
    	 while(c) {
    		 
         DataOutputStream obj = new DataOutputStream(s.getOutputStream());
         String y = JOptionPane.showInputDialog("Place your message here");
         obj.writeUTF(y);
        
         DataInputStream DIT = new DataInputStream(s.getInputStream());
       
         JOptionPane.showMessageDialog(null, "Message: " + DIT.readUTF());
    	 }
    	 if (!c) {
    		 JOptionPane.showMessageDialog(null, "The server has closed. Your friend has logged off.");
    		 s.close();
    	 }
    }
    catch (IOException far){
    	c = false;
    }
}
}
