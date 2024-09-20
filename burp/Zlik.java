package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Zlik implements Zmv4 {
  private final Zb3t ZZ;
  
  private final Zmv4 ZH;
  
  private final Zrn9 ZJ;
  
  private final List<Zgc7> Zt;
  
  private final Zzzp Zp;
  
  private final Zxpd Zc;
  
  private int ZI;
  
  private Zmu7 Zg;
  
  private Iterator<Zgc7> Zo;
  
  private Zzzp ZR;
  
  private static int ZS;
  
  public Zlik(Zb3t paramZb3t, Zmv4 paramZmv4, Zrn9 paramZrn9, List<Zgc7> paramList, Zzzp paramZzzp, Zxpd paramZxpd) {
    this.ZZ = paramZb3t;
    this.ZH = paramZmv4;
    this.ZJ = paramZrn9;
    this.Zt = paramList;
    this.Zp = paramZzzp;
    this.Zc = paramZxpd;
  }
  
  public void ZO(Zkr1<Zmv4> paramZkr1) {
    paramZkr1.Zy(this);
  }
  
  public void Za(int paramInt) {
    this.Zc.ZZ();
    this.ZI = paramInt;
    this.Zo = ZE();
    this.Zg = ZM(paramInt);
  }
  
  public boolean Za(Zb3t paramZb3t, int paramInt) {
    return false;
  }
  
  public Zb3t ZM() {
    return this.ZZ;
  }
  
  public int ZP() {
    return this.ZI;
  }
  
  public Zmu7 ZC() {
    return this.Zg;
  }
  
  public Iterator<Zb3t> ZX() {
    return this.Zg.Zm();
  }
  
  private Iterator<Zgc7> ZE() {
    int i = ZV();
    ArrayList<Zgc7> arrayList = new ArrayList();
    if (this.ZI >= this.ZJ.ZP())
      return (new ArrayList<>(0)).iterator(); 
    Zb3t zb3t = this.ZJ.Zp().get(this.ZI);
    for (Zgc7 zgc7 : this.Zt) {
      Set set = zgc7.<Set>ZO(Zxc6.ReachableNodes);
      if (set != null && set.contains(zb3t))
        arrayList.add(zgc7); 
      if (i != 0)
        break; 
    } 
    return arrayList.iterator();
  }
  
  private Zmu7 ZM(int paramInt) {
    int i = ZY();
    if (this.Zo.hasNext()) {
      this.ZR = new Zzzp(this.Zo.next(), this.ZJ, paramInt, this.Zp, this.Zc);
      Zbxh zbxh = new Zbxh(this);
      return (Zmu7)((i == 0) ? new Zxzg(this) : zbxh);
    } 
    return new Zxzg(this);
  }
  
  public static void ZO(int paramInt) {
    ZS = paramInt;
  }
  
  public static int ZY() {
    return ZS;
  }
  
  public static int ZV() {
    int i = ZY();
    return (i == 0) ? 53 : 0;
  }
  
  static {
    if (ZY() == 0)
      ZO(13); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlik.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */