package Ofactory;

public  abstract class FactoryGenerator {
    public static AbstractPayFactory getFactory(FactoryType factoryType)
    {
        switch (factoryType){
            case CashFactory:return new CashFactory();
            case OnlineFactory:return new OnlineFactory();
        }
        return null;
    }
}
