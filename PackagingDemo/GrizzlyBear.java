package animal.mammals;

public class GrizzlyBear extends Bear{
	void hunt(){
		Salmon s=findSalmon();
		s.consume();
	}
}
