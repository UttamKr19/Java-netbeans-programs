/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abs2;

import java.util.Random;

/**
 *
 * @author Uttam
 */
abstract class Compartment {
	public abstract void notice();
}

class FirstClass extends Compartment {

	@Override
	public void notice() {
		System.out.println("Notice: You're in FirstClass");
	}

}

class General extends Compartment {

	@Override
	public void notice() {
		System.out.println("Notice: You're in General");
	}

}

class Ladies extends Compartment {

	@Override
	public void notice() {
		System.out.println("Notice: You're in Ladies");
	}

}

class Luggage extends Compartment {

	@Override
	public void notice() {
		System.out.println("Notice: You're in Luggage");
	}

}




public class Abs2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Compartment[] compartments = new Compartment[10];

		Random rand = new Random();
	    
	    for (int i = 0; i < 10; i++) {
	    	int randomNum = rand.nextInt((4 - 1) + 1) + 1;
	    	
            switch (randomNum) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
                default:
                    break;
            }
	    	
	    	compartments[i].notice();
	    }
    }
    
}
