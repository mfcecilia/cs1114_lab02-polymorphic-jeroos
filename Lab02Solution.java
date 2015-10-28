import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 * Create a new Jeroo subclasses called harvester, 
 * skipping harvester, and planting harvester.
 * Call a method that makes the Jeroos pick and/or plant a full row of flowers.
 *
 *  @author Mykayla Fernandes (mkaykay1)
 *  @version (2015.09.03)
 */
public class Lab02Solution extends PlantationIsland
{
    //~ Fields ................................................................

   // ----------------------------------------------------------
/**
     * Creates a new Lab02Solution object.
     */
    public Lab02Solution()
    {
        // Nothing to initialize, leaving the world a default size
    } 
    
   //~ Constructor ...........................................................
    public void myProgram()
    {
        Harvester mykayla = new Harvester(2, 3);
        this.add(mykayla);
        mykayla.harvestRow();
    
        SkippingHarvester cecilia = new SkippingHarvester(2, 5);
        this.add(cecilia);
        cecilia.harvestRow();
    
        PlantingHarvester fernandes = new PlantingHarvester(2, 7);
        this.add(fernandes);
        fernandes.harvestRow();
 
    } 



    
    //~ Methods ...............................................................


}
