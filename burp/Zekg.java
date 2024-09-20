package burp;

public class Zekg extends Zeku {
  private final short Zz;
  
  public Zekg(int paramInt) {
    this(paramInt, (short)0);
  }
  
  public Zekg(int paramInt, short paramShort) {
    super(paramInt, 2);
    this.Zz = paramShort;
  }
  
  public short Zc() {
    return this.Zz;
  }
  
  public void ZB(Zkit paramZkit, Zgpi paramZgpi1, Zgpi paramZgpi2) {
    short s = paramZkit.ZQ(paramZgpi1, this);
    paramZkit.ZE(paramZgpi2, this, s);
  }
  
  public void ZK(Zs7v paramZs7v) {
    paramZs7v.Zp(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zekg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */