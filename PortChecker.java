import java.net.*;
import java.util.Scanner;
class PortChecker {
   public static void main(String []args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter host name: ");
	String host = scan.nextLine();
      for (int port = 1; port <= 1024; port++) {
         try {
            Socket socket = new Socket(host, port);
            socket.close();
            System.out.println(host + " " + port + " " + " is open");
        } catch (Exception ex) {
        }
      }
   }
}