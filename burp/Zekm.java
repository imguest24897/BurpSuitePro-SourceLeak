package burp;

public class Zekm extends Zeku {
  private final long Zs;
  
  public Zekm(int paramInt) {
    this(paramInt, 0L);
  }
  
  public Zekm(int paramInt, long paramLong) {
    super(paramInt, 8);
    this.Zs = paramLong;
  }
  
  public long ZL() {
    return this.Zs;
  }
  
  public void ZB(Zkit paramZkit, Zgpi paramZgpi1, Zgpi paramZgpi2) {
    long l = paramZkit.ZL(paramZgpi1, this);
    paramZkit.ZV(paramZgpi2, this, l);
  }
  
  public void ZK(Zs7v paramZs7v) {
    paramZs7v.Zb(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zekm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */