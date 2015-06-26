package duck.interfaces.impl;

import duck.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior
{

	@Override
	public void fly()
	{
		System.out.println("I'm flying!!");
	}

}
