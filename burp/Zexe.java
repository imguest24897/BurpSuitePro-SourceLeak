package burp;

import java.util.ArrayList;
import java.util.List;

public abstract class Zexe<T extends Zb3t> {
  private static boolean Zw;
  
  protected void ZH(Zesp paramZesp1, Zesp paramZesp2) {
    Za(paramZesp1, paramZesp2, false);
  }
  
  protected void Za(Zesp paramZesp1, Zesp paramZesp2, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore #4
    //   5: iload_3
    //   6: ifeq -> 25
    //   9: new burp/Zm45
    //   12: dup
    //   13: aload_1
    //   14: aload_2
    //   15: invokespecial <init> : (Lburp/Zesp;Lburp/Zesp;)V
    //   18: astore #5
    //   20: iload #4
    //   22: ifne -> 36
    //   25: new burp/Zm4y
    //   28: dup
    //   29: aload_1
    //   30: aload_2
    //   31: invokespecial <init> : (Lburp/Zesp;Lburp/Zesp;)V
    //   34: astore #5
    //   36: aload_0
    //   37: aload_1
    //   38: aload #5
    //   40: invokevirtual Zy : (Lburp/Zesp;Lburp/Zgbi;)V
    //   43: aload_0
    //   44: aload_2
    //   45: aload #5
    //   47: invokevirtual Zy : (Lburp/Zesp;Lburp/Zgbi;)V
    //   50: return
  }
  
  protected void ZR(Zb3t paramZb3t, int paramInt, Zgc7 paramZgc7) {
    // Byte code:
    //   0: invokestatic ZM : ()Z
    //   3: istore #4
    //   5: aload_0
    //   6: aload_3
    //   7: iload_2
    //   8: invokevirtual Zx : (Lburp/Zgc7;I)Lburp/Zgcu;
    //   11: astore #5
    //   13: aload #5
    //   15: ifnull -> 57
    //   18: aload #5
    //   20: invokevirtual Zd : ()Lburp/Ztyn;
    //   23: astore #6
    //   25: new burp/Zgjt
    //   28: dup
    //   29: aload_1
    //   30: aload #6
    //   32: invokespecial <init> : (Lburp/Zesp;Lburp/Zesp;)V
    //   35: astore #7
    //   37: aload_0
    //   38: aload_1
    //   39: aload #7
    //   41: invokevirtual Zy : (Lburp/Zesp;Lburp/Zgbi;)V
    //   44: aload_0
    //   45: aload #6
    //   47: aload #7
    //   49: invokevirtual Zy : (Lburp/Zesp;Lburp/Zgbi;)V
    //   52: iload #4
    //   54: ifeq -> 90
    //   57: aload_3
    //   58: invokevirtual Zv : ()Lburp/Ztyn;
    //   61: astore #6
    //   63: new burp/Zgjt
    //   66: dup
    //   67: aload_1
    //   68: aload #6
    //   70: invokespecial <init> : (Lburp/Zesp;Lburp/Zesp;)V
    //   73: astore #7
    //   75: aload_0
    //   76: aload_1
    //   77: aload #7
    //   79: invokevirtual Zy : (Lburp/Zesp;Lburp/Zgbi;)V
    //   82: aload_0
    //   83: aload #6
    //   85: aload #7
    //   87: invokevirtual Zy : (Lburp/Zesp;Lburp/Zgbi;)V
    //   90: invokestatic Zwu : ()[Lburp/Zbqc;
    //   93: ifnonnull -> 109
    //   96: iload #4
    //   98: ifeq -> 105
    //   101: iconst_0
    //   102: goto -> 106
    //   105: iconst_1
    //   106: invokestatic ZX : (Z)V
    //   109: return
  }
  
  protected void Zt(Zesp paramZesp, Zgcs paramZgcs) {
    Zec9 zec9 = new Zec9(paramZesp, paramZgcs);
    Zy(paramZesp, zec9);
    Zy(paramZgcs, zec9);
  }
  
  protected void ZR(Zgcu paramZgcu, Zb3t paramZb3t) {
    boolean bool = ZK();
    Ztyn ztyn = paramZgcu.Zd();
    if (Ze(paramZgcu)) {
      ZH(ztyn, paramZb3t);
      if (!bool) {
        Zw(ztyn, paramZb3t);
        return;
      } 
      return;
    } 
    Zw(ztyn, paramZb3t);
  }
  
  protected void Zb(Zb3t paramZb3t, Zgcu paramZgcu) {
    Zl(paramZb3t, paramZgcu, false);
  }
  
  protected void Zl(Zb3t paramZb3t, Zgcu paramZgcu, boolean paramBoolean) {
    boolean bool = ZK();
    Ztyn ztyn = paramZgcu.Zd();
    if (Ze(paramZgcu)) {
      Za(paramZb3t, ztyn, paramBoolean);
      if (!bool) {
        Zw(paramZb3t, ztyn);
        return;
      } 
      return;
    } 
    Zw(paramZb3t, ztyn);
  }
  
  private void Zw(Zesp paramZesp1, Zesp paramZesp2) {
    Zriw zriw = new Zriw(paramZesp1, paramZesp2);
    Zy(paramZesp1, zriw);
    Zy(paramZesp2, zriw);
  }
  
  private void Zy(Zesp paramZesp, Zgbi paramZgbi) {
    List<Zgbi> list = paramZesp.<List>ZO(Zxc6.TaintHops);
    if (list == null) {
      list = new ArrayList(1);
      paramZesp.Zm(Zxc6.TaintHops, list);
    } 
    list.add(paramZgbi);
  }
  
  private Zgcu Zx(Zgc7 paramZgc7, int paramInt) {
    Zb3t zb3t = paramZgc7.ZC().get(3);
    return (zb3t.ZC().size() < paramInt * 2 + 1) ? null : (Zgcu)((Zb3t)zb3t.ZC().get(paramInt * 2)).ZC().get(0);
  }
  
  protected boolean Ze(Zgcu paramZgcu) {
    Zrqv zrqv = new Zrqv(paramZgcu);
    Ztyn ztyn = paramZgcu.Zd();
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool = ZK();
    for (Zb3t zb3t : zrqv) {
      List list = zb3t.<List>ZO(Zxc6.CodeSymbols);
      if (list != null && list.contains(ztyn))
        bool1 = true; 
      if (bool1)
        return !bool2; 
      if (Zl19.ZG(zb3t))
        bool2 = true; 
      if (!bool)
        break; 
    } 
    return false;
  }
  
  protected void Za(Zgc0 paramZgc0, Zgc9 paramZgc9) {
    Zc(paramZgc0, paramZgc9, false);
  }
  
  protected void Zc(Zgc0 paramZgc0, Zgc9 paramZgc9, boolean paramBoolean) {
    Zb3t zb3t = paramZgc9.ZC().get(paramZgc9.ZC().size() - 1);
    if (Zl19.Zr(zb3t)) {
      Zgcu zgcu = (Zgcu)zb3t.ZC().get(0);
      Za(paramZgc0, zgcu.Zd(), paramBoolean);
    } 
  }
  
  protected void ZJ(Zgc0 paramZgc0, Zgcw paramZgcw) {
    Zj(paramZgc0, paramZgcw, false);
  }
  
  protected void Zj(Zgc0 paramZgc0, Zgcw paramZgcw, boolean paramBoolean) {
    boolean bool = ZM();
    Zb3t zb3t = paramZgcw.ZC().get(0);
    if (Zl19.Zr(zb3t)) {
      Zgcu zgcu = (Zgcu)zb3t.ZC().get(0);
      Za(paramZgc0, zgcu.Zd(), paramBoolean);
      if (bool) {
        if (Zl19.ZZ(zb3t))
          Zc(paramZgc0, (Zgc9)zb3t.ZC().get(0), paramBoolean); 
        return;
      } 
      return;
    } 
    if (Zl19.ZZ(zb3t))
      Zc(paramZgc0, (Zgc9)zb3t.ZC().get(0), paramBoolean); 
  }
  
  public static void ZX(boolean paramBoolean) {
    Zw = paramBoolean;
  }
  
  public static boolean ZK() {
    return Zw;
  }
  
  public static boolean ZM() {
    boolean bool = ZK();
    return !bool;
  }
  
  static {
    if (!ZK())
      ZX(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zexe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */