package state_pattern;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import proxy_pattern.remote_proxy.server.GumballMachineRemote;
import state_pattern.interfaces.State;

public class GumballMachine extends UnicastRemoteObject implements
GumballMachineRemote
{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8476950458864949795L;

	private State noQuarterState;

	private State soldOutState;

	private State hasQuarterState;

	private State soldState;

	private State state = noQuarterState;

	private int count = 0;

	public GumballMachine() throws RemoteException
	{
	}

	public void insertQuarter()
	{
		state.insertQuarter();
	}

	public void ejectQuarter()
	{
		state.ejectQuarter();
	}

	public void turnCrank()
	{
		state.turnCrank();
		state.dispense();
	}

	public void releaseBall()
	{
		System.out.println("A gumball comes rolling out the solt...");
		if (count != 0)
		{
			count--;
		}
	}

	/**
	 * @return the soldOutState
	 */
	public State getSoldOutState()
	{
		return soldOutState;
	}

	/**
	 * @param soldOutState
	 *            the soldOutState to set
	 */
	public void setSoldOutState(State soldOutState)
	{
		this.soldOutState = soldOutState;
	}

	/**
	 * @return the noQuarterState
	 */
	public State getNoQuarterState()
	{
		return noQuarterState;
	}

	/**
	 * @param noQuarterState
	 *            the noQuarterState to set
	 */
	public void setNoQuarterState(State noQuarterState)
	{
		this.noQuarterState = noQuarterState;
	}

	/**
	 * @return the hasQuarterState
	 */
	public State getHasQuarterState()
	{
		return hasQuarterState;
	}

	/**
	 * @param hasQuarterState
	 *            the hasQuarterState to set
	 */
	public void setHasQuarterState(State hasQuarterState)
	{
		this.hasQuarterState = hasQuarterState;
	}

	/**
	 * @return the soldState
	 */
	public State getSoldState()
	{
		return soldState;
	}

	/**
	 * @param soldState
	 *            the soldState to set
	 */
	public void setSoldState(State soldState)
	{
		this.soldState = soldState;
	}

	/**
	 * @return the count
	 */
	@Override
	public int getCount()
	{
		return count;
	}

	/**
	 * @return the state
	 */
	@Override
	public State getState()
	{
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(State state)
	{
		this.state = state;
	}

}
