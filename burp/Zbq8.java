package burp;

import java.awt.Window;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.swing.SwingUtilities;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

public class Zbq8 implements Zgbj, Zt8u {
  private final Zz0n Zk;
  
  private final Zxei Zy;
  
  private final Zr_4 Zv;
  
  private final Zr_4 Zi;
  
  private final Zz7x ZR;
  
  private final Zeri Zg;
  
  private final Zskh ZG;
  
  private final Zlcb ZJ;
  
  private Zerg Zt;
  
  private Zt4u ZI;
  
  private Zgb6 ZH;
  
  private Zxgc Zl;
  
  private Zkl6 ZU;
  
  private Ztyg Za;
  
  private Zgq7 Zw;
  
  private Zgzy Zz;
  
  private final Zt26 ZA;
  
  private final Zm6x Zm;
  
  private final Zgvh ZP;
  
  private final Preferences ZM = Preferences.userNodeForPackage(StartBurp.class);
  
  private Zsy5 Zr;
  
  private Zgx0 Zc;
  
  private Zlaa Zo;
  
  private final Ztg4 Zj;
  
  private final Ztwv ZB;
  
  private final Zz_r Zs;
  
  private volatile boolean Ze;
  
  private Zg1w Zp;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbq8(Zz0n paramZz0n, Zxei paramZxei, Zr_4 paramZr_41, Zr_4 paramZr_42, Zskh paramZskh, Ztg4 paramZtg4, Ztwv paramZtwv, Zz_r paramZz_r, Zz7x paramZz7x, Zeri paramZeri, Zlcb paramZlcb, List<Runnable> paramList, Zm6x paramZm6x) {
    this.Zk = paramZz0n;
    this.Zy = paramZxei;
    this.ZG = paramZskh;
    this.Zj = paramZtg4;
    this.ZB = paramZtwv;
    this.Zs = paramZz_r;
    this.Zv = paramZr_41;
    this.Zi = paramZr_42;
    this.ZR = paramZz7x;
    this.Zg = paramZeri;
    this.ZJ = paramZlcb;
    this.ZA = new Zt26(paramZtwv);
    this.Zm = paramZm6x;
    this.ZP = new Zgvh();
    this.ZA.ZC(paramList);
  }
  
  public void Zj(Zt4u paramZt4u, Zerg paramZerg, Zgb6 paramZgb6, Zxgc paramZxgc, Zgzy paramZgzy, Zkl6 paramZkl6, Ztyg paramZtyg, Zgq7 paramZgq7) {
    this.ZI = paramZt4u;
    this.Zt = paramZerg;
    this.ZH = paramZgb6;
    this.Zl = paramZxgc;
    this.Zz = paramZgzy;
    this.ZU = paramZkl6;
    this.Za = paramZtyg;
    this.Zw = paramZgq7;
    this.Zp = new Zg1w();
  }
  
  public void ZH(Zgx0 paramZgx0, Zl_d paramZl_d, Zlaa paramZlaa) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield Zc : Lburp/Zgx0;
    //   5: invokestatic ZcN : ()[I
    //   8: aload_0
    //   9: aload_3
    //   10: putfield Zo : Lburp/Zlaa;
    //   13: astore #4
    //   15: aload_0
    //   16: aload_0
    //   17: getfield Zt : Lburp/Zerg;
    //   20: invokevirtual Zd : (Lburp/Zerg;)V
    //   23: aload_0
    //   24: sipush #-13298
    //   27: sipush #-18668
    //   30: invokestatic a : (II)Ljava/lang/String;
    //   33: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   36: invokevirtual toString : ()Ljava/lang/String;
    //   39: invokevirtual ZV : (Ljava/lang/String;Ljava/lang/String;)V
    //   42: aload_0
    //   43: getfield Zt : Lburp/Zerg;
    //   46: invokevirtual ZD : ()V
    //   49: aload_0
    //   50: getfield Zt : Lburp/Zerg;
    //   53: invokevirtual Zh : ()V
    //   56: aload_2
    //   57: iconst_1
    //   58: invokeinterface ZN : (Z)V
    //   63: invokestatic ZG : ()Z
    //   66: ifeq -> 102
    //   69: aload_0
    //   70: getfield ZA : Lburp/Zt26;
    //   73: invokevirtual ZK : ()V
    //   76: aload_0
    //   77: sipush #-13298
    //   80: sipush #-18668
    //   83: invokestatic a : (II)Ljava/lang/String;
    //   86: invokevirtual ZB : (Ljava/lang/String;)Z
    //   89: pop
    //   90: aload #4
    //   92: ifnonnull -> 124
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   101: athrow
    //   102: aload_0
    //   103: <illegal opcode> run : (Lburp/Zbq8;)Ljava/lang/Runnable;
    //   108: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   111: goto -> 124
    //   114: astore #5
    //   116: aload #5
    //   118: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   121: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   124: invokestatic getRuntime : ()Ljava/lang/Runtime;
    //   127: invokevirtual maxMemory : ()J
    //   130: ldc2_w 1000000
    //   133: ldiv
    //   134: lstore #5
    //   136: lload #5
    //   138: ldc2_w 200
    //   141: lcmp
    //   142: ifge -> 180
    //   145: getstatic burp/Zmgc.REQUEST_INCREASE_MEMORY : Lburp/Zmgc;
    //   148: aload_0
    //   149: getfield ZG : Lburp/Zskh;
    //   152: invokeinterface Zz : ()Lburp/Zskh;
    //   157: iconst_1
    //   158: anewarray java/lang/Object
    //   161: dup
    //   162: iconst_0
    //   163: lload #5
    //   165: invokestatic valueOf : (J)Ljava/lang/Long;
    //   168: aastore
    //   169: invokevirtual ZK : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   172: pop
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   179: athrow
    //   180: getstatic net/portswigger/Zvh.ZU : Lnet/portswigger/Zvh;
    //   183: invokevirtual ZM : ()Z
    //   186: ifeq -> 216
    //   189: getstatic burp/Zmgc.JVM_32_BIT : Lburp/Zmgc;
    //   192: aload_0
    //   193: getfield ZG : Lburp/Zskh;
    //   196: invokeinterface Zz : ()Lburp/Zskh;
    //   201: iconst_0
    //   202: anewarray java/lang/Object
    //   205: invokevirtual ZK : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   208: pop
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   215: athrow
    //   216: return
    // Exception table:
    //   from	to	target	type
    //   15	95	98	java/lang/Exception
    //   102	111	114	java/lang/Exception
    //   136	173	176	java/lang/Exception
    //   180	209	212	java/lang/Exception
  }
  
  private void Zd(Zerg paramZerg) {
    int[] arrayOfInt = Zkro.ZcN();
    String str = Zn(a(-13310, 20058));
    if (str != null) {
      boolean bool = true;
      try {
        if (!Zb12.ZG()) {
          try {
          
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          bool = (Zx6o.Zc(this.Zl.ZK1(), a(-13305, 19534), a(-13297, 15982), new String[] { a(-13309, -6026), a(-13301, 26483) }1) == 1) ? true : false;
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      Zkrl zkrl = paramZerg.ZW();
      try {
        if (bool)
          try {
            if (zkrl != null) {
              try {
                zkrl.ZYI();
                Zmgc.SAFE_MODE.ZK(this.ZG.Zz(), new Object[0]);
                if (arrayOfInt == null) {
                  Zmgc.NOT_SAFE_MODE.ZK(this.ZG.Zz(), new Object[0]);
                  return;
                } 
              } catch (NumberFormatException numberFormatException) {
                throw a(null);
              } 
              return;
            } 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          }  
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
    } else {
      return;
    } 
    Zmgc.NOT_SAFE_MODE.ZK(this.ZG.Zz(), new Object[0]);
  }
  
  public void ZR(Zeew paramZeew, String paramString1, String paramString2) {
    int[] arrayOfInt = Zkro.ZcN();
    try {
      if (paramZeew == null) {
        try {
          ZV(paramString1, paramString2);
          if (arrayOfInt == null) {
            Zgbm.ZZ(this.ZM, paramZeew.toolName.toLowerCase() + "." + paramZeew.toolName.toLowerCase(), paramString2);
            return;
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    Zgbm.ZZ(this.ZM, paramZeew.toolName.toLowerCase() + "." + paramZeew.toolName.toLowerCase(), paramString2);
  }
  
  public void ZV(String paramString1, String paramString2) {
    Zgbm.ZZ(this.ZM, a(-13300, 13026) + a(-13300, 13026), paramString2);
  }
  
  public String Zl(Zeew paramZeew, String paramString) {
    try {
      if (paramZeew == null)
        return Zn(paramString); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return Zgbm.ZB(this.ZM, paramZeew.toolName.toLowerCase() + "." + paramZeew.toolName.toLowerCase());
  }
  
  public String Zn(String paramString) {
    return Zgbm.ZB(this.ZM, a(-13300, 13026) + a(-13300, 13026));
  }
  
  public static String ZS(Preferences paramPreferences, String paramString) {
    return Zgbm.ZB(paramPreferences, a(-13302, -32711) + a(-13302, -32711));
  }
  
  public boolean Za(Zeew paramZeew, String paramString) {
    try {
      if (paramZeew == null)
        return ZB(paramString); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return Zgbm.ZO(this.ZM, paramZeew.toolName.toLowerCase() + "." + paramZeew.toolName.toLowerCase());
  }
  
  public Zshb Zz(String paramString) {
    Preferences preferences = Zk(paramString);
    return new Zbon(preferences);
  }
  
  public boolean ZB(String paramString) {
    return Zgbm.ZO(this.ZM, a(-13300, 13026) + a(-13300, 13026));
  }
  
  public Zshb ZD(String paramString) {
    Preferences preferences = this.ZM.node(paramString);
    try {
      preferences.flush();
    } catch (BackingStoreException backingStoreException) {
      Zah.Zl(backingStoreException, Zk_.UNEXPECTED);
    } 
    return new Zbon(preferences);
  }
  
  public List<String> Zg() {
    try {
      return Arrays.asList(this.ZM.keys());
    } catch (BackingStoreException backingStoreException) {
      Zah.Zl(backingStoreException, Zk_.UNEXPECTED);
      return Collections.emptyList();
    } 
  }
  
  public void ZB() {
    int[] arrayOfInt = Zkro.ZcN();
    try {
      String[] arrayOfString1 = this.ZM.childrenNames();
      String[] arrayOfString2 = arrayOfString1;
      int i = arrayOfString2.length;
      byte b = 0;
      while (b < i) {
        String str = arrayOfString2[b];
        Preferences preferences = this.ZM.node(str);
        preferences.removeNode();
        b++;
        if (arrayOfInt == null)
          break; 
      } 
    } catch (BackingStoreException backingStoreException) {
      Zah.Zl(backingStoreException, Zk_.UNEXPECTED);
    } 
  }
  
  private Preferences Zk(String paramString) {
    paramString = "_" + paramString.replace("/", "_");
    return this.ZM.node(a(-13308, 394) + a(-13308, 394));
  }
  
  public Zsy5 Zt() {
    // Byte code:
    //   0: invokestatic ZcN : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zr : Lburp/Zsy5;
    //   8: ifnonnull -> 140
    //   11: aload_0
    //   12: getfield ZM : Ljava/util/prefs/Preferences;
    //   15: sipush #-13307
    //   18: sipush #-2187
    //   21: invokestatic a : (II)Ljava/lang/String;
    //   24: aconst_null
    //   25: invokevirtual get : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   28: astore_3
    //   29: sipush #-13299
    //   32: sipush #-12599
    //   35: invokestatic a : (II)Ljava/lang/String;
    //   38: aload_3
    //   39: invokevirtual equals : (Ljava/lang/Object;)Z
    //   42: ifeq -> 57
    //   45: getstatic burp/Zrrh.SUITE_SETTINGS_PASSWORDS_OPTION_SAVE_IN_CLEAR_TEXT : Lburp/Zrrh;
    //   48: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   51: iconst_0
    //   52: istore_2
    //   53: aload_1
    //   54: ifnonnull -> 135
    //   57: sipush #-13311
    //   60: sipush #-7051
    //   63: invokestatic a : (II)Ljava/lang/String;
    //   66: aload_3
    //   67: invokevirtual equals : (Ljava/lang/Object;)Z
    //   70: ifeq -> 92
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   79: athrow
    //   80: getstatic burp/Zrrh.SUITE_SETTINGS_PASSWORDS_OPTION_DO_NOT_SAVE : Lburp/Zrrh;
    //   83: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   86: iconst_2
    //   87: istore_2
    //   88: aload_1
    //   89: ifnonnull -> 135
    //   92: sipush #-13303
    //   95: sipush #-600
    //   98: invokestatic a : (II)Ljava/lang/String;
    //   101: aload_3
    //   102: invokevirtual equals : (Ljava/lang/Object;)Z
    //   105: ifeq -> 127
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   114: athrow
    //   115: getstatic burp/Zrrh.SUITE_SETTINGS_PASSWORDS_OPTION_SAVE_ENCRYPTED : Lburp/Zrrh;
    //   118: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   121: iconst_1
    //   122: istore_2
    //   123: aload_1
    //   124: ifnonnull -> 135
    //   127: getstatic burp/Zrrh.SUITE_SETTINGS_PASSWORDS_OPTION_SAVE_IN_CLEAR_TEXT : Lburp/Zrrh;
    //   130: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   133: iconst_0
    //   134: istore_2
    //   135: aload_0
    //   136: iload_2
    //   137: invokevirtual Zy : (B)V
    //   140: aload_0
    //   141: getfield Zr : Lburp/Zsy5;
    //   144: areturn
    // Exception table:
    //   from	to	target	type
    //   53	73	76	java/lang/NumberFormatException
    //   88	108	111	java/lang/NumberFormatException
  }
  
  private void Zy(byte paramByte) {
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    this.Zr = new Zlu2(paramByte, null, (Zb12.ZG() || this.Zl == null) ? null : this.Zl.ZK1(), this.ZG);
  }
  
  public boolean Zy() {
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return (Zn(a(-13291, 1886)) == null);
  }
  
  public void Zy(Runnable paramRunnable) {
    this.ZA.Zk(paramRunnable);
  }
  
  public void Zr(Runnable paramRunnable) {
    this.ZP.ZA(paramRunnable);
  }
  
  public void ZK(boolean paramBoolean) {
    try {
      if (paramBoolean)
        try {
          if (!Zb12.ZG())
            try {
              if (!this.ZH.Zfb())
                try {
                  if (!Zx6o.ZY(this.Zl.ZK1(), a(-13312, -18682)))
                    return; 
                } catch (NumberFormatException numberFormatException) {
                  throw a(null);
                }  
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            }  
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    Zm2.ZC(Zrrh.SUITE_PROJECTS_GRACEFUL_SHUTDOWN);
    ZB(a(-13298, -18668));
    this.ZB.Zx(this::lambda$exitSuite$3);
  }
  
  private void ZQ() {
    try {
      if (this.Zv.Zi())
        try {
          if (this.ZH.ZfY())
            try {
              if (this.ZH.Zf9())
                this.ZI.ZB(); 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            }  
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  public void Z_() {
    System.out.print(a(-13306, -31914));
    String str = this.Zj.ZW(this.Zy.Zn());
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    System.out.println((str == null) ? a(-13304, 18369) : str);
  }
  
  public void Zt(Window paramWindow, Zlit paramZlit) {
    this.Zz.Zw().ZS(paramWindow, paramZlit);
  }
  
  public void Zl(Window paramWindow, Zlit paramZlit) {
    new Zm82(paramWindow, this.Zk.ZP(), this.Zt.ZA().ZZ(), this.Zt.ZM(), this.Zt.Zj().ZY4(), this.Zs, this.ZH, this.ZU, paramZlit, this.ZB, this.Zv, this.Zi, this.Zc, this.Zo, this.ZJ, this.Zm);
  }
  
  public void Zk(Window paramWindow, Zez3[] paramArrayOfZez3) {
    new Zl4n(paramWindow, this.Zk, this.Zt, this.ZH, this.ZU, this.ZB, paramArrayOfZez3, this.Zo, this.ZJ);
  }
  
  public void ZC(Zeew paramZeew, Window paramWindow, Zmzk paramZmzk, Zbr paramZbr, Zgsq paramZgsq) {
    new Zl4q(this.Zk, this.Zt, this.ZH, paramZeew, paramWindow, paramZmzk, paramZbr, this.ZB, this.Zv, this.Za, this.Zw, paramZgsq, this.ZU.ZH());
  }
  
  private void lambda$exitSuite$3() {
    try {
      this.ZP.ZX();
      if (this.Zz.ZC())
        return; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (this.Zk.Zr().ZM() == Zra1.EXECUTION_MODE_DESKTOP)
        try {
          if (this.Ze) {
            this.ZR.Zg(new Zm3g[] { this.ZH, this.Zt });
            this.Zg.Zn(new Zm3g[] { this.Zl });
            this.Zt.ZM(this);
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      this.Zt.ZB();
      if (!Zb12.ZG()) {
        this.Zp.Zj(this.Zl.ZK8());
        this.Zp.Zj(this.Zl.ZKM());
        this.Zl.ZAg(false);
        this.Zl.ZKC();
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    this.Zt.Zf();
    Z_();
    Ztum.ZI();
    ZQ();
    this.Zy.ZK(this.ZI);
  }
  
  private void lambda$initialisePostTools$2() {
    // Byte code:
    //   0: invokestatic ZcN : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zl : Lburp/Zxgc;
    //   8: invokeinterface ZKb : ()V
    //   13: aload_0
    //   14: getfield ZR : Lburp/Zz7x;
    //   17: invokevirtual Zg : ()Z
    //   20: ifeq -> 143
    //   23: aload_0
    //   24: getfield Zp : Lburp/Zg1w;
    //   27: invokevirtual Zh : ()Ljava/awt/Rectangle;
    //   30: astore_2
    //   31: aload_0
    //   32: getfield Zl : Lburp/Zxgc;
    //   35: aload_2
    //   36: invokeinterface Zb : (Ljava/awt/Rectangle;)V
    //   41: aload_0
    //   42: getfield Zl : Lburp/Zxgc;
    //   45: invokeinterface ZK4 : ()Z
    //   50: ifne -> 69
    //   53: aload_0
    //   54: getfield Zl : Lburp/Zxgc;
    //   57: invokeinterface ZKi : ()V
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: aload_0
    //   70: getfield Zp : Lburp/Zg1w;
    //   73: invokevirtual Zg : ()I
    //   76: bipush #6
    //   78: if_icmpne -> 99
    //   81: aload_0
    //   82: getfield Zl : Lburp/Zxgc;
    //   85: bipush #6
    //   87: invokeinterface ZZj : (I)V
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: goto -> 159
    //   102: astore_2
    //   103: aload_2
    //   104: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   107: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   110: aload_0
    //   111: getfield Zl : Lburp/Zxgc;
    //   114: invokeinterface ZKi : ()V
    //   119: goto -> 159
    //   122: astore_2
    //   123: aload_2
    //   124: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   127: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   130: aload_0
    //   131: getfield Zl : Lburp/Zxgc;
    //   134: invokeinterface ZKi : ()V
    //   139: aload_1
    //   140: ifnonnull -> 159
    //   143: aload_0
    //   144: getfield Zl : Lburp/Zxgc;
    //   147: invokeinterface ZKi : ()V
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   158: athrow
    //   159: aload_0
    //   160: getfield Zl : Lburp/Zxgc;
    //   163: iconst_1
    //   164: invokeinterface ZAg : (Z)V
    //   169: aload_0
    //   170: iconst_1
    //   171: putfield Ze : Z
    //   174: aload_0
    //   175: getfield ZA : Lburp/Zt26;
    //   178: aload_0
    //   179: <illegal opcode> run : (Lburp/Zbq8;)Ljava/lang/Runnable;
    //   184: invokevirtual Zk : (Ljava/lang/Runnable;)V
    //   187: aload_0
    //   188: getfield ZA : Lburp/Zt26;
    //   191: invokevirtual ZK : ()V
    //   194: return
    // Exception table:
    //   from	to	target	type
    //   23	99	102	java/lang/NumberFormatException
    //   23	99	122	java/lang/Exception
    //   31	62	65	java/lang/NumberFormatException
    //   69	92	95	java/lang/NumberFormatException
    //   123	152	155	java/lang/NumberFormatException
  }
  
  private void lambda$initialisePostTools$1() {
    Zsk5.ZJ(5000L);
    SwingUtilities.invokeLater(this::lambda$initialisePostTools$0);
  }
  
  private void lambda$initialisePostTools$0() {
    ZB(a(-13298, -18668));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Jý^A-cõ$Å¦ÿ2øÓ(æÂ 6CG@ª;}¯;ÌÑ\\t(X.hÿT+t$ækô©ÊtiÃ%õªtì!á»f¤*_ÑNrI°JLx¾\\rTûù1etA1l\\n?¢HjKÓ\\nMÂÉ*Î\\rJÕ*WFpºYD*n%""J¦Ðr¥EÂUËÔ¢£d÷lÏX»²²\\fû&±TePÄ"6¼-twºb%À_ÛiÇ¸Ja×ôJrßx!AU)NÚb©OBÂgnÐ áN?"àë1â ¥72 A1D/-bîø@Lc¡,7O×Z8^Óøá{ò@ð6ß9²{Ì!qsàíçÛàä9 \\r1É Q<{\\f½ãsé\\fz³«{nb'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #24
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #111
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
    //   68: ldc 'cXIG$\\ndJmàÔ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #24
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
    //   129: putstatic burp/Zbq8.a : [Ljava/lang/String;
    //   132: bipush #17
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbq8.b : [Ljava/lang/String;
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
    //   212: bipush #17
    //   214: goto -> 244
    //   217: bipush #85
    //   219: goto -> 244
    //   222: bipush #104
    //   224: goto -> 244
    //   227: bipush #18
    //   229: goto -> 244
    //   232: bipush #89
    //   234: goto -> 244
    //   237: bipush #73
    //   239: goto -> 244
    //   242: bipush #75
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCC05) & 0xFFFF;
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
      char c = '³';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbq8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */