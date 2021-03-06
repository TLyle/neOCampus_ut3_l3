package Serveur;

import java.io.*;
import java.net.*;

public class Serveur implements Runnable{
    public static ServerSocket ss = null;
    public static Thread t;

    @Override
    public void run(){
        try {
            ss = new ServerSocket(9633);
            System.out.println("Le serveur est à l'écoute du port "+ss.getLocalPort());

            t = new Thread(new Accepter_connexion(ss));
            t.start();

        } catch (IOException e) {
            System.err.println("Le port "+ss.getLocalPort()+" est déjà utilisé !");
        }
    }
}
	/*public static void main(String[] args) {
		
		try {
			ss = new ServerSocket(9633);
			System.out.println("Le serveur est � l'�coute du port "+ss.getLocalPort());
			
			t = new Thread(new Accepter_connexion(ss));
			t.start();
			
		} catch (IOException e) {
			System.err.println("Le port "+ss.getLocalPort()+" est déjà utilisé !");
		}
	
	}*/

