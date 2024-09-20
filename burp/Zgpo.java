package burp;

import java.util.ArrayList;
import java.util.List;

class Zgpo {
  private final List<Zl1r> Ze = new ArrayList<>();
  
  private final List<Ztu8> Zx;
  
  private int ZT = -1;
  
  private int ZD;
  
  private Zgpo(List<Ztu8> paramList) {
    this.Zx = paramList;
  }
  
  void ZU(int paramInt) {
    // Byte code:
    //   0: invokestatic ZP : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZT : I
    //   8: iconst_m1
    //   9: if_icmpne -> 26
    //   12: aload_0
    //   13: iload_1
    //   14: putfield ZT : I
    //   17: aload_0
    //   18: iload_1
    //   19: putfield ZD : I
    //   22: aload_2
    //   23: ifnull -> 59
    //   26: iload_1
    //   27: aload_0
    //   28: getfield ZD : I
    //   31: iconst_1
    //   32: iadd
    //   33: if_icmpne -> 45
    //   36: aload_0
    //   37: iload_1
    //   38: putfield ZD : I
    //   41: aload_2
    //   42: ifnull -> 59
    //   45: aload_0
    //   46: invokevirtual Zm : ()V
    //   49: aload_0
    //   50: iload_1
    //   51: putfield ZT : I
    //   54: aload_0
    //   55: iload_1
    //   56: putfield ZD : I
    //   59: return
  }
  
  public List<Zl1r> Zu() {
    if (this.ZT > 0 && this.ZT < this.Zx.size())
      Zm(); 
    return this.Ze;
  }
  
  private void Zm() {
    this.Ze.add(new Zl1r(((Ztu8)this.Zx.get(this.ZT - 1)).ZlK(), ((Ztu8)this.Zx.get(this.ZD - 1)).Zli()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgpo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */