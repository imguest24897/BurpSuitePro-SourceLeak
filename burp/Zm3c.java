package burp;

import java.util.function.Supplier;
import net.portswigger.Zm2;

public class Zm3c implements Zxaw {
  private final Supplier<Zgf3> Zv;
  
  private final Zb_x ZX;
  
  private final Zmo9 Z_;
  
  private final Zemt ZV;
  
  private final Supplier<Zs41> Zc;
  
  private final Zsh8 Zz;
  
  private final Ztwv Zd;
  
  private final Zskh Zt;
  
  private final Zmuy Zm;
  
  private final Zr_4 Zf;
  
  private boolean ZC;
  
  private boolean Zl;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zm3c(Supplier<Zgf3> paramSupplier, Zemt paramZemt, Supplier<Zs41> paramSupplier1, Zb_x paramZb_x, Zsh8 paramZsh8, Zmo9 paramZmo9, Ztwv paramZtwv, Zskh paramZskh, Zmuy paramZmuy, Zr_4 paramZr_4) {
    this.Zv = paramSupplier;
    this.Z_ = paramZmo9;
    this.ZV = paramZemt;
    this.Zc = paramSupplier1;
    this.ZX = paramZb_x;
    this.Zz = paramZsh8;
    this.Zd = paramZtwv;
    this.Zt = paramZskh;
    this.Zm = paramZmuy;
    this.Zf = paramZr_4;
  }
  
  public void Zu(Zr23 paramZr23) {
    Zl();
    ((Zs41)this.Zc.get()).Zs(this.Zz, paramZr23);
  }
  
  private void Zl() {
    if (!this.Zl && !this.ZX.Zl()) {
      Zm2.ZC(Zrrh.INTRUDER_ATTACK_LIVE_CONFIG_MODIFIED);
      this.Z_.ZG(((Zgf3)this.Zv.get()).Zc(), a(22767, 31414), a(22766, 30727));
      this.Zl = true;
    } 
  }
  
  public void Zh() {
    this.Zm.Zq();
  }
  
  public void ZA(byte paramByte, boolean[] paramArrayOfboolean, Zr23 paramZr23) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zl : ()V
    //   4: aload_0
    //   5: getfield Z_ : Lburp/Zmo9;
    //   8: aload_0
    //   9: getfield Zv : Ljava/util/function/Supplier;
    //   12: invokeinterface get : ()Ljava/lang/Object;
    //   17: checkcast burp/Zgf3
    //   20: invokevirtual Zc : ()Ljava/awt/Component;
    //   23: sipush #22760
    //   26: sipush #19518
    //   29: invokestatic a : (II)Ljava/lang/String;
    //   32: invokeinterface Zj : (Ljava/awt/Component;Ljava/lang/String;)Lburp/Zrhg;
    //   37: astore #4
    //   39: aload_0
    //   40: getfield Zd : Lburp/Ztwv;
    //   43: aload_0
    //   44: aload_3
    //   45: iload_1
    //   46: aload_2
    //   47: aload #4
    //   49: <illegal opcode> run : (Lburp/Zm3c;Lburp/Zr23;B[ZLburp/Zrhg;)Ljava/lang/Runnable;
    //   54: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   59: pop
    //   60: return
  }
  
  public void ZM(byte paramByte, boolean[] paramArrayOfboolean, Zr23 paramZr23) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zl : ()V
    //   4: aload_0
    //   5: getfield Z_ : Lburp/Zmo9;
    //   8: aload_0
    //   9: getfield Zv : Ljava/util/function/Supplier;
    //   12: invokeinterface get : ()Ljava/lang/Object;
    //   17: checkcast burp/Zgf3
    //   20: invokevirtual Zc : ()Ljava/awt/Component;
    //   23: sipush #22760
    //   26: sipush #19518
    //   29: invokestatic a : (II)Ljava/lang/String;
    //   32: invokeinterface Zj : (Ljava/awt/Component;Ljava/lang/String;)Lburp/Zrhg;
    //   37: astore #4
    //   39: aload_0
    //   40: getfield Zd : Lburp/Ztwv;
    //   43: aload_0
    //   44: aload_3
    //   45: iload_1
    //   46: aload_2
    //   47: aload #4
    //   49: <illegal opcode> run : (Lburp/Zm3c;Lburp/Zr23;B[ZLburp/Zrhg;)Ljava/lang/Runnable;
    //   54: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   59: pop
    //   60: return
  }
  
  public void ZJ(byte paramByte, boolean[] paramArrayOfboolean, Zr23 paramZr23) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zl : ()V
    //   4: aload_0
    //   5: getfield Z_ : Lburp/Zmo9;
    //   8: aload_0
    //   9: getfield Zv : Ljava/util/function/Supplier;
    //   12: invokeinterface get : ()Ljava/lang/Object;
    //   17: checkcast burp/Zgf3
    //   20: invokevirtual Zc : ()Ljava/awt/Component;
    //   23: sipush #22763
    //   26: sipush #26127
    //   29: invokestatic a : (II)Ljava/lang/String;
    //   32: invokeinterface Zj : (Ljava/awt/Component;Ljava/lang/String;)Lburp/Zrhg;
    //   37: astore #4
    //   39: aload_0
    //   40: getfield Zd : Lburp/Ztwv;
    //   43: aload_0
    //   44: aload_3
    //   45: iload_1
    //   46: aload_2
    //   47: aload #4
    //   49: <illegal opcode> run : (Lburp/Zm3c;Lburp/Zr23;B[ZLburp/Zrhg;)Ljava/lang/Runnable;
    //   54: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   59: pop
    //   60: return
  }
  
  public void ZE(Zgxp paramZgxp, Zstu paramZstu, Zsh8 paramZsh8, Zkk3[] paramArrayOfZkk3, Zl8c[] paramArrayOfZl8c, Zz4g paramZz4g, byte paramByte, boolean[] paramArrayOfboolean1, boolean[] paramArrayOfboolean2) {
    if (paramZstu == null)
      return; 
    String str = null;
    Zznf zznf = paramZgxp.ZeD();
    if (zznf == null)
      zznf = this.Zf.<Zznf>ZH(new Zeul()); 
    if ((paramByte & 0x1) != 0 && paramArrayOfZl8c != null)
      str = Za(paramZgxp, paramZstu, paramArrayOfboolean1, paramZz4g, str, zznf); 
    if ((paramByte & 0x2) != 0 && paramArrayOfZkk3 != null)
      Zk(paramZgxp, paramZstu, paramArrayOfboolean2, paramZz4g, paramArrayOfZkk3, str, zznf); 
    if ((paramByte & 0x4) != 0)
      ZK(paramZgxp, paramZstu, paramZsh8, paramZz4g, zznf); 
    paramZgxp.ZB(zznf);
  }
  
  private void ZK(Zgxp paramZgxp, Zstu paramZstu, Zsh8 paramZsh8, Zz4g paramZz4g, Zznf paramZznf) {
    // Byte code:
    //   0: invokestatic ZX : ()Z
    //   3: istore #6
    //   5: aload_1
    //   6: invokeinterface Ze0 : ()I
    //   11: istore #7
    //   13: aload #4
    //   15: invokeinterface Zva : ()Z
    //   20: ifeq -> 28
    //   23: iload #7
    //   25: ifge -> 31
    //   28: iconst_0
    //   29: istore #7
    //   31: aload #5
    //   33: invokeinterface ZT8 : ()[B
    //   38: astore #8
    //   40: aload #8
    //   42: ifnonnull -> 60
    //   45: aload_3
    //   46: invokeinterface ZPq : ()Lburp/Zrte;
    //   51: invokeinterface Zpu : ()I
    //   56: newarray byte
    //   58: astore #8
    //   60: iconst_0
    //   61: istore #9
    //   63: iload #9
    //   65: aload #8
    //   67: arraylength
    //   68: if_icmpge -> 236
    //   71: aload_1
    //   72: invokeinterface Zer : ()S
    //   77: iconst_m1
    //   78: if_icmpne -> 84
    //   81: goto -> 228
    //   84: aload_3
    //   85: invokeinterface ZPa : ()Lburp/Zejb;
    //   90: getstatic burp/Zejb.SNIPER : Lburp/Zejb;
    //   93: if_acmpne -> 127
    //   96: aload_3
    //   97: aload_1
    //   98: aload_1
    //   99: invokeinterface Zer : ()S
    //   104: aload #4
    //   106: invokeinterface ZvF : ()Z
    //   111: ifne -> 118
    //   114: iconst_1
    //   115: goto -> 119
    //   118: iconst_0
    //   119: invokeinterface ZJ : (Lburp/Zgxp;IZ)[B
    //   124: goto -> 151
    //   127: aload_3
    //   128: aload_1
    //   129: iload #9
    //   131: aload #4
    //   133: invokeinterface ZvF : ()Z
    //   138: ifne -> 145
    //   141: iconst_1
    //   142: goto -> 146
    //   145: iconst_0
    //   146: invokeinterface ZJ : (Lburp/Zgxp;IZ)[B
    //   151: astore #10
    //   153: aload #10
    //   155: ifnonnull -> 201
    //   158: aload_0
    //   159: getfield ZC : Z
    //   162: ifne -> 228
    //   165: aload_0
    //   166: getfield Zt : Lburp/Zskh;
    //   169: invokeinterface Zz : ()Lburp/Zskh;
    //   174: getstatic burp/Zkqn.INFORMATION : Lburp/Zkqn;
    //   177: sipush #22762
    //   180: sipush #-20104
    //   183: invokestatic a : (II)Ljava/lang/String;
    //   186: invokeinterface Zl : (Lburp/Zkqn;Ljava/lang/String;)V
    //   191: aload_0
    //   192: iconst_1
    //   193: putfield ZC : Z
    //   196: iload #6
    //   198: ifne -> 228
    //   201: aload #10
    //   203: aload_2
    //   204: aload #4
    //   206: invokeinterface Zvp : ()Z
    //   211: iload #7
    //   213: invokestatic Zx : ([BLburp/Zstu;ZI)Lburp/Zkh2;
    //   216: astore #11
    //   218: aload #8
    //   220: iload #9
    //   222: aload #11
    //   224: invokevirtual ZF : ()B
    //   227: bastore
    //   228: iinc #9, 1
    //   231: iload #6
    //   233: ifne -> 63
    //   236: aload #5
    //   238: aload #8
    //   240: invokeinterface ZY : ([B)V
    //   245: return
  }
  
  private String Za(Zgxp paramZgxp, Zstu paramZstu, boolean[] paramArrayOfboolean, Zz4g paramZz4g, String paramString, Zznf paramZznf) {
    boolean bool = Zs7w.Zw();
    int i = paramZgxp.Ze0();
    if (!paramZz4g.Zvg() || i < 0)
      i = 0; 
    if (paramZz4g.Zvc())
      paramString = (paramZstu == null) ? null : paramZstu.Zis().substring(i, paramZstu.Zpu()); 
    byte[] arrayOfByte = paramZznf.ZTt();
    if (arrayOfByte == null) {
      paramZznf.Zk(new byte[(paramZz4g.Zvb()).length]);
      arrayOfByte = paramZznf.ZTt();
    } 
    byte b = 0;
    while (b < arrayOfByte.length) {
      if (paramArrayOfboolean == null || paramArrayOfboolean[b]) {
        Zl8c zl8c = paramZz4g.Zvb()[b];
        Zkh2 zkh2 = zl8c.ZT(paramZstu, paramString, paramZz4g.Zvd(), i);
        arrayOfByte[b] = zkh2.ZF();
      } 
      b++;
      if (bool)
        break; 
    } 
    paramZznf.Zk(arrayOfByte);
    return paramString;
  }
  
  private void Zk(Zgxp paramZgxp, Zstu paramZstu, boolean[] paramArrayOfboolean, Zz4g paramZz4g, Zkk3[] paramArrayOfZkk3, String paramString, Zznf paramZznf) {
    // Byte code:
    //   0: invokestatic Zw : ()Z
    //   3: istore #8
    //   5: aload #7
    //   7: invokeinterface ZTL : ()Lburp/Zrte;
    //   12: astore #9
    //   14: aload #9
    //   16: ifnonnull -> 46
    //   19: aload_0
    //   20: getfield Zf : Lburp/Zr_4;
    //   23: new burp/Zguz
    //   26: dup
    //   27: getstatic burp/Zstu.Zc : Lburp/Zllg;
    //   30: invokespecial <init> : (Lburp/Zeu4;)V
    //   33: aload #5
    //   35: arraylength
    //   36: invokeinterface Zv : (Lburp/Zllg;I)Lburp/Ze34;
    //   41: checkcast burp/Zrte
    //   44: astore #9
    //   46: iconst_0
    //   47: istore #10
    //   49: iconst_0
    //   50: istore #11
    //   52: iload #11
    //   54: aload #9
    //   56: invokeinterface Zpu : ()I
    //   61: if_icmpge -> 313
    //   64: aload_3
    //   65: ifnull -> 108
    //   68: aload_3
    //   69: iload #11
    //   71: baload
    //   72: ifne -> 108
    //   75: iload #11
    //   77: iconst_1
    //   78: iadd
    //   79: aload #4
    //   81: invokeinterface ZvW : ()[Z
    //   86: arraylength
    //   87: if_icmpge -> 305
    //   90: aload #4
    //   92: invokeinterface ZvW : ()[Z
    //   97: iload #11
    //   99: iconst_1
    //   100: iadd
    //   101: baload
    //   102: ifne -> 108
    //   105: goto -> 305
    //   108: aload #6
    //   110: ifnonnull -> 140
    //   113: aload #5
    //   115: iload #11
    //   117: aaload
    //   118: invokevirtual ZB : ()Z
    //   121: ifeq -> 140
    //   124: aload_2
    //   125: ifnonnull -> 132
    //   128: aconst_null
    //   129: goto -> 138
    //   132: aload_2
    //   133: invokeinterface Zis : ()Ljava/lang/String;
    //   138: astore #6
    //   140: aload_2
    //   141: ifnonnull -> 148
    //   144: aconst_null
    //   145: goto -> 189
    //   148: aload #5
    //   150: iload #11
    //   152: aaload
    //   153: aload_2
    //   154: invokeinterface ZiD : ()[B
    //   159: aload #6
    //   161: aload_1
    //   162: invokeinterface Ze0 : ()I
    //   167: aload #4
    //   169: invokeinterface ZvW : ()[Z
    //   174: iload #11
    //   176: baload
    //   177: ifeq -> 185
    //   180: iload #10
    //   182: goto -> 186
    //   185: iconst_0
    //   186: invokevirtual ZV : ([BLjava/lang/String;II)[I
    //   189: astore #12
    //   191: aload #12
    //   193: ifnonnull -> 222
    //   196: aload #9
    //   198: iload #11
    //   200: aload_0
    //   201: getfield Zf : Lburp/Zr_4;
    //   204: getstatic net/portswigger/Zdo.ZQ : [B
    //   207: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   212: invokeinterface ZU : (ILburp/Zgpi;)V
    //   217: iload #8
    //   219: ifeq -> 305
    //   222: aload #4
    //   224: invokeinterface Zvf : ()S
    //   229: ifle -> 267
    //   232: aload #12
    //   234: iconst_1
    //   235: iaload
    //   236: aload #12
    //   238: iconst_0
    //   239: iaload
    //   240: isub
    //   241: aload #4
    //   243: invokeinterface Zvf : ()S
    //   248: if_icmple -> 267
    //   251: aload #12
    //   253: iconst_1
    //   254: aload #12
    //   256: iconst_0
    //   257: iaload
    //   258: aload #4
    //   260: invokeinterface Zvf : ()S
    //   265: iadd
    //   266: iastore
    //   267: aload #9
    //   269: iload #11
    //   271: aload_2
    //   272: aload #12
    //   274: iconst_0
    //   275: iaload
    //   276: aload #12
    //   278: iconst_1
    //   279: iaload
    //   280: invokeinterface Zb : (II)Lburp/Zstu;
    //   285: aload_0
    //   286: getfield Zf : Lburp/Zr_4;
    //   289: invokeinterface Zp : (Lburp/Zr_4;)Lburp/Zstu;
    //   294: invokeinterface ZU : (ILburp/Zgpi;)V
    //   299: aload #12
    //   301: iconst_1
    //   302: iaload
    //   303: istore #10
    //   305: iinc #11, 1
    //   308: iload #8
    //   310: ifeq -> 52
    //   313: aload #7
    //   315: aload #9
    //   317: invokeinterface ZV : (Lburp/Zrte;)V
    //   322: return
  }
  
  private void lambda$grepConfigModified$8(Zr23 paramZr23, byte paramByte, boolean[] paramArrayOfboolean, Zrhg paramZrhg) {
    // Byte code:
    //   0: invokestatic Zw : ()Z
    //   3: istore #5
    //   5: iconst_0
    //   6: istore #8
    //   8: aload_0
    //   9: getfield Zz : Lburp/Zsh8;
    //   12: invokeinterface ZP_ : ()Lburp/Zz4g;
    //   17: astore #9
    //   19: aload_0
    //   20: dup
    //   21: astore #10
    //   23: monitorenter
    //   24: aload_0
    //   25: getfield Zc : Ljava/util/function/Supplier;
    //   28: invokeinterface get : ()Ljava/lang/Object;
    //   33: checkcast burp/Zs41
    //   36: aload_0
    //   37: getfield Zz : Lburp/Zsh8;
    //   40: aload_1
    //   41: invokeinterface Zs : (Lburp/Zsh8;Lburp/Zr23;)V
    //   46: aload #9
    //   48: ifnonnull -> 83
    //   51: aload_0
    //   52: getfield Zf : Lburp/Zr_4;
    //   55: new burp/Zrrq
    //   58: dup
    //   59: invokespecial <init> : ()V
    //   62: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   67: checkcast burp/Zz4g
    //   70: astore #9
    //   72: aload_0
    //   73: getfield Zz : Lburp/Zsh8;
    //   76: aload #9
    //   78: invokeinterface ZK : (Lburp/Zz4g;)V
    //   83: aload_0
    //   84: getfield ZV : Lburp/Zemt;
    //   87: invokevirtual ZC : ()Ljava/util/List;
    //   90: astore #6
    //   92: aload #6
    //   94: invokeinterface size : ()I
    //   99: istore #7
    //   101: aload #10
    //   103: monitorexit
    //   104: goto -> 115
    //   107: astore #11
    //   109: aload #10
    //   111: monitorexit
    //   112: aload #11
    //   114: athrow
    //   115: aload #9
    //   117: invokeinterface ZvZ : ()[Lburp/Zkk3;
    //   122: astore #10
    //   124: iconst_0
    //   125: istore #11
    //   127: iload #11
    //   129: iload #7
    //   131: if_icmpge -> 321
    //   134: aload #6
    //   136: iload #11
    //   138: invokeinterface get : (I)Ljava/lang/Object;
    //   143: checkcast burp/Zgxp
    //   146: astore #12
    //   148: aload #12
    //   150: invokeinterface ZoO : ()Lburp/Zstu;
    //   155: astore #13
    //   157: iload #8
    //   159: ifne -> 231
    //   162: aload #13
    //   164: ifnonnull -> 231
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   173: athrow
    //   174: aload #12
    //   176: invokeinterface Ze4 : ()Z
    //   181: ifne -> 231
    //   184: goto -> 191
    //   187: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   190: athrow
    //   191: aload #12
    //   193: invokeinterface ZeZ : ()Z
    //   198: ifne -> 231
    //   201: goto -> 208
    //   204: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   207: athrow
    //   208: getstatic burp/Zmgc.GREP_ANALYSIS_FAILED : Lburp/Zmgc;
    //   211: aload_0
    //   212: getfield Zt : Lburp/Zskh;
    //   215: invokeinterface Zz : ()Lburp/Zskh;
    //   220: iconst_0
    //   221: anewarray java/lang/Object
    //   224: invokevirtual ZK : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   227: pop
    //   228: iconst_1
    //   229: istore #8
    //   231: aload_0
    //   232: aload #12
    //   234: aload #13
    //   236: aload_0
    //   237: getfield Zz : Lburp/Zsh8;
    //   240: aload #10
    //   242: aload #9
    //   244: invokeinterface Zvb : ()[Lburp/Zl8c;
    //   249: aload #9
    //   251: iload_2
    //   252: iload_2
    //   253: iconst_1
    //   254: if_icmpne -> 265
    //   257: aload_3
    //   258: goto -> 266
    //   261: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   264: athrow
    //   265: aconst_null
    //   266: iload_2
    //   267: iconst_2
    //   268: if_icmpne -> 279
    //   271: aload_3
    //   272: goto -> 280
    //   275: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   278: athrow
    //   279: aconst_null
    //   280: invokevirtual ZE : (Lburp/Zgxp;Lburp/Zstu;Lburp/Zsh8;[Lburp/Zkk3;[Lburp/Zl8c;Lburp/Zz4g;B[Z[Z)V
    //   283: iload #11
    //   285: bipush #20
    //   287: irem
    //   288: ifne -> 313
    //   291: iload #11
    //   293: bipush #100
    //   295: imul
    //   296: iload #7
    //   298: idiv
    //   299: istore #14
    //   301: aload #4
    //   303: iload #14
    //   305: <illegal opcode> run : (Lburp/Zrhg;I)Ljava/lang/Runnable;
    //   310: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   313: iinc #11, 1
    //   316: iload #5
    //   318: ifeq -> 127
    //   321: aload_0
    //   322: getfield Zm : Lburp/Zmuy;
    //   325: invokevirtual Zq : ()V
    //   328: goto -> 341
    //   331: astore #6
    //   333: aload #6
    //   335: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   338: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   341: aload #4
    //   343: <illegal opcode> run : (Lburp/Zrhg;)Ljava/lang/Runnable;
    //   348: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   351: return
    // Exception table:
    //   from	to	target	type
    //   5	328	331	java/lang/Exception
    //   24	104	107	finally
    //   107	112	107	finally
    //   157	167	170	java/lang/Exception
    //   162	184	187	java/lang/Exception
    //   174	201	204	java/lang/Exception
    //   231	261	261	java/lang/Exception
    //   266	275	275	java/lang/Exception
  }
  
  private void lambda$grepConfigRemoved$5(Zr23 paramZr23, byte paramByte, boolean[] paramArrayOfboolean, Zrhg paramZrhg) {
    // Byte code:
    //   0: invokestatic ZX : ()Z
    //   3: istore #5
    //   5: aload_0
    //   6: getfield Zz : Lburp/Zsh8;
    //   9: invokeinterface ZP_ : ()Lburp/Zz4g;
    //   14: astore #8
    //   16: aload_0
    //   17: dup
    //   18: astore #9
    //   20: monitorenter
    //   21: aload_0
    //   22: getfield Zc : Ljava/util/function/Supplier;
    //   25: invokeinterface get : ()Ljava/lang/Object;
    //   30: checkcast burp/Zs41
    //   33: aload_0
    //   34: getfield Zz : Lburp/Zsh8;
    //   37: aload_1
    //   38: invokeinterface Zs : (Lburp/Zsh8;Lburp/Zr23;)V
    //   43: aload #8
    //   45: ifnonnull -> 80
    //   48: aload_0
    //   49: getfield Zf : Lburp/Zr_4;
    //   52: new burp/Zrrq
    //   55: dup
    //   56: invokespecial <init> : ()V
    //   59: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   64: checkcast burp/Zz4g
    //   67: astore #8
    //   69: aload_0
    //   70: getfield Zz : Lburp/Zsh8;
    //   73: aload #8
    //   75: invokeinterface ZK : (Lburp/Zz4g;)V
    //   80: aload_0
    //   81: getfield ZV : Lburp/Zemt;
    //   84: invokevirtual ZC : ()Ljava/util/List;
    //   87: astore #6
    //   89: aload #6
    //   91: invokeinterface size : ()I
    //   96: istore #7
    //   98: aload #9
    //   100: monitorexit
    //   101: goto -> 112
    //   104: astore #10
    //   106: aload #9
    //   108: monitorexit
    //   109: aload #10
    //   111: athrow
    //   112: aload #8
    //   114: invokeinterface ZvZ : ()[Lburp/Zkk3;
    //   119: astore #9
    //   121: aload #8
    //   123: invokeinterface Zvb : ()[Lburp/Zl8c;
    //   128: astore #10
    //   130: iconst_0
    //   131: istore #11
    //   133: iload #11
    //   135: iload #7
    //   137: if_icmpge -> 521
    //   140: aload #6
    //   142: iload #11
    //   144: invokeinterface get : (I)Ljava/lang/Object;
    //   149: checkcast burp/Zgxp
    //   152: astore #12
    //   154: aload #12
    //   156: invokeinterface ZeD : ()Lburp/Zznf;
    //   161: astore #13
    //   163: aload #13
    //   165: ifnonnull -> 198
    //   168: aload_0
    //   169: getfield Zf : Lburp/Zr_4;
    //   172: new burp/Zeul
    //   175: dup
    //   176: invokespecial <init> : ()V
    //   179: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   184: checkcast burp/Zznf
    //   187: astore #13
    //   189: aload #12
    //   191: aload #13
    //   193: invokeinterface ZB : (Lburp/Zznf;)V
    //   198: iload_2
    //   199: tableswitch default -> 483, 1 -> 228, 2 -> 325, 3 -> 483, 4 -> 468
    //   228: aload #13
    //   230: invokeinterface ZTt : ()[B
    //   235: astore #14
    //   237: aload #10
    //   239: ifnonnull -> 250
    //   242: iconst_0
    //   243: goto -> 253
    //   246: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   249: athrow
    //   250: aload #10
    //   252: arraylength
    //   253: newarray byte
    //   255: astore #15
    //   257: aload #14
    //   259: ifnull -> 311
    //   262: iconst_0
    //   263: istore #16
    //   265: iconst_0
    //   266: istore #17
    //   268: iload #17
    //   270: aload #14
    //   272: arraylength
    //   273: if_icmpge -> 311
    //   276: aload_3
    //   277: iload #17
    //   279: baload
    //   280: ifne -> 303
    //   283: aload #15
    //   285: iload #16
    //   287: iinc #16, 1
    //   290: aload #14
    //   292: iload #17
    //   294: baload
    //   295: bastore
    //   296: goto -> 303
    //   299: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   302: athrow
    //   303: iinc #17, 1
    //   306: iload #5
    //   308: ifne -> 268
    //   311: aload #13
    //   313: aload #15
    //   315: invokeinterface Zk : ([B)V
    //   320: iload #5
    //   322: ifne -> 483
    //   325: aload #9
    //   327: ifnonnull -> 345
    //   330: goto -> 337
    //   333: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   336: athrow
    //   337: iconst_0
    //   338: goto -> 348
    //   341: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   344: athrow
    //   345: aload #9
    //   347: arraylength
    //   348: istore #14
    //   350: aload #13
    //   352: invokeinterface ZTL : ()Lburp/Zrte;
    //   357: astore #15
    //   359: aload_0
    //   360: getfield Zf : Lburp/Zr_4;
    //   363: new burp/Zguz
    //   366: dup
    //   367: getstatic burp/Zstu.Zc : Lburp/Zllg;
    //   370: invokespecial <init> : (Lburp/Zeu4;)V
    //   373: iload #14
    //   375: invokeinterface Zv : (Lburp/Zllg;I)Lburp/Ze34;
    //   380: checkcast burp/Zrte
    //   383: astore #16
    //   385: aload #15
    //   387: ifnull -> 454
    //   390: iconst_0
    //   391: istore #17
    //   393: iconst_0
    //   394: istore #18
    //   396: iload #18
    //   398: aload #15
    //   400: invokeinterface Zpu : ()I
    //   405: if_icmpge -> 454
    //   408: aload_3
    //   409: iload #18
    //   411: baload
    //   412: ifne -> 446
    //   415: aload #16
    //   417: iload #17
    //   419: iinc #17, 1
    //   422: aload #15
    //   424: iload #18
    //   426: invokeinterface ZdF : (I)Lburp/Zgpi;
    //   431: checkcast burp/Zstu
    //   434: invokeinterface ZU : (ILburp/Zgpi;)V
    //   439: goto -> 446
    //   442: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   445: athrow
    //   446: iinc #18, 1
    //   449: iload #5
    //   451: ifne -> 396
    //   454: aload #13
    //   456: aload #16
    //   458: invokeinterface ZV : (Lburp/Zrte;)V
    //   463: iload #5
    //   465: ifne -> 483
    //   468: aload #13
    //   470: aconst_null
    //   471: invokeinterface ZY : ([B)V
    //   476: goto -> 483
    //   479: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   482: athrow
    //   483: iload #11
    //   485: bipush #20
    //   487: irem
    //   488: ifne -> 513
    //   491: iload #11
    //   493: bipush #100
    //   495: imul
    //   496: iload #7
    //   498: idiv
    //   499: istore #14
    //   501: aload #4
    //   503: iload #14
    //   505: <illegal opcode> run : (Lburp/Zrhg;I)Ljava/lang/Runnable;
    //   510: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   513: iinc #11, 1
    //   516: iload #5
    //   518: ifne -> 133
    //   521: aload_0
    //   522: getfield Zm : Lburp/Zmuy;
    //   525: invokevirtual Zq : ()V
    //   528: goto -> 541
    //   531: astore #6
    //   533: aload #6
    //   535: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   538: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   541: aload #4
    //   543: <illegal opcode> run : (Lburp/Zrhg;)Ljava/lang/Runnable;
    //   548: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   551: return
    // Exception table:
    //   from	to	target	type
    //   5	528	531	java/lang/Exception
    //   21	101	104	finally
    //   104	109	104	finally
    //   237	246	246	java/lang/Exception
    //   276	296	299	java/lang/Exception
    //   311	330	333	java/lang/Exception
    //   325	341	341	java/lang/Exception
    //   408	439	442	java/lang/Exception
    //   454	476	479	java/lang/Exception
  }
  
  private void lambda$grepConfigAdded$2(Zr23 paramZr23, byte paramByte, boolean[] paramArrayOfboolean, Zrhg paramZrhg) {
    // Byte code:
    //   0: invokestatic Zw : ()Z
    //   3: istore #5
    //   5: iconst_0
    //   6: istore #8
    //   8: aload_0
    //   9: getfield Zz : Lburp/Zsh8;
    //   12: invokeinterface ZP_ : ()Lburp/Zz4g;
    //   17: astore #9
    //   19: aload_0
    //   20: dup
    //   21: astore #10
    //   23: monitorenter
    //   24: aload_0
    //   25: getfield Zc : Ljava/util/function/Supplier;
    //   28: invokeinterface get : ()Ljava/lang/Object;
    //   33: checkcast burp/Zs41
    //   36: aload_0
    //   37: getfield Zz : Lburp/Zsh8;
    //   40: aload_1
    //   41: invokeinterface Zs : (Lburp/Zsh8;Lburp/Zr23;)V
    //   46: aload #9
    //   48: ifnonnull -> 83
    //   51: aload_0
    //   52: getfield Zf : Lburp/Zr_4;
    //   55: new burp/Zrrq
    //   58: dup
    //   59: invokespecial <init> : ()V
    //   62: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   67: checkcast burp/Zz4g
    //   70: astore #9
    //   72: aload_0
    //   73: getfield Zz : Lburp/Zsh8;
    //   76: aload #9
    //   78: invokeinterface ZK : (Lburp/Zz4g;)V
    //   83: aload_0
    //   84: getfield ZV : Lburp/Zemt;
    //   87: invokevirtual ZC : ()Ljava/util/List;
    //   90: astore #6
    //   92: aload #6
    //   94: invokeinterface size : ()I
    //   99: istore #7
    //   101: aload #10
    //   103: monitorexit
    //   104: goto -> 115
    //   107: astore #11
    //   109: aload #10
    //   111: monitorexit
    //   112: aload #11
    //   114: athrow
    //   115: aload #9
    //   117: invokeinterface ZvZ : ()[Lburp/Zkk3;
    //   122: astore #10
    //   124: aload #9
    //   126: invokeinterface Zvb : ()[Lburp/Zl8c;
    //   131: astore #11
    //   133: iconst_0
    //   134: istore #12
    //   136: iload #12
    //   138: iload #7
    //   140: if_icmpge -> 638
    //   143: aload #6
    //   145: iload #12
    //   147: invokeinterface get : (I)Ljava/lang/Object;
    //   152: checkcast burp/Zgxp
    //   155: astore #13
    //   157: aload #13
    //   159: invokeinterface ZeD : ()Lburp/Zznf;
    //   164: astore #14
    //   166: aload #14
    //   168: ifnonnull -> 201
    //   171: aload_0
    //   172: getfield Zf : Lburp/Zr_4;
    //   175: new burp/Zeul
    //   178: dup
    //   179: invokespecial <init> : ()V
    //   182: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   187: checkcast burp/Zznf
    //   190: astore #14
    //   192: aload #13
    //   194: aload #14
    //   196: invokeinterface ZB : (Lburp/Zznf;)V
    //   201: iload_2
    //   202: lookupswitch default -> 470, 1 -> 228, 2 -> 332
    //   228: aload #11
    //   230: ifnonnull -> 248
    //   233: goto -> 240
    //   236: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   239: athrow
    //   240: iconst_0
    //   241: goto -> 251
    //   244: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   247: athrow
    //   248: aload #11
    //   250: arraylength
    //   251: newarray byte
    //   253: astore #15
    //   255: aload #14
    //   257: invokeinterface ZTt : ()[B
    //   262: astore #16
    //   264: aload #16
    //   266: ifnull -> 318
    //   269: iconst_0
    //   270: istore #17
    //   272: iconst_0
    //   273: istore #18
    //   275: iload #18
    //   277: aload #15
    //   279: arraylength
    //   280: if_icmpge -> 318
    //   283: aload_3
    //   284: iload #18
    //   286: baload
    //   287: ifne -> 310
    //   290: aload #15
    //   292: iload #18
    //   294: aload #16
    //   296: iload #17
    //   298: iinc #17, 1
    //   301: baload
    //   302: bastore
    //   303: goto -> 310
    //   306: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   309: athrow
    //   310: iinc #18, 1
    //   313: iload #5
    //   315: ifeq -> 275
    //   318: aload #14
    //   320: aload #15
    //   322: invokeinterface Zk : ([B)V
    //   327: iload #5
    //   329: ifeq -> 470
    //   332: aload #10
    //   334: ifnonnull -> 352
    //   337: goto -> 344
    //   340: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   343: athrow
    //   344: iconst_0
    //   345: goto -> 355
    //   348: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   351: athrow
    //   352: aload #10
    //   354: arraylength
    //   355: istore #15
    //   357: aload_0
    //   358: getfield Zf : Lburp/Zr_4;
    //   361: new burp/Zguz
    //   364: dup
    //   365: getstatic burp/Zstu.Zc : Lburp/Zllg;
    //   368: invokespecial <init> : (Lburp/Zeu4;)V
    //   371: iload #15
    //   373: invokeinterface Zv : (Lburp/Zllg;I)Lburp/Ze34;
    //   378: checkcast burp/Zrte
    //   381: astore #16
    //   383: aload #14
    //   385: invokeinterface ZTL : ()Lburp/Zrte;
    //   390: astore #17
    //   392: aload #17
    //   394: ifnull -> 461
    //   397: iconst_0
    //   398: istore #18
    //   400: iconst_0
    //   401: istore #19
    //   403: iload #19
    //   405: aload #16
    //   407: invokeinterface Zpu : ()I
    //   412: if_icmpge -> 461
    //   415: aload_3
    //   416: iload #19
    //   418: baload
    //   419: ifne -> 453
    //   422: aload #16
    //   424: iload #19
    //   426: aload #17
    //   428: iload #18
    //   430: iinc #18, 1
    //   433: invokeinterface ZdF : (I)Lburp/Zgpi;
    //   438: checkcast burp/Zstu
    //   441: invokeinterface ZU : (ILburp/Zgpi;)V
    //   446: goto -> 453
    //   449: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   452: athrow
    //   453: iinc #19, 1
    //   456: iload #5
    //   458: ifeq -> 403
    //   461: aload #14
    //   463: aload #16
    //   465: invokeinterface ZV : (Lburp/Zrte;)V
    //   470: aload #13
    //   472: invokeinterface ZoO : ()Lburp/Zstu;
    //   477: astore #15
    //   479: iload #8
    //   481: ifne -> 553
    //   484: aload #15
    //   486: ifnonnull -> 553
    //   489: goto -> 496
    //   492: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   495: athrow
    //   496: aload #13
    //   498: invokeinterface Ze4 : ()Z
    //   503: ifne -> 553
    //   506: goto -> 513
    //   509: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   512: athrow
    //   513: aload #13
    //   515: invokeinterface ZeZ : ()Z
    //   520: ifne -> 553
    //   523: goto -> 530
    //   526: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   529: athrow
    //   530: getstatic burp/Zmgc.GREP_ANALYSIS_FAILED : Lburp/Zmgc;
    //   533: aload_0
    //   534: getfield Zt : Lburp/Zskh;
    //   537: invokeinterface Zz : ()Lburp/Zskh;
    //   542: iconst_0
    //   543: anewarray java/lang/Object
    //   546: invokevirtual ZK : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   549: pop
    //   550: iconst_1
    //   551: istore #8
    //   553: aload_0
    //   554: aload #13
    //   556: aload #15
    //   558: aload_0
    //   559: getfield Zz : Lburp/Zsh8;
    //   562: aload #10
    //   564: aload #11
    //   566: aload #9
    //   568: iload_2
    //   569: iload_2
    //   570: iconst_1
    //   571: if_icmpne -> 582
    //   574: aload_3
    //   575: goto -> 583
    //   578: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   581: athrow
    //   582: aconst_null
    //   583: iload_2
    //   584: iconst_2
    //   585: if_icmpne -> 596
    //   588: aload_3
    //   589: goto -> 597
    //   592: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   595: athrow
    //   596: aconst_null
    //   597: invokevirtual ZE : (Lburp/Zgxp;Lburp/Zstu;Lburp/Zsh8;[Lburp/Zkk3;[Lburp/Zl8c;Lburp/Zz4g;B[Z[Z)V
    //   600: iload #12
    //   602: bipush #20
    //   604: irem
    //   605: ifne -> 630
    //   608: iload #12
    //   610: bipush #100
    //   612: imul
    //   613: iload #7
    //   615: idiv
    //   616: istore #16
    //   618: aload #4
    //   620: iload #16
    //   622: <illegal opcode> run : (Lburp/Zrhg;I)Ljava/lang/Runnable;
    //   627: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   630: iinc #12, 1
    //   633: iload #5
    //   635: ifeq -> 136
    //   638: aload_0
    //   639: getfield Zm : Lburp/Zmuy;
    //   642: invokevirtual Zq : ()V
    //   645: goto -> 658
    //   648: astore #6
    //   650: aload #6
    //   652: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   655: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   658: aload #4
    //   660: <illegal opcode> run : (Lburp/Zrhg;)Ljava/lang/Runnable;
    //   665: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   668: return
    // Exception table:
    //   from	to	target	type
    //   5	645	648	java/lang/Exception
    //   24	104	107	finally
    //   107	112	107	finally
    //   201	233	236	java/lang/Exception
    //   228	244	244	java/lang/Exception
    //   283	303	306	java/lang/Exception
    //   318	337	340	java/lang/Exception
    //   332	348	348	java/lang/Exception
    //   415	446	449	java/lang/Exception
    //   479	489	492	java/lang/Exception
    //   484	506	509	java/lang/Exception
    //   496	523	526	java/lang/Exception
    //   553	578	578	java/lang/Exception
    //   583	592	592	java/lang/Exception
  }
  
  private static void lambda$grepConfigAdded$1(Zrhg paramZrhg) {
    paramZrhg.Zd(true);
  }
  
  private static void lambda$grepConfigAdded$0(Zrhg paramZrhg, int paramInt) {
    paramZrhg.Zq(paramInt, "" + paramInt + paramInt);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Jf@¢¹êU?µ×vjþ«<[0tôÆ8x[û)¨©(¡ãwM­w¦@ÂÐ×®%x¦éUx¬å#N\\n6®¹+÷¡Kh·jµ4àAôÚvÀ{I j Çµø§ÔXSÜ§É!fiÊ.ÅFDØO{Äd¾±­nVMù¾|£^ªlª¿¬ö¼QZä ;À®\\n×Ë}â.×æã¿¬õJ*Ã%ÂÐ\\bfàó\\n=üÜñÞfôä'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #150
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #96
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 145
    //   41: aload #5
    //   43: swap
    //   44: iload_3
    //   45: iinc #3, 1
    //   48: swap
    //   49: aastore
    //   50: iload_0
    //   51: iload_1
    //   52: iadd
    //   53: dup
    //   54: istore_0
    //   55: iload #4
    //   57: if_icmpge -> 69
    //   60: aload_2
    //   61: iload_0
    //   62: invokevirtual charAt : (I)C
    //   65: istore_1
    //   66: goto -> 24
    //   69: ldc '¸´±zþ\\tÊì-2×?À1ïcêBñqaR»bO´\\rJ®¡¤d:Û±ïóÝÕNÁ»el_\\båäÄ<¦äøËN.E`M)¡PDÇ¼Í®ÒÄäNùREù]÷tÜ\\b©;Gÿk %\\n$WÉÐ¬8ôòCTÃócEý-%UQIõÂûåÃ~KÂ/¢¹,C%¶vpñ'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: sipush #141
    //   81: istore_1
    //   82: iconst_m1
    //   83: istore_0
    //   84: bipush #27
    //   86: iinc #0, 1
    //   89: aload_2
    //   90: iload_0
    //   91: dup
    //   92: iload_1
    //   93: iadd
    //   94: invokevirtual substring : (II)Ljava/lang/String;
    //   97: iconst_0
    //   98: goto -> 145
    //   101: aload #5
    //   103: swap
    //   104: iload_3
    //   105: iinc #3, 1
    //   108: swap
    //   109: aastore
    //   110: iload_0
    //   111: iload_1
    //   112: iadd
    //   113: dup
    //   114: istore_0
    //   115: iload #4
    //   117: if_icmpge -> 129
    //   120: aload_2
    //   121: iload_0
    //   122: invokevirtual charAt : (I)C
    //   125: istore_1
    //   126: goto -> 84
    //   129: aload #5
    //   131: putstatic burp/Zm3c.a : [Ljava/lang/String;
    //   134: bipush #6
    //   136: anewarray java/lang/String
    //   139: putstatic burp/Zm3c.b : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 264
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #111
    //   218: goto -> 248
    //   221: bipush #79
    //   223: goto -> 248
    //   226: bipush #24
    //   228: goto -> 248
    //   231: bipush #69
    //   233: goto -> 248
    //   236: bipush #103
    //   238: goto -> 248
    //   241: bipush #106
    //   243: goto -> 248
    //   246: bipush #116
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 168
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 164
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 41, 0 -> 101
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x58EA) & 0xFFFF;
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
      byte b1 = 101;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm3c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */