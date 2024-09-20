package burp;

import java.util.Iterator;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zsy;

public class Zrll implements Zm9n {
  private static final byte[][] ZS;
  
  private static final byte[][] ZC;
  
  private static final byte[][] Zf;
  
  private static final byte[][] Zd;
  
  private static final byte[][] Z_;
  
  private final Zmhe Zq;
  
  private final Ze3n Zw;
  
  private final Zxs7 Zr;
  
  private final Zkq4 Zo;
  
  private final Zsy ZA;
  
  private final Zbjl Zh;
  
  private byte[] ZD;
  
  private Zs2i Zx;
  
  private final Zlk4 ZM;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrll(Zmhe paramZmhe, Zbjl paramZbjl, Ze3n paramZe3n, Zxs7 paramZxs7, Zkq4 paramZkq4, Zsy paramZsy) {
    this.Zq = paramZmhe;
    this.Zh = paramZbjl;
    this.Zw = paramZe3n;
    this.Zr = paramZxs7;
    this.Zo = paramZkq4;
    this.ZA = paramZsy;
    this.ZM = ZO();
  }
  
  private Zlk4 ZO() {
    // Byte code:
    //   0: invokestatic ZJ : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zo : Lburp/Zkq4;
    //   8: invokeinterface ZqT : ()Lburp/Zlk4;
    //   13: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   16: invokevirtual ZH : (Lburp/Zlk4;)Z
    //   19: ifeq -> 30
    //   22: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   25: areturn
    //   26: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   29: athrow
    //   30: aload_0
    //   31: getfield Zr : Lburp/Zxs7;
    //   34: invokeinterface Z_ : ()Lburp/Zs66;
    //   39: getstatic burp/Zs66.PATH_FOLDER_PARAM : Lburp/Zs66;
    //   42: if_acmpne -> 53
    //   45: getstatic burp/Zlk4.FAST : Lburp/Zlk4;
    //   48: areturn
    //   49: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   52: athrow
    //   53: aload_0
    //   54: getfield Zr : Lburp/Zxs7;
    //   57: invokeinterface Z_ : ()Lburp/Zs66;
    //   62: getstatic burp/Zs66.HEADER : Lburp/Zs66;
    //   65: if_acmpne -> 200
    //   68: aload_0
    //   69: getfield Zr : Lburp/Zxs7;
    //   72: invokeinterface Zf : ()Ljava/lang/String;
    //   77: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   80: astore_2
    //   81: iconst_m1
    //   82: istore_3
    //   83: aload_2
    //   84: invokevirtual hashCode : ()I
    //   87: lookupswitch default -> 166, 486342275 -> 112, 1085069613 -> 141
    //   112: aload_2
    //   113: sipush #24291
    //   116: sipush #-27613
    //   119: invokestatic a : (II)Ljava/lang/String;
    //   122: invokevirtual equals : (Ljava/lang/Object;)Z
    //   125: ifeq -> 166
    //   128: goto -> 135
    //   131: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   134: athrow
    //   135: iconst_0
    //   136: istore_3
    //   137: iload_1
    //   138: ifne -> 166
    //   141: aload_2
    //   142: sipush #24294
    //   145: sipush #-30077
    //   148: invokestatic a : (II)Ljava/lang/String;
    //   151: invokevirtual equals : (Ljava/lang/Object;)Z
    //   154: ifeq -> 166
    //   157: goto -> 164
    //   160: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   163: athrow
    //   164: iconst_1
    //   165: istore_3
    //   166: iload_3
    //   167: lookupswitch default -> 200, 0 -> 192, 1 -> 192
    //   192: getstatic burp/Zlk4.FAST : Lburp/Zlk4;
    //   195: areturn
    //   196: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   199: athrow
    //   200: aload_0
    //   201: getfield Zo : Lburp/Zkq4;
    //   204: invokeinterface ZqT : ()Lburp/Zlk4;
    //   209: areturn
    // Exception table:
    //   from	to	target	type
    //   4	26	26	burp/Zscd
    //   30	49	49	burp/Zscd
    //   83	128	131	burp/Zscd
    //   137	157	160	burp/Zscd
    //   166	196	196	burp/Zscd
  }
  
  public Zbsl Zp() {
    return Zbsl.APIP_OsCommandInjection;
  }
  
  public boolean Zf() {
    try {
      switch (Zbib.Zo[this.Zr.Z_().ordinal()]) {
        case 1:
        case 2:
        case 3:
          return false;
      } 
    } catch (Zscd zscd) {
      throw a(null);
    } 
    try {
      if (this.Zr.Zq(this.Zo))
        return false; 
    } catch (Zscd zscd) {
      throw a(null);
    } 
    String str = this.Zr.ZI();
    try {
      if (!a(24290, 30949).equalsIgnoreCase(str))
        try {
          if (!a(24297, 17911).equalsIgnoreCase(str));
        } catch (Zscd zscd) {
          throw a(null);
        }  
    } catch (Zscd zscd) {
      throw a(null);
    } 
    return false;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    int i = Zlf1.Zr();
    try {
      if (this.Zh.ZG())
        try {
          if (!this.Zh.ZB().Zi())
            try {
              if (this.Zo.ZS(Zzu2.OS_COMMAND_INJECTION, Zr3z.COLLABORATOR_BASED))
                ZJ(paramZrj.Zg()); 
            } catch (Zscd zscd) {
              throw a(null);
            }  
        } catch (Zscd zscd) {
          throw a(null);
        }  
    } catch (Zscd zscd) {
      throw a(null);
    } 
    try {
    
    } catch (Zscd zscd) {
      throw a(null);
    } 
    Zx_5 zx_5 = this.Zo.ZS(Zzu2.OS_COMMAND_INJECTION, Zr3z.OS_CMD_ECHO_BASED) ? Zr() : null;
    try {
      try {
      
      } catch (Zscd zscd) {
        throw a(null);
      } 
      Zx_5 zx_51 = this.Zo.ZS(Zzu2.OS_COMMAND_INJECTION, Zr3z.TIME_BASED) ? (new Zxon(this.Zq, this.Zw, this.Zw.Zc()[0].longValue(), this.Zr, this.Zo, this.ZM)).Z_() : null;
      Zsqx<Zrdb> zsqx = Zy(zx_5, zx_51);
      try {
        if (zsqx != null)
          paramZz4_.Zz(zsqx); 
      } catch (Zscd zscd) {
        throw a(null);
      } 
    } catch (Zscd zscd) {
      try {
        Zah.Zl(zscd, Zk_.IGNORED);
        if (zx_5 != null)
          paramZz4_.Zz(zx_5); 
      } catch (Zscd zscd1) {
        throw a(null);
      } 
      throw zscd;
    } 
    try {
      if (i != 0)
        Zbqc.Zr(new Zbqc[2]); 
    } catch (Zscd zscd) {
      throw a(null);
    } 
  }
  
  private static Zsqx<Zrdb> Zy(Zx_5 paramZx_51, Zx_5 paramZx_52) {
    try {
      if (paramZx_51 != null)
        try {
          if (paramZx_52 != null) {
            paramZx_51.ZM(paramZx_52);
            return paramZx_51;
          } 
        } catch (Zscd zscd) {
          throw a(null);
        }  
    } catch (Zscd zscd) {
      throw a(null);
    } 
    try {
    
    } catch (Zscd zscd) {
      throw a(null);
    } 
    return (paramZx_51 != null) ? paramZx_51 : paramZx_52;
  }
  
  private void ZJ(int paramInt) {
    Zlv_ zlv_ = new Zlv_(this.Zo, this.Zr, paramInt, this.Zw.ZM().Zgv(), this.Zh);
    Iterator<Zewx> iterator = zlv_.ZK().iterator();
    int i = Zlf1.ZJ();
    while (iterator.hasNext()) {
      Zewx zewx = iterator.next();
      try {
        if (zewx.ZA(this.Zh))
          this.Zq.ZK(Zri7.ZJ(new Zrrb(zewx.Zh(), zewx.ZY())), Zlp5.Zc().Zd(true)); 
      } catch (Zscd zscd) {
        throw a(null);
      } 
      if (i == 0)
        break; 
    } 
  }
  
  private Zx_5 Zr() {
    null = ZP();
    try {
      if (null != null)
        return null; 
    } catch (Zscd zscd) {
      throw a(null);
    } 
    null = Zb();
    try {
      if (null != null)
        return null; 
    } catch (Zscd zscd) {
      throw a(null);
    } 
    return Zt();
  }
  
  private Zx_5 ZP() {
    return Zn(a(24295, 1382), Zf, 1);
  }
  
  private Zx_5 Zb() {
    try {
      if (Za())
        return null; 
    } catch (Zscd zscd) {
      throw a(null);
    } 
    Zx_5 zx_5 = Zn(a(24296, 29404), ZS, 2);
    try {
      if (zx_5 != null)
        return zx_5; 
    } catch (Zscd zscd) {
      throw a(null);
    } 
    zx_5 = Zn(a(24288, 24695), Zf, 1);
    try {
      if (zx_5 != null)
        return zx_5; 
    } catch (Zscd zscd) {
      throw a(null);
    } 
    return Zn(a(24293, 32103), ZC, 1);
  }
  
  private Zx_5 Zt() {
    try {
      if (Z_())
        return null; 
    } catch (Zscd zscd) {
      throw a(null);
    } 
    Zx_5 zx_5 = Zn(a(24300, -2317), Zd, 4);
    try {
      if (zx_5 != null)
        return zx_5; 
    } catch (Zscd zscd) {
      throw a(null);
    } 
    return Zn(a(24292, 4623), Z_, 8);
  }
  
  private Zx_5 Zn(String paramString, byte[][] paramArrayOfbyte, int paramInt) {
    String str = this.ZA.Zi().ZG().ZK(10) + " " + this.ZA.Zi().ZG().ZK(10);
    Zzud zzud = Zl(paramString, str);
    byte[] arrayOfByte1 = Zkb.Zy(str);
    byte[] arrayOfByte2 = zzud.ZT().Za().ZiD();
    int i = Zlf1.Zr();
    try {
      if (ZZ(paramString, arrayOfByte2, arrayOfByte1))
        return null; 
    } catch (Zscd zscd) {
      throw a(null);
    } 
    int j = 0;
    while (j < arrayOfByte2.length) {
      j = Zli.Zw(arrayOfByte2, arrayOfByte1, j, arrayOfByte2.length);
      try {
        if (j == -1)
          break; 
      } catch (Zscd zscd) {
        throw a(null);
      } 
      int k = j - 10;
      if (k < 0)
        k = 0; 
      String str1 = Zkb.Zo(arrayOfByte2, k, j - k).toLowerCase();
      try {
        if (!str1.contains(a(24302, 27749)))
          try {
            if (ZL(paramArrayOfbyte, arrayOfByte1, arrayOfByte2, j))
              return ZH(arrayOfByte1, arrayOfByte2, j, paramInt); 
          } catch (Zscd zscd) {
            throw a(null);
          }  
      } catch (Zscd zscd) {
        throw a(null);
      } 
      j++;
      if (i != 0)
        break; 
    } 
    return null;
  }
  
  private boolean ZZ(String paramString, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    int i = Zlf1.Zr();
    int j = 0;
    try {
      if (!paramString.endsWith(a(24298, -17395)))
        return false; 
    } catch (Zscd zscd) {
      throw a(null);
    } 
    while (j < paramArrayOfbyte1.length) {
      j = Zli.Zw(paramArrayOfbyte1, paramArrayOfbyte2, j, paramArrayOfbyte1.length);
      try {
        if (j == -1)
          return false; 
      } catch (Zscd zscd) {
        throw a(null);
      } 
      int k = ZC(paramArrayOfbyte2, j, paramArrayOfbyte1);
      try {
        if (k == -1)
          return false; 
      } catch (Zscd zscd) {
        throw a(null);
      } 
      String str = Zkb.Zo(paramArrayOfbyte1, j, k).toLowerCase();
      try {
        if (str.contains(a(24298, -17395)))
          return true; 
      } catch (Zscd zscd) {
        throw a(null);
      } 
      j++;
      if (i != 0)
        break; 
    } 
    return false;
  }
  
  private int ZC(byte[] paramArrayOfbyte1, int paramInt, byte[] paramArrayOfbyte2) {
    byte b = 10;
    int i = a(24299, -23490).length() + a(24303, 24858).length() + Zkb.ZG(paramArrayOfbyte1).length() + b;
    try {
      if (i + paramInt >= paramArrayOfbyte2.length) {
        try {
          if (paramInt < paramArrayOfbyte2.length)
            return paramArrayOfbyte2.length - paramInt; 
        } catch (Zscd zscd) {
          throw a(null);
        } 
        return -1;
      } 
    } catch (Zscd zscd) {
      throw a(null);
    } 
    return i;
  }
  
  private boolean ZL(byte[][] paramArrayOfbyte, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #6
    //   3: invokestatic Zr : ()I
    //   6: aload_1
    //   7: astore #7
    //   9: aload #7
    //   11: arraylength
    //   12: istore #8
    //   14: iconst_0
    //   15: istore #9
    //   17: istore #5
    //   19: iload #9
    //   21: iload #8
    //   23: if_icmpge -> 71
    //   26: aload #7
    //   28: iload #9
    //   30: aaload
    //   31: astore #10
    //   33: aload_3
    //   34: aload #10
    //   36: iconst_0
    //   37: iload #4
    //   39: aload_2
    //   40: arraylength
    //   41: iadd
    //   42: invokestatic ZC : ([B[BZI)Z
    //   45: ifeq -> 56
    //   48: iconst_1
    //   49: istore #6
    //   51: iload #5
    //   53: ifeq -> 71
    //   56: iinc #9, 1
    //   59: iload #5
    //   61: ifeq -> 19
    //   64: goto -> 71
    //   67: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   70: athrow
    //   71: iload #6
    //   73: ifne -> 84
    //   76: iconst_1
    //   77: goto -> 85
    //   80: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   83: athrow
    //   84: iconst_0
    //   85: ireturn
    // Exception table:
    //   from	to	target	type
    //   51	64	67	burp/Zscd
    //   71	80	80	burp/Zscd
  }
  
  private Zzud Zl(String paramString1, String paramString2) {
    String str1 = paramString1.replace(a(24301, 8685), paramString2);
    String str2 = Zv85.Zz(str1, 0);
    this.ZD = Zkb.Zy(str2);
    Zlvf zlvf = this.Zq.ZK(Zri7.ZJ(new Zrrb(this.ZD, (byte)1)), Zlp5.Zc().Zd(false));
    this.Zx = zlvf.ZY();
    return zlvf.ZM();
  }
  
  private Zx_5 ZH(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    Zvow zvow = this.Zw.ZI().Zp(this.Zx.ZE()).ZK(this.Zx.ZO()).ZK(paramArrayOfbyte2).Zf(Zrlp.Zj(paramInt1, paramInt1 + paramArrayOfbyte1.length));
    return Zg58.ZK(this.Zw.Za(), this.Zw.ZN(), zvow, this.ZD, paramInt2, this.Zr);
  }
  
  private boolean Za() {
    return this.ZM.ZO(Zlk4.NORMAL);
  }
  
  private boolean Z_() {
    return this.ZM.ZO(Zlk4.THOROUGH);
  }
  
  public String toString() {
    return Zp().name();
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'I*C'wFo\\t~.R¨î{0ð­[d2ìäLÞ\\t]»µ-[:ÝëUXcY|ÓïfzÈ,>Ëõì®9yôj×´TuÖËvÞ>ê¥r¶? b»§ 4Ù¿í/ð\\tÄ£æM16¼'àíyö çÿìg¦¢¹A½'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #18
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
    //   67: ldc 'h9òü2\\fRÿË&Êé]*Í'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #10
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #105
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
    //   128: putstatic burp/Zrll.a : [Ljava/lang/String;
    //   131: bipush #15
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zrll.b : [Ljava/lang/String;
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
    //   217: bipush #111
    //   219: goto -> 244
    //   222: bipush #126
    //   224: goto -> 244
    //   227: bipush #113
    //   229: goto -> 244
    //   232: bipush #91
    //   234: goto -> 244
    //   237: bipush #85
    //   239: goto -> 244
    //   242: bipush #113
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
    //   300: iconst_1
    //   301: anewarray [B
    //   304: dup
    //   305: iconst_0
    //   306: iconst_1
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #38
    //   313: bastore
    //   314: aastore
    //   315: putstatic burp/Zrll.ZS : [[B
    //   318: iconst_1
    //   319: anewarray [B
    //   322: dup
    //   323: iconst_0
    //   324: iconst_1
    //   325: newarray byte
    //   327: dup
    //   328: iconst_0
    //   329: bipush #35
    //   331: bastore
    //   332: aastore
    //   333: putstatic burp/Zrll.ZC : [[B
    //   336: iconst_4
    //   337: anewarray [B
    //   340: dup
    //   341: iconst_0
    //   342: iconst_1
    //   343: newarray byte
    //   345: dup
    //   346: iconst_0
    //   347: bipush #124
    //   349: bastore
    //   350: aastore
    //   351: dup
    //   352: iconst_1
    //   353: bipush #6
    //   355: newarray byte
    //   357: dup
    //   358: iconst_0
    //   359: bipush #38
    //   361: bastore
    //   362: dup
    //   363: iconst_1
    //   364: bipush #35
    //   366: bastore
    //   367: dup
    //   368: iconst_2
    //   369: bipush #49
    //   371: bastore
    //   372: dup
    //   373: iconst_3
    //   374: bipush #50
    //   376: bastore
    //   377: dup
    //   378: iconst_4
    //   379: bipush #52
    //   381: bastore
    //   382: dup
    //   383: iconst_5
    //   384: bipush #59
    //   386: bastore
    //   387: aastore
    //   388: dup
    //   389: iconst_2
    //   390: bipush #6
    //   392: newarray byte
    //   394: dup
    //   395: iconst_0
    //   396: bipush #38
    //   398: bastore
    //   399: dup
    //   400: iconst_1
    //   401: bipush #35
    //   403: bastore
    //   404: dup
    //   405: iconst_2
    //   406: bipush #120
    //   408: bastore
    //   409: dup
    //   410: iconst_3
    //   411: bipush #55
    //   413: bastore
    //   414: dup
    //   415: iconst_4
    //   416: bipush #99
    //   418: bastore
    //   419: dup
    //   420: iconst_5
    //   421: bipush #59
    //   423: bastore
    //   424: aastore
    //   425: dup
    //   426: iconst_3
    //   427: bipush #6
    //   429: newarray byte
    //   431: dup
    //   432: iconst_0
    //   433: bipush #38
    //   435: bastore
    //   436: dup
    //   437: iconst_1
    //   438: bipush #35
    //   440: bastore
    //   441: dup
    //   442: iconst_2
    //   443: bipush #88
    //   445: bastore
    //   446: dup
    //   447: iconst_3
    //   448: bipush #55
    //   450: bastore
    //   451: dup
    //   452: iconst_4
    //   453: bipush #99
    //   455: bastore
    //   456: dup
    //   457: iconst_5
    //   458: bipush #59
    //   460: bastore
    //   461: aastore
    //   462: putstatic burp/Zrll.Zf : [[B
    //   465: iconst_4
    //   466: anewarray [B
    //   469: dup
    //   470: iconst_0
    //   471: iconst_1
    //   472: newarray byte
    //   474: dup
    //   475: iconst_0
    //   476: bipush #59
    //   478: bastore
    //   479: aastore
    //   480: dup
    //   481: iconst_1
    //   482: iconst_5
    //   483: newarray byte
    //   485: dup
    //   486: iconst_0
    //   487: bipush #38
    //   489: bastore
    //   490: dup
    //   491: iconst_1
    //   492: bipush #35
    //   494: bastore
    //   495: dup
    //   496: iconst_2
    //   497: bipush #53
    //   499: bastore
    //   500: dup
    //   501: iconst_3
    //   502: bipush #57
    //   504: bastore
    //   505: dup
    //   506: iconst_4
    //   507: bipush #59
    //   509: bastore
    //   510: aastore
    //   511: dup
    //   512: iconst_2
    //   513: bipush #6
    //   515: newarray byte
    //   517: dup
    //   518: iconst_0
    //   519: bipush #38
    //   521: bastore
    //   522: dup
    //   523: iconst_1
    //   524: bipush #35
    //   526: bastore
    //   527: dup
    //   528: iconst_2
    //   529: bipush #120
    //   531: bastore
    //   532: dup
    //   533: iconst_3
    //   534: bipush #51
    //   536: bastore
    //   537: dup
    //   538: iconst_4
    //   539: bipush #98
    //   541: bastore
    //   542: dup
    //   543: iconst_5
    //   544: bipush #59
    //   546: bastore
    //   547: aastore
    //   548: dup
    //   549: iconst_3
    //   550: bipush #6
    //   552: newarray byte
    //   554: dup
    //   555: iconst_0
    //   556: bipush #38
    //   558: bastore
    //   559: dup
    //   560: iconst_1
    //   561: bipush #35
    //   563: bastore
    //   564: dup
    //   565: iconst_2
    //   566: bipush #88
    //   568: bastore
    //   569: dup
    //   570: iconst_3
    //   571: bipush #51
    //   573: bastore
    //   574: dup
    //   575: iconst_4
    //   576: bipush #98
    //   578: bastore
    //   579: dup
    //   580: iconst_5
    //   581: bipush #59
    //   583: bastore
    //   584: aastore
    //   585: putstatic burp/Zrll.Zd : [[B
    //   588: iconst_4
    //   589: anewarray [B
    //   592: dup
    //   593: iconst_0
    //   594: iconst_1
    //   595: newarray byte
    //   597: dup
    //   598: iconst_0
    //   599: bipush #10
    //   601: bastore
    //   602: aastore
    //   603: dup
    //   604: iconst_1
    //   605: iconst_5
    //   606: newarray byte
    //   608: dup
    //   609: iconst_0
    //   610: bipush #38
    //   612: bastore
    //   613: dup
    //   614: iconst_1
    //   615: bipush #35
    //   617: bastore
    //   618: dup
    //   619: iconst_2
    //   620: bipush #48
    //   622: bastore
    //   623: dup
    //   624: iconst_3
    //   625: bipush #48
    //   627: bastore
    //   628: dup
    //   629: iconst_4
    //   630: bipush #59
    //   632: bastore
    //   633: aastore
    //   634: dup
    //   635: iconst_2
    //   636: bipush #6
    //   638: newarray byte
    //   640: dup
    //   641: iconst_0
    //   642: bipush #38
    //   644: bastore
    //   645: dup
    //   646: iconst_1
    //   647: bipush #35
    //   649: bastore
    //   650: dup
    //   651: iconst_2
    //   652: bipush #120
    //   654: bastore
    //   655: dup
    //   656: iconst_3
    //   657: bipush #48
    //   659: bastore
    //   660: dup
    //   661: iconst_4
    //   662: bipush #97
    //   664: bastore
    //   665: dup
    //   666: iconst_5
    //   667: bipush #59
    //   669: bastore
    //   670: aastore
    //   671: dup
    //   672: iconst_3
    //   673: bipush #6
    //   675: newarray byte
    //   677: dup
    //   678: iconst_0
    //   679: bipush #38
    //   681: bastore
    //   682: dup
    //   683: iconst_1
    //   684: bipush #35
    //   686: bastore
    //   687: dup
    //   688: iconst_2
    //   689: bipush #88
    //   691: bastore
    //   692: dup
    //   693: iconst_3
    //   694: bipush #48
    //   696: bastore
    //   697: dup
    //   698: iconst_4
    //   699: bipush #97
    //   701: bastore
    //   702: dup
    //   703: iconst_5
    //   704: bipush #59
    //   706: bastore
    //   707: aastore
    //   708: putstatic burp/Zrll.Z_ : [[B
    //   711: return
  }
  
  private static Zscd a(Zscd paramZscd) {
    return paramZscd;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5EEE) & 0xFFFF;
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
      char c = 'È';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrll.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */