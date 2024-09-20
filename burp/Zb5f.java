package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.SwingUtilities;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zb5f<T extends Zmw9<?>> extends Zbqc implements Zecu<T> {
  protected final Zz0n ZB;
  
  protected final Zerg Zy;
  
  protected final Zgb6 Zh;
  
  protected final Zskh ZD;
  
  protected final Zbnt Zk;
  
  protected final Ztwv ZR;
  
  protected final Ztyg Z_;
  
  private final Zgq7 Zl;
  
  private final int ZW;
  
  private final int Zo;
  
  private final Zbdf[] Zs;
  
  private final Zbdx Zr;
  
  private final List<Zgib> Zu;
  
  private final List<Zgib> Zc;
  
  private final Zlu8<T> Zj;
  
  protected final AtomicReference<T> Zq = new AtomicReference<>();
  
  protected T ZT;
  
  private int ZA;
  
  private int ZZ;
  
  private final boolean[] ZS;
  
  protected final boolean[] ZH;
  
  private final byte[] Zn;
  
  private static final String a;
  
  protected Zb5f(Zz0n paramZz0n, Zerg paramZerg, Zgb6 paramZgb6, Zskh paramZskh, Zbnt paramZbnt, Ztwv paramZtwv, Ztyg paramZtyg, Zgq7 paramZgq7, int paramInt1, int paramInt2, boolean paramBoolean, Zv8r paramZv8r1, Zv8r paramZv8r2, Zze0 paramZze0, Zm6x paramZm6x) {
    this.ZB = paramZz0n;
    this.Zy = paramZerg;
    this.Zh = paramZgb6;
    this.ZD = paramZskh;
    this.Zk = paramZbnt;
    this.ZR = paramZtwv;
    this.Z_ = paramZtyg;
    this.Zl = paramZgq7;
    this.ZW = paramInt1;
    this.Zo = paramInt2;
    int i = paramInt1 + paramInt2;
    this.Zs = new Zbdf[i];
    this.ZS = new boolean[i];
    this.ZH = new boolean[i];
    this.Zn = new byte[i];
    this.Zu = new ArrayList<>();
    this.Zc = new ArrayList<>();
    this.Zj = paramBoolean ? (Zlu8)new Zlu8<>(this::Zc, paramZv8r1, paramZv8r2, paramZze0, paramZm6x) : null;
    if (this.Zj != null) {
      Zmt5<Zluv> zmt5 = paramZm6x.ZP(Zluv.class, this::lambda$new$0);
      Zmt5<Zg4r> zmt51 = paramZm6x.ZO(Zg4r.class, Zehw.SWING, this::lambda$new$2);
      Zmt5<Zt4d> zmt52 = paramZm6x.ZO(Zt4d.class, Zehw.SWING, this::lambda$new$4);
      new Zbiq(this, paramZm6x, (Zmt5<?>[])new Zmt5[] { zmt5, zmt51, zmt52 });
    } 
    this.Zr = Ze0();
    Zmse.Zf(this, 60, 8);
    setLayout(new BorderLayout());
    add(this.Zr, a);
  }
  
  public void Zn(int paramInt) {
    if (this.ZS[paramInt])
      return; 
    if (this.ZT == null)
      return; 
    Zl(this.Zs[paramInt], paramInt);
    this.ZS[paramInt] = true;
  }
  
  public void Zm(T paramT) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zq : Ljava/util/concurrent/atomic/AtomicReference;
    //   4: aload_1
    //   5: invokevirtual set : (Ljava/lang/Object;)V
    //   8: new javax/swing/Timer
    //   11: dup
    //   12: bipush #100
    //   14: aload_0
    //   15: aload_1
    //   16: <illegal opcode> actionPerformed : (Lburp/Zb5f;Lburp/Zmw9;)Ljava/awt/event/ActionListener;
    //   21: invokespecial <init> : (ILjava/awt/event/ActionListener;)V
    //   24: astore_2
    //   25: aload_2
    //   26: iconst_0
    //   27: invokevirtual setRepeats : (Z)V
    //   30: aload_2
    //   31: invokevirtual start : ()V
    //   34: return
  }
  
  public void Zq(T paramT) {
    // Byte code:
    //   0: invokestatic Zo : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zq : Ljava/util/concurrent/atomic/AtomicReference;
    //   8: aload_1
    //   9: invokevirtual set : (Ljava/lang/Object;)V
    //   12: invokestatic isEventDispatchThread : ()Z
    //   15: ifeq -> 28
    //   18: aload_0
    //   19: aload_1
    //   20: iconst_0
    //   21: invokevirtual ZZ : (Lburp/Zmw9;Z)V
    //   24: iload_2
    //   25: ifne -> 38
    //   28: aload_0
    //   29: aload_1
    //   30: <illegal opcode> run : (Lburp/Zb5f;Lburp/Zmw9;)Ljava/lang/Runnable;
    //   35: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   38: return
  }
  
  public void Z_() {
    boolean bool = Ztua.ZX();
    this.Zq.set(this.ZT);
    if (SwingUtilities.isEventDispatchThread()) {
      ZZ(this.ZT, true);
      if (bool) {
        SwingUtilities.invokeLater(this::lambda$updateCurrentItem$7);
        return;
      } 
      return;
    } 
    SwingUtilities.invokeLater(this::lambda$updateCurrentItem$7);
  }
  
  public Component Zxw() {
    return this;
  }
  
  public T Zxj() {
    return this.ZT;
  }
  
  public List<Component> ZT() {
    return this.Zs[this.Zn[this.ZA]].Zo();
  }
  
  public void ZC() {
    if (this.Zj != null) {
      Zbxj zbxj = this.Zr.Zs();
      zbxj.Zv(Zs_i.NOTES);
      zbxj.ZJ(true);
      this.Zj.ZH();
    } 
  }
  
  public void Zc() {
    this.Zj.ZI();
  }
  
  private Zbdx Ze0() {
    return ZR(this::lambda$makeRequestResponseViewer$8);
  }
  
  private void ZZ(T paramT, boolean paramBoolean) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    if (this.Zj != null)
      this.Zj.ZI(); 
    if (this.ZT != null && this.ZT.ZF(paramT) && !paramBoolean)
      return; 
    this.ZT = paramT;
    if (this.Zj != null)
      this.Zj.ZS(this.ZT); 
    if (this.ZT == null) {
      Arrays.fill(this.ZH, false);
      Zer();
      this.Zr.Zq();
      this.ZA = 0;
      this.ZZ = 0;
      return;
    } 
    boolean[] arrayOfBoolean = ZX(this.ZT);
    Zg(arrayOfBoolean);
    Arrays.fill(this.ZS, false);
    Zer();
    ZC(arrayOfBoolean);
    this.Zr.ZH(this.ZA, this.ZZ);
  }
  
  private void Zer() {
    this.Zu.forEach(this::lambda$clearAllMessagePanes$9);
    this.Zc.forEach(this::lambda$clearAllMessagePanes$9);
    this.Zu.clear();
    this.Zc.clear();
  }
  
  private void Zg(boolean[] paramArrayOfboolean) {
    if (!paramArrayOfboolean[this.Zn[this.ZA]])
      this.ZA = 0; 
    if (this.Zo == 0 || !paramArrayOfboolean[this.Zn[this.Zu.size() + this.ZZ]])
      this.ZZ = 0; 
  }
  
  private void ZC(boolean[] paramArrayOfboolean) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: invokestatic ZX : ()Z
    //   5: iconst_0
    //   6: istore #4
    //   8: istore_2
    //   9: iload #4
    //   11: aload_1
    //   12: arraylength
    //   13: if_icmpge -> 122
    //   16: aload_1
    //   17: iload #4
    //   19: baload
    //   20: ifeq -> 115
    //   23: aload_0
    //   24: getfield Zs : [Lburp/Zbdf;
    //   27: iload #4
    //   29: aaload
    //   30: ifnonnull -> 46
    //   33: aload_0
    //   34: getfield Zs : [Lburp/Zbdf;
    //   37: iload #4
    //   39: aload_0
    //   40: iload #4
    //   42: invokevirtual ZI : (I)Lburp/Zbdf;
    //   45: aastore
    //   46: aload_0
    //   47: aload_0
    //   48: aload_1
    //   49: iload #4
    //   51: invokevirtual ZO : ([ZI)Ljava/lang/String;
    //   54: aload_0
    //   55: getfield Zs : [Lburp/Zbdf;
    //   58: iload #4
    //   60: aaload
    //   61: invokevirtual ZV : (Ljava/lang/String;Lburp/Zbdf;)Lburp/Zgib;
    //   64: astore #5
    //   66: iload #4
    //   68: aload_0
    //   69: getfield ZW : I
    //   72: if_icmpge -> 91
    //   75: aload_0
    //   76: getfield Zu : Ljava/util/List;
    //   79: aload #5
    //   81: invokeinterface add : (Ljava/lang/Object;)Z
    //   86: pop
    //   87: iload_2
    //   88: ifeq -> 103
    //   91: aload_0
    //   92: getfield Zc : Ljava/util/List;
    //   95: aload #5
    //   97: invokeinterface add : (Ljava/lang/Object;)Z
    //   102: pop
    //   103: aload_0
    //   104: getfield Zn : [B
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: iload #4
    //   113: i2b
    //   114: bastore
    //   115: iinc #4, 1
    //   118: iload_2
    //   119: ifeq -> 9
    //   122: aload_1
    //   123: iconst_0
    //   124: aload_0
    //   125: getfield ZH : [Z
    //   128: iconst_0
    //   129: aload_0
    //   130: getfield ZH : [Z
    //   133: arraylength
    //   134: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   137: return
  }
  
  protected abstract void Zl(Zbdf paramZbdf, int paramInt);
  
  protected abstract Zbdx ZR(Zeou paramZeou);
  
  protected abstract boolean[] ZX(T paramT);
  
  protected abstract Zbdf ZI(int paramInt);
  
  protected abstract Zgib ZV(String paramString, Zbdf paramZbdf);
  
  protected abstract String ZO(boolean[] paramArrayOfboolean, int paramInt);
  
  private void lambda$clearAllMessagePanes$9(Zgib paramZgib) {
    paramZgib.Zp(this.Zr);
  }
  
  private Zbdx lambda$makeRequestResponseViewer$8(Zxff paramZxff, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zo : ()Z
    //   3: istore_3
    //   4: aload_0
    //   5: getfield Zl : Lburp/Zgq7;
    //   8: aload_1
    //   9: invokevirtual ZP : (Lburp/Zxff;)Lburp/Zefl;
    //   12: aload_0
    //   13: getfield Zu : Ljava/util/List;
    //   16: invokeinterface ZS : (Ljava/util/List;)Lburp/Zefl;
    //   21: aload_0
    //   22: getfield Zc : Ljava/util/List;
    //   25: invokeinterface ZJ : (Ljava/util/List;)Lburp/Zefl;
    //   30: new burp/Zrzc
    //   33: dup
    //   34: aload_0
    //   35: invokespecial <init> : (Lburp/Zb5f;)V
    //   38: invokeinterface ZB : (Lburp/Zg7k;)Lburp/Zefl;
    //   43: astore #4
    //   45: aload_0
    //   46: getfield Zj : Lburp/Zlu8;
    //   49: ifnull -> 74
    //   52: aload #4
    //   54: aload_0
    //   55: getfield Zj : Lburp/Zlu8;
    //   58: invokestatic of : (Ljava/lang/Object;)Ljava/util/List;
    //   61: getstatic burp/Zs_i.INSPECTOR : Lburp/Zs_i;
    //   64: invokeinterface Zf : (Ljava/util/List;Lburp/Zs_i;)Lburp/Zefl;
    //   69: pop
    //   70: iload_3
    //   71: ifne -> 82
    //   74: aload #4
    //   76: invokeinterface Zo : ()Lburp/Zefl;
    //   81: pop
    //   82: iload_2
    //   83: ifeq -> 94
    //   86: aload #4
    //   88: invokeinterface ZR : ()Lburp/Zefl;
    //   93: pop
    //   94: aload #4
    //   96: invokeinterface Zl : ()Lburp/Zbdx;
    //   101: areturn
  }
  
  private void lambda$updateCurrentItem$7() {
    ZZ(this.ZT, true);
  }
  
  private void lambda$showItemImmediately$6(Zmw9 paramZmw9) {
    ZZ((T)paramZmw9, false);
  }
  
  private void lambda$showItem$5(Zmw9 paramZmw9, ActionEvent paramActionEvent) {
    Zmw9 zmw9 = (Zmw9)this.Zq.get();
    if (zmw9 == null || zmw9.ZF(paramZmw9))
      ZZ((T)zmw9, false); 
  }
  
  private void lambda$new$4(Zt4d paramZt4d) {
    if (paramZt4d.ZYj().stream().anyMatch(this::lambda$new$3))
      this.Zj.ZW(); 
  }
  
  private boolean lambda$new$3(Zzh2 paramZzh2) {
    return paramZzh2.ZF(this.ZT);
  }
  
  private void lambda$new$2(Zg4r paramZg4r) {
    if (paramZg4r.Ziv().stream().anyMatch(this::lambda$new$1))
      this.Zj.ZW(); 
  }
  
  private boolean lambda$new$1(Zeo2 paramZeo2) {
    return paramZeo2.ZF(this.ZT);
  }
  
  private void lambda$new$0(Zluv paramZluv) {
    if (paramZluv.Zsq().ZF(this.ZT))
      this.Zj.ZW(); 
  }
  
  static {
    // Byte code:
    //   0: bipush #114
    //   2: ldc 'yGs'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zb5f.a : Ljava/lang/String;
    //   11: goto -> 153
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 99, 5 -> 104
    //   80: bipush #32
    //   82: goto -> 111
    //   85: bipush #110
    //   87: goto -> 111
    //   90: bipush #91
    //   92: goto -> 111
    //   95: iconst_1
    //   96: goto -> 111
    //   99: bipush #24
    //   101: goto -> 111
    //   104: bipush #115
    //   106: goto -> 111
    //   109: bipush #114
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb5f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */