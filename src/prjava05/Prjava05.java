/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prjava05;

import java.io.*;
import java.net.*;

/**
 * @author “El teu correu electrònic”
 */
public class Prjava05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            InetAddress addr = InetAddress.getLocalHost();
            byte[] ipAddr = addr.getAddress();
            String hostname = addr.getHostName();
            System.out.println("hostname=" + hostname);
            System.out.println("Nom de l'usuari: " + System.getProperty("user.name"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
