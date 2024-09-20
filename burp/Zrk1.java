package burp;

import java.io.File;
import java.io.IOException;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zl0;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zrk1 {
  private final Zxei ZV;
  
  final Zbiw ZW;
  
  private final Zbgr ZD;
  
  private final Zbgt ZL;
  
  private final Zbgy ZA;
  
  private Zbg5 ZZ;
  
  private final Zbro Zf;
  
  private final Zbr8 Zc;
  
  private final Zbrj ZG;
  
  private final Zbrf Zy;
  
  final Zbrl ZM;
  
  private final Zbr6 Zm;
  
  private final Zbrz ZC;
  
  final Zbgc ZJ;
  
  private final Zbgd Zw;
  
  private final Zbgg ZS;
  
  private final Zl0 Zh;
  
  private final List<File> Zg;
  
  private final boolean ZQ;
  
  private final boolean ZB;
  
  private Zkit ZH;
  
  private Zk8l Zl;
  
  private Ztg4 ZP;
  
  private String Zo;
  
  private Zsic Zb;
  
  volatile boolean Zz;
  
  volatile Zsic ZX;
  
  private static String[] Zu;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Zrk1(Zz0n paramZz0n, Zxei paramZxei, Zzp2 paramZzp2, Zt90 paramZt90, Zxpn paramZxpn, Zrej paramZrej, Zb_j paramZb_j, Zs4c paramZs4c, Zgb6 paramZgb6, Zldl paramZldl, Zgdu paramZgdu, Zmx0 paramZmx0, Zr18 paramZr18, Zxts paramZxts, Zz8a paramZz8a, List<Runnable> paramList, Zkf1 paramZkf1, Zmfo paramZmfo, Zrud paramZrud, Zbpe paramZbpe) {
    this.ZV = paramZxei;
    this.Zh = paramZz0n.ZM();
    String[] arrayOfString = ZT();
    this.Zg = paramZrej.Zj;
    this.ZQ = !this.Zg.isEmpty();
    this.ZB = paramZrej.Ze;
    this.ZD = new Zbgr(this, this.ZQ, paramZrej.ZI, paramZgb6, paramZb_j, this.Zh);
    this.ZL = new Zbgt(this, paramZz0n.Zr(), paramZb_j, this.Zh);
    this.ZA = new Zbgy(this, paramZxei, paramZzp2, paramZxpn, paramZt90, paramZs4c, this.Zh, paramZldl, paramZgdu, paramZmx0, paramZr18, paramZxts, paramZz8a, paramList, paramZkf1, paramZmfo, paramZbpe);
    this.Zf = new Zbro(this);
    this.Zc = new Zbr8(this);
    this.Zy = new Zbrf(this);
    this.ZG = new Zbrj(this);
    this.ZM = new Zbrl(this);
    this.Zm = new Zbr6(this);
    this.ZC = new Zbrz(this);
    this.ZJ = new Zbgc(this);
    this.Zw = new Zbgd(this);
    this.ZS = new Zbgg(this);
    Zl0a zl0a = new Zl0a(null, Zq(paramZt90.Zn(), paramZrud), 120, 34, this.ZD, this::lambda$new$0);
    this.ZW = zl0a;
    if (Zmja.ZL()) {
      Zl5r zl5r = new Zl5r(zl0a);
      paramZz0n.Zj().Zx(zl5r);
    } 
    if (Zbqc.Zwu() == null)
      Zh(new String[1]); 
  }
  
  public Zl04 Zd() {
    return this.ZW.Zu();
  }
  
  private String Zq(Zkvo paramZkvo, Zrud paramZrud) {
    null = Zgkt.Zd(paramZrud);
    return String.format(a(21135, 28122), new Object[] { null, paramZkvo.ZE() });
  }
  
  Zsic Zy(Zsic paramZsic) {
    if (paramZsic == this.ZL)
      return this.ZD; 
    if (paramZsic == this.Zf)
      return this.Zb; 
    if (paramZsic == this.ZG) {
      this.ZH.close();
      return this.ZQ ? this.ZD : this.ZL;
    } 
    if (paramZsic == this.Zy) {
      if (this.Zy.ZB()) {
        this.ZH.close();
        return this.ZQ ? this.ZD : this.ZL;
      } 
      return this.ZG;
    } 
    if (paramZsic == this.ZC)
      return this.ZD; 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  void ZU(Zsic paramZsic) {
    Zl0a zl0a = this.ZW.Zu();
    if (zl0a != null)
      zl0a.Zz(ZK(paramZsic)); 
  }
  
  Zsic ZK(Zsic paramZsic) {
    if (paramZsic == this.ZD) {
      Zrx7 zrx7 = this.ZD.ZL();
      if (zrx7.Zol() == Zik.NEW) {
        File file = ZV(zrx7.ZoC());
        if (Zy(file))
          return this.ZD; 
      } 
      return this.ZQ ? ZQ(this.ZD) : Zg(zrx7);
    } 
    if (paramZsic == this.ZL)
      return ZQ(this.ZL); 
    if (paramZsic == this.ZA) {
      Zu();
      return null;
    } 
    if (this.ZZ != null && paramZsic == this.ZZ)
      return this.ZA; 
    if (paramZsic == this.Zc)
      return this.ZA; 
    if (paramZsic == this.ZG) {
      if (this.ZG.Zb.isSelected()) {
        this.Zy.ZD();
        return this.Zy;
      } 
      return Zh(this.ZG.Zc.getPath());
    } 
    if (paramZsic == this.Zy)
      return Zo(); 
    if (paramZsic == this.Zm)
      return Zh(Zg1o.ZX(this.Zy.Zk.getText())); 
    if (paramZsic == this.ZC)
      return ZQ(); 
    if (paramZsic == this.Zw) {
      this.ZV.Zj(this.ZP);
      return Zh(Zg1o.ZX(this.ZC.Zg.getText()));
    } 
    if (paramZsic == this.ZS)
      return this.ZA; 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  private Zsic Zh(String paramString) {
    this.ZD.Zv.setSelected(true);
    this.ZD.Zz.clearSelection();
    this.ZD.ZQ.setText(paramString);
    return ZQ(this.ZD);
  }
  
  private Zsic Zg(Zrx7 paramZrx7) {
    // Byte code:
    //   0: invokestatic ZT : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZL : Lburp/Zbgt;
    //   8: getfield ZZ : Lburp/Zm9v;
    //   11: ldc ' '
    //   13: invokevirtual setText : (Ljava/lang/String;)V
    //   16: getstatic burp/Zg_e.Zm : [I
    //   19: aload_1
    //   20: invokevirtual Zol : ()Lburp/Zik;
    //   23: invokevirtual ordinal : ()I
    //   26: iaload
    //   27: tableswitch default -> 81, 1 -> 52, 2 -> 63, 3 -> 74
    //   52: aload_0
    //   53: getfield ZL : Lburp/Zbgt;
    //   56: invokevirtual Zl : ()V
    //   59: aload_2
    //   60: ifnull -> 81
    //   63: aload_0
    //   64: getfield ZL : Lburp/Zbgt;
    //   67: invokevirtual Zu : ()V
    //   70: aload_2
    //   71: ifnull -> 81
    //   74: aload_0
    //   75: getfield ZL : Lburp/Zbgt;
    //   78: invokevirtual Zo : ()V
    //   81: aload_0
    //   82: getfield ZL : Lburp/Zbgt;
    //   85: areturn
  }
  
  private Zsic ZQ(Zsic paramZsic) {
    Zrej zrej = ZI();
    if (zrej == null) {
      this.ZD.ZR();
      return paramZsic;
    } 
    this.ZA.Zs(zrej);
    return this.ZA;
  }
  
  private Zsic ZQ() {
    File file = ZV(this.ZC.Zg.getText());
    try {
      if (Zy(file))
        return this.ZC; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      ZS(file);
      this.ZJ.ZE(ZU(), this.Zl, file, this.ZP, file.getName(), this.Zo);
      return this.ZJ;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      this.ZC.Zc.setText(exception.getMessage());
      return this.ZC;
    } 
  }
  
  void ZH() {
    this.ZX = this.Zw;
    this.Zz = true;
    this.ZW.Zf(this.Zw);
  }
  
  private Zsic Zo() {
    File file = ZV(this.Zy.Zk.getText());
    try {
      if (Zy(file))
        return this.Zy; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      ZS(file);
      this.ZM.ZF(this.ZH, this.Zl, file, this.ZP, file.getName(), this.Zo);
      return this.ZM;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      this.Zy.ZF.setText(exception.getMessage());
      return this.Zy;
    } 
  }
  
  void Z_() {
    this.ZX = this.Zm;
    this.Zz = true;
    this.ZW.Zf(this.Zm);
  }
  
  void ZT(Ztkr paramZtkr) {
    this.Zc.Zy(paramZtkr);
    this.ZW.Zf(this.Zc);
  }
  
  void Zi(Ztkr paramZtkr, boolean paramBoolean) {
    this.ZZ = new Zbg5(this, paramZtkr, paramBoolean);
    this.ZW.Zf(this.ZZ);
  }
  
  void Zf(Zk8l paramZk8l, Ztg4 paramZtg4, String paramString) {
    this.Zl = paramZk8l;
    this.ZP = paramZtg4;
    this.Zo = paramString;
    this.ZW.Zf(this.ZC);
  }
  
  void ZA(Zkit paramZkit, Zk8l paramZk8l, Ztg4 paramZtg4, String paramString) {
    this.ZH = paramZkit;
    this.Zl = paramZk8l;
    this.ZP = paramZtg4;
    this.Zo = paramString;
    String str1 = this.ZD.ZQ.getText();
    String[] arrayOfString = ZT();
    String str2 = Zg1o.Z_(str1);
    File file = this.Zh.Zg(str2);
    if (file.exists()) {
      this.ZG.Zk(this.Zh.Zg(str1), file);
      this.ZW.Zf(this.ZG);
      if (arrayOfString != null) {
        this.Zy.ZV();
        this.ZW.Zf(this.Zy);
        return;
      } 
      return;
    } 
    this.Zy.ZV();
    this.ZW.Zf(this.Zy);
  }
  
  boolean Zt(String paramString) {
    String str = null;
    Zrx7 zrx7 = this.ZD.ZL();
    switch (Zg_e.Zm[zrx7.Zol().ordinal()]) {
      case 1:
        return false;
      case 2:
      case 3:
        str = zrx7.ZoC();
        break;
    } 
    File file = ZV(str);
    return file.getAbsolutePath().equals(paramString);
  }
  
  void ZX(String paramString) {
    this.Zb = this.ZQ ? this.ZD : this.ZL;
    this.Zf.Zw(Zrgs.PROJECT_LOAD_ERROR_CAPTION.ZN(new Object[0]));
    this.Zf.ZF(paramString);
    this.ZW.Zf(this.Zf);
  }
  
  void ZU(String paramString) {
    this.ZX = this.Zf;
    this.Zz = true;
    this.Zb = this.ZD;
    this.Zf.Zw(Zrgs.PROJECT_DATA_RECOVERY_ERROR_CAPTION.ZN(new Object[0]));
    this.Zf.ZF(paramString);
    this.ZW.Zf(this.Zf);
  }
  
  void Zd(String paramString) {
    this.ZX = this.Zf;
    this.Zz = true;
    this.Zb = this.ZD;
    this.Zf.Zw(Zrgs.PROJECT_DATA_RECOVERY_ERROR_CAPTION.ZN(new Object[0]));
    this.Zf.ZF(paramString);
    this.ZW.Zf(this.Zf);
  }
  
  private void Zu() {
    this.ZW.ZU(true);
    Zt2m.Zn(Zd());
    this.ZW.ZS();
  }
  
  Zsic Zo(Zsic paramZsic) {
    if (Zx6o.ZY(Zd(), a(21133, -28830))) {
      ZK(Zmg9.PROJECT_WIZARD_EXITED);
      return null;
    } 
    return paramZsic;
  }
  
  void ZK(Zmg9 paramZmg9) {
    this.ZV.ZH(paramZmg9);
  }
  
  private boolean Zy(File paramFile) {
    return (paramFile.exists() && !Zx6o.ZY(Zd(), a(21134, 20997) + a(21134, 20997) + paramFile.getAbsolutePath()));
  }
  
  private Zrej ZI() {
    // Byte code:
    //   0: invokestatic ZT : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: new burp/Zgvv
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_2
    //   12: aload_2
    //   13: aload_0
    //   14: getfield ZB : Z
    //   17: invokevirtual Zi : (Z)Lburp/Zgvv;
    //   20: pop
    //   21: aload_0
    //   22: getfield ZD : Lburp/Zbgr;
    //   25: invokevirtual ZL : ()Lburp/Zrx7;
    //   28: astore_3
    //   29: getstatic burp/Zg_e.Zm : [I
    //   32: aload_3
    //   33: invokevirtual Zol : ()Lburp/Zik;
    //   36: invokevirtual ordinal : ()I
    //   39: iaload
    //   40: tableswitch default -> 196, 1 -> 68, 2 -> 99, 3 -> 150
    //   68: aload_2
    //   69: iconst_1
    //   70: invokevirtual ZP : (Z)Lburp/Zgvv;
    //   73: pop
    //   74: aload_2
    //   75: sipush #21132
    //   78: sipush #-4181
    //   81: invokestatic a : (II)Ljava/lang/String;
    //   84: invokevirtual Zg : (Ljava/lang/String;)Lburp/Zgvv;
    //   87: pop
    //   88: aload_1
    //   89: ifnull -> 196
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: aload_0
    //   100: aload_3
    //   101: invokevirtual ZoC : ()Ljava/lang/String;
    //   104: invokevirtual ZV : (Ljava/lang/String;)Ljava/io/File;
    //   107: astore #4
    //   109: aload_0
    //   110: aload #4
    //   112: invokevirtual ZS : (Ljava/io/File;)Ljava/io/File;
    //   115: astore #5
    //   117: aload_2
    //   118: aload #5
    //   120: invokevirtual Zk : (Ljava/io/File;)Lburp/Zgvv;
    //   123: pop
    //   124: aload_0
    //   125: aload_3
    //   126: invokevirtual Zo_ : ()Ljava/lang/String;
    //   129: aload #5
    //   131: invokevirtual getName : ()Ljava/lang/String;
    //   134: invokevirtual Zn : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   137: astore #6
    //   139: aload_2
    //   140: aload #6
    //   142: invokevirtual Zg : (Ljava/lang/String;)Lburp/Zgvv;
    //   145: pop
    //   146: aload_1
    //   147: ifnull -> 196
    //   150: aload_2
    //   151: aload_0
    //   152: invokevirtual ZU : ()Ljava/io/File;
    //   155: invokevirtual ZL : (Ljava/io/File;)Lburp/Zgvv;
    //   158: pop
    //   159: aload_2
    //   160: aload_3
    //   161: invokevirtual Zo6 : ()Z
    //   164: invokevirtual ZV : (Z)Lburp/Zgvv;
    //   167: pop
    //   168: aload_2
    //   169: aload_3
    //   170: invokevirtual Zop : ()Z
    //   173: ifne -> 191
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   182: athrow
    //   183: iconst_1
    //   184: goto -> 192
    //   187: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   190: athrow
    //   191: iconst_0
    //   192: invokevirtual ZT : (Z)Lburp/Zgvv;
    //   195: pop
    //   196: aload_0
    //   197: getfield ZQ : Z
    //   200: ifeq -> 223
    //   203: aload_2
    //   204: aload_0
    //   205: getfield Zg : Ljava/util/List;
    //   208: invokevirtual ZH : (Ljava/util/Collection;)Lburp/Zgvv;
    //   211: pop
    //   212: aload_1
    //   213: ifnull -> 259
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   222: athrow
    //   223: aload_0
    //   224: getfield ZL : Lburp/Zbgt;
    //   227: getfield ZJ : Lburp/Zmg2;
    //   230: invokevirtual isSelected : ()Z
    //   233: ifeq -> 259
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   242: athrow
    //   243: aload_2
    //   244: aload_0
    //   245: invokevirtual Zm : ()Ljava/io/File;
    //   248: invokevirtual Zl : (Ljava/io/File;)Lburp/Zgvv;
    //   251: pop
    //   252: goto -> 259
    //   255: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   258: athrow
    //   259: aload_2
    //   260: aload_3
    //   261: invokevirtual Zol : ()Lburp/Zik;
    //   264: getstatic burp/Zik.EXISTING : Lburp/Zik;
    //   267: if_acmpne -> 290
    //   270: aload_0
    //   271: getfield ZL : Lburp/Zbgt;
    //   274: getfield Zr : Lburp/Zmg2;
    //   277: invokevirtual isSelected : ()Z
    //   280: ifeq -> 298
    //   283: goto -> 290
    //   286: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   289: athrow
    //   290: iconst_1
    //   291: goto -> 299
    //   294: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   297: athrow
    //   298: iconst_0
    //   299: invokevirtual Zc : (Z)Lburp/Zgvv;
    //   302: pop
    //   303: aload_2
    //   304: aload_0
    //   305: getfield ZL : Lburp/Zbgt;
    //   308: getfield ZX : Lburp/Zzdy;
    //   311: invokevirtual isSelected : ()Z
    //   314: invokevirtual ZU : (Z)Lburp/Zgvv;
    //   317: pop
    //   318: aload_2
    //   319: invokevirtual ZZ : ()Lburp/Zrej;
    //   322: areturn
    //   323: astore_2
    //   324: aload_2
    //   325: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   328: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   331: aload_0
    //   332: getfield ZQ : Z
    //   335: ifeq -> 360
    //   338: aload_0
    //   339: getfield ZD : Lburp/Zbgr;
    //   342: aload_2
    //   343: invokevirtual getMessage : ()Ljava/lang/String;
    //   346: invokevirtual ZG : (Ljava/lang/String;)V
    //   349: aload_1
    //   350: ifnull -> 381
    //   353: goto -> 360
    //   356: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   359: athrow
    //   360: aload_0
    //   361: getfield ZL : Lburp/Zbgt;
    //   364: getfield ZZ : Lburp/Zm9v;
    //   367: aload_2
    //   368: invokevirtual getMessage : ()Ljava/lang/String;
    //   371: invokevirtual setText : (Ljava/lang/String;)V
    //   374: goto -> 381
    //   377: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   380: athrow
    //   381: aconst_null
    //   382: areturn
    // Exception table:
    //   from	to	target	type
    //   4	322	323	java/io/IOException
    //   29	92	95	java/io/IOException
    //   139	176	179	java/io/IOException
    //   150	187	187	java/io/IOException
    //   196	216	219	java/io/IOException
    //   203	236	239	java/io/IOException
    //   223	252	255	java/io/IOException
    //   259	283	286	java/io/IOException
    //   270	294	294	java/io/IOException
    //   324	353	356	java/io/IOException
    //   338	374	377	java/io/IOException
  }
  
  private File ZV(String paramString) {
    return this.Zh.Zg(Zg1o.ZX(paramString));
  }
  
  private File ZS(File paramFile) throws IOException {
    try {
      if (paramFile.exists())
        try {
          if (!paramFile.delete())
            throw new IOException(a(21128, -15209)); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return paramFile;
  }
  
  private File ZU() {
    Zrx7 zrx7 = this.ZD.ZL();
    return this.Zh.Zg(zrx7.ZoC());
  }
  
  private File Zm() {
    return this.Zh.Zg(this.ZL.Zi.getText());
  }
  
  private String Zn(String paramString1, String paramString2) {
    if (paramString1 == null || paramString1.isEmpty())
      paramString1 = paramString2; 
    return paramString1;
  }
  
  public void ZZ(Ztkr paramZtkr) {
    this.ZS.Zd(paramZtkr);
    this.ZW.Zf(this.ZS);
  }
  
  void ZR(Zsic paramZsic) {
    this.ZW.Zf(paramZsic);
  }
  
  private void lambda$new$0(Zl0a paramZl0a) {
    if (Zx6o.ZY(paramZl0a, a(21131, 16201)))
      this.ZV.ZH(Zmg9.PROJECT_WIZARD_EXITED); 
  }
  
  public static void Zh(String[] paramArrayOfString) {
    Zu = paramArrayOfString;
  }
  
  public static String[] ZT() {
    return Zu;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc 'ÝºÚÝP\{~­w\\nüB¢¢ãe)? Þ&£8ä´¢Ú¿áòÉÉLgOX²÷Ê\\r¯wa)d!9ÿìA-MZýî$}I m,7bz«îÂÞe1]hàOÿOåpnZ¬'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Zh : ([Ljava/lang/String;)V
    //   22: bipush #32
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #42
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc '(geã}(9FcjÐ:þÁý:HóÏúr+fðdÁ*ÀV£òB`Á¥ÊfW,ì$Óþ^½~_¡ÃÔÍ®"úQ'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #41
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #91
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zrk1.b : [Ljava/lang/String;
    //   136: bipush #7
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zrk1.c : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #30
    //   218: goto -> 248
    //   221: bipush #55
    //   223: goto -> 248
    //   226: bipush #13
    //   228: goto -> 248
    //   231: bipush #24
    //   233: goto -> 248
    //   236: bipush #97
    //   238: goto -> 248
    //   241: bipush #44
    //   243: goto -> 248
    //   246: bipush #75
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x528D) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      char c = '¢';
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrk1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */