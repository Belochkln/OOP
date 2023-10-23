package OOP.Domain;


public class HotDrink extends Product
{ 
    private int HotDrinkTemp;

    public HotDrink(String name, double price, int HotDrinkTemp)
    {
        super(name, price, new ProdType("HotDrink"));
        this.HotDrinkTemp = HotDrinkTemp;
    }

    public void setHotDrinkTemp(int HotDrinkTemp)
    {
        this.HotDrinkTemp = HotDrinkTemp;
    }

    public int getHotDrinkTemp()
    {
        return HotDrinkTemp;
    }

    @Override
    public String toString()
    {
        return super.toString() + "; temperature: " + HotDrinkTemp;
    }
}

