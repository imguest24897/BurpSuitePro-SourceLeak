package burp;

import java.util.List;
import java.util.function.Predicate;

public class Zxds implements Zs8u {
  private final Zkl6 ZL;
  
  private final List<Ztjg> ZJ;
  
  private final Zz3d Zp;
  
  private final Zt8d Zx;
  
  private Zt8d ZK;
  
  public Zxds(Zrgd paramZrgd, Zkl6 paramZkl6) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_2
    //   6: putfield ZL : Lburp/Zkl6;
    //   9: aload_0
    //   10: new java/util/concurrent/CopyOnWriteArrayList
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: putfield ZJ : Ljava/util/List;
    //   20: aload_0
    //   21: aload_1
    //   22: aload_2
    //   23: <illegal opcode> Zl : (Lburp/Zrgd;Lburp/Zkl6;)Lburp/Zz3d;
    //   28: putfield Zp : Lburp/Zz3d;
    //   31: aload_0
    //   32: new burp/Zt8d
    //   35: dup
    //   36: new burp/Zxjh
    //   39: dup
    //   40: invokespecial <init> : ()V
    //   43: aload_0
    //   44: getfield Zp : Lburp/Zz3d;
    //   47: aload_2
    //   48: invokespecial <init> : (Lburp/Zx7;Lburp/Zz3d;Lburp/Zkl6;)V
    //   51: putfield Zx : Lburp/Zt8d;
    //   54: return
  }
  
  public void Zg(Predicate<byte[]> paramPredicate, Zx7 paramZx7) {
    Ztjg ztjg = new Ztjg(true, paramPredicate, new Zt8d(paramZx7, this.Zp, this.ZL));
    this.ZJ.add(ztjg);
  }
  
  public void Zr(Predicate<byte[]> paramPredicate, Zx7 paramZx7) {
    Zk(paramPredicate, paramZx7, this.Zp);
  }
  
  public void Zk(Predicate<byte[]> paramPredicate, Zx7 paramZx7, Zz3d paramZz3d) {
    Ztjg ztjg = new Ztjg(false, paramPredicate, new Zt8d(paramZx7, paramZz3d, this.ZL));
    this.ZJ.add(ztjg);
  }
  
  public void Za(Predicate<byte[]> paramPredicate) {
    this.ZJ.removeIf(paramPredicate::lambda$removeResponseHandler$1);
  }
  
  public Zswq ZX(byte[] paramArrayOfbyte) {
    String str = Zm5k.Ze();
    for (Ztjg ztjg : this.ZJ) {
      if (ztjg.ZL(paramArrayOfbyte)) {
        if (ztjg.Zo())
          this.ZJ.remove(ztjg); 
        return ztjg.ZZ();
      } 
      if (str != null)
        break; 
    } 
    return (this.ZK == null) ? this.Zx : this.ZK;
  }
  
  public void Zs(Zx7 paramZx7) {
    this.ZK = (paramZx7 == null) ? null : new Zt8d(paramZx7, this.Zp, this.ZL);
  }
  
  private static boolean lambda$removeResponseHandler$1(Predicate paramPredicate, Ztjg paramZtjg) {
    return paramZtjg.ZG().equals(paramPredicate);
  }
  
  private static Zm7w lambda$new$0(Zrgd paramZrgd, Zkl6 paramZkl6, Zbw_ paramZbw_, Zgb6 paramZgb6) {
    return new Zmlo(paramZbw_, paramZgb6, paramZrgd, paramZkl6);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxds.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */