/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;
import javax.swing.JList;
import javax.swing.JTextArea;

/**
 *
 * @author hp
 */
public class ClientClass extends UnicastRemoteObject implements ClientInteface{
 
     JList l;
     JTextArea area;
     
     public ClientClass(JList l,JTextArea area) throws RemoteException
     {
        super();
        this.l = l;
        this.area =area;
     }
     @Override
    public void UpdateOnlineUsers(Vector<String> names) throws RemoteException {
       l.setListData(names);
     }
    @Override
    public void UpdateHistory(String msg) throws RemoteException {
        area.append(msg+"\n");
    }
    
}
