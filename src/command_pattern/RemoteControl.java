package command_pattern;

import command_pattern.interfaces.Command;

public class RemoteControl
{
	Command[] onCommand;
	Command[] offCommand;

	public RemoteControl()
	{
		onCommand = new Command[7];
		offCommand = new Command[7];
		Command noCommand = new NoCommand();

		for (int i = 0; i < 7; i++)
		{
			onCommand[i] = noCommand;
			offCommand[i] = noCommand;
		}
	}

	public void setCommand(int slot, Command onCommand, Command offCommand)
	{
		this.onCommand[slot] = onCommand;
		this.offCommand[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot)
	{
		onCommand[slot].execute();
	}

	public void offButtonWasPushed(int slot)
	{
		offCommand[slot].execute();
	}
}
