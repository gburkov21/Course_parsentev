package ru.gburkov.test;

import ru.gburkov.start.Input;
import ru.gburkov.start.StartUI;
import ru.gburkov.start.StubInput;

public class StartUITest {
	public static void main (String[] args){
		Input input = new StubInput(new String[]{"create stub task"});
		new StartUI(input).init();
	}
}