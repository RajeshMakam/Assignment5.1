package abst;

abstract class animalSounds
{
   
abstract void soundsMethod();
 
}
 
class dogSounds extends animalSounds {
 
public void soundsMethod()
{
System.out.println("Bark Bark.....");
}
}
 
public class sounds extends dogSounds {
 
   public static void main(String []args) {
	   dogSounds obj = new dogSounds();
      obj.soundsMethod();
   }
}
