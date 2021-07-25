import java.util.Scanner;

public class Driver{
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the amount of beats");
	double tempobeats = scan.nextDouble();
	CreateAudio c = new CreateAudio(tempobeats);
	System.out.println("Commands\n C, C#, D, D#, E, F, F#, G, G#, A, A#, B, quit, reset");
	int x = 0;
	String input;
	while(c.finish() && x < tempobeats){
		System.out.println("Enter the next command");
		input = scan.next();
		if((c.getHertz(input)) != 0.0) {
			c.addNote((c.getHertz(input)), x);
			
		}
		x++;
	}
	c.playSound();
}
}

