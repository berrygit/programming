package proxy_pattern.remote_proxy;

import state_pattern.GumballMachine;

public class GumballMonitor
{
	/**
	 * gamballMachine
	 */
	private GumballMachine gamballMachine;

	/**
	 * @param gamballMachine
	 */
	public GumballMonitor(GumballMachine gamballMachine)
	{
		this.gamballMachine = gamballMachine;
	}

	/**
	 * report
	 */
	public void report()
	{
		System.out.println("State" + gamballMachine.getState());
	}
}
