package burp;

import java.awt.Window;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zb2z implements Runnable, Zs9s {
  private static final Map<String, SSLSocketFactory> ZU;
  
  private final Zg5n ZQ;
  
  private final Zkl6 Zy;
  
  private final Ztwv Zo;
  
  private final Zxzw Zl;
  
  private final Zlb7 Zh;
  
  private final Zskh ZW;
  
  private final Ztpu Zi;
  
  private String Zt;
  
  private ServerSocket ZB;
  
  private SSLSocketFactory ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb2z(Zg5n paramZg5n, Zkl6 paramZkl6, Ztwv paramZtwv, Zlb7 paramZlb7, Zskh paramZskh, Ztpu paramZtpu, Zxzw paramZxzw, Window paramWindow) {
    Zuh.Zv((paramZg5n != null), Zqf.Zv, 2L);
    this.ZQ = paramZg5n;
    this.Zy = paramZkl6;
    this.Zo = paramZtwv;
    this.Zh = paramZlb7;
    this.ZW = paramZskh;
    this.Zi = paramZtpu;
    this.Zl = paramZxzw;
    Zu();
    ZN(paramWindow);
  }
  
  public Zg5n Zn() {
    return this.ZQ;
  }
  
  public void Zp(Zs9s paramZs9s, Window paramWindow) {
    String[] arrayOfString = Zz2j.ZJ();
    Zg5n zg5n = paramZs9s.Zz();
    boolean bool1 = (this.ZQ.ZCW() && (this.ZQ.ZCJ() != zg5n.ZCJ() || this.ZQ.ZCb() != zg5n.ZCb() || (this.ZQ.ZCb() == 2 && !this.ZQ.ZCf().equals(zg5n.ZCf())))) ? true : false;
    boolean bool2 = (this.ZQ.ZCW() && (this.ZQ.ZCQ() != zg5n.ZCQ() || this.ZQ.ZCj() != zg5n.ZCj() || (zg5n.ZCj() != null && !zg5n.ZCj().equals(this.ZQ.ZCj())) || this.ZQ.ZCF() != zg5n.ZCF() || (zg5n.ZCF() != null && !zg5n.ZCF().equals(this.ZQ.ZCF())) || this.ZQ.ZCq() != zg5n.ZCq() || (zg5n.ZCq() != null && !zg5n.ZCq().equals(this.ZQ.ZCq())))) ? true : false;
    if (bool1)
      Zw(); 
    this.ZQ.ZCu(zg5n.ZCJ());
    this.ZQ.Zt(zg5n.ZCb());
    this.ZQ.ZRJ(zg5n.ZCf());
    this.ZQ.ZRF(zg5n.ZCU());
    this.ZQ.ZC0(zg5n.ZCw());
    this.ZQ.ZPo(zg5n.ZCA());
    this.ZQ.ZP3(zg5n.ZCc());
    this.ZQ.Zu(zg5n.ZCQ());
    this.ZQ.ZRg(zg5n.ZCj());
    this.ZQ.ZR7(zg5n.ZCF());
    this.ZQ.ZRo(zg5n.ZCq());
    this.ZQ.ZPd(zg5n.ZCz());
    this.ZQ.ZCa().clear();
    this.ZQ.ZCa().addAll(zg5n.ZCa());
    this.ZQ.ZPG(zg5n.ZC2());
    Zu();
    if (bool1)
      Zy(paramWindow); 
    if (bool2)
      ZN(paramWindow); 
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public boolean Zy(Window paramWindow) {
    // Byte code:
    //   0: invokestatic ZJ : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZQ : Lburp/Zg5n;
    //   8: invokeinterface ZCb : ()B
    //   13: tableswitch default -> 155, 0 -> 40, 1 -> 71, 2 -> 115
    //   40: aload_0
    //   41: new java/net/ServerSocket
    //   44: dup
    //   45: aload_0
    //   46: getfield ZQ : Lburp/Zg5n;
    //   49: invokeinterface ZCJ : ()I
    //   54: invokespecial <init> : (I)V
    //   57: putfield ZB : Ljava/net/ServerSocket;
    //   60: aload_2
    //   61: ifnonnull -> 155
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   70: athrow
    //   71: aload_0
    //   72: new java/net/ServerSocket
    //   75: dup
    //   76: aload_0
    //   77: getfield ZQ : Lburp/Zg5n;
    //   80: invokeinterface ZCJ : ()I
    //   85: iconst_0
    //   86: sipush #-14017
    //   89: sipush #-20623
    //   92: invokestatic a : (II)Ljava/lang/String;
    //   95: invokestatic getByName : (Ljava/lang/String;)Ljava/net/InetAddress;
    //   98: invokespecial <init> : (IILjava/net/InetAddress;)V
    //   101: putfield ZB : Ljava/net/ServerSocket;
    //   104: aload_2
    //   105: ifnonnull -> 155
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   114: athrow
    //   115: aload_0
    //   116: new java/net/ServerSocket
    //   119: dup
    //   120: aload_0
    //   121: getfield ZQ : Lburp/Zg5n;
    //   124: invokeinterface ZCJ : ()I
    //   129: iconst_0
    //   130: aload_0
    //   131: getfield ZQ : Lburp/Zg5n;
    //   134: invokeinterface ZCf : ()Ljava/lang/String;
    //   139: invokestatic getByName : (Ljava/lang/String;)Ljava/net/InetAddress;
    //   142: invokespecial <init> : (IILjava/net/InetAddress;)V
    //   145: putfield ZB : Ljava/net/ServerSocket;
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   154: athrow
    //   155: goto -> 277
    //   158: astore_3
    //   159: aload_3
    //   160: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   163: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   166: getstatic burp/Zt2u.ZX : Lburp/Zt2u;
    //   169: getfield ZP : Z
    //   172: ifeq -> 221
    //   175: getstatic burp/Zt2u.ZX : Lburp/Zt2u;
    //   178: getfield Zh : Z
    //   181: ifne -> 221
    //   184: goto -> 191
    //   187: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   190: athrow
    //   191: aload_0
    //   192: getfield ZQ : Lburp/Zg5n;
    //   195: invokeinterface ZCJ : ()I
    //   200: invokestatic Zw : (I)Z
    //   203: ifeq -> 221
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   212: athrow
    //   213: iconst_1
    //   214: goto -> 222
    //   217: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   220: athrow
    //   221: iconst_0
    //   222: istore #4
    //   224: iload #4
    //   226: ifeq -> 254
    //   229: aload_0
    //   230: aload_1
    //   231: sipush #-14019
    //   234: sipush #20117
    //   237: invokestatic a : (II)Ljava/lang/String;
    //   240: invokevirtual ZM : (Ljava/awt/Window;Ljava/lang/String;)V
    //   243: aload_2
    //   244: ifnonnull -> 275
    //   247: goto -> 254
    //   250: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   253: athrow
    //   254: aload_0
    //   255: aload_1
    //   256: sipush #-14018
    //   259: sipush #-9480
    //   262: invokestatic a : (II)Ljava/lang/String;
    //   265: invokevirtual ZM : (Ljava/awt/Window;Ljava/lang/String;)V
    //   268: goto -> 275
    //   271: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   274: athrow
    //   275: iconst_0
    //   276: ireturn
    //   277: aload_0
    //   278: getfield ZQ : Lburp/Zg5n;
    //   281: iconst_1
    //   282: invokeinterface ZPz : (Z)V
    //   287: getstatic burp/Zmgc.PROXY_STARTED : Lburp/Zmgc;
    //   290: aload_0
    //   291: getfield ZW : Lburp/Zskh;
    //   294: iconst_1
    //   295: anewarray java/lang/Object
    //   298: dup
    //   299: iconst_0
    //   300: aload_0
    //   301: invokevirtual Zm : ()Ljava/lang/String;
    //   304: aastore
    //   305: invokevirtual Zh : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   308: pop
    //   309: aload_0
    //   310: getfield Zo : Lburp/Ztwv;
    //   313: aload_0
    //   314: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   319: pop
    //   320: iconst_1
    //   321: ireturn
    // Exception table:
    //   from	to	target	type
    //   4	64	67	java/lang/Exception
    //   4	155	158	java/lang/Exception
    //   40	108	111	java/lang/Exception
    //   71	148	151	java/lang/Exception
    //   159	184	187	java/lang/Exception
    //   175	206	209	java/lang/Exception
    //   191	217	217	java/lang/Exception
    //   224	247	250	java/lang/Exception
    //   229	268	271	java/lang/Exception
  }
  
  private void ZM(Window paramWindow, String paramString) {
    this.ZQ.ZPz(false);
    this.Zl.Zg(a(-14020, -15847) + a(-14020, -15847), paramString, paramWindow);
  }
  
  public void Zw() {
    this.ZQ.ZPz(false);
    Z_();
  }
  
  public void Z_() {
    try {
      if (this.ZB != null) {
        this.ZB.close();
        Zmgc.PROXY_STOPPED.Zh(this.ZW, new Object[] { Zm() });
      } 
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public void run() {
    try {
      while (true) {
        try {
          while (true) {
            Zi8 zi8 = new Zi8(this.ZQ.ZCU(), this.ZQ.ZCw(), this.ZQ.ZCA());
            this.Zo.Zx(this.Zh.ZD(this.ZB.accept(), zi8, false, this.ZQ.ZCc(), this));
          } 
          break;
        } catch (OutOfMemoryError outOfMemoryError) {
          Zah.Zl(outOfMemoryError, Zk_.COMMON_RUNTIME_FAILURE);
          Ztyh.ZR(this.ZW);
        } 
      } 
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      return;
    } 
  }
  
  public SSLSocketFactory ZP(String paramString, int paramInt) {
    switch (this.ZQ.ZCQ()) {
      case 1:
        return (paramString == null) ? this.ZI : ZZ(paramString, paramInt, true);
      case 2:
        return ZZ(this.ZQ.ZCj(), paramInt, false);
    } 
    return this.ZI;
  }
  
  private SSLSocketFactory ZZ(String paramString, int paramInt, boolean paramBoolean) {
    synchronized (ZU) {
      SSLSocketFactory sSLSocketFactory1 = ZU.get(paramString);
      if (sSLSocketFactory1 != null)
        return sSLSocketFactory1; 
    } 
    SSLSocketFactory sSLSocketFactory = ZQ(paramString, paramInt, paramBoolean);
    synchronized (ZU) {
      SSLSocketFactory sSLSocketFactory1 = ZU.get(paramString);
      if (sSLSocketFactory1 != null)
        return sSLSocketFactory1; 
      ZU.put(paramString, sSLSocketFactory);
      return sSLSocketFactory;
    } 
  }
  
  private SSLSocketFactory ZQ(String paramString, int paramInt, boolean paramBoolean) {
    String str = paramString;
    List<String> list = null;
    try {
      if (paramBoolean && 0 != Zko5.Zi(paramString))
        try {
          Zmzk zmzk = this.Zy.ZB().ZY(paramString, paramInt, true);
          X509Certificate x509Certificate = this.Zi.ZN(zmzk);
          if (x509Certificate != null) {
            Zgvp zgvp = Ztbq.ZE(x509Certificate);
            str = zgvp.ZM;
            list = zgvp.ZT;
            if (list.isEmpty())
              list = null; 
          } 
        } catch (Exception exception) {
          Zah.Zl(exception, Zk_.UNEXPECTED);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      SSLContext sSLContext = SSLContext.getInstance(a(-14022, -907));
      sSLContext.init(new KeyManager[] { Zbng.Zi(str, list) }null, null);
      return sSLContext.getSocketFactory();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return this.ZI;
    } 
  }
  
  public static void ZG() {
    synchronized (ZU) {
      ZU.clear();
    } 
  }
  
  private void ZN(Window paramWindow) {
    try {
      try {
      
      } catch (GeneralSecurityException generalSecurityException) {
        throw a(null);
      } 
      this.ZI = Zsw8.ZP(this.ZQ.ZCF()) ? Zg_u.Zb() : Zg_u.Zv(new FileInputStream(this.ZQ.ZCF()), this.ZQ.ZCq().toCharArray());
    } catch (GeneralSecurityException|IOException generalSecurityException) {
      Zah.Zl(generalSecurityException, Zk_.COMMON_RUNTIME_FAILURE);
      this.Zl.Zg(a(-14023, -21440) + a(-14023, -21440), generalSecurityException.getMessage(), paramWindow);
    } 
  }
  
  public int ZS() {
    return this.ZQ.ZCJ();
  }
  
  public byte ZY() {
    return this.ZQ.ZCb();
  }
  
  public String ZM() {
    return this.ZQ.ZCf();
  }
  
  public Zi8 Zg() {
    return new Zi8(this.ZQ.ZCU(), this.ZQ.ZCw(), this.ZQ.ZCA());
  }
  
  public String Zm() {
    return this.Zt;
  }
  
  private void Zu() {
    // Byte code:
    //   0: invokestatic ZJ : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: ldc ''
    //   6: astore_2
    //   7: aload_0
    //   8: getfield ZQ : Lburp/Zg5n;
    //   11: invokeinterface ZCb : ()B
    //   16: tableswitch default -> 78, 0 -> 44, 1 -> 51, 2 -> 65
    //   44: ldc '*'
    //   46: astore_2
    //   47: aload_1
    //   48: ifnonnull -> 78
    //   51: sipush #-14021
    //   54: sipush #25375
    //   57: invokestatic a : (II)Ljava/lang/String;
    //   60: astore_2
    //   61: aload_1
    //   62: ifnonnull -> 78
    //   65: aload_0
    //   66: getfield ZQ : Lburp/Zg5n;
    //   69: invokeinterface ZCf : ()Ljava/lang/String;
    //   74: astore_2
    //   75: goto -> 78
    //   78: aload_0
    //   79: aload_2
    //   80: aload_0
    //   81: getfield ZQ : Lburp/Zg5n;
    //   84: invokeinterface ZCJ : ()I
    //   89: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   94: putfield Zt : Ljava/lang/String;
    //   97: return
  }
  
  public boolean ZV() {
    return this.ZQ.ZCc();
  }
  
  public byte ZI() {
    return this.ZQ.ZCQ();
  }
  
  public String ZB() {
    String str = this.ZQ.ZCj();
    return (str == null) ? "" : str;
  }
  
  public String ZE() {
    String str = this.ZQ.ZCF();
    return (str == null) ? "" : str;
  }
  
  public String ZO() {
    String str = this.ZQ.ZCq();
    return (str == null) ? "" : str;
  }
  
  public boolean Zc() {
    return this.ZQ.ZCW();
  }
  
  public InetAddress ZK() {
    return this.ZB.getInetAddress();
  }
  
  public boolean Zq() {
    return this.ZQ.ZCz();
  }
  
  public List<String> ZT() {
    return (List<String>)this.ZQ.ZCa().stream().map(Object::toString).collect(Collectors.toList());
  }
  
  public String[] ZH() {
    List<String> list = Zq() ? ZT() : Zgzh.ZH();
    return list.<String>toArray(new String[0]);
  }
  
  public boolean Zb() {
    return this.ZQ.ZC2();
  }
  
  public void ZG(boolean paramBoolean) {
    this.ZQ.ZPG(paramBoolean);
  }
  
  public void ZC(Zzqw paramZzqw) {
    paramZzqw.Zx(Zlrx.ZK(this));
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¼g'\\tMQÛ:9Áiªx-¿$éS§òá6ìà@Ù3ÌfÅ¯=jËF±$Üù\mh1Æl°*L±[5Òt|Eü\\bîü)}¼\\nµáãYFÝ\\ti×bé¾ÂXÎõ¢ocÅ=Úúîó¸%äaøE*Î«Î'¨&EÌVÙÀ­ü1lO!¬xâ5kèjWò©ò8(úôýynÿ:¸ötè{÷\\tKÙ&´pgE'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #58
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc 'lñÛ)·>Ê{9éÄq1zõ÷ìbnULÐku;¿;BÐM$Ï·\\r<wµIÿu'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_3
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #48
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zb2z.a : [Ljava/lang/String;
    //   131: bipush #7
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zb2z.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #100
    //   214: goto -> 244
    //   217: bipush #126
    //   219: goto -> 244
    //   222: bipush #97
    //   224: goto -> 244
    //   227: bipush #13
    //   229: goto -> 244
    //   232: bipush #25
    //   234: goto -> 244
    //   237: bipush #105
    //   239: goto -> 244
    //   242: bipush #122
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: new java/util/HashMap
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Zb2z.ZU : Ljava/util/Map;
    //   310: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC93F) & 0xFFFF;
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
      byte b1 = 90;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb2z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */