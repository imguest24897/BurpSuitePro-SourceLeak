package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zdo;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zmw;
import net.portswigger.Zoq;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzp6 {
  private static final Zr_4 Zl;
  
  private static final Zzrd ZM;
  
  private static final Zzrd Zc;
  
  private final Zbnt ZZ;
  
  private final Zefx Zv;
  
  private final Zefg<Zrrc> ZV;
  
  private final Zoq<Zefx> ZX;
  
  private final List<Zgh_> Zg = new LinkedList<>();
  
  private List<Zgh_> ZG;
  
  private boolean ZC;
  
  private int Zz = 0;
  
  private int Zw = 0;
  
  private int ZP = 0;
  
  private int ZQ = 0;
  
  private int ZK = 0;
  
  private int Zu = 0;
  
  private int ZN = 0;
  
  private int Ze = 0;
  
  private int ZF = 0;
  
  private int ZJ = 0;
  
  private int ZY = 0;
  
  private int Z_ = 0;
  
  private int Za = 0;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zzp6(Zefx paramZefx, Zefg<Zrrc> paramZefg, Zbnt paramZbnt) {
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    this.ZZ = paramZbnt;
    this.Zv = paramZefx;
    this.ZV = paramZefg;
    this.ZX = Zoq.ZZ(paramZefx::lambda$new$0);
    if (Zbqc.Zwu() == null)
      Zs66.ZS(new Zbqc[3]); 
  }
  
  public Zzcc Zd() {
    if (this.ZV != null) {
      ZA(this.ZV);
      return new Zzcc(this.Zg);
    } 
    this.ZG = new ArrayList<>();
    this.ZC = false;
    ZW();
    ZS();
    Zt();
    ZA();
    Zm();
    Zx();
    ZO();
    ZI();
    ZF();
    ZR();
    Zq();
    return new Zzcc(this.Zg);
  }
  
  private void ZA() {
    try {
      Zbu4 zbu4;
      byte[] arrayOfByte = this.Zv.ZD();
      int i = ZM.ZL(arrayOfByte).ZQ();
      int j = 0;
      do {
        zbu4 = Zc.Zk(arrayOfByte, j, i);
        if (!zbu4.ZP())
          continue; 
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        int k = ZV(arrayOfByte, zbu4.ZR() + 2, i, stringBuilder1) + 1;
        int m = k;
        k = ZR(arrayOfByte, k, i);
        int n = k;
        k = ZX(arrayOfByte, k, i, stringBuilder2);
        String str = stringBuilder1.toString();
        Zgh_ zgh_ = (new Zz4c(Ztwr.Zc(this.Zv, new Zrec[0]), this.ZK++)).ZN(Zs66.HEADER, str, Zs54.Zg(zbu4.ZR(), m), stringBuilder2.toString(), Zs54.Zg(n, k)).Zs();
        Zb(zgh_);
        j = k;
      } while (zbu4.ZP());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private static int ZX(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, StringBuilder paramStringBuilder) {
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    while (paramArrayOfbyte[paramInt1] != 13 && paramArrayOfbyte[paramInt1] != 10 && paramInt1 < paramInt2) {
      paramStringBuilder.append((char)paramArrayOfbyte[paramInt1]);
      paramInt1++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return paramInt1;
  }
  
  private static int ZR(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    while (paramArrayOfbyte[paramInt1] == 32 && paramInt1 < paramInt2) {
      paramInt1++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return paramInt1;
  }
  
  private static int ZV(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, StringBuilder paramStringBuilder) {
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    while (paramArrayOfbyte[paramInt1] != 58 && paramInt1 < paramInt2) {
      paramStringBuilder.append((char)paramArrayOfbyte[paramInt1]);
      paramInt1++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return paramInt1;
  }
  
  private void ZR() {
    List<Zlou> list = Zznx.ZV(this.Zv.ZD()).stream().filter(Zzp6::lambda$addUrlFilenameInsertionPoint$1).toList();
    try {
      if (list.isEmpty())
        return; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      Zlou zlou = list.getLast();
      Zgh_ zgh_ = (new Zz4c(Ztwr.Zc(this.Zv, new Zrec[0]), 0)).ZN(Zs66.Zm(zlou.Zx), zlou.ZA, Zs54.Zg(zlou.ZP, zlou.ZK), zlou.Zr, Zs54.Zg(zlou.ZE, zlou.ZV)).Zs();
      ZE(zgh_);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZA(Zefg<Zrrc> paramZefg) {
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    for (Zrrc zrrc : paramZefg) {
      Zgh_ zgh_ = (new Zz4c(Ztwr.Zc(this.Zv, new Zrec[0]), this.Za++)).ZN(Zs66.MANUAL_INSERTION_POINT, Integer.toString(this.Za), Zs54.Zg(-1, -1), Zkb.ZG(Zmw.Zz(this.Zv.ZD(), zrrc.startOffset(), zrrc.endOffset())), Zs54.Zg(zrrc.startOffset(), zrrc.endOffset())).Zq(Zmfe.Zj(this.Zv, zrrc.startOffset(), zrrc.endOffset())).Zs();
      ZE(zgh_);
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private void ZS() {
    // Byte code:
    //   0: invokestatic Zi : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zv : Lburp/Zefx;
    //   8: invokeinterface Zc : ()Ljava/util/List;
    //   13: invokeinterface iterator : ()Ljava/util/Iterator;
    //   18: astore_2
    //   19: aload_2
    //   20: invokeinterface hasNext : ()Z
    //   25: ifeq -> 483
    //   28: aload_2
    //   29: invokeinterface next : ()Ljava/lang/Object;
    //   34: checkcast burp/Zlou
    //   37: astore_3
    //   38: aload_3
    //   39: getfield Zx : Lburp/Zrdu;
    //   42: getstatic burp/Zrdu.BODY_PARAM_URL_ENCODED : Lburp/Zrdu;
    //   45: if_acmpeq -> 65
    //   48: aload_3
    //   49: getfield Zx : Lburp/Zrdu;
    //   52: getstatic burp/Zrdu.BODY_PARAM_MULTIPART : Lburp/Zrdu;
    //   55: if_acmpne -> 77
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   64: athrow
    //   65: aload_0
    //   66: iconst_1
    //   67: putfield ZC : Z
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: getstatic burp/Zrj9.Zt : [I
    //   80: aload_3
    //   81: getfield Zx : Lburp/Zrdu;
    //   84: invokevirtual ordinal : ()I
    //   87: iaload
    //   88: tableswitch default -> 445, 1 -> 136, 2 -> 223, 3 -> 347, 4 -> 347, 5 -> 347, 6 -> 347, 7 -> 347, 8 -> 434
    //   136: new burp/Zz4c
    //   139: dup
    //   140: aload_0
    //   141: getfield Zv : Lburp/Zefx;
    //   144: iconst_0
    //   145: anewarray burp/Zrec
    //   148: invokestatic Zc : (Lburp/Zefx;[Lburp/Zrec;)Lburp/Ztwr;
    //   151: aload_0
    //   152: getfield Zz : I
    //   155: invokespecial <init> : (Lburp/Ztwr;I)V
    //   158: aload_3
    //   159: getfield Zx : Lburp/Zrdu;
    //   162: invokestatic Zm : (Lburp/Zrdu;)Lburp/Zs66;
    //   165: aload_3
    //   166: getfield ZA : Ljava/lang/String;
    //   169: aload_3
    //   170: getfield ZP : I
    //   173: aload_3
    //   174: getfield ZK : I
    //   177: invokestatic Zg : (II)Lburp/Zs54;
    //   180: aload_3
    //   181: getfield Zr : Ljava/lang/String;
    //   184: aload_3
    //   185: getfield ZE : I
    //   188: aload_3
    //   189: getfield ZV : I
    //   192: invokestatic Zg : (II)Lburp/Zs54;
    //   195: invokevirtual ZN : (Lburp/Zs66;Ljava/lang/String;Lburp/Zs54;Ljava/lang/String;Lburp/Zs54;)Lburp/Zz4c;
    //   198: invokevirtual Zs : ()Lburp/Zgh_;
    //   201: astore #4
    //   203: aload_0
    //   204: aload #4
    //   206: invokevirtual Zb : (Lburp/Zgh_;)V
    //   209: aload_0
    //   210: dup
    //   211: getfield Zz : I
    //   214: iconst_1
    //   215: iadd
    //   216: putfield Zz : I
    //   219: aload_1
    //   220: ifnull -> 466
    //   223: aload_0
    //   224: getfield Zv : Lburp/Zefx;
    //   227: invokeinterface ZD : ()[B
    //   232: aload_3
    //   233: invokestatic Zm : ([BLburp/Zlou;)Z
    //   236: ifeq -> 347
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   245: athrow
    //   246: aload_0
    //   247: aload_3
    //   248: <illegal opcode> Zv : (Lburp/Zzp6;Lburp/Zlou;)Lburp/Zrec;
    //   253: astore #4
    //   255: new burp/Zz4c
    //   258: dup
    //   259: aload_0
    //   260: getfield Zv : Lburp/Zefx;
    //   263: iconst_1
    //   264: anewarray burp/Zrec
    //   267: dup
    //   268: iconst_0
    //   269: aload #4
    //   271: aastore
    //   272: invokestatic Zc : (Lburp/Zefx;[Lburp/Zrec;)Lburp/Ztwr;
    //   275: aload_0
    //   276: getfield Zw : I
    //   279: invokespecial <init> : (Lburp/Ztwr;I)V
    //   282: getstatic burp/Zs66.JSON_PARAM : Lburp/Zs66;
    //   285: aload_3
    //   286: getfield ZA : Ljava/lang/String;
    //   289: aload_3
    //   290: getfield ZP : I
    //   293: aload_3
    //   294: getfield ZK : I
    //   297: invokestatic Zg : (II)Lburp/Zs54;
    //   300: aload_3
    //   301: getfield Zr : Ljava/lang/String;
    //   304: aload_3
    //   305: getfield ZE : I
    //   308: iconst_1
    //   309: iadd
    //   310: aload_3
    //   311: getfield ZV : I
    //   314: iconst_1
    //   315: iadd
    //   316: invokestatic Zg : (II)Lburp/Zs54;
    //   319: invokevirtual ZN : (Lburp/Zs66;Ljava/lang/String;Lburp/Zs54;Ljava/lang/String;Lburp/Zs54;)Lburp/Zz4c;
    //   322: invokevirtual Zs : ()Lburp/Zgh_;
    //   325: astore #5
    //   327: aload_0
    //   328: aload #5
    //   330: invokevirtual Zb : (Lburp/Zgh_;)V
    //   333: aload_0
    //   334: dup
    //   335: getfield Zw : I
    //   338: iconst_1
    //   339: iadd
    //   340: putfield Zw : I
    //   343: aload_1
    //   344: ifnull -> 466
    //   347: new burp/Zz4c
    //   350: dup
    //   351: aload_0
    //   352: getfield Zv : Lburp/Zefx;
    //   355: iconst_0
    //   356: anewarray burp/Zrec
    //   359: invokestatic Zc : (Lburp/Zefx;[Lburp/Zrec;)Lburp/Ztwr;
    //   362: aload_0
    //   363: getfield Zw : I
    //   366: invokespecial <init> : (Lburp/Ztwr;I)V
    //   369: aload_3
    //   370: getfield Zx : Lburp/Zrdu;
    //   373: invokestatic Zm : (Lburp/Zrdu;)Lburp/Zs66;
    //   376: aload_3
    //   377: getfield ZA : Ljava/lang/String;
    //   380: aload_3
    //   381: getfield ZP : I
    //   384: aload_3
    //   385: getfield ZK : I
    //   388: invokestatic Zg : (II)Lburp/Zs54;
    //   391: aload_3
    //   392: getfield Zr : Ljava/lang/String;
    //   395: aload_3
    //   396: getfield ZE : I
    //   399: aload_3
    //   400: getfield ZV : I
    //   403: invokestatic Zg : (II)Lburp/Zs54;
    //   406: invokevirtual ZN : (Lburp/Zs66;Ljava/lang/String;Lburp/Zs54;Ljava/lang/String;Lburp/Zs54;)Lburp/Zz4c;
    //   409: invokevirtual Zs : ()Lburp/Zgh_;
    //   412: astore #4
    //   414: aload_0
    //   415: aload #4
    //   417: invokevirtual Zb : (Lburp/Zgh_;)V
    //   420: aload_0
    //   421: dup
    //   422: getfield Zw : I
    //   425: iconst_1
    //   426: iadd
    //   427: putfield Zw : I
    //   430: aload_1
    //   431: ifnull -> 466
    //   434: aload_1
    //   435: ifnull -> 466
    //   438: goto -> 445
    //   441: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   444: athrow
    //   445: iconst_0
    //   446: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   449: aload_3
    //   450: getfield Zx : Lburp/Zrdu;
    //   453: invokevirtual toString : ()Ljava/lang/String;
    //   456: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   459: goto -> 466
    //   462: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   465: athrow
    //   466: goto -> 479
    //   469: astore #4
    //   471: aload #4
    //   473: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   476: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   479: aload_1
    //   480: ifnull -> 19
    //   483: return
    // Exception table:
    //   from	to	target	type
    //   38	58	61	java/lang/Exception
    //   48	70	73	java/lang/Exception
    //   77	466	469	java/lang/Exception
    //   203	239	242	java/lang/Exception
    //   414	438	441	java/lang/Exception
    //   434	459	462	java/lang/Exception
  }
  
  private void Zx() {
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    try {
      byte[] arrayOfByte = this.Zv.ZD();
      if (Zo(arrayOfByte, this.Zv.ZR(), arrayOfByte.length) == Zsba.XML) {
        List<Ztu8> list = Zeam.Zv(arrayOfByte, this.Zv.ZR(), arrayOfByte.length, (byte)1);
        for (Ztu8 ztu8 : list) {
          try {
            if (ztu8.ZlD() == 4)
              ZM(ztu8); 
          } catch (Exception exception) {
            throw a(null);
          } 
          if (arrayOfZbqc != null)
            break; 
        } 
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZW() {
    try {
      try {
        if (this.Zv.Zv() == Zsba.XML || this.Zv.Zv() == Zsba.JSON) {
          Zgh_ zgh_ = (new Zz4c(Ztwr.Zc(this.Zv, new Zrec[0]), 0)).ZN(Zs66.ENTIRE_BODY, "", Zs54.Zg(-1, -1), Zkb.ZG(this.Zv.Zw()), Zs54.Zg(this.Zv.ZR(), (this.Zv.ZD()).length)).Zs();
          ZE(zgh_);
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZM(Ztu8 paramZtu8) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zv : Lburp/Zefx;
    //   4: invokeinterface ZD : ()[B
    //   9: aload_1
    //   10: invokeinterface ZlK : ()I
    //   15: aload_1
    //   16: invokeinterface Zli : ()I
    //   21: invokestatic Zz : ([BII)[B
    //   24: astore_2
    //   25: aload_0
    //   26: aload_2
    //   27: invokevirtual ZR : ([B)I
    //   30: istore_3
    //   31: iload_3
    //   32: iconst_m1
    //   33: if_icmpne -> 37
    //   36: return
    //   37: aload_1
    //   38: invokeinterface ZlP : ()Lburp/Zs_n;
    //   43: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   48: sipush #-12543
    //   51: sipush #-564
    //   54: invokestatic a : (II)Ljava/lang/String;
    //   57: swap
    //   58: ldc '>'
    //   60: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   65: invokestatic Zy : (Ljava/lang/String;)[B
    //   68: astore #4
    //   70: aload_1
    //   71: invokeinterface ZlK : ()I
    //   76: iload_3
    //   77: iadd
    //   78: istore #5
    //   80: aload_1
    //   81: invokeinterface Zli : ()I
    //   86: istore #6
    //   88: iload #5
    //   90: iconst_1
    //   91: iadd
    //   92: istore #7
    //   94: aload_0
    //   95: iload #5
    //   97: iload #6
    //   99: aload #4
    //   101: <illegal opcode> Zv : (Lburp/Zzp6;II[B)Lburp/Zrec;
    //   106: astore #8
    //   108: new burp/Zz4c
    //   111: dup
    //   112: aload_0
    //   113: getfield Zv : Lburp/Zefx;
    //   116: iconst_1
    //   117: anewarray burp/Zrec
    //   120: dup
    //   121: iconst_0
    //   122: aload #8
    //   124: aastore
    //   125: invokestatic Zc : (Lburp/Zefx;[Lburp/Zrec;)Lburp/Ztwr;
    //   128: aload_0
    //   129: dup
    //   130: getfield Zw : I
    //   133: dup_x1
    //   134: iconst_1
    //   135: iadd
    //   136: putfield Zw : I
    //   139: invokespecial <init> : (Lburp/Ztwr;I)V
    //   142: getstatic burp/Zs66.XML_PARAM : Lburp/Zs66;
    //   145: aload_1
    //   146: invokeinterface ZlP : ()Lburp/Zs_n;
    //   151: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   156: iconst_m1
    //   157: iconst_m1
    //   158: invokestatic Zg : (II)Lburp/Zs54;
    //   161: ldc ''
    //   163: iload #7
    //   165: iload #7
    //   167: invokestatic Zg : (II)Lburp/Zs54;
    //   170: invokevirtual ZN : (Lburp/Zs66;Ljava/lang/String;Lburp/Zs54;Ljava/lang/String;Lburp/Zs54;)Lburp/Zz4c;
    //   173: invokevirtual Zs : ()Lburp/Zgh_;
    //   176: astore #9
    //   178: aload_0
    //   179: aload #9
    //   181: invokevirtual Zb : (Lburp/Zgh_;)V
    //   184: return
  }
  
  private int ZR(byte[] paramArrayOfbyte) {
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    int i = paramArrayOfbyte.length - 2;
    if (paramArrayOfbyte[i] != 47)
      return -1; 
    while (paramArrayOfbyte[i - 1] == 32) {
      i--;
      if (arrayOfZbqc != null)
        break; 
    } 
    return i;
  }
  
  private void Zt() {
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    for (Zlou zlou : this.Zv.Zc()) {
      try {
        try {
          Zgh_ zgh_;
          switch (Zrj9.Zt[zlou.Zx.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            
            case 8:
              zgh_ = (new Zz4c(Ztwr.Zc(this.Zv, new Zrec[0]), this.ZP)).ZN(Zs66.Zm(zlou.Zx), zlou.ZA, Zs54.Zg(zlou.ZP, zlou.ZK), zlou.Zr, Zs54.Zg(zlou.ZE, zlou.ZV)).Zs();
            default:
              Zuh.ZT(false, Zqf.Zk, zlou.Zx.toString());
              break;
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      } 
      continue;
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private void Zm() {
    this.ZG.forEach(this::ZF);
  }
  
  private void ZF(Zgh_ paramZgh_) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: invokestatic Zi : ()[Lburp/Zbqc;
    //   5: new java/util/Stack
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore #4
    //   14: aload #4
    //   16: aload_1
    //   17: invokevirtual push : (Ljava/lang/Object;)Ljava/lang/Object;
    //   20: pop
    //   21: astore_2
    //   22: aload #4
    //   24: invokevirtual empty : ()Z
    //   27: ifne -> 303
    //   30: aload #4
    //   32: invokevirtual pop : ()Ljava/lang/Object;
    //   35: checkcast burp/Zgh_
    //   38: astore_1
    //   39: aload_1
    //   40: instanceof burp/Zt4_
    //   43: ifeq -> 67
    //   46: aload_1
    //   47: checkcast burp/Zt4_
    //   50: astore #5
    //   52: aload #5
    //   54: iload_3
    //   55: iinc #3, 1
    //   58: invokevirtual ZU : (I)V
    //   61: aload_0
    //   62: aload #5
    //   64: invokevirtual ZE : (Lburp/Zgh_;)V
    //   67: aload_1
    //   68: invokeinterface Zr : ()Ljava/lang/String;
    //   73: invokevirtual trim : ()Ljava/lang/String;
    //   76: invokestatic Zy : (Ljava/lang/String;)[B
    //   79: astore #5
    //   81: aload_0
    //   82: aload #5
    //   84: invokevirtual ZZ : ([B)Ljava/util/List;
    //   87: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   92: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   97: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   102: invokeinterface toList : ()Ljava/util/List;
    //   107: astore #6
    //   109: aload #6
    //   111: invokeinterface isEmpty : ()Z
    //   116: ifne -> 212
    //   119: new java/util/ArrayList
    //   122: dup
    //   123: invokespecial <init> : ()V
    //   126: astore #7
    //   128: aload #6
    //   130: invokeinterface iterator : ()Ljava/util/Iterator;
    //   135: astore #8
    //   137: aload #8
    //   139: invokeinterface hasNext : ()Z
    //   144: ifeq -> 184
    //   147: aload #8
    //   149: invokeinterface next : ()Ljava/lang/Object;
    //   154: checkcast burp/Zlou
    //   157: astore #9
    //   159: aload_0
    //   160: aload #5
    //   162: aload #9
    //   164: aload_1
    //   165: invokevirtual ZQ : ([BLburp/Zlou;Lburp/Zgh_;)Lburp/Zt4_;
    //   168: astore #10
    //   170: aload #7
    //   172: aload #10
    //   174: invokeinterface add : (Ljava/lang/Object;)Z
    //   179: pop
    //   180: aload_2
    //   181: ifnull -> 137
    //   184: aload #7
    //   186: invokestatic reverse : (Ljava/util/List;)V
    //   189: aload #7
    //   191: aload #4
    //   193: dup
    //   194: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   197: pop
    //   198: <illegal opcode> accept : (Ljava/util/Stack;)Ljava/util/function/Consumer;
    //   203: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   208: aload_2
    //   209: ifnull -> 286
    //   212: aload #5
    //   214: invokestatic Z_ : ([B)Z
    //   217: ifeq -> 251
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   226: athrow
    //   227: aload_0
    //   228: aload #5
    //   230: getstatic burp/Zs66.BASE64_ENCODED : Lburp/Zs66;
    //   233: aload_1
    //   234: invokevirtual ZA : ([BLburp/Zs66;Lburp/Zgh_;)Lburp/Zt4_;
    //   237: astore #7
    //   239: aload #4
    //   241: aload #7
    //   243: invokevirtual push : (Ljava/lang/Object;)Ljava/lang/Object;
    //   246: pop
    //   247: aload_2
    //   248: ifnull -> 286
    //   251: aload #5
    //   253: invokestatic Zu : ([B)Z
    //   256: ifeq -> 286
    //   259: goto -> 266
    //   262: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   265: athrow
    //   266: aload_0
    //   267: aload #5
    //   269: getstatic burp/Zs66.BASE64URL_ENCODED : Lburp/Zs66;
    //   272: aload_1
    //   273: invokevirtual ZA : ([BLburp/Zs66;Lburp/Zgh_;)Lburp/Zt4_;
    //   276: astore #7
    //   278: aload #4
    //   280: aload #7
    //   282: invokevirtual push : (Ljava/lang/Object;)Ljava/lang/Object;
    //   285: pop
    //   286: goto -> 22
    //   289: astore #5
    //   291: aload #5
    //   293: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   296: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   299: aload_2
    //   300: ifnull -> 22
    //   303: return
    // Exception table:
    //   from	to	target	type
    //   67	286	289	java/lang/Exception
    //   184	220	223	java/lang/Exception
    //   239	259	262	java/lang/Exception
  }
  
  private List<Zt8g> ZZ(byte[] paramArrayOfbyte) {
    Zsba zsba = Zo(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    switch (Zrj9.Zg[zsba.ordinal()]) {
      case 1:
      
      case 2:
      
      case 3:
      
    } 
    return new LinkedList<>();
  }
  
  private Zsba Zo(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    Zsba zsba = Zmyf.Zy(paramArrayOfbyte, paramInt1, paramInt2);
    if (zsba == Zsba.NONE && Ztgd.ZF(paramArrayOfbyte, paramInt1, paramInt2))
      zsba = Zsba.URL_ENCODED; 
    return zsba;
  }
  
  private Zt4_ ZQ(byte[] paramArrayOfbyte, Zlou paramZlou, Zgh_ paramZgh_) {
    // Byte code:
    //   0: invokestatic Zi : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_3
    //   6: invokestatic ZT : (Lburp/Zgh_;)Lburp/Zgh_;
    //   9: invokeinterface ZM : ()Lburp/Zro0;
    //   14: invokeinterface ZE5 : ()I
    //   19: istore #5
    //   21: aload_1
    //   22: aload_2
    //   23: invokestatic Zm : ([BLburp/Zlou;)Z
    //   26: ifeq -> 99
    //   29: aload_2
    //   30: aload_1
    //   31: <illegal opcode> get : (Lburp/Zlou;[B)Ljava/util/function/Supplier;
    //   36: astore #7
    //   38: new burp/Zz4c
    //   41: dup
    //   42: aload #7
    //   44: invokestatic Zi : (Ljava/util/function/Supplier;)Lburp/Ztwr;
    //   47: iload #5
    //   49: invokespecial <init> : (Lburp/Ztwr;I)V
    //   52: getstatic burp/Zs66.JSON_PARAM : Lburp/Zs66;
    //   55: aload_2
    //   56: getfield ZA : Ljava/lang/String;
    //   59: aload_2
    //   60: getfield ZP : I
    //   63: aload_2
    //   64: getfield ZK : I
    //   67: invokestatic Zg : (II)Lburp/Zs54;
    //   70: aload_2
    //   71: getfield Zr : Ljava/lang/String;
    //   74: aload_2
    //   75: getfield ZE : I
    //   78: iconst_1
    //   79: iadd
    //   80: aload_2
    //   81: getfield ZV : I
    //   84: iconst_1
    //   85: iadd
    //   86: invokestatic Zg : (II)Lburp/Zs54;
    //   89: invokevirtual ZN : (Lburp/Zs66;Ljava/lang/String;Lburp/Zs54;Ljava/lang/String;Lburp/Zs54;)Lburp/Zz4c;
    //   92: astore #6
    //   94: aload #4
    //   96: ifnull -> 154
    //   99: new burp/Zz4c
    //   102: dup
    //   103: aload_1
    //   104: invokestatic ZD : ([B)Lburp/Ztwr;
    //   107: iload #5
    //   109: invokespecial <init> : (Lburp/Ztwr;I)V
    //   112: aload_2
    //   113: getfield Zx : Lburp/Zrdu;
    //   116: invokestatic Zm : (Lburp/Zrdu;)Lburp/Zs66;
    //   119: aload_2
    //   120: getfield ZA : Ljava/lang/String;
    //   123: aload_2
    //   124: getfield ZP : I
    //   127: aload_2
    //   128: getfield ZK : I
    //   131: invokestatic Zg : (II)Lburp/Zs54;
    //   134: aload_2
    //   135: getfield Zr : Ljava/lang/String;
    //   138: aload_2
    //   139: getfield ZE : I
    //   142: aload_2
    //   143: getfield ZV : I
    //   146: invokestatic Zg : (II)Lburp/Zs54;
    //   149: invokevirtual ZN : (Lburp/Zs66;Ljava/lang/String;Lburp/Zs54;Ljava/lang/String;Lburp/Zs54;)Lburp/Zz4c;
    //   152: astore #6
    //   154: getstatic burp/Zzp6.Zl : Lburp/Zr_4;
    //   157: new burp/Zl3
    //   160: dup
    //   161: aload_3
    //   162: invokestatic ZT : (Lburp/Zgh_;)Lburp/Zgh_;
    //   165: invokeinterface ZG : ()Lburp/Zs66;
    //   170: iload #5
    //   172: invokespecial <init> : (Lburp/Zs66;I)V
    //   175: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   180: checkcast burp/Zro0
    //   183: astore #7
    //   185: new burp/Zt4_
    //   188: dup
    //   189: aload_3
    //   190: aload #6
    //   192: invokevirtual Zs : ()Lburp/Zgh_;
    //   195: aload #7
    //   197: invokespecial <init> : (Lburp/Zgh_;Lburp/Zgh_;Lburp/Zro0;)V
    //   200: areturn
  }
  
  private static boolean Zm(byte[] paramArrayOfbyte, Zlou paramZlou) {
    return (paramZlou.Zx == Zrdu.JSON_PARAM && paramZlou.ZE > 0 && paramArrayOfbyte[paramZlou.ZE - 1] != 34 && paramZlou.ZV < paramArrayOfbyte.length && paramArrayOfbyte[paramZlou.ZV] != 34);
  }
  
  private Zt4_ ZA(byte[] paramArrayOfbyte, Zs66 paramZs66, Zgh_ paramZgh_) {
    int i = Zt4_.ZT(paramZgh_).ZM().ZE5();
    Zgh_ zgh_ = (new Zz4c(Ztwr.ZD(paramArrayOfbyte), i)).ZN(paramZs66, paramZgh_.ZT(), Zs54.Zg(-1, -1), Zkb.ZG(paramArrayOfbyte), Zs54.Zg(0, paramArrayOfbyte.length)).Zs();
    Zro0 zro0 = Zl.<Zro0>ZH(new Zl3(Zt4_.ZT(paramZgh_).ZG(), i));
    return new Zt4_(paramZgh_, zgh_, zro0);
  }
  
  private void ZO() {
    // Byte code:
    //   0: invokestatic Zi : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZC : Z
    //   8: ifeq -> 71
    //   11: aload_0
    //   12: getfield Zv : Lburp/Zefx;
    //   15: invokeinterface Zv : ()Lburp/Zsba;
    //   20: getstatic burp/Zsba.MULTIPART : Lburp/Zsba;
    //   23: if_acmpne -> 54
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   32: athrow
    //   33: aload_0
    //   34: getstatic burp/Zrdu.BODY_PARAM_MULTIPART : Lburp/Zrdu;
    //   37: getstatic burp/Zs66.PARAM_NAME_BODY_MULTIPART : Lburp/Zs66;
    //   40: invokevirtual Zz : (Lburp/Zrdu;Lburp/Zs66;)V
    //   43: aload_1
    //   44: ifnull -> 71
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   53: athrow
    //   54: aload_0
    //   55: getstatic burp/Zrdu.BODY_PARAM_URL_ENCODED : Lburp/Zrdu;
    //   58: getstatic burp/Zs66.PARAM_NAME_BODY_URL_ENCODED : Lburp/Zs66;
    //   61: invokevirtual Zz : (Lburp/Zrdu;Lburp/Zs66;)V
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   70: athrow
    //   71: aload_0
    //   72: getstatic burp/Zrdu.URL_PARAM : Lburp/Zrdu;
    //   75: getstatic burp/Zs66.PARAM_NAME_URL : Lburp/Zs66;
    //   78: invokevirtual Zz : (Lburp/Zrdu;Lburp/Zs66;)V
    //   81: sipush #-12541
    //   84: sipush #-29585
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: aload_0
    //   91: getfield Zv : Lburp/Zefx;
    //   94: invokeinterface ZF : ()Lburp/Zlit;
    //   99: invokeinterface Zd_ : ()Ljava/lang/String;
    //   104: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   107: ifeq -> 121
    //   110: aload_0
    //   111: invokevirtual ZM : ()V
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: goto -> 132
    //   124: astore_2
    //   125: aload_2
    //   126: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   129: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   132: return
    // Exception table:
    //   from	to	target	type
    //   4	26	29	java/lang/Exception
    //   4	121	124	java/lang/Exception
    //   11	47	50	java/lang/Exception
    //   33	64	67	java/lang/Exception
    //   71	114	117	java/lang/Exception
  }
  
  private void Zz(Zrdu paramZrdu, Zs66 paramZs66) {
    Zefx zefx = this.Zv.ZH(Zlou.Z_(paramZrdu, "1", "1"));
    Zlou zlou = zefx.Zc().stream().filter(paramZrdu::lambda$addNewParameterNameInsertionPoint$5).findFirst().orElse(null);
    if (zlou == null)
      return; 
    Zgh_ zgh_ = (new Zz4c(Ztwr.ZD(zefx.ZD()), this.ZQ++)).ZN(paramZs66, "", Zs54.Zg(-1, -1), zlou.Zr, Zs54.Zg(zlou.ZP, zlou.ZK)).Zs();
    ZE(zgh_);
  }
  
  private void ZM() {
    int[] arrayOfInt = Zruf.Zg(this.Zv.ZD());
    int i = this.Zv.ZF().Zds() ? Zruf.ZP(this.Zv.ZD())[0] : arrayOfInt[1];
    Zrec zrec = this::lambda$addPhpFileRequestInsertionPoint$6;
    Zgh_ zgh_ = (new Zz4c(Ztwr.Zc(this.Zv, new Zrec[] { zrec }), this.ZQ++)).ZN(Zs66.PARAM_NAME_URL, "", Zs54.Zg(-1, -1), "1", Zs54.Zg(i + 1, i + 2)).Zs();
    ZE(zgh_);
  }
  
  private void ZI() {
    try {
      ZJ();
      Zn();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZJ() {
    int i = Zli.ZZ(this.Zv.ZD(), Zdo.Zb, false, 0, this.Zv.ZR());
    if (i != -1) {
      i += Zdo.Zb.length;
      int j = Zli.ZU(this.Zv.ZD(), (byte)13, i, this.Zv.ZR());
      if (j != -1) {
        String str = Zkb.ZG(Zmw.Zz(this.Zv.ZD(), i, j));
        Zgh_ zgh_ = (new Zz4c(Ztwr.Zc(this.Zv, new Zrec[0]), this.ZK++)).ZN(Zs66.HEADER, a(-12544, -10521), Zs54.Zg(i - Zdo.Zb.length, i - 2), str, Zs54.Zg(i, j)).Zs();
        ZE(zgh_);
      } 
    } 
  }
  
  private void Zn() {
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    if (this.Zv.Zh(a(-12533, -21502))) {
      ZR(this.Zv);
      if (arrayOfZbqc != null) {
        Zl();
        return;
      } 
      return;
    } 
    Zl();
  }
  
  private void ZR(Zefx paramZefx) {
    int i = Zli.ZZ(paramZefx.ZD(), Zdo.ZC, false, 0, paramZefx.ZR()) + Zdo.ZC.length;
    int j = Zli.ZU(paramZefx.ZD(), (byte)13, i, paramZefx.ZR());
    if (j != -1) {
      String str = Zkb.ZG(Zmw.Zz(paramZefx.ZD(), i, j));
      Zgh_ zgh_ = (new Zz4c(Ztwr.Zc(paramZefx, new Zrec[0]), this.ZK++)).ZN(Zs66.HEADER, a(-12538, 21310), Zs54.Zg(i - Zdo.ZC.length, i - 2), str, Zs54.Zg(i, j)).Zs();
      ZE(zgh_);
    } 
  }
  
  private void Zl() {
    // Byte code:
    //   0: sipush #-12534
    //   3: sipush #-13422
    //   6: invokestatic a : (II)Ljava/lang/String;
    //   9: astore_1
    //   10: sipush #-12539
    //   13: sipush #-24238
    //   16: invokestatic a : (II)Ljava/lang/String;
    //   19: astore_2
    //   20: aload_0
    //   21: getfield Zv : Lburp/Zefx;
    //   24: invokeinterface ZR : ()I
    //   29: iconst_2
    //   30: isub
    //   31: istore_3
    //   32: iload_3
    //   33: aload_1
    //   34: invokevirtual length : ()I
    //   37: iadd
    //   38: iconst_2
    //   39: iadd
    //   40: istore #4
    //   42: aload_1
    //   43: aload_2
    //   44: <illegal opcode> Zv : (Ljava/lang/String;Ljava/lang/String;)Lburp/Zrec;
    //   49: astore #5
    //   51: new burp/Zz4c
    //   54: dup
    //   55: aload_0
    //   56: getfield Zv : Lburp/Zefx;
    //   59: iconst_1
    //   60: anewarray burp/Zrec
    //   63: dup
    //   64: iconst_0
    //   65: aload #5
    //   67: aastore
    //   68: invokestatic Zc : (Lburp/Zefx;[Lburp/Zrec;)Lburp/Ztwr;
    //   71: aload_0
    //   72: dup
    //   73: getfield ZK : I
    //   76: dup_x1
    //   77: iconst_1
    //   78: iadd
    //   79: putfield ZK : I
    //   82: invokespecial <init> : (Lburp/Ztwr;I)V
    //   85: getstatic burp/Zs66.HEADER : Lburp/Zs66;
    //   88: aload_1
    //   89: iload_3
    //   90: iload_3
    //   91: aload_1
    //   92: invokevirtual length : ()I
    //   95: iadd
    //   96: invokestatic Zg : (II)Lburp/Zs54;
    //   99: aload_2
    //   100: iload #4
    //   102: iload #4
    //   104: aload_2
    //   105: invokevirtual length : ()I
    //   108: iadd
    //   109: invokestatic Zg : (II)Lburp/Zs54;
    //   112: invokevirtual ZN : (Lburp/Zs66;Ljava/lang/String;Lburp/Zs54;Ljava/lang/String;Lburp/Zs54;)Lburp/Zz4c;
    //   115: invokevirtual Zs : ()Lburp/Zgh_;
    //   118: astore #6
    //   120: aload_0
    //   121: aload #6
    //   123: invokevirtual ZE : (Lburp/Zgh_;)V
    //   126: return
  }
  
  private void ZF() {
    List list = Zznx.ZV(this.Zv.ZD()).stream().filter(Zzp6::lambda$addUrlFoldersInsertionPoints$8).toList();
    Iterator<Zlou> iterator = list.iterator();
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    while (iterator.hasNext()) {
      Zlou zlou = iterator.next();
      try {
        Zgh_ zgh_ = (new Zz4c(Ztwr.Zc(this.Zv, new Zrec[0]), this.Zu++)).ZN(Zs66.Zm(zlou.Zx), zlou.ZA, Zs54.Zg(zlou.ZP, zlou.ZK), zlou.Zr, Zs54.Zg(zlou.ZE, zlou.ZV)).Zs();
        ZE(zgh_);
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private void Zq() {
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    for (Zlou zlou : this.Zv.Zc()) {
      try {
        try {
          switch (Zrj9.Zt[zlou.Zx.ordinal()]) {
            case 1:
            
            case 3:
            case 4:
            
            case 8:
              Zo(zlou);
              break;
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      } 
      continue;
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private void ZE(Zlou paramZlou) {
    if (Zy()) {
      Zs66 zs66 = (this.Zv.Zv() == Zsba.MULTIPART) ? Zs66.BODY_PARAM_MULTIPART : Zs66.BODY_PARAM_URL_ENCODED;
      ZE(ZI(paramZlou, zs66, this.ZN));
      this.ZN++;
    } 
    Zgh_ zgh_ = ZI(paramZlou, Zs66.COOKIE, this.ZJ);
    ZE(zgh_);
    this.ZJ++;
  }
  
  private void ZU(Zlou paramZlou) {
    Zgh_ zgh_1 = ZI(paramZlou, Zs66.URL_PARAM, this.Ze);
    ZE(zgh_1);
    this.Ze++;
    if (a(-12542, 6691).equalsIgnoreCase(this.Zv.Zr())) {
      Zefx zefx = (Zefx)this.ZX.Zz();
      Optional<Zlou> optional = zefx.Zc().stream().filter(Zzp6::lambda$addSwitchedBodyParameterLocationInsertionPoints$9).filter(paramZlou::lambda$addSwitchedBodyParameterLocationInsertionPoints$10).filter(paramZlou::lambda$addSwitchedBodyParameterLocationInsertionPoints$11).findFirst();
      if (optional.isPresent()) {
        Zlou zlou = optional.get();
        Zgh_ zgh_ = (new Zz4c(Ztwr.Zc(zefx, new Zrec[0]), this.Ze)).ZR(Zs66.Zm(paramZlou.Zx), Zs66.Zm(zlou.Zx), zlou.ZA, Zs54.Zg(zlou.ZP, zlou.ZK), zlou.Zr, Zs54.Zg(zlou.ZE, zlou.ZV)).Zs();
        ZE(zgh_);
        this.Ze++;
      } 
    } 
    Zgh_ zgh_2 = ZI(paramZlou, Zs66.COOKIE, this.ZY);
    ZE(zgh_2);
    this.ZY++;
  }
  
  private void Zo(Zlou paramZlou) {
    Zgh_ zgh_ = ZI(paramZlou, Zs66.URL_PARAM, this.ZF);
    ZE(zgh_);
    this.ZF++;
    if (Zy()) {
      Zs66 zs66 = (this.Zv.Zv() == Zsba.MULTIPART) ? Zs66.BODY_PARAM_MULTIPART : Zs66.BODY_PARAM_URL_ENCODED;
      Zgh_ zgh_1 = ZI(paramZlou, zs66, this.Z_);
      ZE(zgh_1);
      this.Z_++;
    } 
  }
  
  private Zgh_ ZI(Zlou paramZlou, Zs66 paramZs66, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: <illegal opcode> get : (Lburp/Zzp6;Lburp/Zlou;Lburp/Zs66;)Ljava/util/function/Supplier;
    //   8: astore #4
    //   10: new burp/Zz4c
    //   13: dup
    //   14: aload #4
    //   16: <illegal opcode> get : (Ljava/util/function/Supplier;)Ljava/util/function/Supplier;
    //   21: invokestatic Zi : (Ljava/util/function/Supplier;)Lburp/Ztwr;
    //   24: iload_3
    //   25: invokespecial <init> : (Lburp/Ztwr;I)V
    //   28: aload_1
    //   29: getfield Zx : Lburp/Zrdu;
    //   32: invokestatic Zm : (Lburp/Zrdu;)Lburp/Zs66;
    //   35: aload_2
    //   36: aload_1
    //   37: getfield ZA : Ljava/lang/String;
    //   40: aload #4
    //   42: <illegal opcode> get : (Ljava/util/function/Supplier;)Ljava/util/function/Supplier;
    //   47: aload #4
    //   49: <illegal opcode> get : (Ljava/util/function/Supplier;)Ljava/util/function/Supplier;
    //   54: invokestatic Zk : (Ljava/util/function/Supplier;Ljava/util/function/Supplier;)Lburp/Zs54;
    //   57: aload_1
    //   58: getfield Zr : Ljava/lang/String;
    //   61: aload #4
    //   63: <illegal opcode> get : (Ljava/util/function/Supplier;)Ljava/util/function/Supplier;
    //   68: aload #4
    //   70: <illegal opcode> get : (Ljava/util/function/Supplier;)Ljava/util/function/Supplier;
    //   75: invokestatic Zk : (Ljava/util/function/Supplier;Ljava/util/function/Supplier;)Lburp/Zs54;
    //   78: invokevirtual ZR : (Lburp/Zs66;Lburp/Zs66;Ljava/lang/String;Lburp/Zs54;Ljava/lang/String;Lburp/Zs54;)Lburp/Zz4c;
    //   81: invokevirtual Zs : ()Lburp/Zgh_;
    //   84: areturn
  }
  
  private boolean Zy() {
    return (this.Zv.Zv() == Zsba.URL_ENCODED || this.Zv.Zv() == Zsba.MULTIPART || this.Zv.Zv() == Zsba.NONE);
  }
  
  private void Zb(Zgh_ paramZgh_) {
    this.ZG.add(paramZgh_);
    ZE(paramZgh_);
  }
  
  private void ZE(Zgh_ paramZgh_) {
    this.Zg.add(paramZgh_);
  }
  
  private static Integer lambda$getMovedParameterInsertionPoint$17(Supplier<Zk9i> paramSupplier) {
    return Integer.valueOf(((Zk9i)paramSupplier.get()).Zpj());
  }
  
  private static Integer lambda$getMovedParameterInsertionPoint$16(Supplier<Zk9i> paramSupplier) {
    return Integer.valueOf(((Zk9i)paramSupplier.get()).Zpg());
  }
  
  private static Integer lambda$getMovedParameterInsertionPoint$15(Supplier<Zk9i> paramSupplier) {
    return Integer.valueOf(((Zk9i)paramSupplier.get()).Zph());
  }
  
  private static Integer lambda$getMovedParameterInsertionPoint$14(Supplier<Zk9i> paramSupplier) {
    return Integer.valueOf(((Zk9i)paramSupplier.get()).ZpZ());
  }
  
  private static byte[] lambda$getMovedParameterInsertionPoint$13(Supplier<Zk9i> paramSupplier) {
    return ((Zk9i)paramSupplier.get()).Zpm();
  }
  
  private Zk9i lambda$getMovedParameterInsertionPoint$12(Zlou paramZlou, Zs66 paramZs66) {
    int[] arrayOfInt = new int[4];
    byte[] arrayOfByte = Zljl.Zs(this.Zv.ZD(), Zekx.Zu(this.Zv.ZT(), this.Zv.ZD(), (byte)2, this.ZZ), paramZlou.ZA, paramZlou.Zr, paramZlou.Zx, paramZs66.parameterType, arrayOfInt, this.ZZ);
    return new Zk9i(arrayOfByte, arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
  }
  
  private static boolean lambda$addSwitchedBodyParameterLocationInsertionPoints$11(Zlou paramZlou1, Zlou paramZlou2) {
    return Objects.equals(paramZlou2.Zr, paramZlou1.Zr);
  }
  
  private static boolean lambda$addSwitchedBodyParameterLocationInsertionPoints$10(Zlou paramZlou1, Zlou paramZlou2) {
    return Objects.equals(paramZlou2.ZA, paramZlou1.ZA);
  }
  
  private static boolean lambda$addSwitchedBodyParameterLocationInsertionPoints$9(Zlou paramZlou) {
    return (paramZlou.Zx == Zrdu.URL_PARAM);
  }
  
  private static boolean lambda$addUrlFoldersInsertionPoints$8(Zlou paramZlou) {
    return (paramZlou.Zx == Zrdu.PATH_FOLDER_PARAM);
  }
  
  private static Zefx lambda$addNewReferHeaderInsertionPoint$7(String paramString1, String paramString2, Zefx paramZefx) {
    return paramZefx.ZQ(paramString1, paramString2);
  }
  
  private Zefx lambda$addPhpFileRequestInsertionPoint$6(Zefx paramZefx) {
    return paramZefx.ZU(Zkb.ZG(this.Zv.ZF().Zd4()) + Zkb.ZG(this.Zv.ZF().Zd4()));
  }
  
  private static boolean lambda$addNewParameterNameInsertionPoint$5(Zrdu paramZrdu, Zlou paramZlou) {
    return (paramZlou.Zx == paramZrdu && "1".equals(paramZlou.ZA) && "1".equals(paramZlou.Zr));
  }
  
  private static byte[] lambda$buildNestedInsertionPoint$4(Zlou paramZlou, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = Zkb.Zy("\"" + paramZlou.Zr + "\"");
    return Zmw.Zb(paramArrayOfbyte, paramZlou.ZE, paramZlou.ZV, arrayOfByte);
  }
  
  private Zefx lambda$addStandaloneTagInsertionPoint$3(int paramInt1, int paramInt2, byte[] paramArrayOfbyte, Zefx paramZefx) {
    byte[] arrayOfByte = Zmw.Zb(this.Zv.Zw(), paramInt1 - this.Zv.ZR(), paramInt2 - this.Zv.ZR(), paramArrayOfbyte);
    return this.Zv.ZZ(arrayOfByte);
  }
  
  private Zefx lambda$addUrlAndBodyParameterInsertionPoints$2(Zlou paramZlou, Zefx paramZefx) {
    byte[] arrayOfByte1 = Zkb.Zy("\"" + paramZlou.Zr + "\"");
    byte[] arrayOfByte2 = Zmw.Zb(this.Zv.Zw(), paramZlou.ZE - this.Zv.ZR(), paramZlou.ZV - this.Zv.ZR(), arrayOfByte1);
    return this.Zv.ZZ(arrayOfByte2);
  }
  
  private static boolean lambda$addUrlFilenameInsertionPoint$1(Zlou paramZlou) {
    return (paramZlou.Zx == Zrdu.PATH_FILENAME_PARAM);
  }
  
  private static Zefx lambda$new$0(Zefx paramZefx) {
    return Ztvk.Zv.Zv(paramZefx);
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 't,`­üX\\nGôéÐóÊ°?\\bÒuS3Þ¸Ä¸V5ÿ´_½EP'ý7Uûccâ!ÿ<¶²}îÏ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #13
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc '\\n£Áùßm ã\\n;'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #7
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #94
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
    //   128: putstatic burp/Zzp6.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zzp6.b : [Ljava/lang/String;
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
    //   212: bipush #26
    //   214: goto -> 244
    //   217: bipush #126
    //   219: goto -> 244
    //   222: bipush #12
    //   224: goto -> 244
    //   227: bipush #123
    //   229: goto -> 244
    //   232: bipush #43
    //   234: goto -> 244
    //   237: bipush #112
    //   239: goto -> 244
    //   242: bipush #40
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: new burp/Zruo
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Zzp6.Zl : Lburp/Zr_4;
    //   310: sipush #-12537
    //   313: sipush #15420
    //   316: invokestatic a : (II)Ljava/lang/String;
    //   319: invokevirtual getBytes : ()[B
    //   322: iconst_0
    //   323: iconst_0
    //   324: invokestatic ZJ : ([BZZ)Lburp/Zzrd;
    //   327: putstatic burp/Zzp6.ZM : Lburp/Zzrd;
    //   330: sipush #-12536
    //   333: sipush #13524
    //   336: invokestatic a : (II)Ljava/lang/String;
    //   339: invokevirtual getBytes : ()[B
    //   342: iconst_1
    //   343: iconst_0
    //   344: invokestatic ZJ : ([BZZ)Lburp/Zzrd;
    //   347: putstatic burp/Zzp6.Zc : Lburp/Zzrd;
    //   350: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCF02) & 0xFFFF;
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
      byte b1 = 55;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzp6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */