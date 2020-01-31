
package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket skt=new Socket("127.0.0.1",3222);
        DataInputStream is=new DataInputStream(skt.getInputStream());
        DataOutputStream os =new DataOutputStream(skt.getOutputStream());
        Scanner k=new Scanner(System.in);
        while(true){
            
        }
    }
}
