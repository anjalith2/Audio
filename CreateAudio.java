

public class CreateAudio{
//attributes
private double[] sounds;
private boolean stillWorking;
private double duration;
//constructor
public CreateAudio(double duration){
	this.duration = duration;
	stillWorking = true;
	sounds = new double[(int) (44100 * duration)];
}

//methods
public double getHertz(String note){
	double hz =0.0;
	switch(note) {
	case "C" : 
		hz = 261.63;
		break;
	case "C#" :
		hz = 271.18;
		break;
	case "D" : 
		hz = 293.66;
		break;
	case "D#" :
		hz = 311.13;
		break;
	case "E" : 
		hz = 329.63;
		break;
	case "F":
		hz = 349.23;
		break;
	case "F#" :
		hz = 369.99;
		break;
	case "G" :
		hz = 392.0;;
		break;
	case "G#" :
		hz = 415.30;
		break;
	case "A" :
		hz = 440.0;
		break;
	case "A#" :
		hz = 466.16;
		break;
	case "B" :
		hz = 493.88;
		break;
	case "quit" :
		stillWorking = false;
		break;
	case "reset" :
		reset();
	}
	System.out.println(hz);
	return hz;
	
}
public void addNote(double hz, int ind){
	System.out.println(hz);
	for(int x = ind * 44100; x < (ind +1) * 44100; x++){
		sounds[x] = hz;
		
	}
	System.out.println(sounds[ind *44100]);
}
public void playSound(){
	StdAudio.play(sounds);
	

}
public static void reset(){
}
public boolean finish(){
	return stillWorking;
	
}
}

