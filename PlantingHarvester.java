import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  Creates a new subclass called PlantingHarvester.
 *  Harvests a row by hopping, picking, hopping, then planting.
 *
 *  @author Mykayla Fernandes (mkaykay1)
 *  @version (2015.09.03)
 */
public class PlantingHarvester extends SkippingHarvester
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new PlantingHarvester object.
     * @param x     The-coordinate of the Jeroo's location
     * @param y     The y-coordinate of the Jeroo's location.
     */
    public PlantingHarvester(int x, int y)
    {
       super(x, y);
    }


    //~ Methods ...............................................................

    //Hops, picks, hops then plants
    public void harvestRow()
    {
        this.hopAndPick();
        this.hop();
        this.plant();
        this.hopAndPick();
        this.hop();
        this.plant();
        this.hopAndPick();
        this.hop();
        this.plant();
    }
}