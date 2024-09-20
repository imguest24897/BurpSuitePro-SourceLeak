package burp;

class Zk8s {
  private final Zbnt Z_;
  
  private final Zey9 Zv;
  
  private final Zerg ZU;
  
  Zk8s(Zbnt paramZbnt, Zey9 paramZey9, Zerg paramZerg) {
    this.Z_ = paramZbnt;
    this.Zv = paramZey9;
    this.ZU = paramZerg;
  }
  
  Zsoq ZK(Zbza paramZbza) {
    Zmzk zmzk = paramZbza.Zg0();
    byte[] arrayOfByte = paramZbza.ZgC();
    return new Zsoq(this.Zv.ZY(zmzk, arrayOfByte), paramZbza.ZgW(), paramZbza.Zgf(), this.Z_, this.ZU);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk8s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */