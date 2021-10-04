package com.journaldev.socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * This class implements java Socket server
 * @author pankaj
 *
 */
public class SocketServerExample {
    
    
    private static ServerSocket server;
    
    private static int port = 9876;
    
    public static void main(String args[]) throws IOException, ClassNotFoundException{
       
        server = new ServerSocket(port);
        
        while(true){
            System.out.println("Waiting for the client request");
            
            Socket socket = server.accept();
            
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            
            String message = (String) ois.readObject();
            System.out.println("Message Received: " + message);
            
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            
            oos.writeObject("Hi Client "+message);
            
            ois.close();
            oos.close();
            socket.close();
            
            if(message.equalsIgnoreCase("exit")) break;
        }
        System.out.println("Shutting down Socket server!!");
       
        server.close();
    }
    
}





public class SocketClientExample {

    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException{
        
        InetAddress host = InetAddress.getLocalHost();
        Socket socket = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        for(int i=0; i<26;i++){
            
            socket = new Socket(host.getHostName(), 9876);
            
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            if(i==26)oos.writeObject("exit");
            else {
            	int a=65+i;  
            	char c=(char)a;
            	oos.writeObject(""+c);
            }
            
            ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            System.out.println("Message: " + message);
            
            ois.close();
            oos.close();
            Thread.sleep(100);
        }
    }
}