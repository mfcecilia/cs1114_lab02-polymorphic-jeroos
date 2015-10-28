import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  Creates a Skipping Harvester
 *  Harvests a row by hopping, picking, and hopping
 *
 *  @author Mykayla Fernandes (mkaykay1)
 *  @version 2015.09.03
 */
public class SkippingHarvester extends Harvester
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new SkippingHarvester object facing east with no flowers.
     * @param x     The x-coordinate of the Jeroo's location.
     * @param y     The y-coordinate of the Jeroo's location
     */
    public SkippingHarvester(int x, int y)
    {
        super(x, y);
    }


    //~ Methods ...............................................................

//Hops, picks, and hops
    public void harvestRow()
    {
        this.hopAndPick();
        this.hop();
        this.hopAndPick();
        this.hop();
        this.hopAndPick();
        this.hop();
    }
}