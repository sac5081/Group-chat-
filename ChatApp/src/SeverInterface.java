/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SeverInterface extends Remote{
      
    public void RegisterUser(ClientInteface ci ,String name)throws RemoteException;
    public void sendMessage(String msg)throws RemoteException;
    public void LogoutUser(String s)throws RemoteException;
}
