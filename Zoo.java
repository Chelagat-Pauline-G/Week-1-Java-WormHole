import java.util.ArrayList;

public class Zoo
{
    // features
    private ArrayList <Dog> dogs = new ArrayList <Dog> ();
    
    //contructor
    public Zoo (ArrayList <Dog> externalDogs )
    
{
    this.dogs = externalDogs;
}
    
    public ArrayList <Dog> getDogs ()
    {
        return dogs; 
    }
}