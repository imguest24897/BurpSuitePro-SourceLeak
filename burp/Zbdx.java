package burp;

import java.awt.Component;
import java.awt.Rectangle;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import javax.swing.SwingUtilities;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbdx extends Zbqc implements Zzyl, Zkgx {
  private final List<Zgib> Zk;
  
  private final List<Zgib> Zq;
  
  private final Zr2e ZJ;
  
  private final Zxff ZC;
  
  private final Zbps Z_;
  
  private final Zgb6 Zj;
  
  private final Zb4o ZM;
  
  private final Zmyz ZF;
  
  private final Zxdc ZR;
  
  private final Zkts ZY;
  
  private final Zktp ZE;
  
  private final Zkt1 ZL;
  
  private final Zkt0 ZK;
  
  private final Zkt0 ZX;
  
  private final boolean ZT;
  
  private final boolean Zu;
  
  private final Zbxj Zx;
  
  private Zkt0 Zz;
  
  private Component ZV;
  
  private volatile Zt8 Zf;
  
  private volatile Zrpp ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbdx(List<Zgib> paramList1, List<Zgib> paramList2, Zbdj paramZbdj, EnumSet<Zt8> paramEnumSet, Zg7k paramZg7k, Zr2e paramZr2e, Zxff paramZxff, Zbps paramZbps, Zgb6 paramZgb6, Zbxj paramZbxj, boolean paramBoolean1, boolean paramBoolean2, Zto1 paramZto1) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new burp/Zzc0
    //   8: dup
    //   9: aload_0
    //   10: <illegal opcode> accept : (Lburp/Zbdx;)Ljava/util/function/Consumer;
    //   15: invokespecial <init> : (Ljava/util/function/Consumer;)V
    //   18: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   21: invokestatic ZA : ()[Ljava/lang/String;
    //   24: aload_0
    //   25: aload_1
    //   26: putfield Zk : Ljava/util/List;
    //   29: astore #14
    //   31: aload_0
    //   32: aload_2
    //   33: putfield Zq : Ljava/util/List;
    //   36: aload_0
    //   37: aload #6
    //   39: putfield ZJ : Lburp/Zr2e;
    //   42: aload_0
    //   43: aload #7
    //   45: putfield ZC : Lburp/Zxff;
    //   48: aload_0
    //   49: aload #8
    //   51: putfield Z_ : Lburp/Zbps;
    //   54: aload_0
    //   55: aload #9
    //   57: putfield Zj : Lburp/Zgb6;
    //   60: aload_0
    //   61: aload #10
    //   63: putfield Zx : Lburp/Zbxj;
    //   66: aload_0
    //   67: iload #11
    //   69: putfield ZT : Z
    //   72: aload_0
    //   73: iload #12
    //   75: putfield Zu : Z
    //   78: aload_0
    //   79: new burp/Zb4o
    //   82: dup
    //   83: aload_0
    //   84: aload #4
    //   86: invokespecial <init> : (Lburp/Zbdx;Ljava/util/EnumSet;)V
    //   89: putfield ZM : Lburp/Zb4o;
    //   92: aload_0
    //   93: getstatic burp/Zt8.VERTICAL : Lburp/Zt8;
    //   96: invokevirtual ZP : (Lburp/Zt8;)V
    //   99: iload #11
    //   101: ifeq -> 114
    //   104: getstatic burp/Zg7k.Zo : Lburp/Zg7k;
    //   107: goto -> 124
    //   110: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   113: athrow
    //   114: aload_0
    //   115: aload_0
    //   116: getfield ZM : Lburp/Zb4o;
    //   119: aload #5
    //   121: invokevirtual ZL : (Lburp/Zb4o;Lburp/Zg7k;)Lburp/Zg7k;
    //   124: astore #15
    //   126: aload_0
    //   127: new burp/Zkts
    //   130: dup
    //   131: aload_1
    //   132: aload_2
    //   133: aload #15
    //   135: invokespecial <init> : (Ljava/util/List;Ljava/util/List;Lburp/Zg7k;)V
    //   138: putfield ZY : Lburp/Zkts;
    //   141: aload_0
    //   142: new burp/Zktp
    //   145: dup
    //   146: aload_1
    //   147: aload_2
    //   148: aload #15
    //   150: invokespecial <init> : (Ljava/util/List;Ljava/util/List;Lburp/Zg7k;)V
    //   153: putfield ZE : Lburp/Zktp;
    //   156: aload_3
    //   157: ifnull -> 285
    //   160: aload_0
    //   161: new burp/Zkt4
    //   164: dup
    //   165: aload_1
    //   166: invokeinterface getFirst : ()Ljava/lang/Object;
    //   171: checkcast burp/Zgib
    //   174: aload_2
    //   175: invokeinterface getFirst : ()Ljava/lang/Object;
    //   180: checkcast burp/Zgib
    //   183: aload_3
    //   184: aload #15
    //   186: aload_0
    //   187: getfield ZM : Lburp/Zb4o;
    //   190: invokespecial <init> : (Lburp/Zgib;Lburp/Zgib;Lburp/Zbdj;Lburp/Zg7k;Lburp/Zm1o;)V
    //   193: putfield ZK : Lburp/Zkt0;
    //   196: aload_0
    //   197: new burp/Zkt4
    //   200: dup
    //   201: aload_1
    //   202: invokeinterface getFirst : ()Ljava/lang/Object;
    //   207: checkcast burp/Zgib
    //   210: aload_2
    //   211: invokeinterface getFirst : ()Ljava/lang/Object;
    //   216: checkcast burp/Zgib
    //   219: aload_3
    //   220: aload #15
    //   222: aload_0
    //   223: getfield ZM : Lburp/Zb4o;
    //   226: invokespecial <init> : (Lburp/Zgib;Lburp/Zgib;Lburp/Zbdj;Lburp/Zg7k;Lburp/Zm1o;)V
    //   229: putfield ZX : Lburp/Zkt0;
    //   232: aload_0
    //   233: new burp/Zkt1
    //   236: dup
    //   237: aload_1
    //   238: aload_2
    //   239: aload #15
    //   241: aload_0
    //   242: getfield ZM : Lburp/Zb4o;
    //   245: iconst_1
    //   246: anewarray burp/Zed
    //   249: dup
    //   250: iconst_0
    //   251: aload_3
    //   252: aastore
    //   253: invokespecial <init> : (Ljava/util/List;Ljava/util/List;Lburp/Zg7k;Lburp/Zm1o;[Lburp/Zed;)V
    //   256: putfield ZL : Lburp/Zkt1;
    //   259: aload #14
    //   261: ifnull -> 346
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   270: athrow
    //   271: iconst_2
    //   272: anewarray burp/Zbqc
    //   275: invokestatic Zr : ([Lburp/Zbqc;)V
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   284: athrow
    //   285: aload_0
    //   286: new burp/Zkt3
    //   289: dup
    //   290: aload_1
    //   291: aload_2
    //   292: aload #15
    //   294: aload_0
    //   295: getfield ZM : Lburp/Zb4o;
    //   298: invokespecial <init> : (Ljava/util/List;Ljava/util/List;Lburp/Zg7k;Lburp/Zm1o;)V
    //   301: putfield ZK : Lburp/Zkt0;
    //   304: aload_0
    //   305: new burp/Zkt3
    //   308: dup
    //   309: aload_1
    //   310: aload_2
    //   311: aload #15
    //   313: aload_0
    //   314: getfield ZM : Lburp/Zb4o;
    //   317: invokespecial <init> : (Ljava/util/List;Ljava/util/List;Lburp/Zg7k;Lburp/Zm1o;)V
    //   320: putfield ZX : Lburp/Zkt0;
    //   323: aload_0
    //   324: new burp/Zkt1
    //   327: dup
    //   328: aload_1
    //   329: aload_2
    //   330: aload #15
    //   332: aload_0
    //   333: getfield ZM : Lburp/Zb4o;
    //   336: iconst_0
    //   337: anewarray burp/Zed
    //   340: invokespecial <init> : (Ljava/util/List;Ljava/util/List;Lburp/Zg7k;Lburp/Zm1o;[Lburp/Zed;)V
    //   343: putfield ZL : Lburp/Zkt1;
    //   346: aload_0
    //   347: new burp/Zxdc
    //   350: dup
    //   351: aload_0
    //   352: invokespecial <init> : (Lburp/Zbdx;)V
    //   355: putfield ZR : Lburp/Zxdc;
    //   358: aload #13
    //   360: getstatic burp/Zt1j.ZD : Lburp/Zlnb;
    //   363: aload_0
    //   364: <illegal opcode> accept : (Lburp/Zbdx;)Ljava/util/function/Consumer;
    //   369: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   372: pop
    //   373: aload #13
    //   375: getstatic burp/Zt1j.ZK : Lburp/Zlnb;
    //   378: aload_0
    //   379: <illegal opcode> accept : (Lburp/Zbdx;)Ljava/util/function/Consumer;
    //   384: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   387: pop
    //   388: aload #13
    //   390: getstatic burp/Zt1j.Zk : Lburp/Zlnb;
    //   393: aload_0
    //   394: <illegal opcode> accept : (Lburp/Zbdx;)Ljava/util/function/Consumer;
    //   399: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   402: pop
    //   403: aload #6
    //   405: aload_0
    //   406: getfield ZR : Lburp/Zxdc;
    //   409: invokeinterface ZI : (Lburp/Ztmh;)V
    //   414: aload_0
    //   415: aload #9
    //   417: invokeinterface Zfn : ()Lburp/Zrpp;
    //   422: putfield ZN : Lburp/Zrpp;
    //   425: aload_0
    //   426: new burp/Zmyz
    //   429: dup
    //   430: iconst_1
    //   431: invokespecial <init> : (I)V
    //   434: putfield ZF : Lburp/Zmyz;
    //   437: aload_0
    //   438: getfield ZF : Lburp/Zmyz;
    //   441: iconst_1
    //   442: invokevirtual setDividerSize : (I)V
    //   445: aload_0
    //   446: getfield ZF : Lburp/Zmyz;
    //   449: aload_0
    //   450: getfield ZN : Lburp/Zrpp;
    //   453: getstatic burp/Zrpp.LEFT : Lburp/Zrpp;
    //   456: if_acmpne -> 467
    //   459: dconst_0
    //   460: goto -> 468
    //   463: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   466: athrow
    //   467: dconst_1
    //   468: invokevirtual setResizeWeight : (D)V
    //   471: aload_0
    //   472: getfield ZF : Lburp/Zmyz;
    //   475: aload_0
    //   476: getfield ZR : Lburp/Zxdc;
    //   479: invokevirtual addPropertyChangeListener : (Ljava/beans/PropertyChangeListener;)V
    //   482: aload_0
    //   483: getfield ZF : Lburp/Zmyz;
    //   486: getstatic burp/Zlkk.TEXT_EDITOR_BACKGROUND : Lburp/Zlkk;
    //   489: invokevirtual Zw : (Lburp/Zlkk;)V
    //   492: aload_0
    //   493: aload_0
    //   494: getfield ZF : Lburp/Zmyz;
    //   497: sipush #-26374
    //   500: sipush #30328
    //   503: invokestatic a : (II)Ljava/lang/String;
    //   506: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   509: aload_0
    //   510: invokevirtual Zy : ()V
    //   513: aload_0
    //   514: invokevirtual Zx : ()V
    //   517: aload_0
    //   518: invokevirtual ZK : ()V
    //   521: return
    // Exception table:
    //   from	to	target	type
    //   31	110	110	java/lang/IllegalArgumentException
    //   126	264	267	java/lang/IllegalArgumentException
    //   160	278	281	java/lang/IllegalArgumentException
    //   346	463	463	java/lang/IllegalArgumentException
  }
  
  public void updateUI() {
    try {
      super.updateUI();
      if (this.Zk != null)
        this.Zk.stream().map(Zed::ZB).filter(Zbdx::lambda$updateUI$4).forEach(SwingUtilities::updateComponentTreeUI); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.Zq != null)
        this.Zq.stream().map(Zed::ZB).filter(Zbdx::lambda$updateUI$4).forEach(SwingUtilities::updateComponentTreeUI); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (this.Zx != null) {
      Component component = this.Zx.ZQ();
      try {
        if (component != null)
          try {
            if (component.getParent() == null)
              SwingUtilities.updateComponentTreeUI(component); 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
  }
  
  public void Zk() {
    int i = getHeight();
    int j = getWidth();
    try {
      if (i > 0)
        try {
          if (j > 0)
            Za(Zu(j, i)); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void Zg(int paramInt1, int paramInt2, Zto4 paramZto4) {
    try {
      if (this.Zz != null)
        this.Zz.Zr(paramInt1, paramInt2, paramZto4); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void Zq() {
    Zy();
    Zx();
    SwingUtilities.invokeLater(this::lambda$configChanged$6);
  }
  
  public void ZH(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zy : ()V
    //   4: aload_0
    //   5: invokevirtual Zx : ()V
    //   8: aload_0
    //   9: iload_1
    //   10: iload_2
    //   11: <illegal opcode> run : (Lburp/Zbdx;II)Ljava/lang/Runnable;
    //   16: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   19: return
  }
  
  List<Zt37> ZF(Zgu3 paramZgu3) {
    return this.ZJ.ZP(paramZgu3);
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    try {
      if (paramInt == 404736) {
        try {
          if (!this.ZT)
            this.ZM.ZQ(this.Zf.Zf()); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return true;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramInt == 404992) {
        this.Zx.Zs();
        return true;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.Zz.ZI(paramInt, paramObject);
  }
  
  public void Zp() {
    this.Zz.ZV(true);
  }
  
  public Zbxj Zs() {
    return this.Zx;
  }
  
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zf : Lburp/Zt8;
    //   4: astore_1
    //   5: iconst_5
    //   6: anewarray burp/Ztcw
    //   9: dup
    //   10: iconst_0
    //   11: aload_0
    //   12: getfield ZJ : Lburp/Zr2e;
    //   15: invokeinterface ZI : ()Lburp/Ztcw;
    //   20: aastore
    //   21: dup
    //   22: iconst_1
    //   23: aload_0
    //   24: getfield ZL : Lburp/Zkt1;
    //   27: invokevirtual ZI : ()Lburp/Ztcw;
    //   30: aastore
    //   31: dup
    //   32: iconst_2
    //   33: aload_0
    //   34: getfield ZK : Lburp/Zkt0;
    //   37: invokestatic ZG : (Ljava/lang/Object;)Lburp/Ztcw;
    //   40: aastore
    //   41: dup
    //   42: iconst_3
    //   43: aload_0
    //   44: getfield ZX : Lburp/Zkt0;
    //   47: invokestatic ZG : (Ljava/lang/Object;)Lburp/Ztcw;
    //   50: aastore
    //   51: dup
    //   52: iconst_4
    //   53: aload_0
    //   54: aload_1
    //   55: <illegal opcode> Zg : (Lburp/Zbdx;Lburp/Zt8;)Lburp/Ztcw;
    //   60: aastore
    //   61: invokestatic Zb : ([Lburp/Ztcw;)Lburp/Ztcw;
    //   64: areturn
  }
  
  private static Ztcw ZG(Object paramObject) {
    Zkgx zkgx = (Zkgx)paramObject;
    return (paramObject instanceof Zkgx) ? zkgx.ZI() : Zbdx::lambda$checkpointIfRestorable$9;
  }
  
  public void ZU() {
    this.ZL.ZU();
    ZL(this.ZK);
    ZL(this.ZX);
    this.ZJ.ZU();
  }
  
  private static void ZL(Object paramObject) {
    if (paramObject instanceof Zkgx) {
      Zkgx zkgx = (Zkgx)paramObject;
      zkgx.ZU();
    } 
  }
  
  void ZF(Zt8 paramZt8, int paramInt1, int paramInt2) {
    try {
      Zuh.Zb(true, Zqf.ZF);
      if (this.ZC == Zxff.EXTENSION)
        return; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramZt8 != this.Zf) {
        try {
          ZP(paramZt8);
          this.Z_.ZJ(paramZt8);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        Zgib zgib1 = (paramInt1 < this.Zk.size()) ? this.Zk.get(paramInt1) : null;
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        Zgib zgib2 = (paramInt2 < this.Zq.size()) ? this.Zq.get(paramInt2) : null;
        try {
          Zc(zgib1, true);
          Zc(zgib2, true);
          Zu(false, paramInt1, paramInt2);
        } finally {
          Zc(zgib1, false);
          Zc(zgib2, false);
        } 
        requestFocus();
        paramZt8.Zw(this.ZC);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private void ZK() {
    setName(a(-26375, -14080));
    this.ZF.setName(a(-26373, -8657));
  }
  
  private void ZP(Zt8 paramZt8) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZT : Z
    //   4: ifeq -> 21
    //   7: aload_1
    //   8: getstatic burp/Zt8.VERTICAL : Lburp/Zt8;
    //   11: if_acmpne -> 29
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   20: athrow
    //   21: iconst_1
    //   22: goto -> 30
    //   25: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   28: athrow
    //   29: iconst_0
    //   30: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   33: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   36: aload_0
    //   37: aload_1
    //   38: putfield Zf : Lburp/Zt8;
    //   41: return
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/IllegalArgumentException
    //   7	25	25	java/lang/IllegalArgumentException
  }
  
  private Zg7k ZL(Zb4o paramZb4o, Zg7k paramZg7k) {
    return new Zbjp(this, paramZg7k, paramZb4o);
  }
  
  private BiConsumer<Zt8, Zmsv> Zu(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: <illegal opcode> accept : (Lburp/Zbdx;II)Ljava/util/function/BiConsumer;
    //   8: areturn
  }
  
  private void Za(BiConsumer<Zt8, Zmsv> paramBiConsumer) {
    // Byte code:
    //   0: invokestatic ZA : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZC : Lburp/Zxff;
    //   8: getstatic burp/Zxff.EXTENSION : Lburp/Zxff;
    //   11: if_acmpne -> 37
    //   14: aload_0
    //   15: getstatic burp/Zt8.VERTICAL : Lburp/Zt8;
    //   18: invokevirtual ZP : (Lburp/Zt8;)V
    //   21: aload_0
    //   22: getstatic burp/Zrpp.DEFAULT : Lburp/Zrpp;
    //   25: putfield ZN : Lburp/Zrpp;
    //   28: aload_0
    //   29: invokevirtual Zu : ()V
    //   32: return
    //   33: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   36: athrow
    //   37: aload_0
    //   38: getfield ZT : Z
    //   41: ifeq -> 54
    //   44: getstatic burp/Zt8.VERTICAL : Lburp/Zt8;
    //   47: goto -> 61
    //   50: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   53: athrow
    //   54: aload_0
    //   55: getfield Z_ : Lburp/Zbps;
    //   58: invokevirtual Zc : ()Lburp/Zt8;
    //   61: astore_3
    //   62: aload_0
    //   63: aload_0
    //   64: getfield Zj : Lburp/Zgb6;
    //   67: invokeinterface Zfn : ()Lburp/Zrpp;
    //   72: putfield ZN : Lburp/Zrpp;
    //   75: aload_0
    //   76: getfield Zj : Lburp/Zgb6;
    //   79: invokeinterface ZEa : ()Lburp/Zmsv;
    //   84: astore #4
    //   86: aload_3
    //   87: ifnull -> 129
    //   90: aload #4
    //   92: getstatic burp/Zmsv.COLLAPSED : Lburp/Zmsv;
    //   95: if_acmpne -> 129
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   104: athrow
    //   105: aload_0
    //   106: new burp/Zm01
    //   109: dup
    //   110: aload_3
    //   111: iconst_0
    //   112: invokespecial <init> : (Lburp/Zt8;Z)V
    //   115: invokevirtual ZR : (Lburp/Zm01;)V
    //   118: aload_2
    //   119: ifnull -> 145
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   128: athrow
    //   129: aload_1
    //   130: aload_3
    //   131: aload #4
    //   133: invokeinterface accept : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   144: athrow
    //   145: aload_0
    //   146: invokevirtual revalidate : ()V
    //   149: return
    // Exception table:
    //   from	to	target	type
    //   4	33	33	java/lang/IllegalArgumentException
    //   37	50	50	java/lang/IllegalArgumentException
    //   86	98	101	java/lang/IllegalArgumentException
    //   90	122	125	java/lang/IllegalArgumentException
    //   105	138	141	java/lang/IllegalArgumentException
  }
  
  private Zm01 Zf(Zt8 paramZt8, Zmsv paramZmsv, int paramInt1, int paramInt2) {
    try {
      if (paramZt8 == null) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return (paramZmsv == Zmsv.AUTO_EXPAND) ? Zt8.ZC(this.Zj, paramInt1, paramInt2, this.Zx) : Zt8.Zl(this.Zj, paramInt1, paramInt2, this.Zx, Boolean.valueOf(false));
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zt8.Zp(this.Zj, paramInt1, paramZt8, this.Zx);
  }
  
  private void ZR(Zm01 paramZm01) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zu : Z
    //   4: ifne -> 29
    //   7: aload_1
    //   8: getfield Zd : Z
    //   11: ifeq -> 29
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   20: athrow
    //   21: iconst_1
    //   22: goto -> 30
    //   25: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   28: athrow
    //   29: iconst_0
    //   30: istore_2
    //   31: aload_0
    //   32: getfield ZJ : Lburp/Zr2e;
    //   35: iload_2
    //   36: invokeinterface Zr : (Z)V
    //   41: aload_0
    //   42: getfield Zx : Lburp/Zbxj;
    //   45: iload_2
    //   46: invokeinterface ZJ : (Z)V
    //   51: aload_0
    //   52: getfield Zx : Lburp/Zbxj;
    //   55: aload_0
    //   56: getfield ZN : Lburp/Zrpp;
    //   59: invokeinterface Zl : (Lburp/Zrpp;)V
    //   64: aload_0
    //   65: aload_1
    //   66: getfield ZK : Lburp/Zt8;
    //   69: invokevirtual ZP : (Lburp/Zt8;)V
    //   72: aload_0
    //   73: invokevirtual Zu : ()V
    //   76: return
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/IllegalArgumentException
    //   7	25	25	java/lang/IllegalArgumentException
  }
  
  private void Zu() {
    String[] arrayOfString = Zxff.ZA();
    try {
      if (SwingUtilities.isEventDispatchThread()) {
        try {
          Zu(true, 0, 0);
          if (arrayOfString != null) {
            SwingUtilities.invokeLater(this::lambda$layoutInitialised$11);
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    SwingUtilities.invokeLater(this::lambda$layoutInitialised$11);
  }
  
  private void Zc(Zgib paramZgib, boolean paramBoolean) {
    try {
      if (paramZgib != null)
        paramZgib.ZK(paramBoolean); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private void Zk(int paramInt1, int paramInt2) {
    Zg(paramInt1, paramInt2, Zto4.PREVIOUS);
  }
  
  private void Zy() {
    // Byte code:
    //   0: invokestatic ZA : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zu : Z
    //   8: ifeq -> 37
    //   11: aload_0
    //   12: getfield Zk : Ljava/util/List;
    //   15: aload_0
    //   16: <illegal opcode> accept : (Lburp/Zbdx;)Ljava/util/function/Consumer;
    //   21: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   26: aload_1
    //   27: ifnull -> 145
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   36: athrow
    //   37: aload_0
    //   38: getfield Zk : Ljava/util/List;
    //   41: invokeinterface size : ()I
    //   46: aload_0
    //   47: getfield Zq : Ljava/util/List;
    //   50: invokeinterface size : ()I
    //   55: iadd
    //   56: iconst_1
    //   57: if_icmpne -> 108
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   66: athrow
    //   67: aload_0
    //   68: getfield Zk : Ljava/util/List;
    //   71: aload_0
    //   72: <illegal opcode> accept : (Lburp/Zbdx;)Ljava/util/function/Consumer;
    //   77: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   82: aload_0
    //   83: getfield Zq : Ljava/util/List;
    //   86: aload_0
    //   87: <illegal opcode> accept : (Lburp/Zbdx;)Ljava/util/function/Consumer;
    //   92: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   97: aload_1
    //   98: ifnull -> 145
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   107: athrow
    //   108: aload_0
    //   109: getfield Zk : Ljava/util/List;
    //   112: aload_0
    //   113: <illegal opcode> accept : (Lburp/Zbdx;)Ljava/util/function/Consumer;
    //   118: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   123: aload_0
    //   124: getfield Zq : Ljava/util/List;
    //   127: aload_0
    //   128: <illegal opcode> accept : (Lburp/Zbdx;)Ljava/util/function/Consumer;
    //   133: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   144: athrow
    //   145: return
    // Exception table:
    //   from	to	target	type
    //   4	30	33	java/lang/IllegalArgumentException
    //   11	60	63	java/lang/IllegalArgumentException
    //   37	101	104	java/lang/IllegalArgumentException
    //   67	138	141	java/lang/IllegalArgumentException
  }
  
  private void Zx() {
    this.Zk.forEach(this::lambda$addTitleListenerToMessagePanes$18);
    this.Zq.forEach(this::lambda$addTitleListenerToMessagePanes$20);
  }
  
  private void Zu(boolean paramBoolean, int paramInt1, int paramInt2) {
    Zd(paramBoolean);
    Zk(paramInt1, paramInt2);
  }
  
  private void Zd(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZA : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: iconst_1
    //   5: getstatic net/portswigger/Zqf.ZF : Lnet/portswigger/Zqf;
    //   8: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   11: aload_0
    //   12: getfield Zk : Ljava/util/List;
    //   15: invokeinterface isEmpty : ()Z
    //   20: ifeq -> 59
    //   23: aload_0
    //   24: getfield Zq : Ljava/util/List;
    //   27: invokeinterface isEmpty : ()Z
    //   32: ifeq -> 59
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   41: athrow
    //   42: aload_0
    //   43: getfield ZF : Lburp/Zmyz;
    //   46: iconst_0
    //   47: invokevirtual setVisible : (Z)V
    //   50: aload_0
    //   51: invokestatic ZF : (Ljava/awt/Component;)V
    //   54: return
    //   55: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   58: athrow
    //   59: aload_0
    //   60: getfield ZF : Lburp/Zmyz;
    //   63: iconst_1
    //   64: invokevirtual setVisible : (Z)V
    //   67: aload_0
    //   68: getfield ZT : Z
    //   71: ifeq -> 89
    //   74: aload_0
    //   75: invokevirtual Zh : ()V
    //   78: aload_2
    //   79: ifnull -> 227
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   88: athrow
    //   89: aload_0
    //   90: getfield Zk : Ljava/util/List;
    //   93: invokeinterface isEmpty : ()Z
    //   98: ifne -> 127
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   107: athrow
    //   108: aload_0
    //   109: getfield Zq : Ljava/util/List;
    //   112: invokeinterface isEmpty : ()Z
    //   117: ifeq -> 142
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   126: athrow
    //   127: aload_0
    //   128: invokevirtual ZN : ()V
    //   131: aload_2
    //   132: ifnull -> 227
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   141: athrow
    //   142: getstatic burp/Zevg.Zo : [I
    //   145: aload_0
    //   146: getfield Zf : Lburp/Zt8;
    //   149: invokevirtual ordinal : ()I
    //   152: iaload
    //   153: tableswitch default -> 227, 1 -> 184, 2 -> 200, 3 -> 216
    //   180: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   183: athrow
    //   184: aload_0
    //   185: iload_1
    //   186: invokevirtual Zx : (Z)V
    //   189: aload_2
    //   190: ifnull -> 227
    //   193: goto -> 200
    //   196: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   199: athrow
    //   200: aload_0
    //   201: iload_1
    //   202: invokevirtual Zz : (Z)V
    //   205: aload_2
    //   206: ifnull -> 227
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   215: athrow
    //   216: aload_0
    //   217: invokevirtual Zd : ()V
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   226: athrow
    //   227: aload_0
    //   228: invokevirtual revalidate : ()V
    //   231: return
    // Exception table:
    //   from	to	target	type
    //   4	35	38	java/lang/IllegalArgumentException
    //   23	55	55	java/lang/IllegalArgumentException
    //   59	82	85	java/lang/IllegalArgumentException
    //   74	101	104	java/lang/IllegalArgumentException
    //   89	120	123	java/lang/IllegalArgumentException
    //   108	135	138	java/lang/IllegalArgumentException
    //   127	180	180	java/lang/IllegalArgumentException
    //   142	193	196	java/lang/IllegalArgumentException
    //   184	209	212	java/lang/IllegalArgumentException
    //   200	220	223	java/lang/IllegalArgumentException
  }
  
  private void Zh() {
    this.Zz = this.ZY;
    this.ZV = this.ZY.Za(this.Zf);
    ZW();
  }
  
  private void ZN() {
    this.Zz = this.ZE;
    this.ZV = this.ZE.Za(this.Zf);
    ZW();
  }
  
  private void Zd() {
    String[] arrayOfString = Zxff.ZA();
    try {
      if (this.Zz == this.ZL) {
        try {
          this.ZL.ZW(this.Zf);
          if (arrayOfString != null) {
            this.Zz = this.ZL;
            this.ZV = this.ZL.Za(this.Zf);
            ZW();
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zz = this.ZL;
    this.ZV = this.ZL.Za(this.Zf);
    ZW();
  }
  
  private void Zx(boolean paramBoolean) {
    String[] arrayOfString = Zxff.ZA();
    try {
      if (this.Zz == this.ZK)
        try {
          if (!paramBoolean) {
            try {
              this.ZK.ZW(this.Zf);
              if (arrayOfString != null) {
                this.Zz = this.ZK;
                this.ZV = this.ZK.Zv(this.Zf, paramBoolean);
                ZW();
                return;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zz = this.ZK;
    this.ZV = this.ZK.Zv(this.Zf, paramBoolean);
    ZW();
  }
  
  private void Zz(boolean paramBoolean) {
    String[] arrayOfString = Zxff.ZA();
    try {
      if (this.Zz == this.ZX)
        try {
          if (!paramBoolean) {
            try {
              this.ZX.ZW(this.Zf);
              if (arrayOfString != null) {
                this.Zz = this.ZX;
                this.ZV = this.ZX.Zv(this.Zf, paramBoolean);
                ZW();
                return;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zz = this.ZX;
    this.ZV = this.ZX.Zv(this.Zf, paramBoolean);
    ZW();
  }
  
  private void ZW() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZF : Lburp/Zmyz;
    //   4: aconst_null
    //   5: invokevirtual setLeftComponent : (Ljava/awt/Component;)V
    //   8: invokestatic ZA : ()[Ljava/lang/String;
    //   11: aload_0
    //   12: getfield ZF : Lburp/Zmyz;
    //   15: aconst_null
    //   16: invokevirtual setRightComponent : (Ljava/awt/Component;)V
    //   19: astore_1
    //   20: aload_0
    //   21: getfield ZN : Lburp/Zrpp;
    //   24: getstatic burp/Zrpp.LEFT : Lburp/Zrpp;
    //   27: if_acmpne -> 120
    //   30: aload_0
    //   31: getfield ZF : Lburp/Zmyz;
    //   34: aload_0
    //   35: getfield Zx : Lburp/Zbxj;
    //   38: invokeinterface ZQ : ()Ljava/awt/Component;
    //   43: invokevirtual setLeftComponent : (Ljava/awt/Component;)V
    //   46: aload_0
    //   47: getfield ZF : Lburp/Zmyz;
    //   50: aload_0
    //   51: getfield ZV : Ljava/awt/Component;
    //   54: invokevirtual setRightComponent : (Ljava/awt/Component;)V
    //   57: aload_0
    //   58: getfield ZF : Lburp/Zmyz;
    //   61: dconst_0
    //   62: invokevirtual setResizeWeight : (D)V
    //   65: aload_0
    //   66: getfield Zz : Lburp/Zkt0;
    //   69: astore_3
    //   70: aload_3
    //   71: instanceof burp/Zkt3
    //   74: ifeq -> 116
    //   77: aload_3
    //   78: checkcast burp/Zkt3
    //   81: astore_2
    //   82: aload_2
    //   83: aload_0
    //   84: getfield ZF : Lburp/Zmyz;
    //   87: invokevirtual getWidth : ()I
    //   90: aload_0
    //   91: getfield ZF : Lburp/Zmyz;
    //   94: invokevirtual getDividerSize : ()I
    //   97: isub
    //   98: aload_0
    //   99: getfield ZF : Lburp/Zmyz;
    //   102: invokevirtual getDividerLocation : ()I
    //   105: isub
    //   106: aload_0
    //   107: getfield ZF : Lburp/Zmyz;
    //   110: invokevirtual getHeight : ()I
    //   113: invokevirtual Zt : (II)V
    //   116: aload_1
    //   117: ifnull -> 190
    //   120: aload_0
    //   121: getfield ZF : Lburp/Zmyz;
    //   124: aload_0
    //   125: getfield ZV : Ljava/awt/Component;
    //   128: invokevirtual setLeftComponent : (Ljava/awt/Component;)V
    //   131: aload_0
    //   132: getfield ZF : Lburp/Zmyz;
    //   135: aload_0
    //   136: getfield Zx : Lburp/Zbxj;
    //   139: invokeinterface ZQ : ()Ljava/awt/Component;
    //   144: invokevirtual setRightComponent : (Ljava/awt/Component;)V
    //   147: aload_0
    //   148: getfield ZF : Lburp/Zmyz;
    //   151: dconst_1
    //   152: invokevirtual setResizeWeight : (D)V
    //   155: aload_0
    //   156: getfield Zz : Lburp/Zkt0;
    //   159: astore_3
    //   160: aload_3
    //   161: instanceof burp/Zkt3
    //   164: ifeq -> 190
    //   167: aload_3
    //   168: checkcast burp/Zkt3
    //   171: astore_2
    //   172: aload_2
    //   173: aload_0
    //   174: getfield ZF : Lburp/Zmyz;
    //   177: invokevirtual getDividerLocation : ()I
    //   180: aload_0
    //   181: getfield ZF : Lburp/Zmyz;
    //   184: invokevirtual getHeight : ()I
    //   187: invokevirtual Zt : (II)V
    //   190: aload_0
    //   191: getfield ZR : Lburp/Zxdc;
    //   194: invokevirtual Ze : ()V
    //   197: aload_0
    //   198: getfield ZF : Lburp/Zmyz;
    //   201: invokestatic ZF : (Ljava/awt/Component;)V
    //   204: return
  }
  
  private int Z_(int paramInt) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.ZN == Zrpp.LEFT) ? paramInt : (this.ZF.getWidth() - this.ZF.getDividerSize() - paramInt);
  }
  
  public void ZQ(Zxko paramZxko) {
    this.ZJ.ZI(paramZxko);
  }
  
  public void Zu(Zxko paramZxko) {
    this.ZJ.Zp(paramZxko);
  }
  
  private void lambda$addTitleListenerToMessagePanes$20(Zgib paramZgib) {
    paramZgib.ZW(this::lambda$addTitleListenerToMessagePanes$17);
  }
  
  private void lambda$addTitleListenerToMessagePanes$18(Zgib paramZgib) {
    paramZgib.ZW(this::lambda$addTitleListenerToMessagePanes$17);
  }
  
  private void lambda$addTitleListenerToMessagePanes$17() {
    this.Zz.Zv();
  }
  
  private void lambda$addMessageListenersToMessagePanes$16(Zgib paramZgib) {
    Objects.requireNonNull(paramZgib);
    paramZgib.Zz(new Zl3y(this.ZJ, paramZgib::ZK));
    paramZgib.Zh(this.ZJ);
    paramZgib.Zq(this, Zgu3.HTTP_RESPONSE);
  }
  
  private void lambda$addMessageListenersToMessagePanes$15(Zgib paramZgib) {
    Objects.requireNonNull(paramZgib);
    paramZgib.Zz(new Ztsk(this.ZJ, paramZgib::ZK));
    paramZgib.Zh(this.ZJ);
    paramZgib.ZH(this.ZJ);
    paramZgib.Zq(this, Zgu3.HTTP_REQUEST);
  }
  
  private void lambda$addMessageListenersToMessagePanes$14(Zgib paramZgib) {
    Objects.requireNonNull(paramZgib);
    paramZgib.Zz(new Zlw_(this.ZJ, paramZgib::ZK, Zgu3.HTTP_RESPONSE));
    paramZgib.Zh(this.ZJ);
    paramZgib.Zq(this, Zgu3.HTTP_RESPONSE);
  }
  
  private void lambda$addMessageListenersToMessagePanes$13(Zgib paramZgib) {
    Objects.requireNonNull(paramZgib);
    paramZgib.Zz(new Zlw_(this.ZJ, paramZgib::ZK, Zgu3.HTTP_REQUEST));
    paramZgib.Zh(this.ZJ);
    paramZgib.ZH(this.ZJ);
    paramZgib.Zq(this, Zgu3.HTTP_REQUEST);
  }
  
  private void lambda$addMessageListenersToMessagePanes$12(Zgib paramZgib) {
    Objects.requireNonNull(paramZgib);
    paramZgib.Zz(new Zt7l(this.ZJ, paramZgib::ZK));
    paramZgib.Zh(this.ZJ);
    paramZgib.Zq(this, Zgu3.WS_MESSAGE);
  }
  
  private void lambda$layoutInitialised$11() {
    Zu(true, 0, 0);
  }
  
  private void lambda$refreshLayoutFromSetDimensionsAction$10(int paramInt1, int paramInt2, Zt8 paramZt8, Zmsv paramZmsv) {
    Zm01 zm01 = Zf(paramZt8, paramZmsv, paramInt1, paramInt2);
    ZR(zm01);
  }
  
  private static void lambda$checkpointIfRestorable$9() {}
  
  private void lambda$checkpoint$8(Zt8 paramZt8) {
    ZF(paramZt8, 0, 0);
  }
  
  private void lambda$configChanged$7(int paramInt1, int paramInt2) {
    Zu(false, paramInt1, paramInt2);
  }
  
  private void lambda$configChanged$6() {
    Zd(false);
  }
  
  private static boolean lambda$updateUI$4(Component paramComponent) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramComponent.getParent() == null);
  }
  
  private void lambda$new$3(Zxr8 paramZxr8) {
    this.ZR.Zg((Zrpp)paramZxr8.ZF().orElseThrow(IllegalArgumentException::new));
  }
  
  private void lambda$new$2(Zxr8 paramZxr8) {
    this.ZR.ZU(false);
  }
  
  private void lambda$new$1(Zxr8 paramZxr8) {
    this.ZR.ZU(true);
  }
  
  private void lambda$new$0(Rectangle paramRectangle) {
    Za(Zu(paramRectangle.width, paramRectangle.height));
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ôúÈßõ5NÓ¦Ù=*ÔÑt]Ýeðýõ=HÌK÷>f'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #12
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: iconst_1
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 22
    //   66: aload #5
    //   68: putstatic burp/Zbdx.a : [Ljava/lang/String;
    //   71: iconst_3
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zbdx.b : [Ljava/lang/String;
    //   78: goto -> 227
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #120
    //   154: goto -> 184
    //   157: bipush #39
    //   159: goto -> 184
    //   162: bipush #50
    //   164: goto -> 184
    //   167: bipush #126
    //   169: goto -> 184
    //   172: bipush #58
    //   174: goto -> 184
    //   177: bipush #21
    //   179: goto -> 184
    //   182: bipush #21
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 38
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF98FB) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = '¸';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbdx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */