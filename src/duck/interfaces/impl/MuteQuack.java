package duck.interfaces.impl;

import duck.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior
{

	@Override
	public void quack()
	{
		System.out.println("<<silence>>");
	}

}
