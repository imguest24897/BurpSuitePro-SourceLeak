package burp;

public class Zx7b extends Zxsr implements Zrer {
  private static int Ze;
  
  Zx7b(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public boolean ZrO() {
    return this.Za.Zi(this, Zk4u.Z_);
  }
  
  public void ZFX(boolean paramBoolean) {
    this.Za.ZH(this, Zk4u.Z_, paramBoolean);
  }
  
  public String Zrh() {
    return this.Za.ZJ(this, Zk4u.Zi);
  }
  
  public Ztri ZrJ() {
    return this.Za.<Ztri>ZJ(this, Zk4u.Zy);
  }
  
  public Zeu4<Zrer> ZF() {
    return Zg;
  }
  
  public static void ZR(int paramInt) {
    Ze = paramInt;
  }
  
  public static int ZEF() {
    return Ze;
  }
  
  public static int ZEH() {
    int i = ZEF();
    return (i == 0) ? 80 : 0;
  }
  
  static {
    if (ZEH() != 0)
      ZR(114); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx7b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */