package visitor;

public class Brasil implements IPaises{
    private double amount;

    public Brasil(){}

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void change(IVisitor visitor) {
        visitor.changeBrasil(this);
    }
}
