package burp;

import java.util.Collection;
import java.util.Objects;
import java.util.function.Function;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zgb {
  private final Ztew Za;
  
  private final Zlof Zd;
  
  private final Zkit Zq;
  
  private final Zkit ZW;
  
  private final Ze24 Zy;
  
  private final Zl2m ZJ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zgb(Ztew paramZtew, Zlof paramZlof, Zkit paramZkit1, Zkit paramZkit2, Ze24 paramZe24, Zl2m paramZl2m) {
    this.Za = paramZtew;
    this.Zd = paramZlof;
    this.Zq = paramZkit1;
    this.ZW = paramZkit2;
    this.Zy = paramZe24;
    this.ZJ = paramZl2m;
  }
  
  <T extends Zgpi> Zefg<T> Zt(Zefg<T> paramZefg, Zeu4<Zgpi> paramZeu4) {
    Zefg<Zgpi> zefg;
    try {
      if (Zszd.ZL)
        try {
          if (this.Zq != null)
            ZP((Zx2h)paramZefg); 
        } catch (Throwable throwable) {
          throw a(null);
        }  
    } catch (Throwable throwable) {
      throw a(null);
    } 
    int i = paramZefg.size();
    try {
      if (i * 8 < 0) {
        this.Zy.Zr();
        this.Zy.Zb(paramZefg, Zx2v.Zq);
        return null;
      } 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      zefg = Zkk.Zl(this.ZW, paramZeu4, i);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      this.Zd.ZK(throwable);
      this.Zy.Zb(paramZefg, Zx2v.Zq);
      return null;
    } 
    this.Zy.Zb(paramZefg, zefg);
    Zx(paramZefg, (Zefg)zefg);
    return (Zefg)zefg;
  }
  
  <T extends Zgpi> Zefg<T> ZQ(Zefg<T> paramZefg, int paramInt, Zeu4<Zgpi> paramZeu4) {
    Zefg<Zgpi> zefg;
    try {
      if (Zszd.ZL)
        try {
          if (this.Zq != null)
            ZY((Zx29)paramZefg); 
        } catch (Throwable throwable) {
          throw a(null);
        }  
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      if (paramInt * 8 < 0) {
        this.Zy.Zr();
        this.Zy.Zb(paramZefg, Zx2v.Zq);
        return null;
      } 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      zefg = Zkk.Zy(this.ZW, paramZeu4, paramInt);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      this.Zd.ZK(throwable);
      this.Zy.Zb(paramZefg, Zx2v.Zq);
      return null;
    } 
    this.Zy.Zb(paramZefg, zefg);
    Zx(paramZefg, (Zefg)zefg);
    return (Zefg)zefg;
  }
  
  Zmfv Zu(Zmfv paramZmfv) {
    Zmfv zmfv;
    try {
      if (Zszd.ZL)
        try {
          if (this.Zq != null)
            ZH((Zx2n)paramZmfv); 
        } catch (Throwable throwable) {
          throw a(null);
        }  
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      zmfv = this.ZW.<Zmfv>ZH(new Zslb(paramZmfv.size()));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      this.Zd.ZK(throwable);
      this.Zy.Zb(paramZmfv, Zx2v.Zq);
      return null;
    } 
    this.Zy.Zb(paramZmfv, zmfv);
    Objects.requireNonNull(paramZmfv);
    Zk(paramZmfv, zmfv, paramZmfv::get);
    return zmfv;
  }
  
  Zg06 Zo(Zg06 paramZg06) {
    Zg06 zg06;
    try {
      if (Zszd.ZL)
        try {
          if (this.Zq != null)
            Z_((Zx22)paramZg06); 
        } catch (Throwable throwable) {
          throw a(null);
        }  
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      zg06 = this.ZW.<Zg06>ZH(new Zz32(paramZg06.size()));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      this.Zd.ZK(throwable);
      this.Zy.Zb(paramZg06, Zx2v.Zq);
      return null;
    } 
    this.Zy.Zb(paramZg06, zg06);
    Objects.requireNonNull(paramZg06);
    Zk(paramZg06, zg06, paramZg06::get);
    return zg06;
  }
  
  Zmg Zv(Zmg paramZmg) {
    Zmg zmg;
    try {
      if (Zszd.ZL)
        try {
          if (this.Zq != null)
            ZE((Zx24)paramZmg); 
        } catch (Throwable throwable) {
          throw a(null);
        }  
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      zmg = this.ZW.<Zmg>ZH(new Zkbp(paramZmg.size()));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      this.Zd.ZK(throwable);
      this.Zy.Zb(paramZmg, Zx2v.Zq);
      return null;
    } 
    this.Zy.Zb(paramZmg, zmg);
    Objects.requireNonNull(paramZmg);
    Zk(paramZmg, zmg, paramZmg::get);
    return zmg;
  }
  
  Zmg ZA(Zmg paramZmg, int paramInt) {
    Zmg zmg;
    try {
      if (Zszd.ZL)
        try {
          if (this.Zq != null)
            ZK((Zx20)paramZmg); 
        } catch (Throwable throwable) {
          throw a(null);
        }  
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      zmg = this.ZW.<Zmg>ZH(new Zk7y(paramInt));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      this.Zd.ZK(throwable);
      this.Zy.Zb(paramZmg, Zx2v.Zq);
      return null;
    } 
    this.Zy.Zb(paramZmg, zmg);
    Objects.requireNonNull(paramZmg);
    Zk(paramZmg, zmg, paramZmg::get);
    return zmg;
  }
  
  Zxsn Zz(Zxsn paramZxsn) {
    Zxsn zxsn;
    try {
      if (Zszd.ZL)
        try {
          if (this.Zq != null)
            Zb((Zx2i)paramZxsn); 
        } catch (Throwable throwable) {
          throw a(null);
        }  
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      zxsn = this.ZW.<Zxsn>ZH(new Zl29(paramZxsn.size()));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.PROCESSED_LATER);
      this.Zd.ZK(throwable);
      this.Zy.Zb(paramZxsn, Zx2v.Zq);
      return null;
    } 
    this.Zy.Zb(paramZxsn, zxsn);
    Objects.requireNonNull(paramZxsn);
    Zk(paramZxsn, zxsn, paramZxsn::get);
    return zxsn;
  }
  
  private <T extends Zgpi> void Zx(Zefg<T> paramZefg1, Zefg<T> paramZefg2) {
    // Byte code:
    //   0: invokestatic ZZ : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: iconst_0
    //   5: istore #4
    //   7: iload #4
    //   9: aload_1
    //   10: invokeinterface size : ()I
    //   15: if_icmpge -> 172
    //   18: aload_1
    //   19: iload #4
    //   21: invokeinterface get : (I)Ljava/lang/Object;
    //   26: checkcast burp/Zgpi
    //   29: astore #5
    //   31: aload #5
    //   33: ifnonnull -> 55
    //   36: aload_2
    //   37: aconst_null
    //   38: invokeinterface add : (Ljava/lang/Object;)Z
    //   43: pop
    //   44: aload_3
    //   45: ifnonnull -> 104
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   54: athrow
    //   55: aload_0
    //   56: getfield Za : Lburp/Ztew;
    //   59: aload #5
    //   61: invokevirtual Zc : (Lburp/Zgpi;)Lburp/Zgpi;
    //   64: astore #6
    //   66: aload #6
    //   68: ifnull -> 80
    //   71: aload_2
    //   72: aload #6
    //   74: invokeinterface add : (Ljava/lang/Object;)Z
    //   79: pop
    //   80: goto -> 104
    //   83: astore #7
    //   85: aload #7
    //   87: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   90: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   93: aload_0
    //   94: getfield Zd : Lburp/Zlof;
    //   97: aload #7
    //   99: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   104: goto -> 165
    //   107: astore #5
    //   109: aload #5
    //   111: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   114: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   117: aload_0
    //   118: getfield Zd : Lburp/Zlof;
    //   121: aload #5
    //   123: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   128: goto -> 172
    //   131: astore #5
    //   133: aload #5
    //   135: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   138: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   141: aload #5
    //   143: athrow
    //   144: astore #5
    //   146: aload #5
    //   148: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   151: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   154: aload_0
    //   155: getfield Zd : Lburp/Zlof;
    //   158: aload #5
    //   160: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   165: iinc #4, 1
    //   168: aload_3
    //   169: ifnonnull -> 7
    //   172: goto -> 209
    //   175: astore #4
    //   177: aload #4
    //   179: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   182: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   185: aload #4
    //   187: athrow
    //   188: astore #4
    //   190: aload #4
    //   192: getstatic net/portswigger/Zk_.PROCESSED_LATER : Lnet/portswigger/Zk_;
    //   195: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   198: aload_0
    //   199: getfield Zd : Lburp/Zlof;
    //   202: aload #4
    //   204: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   209: return
    // Exception table:
    //   from	to	target	type
    //   4	172	175	burp/Ztgq
    //   4	172	175	burp/Zb_f
    //   4	172	188	java/lang/Throwable
    //   18	104	107	java/lang/IndexOutOfBoundsException
    //   18	104	131	burp/Ztgq
    //   18	104	131	burp/Zb_f
    //   18	104	144	java/lang/Throwable
    //   31	48	51	java/lang/Throwable
    //   66	80	83	java/lang/Throwable
  }
  
  private <T> void Zk(Collection<T> paramCollection1, Collection<T> paramCollection2, Function<Integer, T> paramFunction) {
    byte b = 0;
    String[] arrayOfString = Ztgq.ZZ();
    while (b < paramCollection1.size()) {
      T t;
      try {
        t = paramFunction.apply(Integer.valueOf(b));
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.PROCESSED_LATER);
        this.Zd.ZG(throwable);
        break;
      } 
      try {
        paramCollection2.add(t);
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.PROCESSED_LATER);
        this.Zd.ZK(throwable);
      } 
      b++;
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private void ZP(Zx2h paramZx2h) {
    try {
      Zgpi zgpi = (Zgpi)this.Zq.ZA(paramZx2h, ((Zl_p)paramZx2h.ZF()).ZU);
      this.ZJ.ZU(zgpi);
    } catch (Exception exception) {
      Zah.ZU(exception, a(6788, -18515), Zk_.UNEXPECTED);
    } 
  }
  
  private void ZY(Zx29<?> paramZx29) {
    String[] arrayOfString = Ztgq.ZZ();
    try {
      Zx2h zx2h = this.Zq.<Zx2h>ZJ(paramZx29, ((Zkdo)paramZx29.ZF()).Zn);
      this.ZJ.ZU(zx2h);
      Zgpi zgpi = (Zgpi)this.Zq.ZA(zx2h, ((Zl_p)zx2h.ZF()).ZU);
      this.ZJ.ZU(zgpi);
      for (Zgpi zgpi1 : zx2h) {
        try {
          if (zgpi1 != null)
            this.ZJ.ZU(zgpi1); 
        } catch (Exception exception) {
          throw a(null);
        } 
        if (arrayOfString == null)
          break; 
      } 
    } catch (Exception exception) {
      Zah.ZU(exception, a(6791, -2934), Zk_.UNEXPECTED);
    } 
  }
  
  private void ZH(Zx2n paramZx2n) {
    try {
      Zgpi zgpi = (Zgpi)this.Zq.ZA(paramZx2n, (Zeki)((Zri6)paramZx2n.ZF()).Zr);
      this.ZJ.ZU(zgpi);
    } catch (Exception exception) {
      Zah.ZU(exception, a(6790, 26828), Zk_.UNEXPECTED);
    } 
  }
  
  private void Z_(Zx22 paramZx22) {
    try {
      Zgpi zgpi = (Zgpi)this.Zq.ZA(paramZx22, (Zeki)((Zx8z)paramZx22.ZF()).ZX);
      this.ZJ.ZU(zgpi);
    } catch (Exception exception) {
      Zah.ZU(exception, a(6785, 27983), Zk_.UNEXPECTED);
    } 
  }
  
  private void ZE(Zx24 paramZx24) {
    try {
      Zgpi zgpi = (Zgpi)this.Zq.ZA(paramZx24, (Zeki)((Zlqd)paramZx24.ZF()).ZY);
      this.ZJ.ZU(zgpi);
    } catch (Exception exception) {
      Zah.ZU(exception, a(6784, -10889), Zk_.UNEXPECTED);
    } 
  }
  
  private void ZK(Zx20 paramZx20) {
    String[] arrayOfString = Ztgq.ZZ();
    try {
      Zx2h zx2h = (Zx2h)this.Zq.ZJ(paramZx20, ((Zg0b)paramZx20.ZF()).Za);
      this.ZJ.ZU(zx2h);
      Zgpi zgpi = (Zgpi)this.Zq.ZA(zx2h, ((Zl_p)zx2h.ZF()).ZU);
      this.ZJ.ZU(zgpi);
      for (Zgpi zgpi1 : zx2h) {
        try {
          if (zgpi1 != null)
            this.ZJ.ZU(zgpi1); 
        } catch (Exception exception) {
          throw a(null);
        } 
        if (arrayOfString == null)
          break; 
      } 
    } catch (Exception exception) {
      Zah.ZU(exception, a(6789, -13821), Zk_.UNEXPECTED);
    } 
  }
  
  private void Zb(Zx2i paramZx2i) {
    try {
      Zgpi zgpi = (Zgpi)this.Zq.ZA(paramZx2i, (Zeki)((Zsif)paramZx2i.ZF()).ZH);
      this.ZJ.ZU(zgpi);
    } catch (Exception exception) {
      Zah.ZU(exception, a(6786, 15261), Zk_.UNEXPECTED);
    } 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ªéFy³WèÔ¢´ÒlïÃ4SÀfuÖú ñ§õ¶ë±\\nãG'YáÏl{ÒK®ouÿbH¢¦5è3ICgñÿz7Ø~5I»újùU4ß^ÑµæÈ.C¦\\f½Ù+äÍ]+b\\bb9CÿÚìbEÆÔ¶Uà¦÷ßbZ':äÕ ü@Æ{Ë+Þd\\n®ÈWXÐÚ/ñµw\\tfê7#\\b·8¼-¼¹.&àí»!2Ò\83Ë;fæA¾}Äëãâãýú¢IOg ÙN9ãY Uîì±b¹ªÛ1(¤y`@E,¤T;Àópr­z\\r@ýW® @fYßon¿Kêº@FøùÖPåR±§"n¥8ÔZ^¢]Ra 6ºÙsp³+£Öë×à¤ü÷geó-'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #63
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #65
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
    //   68: ldc '`Ðh®º¦à5Ut¶\Ç\\nþ¥Ðo«Ä¸ï®¯XþÓê Âs]6$®3ÀõyP°e2\\r¾S#mY4ç{í=Á~äD(?Tú#¶ÞÊ_Û5âûÓ½Z@;ô¼ì`×ÎÑ]Is?ËFtcI9Wõ'm&'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #62
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #79
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
    //   129: putstatic burp/Zgb.a : [Ljava/lang/String;
    //   132: bipush #7
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgb.b : [Ljava/lang/String;
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
    //   212: bipush #100
    //   214: goto -> 244
    //   217: bipush #26
    //   219: goto -> 244
    //   222: bipush #17
    //   224: goto -> 244
    //   227: bipush #79
    //   229: goto -> 244
    //   232: bipush #17
    //   234: goto -> 244
    //   237: bipush #125
    //   239: goto -> 244
    //   242: bipush #60
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
    int i = (paramInt1 ^ 0x1A84) & 0xFFFF;
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
      byte b1 = 95;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */