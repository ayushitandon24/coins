
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Inventory<T, T2>{

private HashMap<T,T2> inventory = new HashMap<T,T2>();

public boolean hashItem(Coin coin) {
// TODO Auto-generated method stub
//return inentory.contains(product) ;
return true;
}
public HashMap<T,T2> getInvetory() {
return inventory;
}

public void putInventory(T t, T2 t2){
this.inventory.put(t, t2);
}
}