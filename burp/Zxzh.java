package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zxzh implements Zsw, Zl5s, Zm3g {
  private final Ze5r<Zm1n, Zt9r> ZU;
  
  private final Zgb6 Zt;
  
  private final Zt4u ZP;
  
  private final Supplier<Zgvn> Zs;
  
  private final Ztik ZM;
  
  private final Zr_4 ZC;
  
  private final Zr_4 Zd;
  
  private final Zxat Z_ = new Zxat();
  
  private final Zkl6 Za;
  
  private final Zslu ZK;
  
  private final Function<Zeew, Zskh> Zy;
  
  private final List<Zxat> Zb;
  
  private final Zelf Zi;
  
  private Zsoy Zw;
  
  public int Zr;
  
  private static Zbqc[] Zq;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zxzh(Zt4u paramZt4u, Supplier<Zgvn> paramSupplier, Function<Zeew, Zskh> paramFunction, Zgb6 paramZgb6, Zxgc paramZxgc, Zslu paramZslu, Zkl6 paramZkl6, Ztik paramZtik, Zefg<Zt9r> paramZefg, Zr_4 paramZr_41, Zr_4 paramZr_42, Zrgd paramZrgd) {
    Zbqc[] arrayOfZbqc = Zs();
    try {
      this.Zw = null;
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      Zuh.Zb((null != paramZtik), Zqf.Zv);
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Zuh.Zb((null != paramZr_42), Zqf.Zv);
    this.ZP = paramZt4u;
    this.Zs = paramSupplier;
    this.Zy = paramFunction;
    this.Zt = paramZgb6;
    this.ZK = paramZslu;
    this.Za = paramZkl6;
    this.ZM = paramZtik;
    this.ZC = paramZr_41;
    this.Zd = paramZr_42;
    paramZgb6.Zd(this);
    ArrayList<Zm1n> arrayList = new ArrayList();
    for (Zt9r zt9r : paramZefg) {
      try {
        arrayList.add(new Zm1n(zt9r, paramZt4u, paramZslu, paramZkl6, paramZr_41, paramZr_42));
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.UNEXPECTED);
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
    try {
      this.ZU = new Ze5r<>(arrayList, paramZefg);
      this.Zb = new ArrayList<>();
      this.Zi = new Zelf(paramZkl6.ZB(), paramZr_42, paramZrgd, paramZxgc.ZK1(), paramZkl6.ZH());
      if (Zbqc.Zwu() == null)
        Zp(new Zbqc[5]); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  public void Zj(Zsoy paramZsoy) {
    this.Zw = paramZsoy;
  }
  
  public void ZX(Zlil paramZlil) {
    this.ZM.ZX(paramZlil);
  }
  
  public void Zu(Zlil paramZlil) {
    this.ZM.Zu(paramZlil);
  }
  
  public boolean Zt(Zlil paramZlil) {
    try {
      return this.ZU.Zo(paramZlil::lambda$isMacroInUse$0);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return false;
    } 
  }
  
  public int ZS() {
    return this.ZM.ZD();
  }
  
  public Zg0h Zl(String paramString) {
    return ((Zgvn)this.Zs.get()).ZO(paramString);
  }
  
  public Ze5r<Zm1n, Zt9r> Ze() {
    return this.ZU;
  }
  
  public Ze5r<Zlil, Zmk5> Zp() {
    return this.ZM.ZK();
  }
  
  public Zlil Zw(long paramLong) {
    return this.ZM.ZC(paramLong);
  }
  
  public Zxat Zz() {
    return this.Z_;
  }
  
  public void Zg(Zxat paramZxat) {
    this.Zb.add(paramZxat);
  }
  
  public void ZT(Zxat paramZxat) {
    this.Zb.remove(paramZxat);
  }
  
  public List<Ztbr> Zd() {
    return this.Z_.Zi();
  }
  
  public List<Ztbr> ZT(Zmzk paramZmzk, byte[] paramArrayOfbyte) {
    return this.Z_.ZW(paramZmzk, paramArrayOfbyte);
  }
  
  public void ZG(List<Ztbr> paramList, Zmzk paramZmzk, boolean paramBoolean) {
    this.Z_.Zf(paramList, paramZmzk, paramBoolean);
  }
  
  public void ZO(Zeew paramZeew, Zefx paramZefx) {
    if (paramZeew != Zeew.PROXY || !this.Zt.Zh(Zeew.PROXY))
      return; 
    List<Ztbr> list = Zth6.Zl(paramZefx.ZT(), paramZefx.ZG());
    if (list != null && !list.isEmpty())
      this.Z_.Zf(list, paramZefx.ZT(), true); 
  }
  
  public void Zv(Zeew paramZeew, Zmzk paramZmzk, List<String> paramList) {
    // Byte code:
    //   0: invokestatic Zs : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: getstatic burp/Zeew.PROXY : Lburp/Zeew;
    //   9: if_acmpne -> 31
    //   12: aload_0
    //   13: getfield Zb : Ljava/util/List;
    //   16: invokeinterface isEmpty : ()Z
    //   21: ifeq -> 56
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   30: athrow
    //   31: aload_0
    //   32: getfield Zt : Lburp/Zgb6;
    //   35: aload_1
    //   36: invokeinterface Zh : (Lburp/Zeew;)Z
    //   41: ifne -> 56
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   50: athrow
    //   51: return
    //   52: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   55: athrow
    //   56: aload_2
    //   57: aload_3
    //   58: aconst_null
    //   59: invokestatic Z_ : (Lburp/Zmzk;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    //   62: astore #5
    //   64: aload #5
    //   66: ifnull -> 191
    //   69: aload #5
    //   71: invokeinterface isEmpty : ()Z
    //   76: ifne -> 191
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   85: athrow
    //   86: aload_0
    //   87: getfield Zt : Lburp/Zgb6;
    //   90: aload_1
    //   91: invokeinterface Zh : (Lburp/Zeew;)Z
    //   96: ifeq -> 124
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   105: athrow
    //   106: aload_0
    //   107: getfield Z_ : Lburp/Zxat;
    //   110: aload #5
    //   112: aload_2
    //   113: iconst_0
    //   114: invokevirtual Zf : (Ljava/util/List;Lburp/Zmzk;Z)V
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: aload_1
    //   125: getstatic burp/Zeew.PROXY : Lburp/Zeew;
    //   128: if_acmpne -> 191
    //   131: aload_0
    //   132: getfield Zb : Ljava/util/List;
    //   135: invokeinterface iterator : ()Ljava/util/Iterator;
    //   140: astore #6
    //   142: aload #6
    //   144: invokeinterface hasNext : ()Z
    //   149: ifeq -> 178
    //   152: aload #6
    //   154: invokeinterface next : ()Ljava/lang/Object;
    //   159: checkcast burp/Zxat
    //   162: astore #7
    //   164: aload #7
    //   166: aload #5
    //   168: aload_2
    //   169: iconst_0
    //   170: invokevirtual Zf : (Ljava/util/List;Lburp/Zmzk;Z)V
    //   173: aload #4
    //   175: ifnonnull -> 142
    //   178: goto -> 191
    //   181: astore #6
    //   183: aload #6
    //   185: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   188: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   191: return
    // Exception table:
    //   from	to	target	type
    //   5	24	27	java/lang/Exception
    //   12	44	47	java/lang/Exception
    //   31	52	52	java/lang/Exception
    //   64	79	82	java/lang/Exception
    //   69	99	102	java/lang/Exception
    //   86	117	120	java/lang/Exception
    //   131	178	181	java/lang/Exception
  }
  
  public Zsxd ZZ(Zeew paramZeew, Zefx paramZefx, Zlr9 paramZlr9, Zz9e paramZz9e, Zlgm paramZlgm, Consumer<Ze44> paramConsumer) {
    Zsxd zsxd = new Ze5m(paramZefx);
    Zskh zskh = this.Zy.apply(paramZeew);
    Zbqc[] arrayOfZbqc = Zs();
    try {
      List<Zm1n> list1 = Zo(paramZeew, paramZefx);
      List<Zm1n> list2 = ZE(paramZlgm);
      for (Zm1n zm1n : list2) {
        if (this.Zw != null) {
          Ze44 ze44 = this.Zw.Zl(paramZeew, paramZefx.ZF());
          ze44.ZP(Zgsg.VETOING_RULE, 0, String.format(a(7933, 20557), new Object[] { zm1n.Zq() }), null);
        } 
        if (arrayOfZbqc == null)
          break; 
      } 
      list1.removeAll(list2);
      if (!list1.isEmpty()) {
        Ze44 ze44 = null;
        Zsoy zsoy = this.Zw;
        if (zsoy != null)
          ze44 = zsoy.Zl(paramZeew, paramZefx.ZF()); 
        label56: for (Zm1n zm1n : list1) {
          try {
            if (ze44 != null)
              ze44.ZI(Zgsg.APPLYING_RULE, 0, String.format(a(7935, 29338), new Object[] { zm1n.Zq() }), null, paramZefx.ZT(), paramZefx.Zb().ZD(), null); 
          } catch (Exception exception) {
            throw a(null);
          } 
          byte b = 0;
          while (b < zm1n.ZA().size()) {
            Zb81 zb81 = zm1n.ZA().get(b);
            try {
              if (zb81.Zj()) {
                Zzva zzva = this.Zi.ZX(zb81, zskh, paramZlr9, paramZz9e, this);
                Zsgw zsgw = zzva.ZA(ze44, 1, zsxd, paramZlgm);
                zsxd = zsgw.Zi;
                try {
                  if (zsgw.Zh)
                    break label56; 
                } catch (Exception exception) {
                  throw a(null);
                } 
              } 
            } catch (Exception exception) {
              throw a(null);
            } 
            b++;
            if (arrayOfZbqc == null)
              break; 
          } 
          if (arrayOfZbqc == null)
            break; 
        } 
        try {
          if (ze44 != null)
            try {
              if (zsxd != null)
                try {
                  if (zsxd.ZG().Zb() == Zvom.NOT_ISSUED)
                    paramConsumer.accept(ze44); 
                } catch (Exception exception) {
                  throw a(null);
                }  
            } catch (Exception exception) {
              throw a(null);
            }  
        } catch (Exception exception) {
          throw a(null);
        } 
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return zsxd;
  }
  
  private List<Zm1n> ZE(Zlgm paramZlgm) {
    return (paramZlgm == null) ? Collections.<Zm1n>emptyList() : (List<Zm1n>)this.ZU.Za().stream().filter(paramZlgm::lambda$getNotApplicableRules$1).collect(Collectors.toList());
  }
  
  private List<Zm1n> Zo(Zeew paramZeew, Zefx paramZefx) {
    ArrayList<Zm1n> arrayList = new ArrayList();
    Iterator<Zm1n> iterator = this.ZU.iterator();
    Zbqc[] arrayOfZbqc = Zs();
    while (iterator.hasNext()) {
      Zm1n zm1n = iterator.next();
      if (!zm1n.ZU() || !zm1n.ZR(paramZeew) || !zm1n.Zk().ZB(paramZefx.ZT()) || !zm1n.Zk().ZG(paramZefx.ZF()) || (zm1n.Zx() && !Z_(paramZefx.Zc(), zm1n.ZY())))
        continue; 
      arrayList.add(zm1n);
      if (arrayOfZbqc == null)
        break; 
    } 
    return arrayList;
  }
  
  private static boolean Z_(Collection<Zlou> paramCollection, Collection<String> paramCollection1) {
    Zbqc[] arrayOfZbqc = Zs();
    for (String str : paramCollection1) {
      if (paramCollection.stream().anyMatch(str::lambda$requestHasAnyParameterWithName$2))
        return true; 
      if (arrayOfZbqc == null)
        break; 
    } 
    return false;
  }
  
  public void Zd(Zmf_ paramZmf_) {
    Zbqc[] arrayOfZbqc = Zs();
    List<?> list = paramZmf_.Zs(a(7932, -12779), new Zs0e(this));
    if (list != null)
      try {
        synchronized (this.ZU) {
          this.ZU.ZF();
          for (Zm1n zm1n : list) {
            try {
              if (zm1n != null)
                this.ZU.Ze(zm1n); 
            } catch (Exception exception) {
              throw a(null);
            } 
            if (arrayOfZbqc == null)
              break; 
          } 
        } 
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      }  
  }
  
  public void Zl(Zg4j paramZg4j) {
    Zzqw zzqw = paramZg4j.ZP(a(7934, -11569));
    Iterator<Zm1n> iterator = this.ZU.iterator();
    Zbqc[] arrayOfZbqc = Zs();
    while (iterator.hasNext()) {
      Zm1n zm1n = iterator.next();
      zzqw.Zx(zm1n.Zc());
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private static boolean lambda$requestHasAnyParameterWithName$2(String paramString, Zlou paramZlou) {
    return paramZlou.ZA.equals(paramString);
  }
  
  private static boolean lambda$getNotApplicableRules$1(Zlgm paramZlgm, Zm1n paramZm1n) {
    return !paramZlgm.ZB(paramZm1n);
  }
  
  private static boolean lambda$isMacroInUse$0(Zlil paramZlil, Zm1n paramZm1n) {
    return paramZm1n.Zv(paramZlil);
  }
  
  public static void Zp(Zbqc[] paramArrayOfZbqc) {
    Zq = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zs() {
    return Zq;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'êéAïêõ¦/q ÄZ#t5±CÓ+Éö¯ö\\bîâÒJ¿Ól@àW¨ÇÂèß¿}È&:ÓATó~©Nm8k7) J$'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: anewarray burp/Zbqc
    //   21: bipush #16
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: invokestatic Zp : ([Lburp/Zbqc;)V
    //   29: bipush #125
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 148
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc '¥K¥ñÂh ~Ï5\\f49\HáÝ=w¸Q©×@ãnòÂ¨æì¸[²ÒhºwrqÁÿØK0SÚ=akwVX±'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: bipush #17
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #98
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 148
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic burp/Zxzh.a : [Ljava/lang/String;
    //   138: iconst_4
    //   139: anewarray java/lang/String
    //   142: putstatic burp/Zxzh.b : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 264
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #11
    //   218: goto -> 248
    //   221: bipush #60
    //   223: goto -> 248
    //   226: bipush #71
    //   228: goto -> 248
    //   231: bipush #64
    //   233: goto -> 248
    //   236: bipush #110
    //   238: goto -> 248
    //   241: bipush #13
    //   243: goto -> 248
    //   246: bipush #52
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 171
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 167
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 46, 0 -> 105
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1EFD) & 0xFFFF;
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
      byte b1 = 47;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxzh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */