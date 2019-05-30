import javax.sound.midi.Soundbank;

public class Main {

	public static void main(String[] args) {
		int interger1;
		interger1 = 10;
		
		int interger2;
		interger2 = 5;
		
		System.out.println("Ejercio de if/else");
		
		if (interger1<interger2) {
			System.out.println(interger1 + "<" + interger2);
			
		} else {
			System.out.println(interger1 + "!>" + interger2);
		}
		
		System.out.println("Ejercio de if/else if");
		
		if (interger1==interger2) {
			System.out.println(interger1 + "=" + interger2);
			
		} else if (interger1<=interger2){
			System.out.println(interger1 + "<=" + interger2);
			
		} else {
			System.out.println("No se cumple ninguna condición");
		}
		
		System.out.println("Ejercio de for");
		
		for (int i = interger1; i >= interger2; i--) {
			System.out.println(i);
		}
		
		System.out.println("Ejercio de while");
		
		while (interger1 > interger2) {
			System.out.println(interger2);
			interger2 +=2;	
		}
		
		System.out.println("Ejercio de do/while");
		
		do {
			System.out.println(interger1);
			interger1 +=1;
		} while (interger1 <= interger2);
	}

}
