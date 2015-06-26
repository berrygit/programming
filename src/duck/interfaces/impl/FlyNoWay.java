package duck.interfaces.impl;

import duck.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior
{

	@Override
	public void fly()
	{
		System.out.println("I can't fly.");
	}

}
