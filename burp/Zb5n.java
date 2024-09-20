package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.JSeparator;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zb5n extends Zbqc implements Zm1p, Zgap, Zmlq {
  private static final Component Zw;
  
  private final Zbnt Zn;
  
  private final Zeo_ ZJ;
  
  private final Zei6 Zv;
  
  private final Zbqc ZI;
  
  private final Zgb6 Zd;
  
  private final Zkl6 Zz;
  
  private final Zey9 Zf;
  
  private final Zekl Zt;
  
  private final Zbc9 Zx;
  
  private final Zbdf Zh;
  
  private final Zbdf ZV;
  
  private final Zbdf Zq;
  
  private final Zbdf ZO;
  
  private final Zbc9 ZK;
  
  private final Zbdx Zo;
  
  private final Zbdx ZS;
  
  private final Zbdx ZP;
  
  private final Zlu8<Zmw9<?>> ZM;
  
  private final Zlu8<Zmw9<?>> Zl;
  
  private final Zlu8<Zmw9<?>> Zs;
  
  private final AtomicBoolean ZL;
  
  private final AtomicBoolean Zj;
  
  private final AtomicBoolean Zu;
  
  private Zbdf Zr;
  
  private Zbdx Z_;
  
  private Zlu8<Zmw9<?>> ZY;
  
  private Ztf_<?> Zk;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zb5n(Zekl paramZekl, Zgb6 paramZgb6, Zbnt paramZbnt, Zkl6 paramZkl6, Ztyg paramZtyg, Zgq7 paramZgq7, Zbp5 paramZbp5, Zm6x paramZm6x, Zeo_ paramZeo_, Zei6 paramZei6) {
    super(new BorderLayout());
    this.Zt = paramZekl;
    this.Zn = paramZbnt;
    this.Zd = paramZgb6;
    this.Zz = paramZkl6;
    this.ZJ = paramZeo_;
    this.Zv = paramZei6;
    this.Zx = new Zbc9();
    this.Zf = paramZkl6.ZH();
    this.ZL = new AtomicBoolean();
    this.Zj = new AtomicBoolean();
    this.Zu = new AtomicBoolean();
    this.Zh = paramZtyg.Zz(this, Zeew.PROXY, true, EnumSet.of(Zgu3.HTTP_REQUEST), Zb9b.Zx);
    this.Zh.ZN((byte[])null, Zgu3.HTTP_REQUEST);
    this.Zh.ZD(a(23147, -22153));
    this.Zq = paramZtyg.Zz(this, Zeew.PROXY, false, EnumSet.of(Zgu3.HTTP_REQUEST), Zb9b.Zx);
    this.Zq.ZN((byte[])null, Zgu3.HTTP_REQUEST);
    this.Zq.setName(a(23150, -10754));
    this.ZV = paramZtyg.Zo(this, Zeew.PROXY, true, EnumSet.of(Zgu3.HTTP_RESPONSE), new Zsai(), Zb9b.Zx);
    this.ZV.ZN((byte[])null, Zgu3.HTTP_RESPONSE);
    this.ZV.setName(a(23151, -19455));
    this.ZV.ZD(a(23144, -13243));
    this.ZO = paramZtyg.Zo(this, Zeew.PROXY, true, EnumSet.of(Zgu3.WS_MESSAGE), new Zbzp(paramZbp5, paramZei6), Zb9b.Zx);
    this.ZO.ZN((byte[])null, Zgu3.WS_MESSAGE);
    paramZm6x.ZO(Zg4r.class, Zehw.SWING, this::lambda$new$0);
    paramZm6x.ZO(Zt4d.class, Zehw.SWING, this::lambda$new$1);
    paramZm6x.ZO(Ztzz.class, Zehw.SWING, this::lambda$new$2);
    boolean bool = Zmue.Zm();
    try {
      paramZm6x.ZO(Zlw3.class, Zehw.SWING, this::lambda$new$3);
      this.ZM = Zh(paramZm6x, paramZei6);
      this.Zo = paramZgq7.ZP(Zxff.PROXY_INTERCEPT).ZK(this.Zh, a(23143, -2800), this::ZD).Zf(List.of(this.ZM), Zs_i.INSPECTOR).Zl();
      this.Zl = Zh(paramZm6x, paramZei6);
      this.ZS = paramZgq7.ZP(Zxff.PROXY_INTERCEPT).ZA(this.Zq, a(23139, -28517)).Zp(this.ZV, a(23138, -12444)).Zf(List.of(this.Zl), Zs_i.INSPECTOR).Zl();
      this.Zs = Zh(paramZm6x, paramZei6);
      this.ZP = paramZgq7.ZP(Zxff.PROXY_INTERCEPT).Zc(this.ZO).Zf(List.of(this.Zs), Zs_i.INSPECTOR).Zz().Zl();
      this.Zr = this.Zh;
      this.Z_ = this.Zo;
      this.ZY = this.ZM;
      this.ZI = new Zbqc(new BorderLayout());
      this.ZI.add(new JSeparator(), a(23145, 17339));
      this.ZK = new Zbc9();
      this.ZK.add(this.Zo);
      this.ZK.add(this.ZS);
      this.ZK.add(this.ZP);
      this.ZK.ZP(this.Zo);
      this.ZK.setName(a(23149, 11973));
      this.ZI.add(this.ZK, a(23140, 10747));
      this.Zx.add(this.ZI);
      this.Zx.add(Zw);
      this.Zx.ZP(Zw);
      add(this.Zx, a(23146, -166));
      if (!bool)
        Zbqc.Zr(new Zbqc[2]); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public void ZC() {
    Zbxj zbxj = this.Z_.Zs();
    zbxj.Zv(Zs_i.NOTES);
    zbxj.ZJ(true);
    this.ZY.ZH();
  }
  
  private static Zlu8<Zmw9<?>> Zh(Zm6x paramZm6x, Zei6 paramZei6) {
    // Byte code:
    //   0: new burp/Zlu8
    //   3: dup
    //   4: <illegal opcode> ZY : ()Lburp/Zmvw;
    //   9: aconst_null
    //   10: aconst_null
    //   11: getstatic burp/Zze0.PROXY_INTERCEPT_NOTES_SIDE_PANEL_CLICKED : Lburp/Zze0;
    //   14: aload_0
    //   15: invokespecial <init> : (Lburp/Zmvw;Lburp/Zv8r;Lburp/Zv8r;Lburp/Zze0;Lburp/Zm6x;)V
    //   18: astore_2
    //   19: aload_0
    //   20: ldc burp/Zluv
    //   22: getstatic burp/Zehw.SWING : Lburp/Zehw;
    //   25: aload_1
    //   26: aload_2
    //   27: <illegal opcode> Zy : (Lburp/Zei6;Lburp/Zlu8;)Lburp/Zxjl;
    //   32: invokevirtual ZO : (Ljava/lang/Class;Lburp/Zehw;Lburp/Zxjl;)Lburp/Zmt5;
    //   35: pop
    //   36: aload_2
    //   37: areturn
  }
  
  private void ZJ(List<? extends Zmw9<?>> paramList) {
    boolean bool = Zmue.Zm();
    if (this.Zv.Zy() != null)
      for (Zmw9<?> zmw9 : paramList) {
        try {
          if (zmw9.ZF(this.Zv.Zy().ZL())) {
            this.ZY.ZW();
            return;
          } 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        if (!bool)
          break; 
      }  
  }
  
  private Zsmh ZD(Zsmh paramZsmh, Zgsq paramZgsq) {
    Ztuo ztuo = new Ztuo(paramZgsq);
    paramZsmh.Zh(ztuo);
    return Zx(ztuo.ZB());
  }
  
  private Zsmh Zx(Zsmh paramZsmh) {
    Ze5b ze5b = new Ze5b(this);
    paramZsmh.Zh(ze5b);
    return ze5b.Zu;
  }
  
  private void Ze(Ztf_<?> paramZtf_) {
    boolean bool = Zmue.Zm();
    try {
      Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
      if (paramZtf_ != null) {
        try {
          ZA(paramZtf_);
          if (!bool) {
            Zt();
            return;
          } 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        return;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zt();
  }
  
  private void ZA(Ztf_<?> paramZtf_) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield Zk : Lburp/Ztf_;
    //   5: aload_0
    //   6: getfield ZY : Lburp/Zlu8;
    //   9: invokevirtual ZI : ()V
    //   12: invokestatic Zm : ()Z
    //   15: aload_1
    //   16: invokeinterface Za : ()Lburp/Zgu3;
    //   21: astore_3
    //   22: istore_2
    //   23: aload_3
    //   24: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   27: if_acmpne -> 180
    //   30: aload_0
    //   31: getfield Zf : Lburp/Zey9;
    //   34: aload_0
    //   35: getfield Zv : Lburp/Zei6;
    //   38: invokevirtual Zy : ()Lburp/Zz6e;
    //   41: invokeinterface ZJ : ()Lburp/Zmzk;
    //   46: aload_1
    //   47: invokeinterface Zm : ()[B
    //   52: invokevirtual ZY : (Lburp/Zmzk;[B)Lburp/Zefx;
    //   55: astore #4
    //   57: aload_1
    //   58: invokeinterface ZQ : ()Lburp/Zgsq;
    //   63: astore #5
    //   65: new burp/Zl0o
    //   68: dup
    //   69: aload #5
    //   71: invokespecial <init> : (Lburp/Zgsq;)V
    //   74: astore #6
    //   76: aload #4
    //   78: aload #6
    //   80: invokeinterface Zi : (Lburp/Zg5o;)V
    //   85: aload_0
    //   86: getfield Zh : Lburp/Zbdf;
    //   89: aload #6
    //   91: invokevirtual ZJ : ()Lburp/Zefx;
    //   94: aload #5
    //   96: iconst_1
    //   97: invokevirtual ZW : (Lburp/Zefx;Lburp/Zgsq;Z)V
    //   100: aload_0
    //   101: getfield ZL : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   104: iconst_0
    //   105: iconst_1
    //   106: invokevirtual compareAndSet : (ZZ)Z
    //   109: ifeq -> 141
    //   112: aload_0
    //   113: getfield Zh : Lburp/Zbdf;
    //   116: new burp/Zsbu
    //   119: dup
    //   120: aload_0
    //   121: aload_0
    //   122: getfield Zh : Lburp/Zbdf;
    //   125: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   128: invokespecial <init> : (Lburp/Zb5n;Lburp/Zbdf;Lburp/Zgu3;)V
    //   131: invokevirtual Zn : (Lburp/Zt7b;)V
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   140: athrow
    //   141: aload_0
    //   142: aload_0
    //   143: getfield Zh : Lburp/Zbdf;
    //   146: putfield Zr : Lburp/Zbdf;
    //   149: aload_0
    //   150: aload_0
    //   151: getfield Zo : Lburp/Zbdx;
    //   154: putfield Z_ : Lburp/Zbdx;
    //   157: aload_0
    //   158: aload_0
    //   159: getfield ZM : Lburp/Zlu8;
    //   162: putfield ZY : Lburp/Zlu8;
    //   165: aload_0
    //   166: getfield ZK : Lburp/Zbc9;
    //   169: aload_0
    //   170: getfield Zo : Lburp/Zbdx;
    //   173: invokevirtual ZP : (Ljava/awt/Component;)V
    //   176: iload_2
    //   177: ifne -> 417
    //   180: aload_3
    //   181: getstatic burp/Zgu3.HTTP_RESPONSE : Lburp/Zgu3;
    //   184: if_acmpne -> 320
    //   187: goto -> 194
    //   190: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   193: athrow
    //   194: aload_0
    //   195: getfield Zq : Lburp/Zbdf;
    //   198: aload_1
    //   199: invokeinterface Zr : ()[B
    //   204: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   207: invokevirtual ZN : ([BLburp/Zgu3;)V
    //   210: aload_0
    //   211: getfield ZV : Lburp/Zbdf;
    //   214: aload_1
    //   215: invokeinterface Zm : ()[B
    //   220: aload_3
    //   221: invokevirtual ZN : ([BLburp/Zgu3;)V
    //   224: aload_0
    //   225: getfield Zj : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   228: iconst_0
    //   229: iconst_1
    //   230: invokevirtual compareAndSet : (ZZ)Z
    //   233: ifeq -> 272
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   242: athrow
    //   243: aload_0
    //   244: getfield ZV : Lburp/Zbdf;
    //   247: new burp/Zsbu
    //   250: dup
    //   251: aload_0
    //   252: aload_0
    //   253: getfield ZV : Lburp/Zbdf;
    //   256: getstatic burp/Zgu3.HTTP_RESPONSE : Lburp/Zgu3;
    //   259: invokespecial <init> : (Lburp/Zb5n;Lburp/Zbdf;Lburp/Zgu3;)V
    //   262: invokevirtual Zn : (Lburp/Zt7b;)V
    //   265: goto -> 272
    //   268: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   271: athrow
    //   272: aload_0
    //   273: <illegal opcode> run : (Lburp/Zb5n;)Ljava/lang/Runnable;
    //   278: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   281: aload_0
    //   282: aload_0
    //   283: getfield ZV : Lburp/Zbdf;
    //   286: putfield Zr : Lburp/Zbdf;
    //   289: aload_0
    //   290: aload_0
    //   291: getfield ZS : Lburp/Zbdx;
    //   294: putfield Z_ : Lburp/Zbdx;
    //   297: aload_0
    //   298: aload_0
    //   299: getfield Zl : Lburp/Zlu8;
    //   302: putfield ZY : Lburp/Zlu8;
    //   305: aload_0
    //   306: getfield ZK : Lburp/Zbc9;
    //   309: aload_0
    //   310: getfield ZS : Lburp/Zbdx;
    //   313: invokevirtual ZP : (Ljava/awt/Component;)V
    //   316: iload_2
    //   317: ifne -> 417
    //   320: aload_0
    //   321: getfield ZO : Lburp/Zbdf;
    //   324: aload_1
    //   325: invokeinterface Zm : ()[B
    //   330: aload_3
    //   331: invokevirtual ZN : ([BLburp/Zgu3;)V
    //   334: aload_0
    //   335: getfield Zu : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   338: iconst_0
    //   339: iconst_1
    //   340: invokevirtual compareAndSet : (ZZ)Z
    //   343: ifeq -> 382
    //   346: goto -> 353
    //   349: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   352: athrow
    //   353: aload_0
    //   354: getfield ZO : Lburp/Zbdf;
    //   357: new burp/Zsbu
    //   360: dup
    //   361: aload_0
    //   362: aload_0
    //   363: getfield ZO : Lburp/Zbdf;
    //   366: getstatic burp/Zgu3.WS_MESSAGE : Lburp/Zgu3;
    //   369: invokespecial <init> : (Lburp/Zb5n;Lburp/Zbdf;Lburp/Zgu3;)V
    //   372: invokevirtual Zn : (Lburp/Zt7b;)V
    //   375: goto -> 382
    //   378: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   381: athrow
    //   382: aload_0
    //   383: aload_0
    //   384: getfield ZO : Lburp/Zbdf;
    //   387: putfield Zr : Lburp/Zbdf;
    //   390: aload_0
    //   391: aload_0
    //   392: getfield ZP : Lburp/Zbdx;
    //   395: putfield Z_ : Lburp/Zbdx;
    //   398: aload_0
    //   399: aload_0
    //   400: getfield Zs : Lburp/Zlu8;
    //   403: putfield ZY : Lburp/Zlu8;
    //   406: aload_0
    //   407: getfield ZK : Lburp/Zbc9;
    //   410: aload_0
    //   411: getfield ZP : Lburp/Zbdx;
    //   414: invokevirtual ZP : (Ljava/awt/Component;)V
    //   417: aload_0
    //   418: getfield ZY : Lburp/Zlu8;
    //   421: aload_1
    //   422: invokeinterface ZL : ()Lburp/Zmw9;
    //   427: invokevirtual ZS : (Lburp/Zlpg;)V
    //   430: aload_0
    //   431: getfield Zx : Lburp/Zbc9;
    //   434: aload_0
    //   435: getfield ZI : Lburp/Zbqc;
    //   438: invokevirtual ZP : (Ljava/awt/Component;)V
    //   441: return
    // Exception table:
    //   from	to	target	type
    //   76	134	137	java/lang/UnsupportedOperationException
    //   141	187	190	java/lang/UnsupportedOperationException
    //   180	236	239	java/lang/UnsupportedOperationException
    //   194	265	268	java/lang/UnsupportedOperationException
    //   272	346	349	java/lang/UnsupportedOperationException
    //   320	375	378	java/lang/UnsupportedOperationException
  }
  
  private void Zt() {
    this.Zx.ZP(Zw);
    this.Zh.ZN((byte[])null, Zgu3.HTTP_REQUEST);
    this.Zq.ZN((byte[])null, Zgu3.HTTP_REQUEST);
    this.ZV.ZN((byte[])null, Zgu3.HTTP_RESPONSE);
    this.ZO.ZN((byte[])null, Zgu3.WS_MESSAGE);
  }
  
  public List<Component> Zof() {
    return this.ZJ.ZM(this.Zv.Zy());
  }
  
  public Zepe Zl(Component paramComponent) {
    return new Zepa(a(23148, -3824), Zk97.DESKTOP_TOOLS_PROXY_INTERCEPT, Zt2m.ZF(this));
  }
  
  public Zmzk Zod() {
    return this.Zv.Zy().ZJ();
  }
  
  public Zgsq Zoe() {
    boolean bool = Zmue.Zm();
    Zgsq zgsq = null;
    try {
      if (this.Zv.Zy() != null) {
        switch (Zgy6.Zk[this.Zv.Zy().Za().ordinal()]) {
          case 1:
            return this.Zh.Zs();
          case 2:
            return this.Zv.Zy().ZQ();
          case 3:
            try {
              if (!bool)
                break; 
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            } 
            return zgsq;
        } 
        Zuh.ZT(false, Zqf.Zk, this.Zv.Zy().Za().toString());
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return zgsq;
  }
  
  public Zbr Zo3() {
    boolean bool = Zmue.ZH();
    Zbr zbr = null;
    try {
      if (this.Zv.Zy() != null) {
        switch (Zgy6.Zk[this.Zv.Zy().Za().ordinal()]) {
          case 1:
            return Zbr.ZF(this.Zf.Zy(this.Zh.Zi()), Zgsq.Zj(this.Zh.Zs()));
          case 2:
            return Zbr.ZF(this.Zf.Zy(this.Zv.Zy().Zx()), Zgsq.Zj(this.Zv.Zy().ZQ()));
          case 3:
            try {
              if (bool)
                break; 
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            } 
            return zbr;
        } 
        Zuh.ZT(false, Zqf.Zk, this.Zv.Zy().Za().toString());
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return zbr;
  }
  
  public Zstu Zos() {
    Zbr zbr = Zo3();
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    byte[] arrayOfByte = (zbr == null) ? null : zbr.ZP(null, this.Zf).ZD();
    return Zyf.Zy(arrayOfByte);
  }
  
  public boolean ZoZ() {
    return false;
  }
  
  public Zstu ZoO() {
    try {
      if (this.Zv.Zy() != null)
        try {
          if (this.Zv.Zy().Za() == Zgu3.HTTP_RESPONSE);
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return null;
  }
  
  public void Zg(byte[] paramArrayOfbyte) {
    boolean bool = Zmue.Zm();
    try {
      if (this.Zv.Zy() != null) {
        try {
          switch (Zgy6.Zk[this.Zv.Zy().Za().ordinal()]) {
            case 1:
              try {
                this.Zh.ZW(this.Zf.ZY(this.Zv.Zy().ZJ(), paramArrayOfbyte), this.Zh.Zs(), false);
                if (!bool)
                  throw new UnsupportedOperationException(a(23141, -32428)); 
              } catch (UnsupportedOperationException unsupportedOperationException) {
                throw a(null);
              } 
              return;
            case 2:
              throw new UnsupportedOperationException(a(23141, -32428));
          } 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        Zuh.ZT(false, Zqf.Zk, this.Zv.Zy().Za().toString());
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public void Z_(byte[] paramArrayOfbyte) {
    boolean bool = Zmue.ZH();
    try {
      if (this.Zv.Zy() != null) {
        try {
          switch (Zgy6.Zk[this.Zv.Zy().Za().ordinal()]) {
            case 1:
              throw new UnsupportedOperationException(a(23136, -28833));
            case 2:
              try {
                this.ZV.ZU(paramArrayOfbyte, Zgu3.HTTP_RESPONSE, false);
                if (bool)
                  break; 
              } catch (UnsupportedOperationException unsupportedOperationException) {
                throw a(null);
              } 
              return;
          } 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        Zuh.ZT(false, Zqf.Zk, this.Zv.Zy().Za().toString());
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public long ZoB() {
    return this.Zv.Zy().ZL().ZoB();
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return Zsou.Zb(this, paramZkl6.ZH());
  }
  
  public void Zc() {
    this.ZY.ZI();
  }
  
  public String ZZ() {
    return this.Zv.Zy().ZL().ZAs();
  }
  
  private void lambda$setInterceptedMessage$6() {
    this.ZS.Zg(0, 0, Zto4.RESPONSE);
  }
  
  private static void lambda$buildNotesSidebarComponent$5(Zei6 paramZei6, Zlu8 paramZlu8, Zluv paramZluv) {
    try {
      if (paramZluv.Zsq().ZF(paramZei6.Zy().ZL()))
        paramZlu8.ZW(); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  private static Object lambda$buildNotesSidebarComponent$4(List<Zmw9> paramList) {
    return new Zluv(paramList.getFirst(), Zg9f.UI);
  }
  
  private void lambda$new$3(Zlw3 paramZlw3) {
    Ze(paramZlw3.ZgK());
    ZC();
  }
  
  private void lambda$new$2(Ztzz paramZtzz) {
    Ze(paramZtzz.ZL9());
  }
  
  private void lambda$new$1(Zt4d paramZt4d) {
    ZJ((List)paramZt4d.ZYj());
  }
  
  private void lambda$new$0(Zg4r paramZg4r) {
    ZJ((List)paramZg4r.Ziv());
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'å­ÀopºpsELD:e±rÙÕÃåfë§Ì\².É¥É8c¾Ë×lBé\\t! ý)IÖ(Y{óEíºa»ZüC®ªS«s©1u¯|Î·Åê¼¼,*¡ ÑJró;E(¨fä\\rl®Ì\\nrÓß¦àý^°0ÑGèb.öjV;|ËAó4zÚdW1Êo,(}êîVÄl#¬Ö»îkÙ1*¿e¾ÙÃÇ=¬Ù3¸ãKiP½¶,)ÜRüõö[[RÝÔþdÃ3\_n¡ï\\rpÇiLÖW\\n©fYË¿v¿ù©învGyÛ0Ã"O$K·\\bBó¯1õEOf'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #26
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #124
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'Dmåo|¾º(S0+[SG@áQôX$Ì½¹£¸HÑ?öIÑ¾lèb¢- lÉcº§'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #7
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #81
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zb5n.a : [Ljava/lang/String;
    //   132: bipush #15
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb5n.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #90
    //   214: goto -> 244
    //   217: bipush #75
    //   219: goto -> 244
    //   222: bipush #52
    //   224: goto -> 244
    //   227: bipush #108
    //   229: goto -> 244
    //   232: bipush #7
    //   234: goto -> 244
    //   237: bipush #13
    //   239: goto -> 244
    //   242: bipush #19
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: new burp/Zbqc
    //   303: dup
    //   304: sipush #23142
    //   307: sipush #-18189
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zb5n.Zw : Ljava/awt/Component;
    //   319: return
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5A6E) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb5n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */