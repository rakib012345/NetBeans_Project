/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Lenovo
 */
public class Server {
   
    public static void main(String[] args) {     
    ServerSocket socket;
        try{
            
            socket = new ServerSocket(3222);
            Socket skt=socket.accept();
            DataInputStream is=new DataInputStream(skt.getInputStream());
            DataOutputStream os =new DataOutputStream(skt.getOutputStream());
            String str=is.readUTF();
            System.out.println(str);
        }
        catch(Exception e){
            
        }
    }
}
