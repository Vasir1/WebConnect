package webconnect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

////COMMENT
/**
 *
 * @author Kyle
 */
public class WebConnect {

    
    public WebConnect(){}
    public static  void main(String[] args) {
        Monitor monitor =new Monitor();
        monitor.StartServer();//

       

    }
    
}