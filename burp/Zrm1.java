package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;

public class Zrm1 implements Zm3g {
  private final List<Zedo> ZF;
  
  private final Zgb6 Zo;
  
  private final List<Zm30> ZC;
  
  private final List<Zm30> ZO;
  
  private final Zmzz Z_;
  
  private final Zmzz Zr;
  
  private final Zefg<Zsdr> Zs;
  
  private final Zefg<Zsdr> Zq;
  
  private final ReadWriteLock Zn;
  
  private final List<String> Zc;
  
  private final List<String> ZJ;
  
  private final String[] Zm;
  
  private final String[] Zx;
  
  private final String[] Zj;
  
  private final String[] Zf;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrm1(Zgb6 paramZgb6, Zr_4 paramZr_4) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic ZV : ()Ljava/lang/String;
    //   7: aload_0
    //   8: new java/util/ArrayList
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: putfield ZF : Ljava/util/List;
    //   18: aload_0
    //   19: new java/util/ArrayList
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: putfield ZC : Ljava/util/List;
    //   29: aload_0
    //   30: new java/util/ArrayList
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: putfield ZO : Ljava/util/List;
    //   40: aload_0
    //   41: new java/util/concurrent/locks/ReentrantReadWriteLock
    //   44: dup
    //   45: invokespecial <init> : ()V
    //   48: putfield Zn : Ljava/util/concurrent/locks/ReadWriteLock;
    //   51: aload_0
    //   52: aload_1
    //   53: putfield Zo : Lburp/Zgb6;
    //   56: aload_0
    //   57: <illegal opcode> Zo : (Lburp/Zrm1;)Lburp/Zmfm;
    //   62: astore #4
    //   64: aload_1
    //   65: aload_0
    //   66: invokeinterface Zd : (Lburp/Zm3g;)V
    //   71: aload_1
    //   72: aload #4
    //   74: invokeinterface Zm : (Lburp/Zmfm;)V
    //   79: aload_0
    //   80: aload_1
    //   81: invokeinterface ZfR : ()Lburp/Zefg;
    //   86: putfield Zs : Lburp/Zefg;
    //   89: aload_0
    //   90: aload_1
    //   91: invokeinterface ZfB : ()Lburp/Zefg;
    //   96: putfield Zq : Lburp/Zefg;
    //   99: aload_0
    //   100: invokestatic ZH : ()Ljava/util/List;
    //   103: putfield Zc : Ljava/util/List;
    //   106: aload_0
    //   107: aload_0
    //   108: getfield Zc : Ljava/util/List;
    //   111: iconst_0
    //   112: anewarray java/lang/String
    //   115: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   120: checkcast [Ljava/lang/String;
    //   123: putfield Zm : [Ljava/lang/String;
    //   126: aload_0
    //   127: invokestatic Zt : ()Ljava/util/List;
    //   130: putfield ZJ : Ljava/util/List;
    //   133: aload_0
    //   134: aload_0
    //   135: getfield ZJ : Ljava/util/List;
    //   138: iconst_0
    //   139: anewarray java/lang/String
    //   142: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   147: checkcast [Ljava/lang/String;
    //   150: putfield Zx : [Ljava/lang/String;
    //   153: aload_0
    //   154: invokestatic Zz : ()Ljava/util/List;
    //   157: iconst_0
    //   158: anewarray java/lang/String
    //   161: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   166: checkcast [Ljava/lang/String;
    //   169: putfield Zj : [Ljava/lang/String;
    //   172: aload_0
    //   173: invokestatic ZZ : ()Ljava/util/List;
    //   176: iconst_0
    //   177: anewarray java/lang/String
    //   180: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   185: checkcast [Ljava/lang/String;
    //   188: putfield Zf : [Ljava/lang/String;
    //   191: aload_0
    //   192: aload_0
    //   193: aload_2
    //   194: <illegal opcode> ZT : (Lburp/Zrm1;Lburp/Zr_4;)Lburp/Zmzz;
    //   199: putfield Z_ : Lburp/Zmzz;
    //   202: astore_3
    //   203: aload_0
    //   204: aload_0
    //   205: aload_2
    //   206: <illegal opcode> ZT : (Lburp/Zrm1;Lburp/Zr_4;)Lburp/Zmzz;
    //   211: putfield Zr : Lburp/Zmzz;
    //   214: invokestatic Zwu : ()[Lburp/Zbqc;
    //   217: ifnonnull -> 225
    //   220: ldc 'hJpKic'
    //   222: invokestatic Zi : (Ljava/lang/String;)V
    //   225: return
  }
  
  public void ZY(Zedo... paramVarArgs) {
    Collections.addAll(this.ZF, paramVarArgs);
  }
  
  public List<Zm30> ZW() {
    Za();
    try {
      this.Zn.readLock().lock();
      return new ArrayList<>(this.ZC);
    } finally {
      this.Zn.readLock().unlock();
    } 
  }
  
  public List<Zm30> Zx() {
    Za();
    try {
      this.Zn.readLock().lock();
      return new ArrayList<>(this.ZO);
    } finally {
      this.Zn.readLock().unlock();
    } 
  }
  
  public String[] Zi() {
    if (this.Zo.Zfm() == Zbii.USE_PLATFORM_DEFAULTS)
      return this.Zm; 
    if (this.Zo.Zfm() == Zbii.USE_ALL_SUPPORTED)
      return this.Zj; 
    Za();
    try {
      this.Zn.readLock().lock();
      return Zw(this.Zs);
    } finally {
      this.Zn.readLock().unlock();
    } 
  }
  
  public String[] Zu() {
    if (this.Zo.Zfm() == Zbii.USE_PLATFORM_DEFAULTS)
      return this.Zx; 
    if (this.Zo.Zfm() == Zbii.USE_ALL_SUPPORTED)
      return this.Zf; 
    Za();
    try {
      this.Zn.readLock().lock();
      return Zw(this.Zq);
    } finally {
      this.Zn.readLock().unlock();
    } 
  }
  
  private String[] Zw(Zefg<Zsdr> paramZefg) {
    String[] arrayOfString = new String[paramZefg.size()];
    byte b = 0;
    String str = Zgkj.ZV();
    for (Zsdr zsdr : paramZefg) {
      arrayOfString[b++] = zsdr.toString();
      if (str != null)
        break; 
    } 
    return arrayOfString;
  }
  
  public void Zl(Zg4j paramZg4j) {
    if (this.Zo.Zfm() != Zbii.USE_CUSTOM) {
      paramZg4j.ZP(a(15367, 17822));
      paramZg4j.ZP(a(15364, 31834));
      return;
    } 
    Zm(ZW(), a(15367, 17822), paramZg4j);
    Zm(Zx(), a(15364, 31834), paramZg4j);
  }
  
  public void Zd(Zmf_ paramZmf_) {
    // Byte code:
    //   0: invokestatic ZV : ()Ljava/lang/String;
    //   3: astore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: aload_1
    //   7: sipush #15365
    //   10: sipush #-23854
    //   13: invokestatic a : (II)Ljava/lang/String;
    //   16: invokeinterface Zh : (Ljava/lang/String;)Z
    //   21: ifeq -> 92
    //   24: aload_0
    //   25: aload_0
    //   26: getfield Zs : Lburp/Zefg;
    //   29: aload_0
    //   30: invokevirtual ZW : ()Ljava/util/List;
    //   33: sipush #15367
    //   36: sipush #17822
    //   39: invokestatic a : (II)Ljava/lang/String;
    //   42: aload_1
    //   43: invokevirtual Zt : (Lburp/Zefg;Ljava/util/List;Ljava/lang/String;Lburp/Zmf_;)V
    //   46: aload_0
    //   47: getfield Zs : Lburp/Zefg;
    //   50: invokeinterface isEmpty : ()Z
    //   55: ifeq -> 78
    //   58: aload_0
    //   59: aload_0
    //   60: getfield Zs : Lburp/Zefg;
    //   63: aload_0
    //   64: getfield ZC : Ljava/util/List;
    //   67: aload_0
    //   68: getfield Zc : Ljava/util/List;
    //   71: invokevirtual ZY : (Lburp/Zefg;Ljava/util/List;Ljava/util/List;)V
    //   74: aload_2
    //   75: ifnull -> 90
    //   78: aload_0
    //   79: aload_0
    //   80: getfield Zs : Lburp/Zefg;
    //   83: aload_0
    //   84: getfield ZC : Ljava/util/List;
    //   87: invokevirtual Z_ : (Lburp/Zefg;Ljava/util/List;)V
    //   90: iconst_1
    //   91: istore_3
    //   92: aload_1
    //   93: sipush #15366
    //   96: sipush #25245
    //   99: invokestatic a : (II)Ljava/lang/String;
    //   102: invokeinterface Zh : (Ljava/lang/String;)Z
    //   107: ifeq -> 178
    //   110: aload_0
    //   111: aload_0
    //   112: getfield Zq : Lburp/Zefg;
    //   115: aload_0
    //   116: invokevirtual Zx : ()Ljava/util/List;
    //   119: sipush #15364
    //   122: sipush #31834
    //   125: invokestatic a : (II)Ljava/lang/String;
    //   128: aload_1
    //   129: invokevirtual Zt : (Lburp/Zefg;Ljava/util/List;Ljava/lang/String;Lburp/Zmf_;)V
    //   132: aload_0
    //   133: getfield Zq : Lburp/Zefg;
    //   136: invokeinterface isEmpty : ()Z
    //   141: ifeq -> 164
    //   144: aload_0
    //   145: aload_0
    //   146: getfield Zq : Lburp/Zefg;
    //   149: aload_0
    //   150: getfield ZO : Ljava/util/List;
    //   153: aload_0
    //   154: getfield ZJ : Ljava/util/List;
    //   157: invokevirtual ZY : (Lburp/Zefg;Ljava/util/List;Ljava/util/List;)V
    //   160: aload_2
    //   161: ifnull -> 176
    //   164: aload_0
    //   165: aload_0
    //   166: getfield Zq : Lburp/Zefg;
    //   169: aload_0
    //   170: getfield ZO : Ljava/util/List;
    //   173: invokevirtual Z_ : (Lburp/Zefg;Ljava/util/List;)V
    //   176: iconst_1
    //   177: istore_3
    //   178: iload_3
    //   179: ifeq -> 196
    //   182: aload_0
    //   183: getfield ZF : Ljava/util/List;
    //   186: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   191: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   196: return
  }
  
  private void Zm(List<Zm30> paramList, String paramString, Zg4j paramZg4j) {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<Zm30> iterator = paramList.iterator();
    String str = Zgkj.ZV();
    while (iterator.hasNext()) {
      Zm30 zm30 = iterator.next();
      if (zm30.Zt())
        arrayList.add(zm30.ZR()); 
      if (str != null)
        break; 
    } 
    Collections.sort(arrayList);
    Zzqw zzqw = paramZg4j.ZP(paramString);
    for (String str1 : arrayList) {
      zzqw.Zx(new Zzqs(str1));
      if (str != null)
        break; 
    } 
  }
  
  private void Zt(Zefg<Zsdr> paramZefg, List<Zm30> paramList, String paramString, Zmf_ paramZmf_) {
    List<String> list = paramZmf_.Ze(paramString);
    if (list != null)
      ZY(paramZefg, paramList, list); 
  }
  
  private void Za() {
    // Byte code:
    //   0: invokestatic ZV : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zo : Lburp/Zgb6;
    //   8: invokeinterface Zfm : ()Lburp/Zbii;
    //   13: getstatic burp/Zbii.USE_PLATFORM_DEFAULTS : Lburp/Zbii;
    //   16: if_acmpeq -> 34
    //   19: aload_0
    //   20: getfield Zo : Lburp/Zgb6;
    //   23: invokeinterface Zfm : ()Lburp/Zbii;
    //   28: getstatic burp/Zbii.USE_ALL_SUPPORTED : Lburp/Zbii;
    //   31: if_acmpne -> 35
    //   34: return
    //   35: aload_0
    //   36: getfield Zn : Ljava/util/concurrent/locks/ReadWriteLock;
    //   39: invokeinterface readLock : ()Ljava/util/concurrent/locks/Lock;
    //   44: invokeinterface lock : ()V
    //   49: aload_0
    //   50: getfield ZC : Ljava/util/List;
    //   53: invokeinterface isEmpty : ()Z
    //   58: ifne -> 73
    //   61: aload_0
    //   62: getfield ZO : Ljava/util/List;
    //   65: invokeinterface isEmpty : ()Z
    //   70: ifeq -> 77
    //   73: iconst_1
    //   74: goto -> 78
    //   77: iconst_0
    //   78: istore_2
    //   79: aload_0
    //   80: getfield Zn : Ljava/util/concurrent/locks/ReadWriteLock;
    //   83: invokeinterface readLock : ()Ljava/util/concurrent/locks/Lock;
    //   88: invokeinterface unlock : ()V
    //   93: goto -> 113
    //   96: astore_3
    //   97: aload_0
    //   98: getfield Zn : Ljava/util/concurrent/locks/ReadWriteLock;
    //   101: invokeinterface readLock : ()Ljava/util/concurrent/locks/Lock;
    //   106: invokeinterface unlock : ()V
    //   111: aload_3
    //   112: athrow
    //   113: iload_2
    //   114: ifeq -> 293
    //   117: aload_0
    //   118: getfield Zn : Ljava/util/concurrent/locks/ReadWriteLock;
    //   121: invokeinterface writeLock : ()Ljava/util/concurrent/locks/Lock;
    //   126: invokeinterface lock : ()V
    //   131: aload_0
    //   132: getfield ZC : Ljava/util/List;
    //   135: invokeinterface isEmpty : ()Z
    //   140: ifne -> 155
    //   143: aload_0
    //   144: getfield ZO : Ljava/util/List;
    //   147: invokeinterface isEmpty : ()Z
    //   152: ifeq -> 257
    //   155: aload_0
    //   156: invokevirtual ZX : ()V
    //   159: aload_0
    //   160: getfield Zs : Lburp/Zefg;
    //   163: invokeinterface isEmpty : ()Z
    //   168: ifeq -> 219
    //   171: aload_0
    //   172: getfield Zq : Lburp/Zefg;
    //   175: invokeinterface isEmpty : ()Z
    //   180: ifeq -> 219
    //   183: aload_0
    //   184: aload_0
    //   185: getfield Zs : Lburp/Zefg;
    //   188: aload_0
    //   189: getfield ZC : Ljava/util/List;
    //   192: aload_0
    //   193: getfield Zc : Ljava/util/List;
    //   196: invokevirtual ZY : (Lburp/Zefg;Ljava/util/List;Ljava/util/List;)V
    //   199: aload_0
    //   200: aload_0
    //   201: getfield Zq : Lburp/Zefg;
    //   204: aload_0
    //   205: getfield ZO : Ljava/util/List;
    //   208: aload_0
    //   209: getfield ZJ : Ljava/util/List;
    //   212: invokevirtual ZY : (Lburp/Zefg;Ljava/util/List;Ljava/util/List;)V
    //   215: aload_1
    //   216: ifnull -> 243
    //   219: aload_0
    //   220: aload_0
    //   221: getfield Zs : Lburp/Zefg;
    //   224: aload_0
    //   225: getfield ZC : Ljava/util/List;
    //   228: invokevirtual Z_ : (Lburp/Zefg;Ljava/util/List;)V
    //   231: aload_0
    //   232: aload_0
    //   233: getfield Zq : Lburp/Zefg;
    //   236: aload_0
    //   237: getfield ZO : Ljava/util/List;
    //   240: invokevirtual Z_ : (Lburp/Zefg;Ljava/util/List;)V
    //   243: aload_0
    //   244: getfield ZF : Ljava/util/List;
    //   247: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   252: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   257: aload_0
    //   258: getfield Zn : Ljava/util/concurrent/locks/ReadWriteLock;
    //   261: invokeinterface writeLock : ()Ljava/util/concurrent/locks/Lock;
    //   266: invokeinterface unlock : ()V
    //   271: goto -> 293
    //   274: astore #4
    //   276: aload_0
    //   277: getfield Zn : Ljava/util/concurrent/locks/ReadWriteLock;
    //   280: invokeinterface writeLock : ()Ljava/util/concurrent/locks/Lock;
    //   285: invokeinterface unlock : ()V
    //   290: aload #4
    //   292: athrow
    //   293: return
    // Exception table:
    //   from	to	target	type
    //   35	79	96	finally
    //   117	257	274	finally
  }
  
  private void ZX() {
    this.ZC.clear();
    this.ZO.clear();
    String str = Zgkj.ZV();
    String[] arrayOfString = this.Zj;
    int i = arrayOfString.length;
    byte b = 0;
    while (b < i) {
      String str1 = arrayOfString[b];
      this.ZC.add(new Zm30(str1, false, this.Z_));
      b++;
      if (str != null)
        break; 
    } 
    arrayOfString = this.Zf;
    i = arrayOfString.length;
    b = 0;
    while (b < i) {
      String str1 = arrayOfString[b];
      this.ZO.add(new Zm30(str1, false, this.Zr));
      b++;
      if (str != null)
        break; 
    } 
  }
  
  private void Z_(Zefg<Zsdr> paramZefg, List<Zm30> paramList) {
    String str = Zgkj.ZV();
    for (Zm30 zm30 : paramList) {
      zm30.Ze(false);
      if (str != null)
        break; 
    } 
    for (Zsdr zsdr : paramZefg) {
      for (Zm30 zm30 : paramList) {
        if (zsdr.toString().equals(zm30.ZR())) {
          zm30.Ze(true);
          if (str != null)
            continue; 
          break;
        } 
        continue;
        if (str != null)
          break; 
      } 
      if (str != null)
        break; 
    } 
  }
  
  private void ZY(Zefg<Zsdr> paramZefg, List<Zm30> paramList, List<String> paramList1) {
    String str = Zgkj.ZV();
    try {
      this.Zn.writeLock().lock();
      paramZefg.clear();
      for (Zm30 zm30 : paramList) {
        zm30.Zd(false);
        for (String str1 : paramList1) {
          if (zm30.ZR().equals(str1)) {
            zm30.Zd(true);
            if (str != null)
              continue; 
            break;
          } 
          continue;
          if (str != null)
            break; 
        } 
        if (str != null)
          break; 
      } 
    } finally {
      this.Zn.writeLock().unlock();
    } 
  }
  
  private static void ZF(Zefg<Zsdr> paramZefg, String paramString) {
    // Byte code:
    //   0: invokestatic ZV : ()Ljava/lang/String;
    //   3: astore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: iload_3
    //   7: aload_0
    //   8: invokeinterface size : ()I
    //   13: if_icmpge -> 57
    //   16: aload_0
    //   17: iload_3
    //   18: invokeinterface get : (I)Ljava/lang/Object;
    //   23: checkcast burp/Zsdr
    //   26: invokeinterface toString : ()Ljava/lang/String;
    //   31: aload_1
    //   32: invokevirtual equals : (Ljava/lang/Object;)Z
    //   35: ifeq -> 50
    //   38: aload_0
    //   39: iload_3
    //   40: invokeinterface remove : (I)Ljava/lang/Object;
    //   45: pop
    //   46: aload_2
    //   47: ifnull -> 57
    //   50: iinc #3, 1
    //   53: aload_2
    //   54: ifnull -> 6
    //   57: return
  }
  
  private void lambda$new$1(Zr_4 paramZr_4, Zm30 paramZm30, boolean paramBoolean) {
    String str = Zgkj.ZV();
    if (paramBoolean) {
      this.Zq.add(paramZr_4.Zz(paramZm30.ZR()));
      if (str != null) {
        ZF(this.Zq, paramZm30.ZR());
        return;
      } 
      return;
    } 
    ZF(this.Zq, paramZm30.ZR());
  }
  
  private void lambda$new$0(Zr_4 paramZr_4, Zm30 paramZm30, boolean paramBoolean) {
    String str = Zgkj.ZV();
    if (paramBoolean) {
      this.Zs.add(paramZr_4.Zz(paramZm30.ZR()));
      if (str != null) {
        ZF(this.Zs, paramZm30.ZR());
        return;
      } 
      return;
    } 
    ZF(this.Zs, paramZm30.ZR());
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '·iV1vñ]sÞÒ\7Iöôþínªxåc÷ew1øaíxGÀ%@TB<¸/Å¤C®ÎÓ¸{È½3_qü/{:x§T¦xõßsã\0Ò¬t'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #49
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #53
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'Ê<8þH,0ü\ñwv\\tºó'){÷J jLäð£|LcnTù¥ä/u¤ËM »Ñ×Ø³q^4Üiþ§e&Ü±V, ]7ó5ü\\rË©¤ÂÄÌ ½'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #49
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #121
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic burp/Zrm1.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zrm1.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #97
    //   214: goto -> 244
    //   217: bipush #77
    //   219: goto -> 244
    //   222: bipush #14
    //   224: goto -> 244
    //   227: bipush #112
    //   229: goto -> 244
    //   232: bipush #9
    //   234: goto -> 244
    //   237: bipush #14
    //   239: goto -> 244
    //   242: bipush #93
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3C05) & 0xFFFF;
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
      byte b1 = 101;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrm1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */