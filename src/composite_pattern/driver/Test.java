package composite_pattern.driver;

import composite_pattern.Component;
import composite_pattern.Composite;
import composite_pattern.Leaf;

public class Test
{
	public static void main(String[] args)
	{
		Component pp = new Composite("pp", "hello");
		Component pd = new Composite("pd", "hello");

		pp.add(new Leaf("apple", "lll", true, 1.59));
		pp.add(new Leaf("oracle", "mygod", true, 1.59));

		pd.add(new Leaf("apple", "lll", true, 1.59));
		pd.add(new Leaf("oracle", "mygod", true, 1.59));

		Component all = new Composite("all", "haha");

		all.add(pp);
		all.add(pd);

		Driver driver = new Driver(all);

		driver.printVegetarianMenu();

	}
}
