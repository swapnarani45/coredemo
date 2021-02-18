package com.vam.training.testing.JUnitDemo1;
public class JUnitMessage {
	String m;
	JUnitMessage(String msg)
	{
		m=msg;
	}
String printMessage()
{
	return m;
}

String printHiMessage()
{
	return "Hi "+m;
}
}