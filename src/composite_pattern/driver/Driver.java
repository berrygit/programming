package composite_pattern.driver;

import java.util.Iterator;

import composite_pattern.Component;

public class Driver
{
	Component allComponent;

	public Driver(Component allComponent)
	{
		super();
		this.allComponent = allComponent;
	}

	public void printMenu()
	{
		allComponent.print();
	}

	public void printVegetarianMenu()
	{
		Iterator<Component> iterator = allComponent.iterator();

		while (iterator.hasNext())
		{
			Component component = iterator.next();

			try
			{
				if (component.isVegetarain())
				{
					component.print();
				}
			}
			catch (UnsupportedOperationException e)
			{
			}
		}
	}
}
