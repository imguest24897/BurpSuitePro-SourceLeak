package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import net.portswigger.Zdo;

class Zg8d extends Zg8k {
  Zg8d(Zlfa paramZlfa, List<Zkq1> paramList, Zr_d paramZr_d, Zzlx paramZzlx, Zr_4 paramZr_4) {
    super(paramZlfa, paramList, paramZr_d, paramZzlx);
    int i = paramZr_d.ZR();
    Zbqc[] arrayOfZbqc = Zg8k.Zt();
    ArrayList<Integer> arrayList = new ArrayList(i);
    int j = 0;
    while (j < i) {
      if (!((Zkq1)this.ZY.get(j)).Zgx())
        arrayList.add(Integer.valueOf(j)); 
      j++;
      if (arrayOfZbqc != null)
        break; 
    } 
    j = arrayList.size();
    Zmyi zmyi = paramZr_4.<Zmyi>Zv(Zmyi.Zp, j);
    byte b = 0;
    while (b < j) {
      zmyi.ZX(b, ((Integer)arrayList.get(b)).intValue());
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    paramZlfa.Zu(zmyi);
    b = 1;
    while (b < j) {
      int k = zmyi.ZN(b);
      paramZlfa.ZjB().Zc(Integer.valueOf(k), ((Zkq1)this.ZY.get(k)).ZD(paramZzlx, paramZr_d.Zl(k)));
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zg8k.Z_(new Zbqc[5]); 
  }
  
  Zg8d(Zlfa paramZlfa, List<Zkq1> paramList, Zr_d paramZr_d, int paramInt, boolean paramBoolean, Supplier<Zzlx> paramSupplier) {
    super(paramZlfa, paramList, paramZr_d, paramInt, paramBoolean, paramSupplier);
  }
  
  protected void ZP() {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: invokestatic Zt : ()[Lburp/Zbqc;
    //   5: iconst_0
    //   6: istore_3
    //   7: astore_1
    //   8: aload_0
    //   9: getfield Zy : Lburp/Zr_d;
    //   12: invokevirtual ZR : ()I
    //   15: istore #4
    //   17: iconst_0
    //   18: istore #5
    //   20: iload #5
    //   22: iload #4
    //   24: if_icmpge -> 87
    //   27: aload_0
    //   28: getfield ZY : Ljava/util/List;
    //   31: iload #5
    //   33: invokeinterface get : (I)Ljava/lang/Object;
    //   38: checkcast burp/Zkq1
    //   41: astore #6
    //   43: aload #6
    //   45: invokeinterface ZyP : ()Z
    //   50: ifeq -> 55
    //   53: iconst_1
    //   54: istore_3
    //   55: aload #6
    //   57: invokeinterface Zyv : ()I
    //   62: istore #7
    //   64: iload #7
    //   66: ifge -> 75
    //   69: iconst_m1
    //   70: istore_2
    //   71: aload_1
    //   72: ifnull -> 80
    //   75: iload_2
    //   76: iload #7
    //   78: imul
    //   79: istore_2
    //   80: iinc #5, 1
    //   83: aload_1
    //   84: ifnull -> 20
    //   87: aload_0
    //   88: getfield Zq : Ljava/util/concurrent/atomic/AtomicInteger;
    //   91: iload_2
    //   92: invokevirtual set : (I)V
    //   95: aload_0
    //   96: getfield Zn : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   99: iload_3
    //   100: invokevirtual set : (Z)V
    //   103: return
  }
  
  public byte[][][] Zw() throws Ztku {
    Zxph zxph = this.ZC.ZjB();
    int i = this.Zy.ZR();
    Zbqc[] arrayOfZbqc = Zg8k.Zt();
    Zmyi zmyi = this.ZC.Zjz();
    int j = zmyi.ZN(0);
    Zzlx zzlx = this.Zj.get();
    try {
    
    } catch (Ztku ztku) {
      throw a(null);
    } 
    zxph.Zc(Integer.valueOf(j), ((Zkq1)this.ZY.get(j)).ZD(zzlx, (j * 2 + 1 < i) ? this.Zy.Zl(j) : Zdo.ZQ));
    byte b = 0;
    while (b < zmyi.Zpu() - 1) {
      int k = zmyi.ZN(b);
      try {
        if (zxph.Zo(Integer.valueOf(k)) == null) {
          try {
            ((Zkq1)this.ZY.get(k)).Zy4();
          } catch (Ztku ztku) {
            throw a(null);
          } 
          zxph.Zc(Integer.valueOf(k), ((Zkq1)this.ZY.get(k)).ZD(zzlx, (k * 2 + 1 < i) ? this.Zy.Zl(k) : Zdo.ZQ));
          int m = zmyi.ZN(b + 1);
          try {
          
          } catch (Ztku ztku) {
            throw a(null);
          } 
          zxph.Zc(Integer.valueOf(m), ((Zkq1)this.ZY.get(m)).ZD(zzlx, (m * 2 + 1 < i) ? this.Zy.Zl(m * 2) : Zdo.ZQ));
        } 
      } catch (Ztku ztku) {
        throw a(null);
      } 
      try {
        if (zxph.Zo(Integer.valueOf(k)) == null)
          return null; 
      } catch (Ztku ztku) {
        throw a(null);
      } 
      b++;
      if (arrayOfZbqc != null) {
        Zbqc.Zr(new Zbqc[1]);
        break;
      } 
    } 
    try {
      if (zxph.Zo(Integer.valueOf(zmyi.ZN(zmyi.Zpu() - 1))) == null)
        return null; 
    } catch (Ztku ztku) {
      throw a(null);
    } 
    this.ZE.ZV();
    b = 0;
    while (b < i) {
      Zkq1 zkq1 = this.ZY.get(b);
      try {
        if (zkq1.Zgx()) {
          try {
          
          } catch (Ztku ztku) {
            throw a(null);
          } 
          zxph.Zc(Integer.valueOf(b), zkq1.ZK(zzlx, (b * 2 + 1 < i) ? this.Zy.Zl(b) : Zdo.ZQ, zxph.ZxY()));
        } 
      } catch (Ztku ztku) {
        throw a(null);
      } 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return zxph.ZxY();
  }
  
  protected void Zz(Zxph paramZxph, int paramInt) {
    Zkq1 zkq1 = this.ZY.get(paramInt);
    paramZxph.Zs(Integer.valueOf(paramInt), zkq1.Zm(paramZxph.Zm(Integer.valueOf(paramInt)), false));
    paramZxph.Zz(Integer.valueOf(paramInt), zkq1.Zyn().Zd(paramZxph.ZK(Integer.valueOf(paramInt))));
  }
  
  private static Ztku a(Ztku paramZtku) {
    return paramZtku;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg8d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */