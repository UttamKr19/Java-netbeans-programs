/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package over1;

/**
 *
 * @author Uttam
 */
class Orange extends Fruit {
	@Override
	public void eat() {
		System.out.println("It tastes like Orange");
	}
}
class Fruit {
	protected String name;
	protected String taste;
	protected int size;
	
	public Fruit() {
		name = "Fruit name";
		taste = "Tase of the fruit";
		size = 0;
	}
	
	public void eat () {
		System.out.println(name + " tastes like " + taste);
	}
}
class Apple extends Fruit {
	@Override
	public void eat() {
		System.out.println("It tastes like apple");
	}
}


public class Over1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Fruit().eat();
		new Apple().eat();
		new Orange().eat();
    }
    
}
