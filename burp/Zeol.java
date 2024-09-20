package burp;

public class Zeol implements Zt3k {
  private final boolean ZX;
  
  private final boolean Ze;
  
  private final boolean Zo;
  
  private final boolean Zk;
  
  public Zeol(Zg9c paramZg9c) {
    this.ZX = !paramZg9c.Z_b();
    this.Ze = !paramZg9c.Z_P();
    this.Zo = !paramZg9c.Z_u();
    this.Zk = !paramZg9c.Z_4();
    if (Zbqc.Zwu() == null)
      Zlkf.ZN(new String[1]); 
  }
  
  public boolean Zo(Zto7 paramZto7) {
    short s = paramZto7.Zl7();
    return (s < 200) ? false : ((s < 300) ? this.ZX : ((s < 400) ? this.Ze : ((s < 500) ? this.Zo : ((s < 600) ? this.Zk : false))));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeol.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */