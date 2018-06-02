
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Client {
	Socket mSocket;
	int port = 10005;
	String serverAddress = "127.0.0.1";
	/*String serverAddress = JOptionPane.showInputDialog(
			"Enter IP Address of a machine that is\n" +
					"running the date service on port 9090:");*/





	public Client() {
		try {

			mSocket = new Socket(serverAddress, port);

			System.out.println("connect to server ....  "+ port);

			BufferedReader input = new BufferedReader(new InputStreamReader(mSocket.getInputStream()));
			String answer = input.readLine();
			//JOptionPane.showMessageDialog(null, answer);
			System.out.println(answer);
			System.exit(0);
		} catch (UnknownHostException e) {
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {
		new Client();
	}
}
