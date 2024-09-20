package burp;

public class Zrjf implements Zgl6 {
  private static final Zems Za = new Zems();
  
  private final byte Zk;
  
  private final String ZN;
  
  public Zrjf(byte paramByte, String paramString) {
    this.Zk = paramByte;
    this.ZN = paramString;
  }
  
  public boolean Zv(Zkv8 paramZkv8) {
    if ((paramZkv8.Zw()).ZX != this.Zk)
      return false; 
    Zg5y zg5y = (Zg5y)paramZkv8;
    return Za.ZQ(zg5y.Zl, zg5y.ZL, this.ZN);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrjf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */