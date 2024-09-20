package burp;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zs_j implements Zs0k {
  private final Zsoh ZA;
  
  private final Ztpx ZX;
  
  private final Zbjl Zr;
  
  private final int Zb;
  
  private final Ze3n Zs;
  
  private final Zsv5 Zo;
  
  private final Zk9m Zc;
  
  private final Zgsh ZS;
  
  Zs_j(Zsoh paramZsoh, Ztpx paramZtpx, Zbjl paramZbjl, int paramInt, Ze3n paramZe3n, Zsv5 paramZsv5, Zk9m paramZk9m, Zgsh paramZgsh) {
    this.ZA = paramZsoh;
    this.ZX = paramZtpx;
    this.Zr = paramZbjl;
    this.Zb = paramInt;
    this.Zs = paramZe3n;
    this.Zo = paramZsv5;
    this.Zc = paramZk9m;
    this.ZS = paramZgsh;
  }
  
  public void ZE(Zerr paramZerr) {
    Zbqc[] arrayOfZbqc = Zroa.Zp();
    try {
      String str = Zn(this.Zs, this.Zc, this.Zr, this.Zb);
      HashSet<Short> hashSet = new HashSet();
      byte b1 = 0;
      while (b1 < 8) {
        Zsex zsex1 = new Zsex(this.ZA.ZD(Ztao.Zc(this.ZX, this.Zs.ZM(), this.Zs.ZA().ZD()).Zx(this.Zo.ZI()).Zz(false).ZA()));
        hashSet.add(Short.valueOf(zsex1.ZT().Ze()));
        b1++;
        if (arrayOfZbqc == null)
          break; 
      } 
      Zxgd zxgd = this.Zo.ZE(this.Zr.ZB(), str);
      Zsex zsex = new Zsex(this.ZA.ZD(Ztao.Zc(this.ZX, this.Zs.ZM(), this.Zs.ZA().ZD()).Zx(zxgd).Zz(false).ZA()));
      LinkedList<Zsex> linkedList = new LinkedList();
      byte b2 = 0;
      while (b2 < 8) {
        Zsex zsex1 = new Zsex(this.ZA.ZD(Ztao.Zc(this.ZX, this.Zs.ZM(), this.Zs.ZA().ZD()).Zx(this.Zo.ZI()).Zz(false).ZA()));
        linkedList.add(zsex1);
        boolean bool = Za(this.Zs, this.Zo, this.Zc, this.ZS, paramZerr, zsex, zsex1);
        if (bool)
          return; 
        b2++;
        if (arrayOfZbqc == null)
          break; 
      } 
      ZE(this.Zs, this.Zo, this.Zc, this.ZS, paramZerr, hashSet, zsex, (List)linkedList);
    } catch (Zscd zscd) {
      Zah.Zl(Zscg.Zg(zscd), Zk_.COMMON_RUNTIME_FAILURE);
    } 
  }
  
  private static boolean Za(Ze3n paramZe3n, Zsv5 paramZsv5, Zk9m paramZk9m, Zgsh paramZgsh, Zerr paramZerr, Zzud paramZzud1, Zzud paramZzud2) {
    // Byte code:
    //   0: new net/portswigger/Zz_
    //   3: dup
    //   4: aload #6
    //   6: invokeinterface Zl : ()Lburp/Zstu;
    //   11: invokeinterface ZiD : ()[B
    //   16: invokespecial <init> : ([B)V
    //   19: invokevirtual Z_ : ()Ljava/util/List;
    //   22: astore #8
    //   24: invokestatic Zp : ()[Lburp/Zbqc;
    //   27: aload #5
    //   29: invokeinterface Zn : ()[B
    //   34: invokestatic ZG : ([B)Ljava/lang/String;
    //   37: astore #9
    //   39: aload #6
    //   41: invokeinterface Zl : ()Lburp/Zstu;
    //   46: invokeinterface Zis : ()Ljava/lang/String;
    //   51: astore #10
    //   53: astore #7
    //   55: new java/util/LinkedList
    //   58: dup
    //   59: invokespecial <init> : ()V
    //   62: astore #11
    //   64: new java/util/LinkedList
    //   67: dup
    //   68: invokespecial <init> : ()V
    //   71: astore #12
    //   73: iconst_0
    //   74: istore #13
    //   76: iconst_0
    //   77: istore #14
    //   79: aload #8
    //   81: invokeinterface iterator : ()Ljava/util/Iterator;
    //   86: astore #15
    //   88: aload #15
    //   90: invokeinterface hasNext : ()Z
    //   95: ifeq -> 202
    //   98: aload #15
    //   100: invokeinterface next : ()Ljava/lang/Object;
    //   105: checkcast net/portswigger/Zen
    //   108: astore #16
    //   110: aload #16
    //   112: invokevirtual toString : ()Ljava/lang/String;
    //   115: astore #17
    //   117: aload #9
    //   119: aload #17
    //   121: iload #13
    //   123: invokevirtual indexOf : (Ljava/lang/String;I)I
    //   126: istore #18
    //   128: iload #18
    //   130: aload #17
    //   132: invokevirtual length : ()I
    //   135: iadd
    //   136: istore #13
    //   138: aload #11
    //   140: new burp/Zl1r
    //   143: dup
    //   144: iload #18
    //   146: iload #13
    //   148: invokespecial <init> : (II)V
    //   151: invokeinterface add : (Ljava/lang/Object;)Z
    //   156: pop
    //   157: aload #10
    //   159: aload #17
    //   161: iload #14
    //   163: invokevirtual indexOf : (Ljava/lang/String;I)I
    //   166: istore #19
    //   168: iload #19
    //   170: aload #17
    //   172: invokevirtual length : ()I
    //   175: iadd
    //   176: istore #14
    //   178: aload #12
    //   180: new burp/Zl1r
    //   183: dup
    //   184: iload #19
    //   186: iload #14
    //   188: invokespecial <init> : (II)V
    //   191: invokeinterface add : (Ljava/lang/Object;)Z
    //   196: pop
    //   197: aload #7
    //   199: ifnonnull -> 88
    //   202: aload #8
    //   204: invokeinterface isEmpty : ()Z
    //   209: ifne -> 328
    //   212: aload #4
    //   214: getstatic burp/Zroa.INTERESTING_REFLECTION : Lburp/Zroa;
    //   217: iconst_2
    //   218: anewarray burp/Zvow
    //   221: dup
    //   222: iconst_0
    //   223: aload_0
    //   224: invokevirtual Zt : ()Lburp/Zvow;
    //   227: aload #5
    //   229: invokeinterface Z_ : ()Lburp/Zefx;
    //   234: invokevirtual ZC : (Lburp/Zefx;)Lburp/Zvow;
    //   237: aload #5
    //   239: invokeinterface Z_ : ()Lburp/Zefx;
    //   244: aload_2
    //   245: aload_3
    //   246: <illegal opcode> apply : (Lburp/Zk9m;Lburp/Zgsh;)Ljava/util/function/Function;
    //   251: invokestatic ZT : (Lburp/Zefx;Ljava/util/function/Function;)Ljava/util/List;
    //   254: invokevirtual ZK : (Ljava/util/Collection;)Lburp/Zvow;
    //   257: aload #11
    //   259: invokevirtual ZK : (Ljava/util/Collection;)Lburp/Zvow;
    //   262: aload #5
    //   264: invokeinterface Zl : ()Lburp/Zstu;
    //   269: invokevirtual Zu : (Lburp/Zstu;)Lburp/Zvow;
    //   272: aastore
    //   273: dup
    //   274: iconst_1
    //   275: aload_0
    //   276: invokevirtual Zt : ()Lburp/Zvow;
    //   279: aload_1
    //   280: invokevirtual Zp : ()Lburp/Zefx;
    //   283: invokevirtual ZC : (Lburp/Zefx;)Lburp/Zvow;
    //   286: aload_1
    //   287: invokevirtual Zp : ()Lburp/Zefx;
    //   290: aload_2
    //   291: aload_3
    //   292: <illegal opcode> apply : (Lburp/Zk9m;Lburp/Zgsh;)Ljava/util/function/Function;
    //   297: invokestatic ZT : (Lburp/Zefx;Ljava/util/function/Function;)Ljava/util/List;
    //   300: invokevirtual ZK : (Ljava/util/Collection;)Lburp/Zvow;
    //   303: aload #6
    //   305: invokeinterface Zl : ()Lburp/Zstu;
    //   310: invokevirtual Zu : (Lburp/Zstu;)Lburp/Zvow;
    //   313: aload #12
    //   315: invokevirtual Z_ : (Ljava/util/Collection;)Lburp/Zvow;
    //   318: aastore
    //   319: invokevirtual ZP : (Lburp/Zroa;[Lburp/Zvow;)V
    //   322: iconst_1
    //   323: ireturn
    //   324: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   327: athrow
    //   328: iconst_0
    //   329: ireturn
    // Exception table:
    //   from	to	target	type
    //   202	324	324	burp/Zscd
  }
  
  private static void ZE(Ze3n paramZe3n, Zsv5 paramZsv5, Zk9m paramZk9m, Zgsh paramZgsh, Zerr paramZerr, Set<Short> paramSet, Zzud paramZzud, List<Zzud> paramList) {
    // Byte code:
    //   0: aload #5
    //   2: invokeinterface size : ()I
    //   7: iconst_1
    //   8: if_icmpne -> 276
    //   11: aload #5
    //   13: invokeinterface iterator : ()Ljava/util/Iterator;
    //   18: invokeinterface next : ()Ljava/lang/Object;
    //   23: checkcast java/lang/Short
    //   26: astore #8
    //   28: aload #7
    //   30: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   35: aload #8
    //   37: <illegal opcode> test : (Ljava/lang/Short;)Ljava/util/function/Predicate;
    //   42: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   47: invokeinterface toList : ()Ljava/util/List;
    //   52: astore #9
    //   54: aload #9
    //   56: invokeinterface size : ()I
    //   61: iconst_1
    //   62: if_icmpne -> 276
    //   65: aload #9
    //   67: iconst_0
    //   68: invokeinterface get : (I)Ljava/lang/Object;
    //   73: checkcast burp/Zzud
    //   76: astore #10
    //   78: aload #10
    //   80: invokeinterface ZT : ()Lburp/Zb6q;
    //   85: invokeinterface Ze : ()S
    //   90: invokestatic valueOf : (I)Ljava/lang/String;
    //   93: astore #11
    //   95: aload #10
    //   97: invokeinterface Zl : ()Lburp/Zstu;
    //   102: invokeinterface Zis : ()Ljava/lang/String;
    //   107: aload #11
    //   109: invokevirtual indexOf : (Ljava/lang/String;)I
    //   112: istore #12
    //   114: new burp/Zl1r
    //   117: dup
    //   118: iload #12
    //   120: iload #12
    //   122: aload #11
    //   124: invokevirtual length : ()I
    //   127: iadd
    //   128: invokespecial <init> : (II)V
    //   131: astore #13
    //   133: aload #4
    //   135: getstatic burp/Zroa.FLIP_STATUS_CODE : Lburp/Zroa;
    //   138: iconst_3
    //   139: anewarray burp/Zvow
    //   142: dup
    //   143: iconst_0
    //   144: aload_0
    //   145: invokevirtual Zt : ()Lburp/Zvow;
    //   148: aload_1
    //   149: invokevirtual Zp : ()Lburp/Zefx;
    //   152: invokevirtual ZC : (Lburp/Zefx;)Lburp/Zvow;
    //   155: aload_1
    //   156: invokevirtual Zp : ()Lburp/Zefx;
    //   159: aload_2
    //   160: aload_3
    //   161: <illegal opcode> apply : (Lburp/Zk9m;Lburp/Zgsh;)Ljava/util/function/Function;
    //   166: invokestatic ZT : (Lburp/Zefx;Ljava/util/function/Function;)Ljava/util/List;
    //   169: invokevirtual ZK : (Ljava/util/Collection;)Lburp/Zvow;
    //   172: aload_1
    //   173: invokevirtual ZM : ()Lburp/Zb6q;
    //   176: invokevirtual Zo : (Lburp/Zb6q;)Lburp/Zvow;
    //   179: aastore
    //   180: dup
    //   181: iconst_1
    //   182: aload_0
    //   183: invokevirtual Zt : ()Lburp/Zvow;
    //   186: aload #6
    //   188: invokeinterface Z_ : ()Lburp/Zefx;
    //   193: invokevirtual ZC : (Lburp/Zefx;)Lburp/Zvow;
    //   196: aload #6
    //   198: invokeinterface Z_ : ()Lburp/Zefx;
    //   203: aload_2
    //   204: aload_3
    //   205: <illegal opcode> apply : (Lburp/Zk9m;Lburp/Zgsh;)Ljava/util/function/Function;
    //   210: invokestatic ZT : (Lburp/Zefx;Ljava/util/function/Function;)Ljava/util/List;
    //   213: invokevirtual ZK : (Ljava/util/Collection;)Lburp/Zvow;
    //   216: aload #6
    //   218: invokeinterface Zl : ()Lburp/Zstu;
    //   223: invokevirtual Zu : (Lburp/Zstu;)Lburp/Zvow;
    //   226: aastore
    //   227: dup
    //   228: iconst_2
    //   229: aload_0
    //   230: invokevirtual Zt : ()Lburp/Zvow;
    //   233: aload_1
    //   234: invokevirtual Zp : ()Lburp/Zefx;
    //   237: invokevirtual ZC : (Lburp/Zefx;)Lburp/Zvow;
    //   240: aload_1
    //   241: invokevirtual Zp : ()Lburp/Zefx;
    //   244: aload_2
    //   245: aload_3
    //   246: <illegal opcode> apply : (Lburp/Zk9m;Lburp/Zgsh;)Ljava/util/function/Function;
    //   251: invokestatic ZT : (Lburp/Zefx;Ljava/util/function/Function;)Ljava/util/List;
    //   254: invokevirtual ZK : (Ljava/util/Collection;)Lburp/Zvow;
    //   257: aload #10
    //   259: invokeinterface Zl : ()Lburp/Zstu;
    //   264: invokevirtual Zu : (Lburp/Zstu;)Lburp/Zvow;
    //   267: aload #13
    //   269: invokevirtual Zf : (Lburp/Zl1r;)Lburp/Zvow;
    //   272: aastore
    //   273: invokevirtual ZP : (Lburp/Zroa;[Lburp/Zvow;)V
    //   276: return
  }
  
  private static String Zn(Ze3n paramZe3n, Zk9m paramZk9m, Zzod paramZzod, int paramInt) {
    Ztt6 ztt6 = new Ztt6(paramInt, paramZe3n.ZM().Zgv(), paramZk9m.Zx(), Zt7m.ZS);
    return paramZzod.ZK(1, ztt6.toString()).toString();
  }
  
  private static boolean lambda$checkForAndReportSingleFlippedStatusCode$2(Short paramShort, Zzud paramZzud) {
    try {
    
    } catch (Zscd zscd) {
      throw a(null);
    } 
    return (paramZzud.ZT().Ze() != paramShort.shortValue());
  }
  
  private static List lambda$searchForAndReportInteractionId$0(Zk9m paramZk9m, Zgsh paramZgsh, Zr6q paramZr6q) {
    return paramZk9m.Zw(Zyf.Zy(paramZr6q.ZD()), paramZgsh);
  }
  
  private static Zscd a(Zscd paramZscd) {
    return paramZscd;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs_j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */