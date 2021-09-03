
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class Machine {
public static void main(String[] args) {
Machine vendingMachine = new Machine();
try {

Coin insertedCoin []=new Coin[1];
insertedCoin[0]=Coin.Hundred;

Optional<Bucket> bucket = vendingMachine.insertCoin(insertedCoin);
vendingMachine.displayInsertedCoinValue(insertedCoin);
if(bucket.isPresent()){
Bucket itemBucket = bucket.get();
displayInsertedCoinValue(itemBucket.getCoin());
}

} catch (Exception e) {

e.printStackTrace();
}
}
public static void displayInsertedCoinValue(List<Coin> list){
Optional<Integer> insertedCoinValue = list.stream().map(e->e.getCoinValue()).collect(Collectors.toList()).stream().reduce(Integer::sum);
int insertedValue = insertedCoinValue.get().intValue();
System.out.println("Return Coin value: "+insertedValue);
}
}