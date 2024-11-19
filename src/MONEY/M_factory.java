package MONEY;

public class M_factory
{

    public moneyContainer moneyFactory(String type)
    {
        switch(type)
        {
            case "purse":
                return new purse();
            case "register":
                return new register();
            default:
                throw new RuntimeException();
        }
    }

}
