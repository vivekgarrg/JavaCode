package lab_question;

abstract class Message {
	abstract void playMessage();
	}

class TextMessage extends MessagePrint
{
	void playMessage()
	{
		System.out.println("Text Message");	
	}
}
class VoiceMessage extends MessagePrint
{
	void playMessage()
	{
		System.out.println("Voice Message");
	}
}
class FaxMessage extends MessagePrint
{
	void playMessage()
	{
		System.out.println("Fax Message");
	}
}

class MessagePrint
{
	public static void main(String arg[]) {
		TextMessage tm = new TextMessage();
		tm.playMessage();
		VoiceMessage vm = new VoiceMessage();
		vm.playMessage();
		FaxMessage fm = new FaxMessage();
		fm.playMessage();
	}
}