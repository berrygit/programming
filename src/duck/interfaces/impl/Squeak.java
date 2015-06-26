package duck.interfaces.impl;

import duck.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior
{

	@Override
	public void quack()
	{
		System.out.println("squeak");
	}

}
