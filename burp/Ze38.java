package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Ze38 {
  private final Ztew ZN;
  
  private final Zlof ZI;
  
  private final Zkit Zq;
  
  private final Zkit Zk;
  
  private final Ze24 ZY;
  
  private final Zl2m Zh;
  
  private static final String a;
  
  Ze38(Ztew paramZtew, Zlof paramZlof, Zkit paramZkit1, Zkit paramZkit2, Ze24 paramZe24, Zl2m paramZl2m) {
    this.ZN = paramZtew;
    this.ZI = paramZlof;
    this.Zq = paramZkit1;
    this.Zk = paramZkit2;
    this.ZY = paramZe24;
    this.Zh = paramZl2m;
  }
  
  Zsqo Zk(Zsqo paramZsqo) {
    Zsqo zsqo;
    String[] arrayOfString = Ztgq.ZZ();
    try {
      zsqo = this.Zk.<Zsqo>Zv(Zsqo.ZR, paramZsqo.Zpu());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZI.ZK(throwable);
      return null;
    } 
    this.ZY.Zb(paramZsqo, zsqo);
    byte b = 0;
    while (b < paramZsqo.Zpu()) {
      boolean bool = paramZsqo.ZV(b);
      try {
        zsqo.ZC(b, bool);
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.IGNORED);
        this.ZI.ZK(throwable);
      } 
      b++;
      if (arrayOfString == null)
        break; 
    } 
    return zsqo;
  }
  
  Zstu ZE(Zstu paramZstu) {
    Zstu zstu;
    String[] arrayOfString = Ztgq.ZZ();
    try {
      zstu = this.Zk.<Zstu>Zv(Zstu.Zc, paramZstu.Zpu());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZI.ZK(throwable);
      return null;
    } 
    this.ZY.Zb(paramZstu, zstu);
    byte b = 0;
    while (b < paramZstu.Zpu()) {
      byte b1 = paramZstu.Zp(b);
      try {
        zstu.Zs(b, b1);
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.IGNORED);
        this.ZI.ZK(throwable);
      } 
      b++;
      if (arrayOfString == null)
        break; 
    } 
    return zstu;
  }
  
  Zmrq Zi(Zmrq paramZmrq) {
    Zmrq zmrq;
    String[] arrayOfString = Ztgq.ZZ();
    try {
      if (Zszd.ZL)
        try {
          if (this.Zq != null)
            ZF((Zxqz)paramZmrq); 
        } catch (Throwable throwable) {
          throw a(null);
        }  
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      zmrq = this.Zk.Zc(Math.max(paramZmrq.Zpu(), 1024));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZI.ZK(throwable);
      return null;
    } 
    this.ZY.Zb(paramZmrq, zmrq);
    int i = 0;
    while (i < paramZmrq.Zpu()) {
      int j = Math.min(i + 1024, paramZmrq.Zpu());
      byte[] arrayOfByte = paramZmrq.Zb(i, j).ZiD();
      try {
        zmrq.Zj(arrayOfByte, 0, arrayOfByte.length);
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.IGNORED);
        this.ZI.ZK(throwable);
      } 
      i = j;
      if (arrayOfString == null)
        break; 
    } 
    return zmrq;
  }
  
  Ze4r ZE(Ze4r paramZe4r) {
    Ze4r ze4r;
    String[] arrayOfString = Ztgq.ZZ();
    try {
      ze4r = this.Zk.<Ze4r>Zv(Ze4r.ZK, paramZe4r.Zpu());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZI.ZK(throwable);
      return null;
    } 
    this.ZY.Zb(paramZe4r, ze4r);
    byte b = 0;
    while (b < paramZe4r.Zpu()) {
      char c = paramZe4r.ZY(b);
      try {
        ze4r.ZB(b, c);
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.IGNORED);
        this.ZI.ZK(throwable);
      } 
      b++;
      if (arrayOfString == null)
        break; 
    } 
    return ze4r;
  }
  
  Zghu ZL(Zghu paramZghu) {
    Zghu zghu;
    String[] arrayOfString = Ztgq.ZZ();
    try {
      zghu = this.Zk.<Zghu>Zv(Zghu.Zw, paramZghu.Zpu());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZI.ZK(throwable);
      return null;
    } 
    this.ZY.Zb(paramZghu, zghu);
    byte b = 0;
    while (b < paramZghu.Zpu()) {
      short s = paramZghu.ZCO(b);
      try {
        zghu.ZU(b, s);
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.IGNORED);
        this.ZI.ZK(throwable);
      } 
      b++;
      if (arrayOfString == null)
        break; 
    } 
    return zghu;
  }
  
  Zmyi ZF(Zmyi paramZmyi) {
    Zmyi zmyi;
    String[] arrayOfString = Ztgq.ZZ();
    try {
      zmyi = this.Zk.<Zmyi>Zv(Zmyi.Zp, paramZmyi.Zpu());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZI.ZK(throwable);
      return null;
    } 
    this.ZY.Zb(paramZmyi, zmyi);
    byte b = 0;
    while (b < paramZmyi.Zpu()) {
      int i = paramZmyi.ZN(b);
      try {
        zmyi.ZX(b, i);
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.IGNORED);
        this.ZI.ZK(throwable);
      } 
      b++;
      if (arrayOfString == null)
        break; 
    } 
    return zmyi;
  }
  
  Zrap ZP(Zrap paramZrap) {
    Zrap zrap;
    String[] arrayOfString = Ztgq.ZZ();
    try {
      zrap = this.Zk.<Zrap>Zv(Zrap.ZU, paramZrap.Zpu());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZI.ZK(throwable);
      return null;
    } 
    this.ZY.Zb(paramZrap, zrap);
    byte b = 0;
    while (b < paramZrap.Zpu()) {
      long l = paramZrap.ZEn(b);
      try {
        zrap.Zo(b, l);
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.IGNORED);
        this.ZI.ZK(throwable);
      } 
      b++;
      if (arrayOfString == null)
        break; 
    } 
    return zrap;
  }
  
  <T extends Zgpi> Zrte<T> ZQ(Zrte<T> paramZrte) {
    // Byte code:
    //   0: invokestatic ZZ : ()[Ljava/lang/String;
    //   3: new java/util/ArrayList
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore_3
    //   11: astore_2
    //   12: iconst_0
    //   13: istore #4
    //   15: iload #4
    //   17: aload_1
    //   18: invokeinterface Zpu : ()I
    //   23: if_icmpge -> 136
    //   26: aload_1
    //   27: iload #4
    //   29: invokeinterface ZdF : (I)Lburp/Zgpi;
    //   34: astore #5
    //   36: aload #5
    //   38: ifnonnull -> 60
    //   41: aload_3
    //   42: aconst_null
    //   43: invokeinterface add : (Ljava/lang/Object;)Z
    //   48: pop
    //   49: aload_2
    //   50: ifnonnull -> 92
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   59: athrow
    //   60: aload_0
    //   61: getfield ZN : Lburp/Ztew;
    //   64: aload #5
    //   66: invokevirtual Zc : (Lburp/Zgpi;)Lburp/Zgpi;
    //   69: astore #6
    //   71: aload #6
    //   73: ifnull -> 92
    //   76: aload_3
    //   77: aload #6
    //   79: invokeinterface add : (Ljava/lang/Object;)Z
    //   84: pop
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   91: athrow
    //   92: goto -> 129
    //   95: astore #5
    //   97: aload #5
    //   99: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   102: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   105: aload #5
    //   107: athrow
    //   108: astore #5
    //   110: aload #5
    //   112: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   115: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   118: aload_0
    //   119: getfield ZI : Lburp/Zlof;
    //   122: aload #5
    //   124: invokeinterface ZG : (Ljava/lang/Throwable;)V
    //   129: iinc #4, 1
    //   132: aload_2
    //   133: ifnonnull -> 15
    //   136: aload_0
    //   137: getfield Zk : Lburp/Zkit;
    //   140: aload_1
    //   141: invokeinterface ZF : ()Lburp/Zeu4;
    //   146: checkcast burp/Zllg
    //   149: aload_3
    //   150: invokeinterface size : ()I
    //   155: invokevirtual Zv : (Lburp/Zllg;I)Lburp/Ze34;
    //   158: checkcast burp/Zrte
    //   161: astore #4
    //   163: goto -> 189
    //   166: astore #5
    //   168: aload #5
    //   170: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   173: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   176: aload_0
    //   177: getfield ZI : Lburp/Zlof;
    //   180: aload #5
    //   182: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   187: aconst_null
    //   188: areturn
    //   189: aload_0
    //   190: getfield ZY : Lburp/Ze24;
    //   193: aload_1
    //   194: aload #4
    //   196: invokeinterface Zb : (Lburp/Zgpi;Lburp/Zgpi;)V
    //   201: iconst_0
    //   202: istore #5
    //   204: iload #5
    //   206: aload_3
    //   207: invokeinterface size : ()I
    //   212: if_icmpge -> 242
    //   215: aload #4
    //   217: iload #5
    //   219: aload_3
    //   220: iload #5
    //   222: invokeinterface get : (I)Ljava/lang/Object;
    //   227: checkcast burp/Zgpi
    //   230: invokeinterface ZU : (ILburp/Zgpi;)V
    //   235: iinc #5, 1
    //   238: aload_2
    //   239: ifnonnull -> 204
    //   242: goto -> 268
    //   245: astore #5
    //   247: aload #5
    //   249: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   252: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   255: aload_0
    //   256: getfield ZI : Lburp/Zlof;
    //   259: aload #5
    //   261: invokeinterface ZK : (Ljava/lang/Throwable;)V
    //   266: aconst_null
    //   267: areturn
    //   268: aload #4
    //   270: areturn
    // Exception table:
    //   from	to	target	type
    //   26	92	95	burp/Ztgq
    //   26	92	95	burp/Zb_f
    //   26	92	108	java/lang/Throwable
    //   36	53	56	burp/Ztgq
    //   71	85	88	burp/Ztgq
    //   136	163	166	java/lang/Throwable
    //   201	242	245	java/lang/Throwable
  }
  
  private void ZF(Zxqz paramZxqz) {
    String[] arrayOfString = Ztgq.ZZ();
    try {
      Zefg zefg = (Zefg)this.Zq.ZJ(paramZxqz, Zk_o.Zn);
      this.Zh.ZU(zefg);
      Zgpi zgpi = (Zgpi)this.Zq.ZA(zefg, ((Zl_p)zefg.ZF()).ZU);
      this.Zh.ZU(zgpi);
      for (Zgpi zgpi1 : zefg) {
        try {
          if (zgpi1 != null)
            this.Zh.ZU(zgpi1); 
        } catch (Exception exception) {
          throw a(null);
        } 
        if (arrayOfString == null)
          break; 
      } 
    } catch (Exception exception) {
      Zah.ZU(exception, a, Zk_.UNEXPECTED);
    } 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #120
    //   2: ldc 'K5P`.y;m(\\b\~'K9Nl6Ui\\tMhK~*n;T|$\c J,-K-;K|#\\nW-7Qi( Pc3'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ze38.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #117
    //   82: goto -> 112
    //   85: bipush #44
    //   87: goto -> 112
    //   90: bipush #65
    //   92: goto -> 112
    //   95: bipush #116
    //   97: goto -> 112
    //   100: bipush #51
    //   102: goto -> 112
    //   105: bipush #19
    //   107: goto -> 112
    //   110: bipush #65
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze38.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */