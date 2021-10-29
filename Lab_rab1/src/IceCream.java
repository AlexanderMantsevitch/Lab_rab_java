public class IceCream extends Food
{


    private String syrup;

    public IceCream (String syrup)
    {
        super ("IceCream");
        this.syrup = syrup;
    }


    public void consume ()
    {

       System.out.println( this + " скушали");

    }

    public Integer calculateCalories()
    {
        if (syrup.equals( "шоколад") ) return 500;
        if (syrup.equals( "карамель")) return 600;
        else return 0;

    }
    public String toString ()
    {
        return super.toString() + " c сиропом " + syrup;

    }
    public String  get_syrup()
    {
        return syrup;

    }

    public void set_syrup (String syrup1)
    {
        syrup = syrup1;

    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
        if (!(arg0 instanceof IceCream)) return false;
      //  if (syrup==null || ((IceCream)arg0).syrup==null) return false;
        return syrup.equals(((IceCream)arg0).syrup);
        } else
        {
            return false;
        }
    }

}
