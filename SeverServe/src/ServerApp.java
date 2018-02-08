/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author hp
 */
public class ServerApp extends UnicastRemoteObject implements MiddleClass{
    
    ServerApp()throws RemoteException
    {
        super();
    }
    @Override
    public String SayHello(String name) throws RemoteException {
        return ("Hello  : "+ name);
    }
    public static void main(String args[])
    {
        try
        {
          ServerApp ser =new ServerApp();
          Naming.rebind("Server", ser);
          System.out.println("Server Registered!!!");
        }
        catch(Exception e)
        {
            System.out.println(e.fillInStackTrace());
        }

    }
}



