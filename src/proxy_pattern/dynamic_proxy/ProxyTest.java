package proxy_pattern.dynamic_proxy;

import java.lang.reflect.Proxy;

public class ProxyTest
{
	public static void main(String[] args)
	{
		PersonBean person = new PersonBeanImpl();

		PersonBean proxy = getProxy(person);
		System.out.println(proxy.getGender());
	}

	private static PersonBean getProxy(PersonBean person)
	{
		return (PersonBean) Proxy.newProxyInstance(PersonBeanImpl.class
				.getClassLoader(), person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person));
	}
}
