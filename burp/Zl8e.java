package burp;

public class Zl8e implements Zrb2 {
  private final Zxs7 Zs;
  
  private String Zk;
  
  public Zl8e(Zxs7 paramZxs7) {
    this.Zs = paramZxs7;
    this.Zk = null;
  }
  
  public String Zd() {
    return this.Zk;
  }
  
  public byte Zz() {
    return 2;
  }
  
  public byte Zq() {
    return 0;
  }
  
  public boolean Zw() {
    boolean bool = Ztu2.ZH();
    if (this.Zs.Zy())
      this.Zk = (new Zxn0(this.Zs.ZI())).Zn(); 
    if (!bool)
      Zbqc.Zr(new Zbqc[3]); 
    return (this.Zk != null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl8e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */