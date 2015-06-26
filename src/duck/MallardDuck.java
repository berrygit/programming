package duck;

import duck.interfaces.impl.FlyWithWings;
import duck.interfaces.impl.Quack;

public class MallardDuck extends Duck
{
	MallardDuck()
	{
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display()
	{
		System.out.println("I'am real a mallard duck");
	}

}
