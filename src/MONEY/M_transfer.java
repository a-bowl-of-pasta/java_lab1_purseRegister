package MONEY;

public class M_transfer
{
  public void moneyTransfer(moneyContainer obj1, moneyContainer obj2, double transferAmount)
  {
      obj1.remove(transferAmount);
      obj2.add(transferAmount);
  }

}
