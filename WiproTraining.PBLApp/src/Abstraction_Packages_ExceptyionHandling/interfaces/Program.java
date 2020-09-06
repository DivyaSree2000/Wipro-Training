package Abstraction_Packages_ExceptyionHandling.interfaces;

import Abstraction_Packages_ExceptyionHandling.interfaces.Music.Playable;
import Abstraction_Packages_ExceptyionHandling.interfaces.Music.String.Veena;
import Abstraction_Packages_ExceptyionHandling.interfaces.Music.Wind.Saxophone;

/* Write an interface called Playable, with a method void play();
 * Let this interface be placed in a package called music.
 * Write a class called Veena which implements Playable interface. Let this class be placed in a package music.string
 * Write a class called Saxophone which implements Playable interface. Let this class be placed in a package music.wind
 * Write another class Test in a package called live. Then,
 * a. Create an instance of Veena and call play() method
 * b. Create an instance of Saxophone and call play() method
 * c. Place the above instances in a variable of type Playable and then call play()
*/
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playable pv=new Veena();
		Playable ps=new Saxophone();
		pv.play();
		ps.play();
	}

}
