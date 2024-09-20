package burp;

import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Ze97 {
  private final Zrbm Zw;
  
  private final Zz1m<Zt13> ZO;
  
  private final Queue<Zlku> ZR;
  
  private final Queue<Zk9r> Zr;
  
  private Zswj Zx;
  
  private static boolean Zp;
  
  public Ze97(Zrbm paramZrbm, Zz1m<Zt13> paramZz1m) {
    this.Zw = paramZrbm;
    this.ZO = paramZz1m;
    this.ZR = new ConcurrentLinkedQueue<>();
    this.Zr = new ConcurrentLinkedQueue<>();
  }
  
  public void Zm(Zswj paramZswj) {
    this.Zx = paramZswj;
  }
  
  public void ZR(Zlku paramZlku) {
    this.ZR.add(paramZlku);
    this.ZO.ZD(Zt13.Z_);
  }
  
  public void ZG(Collection<Zlku> paramCollection) {
    if (!paramCollection.isEmpty()) {
      this.ZR.addAll(paramCollection);
      this.ZO.ZD(Zt13.Z_);
    } 
  }
  
  public void Z_(Zk9r paramZk9r) {
    this.Zr.add(paramZk9r);
    this.ZO.ZD(Zt13.Zf);
  }
  
  public void Zc(Collection<Zk9r> paramCollection) {
    if (!paramCollection.isEmpty()) {
      this.Zr.addAll(paramCollection);
      this.ZO.ZD(Zt13.Zf);
    } 
  }
  
  public Zk9r ZN() {
    if (this.Zr.isEmpty())
      Zu(); 
    return this.Zr.poll();
  }
  
  public Zlku ZV() {
    return this.ZR.poll();
  }
  
  public int Zb() {
    return this.Zr.size();
  }
  
  public int Zw() {
    return this.ZR.size();
  }
  
  public void Zc() {
    this.Zx.ZV();
  }
  
  public String toString() {
    return this.Zr.toString();
  }
  
  private void Zu() {
    Zxa2 zxa2 = this.Zw.Zt();
    if (zxa2 != null)
      (new Zd_(zxa2, this, this.Zx)).Zr(); 
  }
  
  public static void ZP(boolean paramBoolean) {
    Zp = paramBoolean;
  }
  
  public static boolean ZJ() {
    return Zp;
  }
  
  public static boolean Zo() {
    boolean bool = ZJ();
    return !bool;
  }
  
  static {
    if (Zo())
      ZP(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze97.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */