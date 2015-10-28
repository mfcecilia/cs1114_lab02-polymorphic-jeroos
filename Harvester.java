import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 * Create a new Jeroo subclass called Harvester.
 * Create a hop and pick method that makes it hop once then pick a flower.
 * Create a method using the first method so
 * that it hops and picks twice in a row.
 * Call a third method using the second 
 * method in order to harvest an entire row.
 *
 *  @author Mykayla Fernandes (mkaykay1)
 *  @version (2015.09.03)
 */
public class Harvester extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Harvester object facing east with no flowers.
     * @param x     The-coordinate of the Jeroo's location.
     * @param y     The y-coordinate of the Jeroo's location.
     */
    public Harvester(int x, int y) 
    {
        super(x, y);
    }


    //~ Methods ...............................................................

//Hops once and picks once.
    public void hopAndPick()
    {
        this.hop();
        this.pick();

    }
//Hops and picks twice in a row.
    public void hop2AndPick()
    {
        this.hopAndPick();
        this.hopAndPick();
    }
//Calls hopAndPick 3 times to harvest a full row
    public void harvestRow()
    {
        this.hop2AndPick();
        this.hop2AndPick();
        this.hop2AndPick();
    }   
}
