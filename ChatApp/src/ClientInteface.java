/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;

/**
 *
 * @author hp
 */
public interface ClientInteface extends Remote{
    public void UpdateOnlineUsers(Vector<String> names) throws RemoteException;
    public void UpdateHistory(String msg) throws RemoteException;
}
