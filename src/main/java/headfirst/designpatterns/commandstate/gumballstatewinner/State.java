package headfirst.designpatterns.commandstate.gumballstatewinner;

import headfirst.designpatterns.commandstate.party.RemoteControl;

public interface State {
 
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
	
	public void refill();

}
