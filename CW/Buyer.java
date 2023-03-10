package Seminar2.CW;

public abstract class Buyer implements BuyerBehavor {
    protected String name;
    protected boolean isMakeOrderClass;
    protected boolean isTakeOrderClass;
    abstract String getName();
}
