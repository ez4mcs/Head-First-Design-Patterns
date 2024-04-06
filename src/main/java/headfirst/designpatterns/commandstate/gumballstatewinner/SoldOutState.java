package headfirst.designpatterns.commandstate.gumballstatewinner;

import headfirst.designpatterns.commandstate.party.RemoteControl;

public class SoldOutState implements State {
	GumballMachine gumballMachine;
	RemoteControl remoteControl;

	public SoldOutState(GumballMachine gumballMachine) {
			this.gumballMachine = gumballMachine;
			this.remoteControl = new RemoteControl();
	}

	public SoldOutState(GumballMachine gumballMachine, RemoteControl remoteControl) {
			this.gumballMachine = gumballMachine;
			this.remoteControl = remoteControl;
	}
 
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
		remoteControl.onButtonWasPushed(0);
	}
 
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
		remoteControl.offButtonWasPushed(0);
	}
 
	public void dispense() {
		System.out.println("No gumball dispensed");
	}
	
	public void refill() { 
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public String toString() {
		return "sold out";
	}
}
