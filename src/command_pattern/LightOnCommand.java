package command_pattern;

import command_pattern.interfaces.Command;

public class LightOnCommand implements Command
{
	Light light;

	public LightOnCommand(Light light)
	{
		this.light = light;
	}

	@Override
	public void execute()
	{
		light.on();
	}

}
