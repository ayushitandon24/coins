
import java.util.List;
public class Bucket {

private List<Coin> coin;

public Bucket(List<Coin> coins) {

this.coin = coins;
}

public List<Coin> getCoin() {
return coin;
}
public void setCoin(List<Coin> coin) {
this.coin = coin;
}
}