package _02_Chat_Application;

import java.io.IOException;

/*
 * Using the Click_Chat example, write an application that allows a server computer to chat with a client computer.
 */

public class ChatApp {
	public static void main(String[] args) {
		//16. In a new thread, create an object of the ServerGreeter class and start the thread. Don't forget the try-catch.
		try {
			Thread r1 = new Server02();
			Thread r2 = new Client02();
			r1.start();
			r2.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
