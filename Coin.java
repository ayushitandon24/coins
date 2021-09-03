

public enum Coin {
 One(1),Five(5),Ten(10),Twenty(20),Fifty(50),Hundred(100);
private int coinValue;
Coin(int i) {
this.coinValue = i;
}
public int getCoinValue(){
return this.coinValue;
}
}