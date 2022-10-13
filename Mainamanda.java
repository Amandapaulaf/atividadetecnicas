package aula11_10_22;

public class Mainamanda {
public static void main(String[] args) {
	Musica m= new Musica("Francis Forever");
	m.setDuracao(150);
	m.setletra("I don't know what to do without you\r\n"
			+ "I don't know where to put my hands\r\n"
			+ "I've been trying to lay my head down\r\n"
			+ "But I'm writing this at three AM\r\n"
			+ "I don't need the world to see\r\n"
			+ "That I've been the best I can be, but\r\n"
			+ "I don't think I could stand to be\r\n"
			+ "Where you don't see me\n");
	Musica n= new Musica("Me And My Husband");
	n.setDuracao(160);
	n.setletra("I steal a few breaths from the world for a minute\r\n"
			+ "And then I'll be nothing forever\r\n"
			+ "And all of my memories\r\n"
			+ "And all of the things I have seen will be gone\r\n"
			+ "With my eyes with my body with me\r\n"
			+ "\r\n"
			+ "But me and my husband\r\n"
			+ "We are doing better\r\n"
			+ "It's always been just him and me\r\n"
			+ "Together\r\n"
			+ "So I bet all I have on that\r\n"
			+ "Furrowed brow\r\n"
			+ "And at least in this lifetime\r\n"
			+ "We're sticking together\r\n"
			+ "Me and my husband\r\n"
			+ "We're sticking together\n");
    PlayAmanda a= new PlayAmanda();
    a.addMusica(m);
    a.addMusica(n);
    a.start();
	
	
}
}
