import java.io.IOException;
import java.net.ServerSocket;
import java.util.*;

    public class Server {
		ServerSocket mServer;
		int serverPort = 9090;
		Scanner datain = new Scanner(System.in);

		public Server() {
			String command = "sdf";
			String[] strArray;

			while (!command.equals("end")) {
				System.out.print("Enter Command:  ");
				command = datain.nextLine();
				strArray = command.split(" ");
				if (strArray[0].equals("start")) {
					serverPort = Integer.parseInt(strArray[1]);
					try {
						// create server socket!
						mServer = new ServerSocket(serverPort);

						System.out.println("Server Created!");

						// wait for client
						mServer.accept();

						// horaaaaa
						System.out.println("Connected to" + serverPort);
					} catch (IOException e) {
					//	mServer.close();
					}


				} else if (strArray[0].equals("exit")) {
//						mServer.close();
				}


			}
		}

			public static void main (String[]args){
				new Server();
			}

	}
        
 
