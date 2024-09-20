package burp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.Zah;
import net.portswigger.Zdo;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zmw;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zloq {
  private static final AtomicBoolean ZS;
  
  final Socket ZB;
  
  InputStream Zk;
  
  private final Zrgd Zw;
  
  private final OutputStream Zr;
  
  private final boolean ZX;
  
  private final int Zs;
  
  private final int Zt;
  
  final Zmh6 Zh;
  
  boolean ZT;
  
  private boolean ZQ;
  
  private boolean ZO;
  
  private final Zlc8 Zy;
  
  byte[] ZL;
  
  int Zg;
  
  Zxtp ZN;
  
  byte[] Zc;
  
  byte[] Z_;
  
  byte[] Zq;
  
  private final List<List<String>> ZK = new ArrayList<>();
  
  List<String> Zj;
  
  int Zx;
  
  String Zn;
  
  boolean ZR;
  
  Instant Zb;
  
  Instant ZP;
  
  int Zo;
  
  int Zz;
  
  boolean ZD;
  
  private static int ZG;
  
  private static final String a;
  
  Zloq(Socket paramSocket, int paramInt1, int paramInt2, Zsxe paramZsxe, Zrgd paramZrgd, Zlc8 paramZlc8, OutputStream paramOutputStream, boolean paramBoolean) throws IOException {
    this.ZB = paramSocket;
    this.Zs = paramInt1;
    this.Zt = paramInt2;
    this.Zw = paramZrgd;
    this.Zy = paramZlc8;
    this.Zr = paramOutputStream;
    this.ZX = paramBoolean;
    this.Zh = new Zmh6();
    this.ZN = paramZsxe.Ze(4096);
    paramSocket.setKeepAlive(true);
    paramSocket.setSoTimeout(paramInt1);
    this.Zk = paramSocket.getInputStream();
  }
  
  public void ZV(boolean paramBoolean) {
    this.ZQ = paramBoolean;
  }
  
  public void Zi(boolean paramBoolean) {
    this.ZO = paramBoolean;
  }
  
  public void ZO(boolean paramBoolean) {
    this.Zh.Zu(paramBoolean);
  }
  
  Zg4n ZG(Zsil paramZsil) throws Zgs7, IOException {
    // Byte code:
    //   0: invokestatic ZW : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: sipush #4096
    //   8: newarray byte
    //   10: putfield ZL : [B
    //   13: aload_0
    //   14: aload_0
    //   15: getfield Zk : Ljava/io/InputStream;
    //   18: aload_0
    //   19: getfield ZL : [B
    //   22: invokevirtual read : ([B)I
    //   25: putfield Zg : I
    //   28: aload_0
    //   29: aload_0
    //   30: getfield Zw : Lburp/Zrgd;
    //   33: invokevirtual Zn : ()Ljava/time/Instant;
    //   36: putfield Zb : Ljava/time/Instant;
    //   39: goto -> 122
    //   42: astore_3
    //   43: aload_3
    //   44: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   47: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   50: new burp/Zgs7
    //   53: dup
    //   54: aload_3
    //   55: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   58: athrow
    //   59: astore_3
    //   60: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   63: astore #4
    //   65: aload_3
    //   66: aload #4
    //   68: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   71: aload_0
    //   72: getfield Zg : I
    //   75: ifle -> 120
    //   78: aload_0
    //   79: aload_0
    //   80: getfield Zg : I
    //   83: newarray byte
    //   85: putfield Z_ : [B
    //   88: aload_0
    //   89: getfield ZL : [B
    //   92: iconst_0
    //   93: aload_0
    //   94: getfield Z_ : [B
    //   97: iconst_0
    //   98: aload_0
    //   99: getfield Zg : I
    //   102: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   105: aload_0
    //   106: aload_0
    //   107: getfield Zg : I
    //   110: putfield Zx : I
    //   113: goto -> 120
    //   116: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: aload_3
    //   121: athrow
    //   122: aload_0
    //   123: getfield Zg : I
    //   126: iconst_m1
    //   127: if_icmpne -> 138
    //   130: getstatic burp/Zg4n.CONTINUE : Lburp/Zg4n;
    //   133: areturn
    //   134: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: aload_0
    //   139: getfield ZN : Lburp/Zxtp;
    //   142: aload_0
    //   143: getfield ZL : [B
    //   146: iconst_0
    //   147: aload_0
    //   148: getfield Zg : I
    //   151: invokevirtual write : ([BII)V
    //   154: iconst_0
    //   155: istore_3
    //   156: aload_0
    //   157: iload_3
    //   158: invokevirtual ZK : (I)V
    //   161: aload_0
    //   162: getfield Zj : Ljava/util/List;
    //   165: ifnonnull -> 176
    //   168: getstatic burp/Zg4n.CONTINUE : Lburp/Zg4n;
    //   171: areturn
    //   172: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   175: athrow
    //   176: aload_0
    //   177: invokevirtual Zh : ()V
    //   180: goto -> 262
    //   183: astore #4
    //   185: aload #4
    //   187: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   190: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   193: aload_0
    //   194: getfield ZQ : Z
    //   197: ifeq -> 259
    //   200: iload_3
    //   201: aload_0
    //   202: getfield Zx : I
    //   205: if_icmpne -> 222
    //   208: goto -> 215
    //   211: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   214: athrow
    //   215: goto -> 262
    //   218: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   221: athrow
    //   222: aload_0
    //   223: getfield Zx : I
    //   226: istore_3
    //   227: aload_0
    //   228: getfield ZO : Z
    //   231: ifne -> 255
    //   234: aload_0
    //   235: getfield ZK : Ljava/util/List;
    //   238: aload_0
    //   239: getfield Zj : Ljava/util/List;
    //   242: invokeinterface add : (Ljava/lang/Object;)Z
    //   247: pop
    //   248: goto -> 255
    //   251: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   254: athrow
    //   255: iload_2
    //   256: ifeq -> 156
    //   259: goto -> 262
    //   262: aload_0
    //   263: getfield ZK : Ljava/util/List;
    //   266: aload_0
    //   267: getfield Zj : Ljava/util/List;
    //   270: invokeinterface add : (Ljava/lang/Object;)Z
    //   275: pop
    //   276: aload_0
    //   277: getfield ZN : Lburp/Zxtp;
    //   280: invokevirtual reset : ()V
    //   283: aconst_null
    //   284: astore #4
    //   286: aconst_null
    //   287: astore #5
    //   289: aload_1
    //   290: aload_0
    //   291: getfield Zj : Ljava/util/List;
    //   294: invokeinterface ZM : (Ljava/util/List;)Lburp/Zg4n;
    //   299: astore #6
    //   301: aload #6
    //   303: getstatic burp/Zg4n.CONTINUE : Lburp/Zg4n;
    //   306: if_acmpne -> 391
    //   309: aload_0
    //   310: getfield Zr : Ljava/io/OutputStream;
    //   313: ifnull -> 335
    //   316: aload_0
    //   317: invokevirtual ZG : ()V
    //   320: aload_0
    //   321: invokevirtual Z_ : ()V
    //   324: iload_2
    //   325: ifeq -> 341
    //   328: goto -> 335
    //   331: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   334: athrow
    //   335: aload_0
    //   336: invokevirtual ZV : ()[B
    //   339: astore #4
    //   341: goto -> 391
    //   344: astore #7
    //   346: aload #7
    //   348: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   351: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   354: aload #7
    //   356: astore #5
    //   358: aload_0
    //   359: getfield Zr : Ljava/io/OutputStream;
    //   362: ifnonnull -> 374
    //   365: aload_0
    //   366: getfield ZN : Lburp/Zxtp;
    //   369: invokevirtual toByteArray : ()[B
    //   372: astore #4
    //   374: goto -> 391
    //   377: astore #7
    //   379: aload #7
    //   381: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   384: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   387: aload #7
    //   389: astore #5
    //   391: aload_0
    //   392: aload_0
    //   393: getfield Zw : Lburp/Zrgd;
    //   396: invokevirtual Zn : ()Ljava/time/Instant;
    //   399: putfield ZP : Ljava/time/Instant;
    //   402: aload_0
    //   403: getfield Zr : Ljava/io/OutputStream;
    //   406: ifnonnull -> 434
    //   409: aload_0
    //   410: getfield Zh : Lburp/Zmh6;
    //   413: aload_0
    //   414: getfield Zj : Ljava/util/List;
    //   417: aload #4
    //   419: invokevirtual ZE : (Ljava/util/List;[B)[B
    //   422: astore #4
    //   424: aload_0
    //   425: aload #4
    //   427: invokevirtual Zk : ([B)V
    //   430: aload_0
    //   431: invokevirtual ZJ : ()V
    //   434: aload_0
    //   435: aconst_null
    //   436: putfield ZN : Lburp/Zxtp;
    //   439: aload #5
    //   441: ifnull -> 475
    //   444: aload #5
    //   446: instanceof burp/Zgs7
    //   449: ifeq -> 469
    //   452: goto -> 459
    //   455: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   458: athrow
    //   459: aload #5
    //   461: checkcast burp/Zgs7
    //   464: athrow
    //   465: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   468: athrow
    //   469: aload #5
    //   471: checkcast java/io/IOException
    //   474: athrow
    //   475: aload #6
    //   477: areturn
    // Exception table:
    //   from	to	target	type
    //   13	39	42	java/net/SocketTimeoutException
    //   13	39	59	java/io/IOException
    //   65	113	116	java/net/SocketTimeoutException
    //   122	134	134	java/net/SocketTimeoutException
    //   156	172	172	java/net/SocketTimeoutException
    //   176	180	183	burp/Zkmz
    //   185	208	211	java/net/SocketTimeoutException
    //   200	218	218	java/net/SocketTimeoutException
    //   227	248	251	java/net/SocketTimeoutException
    //   309	328	331	java/net/SocketTimeoutException
    //   309	341	344	burp/Zgs7
    //   309	341	377	java/io/IOException
    //   434	452	455	java/net/SocketTimeoutException
    //   444	465	465	java/net/SocketTimeoutException
  }
  
  private void ZG() throws IOException {
    this.Zk = this.Zh.ZZ(new Ztme(this.Zk, this.Zc, this.Zx));
  }
  
  public Zstu Za() {
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw b(null);
    } 
    return (this.Z_ == null) ? Zyf.ZQm() : Zyf.Zy(this.Z_);
  }
  
  public int Zs() {
    return this.Zx;
  }
  
  public Zstu Zt() {
    try {
      if (this.Z_ != null) {
        try {
          if (this.Zx < 0);
        } catch (NumberFormatException numberFormatException) {
          throw b(null);
        } 
        return Zyf.Zy(Arrays.copyOfRange(this.Z_, this.Zx, this.Z_.length));
      } 
    } catch (NumberFormatException numberFormatException) {
      throw b(null);
    } 
  }
  
  private void ZK(int paramInt) throws Zgs7, IOException {
    int i = ZW();
    int j = paramInt;
    do {
      this.Zc = this.ZN.toByteArray();
      this.Zx = Zsbj.ZB(this.Zc, paramInt, false);
      if (this.Zx != -1)
        break; 
      paramInt = Math.max(this.Zc.length - 3, 0);
      try {
        this.Zg = this.Zk.read(this.ZL);
      } catch (SocketTimeoutException|SocketException socketTimeoutException) {
        Zah.Zl(socketTimeoutException, Zk_.COMMON_RUNTIME_FAILURE);
        this.Z_ = this.Zc;
        throw new Zgs7(socketTimeoutException);
      } 
      try {
        if (this.Zg == -1) {
          this.Zx = this.Zc.length;
          return;
        } 
      } catch (SocketTimeoutException socketTimeoutException) {
        throw b(null);
      } 
      this.ZN.write(this.ZL, 0, this.Zg);
    } while (i == 0);
    this.Zj = Zsbj.Zh(this.Zc, j, this.Zx - 1);
  }
  
  protected abstract void Zh() throws Zkmz;
  
  protected abstract void ZZ(int paramInt);
  
  protected abstract void ZJ();
  
  private byte[] ZV() throws Zgs7, IOException {
    byte[] arrayOfByte;
    switch (this.Zo) {
      case 0:
        ZN(this.ZN, this.Zc, this.Zx, this.Zt);
        arrayOfByte = this.ZN.toByteArray();
        ZZ(arrayOfByte.length);
        return arrayOfByte;
      case 1:
        Zl(this.ZN, this.Zc, this.Zx, this.Zz);
        arrayOfByte = this.ZN.toByteArray();
        try {
        
        } catch (Zgs7 zgs7) {
          throw b(null);
        } 
        this.ZD = (arrayOfByte.length > this.Zz);
        ZZ(arrayOfByte.length);
        return arrayOfByte;
      case 2:
        ZI(this.ZN, this.Zc, this.Zx);
        arrayOfByte = this.ZN.toByteArray();
        ZZ(arrayOfByte.length);
        return arrayOfByte;
      case 4:
        Zu();
        return this.ZN.toByteArray();
      case 5:
        this.Zq = Zmw.Zz(this.Zc, this.Zx, this.Zc.length);
        return new byte[0];
    } 
    Zuh.Zv(false, Zqf.Zr, this.Zo);
    return new byte[0];
  }
  
  private void Z_() throws Zgs7, IOException {
    // Byte code:
    //   0: invokestatic Zo : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zo : I
    //   8: tableswitch default -> 173, 0 -> 48, 1 -> 75, 2 -> 98, 3 -> 173, 4 -> 121, 5 -> 146
    //   48: aload_0
    //   49: aload_0
    //   50: getfield Zr : Ljava/io/OutputStream;
    //   53: iconst_0
    //   54: newarray byte
    //   56: iconst_0
    //   57: aload_0
    //   58: getfield Zt : I
    //   61: invokevirtual ZN : (Ljava/io/OutputStream;[BII)V
    //   64: iload_1
    //   65: ifne -> 173
    //   68: goto -> 75
    //   71: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   74: athrow
    //   75: aload_0
    //   76: aload_0
    //   77: getfield Zr : Ljava/io/OutputStream;
    //   80: aload_0
    //   81: getfield Zz : I
    //   84: invokevirtual Zl : (Ljava/io/OutputStream;I)V
    //   87: iload_1
    //   88: ifne -> 173
    //   91: goto -> 98
    //   94: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   97: athrow
    //   98: aload_0
    //   99: aload_0
    //   100: getfield Zr : Ljava/io/OutputStream;
    //   103: iconst_0
    //   104: newarray byte
    //   106: iconst_0
    //   107: invokevirtual ZI : (Ljava/io/OutputStream;[BI)V
    //   110: iload_1
    //   111: ifne -> 173
    //   114: goto -> 121
    //   117: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: aload_0
    //   122: aload_0
    //   123: getfield Zr : Ljava/io/OutputStream;
    //   126: iconst_0
    //   127: newarray byte
    //   129: iconst_0
    //   130: bipush #10
    //   132: invokevirtual ZN : (Ljava/io/OutputStream;[BII)V
    //   135: iload_1
    //   136: ifne -> 173
    //   139: goto -> 146
    //   142: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   145: athrow
    //   146: aload_0
    //   147: aload_0
    //   148: getfield Zc : [B
    //   151: aload_0
    //   152: getfield Zx : I
    //   155: aload_0
    //   156: getfield Zc : [B
    //   159: arraylength
    //   160: invokestatic Zz : ([BII)[B
    //   163: putfield Zq : [B
    //   166: goto -> 173
    //   169: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   172: athrow
    //   173: aload_0
    //   174: getfield Zr : Ljava/io/OutputStream;
    //   177: invokevirtual flush : ()V
    //   180: goto -> 193
    //   183: astore_2
    //   184: aload_2
    //   185: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   188: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   191: aload_2
    //   192: athrow
    //   193: return
    // Exception table:
    //   from	to	target	type
    //   4	68	71	burp/Zgs7
    //   4	180	183	burp/Zgs7
    //   48	91	94	burp/Zgs7
    //   75	114	117	burp/Zgs7
    //   98	139	142	burp/Zgs7
    //   121	169	169	burp/Zgs7
  }
  
  private void Zk(byte[] paramArrayOfbyte) throws IOException {
    int i = Zo();
    try {
      if (this.Zj == null) {
        this.Z_ = Objects.<byte[]>requireNonNullElseGet(paramArrayOfbyte, Zloq::lambda$buildMessage$0);
        return;
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    if (paramArrayOfbyte == null)
      paramArrayOfbyte = new byte[0]; 
    this.ZN.reset();
    for (List<String> list : this.ZK) {
      for (String str : list) {
        this.ZN.write(Zkb.Zy(str));
        this.ZN.write(Zdo.Zn);
        if (i == 0)
          break; 
      } 
      this.ZN.write(Zdo.Zn);
      if (i == 0)
        break; 
    } 
    this.Zx = this.ZN.size();
    this.ZN.write(paramArrayOfbyte);
    this.Z_ = this.ZN.toByteArray();
  }
  
  void ZN(OutputStream paramOutputStream, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    paramOutputStream.write(paramArrayOfbyte, paramInt1, paramArrayOfbyte.length - paramInt1);
    Zp(paramOutputStream, paramInt2);
  }
  
  private void Zl(Zxtp paramZxtp, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws Zgs7, IOException {
    paramZxtp.ZU(paramInt2);
    paramZxtp.write(paramArrayOfbyte, paramInt1, paramArrayOfbyte.length - paramInt1);
    int i = Zo();
    try {
      while (paramZxtp.size() < paramInt2) {
        try {
          this.Zg = this.Zk.read(this.ZL);
          if (this.Zg == -1)
            break; 
        } catch (SocketTimeoutException socketTimeoutException) {
          throw b(null);
        } 
        paramZxtp.write(this.ZL, 0, this.Zg);
        if (i == 0)
          break; 
      } 
    } catch (SocketTimeoutException|SocketException socketTimeoutException) {
      Zah.Zl(socketTimeoutException, Zk_.COMMON_RUNTIME_FAILURE);
      throw new Zgs7(socketTimeoutException);
    } 
    try {
      if (this.ZX)
        ZM(paramZxtp); 
    } catch (SocketTimeoutException socketTimeoutException) {
      throw b(null);
    } 
  }
  
  abstract void ZM(ByteArrayOutputStream paramByteArrayOutputStream) throws IOException;
  
  void Zp(OutputStream paramOutputStream, int paramInt) throws IOException {
    try {
      try {
        if (this.ZB.getSoTimeout() > paramInt)
          this.ZB.setSoTimeout(paramInt); 
      } catch (SocketTimeoutException socketTimeoutException) {
        throw b(null);
      } 
    } catch (SocketException socketException) {
      Zah.Zl(socketException, Zk_.IGNORED);
    } 
    while ((this.Zg = this.Zk.read(this.ZL)) > 0) {
      paramOutputStream.write(this.ZL, 0, this.Zg);
      if (this.ZR && Ztnx.Zg(this.ZL, this.Zg))
        break; 
    } 
    try {
      this.ZB.setSoTimeout(this.Zs);
    } catch (SocketException socketException) {
      Zah.Zl(socketException, Zk_.IGNORED);
    } 
  }
  
  private void Zl(OutputStream paramOutputStream, int paramInt) throws Zgs7, IOException {
    int i = 0;
    try {
      while (i < paramInt) {
        try {
          this.Zg = this.Zk.read(this.ZL);
          if (this.Zg == -1)
            break; 
        } catch (SocketTimeoutException socketTimeoutException) {
          throw b(null);
        } 
        paramOutputStream.write(this.ZL, 0, this.Zg);
        i += this.Zg;
        if (this.Zy != null && !this.Zy.Zq((float)(i * 100L / paramInt), null))
          return; 
      } 
    } catch (SocketTimeoutException|SocketException socketTimeoutException) {
      Zah.Zl(socketTimeoutException, Zk_.COMMON_RUNTIME_FAILURE);
      throw new Zgs7(socketTimeoutException);
    } 
    try {
      if (this.ZR)
        try {
          if (Ztnx.Zg(this.ZL, this.Zg))
            return; 
        } catch (SocketTimeoutException socketTimeoutException) {
          throw b(null);
        }  
    } catch (SocketTimeoutException socketTimeoutException) {
      throw b(null);
    } 
    Zp(paramOutputStream, 1000);
  }
  
  void ZI(OutputStream paramOutputStream, byte[] paramArrayOfbyte, int paramInt) throws Zgs7, IOException {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: putfield ZL : [B
    //   5: aload_0
    //   6: aload_0
    //   7: getfield ZL : [B
    //   10: arraylength
    //   11: putfield Zg : I
    //   14: invokestatic Zo : ()I
    //   17: iload_3
    //   18: istore #5
    //   20: istore #4
    //   22: iconst_0
    //   23: istore #7
    //   25: iconst_0
    //   26: istore #8
    //   28: iload #5
    //   30: istore #9
    //   32: iload #9
    //   34: aload_0
    //   35: getfield Zg : I
    //   38: iconst_1
    //   39: isub
    //   40: if_icmpge -> 106
    //   43: aload_0
    //   44: getfield ZL : [B
    //   47: iload #9
    //   49: baload
    //   50: bipush #13
    //   52: if_icmpne -> 91
    //   55: aload_0
    //   56: getfield ZL : [B
    //   59: iload #9
    //   61: iconst_1
    //   62: iadd
    //   63: baload
    //   64: bipush #10
    //   66: if_icmpne -> 91
    //   69: goto -> 76
    //   72: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   75: athrow
    //   76: iload #9
    //   78: iload #5
    //   80: isub
    //   81: istore #7
    //   83: iconst_1
    //   84: istore #8
    //   86: iload #4
    //   88: ifne -> 106
    //   91: iinc #9, 1
    //   94: iload #4
    //   96: ifne -> 32
    //   99: goto -> 106
    //   102: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   105: athrow
    //   106: iload #8
    //   108: ifne -> 353
    //   111: new java/io/ByteArrayOutputStream
    //   114: dup
    //   115: invokespecial <init> : ()V
    //   118: astore #9
    //   120: aload #9
    //   122: aload_0
    //   123: getfield ZL : [B
    //   126: iload #5
    //   128: aload_0
    //   129: getfield Zg : I
    //   132: iload #5
    //   134: isub
    //   135: invokevirtual write : ([BII)V
    //   138: aload_0
    //   139: getfield ZL : [B
    //   142: arraylength
    //   143: sipush #4096
    //   146: if_icmpeq -> 165
    //   149: aload_0
    //   150: sipush #4096
    //   153: newarray byte
    //   155: putfield ZL : [B
    //   158: goto -> 165
    //   161: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   164: athrow
    //   165: aload_0
    //   166: aload_0
    //   167: getfield Zk : Ljava/io/InputStream;
    //   170: aload_0
    //   171: getfield ZL : [B
    //   174: invokevirtual read : ([B)I
    //   177: putfield Zg : I
    //   180: aload_0
    //   181: getfield Zg : I
    //   184: iconst_m1
    //   185: if_icmpne -> 191
    //   188: goto -> 321
    //   191: aload #9
    //   193: aload_0
    //   194: getfield ZL : [B
    //   197: iconst_0
    //   198: aload_0
    //   199: getfield Zg : I
    //   202: invokevirtual write : ([BII)V
    //   205: aload #9
    //   207: invokevirtual toByteArray : ()[B
    //   210: astore #10
    //   212: iconst_0
    //   213: istore #11
    //   215: iload #11
    //   217: aload #10
    //   219: arraylength
    //   220: iconst_1
    //   221: isub
    //   222: if_icmpge -> 281
    //   225: aload #10
    //   227: iload #11
    //   229: baload
    //   230: bipush #13
    //   232: if_icmpne -> 266
    //   235: aload #10
    //   237: iload #11
    //   239: iconst_1
    //   240: iadd
    //   241: baload
    //   242: bipush #10
    //   244: if_icmpne -> 266
    //   247: goto -> 254
    //   250: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   253: athrow
    //   254: iload #11
    //   256: istore #7
    //   258: iconst_1
    //   259: istore #8
    //   261: iload #4
    //   263: ifne -> 281
    //   266: iinc #11, 1
    //   269: iload #4
    //   271: ifne -> 215
    //   274: goto -> 281
    //   277: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   280: athrow
    //   281: iload #8
    //   283: ifeq -> 309
    //   286: aload_0
    //   287: aload #10
    //   289: putfield ZL : [B
    //   292: iconst_0
    //   293: istore #5
    //   295: aload_0
    //   296: aload_0
    //   297: getfield ZL : [B
    //   300: arraylength
    //   301: putfield Zg : I
    //   304: iload #4
    //   306: ifne -> 321
    //   309: iload #4
    //   311: ifne -> 165
    //   314: goto -> 321
    //   317: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   320: athrow
    //   321: goto -> 353
    //   324: astore #10
    //   326: aload #10
    //   328: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   331: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   334: aload_1
    //   335: aload #9
    //   337: invokevirtual toByteArray : ()[B
    //   340: invokevirtual write : ([B)V
    //   343: new burp/Zgs7
    //   346: dup
    //   347: aload #10
    //   349: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   352: athrow
    //   353: iload #7
    //   355: ifne -> 365
    //   358: goto -> 912
    //   361: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   364: athrow
    //   365: aload_0
    //   366: getfield ZL : [B
    //   369: iload #5
    //   371: iload #7
    //   373: invokestatic Zo : ([BII)Ljava/lang/String;
    //   376: invokevirtual trim : ()Ljava/lang/String;
    //   379: bipush #16
    //   381: invokestatic parseInt : (Ljava/lang/String;I)I
    //   384: istore #6
    //   386: goto -> 415
    //   389: astore #9
    //   391: aload #9
    //   393: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   396: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   399: aload_0
    //   400: aload_1
    //   401: aload_0
    //   402: getfield ZL : [B
    //   405: iload #5
    //   407: aload_0
    //   408: getfield Zt : I
    //   411: invokevirtual ZN : (Ljava/io/OutputStream;[BII)V
    //   414: return
    //   415: iload #6
    //   417: ifne -> 427
    //   420: goto -> 912
    //   423: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   426: athrow
    //   427: iload #5
    //   429: iload #7
    //   431: iadd
    //   432: iconst_2
    //   433: iadd
    //   434: iload #6
    //   436: iadd
    //   437: aload_0
    //   438: getfield Zg : I
    //   441: if_icmple -> 622
    //   444: aload_0
    //   445: getfield Zg : I
    //   448: iload #5
    //   450: iload #7
    //   452: iadd
    //   453: iconst_2
    //   454: iadd
    //   455: isub
    //   456: istore #9
    //   458: aload_1
    //   459: aload_0
    //   460: getfield ZL : [B
    //   463: iload #5
    //   465: iload #7
    //   467: iadd
    //   468: iconst_2
    //   469: iadd
    //   470: iload #9
    //   472: invokevirtual write : ([BII)V
    //   475: iload #6
    //   477: iload #9
    //   479: isub
    //   480: istore #6
    //   482: aload_0
    //   483: getfield ZL : [B
    //   486: arraylength
    //   487: sipush #4096
    //   490: if_icmpeq -> 509
    //   493: aload_0
    //   494: sipush #4096
    //   497: newarray byte
    //   499: putfield ZL : [B
    //   502: goto -> 509
    //   505: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   508: athrow
    //   509: aload_0
    //   510: aload_0
    //   511: getfield Zk : Ljava/io/InputStream;
    //   514: aload_0
    //   515: getfield ZL : [B
    //   518: invokevirtual read : ([B)I
    //   521: putfield Zg : I
    //   524: aload_0
    //   525: getfield Zg : I
    //   528: iconst_m1
    //   529: if_icmpne -> 540
    //   532: new java/io/IOException
    //   535: dup
    //   536: invokespecial <init> : ()V
    //   539: athrow
    //   540: iload #6
    //   542: aload_0
    //   543: getfield Zg : I
    //   546: if_icmple -> 576
    //   549: aload_1
    //   550: aload_0
    //   551: getfield ZL : [B
    //   554: iconst_0
    //   555: aload_0
    //   556: getfield Zg : I
    //   559: invokevirtual write : ([BII)V
    //   562: iload #6
    //   564: aload_0
    //   565: getfield Zg : I
    //   568: isub
    //   569: istore #6
    //   571: iload #4
    //   573: ifne -> 509
    //   576: aload_1
    //   577: aload_0
    //   578: getfield ZL : [B
    //   581: iconst_0
    //   582: iload #6
    //   584: invokevirtual write : ([BII)V
    //   587: iload #6
    //   589: istore #5
    //   591: goto -> 594
    //   594: goto -> 617
    //   597: astore #10
    //   599: aload #10
    //   601: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   604: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   607: new burp/Zgs7
    //   610: dup
    //   611: aload #10
    //   613: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   616: athrow
    //   617: iload #4
    //   619: ifne -> 651
    //   622: aload_1
    //   623: aload_0
    //   624: getfield ZL : [B
    //   627: iload #5
    //   629: iload #7
    //   631: iadd
    //   632: iconst_2
    //   633: iadd
    //   634: iload #6
    //   636: invokevirtual write : ([BII)V
    //   639: iload #5
    //   641: iload #7
    //   643: iconst_2
    //   644: iadd
    //   645: iload #6
    //   647: iadd
    //   648: iadd
    //   649: istore #5
    //   651: iload #5
    //   653: iconst_2
    //   654: iadd
    //   655: aload_0
    //   656: getfield Zg : I
    //   659: if_icmple -> 897
    //   662: new java/io/ByteArrayOutputStream
    //   665: dup
    //   666: invokespecial <init> : ()V
    //   669: astore #9
    //   671: aload #9
    //   673: aload_0
    //   674: getfield ZL : [B
    //   677: iload #5
    //   679: aload_0
    //   680: getfield Zg : I
    //   683: iload #5
    //   685: isub
    //   686: invokevirtual write : ([BII)V
    //   689: aload_0
    //   690: getfield ZL : [B
    //   693: arraylength
    //   694: sipush #4096
    //   697: if_icmpeq -> 716
    //   700: aload_0
    //   701: sipush #4096
    //   704: newarray byte
    //   706: putfield ZL : [B
    //   709: goto -> 716
    //   712: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   715: athrow
    //   716: aload #9
    //   718: invokevirtual size : ()I
    //   721: iconst_2
    //   722: if_icmpge -> 839
    //   725: aload_0
    //   726: aload_0
    //   727: getfield Zk : Ljava/io/InputStream;
    //   730: aload_0
    //   731: getfield ZL : [B
    //   734: invokevirtual read : ([B)I
    //   737: putfield Zg : I
    //   740: aload_0
    //   741: getfield Zg : I
    //   744: iconst_m1
    //   745: if_icmpne -> 760
    //   748: new java/io/IOException
    //   751: dup
    //   752: invokespecial <init> : ()V
    //   755: athrow
    //   756: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   759: athrow
    //   760: invokestatic ZU : ()Z
    //   763: ifeq -> 820
    //   766: aload_0
    //   767: getfield Zg : I
    //   770: newarray byte
    //   772: astore #10
    //   774: aload_0
    //   775: getfield ZL : [B
    //   778: iconst_0
    //   779: aload #10
    //   781: iconst_0
    //   782: aload_0
    //   783: getfield Zg : I
    //   786: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   789: getstatic burp/Zrp6.TRACE : Lburp/Zrp6;
    //   792: getstatic burp/Zloq.a : Ljava/lang/String;
    //   795: iconst_2
    //   796: anewarray java/lang/Object
    //   799: dup
    //   800: iconst_0
    //   801: aload_0
    //   802: getfield Zg : I
    //   805: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   808: aastore
    //   809: dup
    //   810: iconst_1
    //   811: aload #10
    //   813: invokestatic ZG : ([B)Ljava/lang/String;
    //   816: aastore
    //   817: invokestatic ZB : (Lburp/Zrp6;Ljava/lang/String;[Ljava/lang/Object;)V
    //   820: aload #9
    //   822: aload_0
    //   823: getfield ZL : [B
    //   826: iconst_0
    //   827: aload_0
    //   828: getfield Zg : I
    //   831: invokevirtual write : ([BII)V
    //   834: iload #4
    //   836: ifne -> 716
    //   839: goto -> 871
    //   842: astore #10
    //   844: aload #10
    //   846: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   849: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   852: aload_1
    //   853: aload #9
    //   855: invokevirtual toByteArray : ()[B
    //   858: invokevirtual write : ([B)V
    //   861: new burp/Zgs7
    //   864: dup
    //   865: aload #10
    //   867: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   870: athrow
    //   871: aload_0
    //   872: aload #9
    //   874: invokevirtual toByteArray : ()[B
    //   877: putfield ZL : [B
    //   880: iconst_2
    //   881: istore #5
    //   883: aload_0
    //   884: aload_0
    //   885: getfield ZL : [B
    //   888: arraylength
    //   889: putfield Zg : I
    //   892: iload #4
    //   894: ifne -> 907
    //   897: iinc #5, 2
    //   900: goto -> 907
    //   903: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   906: athrow
    //   907: iload #4
    //   909: ifne -> 22
    //   912: return
    // Exception table:
    //   from	to	target	type
    //   43	69	72	java/net/SocketTimeoutException
    //   86	99	102	java/net/SocketTimeoutException
    //   120	158	161	java/net/SocketTimeoutException
    //   165	321	324	java/net/SocketTimeoutException
    //   165	321	324	java/net/SocketException
    //   225	247	250	java/net/SocketTimeoutException
    //   261	274	277	java/net/SocketTimeoutException
    //   295	314	317	java/net/SocketTimeoutException
    //   353	361	361	java/net/SocketTimeoutException
    //   365	386	389	java/lang/NumberFormatException
    //   415	423	423	java/net/SocketTimeoutException
    //   482	502	505	java/net/SocketTimeoutException
    //   509	594	597	java/net/SocketTimeoutException
    //   509	594	597	java/net/SocketException
    //   671	709	712	java/net/SocketTimeoutException
    //   716	839	842	java/net/SocketTimeoutException
    //   716	839	842	java/net/SocketException
    //   725	756	756	java/net/SocketTimeoutException
    //   883	900	903	java/net/SocketTimeoutException
  }
  
  private void Zu() throws IOException {
    try {
      this.ZN.write(this.Zc, this.Zx, this.Zc.length - this.Zx);
      if (this.ZX)
        Zp(this.ZN, 10); 
    } catch (IOException iOException) {
      throw b(null);
    } 
  }
  
  private static byte[] lambda$buildMessage$0() {
    return new byte[0];
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZW : ()I
    //   3: ifeq -> 11
    //   6: bipush #50
    //   8: invokestatic Zl : (I)V
    //   11: bipush #122
    //   13: ldc '@,{\\nywE-c^+~Ty(\\f<{fl^;yV&z^|'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zloq.a : Ljava/lang/String;
    //   22: goto -> 165
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 139
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 121, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 111, 5 -> 116
    //   92: bipush #74
    //   94: goto -> 123
    //   97: bipush #57
    //   99: goto -> 123
    //   102: bipush #114
    //   104: goto -> 123
    //   107: iconst_4
    //   108: goto -> 123
    //   111: bipush #35
    //   113: goto -> 123
    //   116: bipush #26
    //   118: goto -> 123
    //   121: bipush #101
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 46
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 43
    //   146: pop
    //   147: new java/lang/String
    //   150: dup_x1
    //   151: swap
    //   152: invokespecial <init> : ([C)V
    //   155: invokevirtual intern : ()Ljava/lang/String;
    //   158: swap
    //   159: pop
    //   160: swap
    //   161: pop
    //   162: goto -> 19
    //   165: new java/util/concurrent/atomic/AtomicBoolean
    //   168: dup
    //   169: invokespecial <init> : ()V
    //   172: putstatic burp/Zloq.ZS : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   175: return
  }
  
  public static void Zl(int paramInt) {
    ZG = paramInt;
  }
  
  public static int ZW() {
    return ZG;
  }
  
  public static int Zo() {
    int i = ZW();
    try {
      if (i == 0)
        return 11; 
    } catch (NumberFormatException numberFormatException) {
      throw b(null);
    } 
    return 0;
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zloq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */