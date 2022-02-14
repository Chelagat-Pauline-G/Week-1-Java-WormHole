import java.util.ArrayList;

public class MainReality
{
    public static void main (String [] args)
    {
        //define some dogs
        Dog dog1 = new Dog ("Tom");
        Dog dog2 = new Dog ("Jerry");
        
        ArrayList <Dog> dogs = new ArrayList <Dog> ();
        dogs.add (dog1);
        dogs.add (dog2);
    
        
        //define zoo
        Zoo zoo = new Zoo ( dogs);
        ArrayList <Dog> zooDogs = zoo.getDogs ();
        
        for (int dogIndex = 0; dogIndex <dogs.size(); dogIndex ++ )
        {
           System.out.println ("Dog's name : "+ zooDogs.get (dogIndex).getName() ); 
        }
    }
}