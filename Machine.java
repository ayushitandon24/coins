import java.awt.List;
import java.util.stream.Collectors;

public class Machine implements Machine2 {


private Inventory<Coin, Integer> cashInventory = new Inventory<Coin, Integer>();

private int currentBalance;

public Machine() {
initialize();
}
private void initialize() {

this.cashInventory.putInventory(Coin.One, 1);
this.cashInventory.putInventory(Coin.Five, 5);
this.cashInventory.putInventory(Coin.Ten,10);
this.cashInventory.putInventory(Coin.Twenty,20);
this.cashInventory.putInventory(Coin.Fifty,50);
this.cashInventory.putInventory(Coin.Hundred,100);
this.setCurrentBalance();
}
private void setCurrentBalance() {
if(this.cashInventory.getInvetory().size() >0){
List<Integer> cashCoinList = this.cashInventory.getInvetory().entrySet()
.stream().map(e->e.getKey().getCoinValue()*e.getValue())
.collect(Collectors.toList());
Optional<Integer> currentBalance = cashCoinList.stream().reduce(Integer::sum);
this.currentBalance = currentBalance.get().intValue();
}
}

public void displayInsertedCoinValue(Coin… coins){
Optional<Integer> insertedCoinValue = Arrays.asList(coins).stream().map(e->e.getCoinValue()).collect(Collectors.toList()).stream().reduce(Integer::sum);
int insertedValue = insertedCoinValue.get().intValue();
System.out.println(“Inserted Coin Value: “+insertedValue);
}
@Override
public Optional<Bucket> insertCoin(Coin… coins) throws NotFullPaidException, ItemNotSelectedException {

Bucket bucket= null;

