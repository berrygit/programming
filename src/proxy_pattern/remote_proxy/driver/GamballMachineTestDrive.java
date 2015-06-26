package proxy_pattern.remote_proxy.driver;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

import proxy_pattern.remote_proxy.server.GumballMachineRemote;
import state_pattern.GumballMachine;

public class GamballMachineTestDrive
{
	public static void main(String[] args) throws RemoteException
	{
		GumballMachineRemote machine = null;

		machine = new GumballMachine();
		try
		{
			Naming.rebind("sea", machine);
		}
		catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
