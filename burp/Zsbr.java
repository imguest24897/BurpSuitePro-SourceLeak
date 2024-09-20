package burp;

public class Zsbr implements Zehu {
  private final Zlhn Zk;
  
  Zsbr(Zlhn paramZlhn) {
    this.Zk = paramZlhn;
  }
  
  public void Zf(Zrmw paramZrmw) {
    String[] arrayOfString = Ztub.Zo();
    if (this.Zk.ZmQ() != null)
      this.Zk.ZmQ().Zu2().Zf(paramZrmw); 
    for (Zzi8 zzi8 : this.Zk.Zmq()) {
      paramZrmw.Zo(zzi8);
      if (arrayOfString == null)
        break; 
    } 
    paramZrmw.ZM(this.Zk);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsbr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */