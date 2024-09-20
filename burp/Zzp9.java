package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zsy;

public class Zzp9 implements Zkrr {
  private static final List<String> Zq;
  
  private static final List<String> Zz;
  
  private static final List<String> ZD;
  
  private static final List<String> ZS;
  
  private static final Set<String> ZV;
  
  private final Zevv ZE;
  
  private final Zkq4 ZA;
  
  private final Ze3n ZI;
  
  private final Zsy ZP;
  
  private final Zk7c Zc;
  
  private final Zmzk ZK;
  
  private final Zbnt ZQ;
  
  private static int ZC;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zzp9(Zz1i paramZz1i, Zkq4 paramZkq4, Ze3n paramZe3n, Zsy paramZsy, Zbnt paramZbnt) {
    this.ZA = paramZkq4;
    this.ZI = paramZe3n;
    this.ZP = paramZsy;
    this.ZQ = paramZbnt;
    this.ZK = paramZe3n.Za();
    this.Zc = paramZz1i.Zc(this.ZK).Zg8();
    int i = Zy();
    try {
      this.ZE = new Zevv(paramZbnt);
      if (Zbqc.Zwu() == null)
        Zz(++i); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  public Zbsl Zp() {
    return Zbsl.APR_WebCacheDeception;
  }
  
  public String toString() {
    return Zp().name();
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    // Byte code:
    //   0: invokestatic Zy : ()I
    //   3: istore #4
    //   5: aload_0
    //   6: invokevirtual Zq : ()Z
    //   9: ifeq -> 17
    //   12: return
    //   13: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   16: athrow
    //   17: aload_0
    //   18: invokevirtual ZX : ()Z
    //   21: ifeq -> 29
    //   24: return
    //   25: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   28: athrow
    //   29: aload_0
    //   30: invokevirtual ZQ : ()Ljava/util/List;
    //   33: astore #5
    //   35: aload_0
    //   36: aload #5
    //   38: iconst_1
    //   39: invokevirtual Zi : (Ljava/util/List;Z)Z
    //   42: ifeq -> 50
    //   45: return
    //   46: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   49: athrow
    //   50: aload_0
    //   51: invokevirtual Ze : ()Lburp/Zbsn;
    //   54: astore #6
    //   56: aload_0
    //   57: invokevirtual Zd : ()Z
    //   60: istore #7
    //   62: iload #7
    //   64: ifne -> 201
    //   67: aload_0
    //   68: aload #6
    //   70: invokevirtual Zk : (Lburp/Zbsn;)Z
    //   73: ifne -> 201
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   82: athrow
    //   83: aload_0
    //   84: aload #6
    //   86: invokevirtual Zt : (Lburp/Zbsn;)Z
    //   89: ifne -> 201
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   98: athrow
    //   99: aload_0
    //   100: aload #5
    //   102: invokevirtual Zx : (Ljava/util/List;)Z
    //   105: ifeq -> 182
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   114: athrow
    //   115: aload_0
    //   116: aload #5
    //   118: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   123: lconst_1
    //   124: invokeinterface skip : (J)Ljava/util/stream/Stream;
    //   129: invokeinterface toList : ()Ljava/util/List;
    //   134: invokevirtual ZR : (Ljava/util/List;)Z
    //   137: istore #8
    //   139: aload_3
    //   140: aload_0
    //   141: getfield ZE : Lburp/Zevv;
    //   144: iconst_1
    //   145: iconst_1
    //   146: iload #8
    //   148: ifeq -> 159
    //   151: iconst_2
    //   152: goto -> 160
    //   155: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   158: athrow
    //   159: iconst_1
    //   160: aload_0
    //   161: getfield ZK : Lburp/Zmzk;
    //   164: aload_0
    //   165: getfield ZI : Lburp/Ze3n;
    //   168: invokevirtual ZN : ()Ljava/lang/String;
    //   171: invokestatic Zy : (Ljava/lang/String;)[B
    //   174: invokevirtual Zk : (BBBLburp/Zmzk;[B)Lburp/Zx_5;
    //   177: invokeinterface Zz : (Lburp/Zsqx;)V
    //   182: aload_3
    //   183: aload_0
    //   184: aload #6
    //   186: <illegal opcode> run : (Lburp/Zzp9;Lburp/Zbsn;)Ljava/lang/Runnable;
    //   191: invokeinterface ZL : (Ljava/lang/Runnable;)V
    //   196: iload #4
    //   198: ifne -> 342
    //   201: iload #7
    //   203: ifeq -> 342
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   212: athrow
    //   213: aload_0
    //   214: aload #6
    //   216: invokevirtual Zk : (Lburp/Zbsn;)Z
    //   219: ifne -> 296
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   228: athrow
    //   229: aload_0
    //   230: aload #5
    //   232: invokevirtual Zx : (Ljava/util/List;)Z
    //   235: ifeq -> 282
    //   238: goto -> 245
    //   241: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   244: athrow
    //   245: aload_3
    //   246: aload_0
    //   247: getfield ZE : Lburp/Zevv;
    //   250: iconst_3
    //   251: iconst_1
    //   252: iconst_3
    //   253: aload_0
    //   254: getfield ZK : Lburp/Zmzk;
    //   257: aload_0
    //   258: getfield ZI : Lburp/Ze3n;
    //   261: invokevirtual ZN : ()Ljava/lang/String;
    //   264: invokestatic Zy : (Ljava/lang/String;)[B
    //   267: invokevirtual Zk : (BBBLburp/Zmzk;[B)Lburp/Zx_5;
    //   270: invokeinterface Zz : (Lburp/Zsqx;)V
    //   275: goto -> 282
    //   278: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   281: athrow
    //   282: aload_3
    //   283: aload_0
    //   284: aload #6
    //   286: <illegal opcode> run : (Lburp/Zzp9;Lburp/Zbsn;)Ljava/lang/Runnable;
    //   291: invokeinterface ZL : (Ljava/lang/Runnable;)V
    //   296: aload_0
    //   297: aload #5
    //   299: invokevirtual Zz : (Ljava/util/List;)Z
    //   302: ifeq -> 342
    //   305: aload_3
    //   306: aload_0
    //   307: getfield ZE : Lburp/Zevv;
    //   310: iconst_3
    //   311: iconst_0
    //   312: iconst_3
    //   313: aload_0
    //   314: getfield ZK : Lburp/Zmzk;
    //   317: aload_0
    //   318: getfield ZI : Lburp/Ze3n;
    //   321: invokevirtual ZN : ()Ljava/lang/String;
    //   324: invokestatic Zy : (Ljava/lang/String;)[B
    //   327: invokevirtual Zk : (BBBLburp/Zmzk;[B)Lburp/Zx_5;
    //   330: invokeinterface Zz : (Lburp/Zsqx;)V
    //   335: goto -> 342
    //   338: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   341: athrow
    //   342: return
    // Exception table:
    //   from	to	target	type
    //   5	13	13	java/lang/NumberFormatException
    //   17	25	25	java/lang/NumberFormatException
    //   35	46	46	java/lang/NumberFormatException
    //   62	76	79	java/lang/NumberFormatException
    //   67	92	95	java/lang/NumberFormatException
    //   83	108	111	java/lang/NumberFormatException
    //   139	155	155	java/lang/NumberFormatException
    //   182	206	209	java/lang/NumberFormatException
    //   201	222	225	java/lang/NumberFormatException
    //   213	238	241	java/lang/NumberFormatException
    //   229	275	278	java/lang/NumberFormatException
    //   296	335	338	java/lang/NumberFormatException
  }
  
  boolean Zq() {
    String str = this.ZI.ZA().ZF().Zd_();
    try {
      if (str == null)
        return false; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return ZV.contains(str.toUpperCase());
  }
  
  boolean ZX() {
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return (this.ZI.ZL().Ze() != 200);
  }
  
  boolean Zi(List<Zb6q> paramList, boolean paramBoolean) {
    int i = Zy();
    for (Zb6q zb6q : paramList) {
      Ztil ztil = Zm(zb6q);
      try {
        if (ztil.Zm())
          return true; 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      try {
        if (ztil.ZV()) {
          try {
            if (paramBoolean)
              this.ZE.ZU(this.ZI.ZA(), zb6q, ztil.Zpy().getFirst()); 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          return false;
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      if (i == 0)
        break; 
    } 
    try {
      if (paramBoolean)
        this.ZE.ZU(this.ZI.ZA(), paramList.getFirst(), null); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return false;
  }
  
  Zbsn Ze() {
    Optional<String> optional = this.ZI.ZL().Zm().stream().map(String::toLowerCase).filter(Zzp9::lambda$identifyHostServerCombination$2).findFirst().map(Zzp9::lambda$identifyHostServerCombination$3);
    return new Zbsn(this.ZI.Za().ZJ1(), optional.orElse(null));
  }
  
  boolean Zd() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZI : Lburp/Ze3n;
    //   4: invokevirtual ZA : ()Lburp/Zefx;
    //   7: invokeinterface ZG : ()Ljava/util/List;
    //   12: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   17: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   22: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   27: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   32: invokeinterface noneMatch : (Ljava/util/function/Predicate;)Z
    //   37: ifeq -> 46
    //   40: iconst_0
    //   41: ireturn
    //   42: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   45: athrow
    //   46: new burp/Zlv5
    //   49: dup
    //   50: invokespecial <init> : ()V
    //   53: <illegal opcode> Zv : ()Lburp/Zrec;
    //   58: invokestatic Zu : (Lburp/Zrec;)Lburp/Zxgd;
    //   61: invokevirtual Za : (Lburp/Zxgd;)Lburp/Zlv5;
    //   64: astore_1
    //   65: aload_0
    //   66: getfield ZI : Lburp/Ze3n;
    //   69: aload_1
    //   70: invokevirtual Zr : (Lburp/Zlv5;)Lburp/Zlyj;
    //   73: invokevirtual ZBB : ()Lburp/Zsxd;
    //   76: invokeinterface ZG : ()Lburp/Zg3d;
    //   81: invokeinterface Ze : ()Lburp/Zb6q;
    //   86: astore_2
    //   87: aload_0
    //   88: aload_2
    //   89: invokevirtual Zk : (Lburp/Zb6q;)Z
    //   92: ifeq -> 201
    //   95: new burp/Zxzf
    //   98: dup
    //   99: aload_0
    //   100: getfield ZI : Lburp/Ze3n;
    //   103: invokevirtual ZA : ()Lburp/Zefx;
    //   106: invokeinterface ZF : ()Lburp/Zlit;
    //   111: aload_0
    //   112: <illegal opcode> get : (Lburp/Zzp9;)Ljava/util/function/Supplier;
    //   117: aload_0
    //   118: aload_1
    //   119: <illegal opcode> get : (Lburp/Zzp9;Lburp/Zlv5;)Ljava/util/function/Supplier;
    //   124: invokestatic Zw : (Ljava/util/function/Supplier;Ljava/util/function/Supplier;)Lburp/Zk5d;
    //   127: new burp/Zsb8
    //   130: dup
    //   131: aload_0
    //   132: getfield ZI : Lburp/Ze3n;
    //   135: invokevirtual ZA : ()Lburp/Zefx;
    //   138: invokeinterface ZF : ()Lburp/Zlit;
    //   143: aload_0
    //   144: getfield ZI : Lburp/Ze3n;
    //   147: invokevirtual ZL : ()Lburp/Zb6q;
    //   150: invokeinterface Za : ()Lburp/Zstu;
    //   155: aload_2
    //   156: invokeinterface Za : ()Lburp/Zstu;
    //   161: aload_0
    //   162: getfield ZQ : Lburp/Zbnt;
    //   165: invokespecial <init> : (Lburp/Zlit;Lburp/Zstu;Lburp/Zstu;Lburp/Zbnt;)V
    //   168: invokespecial <init> : (Lburp/Zlit;Lburp/Zk5d;Lburp/Zsb8;)V
    //   171: astore_3
    //   172: aload_3
    //   173: iconst_4
    //   174: invokevirtual Zy : (I)Z
    //   177: istore #4
    //   179: iload #4
    //   181: ifeq -> 198
    //   184: aload_0
    //   185: getfield ZE : Lburp/Zevv;
    //   188: invokevirtual ZZ : ()V
    //   191: goto -> 198
    //   194: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   197: athrow
    //   198: iload #4
    //   200: ireturn
    //   201: aload_0
    //   202: getfield ZE : Lburp/Zevv;
    //   205: invokevirtual Zw : ()V
    //   208: iconst_1
    //   209: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	42	42	java/lang/NumberFormatException
    //   179	191	194	java/lang/NumberFormatException
  }
  
  boolean Zk(Zbsn paramZbsn) {
    return this.Zc.Zr(paramZbsn);
  }
  
  boolean Zt(Zbsn paramZbsn) {
    return this.Zc.Zc(paramZbsn);
  }
  
  boolean Zx(List<Zb6q> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZP : Lnet/portswigger/Zsy;
    //   4: bipush #6
    //   6: invokevirtual Z_ : (I)Ljava/lang/String;
    //   9: sipush #-17417
    //   12: sipush #-21256
    //   15: invokestatic a : (II)Ljava/lang/String;
    //   18: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   23: astore_2
    //   24: aload_0
    //   25: getfield ZI : Lburp/Ze3n;
    //   28: invokevirtual ZA : ()Lburp/Zefx;
    //   31: invokeinterface ZF : ()Lburp/Zlit;
    //   36: invokeinterface Zd4 : ()[B
    //   41: invokestatic ZG : ([B)Ljava/lang/String;
    //   44: astore_3
    //   45: getstatic burp/Zzp9.ZD : Ljava/util/List;
    //   48: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   53: getstatic burp/Zzp9.ZS : Ljava/util/List;
    //   56: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   61: invokestatic concat : (Ljava/util/stream/Stream;Ljava/util/stream/Stream;)Ljava/util/stream/Stream;
    //   64: aload_0
    //   65: aload_2
    //   66: aload_3
    //   67: aload_1
    //   68: <illegal opcode> test : (Lburp/Zzp9;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/function/Predicate;
    //   73: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   78: ireturn
  }
  
  boolean Zz(List<Zb6q> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZP : Lnet/portswigger/Zsy;
    //   4: bipush #6
    //   6: invokevirtual Z_ : (I)Ljava/lang/String;
    //   9: sipush #-17504
    //   12: sipush #-9447
    //   15: invokestatic a : (II)Ljava/lang/String;
    //   18: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   23: astore_2
    //   24: aload_0
    //   25: getfield ZI : Lburp/Ze3n;
    //   28: invokevirtual ZA : ()Lburp/Zefx;
    //   31: invokeinterface ZF : ()Lburp/Zlit;
    //   36: invokeinterface Zd4 : ()[B
    //   41: invokestatic ZG : ([B)Ljava/lang/String;
    //   44: astore_3
    //   45: new burp/Zlv5
    //   48: dup
    //   49: invokespecial <init> : ()V
    //   52: aload_3
    //   53: aload_2
    //   54: <illegal opcode> Zv : (Ljava/lang/String;Ljava/lang/String;)Lburp/Zrec;
    //   59: invokestatic Zu : (Lburp/Zrec;)Lburp/Zxgd;
    //   62: invokevirtual Za : (Lburp/Zxgd;)Lburp/Zlv5;
    //   65: astore #4
    //   67: aload_0
    //   68: aload #4
    //   70: aload_2
    //   71: aload_1
    //   72: invokevirtual ZL : (Lburp/Zlv5;Ljava/lang/String;Ljava/util/List;)Z
    //   75: ireturn
  }
  
  Ztil Zm(Zb6q paramZb6q) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface Zm : ()Ljava/util/List;
    //   6: astore_3
    //   7: invokestatic Zy : ()I
    //   10: aload_3
    //   11: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   16: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   21: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   26: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   31: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   36: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   41: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   46: invokeinterface toList : ()Ljava/util/List;
    //   51: astore #4
    //   53: new java/util/LinkedList
    //   56: dup
    //   57: invokespecial <init> : ()V
    //   60: astore #5
    //   62: aload #4
    //   64: invokeinterface iterator : ()Ljava/util/Iterator;
    //   69: astore #6
    //   71: istore_2
    //   72: aload #6
    //   74: invokeinterface hasNext : ()Z
    //   79: ifeq -> 235
    //   82: aload #6
    //   84: invokeinterface next : ()Ljava/lang/Object;
    //   89: checkcast java/lang/String
    //   92: astore #7
    //   94: aload_1
    //   95: aload #7
    //   97: invokeinterface ZY : (Ljava/lang/String;)Ljava/util/Optional;
    //   102: invokevirtual orElseThrow : ()Ljava/lang/Object;
    //   105: checkcast java/lang/String
    //   108: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   111: astore #8
    //   113: aload #8
    //   115: sipush #-17432
    //   118: sipush #-14256
    //   121: invokestatic a : (II)Ljava/lang/String;
    //   124: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   127: ifne -> 154
    //   130: aload #8
    //   132: sipush #-17426
    //   135: sipush #-4914
    //   138: invokestatic a : (II)Ljava/lang/String;
    //   141: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   144: ifeq -> 206
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   153: athrow
    //   154: aload #5
    //   156: aload #7
    //   158: aload #8
    //   160: sipush #-17441
    //   163: sipush #-3453
    //   166: invokestatic a : (II)Ljava/lang/String;
    //   169: swap
    //   170: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   175: invokeinterface add : (Ljava/lang/Object;)Z
    //   180: pop
    //   181: iload_2
    //   182: ifne -> 231
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   191: athrow
    //   192: iconst_4
    //   193: anewarray burp/Zbqc
    //   196: invokestatic Zr : ([Lburp/Zbqc;)V
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   205: athrow
    //   206: aload #8
    //   208: sipush #-17502
    //   211: sipush #11979
    //   214: invokestatic a : (II)Ljava/lang/String;
    //   217: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   220: ifeq -> 231
    //   223: invokestatic Zp : ()Lburp/Ztil;
    //   226: areturn
    //   227: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   230: athrow
    //   231: iload_2
    //   232: ifne -> 72
    //   235: aload_0
    //   236: aload_1
    //   237: sipush #-17410
    //   240: sipush #12144
    //   243: invokestatic a : (II)Ljava/lang/String;
    //   246: invokevirtual Zs : (Lburp/Zb6q;Ljava/lang/String;)Z
    //   249: ifeq -> 303
    //   252: aload #5
    //   254: aload_1
    //   255: sipush #-17445
    //   258: sipush #19134
    //   261: invokestatic a : (II)Ljava/lang/String;
    //   264: invokeinterface ZY : (Ljava/lang/String;)Ljava/util/Optional;
    //   269: invokevirtual orElseThrow : ()Ljava/lang/Object;
    //   272: checkcast java/lang/String
    //   275: sipush #-17428
    //   278: sipush #-21920
    //   281: invokestatic a : (II)Ljava/lang/String;
    //   284: swap
    //   285: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   290: invokeinterface add : (Ljava/lang/Object;)Z
    //   295: pop
    //   296: goto -> 303
    //   299: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   302: athrow
    //   303: aload_0
    //   304: aload_1
    //   305: sipush #-17420
    //   308: sipush #-24876
    //   311: invokestatic a : (II)Ljava/lang/String;
    //   314: invokevirtual Zs : (Lburp/Zb6q;Ljava/lang/String;)Z
    //   317: ifeq -> 371
    //   320: aload #5
    //   322: aload_1
    //   323: sipush #-17458
    //   326: sipush #-12914
    //   329: invokestatic a : (II)Ljava/lang/String;
    //   332: invokeinterface ZY : (Ljava/lang/String;)Ljava/util/Optional;
    //   337: invokevirtual orElseThrow : ()Ljava/lang/Object;
    //   340: checkcast java/lang/String
    //   343: sipush #-17468
    //   346: sipush #-25354
    //   349: invokestatic a : (II)Ljava/lang/String;
    //   352: swap
    //   353: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   358: invokeinterface add : (Ljava/lang/Object;)Z
    //   363: pop
    //   364: goto -> 371
    //   367: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   370: athrow
    //   371: aload_1
    //   372: sipush #-17412
    //   375: sipush #-3514
    //   378: invokestatic a : (II)Ljava/lang/String;
    //   381: invokeinterface ZY : (Ljava/lang/String;)Ljava/util/Optional;
    //   386: astore #6
    //   388: aload #6
    //   390: invokevirtual isPresent : ()Z
    //   393: ifeq -> 507
    //   396: aload #6
    //   398: invokevirtual get : ()Ljava/lang/Object;
    //   401: checkcast java/lang/String
    //   404: astore #7
    //   406: getstatic burp/Zzp9.Zq : Ljava/util/List;
    //   409: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   414: aload #7
    //   416: dup
    //   417: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   420: pop
    //   421: <illegal opcode> test : (Ljava/lang/String;)Ljava/util/function/Predicate;
    //   426: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   431: ifeq -> 463
    //   434: aload_1
    //   435: aload #7
    //   437: sipush #-17453
    //   440: sipush #21785
    //   443: invokestatic a : (II)Ljava/lang/String;
    //   446: swap
    //   447: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   452: invokestatic of : (Ljava/lang/Object;)Ljava/util/List;
    //   455: invokestatic Zt : (Lburp/Zb6q;Ljava/util/List;)Lburp/Ztil;
    //   458: areturn
    //   459: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   462: athrow
    //   463: getstatic burp/Zzp9.Zz : Ljava/util/List;
    //   466: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   471: aload #7
    //   473: dup
    //   474: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   477: pop
    //   478: <illegal opcode> test : (Ljava/lang/String;)Ljava/util/function/Predicate;
    //   483: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   488: invokeinterface findFirst : ()Ljava/util/Optional;
    //   493: astore #8
    //   495: aload #8
    //   497: aload #5
    //   499: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
    //   504: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   507: aload #5
    //   509: invokeinterface isEmpty : ()Z
    //   514: ifne -> 528
    //   517: aload_1
    //   518: aload #5
    //   520: invokestatic Zd : (Lburp/Zb6q;Ljava/util/List;)Lburp/Ztil;
    //   523: areturn
    //   524: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   527: athrow
    //   528: invokestatic Zp : ()Lburp/Ztil;
    //   531: areturn
    // Exception table:
    //   from	to	target	type
    //   113	147	150	java/lang/NumberFormatException
    //   130	185	188	java/lang/NumberFormatException
    //   154	199	202	java/lang/NumberFormatException
    //   206	227	227	java/lang/NumberFormatException
    //   235	296	299	java/lang/NumberFormatException
    //   303	364	367	java/lang/NumberFormatException
    //   406	459	459	java/lang/NumberFormatException
    //   507	524	524	java/lang/NumberFormatException
  }
  
  boolean ZR(List<Zb6q> paramList) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   6: aload_0
    //   7: <illegal opcode> test : (Lburp/Zzp9;)Ljava/util/function/Predicate;
    //   12: invokeinterface allMatch : (Ljava/util/function/Predicate;)Z
    //   17: ifeq -> 33
    //   20: aload_0
    //   21: getfield ZE : Lburp/Zevv;
    //   24: invokevirtual Zv : ()V
    //   27: iconst_0
    //   28: ireturn
    //   29: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   32: athrow
    //   33: aload_1
    //   34: invokeinterface getFirst : ()Ljava/lang/Object;
    //   39: checkcast burp/Zb6q
    //   42: invokeinterface Za : ()Lburp/Zstu;
    //   47: astore_2
    //   48: aload_0
    //   49: getfield ZI : Lburp/Ze3n;
    //   52: invokevirtual ZA : ()Lburp/Zefx;
    //   55: invokeinterface ZF : ()Lburp/Zlit;
    //   60: astore_3
    //   61: aload_0
    //   62: aload_3
    //   63: aload_2
    //   64: invokevirtual ZR : (Lburp/Zlit;Lburp/Zstu;)Lburp/Zs6y;
    //   67: astore #4
    //   69: new burp/Zl13
    //   72: dup
    //   73: aload #4
    //   75: invokespecial <init> : (Lburp/Zs6y;)V
    //   78: astore #5
    //   80: aload_1
    //   81: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   86: lconst_1
    //   87: invokeinterface skip : (J)Ljava/util/stream/Stream;
    //   92: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   97: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   102: aload_0
    //   103: aload_3
    //   104: <illegal opcode> apply : (Lburp/Zzp9;Lburp/Zlit;)Ljava/util/function/Function;
    //   109: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   114: aload #5
    //   116: dup
    //   117: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   120: pop
    //   121: <illegal opcode> test : (Lburp/Zl13;)Ljava/util/function/Predicate;
    //   126: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   131: istore #6
    //   133: iload #6
    //   135: ifeq -> 152
    //   138: aload_0
    //   139: getfield ZE : Lburp/Zevv;
    //   142: invokevirtual Zz : ()V
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   151: athrow
    //   152: iload #6
    //   154: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	29	29	java/lang/NumberFormatException
    //   133	145	148	java/lang/NumberFormatException
  }
  
  private Zs6y ZR(Zlit paramZlit, Zstu paramZstu) {
    Zs68 zs68 = Zbwc.Zt(paramZlit, paramZstu, Zt0k.HTML_ANALYSIS, this.ZQ);
    List<Zg8y> list = (new Zm4c<>(this.ZQ)).Zn().Zw().ZW(Zski.Zf(paramZlit), zs68);
    return (new Zk1s()).Zx(paramZstu, zs68).Zw(list).ZF();
  }
  
  private List<Zb6q> ZQ() {
    int i = Zy();
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    byte b1 = this.ZA.ZqT().ZH(Zlk4.THOROUGH) ? 4 : 3;
    ArrayList<Zb6q> arrayList = new ArrayList(b1);
    arrayList.add(this.ZI.ZL());
    byte b2 = 0;
    while (b2 < b1) {
      arrayList.add(this.ZI.Zr().ZG().Ze());
      b2++;
      if (i == 0)
        break; 
    } 
    return arrayList;
  }
  
  private List<Zg3d> ZU(Zlv5 paramZlv5) {
    int i = Z_();
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    byte b1 = this.ZA.ZqT().ZH(Zlk4.THOROUGH) ? 4 : 3;
    ArrayList<Zg3d> arrayList = new ArrayList(b1);
    byte b2 = 0;
    while (b2 < b1) {
      arrayList.add(this.ZI.Zr(paramZlv5).ZBB().ZG());
      b2++;
      if (i != 0)
        break; 
    } 
    return arrayList;
  }
  
  private boolean Zs(Zb6q paramZb6q, String paramString) {
    return paramZb6q.ZY(paramString).map(this::ZD).filter(Zzp9::lambda$hasHeaderWithNonZeroValue$16).isPresent();
  }
  
  private int ZD(String paramString) {
    try {
      return Integer.parseInt(paramString);
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.COMMON_RUNTIME_FAILURE);
      return -1;
    } 
  }
  
  private boolean Zb(String paramString1, String paramString2, String paramString3, List<Zb6q> paramList) {
    // Byte code:
    //   0: new burp/Zlv5
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: aload_1
    //   8: aload_2
    //   9: aload_3
    //   10: <illegal opcode> Zv : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lburp/Zrec;
    //   15: invokestatic Zu : (Lburp/Zrec;)Lburp/Zxgd;
    //   18: invokevirtual Za : (Lburp/Zxgd;)Lburp/Zlv5;
    //   21: astore #5
    //   23: aload_0
    //   24: aload #5
    //   26: aload_1
    //   27: aload_2
    //   28: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   33: aload #4
    //   35: invokevirtual ZL : (Lburp/Zlv5;Ljava/lang/String;Ljava/util/List;)Z
    //   38: ireturn
  }
  
  private boolean ZL(Zlv5 paramZlv5, String paramString, List<Zb6q> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual ZU : (Lburp/Zlv5;)Ljava/util/List;
    //   5: astore #4
    //   7: aload #4
    //   9: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   14: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   19: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   24: invokeinterface toList : ()Ljava/util/List;
    //   29: astore #5
    //   31: aload_0
    //   32: aload #5
    //   34: invokeinterface getFirst : ()Ljava/lang/Object;
    //   39: checkcast burp/Zb6q
    //   42: invokevirtual Zk : (Lburp/Zb6q;)Z
    //   45: ifeq -> 271
    //   48: aload_0
    //   49: aload #5
    //   51: aload_3
    //   52: invokevirtual ZH : (Ljava/util/List;Ljava/util/List;)Z
    //   55: ifne -> 271
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   64: athrow
    //   65: aload #5
    //   67: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   72: aload_0
    //   73: <illegal opcode> apply : (Lburp/Zzp9;)Ljava/util/function/Function;
    //   78: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   83: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   88: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   93: invokeinterface findFirst : ()Ljava/util/Optional;
    //   98: astore #6
    //   100: aload #6
    //   102: invokevirtual isPresent : ()Z
    //   105: ifeq -> 269
    //   108: new java/util/LinkedList
    //   111: dup
    //   112: invokespecial <init> : ()V
    //   115: astore #7
    //   117: aload #4
    //   119: invokeinterface getFirst : ()Ljava/lang/Object;
    //   124: checkcast burp/Zg3d
    //   127: invokeinterface ZR : ()Lburp/Zefx;
    //   132: astore #8
    //   134: aload_2
    //   135: aload #8
    //   137: invokeinterface ZD : ()[B
    //   142: iconst_0
    //   143: aload #8
    //   145: invokeinterface ZR : ()I
    //   150: aload #7
    //   152: iconst_0
    //   153: invokestatic Zm : (Ljava/lang/String;[BIILjava/util/List;Z)V
    //   156: aload_0
    //   157: getfield ZE : Lburp/Zevv;
    //   160: getstatic burp/Ztz3.CANARY : Lburp/Ztz3;
    //   163: aload_2
    //   164: invokevirtual Zt : (Lburp/Ztz3;Ljava/lang/String;)V
    //   167: aload_0
    //   168: getfield ZE : Lburp/Zevv;
    //   171: aload #8
    //   173: aload #7
    //   175: aload #4
    //   177: invokeinterface getFirst : ()Ljava/lang/Object;
    //   182: checkcast burp/Zg3d
    //   185: invokeinterface Ze : ()Lburp/Zb6q;
    //   190: invokestatic emptyList : ()Ljava/util/List;
    //   193: invokevirtual ZG : (Lburp/Zefx;Ljava/util/List;Lburp/Zb6q;Ljava/util/List;)V
    //   196: new java/util/LinkedList
    //   199: dup
    //   200: invokespecial <init> : ()V
    //   203: astore #9
    //   205: aload #6
    //   207: invokevirtual get : ()Ljava/lang/Object;
    //   210: checkcast burp/Ztil
    //   213: invokevirtual Zp_ : ()Lburp/Zb6q;
    //   216: astore #10
    //   218: aload #6
    //   220: invokevirtual get : ()Ljava/lang/Object;
    //   223: checkcast burp/Ztil
    //   226: invokevirtual Zpy : ()Ljava/util/List;
    //   229: aload #10
    //   231: aload #9
    //   233: <illegal opcode> accept : (Lburp/Zb6q;Ljava/util/List;)Ljava/util/function/Consumer;
    //   238: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   243: aload_0
    //   244: getfield ZE : Lburp/Zevv;
    //   247: aload #8
    //   249: aload #7
    //   251: aload #6
    //   253: invokevirtual get : ()Ljava/lang/Object;
    //   256: checkcast burp/Ztil
    //   259: invokevirtual Zp_ : ()Lburp/Zb6q;
    //   262: aload #9
    //   264: invokevirtual ZG : (Lburp/Zefx;Ljava/util/List;Lburp/Zb6q;Ljava/util/List;)V
    //   267: iconst_1
    //   268: ireturn
    //   269: iconst_0
    //   270: ireturn
    //   271: iconst_0
    //   272: ireturn
    // Exception table:
    //   from	to	target	type
    //   31	58	61	java/lang/NumberFormatException
  }
  
  private boolean Zk(Zb6q paramZb6q) {
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return (paramZb6q.Ze() == this.ZI.ZL().Ze());
  }
  
  private boolean ZH(List<Zb6q> paramList1, List<Zb6q> paramList2) {
    Zl13 zl13 = new Zl13(ZR(this.ZI.ZA().ZF(), ((Zb6q)paramList2.getFirst()).Za()));
    try {
      Objects.requireNonNull(zl13);
      paramList2.stream().map(Zb6q::Za).map(this::lambda$differsFromBaseResponse$19).forEach(zl13::Zk);
      if (!zl13.Zr())
        return true; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    Objects.requireNonNull(zl13);
    return paramList1.stream().map(Zb6q::Za).map(this::lambda$differsFromBaseResponse$19).anyMatch(zl13::Zk);
  }
  
  private Zs6y lambda$differsFromBaseResponse$19(Zstu paramZstu) {
    return ZR(this.ZI.ZA().ZF(), paramZstu);
  }
  
  private static void lambda$testForDiscrepancy$18(Zb6q paramZb6q, List<Zl1r> paramList, String paramString) {
    Zl8v.Zm(paramString, paramZb6q.Za().ZiD(), 0, paramZb6q.Zs(), paramList, false);
  }
  
  private static Zefx lambda$hasParsingDiscrepancyForCharacter$17(String paramString1, String paramString2, String paramString3, Zefx paramZefx) {
    if (paramString1.equals("?")) {
      Zefx zefx = paramZefx.ZH(Zlou.Z_(Zrdu.URL_PARAM, paramString2, null));
      String str = Zkb.ZG(zefx.ZF().ZdC());
      return paramZefx.Zc(str.substring(0, str.length() - 1));
    } 
    return paramZefx.ZU(paramString3 + paramString3 + paramString1);
  }
  
  private static boolean lambda$hasHeaderWithNonZeroValue$16(Integer paramInteger) {
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return (paramInteger.intValue() > 0);
  }
  
  private Zs6y lambda$isDynamicResource$15(Zlit paramZlit, Zstu paramZstu) {
    return ZR(paramZlit, paramZstu);
  }
  
  private boolean lambda$isDynamicResource$14(Zb6q paramZb6q) {
    return paramZb6q.Zt().equals(this.ZI.ZL().Zt());
  }
  
  private static void lambda$isCachable$13(List<String> paramList, String paramString) {
    paramList.add(a(-17485, 2157) + a(-17485, 2157));
  }
  
  private static boolean lambda$isCachable$12(String paramString) {
    return paramString.toLowerCase().contains(a(-17466, -3433));
  }
  
  private static String lambda$isCachable$11(String paramString) {
    return paramString.substring(0, paramString.indexOf(":"));
  }
  
  private static boolean lambda$isCachable$10(String paramString) {
    return paramString.contains(":");
  }
  
  private static Zefx lambda$hasUrlMappingDiscrepancy$9(String paramString1, String paramString2, Zefx paramZefx) {
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return paramZefx.ZU(paramString1.endsWith("/") ? (paramString1 + paramString1) : (paramString1 + "/" + paramString1));
  }
  
  private boolean lambda$hasUrlParsingDiscrepancy$8(String paramString1, String paramString2, List<Zb6q> paramList, String paramString3) {
    return Zb(paramString3, paramString1, paramString2, paramList);
  }
  
  private Zstu lambda$isResourceAuthenticated$7(Zlv5 paramZlv5) {
    return this.ZI.Zr(paramZlv5).ZBB().ZG().Ze().Za();
  }
  
  private Zstu lambda$isResourceAuthenticated$6() {
    return this.ZI.Zr().ZG().Ze().Za();
  }
  
  private static Zefx lambda$isResourceAuthenticated$5(Zefx paramZefx) {
    return paramZefx.ZY(a(-17486, 6804)).ZY(a(-17437, 30320));
  }
  
  private static boolean lambda$isResourceAuthenticated$4(String paramString) {
    try {
      if (!paramString.startsWith(a(-17440, 1682))) {
        try {
          if (paramString.startsWith(a(-17457, -1604)));
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  private static String lambda$identifyHostServerCombination$3(String paramString) {
    return paramString.substring(a(-17438, 1073).length()).strip();
  }
  
  private static boolean lambda$identifyHostServerCombination$2(String paramString) {
    return paramString.startsWith(a(-17496, 17519));
  }
  
  private void lambda$doCheck$1(Zbsn paramZbsn) {
    this.Zc.Z_(paramZbsn);
  }
  
  private void lambda$doCheck$0(Zbsn paramZbsn) {
    this.Zc.ZP(paramZbsn);
  }
  
  static {
    // Byte code:
    //   0: bipush #95
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '$ó?­@:^I¾U¦ýË)uäZ÷=YñM¾VÎÆ9=~Hã)Çz_K\\f´SÜªmo\\tííóÉ\\r(7¼ëÂÀÈ<±Ä¢?BÒèL·4*ýüj¢\\b+Tå´kr¸Ö4%Æß}\\b,Ð«ÚªjRâÈFÊÿC`ÇÑºà{êV¯Å ÿªú0X.*Õã,BD­k­YæÙxF0,¹½gjÆôA¬$Ñ®ªñýÆMí4èýDeÏ±\\bmÍ}q!_öÁJ{Î%WG!Î\\fÊ`Ìi¡PîÞå´éD«\\r*_HP^ÊPc±!'³° ËrÑï®i"Øh;âíÂã¸f%À©;^ÆSVL(/\\tÒÃ ²;4¿­vÔ© Í¾Ñ8fÐºC·×«ÀãÞ³_Dç©\\r¥HqD>`2rÊ0\\fäðâíHÏ?\\nÏ×%c£3Á?÷B7ùØ\\t¤-rì?oØ,§Øïý´Îdæf-UNE7¨T0~êè_°ºø·>¹ïæ*ç5¸\\bö2Ý¯$e]¥má¥Úó*XuÂuË»Â)CHçL+mû'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_0
    //   19: bipush #9
    //   21: istore_1
    //   22: invokestatic Zz : (I)V
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #72
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 146
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
    //   72: ldc '"´XÃ7B'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: iconst_3
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #38
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic burp/Zzp9.a : [Ljava/lang/String;
    //   135: bipush #95
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zzp9.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #57
    //   218: goto -> 248
    //   221: bipush #74
    //   223: goto -> 248
    //   226: bipush #56
    //   228: goto -> 248
    //   231: bipush #33
    //   233: goto -> 248
    //   236: bipush #33
    //   238: goto -> 248
    //   241: bipush #120
    //   243: goto -> 248
    //   246: bipush #114
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 102
    //   304: sipush #-17463
    //   307: sipush #13396
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: sipush #-17503
    //   316: sipush #31720
    //   319: invokestatic a : (II)Ljava/lang/String;
    //   322: sipush #-17449
    //   325: sipush #-21635
    //   328: invokestatic a : (II)Ljava/lang/String;
    //   331: sipush #-17477
    //   334: sipush #19381
    //   337: invokestatic a : (II)Ljava/lang/String;
    //   340: sipush #-17482
    //   343: sipush #26487
    //   346: invokestatic a : (II)Ljava/lang/String;
    //   349: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   352: putstatic burp/Zzp9.Zq : Ljava/util/List;
    //   355: sipush #-17478
    //   358: sipush #-18706
    //   361: invokestatic a : (II)Ljava/lang/String;
    //   364: sipush #-17435
    //   367: sipush #30662
    //   370: invokestatic a : (II)Ljava/lang/String;
    //   373: sipush #-17433
    //   376: sipush #3388
    //   379: invokestatic a : (II)Ljava/lang/String;
    //   382: sipush #-17421
    //   385: sipush #30272
    //   388: invokestatic a : (II)Ljava/lang/String;
    //   391: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   394: putstatic burp/Zzp9.Zz : Ljava/util/List;
    //   397: sipush #-17414
    //   400: ldc ';'
    //   402: ldc '?'
    //   404: ldc ':'
    //   406: ldc '@'
    //   408: ldc '='
    //   410: ldc '&'
    //   412: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   415: putstatic burp/Zzp9.ZD : Ljava/util/List;
    //   418: sipush #-24387
    //   421: invokestatic a : (II)Ljava/lang/String;
    //   424: sipush #-17487
    //   427: sipush #-25812
    //   430: invokestatic a : (II)Ljava/lang/String;
    //   433: sipush #-17442
    //   436: sipush #26489
    //   439: invokestatic a : (II)Ljava/lang/String;
    //   442: sipush #-17493
    //   445: sipush #26491
    //   448: invokestatic a : (II)Ljava/lang/String;
    //   451: sipush #-17491
    //   454: sipush #-28897
    //   457: invokestatic a : (II)Ljava/lang/String;
    //   460: sipush #-17479
    //   463: sipush #13386
    //   466: invokestatic a : (II)Ljava/lang/String;
    //   469: sipush #-17418
    //   472: sipush #-20667
    //   475: invokestatic a : (II)Ljava/lang/String;
    //   478: sipush #-17474
    //   481: sipush #2350
    //   484: invokestatic a : (II)Ljava/lang/String;
    //   487: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   490: putstatic burp/Zzp9.ZS : Ljava/util/List;
    //   493: bipush #56
    //   495: anewarray java/lang/String
    //   498: dup
    //   499: iconst_0
    //   500: sipush #-17498
    //   503: sipush #-27657
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: aastore
    //   510: dup
    //   511: iconst_1
    //   512: sipush #-17439
    //   515: sipush #29815
    //   518: invokestatic a : (II)Ljava/lang/String;
    //   521: aastore
    //   522: dup
    //   523: iconst_2
    //   524: sipush #-17411
    //   527: sipush #-17343
    //   530: invokestatic a : (II)Ljava/lang/String;
    //   533: aastore
    //   534: dup
    //   535: iconst_3
    //   536: sipush #-17480
    //   539: sipush #16548
    //   542: invokestatic a : (II)Ljava/lang/String;
    //   545: aastore
    //   546: dup
    //   547: iconst_4
    //   548: sipush #-17450
    //   551: sipush #-3894
    //   554: invokestatic a : (II)Ljava/lang/String;
    //   557: aastore
    //   558: dup
    //   559: iconst_5
    //   560: sipush #-17443
    //   563: sipush #1477
    //   566: invokestatic a : (II)Ljava/lang/String;
    //   569: aastore
    //   570: dup
    //   571: bipush #6
    //   573: sipush #-17423
    //   576: sipush #-30882
    //   579: invokestatic a : (II)Ljava/lang/String;
    //   582: aastore
    //   583: dup
    //   584: bipush #7
    //   586: sipush #-17476
    //   589: sipush #19354
    //   592: invokestatic a : (II)Ljava/lang/String;
    //   595: aastore
    //   596: dup
    //   597: bipush #8
    //   599: sipush #-17471
    //   602: sipush #20694
    //   605: invokestatic a : (II)Ljava/lang/String;
    //   608: aastore
    //   609: dup
    //   610: bipush #9
    //   612: sipush #-17497
    //   615: sipush #3259
    //   618: invokestatic a : (II)Ljava/lang/String;
    //   621: aastore
    //   622: dup
    //   623: bipush #10
    //   625: sipush #-17467
    //   628: sipush #20875
    //   631: invokestatic a : (II)Ljava/lang/String;
    //   634: aastore
    //   635: dup
    //   636: bipush #11
    //   638: sipush #-17424
    //   641: sipush #17134
    //   644: invokestatic a : (II)Ljava/lang/String;
    //   647: aastore
    //   648: dup
    //   649: bipush #12
    //   651: sipush #-17481
    //   654: sipush #19181
    //   657: invokestatic a : (II)Ljava/lang/String;
    //   660: aastore
    //   661: dup
    //   662: bipush #13
    //   664: sipush #-17415
    //   667: sipush #-2820
    //   670: invokestatic a : (II)Ljava/lang/String;
    //   673: aastore
    //   674: dup
    //   675: bipush #14
    //   677: sipush #-17488
    //   680: sipush #-7919
    //   683: invokestatic a : (II)Ljava/lang/String;
    //   686: aastore
    //   687: dup
    //   688: bipush #15
    //   690: sipush #-17501
    //   693: sipush #22337
    //   696: invokestatic a : (II)Ljava/lang/String;
    //   699: aastore
    //   700: dup
    //   701: bipush #16
    //   703: sipush #-17499
    //   706: sipush #23949
    //   709: invokestatic a : (II)Ljava/lang/String;
    //   712: aastore
    //   713: dup
    //   714: bipush #17
    //   716: sipush #-17454
    //   719: sipush #-20824
    //   722: invokestatic a : (II)Ljava/lang/String;
    //   725: aastore
    //   726: dup
    //   727: bipush #18
    //   729: sipush #-17464
    //   732: sipush #9244
    //   735: invokestatic a : (II)Ljava/lang/String;
    //   738: aastore
    //   739: dup
    //   740: bipush #19
    //   742: sipush #-17460
    //   745: sipush #19580
    //   748: invokestatic a : (II)Ljava/lang/String;
    //   751: aastore
    //   752: dup
    //   753: bipush #20
    //   755: sipush #-17447
    //   758: sipush #6105
    //   761: invokestatic a : (II)Ljava/lang/String;
    //   764: aastore
    //   765: dup
    //   766: bipush #21
    //   768: sipush #-17448
    //   771: sipush #10552
    //   774: invokestatic a : (II)Ljava/lang/String;
    //   777: aastore
    //   778: dup
    //   779: bipush #22
    //   781: sipush #-17494
    //   784: sipush #14707
    //   787: invokestatic a : (II)Ljava/lang/String;
    //   790: aastore
    //   791: dup
    //   792: bipush #23
    //   794: sipush #-17451
    //   797: sipush #2179
    //   800: invokestatic a : (II)Ljava/lang/String;
    //   803: aastore
    //   804: dup
    //   805: bipush #24
    //   807: sipush #-17469
    //   810: sipush #-3624
    //   813: invokestatic a : (II)Ljava/lang/String;
    //   816: aastore
    //   817: dup
    //   818: bipush #25
    //   820: sipush #-17461
    //   823: sipush #-10912
    //   826: invokestatic a : (II)Ljava/lang/String;
    //   829: aastore
    //   830: dup
    //   831: bipush #26
    //   833: sipush #-17434
    //   836: sipush #-17912
    //   839: invokestatic a : (II)Ljava/lang/String;
    //   842: aastore
    //   843: dup
    //   844: bipush #27
    //   846: sipush #-17455
    //   849: sipush #20831
    //   852: invokestatic a : (II)Ljava/lang/String;
    //   855: aastore
    //   856: dup
    //   857: bipush #28
    //   859: sipush #-17430
    //   862: sipush #19661
    //   865: invokestatic a : (II)Ljava/lang/String;
    //   868: aastore
    //   869: dup
    //   870: bipush #29
    //   872: sipush #-17490
    //   875: sipush #-27288
    //   878: invokestatic a : (II)Ljava/lang/String;
    //   881: aastore
    //   882: dup
    //   883: bipush #30
    //   885: sipush #-17489
    //   888: sipush #-30438
    //   891: invokestatic a : (II)Ljava/lang/String;
    //   894: aastore
    //   895: dup
    //   896: bipush #31
    //   898: sipush #-17470
    //   901: sipush #29489
    //   904: invokestatic a : (II)Ljava/lang/String;
    //   907: aastore
    //   908: dup
    //   909: bipush #32
    //   911: sipush #-17409
    //   914: sipush #-5340
    //   917: invokestatic a : (II)Ljava/lang/String;
    //   920: aastore
    //   921: dup
    //   922: bipush #33
    //   924: sipush #-17416
    //   927: sipush #-25096
    //   930: invokestatic a : (II)Ljava/lang/String;
    //   933: aastore
    //   934: dup
    //   935: bipush #34
    //   937: sipush #-17484
    //   940: sipush #23774
    //   943: invokestatic a : (II)Ljava/lang/String;
    //   946: aastore
    //   947: dup
    //   948: bipush #35
    //   950: sipush #-17431
    //   953: sipush #245
    //   956: invokestatic a : (II)Ljava/lang/String;
    //   959: aastore
    //   960: dup
    //   961: bipush #36
    //   963: sipush #-17495
    //   966: sipush #23539
    //   969: invokestatic a : (II)Ljava/lang/String;
    //   972: aastore
    //   973: dup
    //   974: bipush #37
    //   976: sipush #-17483
    //   979: sipush #-1190
    //   982: invokestatic a : (II)Ljava/lang/String;
    //   985: aastore
    //   986: dup
    //   987: bipush #38
    //   989: sipush #-17419
    //   992: sipush #-20624
    //   995: invokestatic a : (II)Ljava/lang/String;
    //   998: aastore
    //   999: dup
    //   1000: bipush #39
    //   1002: sipush #-17413
    //   1005: sipush #9611
    //   1008: invokestatic a : (II)Ljava/lang/String;
    //   1011: aastore
    //   1012: dup
    //   1013: bipush #40
    //   1015: sipush #-17427
    //   1018: sipush #24508
    //   1021: invokestatic a : (II)Ljava/lang/String;
    //   1024: aastore
    //   1025: dup
    //   1026: bipush #41
    //   1028: sipush #-17436
    //   1031: sipush #-18682
    //   1034: invokestatic a : (II)Ljava/lang/String;
    //   1037: aastore
    //   1038: dup
    //   1039: bipush #42
    //   1041: sipush #-17472
    //   1044: sipush #26148
    //   1047: invokestatic a : (II)Ljava/lang/String;
    //   1050: aastore
    //   1051: dup
    //   1052: bipush #43
    //   1054: sipush #-17500
    //   1057: sipush #19928
    //   1060: invokestatic a : (II)Ljava/lang/String;
    //   1063: aastore
    //   1064: dup
    //   1065: bipush #44
    //   1067: sipush #-17459
    //   1070: sipush #5687
    //   1073: invokestatic a : (II)Ljava/lang/String;
    //   1076: aastore
    //   1077: dup
    //   1078: bipush #45
    //   1080: sipush #-17429
    //   1083: sipush #24595
    //   1086: invokestatic a : (II)Ljava/lang/String;
    //   1089: aastore
    //   1090: dup
    //   1091: bipush #46
    //   1093: sipush #-17444
    //   1096: sipush #-21164
    //   1099: invokestatic a : (II)Ljava/lang/String;
    //   1102: aastore
    //   1103: dup
    //   1104: bipush #47
    //   1106: sipush #-17456
    //   1109: sipush #26526
    //   1112: invokestatic a : (II)Ljava/lang/String;
    //   1115: aastore
    //   1116: dup
    //   1117: bipush #48
    //   1119: sipush #-17425
    //   1122: sipush #-24674
    //   1125: invokestatic a : (II)Ljava/lang/String;
    //   1128: aastore
    //   1129: dup
    //   1130: bipush #49
    //   1132: sipush #-17465
    //   1135: sipush #25499
    //   1138: invokestatic a : (II)Ljava/lang/String;
    //   1141: aastore
    //   1142: dup
    //   1143: bipush #50
    //   1145: sipush #-17452
    //   1148: sipush #16196
    //   1151: invokestatic a : (II)Ljava/lang/String;
    //   1154: aastore
    //   1155: dup
    //   1156: bipush #51
    //   1158: sipush #-17475
    //   1161: sipush #-25521
    //   1164: invokestatic a : (II)Ljava/lang/String;
    //   1167: aastore
    //   1168: dup
    //   1169: bipush #52
    //   1171: sipush #-17462
    //   1174: sipush #-32687
    //   1177: invokestatic a : (II)Ljava/lang/String;
    //   1180: aastore
    //   1181: dup
    //   1182: bipush #53
    //   1184: sipush #-17473
    //   1187: sipush #15906
    //   1190: invokestatic a : (II)Ljava/lang/String;
    //   1193: aastore
    //   1194: dup
    //   1195: bipush #54
    //   1197: sipush #-17446
    //   1200: sipush #23876
    //   1203: invokestatic a : (II)Ljava/lang/String;
    //   1206: aastore
    //   1207: dup
    //   1208: bipush #55
    //   1210: sipush #-17422
    //   1213: sipush #-26604
    //   1216: invokestatic a : (II)Ljava/lang/String;
    //   1219: aastore
    //   1220: invokestatic of : ([Ljava/lang/Object;)Ljava/util/Set;
    //   1223: putstatic burp/Zzp9.ZV : Ljava/util/Set;
    //   1226: return
  }
  
  public static void Zz(int paramInt) {
    ZC = paramInt;
  }
  
  public static int Z_() {
    return ZC;
  }
  
  public static int Zy() {
    int i = Z_();
    try {
      if (i == 0)
        return 39; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBBF3) & 0xFFFF;
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
      byte b1 = 5;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzp9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */