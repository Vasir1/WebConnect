/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package webconnect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Kyle
 */
public class Monitor {
    private static ServerSocket serverSocket;
    private static Socket clientSocket;
    private static InputStreamReader inputStreamReader;
    private static BufferedReader bufferedReader;
    private static String message;
    public boolean[] isSitting=new boolean[5];
    public void StartServer(){
         try {
            serverSocket = new ServerSocket(7575);  //Server socket

        } catch (IOException e) {
            System.out.println("Could not listen on port: 7575");
        }

        System.out.println("Server started. Listening to the port 7575");

        while (true) {
            try {

                clientSocket = serverSocket.accept();   //accept the client connection
                inputStreamReader = new InputStreamReader(clientSocket.getInputStream());
                bufferedReader = new BufferedReader(inputStreamReader); //get the client message
                message = bufferedReader.readLine();

                System.out.println(message);
                //int n=;
                try{
                checkIn(Integer.valueOf(message));
                }
                catch (NumberFormatException e) {
                    
                    
                }
                
                inputStreamReader.close();
                clientSocket.close();

            } catch (IOException ex) {
                System.out.println("Problem in message reading");
            }
        }
    }
    public void checkIn(int _checkingIn){
        if (_checkingIn<isSitting.length){
            isSitting[_checkingIn]=true;
            System.out.println("Someone is sitting at table: "+_checkingIn);
        }
        
        
        
    }
     public void Refill(){
        
    }
    public void OrderUp(int Price){
        
    }
    
}
