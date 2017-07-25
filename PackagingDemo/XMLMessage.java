package packageB;
public class XMLMessage extends packageA.Message{
	String getText(){
		return "<msg>text</msg>";
	}

	public static void main(String [] args){
		System.out.println(new XMLMessage().getText());
	}
}
