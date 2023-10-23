package OOP.Domain;

public class Product 
{
    private String name;
    private double price;
    private ProdType type;

    public Product (String name, double price, ProdType type)
    {
        this.name = name;
        this.type = type;
        SetPrice(price);
    }

    public void SetName(String name)
    {
        this.name = name;
    }

    public void SetPrice(double price)
    {
         if(price < 0)
        {
            this.price = 10;
        }
        else
        {
            this.price = price;
        }
    }

    public String GetName()
    {
        return name;
    }

    public double GetPrice()
    {
        return price;
    }

    public ProdType GetType()
    {
        return type;
    }

    @Override
    public String toString()
        {
            return ("Product: price = " + this.price + "; type = " + this.type.getName() + "; name = " + this.name);
        }
}

