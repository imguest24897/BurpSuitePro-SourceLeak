package burp;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;
import net.portswigger.Zah;
import net.portswigger.Zci;
import net.portswigger.Zf9;
import net.portswigger.Zih;
import net.portswigger.Zim;
import net.portswigger.Zk_;
import net.portswigger.Zkz;
import net.portswigger.Zlf;
import net.portswigger.Zlz;
import net.portswigger.Zme;
import net.portswigger.Zq0;
import net.portswigger.Zq7;
import net.portswigger.Zrme;
import net.portswigger.Zsy;

class Zbuh extends Zbuq {
  private final Zz6q ZU;
  
  private final Zr_4 Zy;
  
  private final Zzkr Zf;
  
  private final Zskh Zp;
  
  private final Zzov ZA;
  
  private static final String[] c;
  
  private static final String[] d;
  
  Zbuh(Ztpm paramZtpm, Zra1 paramZra1, Zz6q paramZz6q, Zrfd paramZrfd, Zm0l paramZm0l, Zr1j paramZr1j, Zkl6 paramZkl6, Zr_4 paramZr_4, Zzkr paramZzkr, Zskh paramZskh, Zzov paramZzov) {
    super(paramZtpm, paramZra1, paramZrfd, paramZm0l, paramZr1j, paramZkl6, paramZr_4);
    this.ZU = paramZz6q;
    this.Zy = paramZr_4;
    this.Zf = paramZzkr;
    this.Zp = paramZskh;
    this.ZA = paramZzov;
  }
  
  public Ztj1 ZN(Zf9 paramZf9) {
    return Ze(paramZf9, Zkcl.SCAN_CRAWL, true);
  }
  
  protected Zgyw ZK(Zf9 paramZf9) {
    return Ze(paramZf9.ZU);
  }
  
  private Zgyw Ze(List<Zih> paramList) {
    return new Zgyw(this.ZU.Zt(paramList));
  }
  
  protected Zmpo Zs(Zf9 paramZf9, Zgyw paramZgyw) {
    try {
      if (Zepo.ZN(paramZf9.Ze))
        return new Zmpo(Collections.emptyList()); 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    LinkedList linkedList1 = new LinkedList();
    LinkedList linkedList2 = new LinkedList();
    Zeia zeia = new Zeia(this, linkedList1, linkedList2);
    try {
      paramZf9.Ze.forEach(zeia::lambda$applicationLoginConfig$0);
      if (!linkedList1.isEmpty())
        try {
          if (!linkedList2.isEmpty())
            throw new Zrme(b(3429, -27831)); 
        } catch (Zrme zrme) {
          throw a(null);
        }  
    } catch (Zrme zrme) {
      throw a(null);
    } 
    ArrayList<Zs3n> arrayList = new ArrayList();
    arrayList.addAll(linkedList2);
    arrayList.addAll(linkedList1);
    Zmpo zmpo = new Zmpo(arrayList);
    Optional<String> optional = zmpo.Zl(paramZgyw);
    try {
      if (optional.isPresent())
        throw new Zrme((String)optional.get()); 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    return zmpo;
  }
  
  protected Zb2y ZJ(Zf9 paramZf9) {
    try {
    
    } catch (Zrme zrme) {
      throw a(null);
    } 
    Zr5_ zr5_ = Zlz.ZX(paramZf9.Z_) ? this.Zf.ZD() : this.Zf.ZH(paramZf9.Z_).<Throwable>orElseThrow(paramZf9::lambda$resourcePoolSelectionConfig$1);
    return Zb2y.Zs(zr5_.Z_());
  }
  
  public Ztj1 Zk(Zq0 paramZq0) {
    // Byte code:
    //   0: invokestatic ZC : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: getfield Zl : Lnet/portswigger/Zq_;
    //   8: ifnull -> 55
    //   11: aload_1
    //   12: getfield Zl : Lnet/portswigger/Zq_;
    //   15: getfield Zt : Ljava/lang/String;
    //   18: invokestatic Zu : (Ljava/lang/String;)Lnet/portswigger/Zmg;
    //   21: getfield ZO : Ljava/lang/String;
    //   24: ifnull -> 55
    //   27: goto -> 34
    //   30: invokestatic a : (Lnet/portswigger/Zrme;)Lnet/portswigger/Zrme;
    //   33: athrow
    //   34: new net/portswigger/Zrme
    //   37: dup
    //   38: sipush #3428
    //   41: sipush #1666
    //   44: invokestatic b : (II)Ljava/lang/String;
    //   47: invokespecial <init> : (Ljava/lang/String;)V
    //   50: athrow
    //   51: invokestatic a : (Lnet/portswigger/Zrme;)Lnet/portswigger/Zrme;
    //   54: athrow
    //   55: aload_1
    //   56: invokestatic Zq : (Lnet/portswigger/Zq0;)Ljava/net/URL;
    //   59: astore_3
    //   60: aload_0
    //   61: getfield ZA : Lburp/Zzov;
    //   64: invokevirtual ZJ : ()Lburp/Ztb9;
    //   67: astore #4
    //   69: aload #4
    //   71: aload_1
    //   72: getfield Zj : Ljava/lang/String;
    //   75: invokevirtual Za : (Ljava/lang/String;)Ljava/util/Optional;
    //   78: astore #5
    //   80: aload #5
    //   82: invokevirtual isEmpty : ()Z
    //   85: ifeq -> 109
    //   88: new net/portswigger/Zrme
    //   91: dup
    //   92: sipush #3427
    //   95: sipush #12105
    //   98: invokestatic b : (II)Ljava/lang/String;
    //   101: invokespecial <init> : (Ljava/lang/String;)V
    //   104: athrow
    //   105: invokestatic a : (Lnet/portswigger/Zrme;)Lnet/portswigger/Zrme;
    //   108: athrow
    //   109: aload #4
    //   111: aload #5
    //   113: invokevirtual get : ()Ljava/lang/Object;
    //   116: checkcast burp/Zlit
    //   119: invokevirtual ZZ : (Lburp/Zlit;)Lburp/Zejt;
    //   122: astore #6
    //   124: aload #6
    //   126: invokevirtual ZAP : ()Z
    //   129: ifne -> 168
    //   132: new net/portswigger/Zrme
    //   135: dup
    //   136: sipush #3437
    //   139: sipush #-32098
    //   142: invokestatic b : (II)Ljava/lang/String;
    //   145: iconst_1
    //   146: anewarray java/lang/Object
    //   149: dup
    //   150: iconst_0
    //   151: aload #6
    //   153: invokevirtual ZAy : ()Ljava/lang/String;
    //   156: aastore
    //   157: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   160: invokespecial <init> : (Ljava/lang/String;)V
    //   163: athrow
    //   164: invokestatic a : (Lnet/portswigger/Zrme;)Lnet/portswigger/Zrme;
    //   167: athrow
    //   168: aload_0
    //   169: aload_1
    //   170: aload_3
    //   171: aload #6
    //   173: invokevirtual ZT : (Lnet/portswigger/Zq0;Ljava/net/URL;Lburp/Zejt;)Lburp/Zkv4;
    //   176: astore #7
    //   178: aload_1
    //   179: getfield ZO : Ljava/util/List;
    //   182: invokestatic ZG : (Ljava/util/List;)Lburp/Zge3;
    //   185: astore #8
    //   187: aload_0
    //   188: aload_1
    //   189: <illegal opcode> ZI : (Lburp/Zbuh;Lnet/portswigger/Zq0;)Lburp/Zm0l;
    //   194: astore #9
    //   196: aload_0
    //   197: getfield ZO : Lburp/Zrfd;
    //   200: aload #7
    //   202: iconst_3
    //   203: anewarray burp/Zm0l
    //   206: dup
    //   207: iconst_0
    //   208: aload #9
    //   210: aastore
    //   211: dup
    //   212: iconst_1
    //   213: aload_0
    //   214: getfield Zq : Lburp/Zm0l;
    //   217: aastore
    //   218: dup
    //   219: iconst_2
    //   220: aload #8
    //   222: invokevirtual ZCf : ()Lburp/Zm0l;
    //   225: aastore
    //   226: invokestatic ZI : ([Lburp/Zm0l;)Lburp/Zx5;
    //   229: aload #8
    //   231: dup
    //   232: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   235: pop
    //   236: <illegal opcode> ZU : (Lburp/Zge3;)Lburp/Zsv0;
    //   241: iconst_0
    //   242: iconst_0
    //   243: invokevirtual ZP : (Lburp/Zkv4;Lburp/Zm0l;Lburp/Zsv0;ZZ)Lburp/Ztj1;
    //   246: invokestatic Zwu : ()[Lburp/Zbqc;
    //   249: ifnonnull -> 265
    //   252: iconst_4
    //   253: newarray int
    //   255: invokestatic ZV : ([I)V
    //   258: goto -> 265
    //   261: invokestatic a : (Lnet/portswigger/Zrme;)Lnet/portswigger/Zrme;
    //   264: athrow
    //   265: areturn
    // Exception table:
    //   from	to	target	type
    //   4	27	30	net/portswigger/Zrme
    //   11	51	51	net/portswigger/Zrme
    //   80	105	105	net/portswigger/Zrme
    //   124	164	164	net/portswigger/Zrme
    //   196	258	261	net/portswigger/Zrme
  }
  
  public Ztj1 ZW(Zq7 paramZq7) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Zy : Lnet/portswigger/Zq_;
    //   4: ifnull -> 51
    //   7: aload_1
    //   8: getfield Zy : Lnet/portswigger/Zq_;
    //   11: getfield Zt : Ljava/lang/String;
    //   14: invokestatic Zu : (Ljava/lang/String;)Lnet/portswigger/Zmg;
    //   17: getfield ZO : Ljava/lang/String;
    //   20: ifnull -> 51
    //   23: goto -> 30
    //   26: invokestatic a : (Lnet/portswigger/Zrme;)Lnet/portswigger/Zrme;
    //   29: athrow
    //   30: new net/portswigger/Zrme
    //   33: dup
    //   34: sipush #3430
    //   37: sipush #-23510
    //   40: invokestatic b : (II)Ljava/lang/String;
    //   43: invokespecial <init> : (Ljava/lang/String;)V
    //   46: athrow
    //   47: invokestatic a : (Lnet/portswigger/Zrme;)Lnet/portswigger/Zrme;
    //   50: athrow
    //   51: aload_1
    //   52: getfield Zn : Ljava/lang/String;
    //   55: astore_2
    //   56: aload_2
    //   57: aconst_null
    //   58: invokestatic Zt : (Ljava/lang/String;Ljava/net/URL;)Lburp/Zejt;
    //   61: astore_3
    //   62: aload_3
    //   63: invokevirtual ZAP : ()Z
    //   66: ifne -> 104
    //   69: new net/portswigger/Zrme
    //   72: dup
    //   73: sipush #3424
    //   76: sipush #-19460
    //   79: invokestatic b : (II)Ljava/lang/String;
    //   82: iconst_1
    //   83: anewarray java/lang/Object
    //   86: dup
    //   87: iconst_0
    //   88: aload_3
    //   89: invokevirtual ZAy : ()Ljava/lang/String;
    //   92: aastore
    //   93: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   96: invokespecial <init> : (Ljava/lang/String;)V
    //   99: athrow
    //   100: invokestatic a : (Lnet/portswigger/Zrme;)Lnet/portswigger/Zrme;
    //   103: athrow
    //   104: aload_0
    //   105: aload_1
    //   106: aload_3
    //   107: invokevirtual ZQ : (Lnet/portswigger/Zq7;Lburp/Zejt;)Lburp/Zkv4;
    //   110: astore #4
    //   112: aload_1
    //   113: getfield ZB : Ljava/util/List;
    //   116: invokestatic ZG : (Ljava/util/List;)Lburp/Zge3;
    //   119: astore #5
    //   121: aload_0
    //   122: aload_1
    //   123: <illegal opcode> ZI : (Lburp/Zbuh;Lnet/portswigger/Zq7;)Lburp/Zm0l;
    //   128: astore #6
    //   130: aload_0
    //   131: getfield ZO : Lburp/Zrfd;
    //   134: aload #4
    //   136: iconst_3
    //   137: anewarray burp/Zm0l
    //   140: dup
    //   141: iconst_0
    //   142: aload #6
    //   144: aastore
    //   145: dup
    //   146: iconst_1
    //   147: aload_0
    //   148: getfield Zq : Lburp/Zm0l;
    //   151: aastore
    //   152: dup
    //   153: iconst_2
    //   154: aload #5
    //   156: invokevirtual ZCf : ()Lburp/Zm0l;
    //   159: aastore
    //   160: invokestatic ZI : ([Lburp/Zm0l;)Lburp/Zx5;
    //   163: aload #5
    //   165: dup
    //   166: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   169: pop
    //   170: <illegal opcode> ZU : (Lburp/Zge3;)Lburp/Zsv0;
    //   175: iconst_0
    //   176: iconst_0
    //   177: invokevirtual ZP : (Lburp/Zkv4;Lburp/Zm0l;Lburp/Zsv0;ZZ)Lburp/Ztj1;
    //   180: areturn
    // Exception table:
    //   from	to	target	type
    //   0	23	26	net/portswigger/Zrme
    //   7	47	47	net/portswigger/Zrme
    //   62	100	100	net/portswigger/Zrme
  }
  
  private Zkv4 ZT(Zq0 paramZq0, URL paramURL, Zejt paramZejt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zl : ()Lburp/Zl66;
    //   4: astore #4
    //   6: aload_0
    //   7: aload_2
    //   8: invokevirtual ZM : (Ljava/net/URL;)Lburp/Zlit;
    //   11: astore #5
    //   13: aload #4
    //   15: aload_3
    //   16: invokevirtual ZAU : ()Ljava/util/Collection;
    //   19: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   24: aload #5
    //   26: invokevirtual Zw : (Ljava/util/stream/Stream;Lburp/Zlit;)Ljava/util/List;
    //   29: astore #6
    //   31: aload_1
    //   32: getfield Zn : Lnet/portswigger/Zhk;
    //   35: getfield Zv : Ljava/util/List;
    //   38: invokeinterface isEmpty : ()Z
    //   43: ifne -> 109
    //   46: aload #6
    //   48: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   53: aload_0
    //   54: aload_1
    //   55: <illegal opcode> test : (Lburp/Zbuh;Lnet/portswigger/Zq0;)Ljava/util/function/Predicate;
    //   60: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   65: invokeinterface toList : ()Ljava/util/List;
    //   70: astore #6
    //   72: aload #6
    //   74: invokeinterface isEmpty : ()Z
    //   79: ifeq -> 109
    //   82: new net/portswigger/Zrme
    //   85: dup
    //   86: sipush #1011
    //   89: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   92: sipush #3431
    //   95: sipush #15392
    //   98: invokestatic b : (II)Ljava/lang/String;
    //   101: invokespecial <init> : (Ljava/lang/Integer;Ljava/lang/String;)V
    //   104: athrow
    //   105: invokestatic a : (Lnet/portswigger/Zrme;)Lnet/portswigger/Zrme;
    //   108: athrow
    //   109: aload_0
    //   110: aload_1
    //   111: getfield Zn : Lnet/portswigger/Zhk;
    //   114: getfield ZE : Ljava/util/List;
    //   117: aload #6
    //   119: iconst_1
    //   120: invokevirtual ZH : (Ljava/util/List;Ljava/util/List;Z)Ljava/util/List;
    //   123: astore #7
    //   125: new burp/Ztf3
    //   128: dup
    //   129: new burp/Zzxj
    //   132: dup
    //   133: aload_0
    //   134: getfield ZK : Lburp/Zkl6;
    //   137: invokeinterface ZB : ()Lburp/Zbnt;
    //   142: aload_0
    //   143: getfield Zy : Lburp/Zr_4;
    //   146: invokespecial <init> : (Lburp/Zbnt;Lburp/Zr_4;)V
    //   149: aload_0
    //   150: aload #4
    //   152: aload #6
    //   154: aload #5
    //   156: aload #7
    //   158: invokevirtual Zu : (Lburp/Zl66;Ljava/util/List;Lburp/Zlit;Ljava/util/List;)Ljava/util/List;
    //   161: iconst_0
    //   162: invokespecial <init> : (Lburp/Zzxj;Ljava/util/List;Z)V
    //   165: astore #8
    //   167: new burp/Zkv4
    //   170: dup
    //   171: aload #8
    //   173: getstatic burp/Zz5.ZO : Lburp/Zz5;
    //   176: aload_0
    //   177: aload_1
    //   178: getfield ZL : Ljava/util/List;
    //   181: invokevirtual Ze : (Ljava/util/List;)Lburp/Zgyw;
    //   184: getstatic burp/Zmpo.Zi : Lburp/Zmpo;
    //   187: aload_0
    //   188: getfield Zf : Lburp/Zzkr;
    //   191: invokevirtual ZD : ()Lburp/Zr5_;
    //   194: invokevirtual Z_ : ()I
    //   197: invokestatic Zs : (I)Lburp/Zb2y;
    //   200: getstatic burp/Zlj4.API : Lburp/Zlj4;
    //   203: iconst_0
    //   204: invokespecial <init> : (Lburp/Ztfs;Lburp/Zz5;Lburp/Zgyw;Lburp/Zmpo;Lburp/Zb2y;Lburp/Zlj4;Z)V
    //   207: areturn
    // Exception table:
    //   from	to	target	type
    //   72	105	105	net/portswigger/Zrme
  }
  
  private Zkv4 ZQ(Zq7 paramZq7, Zejt paramZejt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zl : ()Lburp/Zl66;
    //   4: astore_3
    //   5: aload_3
    //   6: aload_2
    //   7: invokevirtual ZAU : ()Ljava/util/Collection;
    //   10: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   15: aconst_null
    //   16: invokevirtual Zw : (Ljava/util/stream/Stream;Lburp/Zlit;)Ljava/util/List;
    //   19: astore #4
    //   21: aload_1
    //   22: getfield ZZ : Lnet/portswigger/Zst;
    //   25: getfield ZH : Ljava/util/List;
    //   28: invokeinterface isEmpty : ()Z
    //   33: ifne -> 62
    //   36: aload #4
    //   38: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   43: aload_0
    //   44: aload_1
    //   45: <illegal opcode> test : (Lburp/Zbuh;Lnet/portswigger/Zq7;)Ljava/util/function/Predicate;
    //   50: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   55: invokeinterface toList : ()Ljava/util/List;
    //   60: astore #4
    //   62: aload #4
    //   64: invokeinterface isEmpty : ()Z
    //   69: ifeq -> 99
    //   72: new net/portswigger/Zrme
    //   75: dup
    //   76: sipush #1011
    //   79: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   82: sipush #3426
    //   85: sipush #-11384
    //   88: invokestatic b : (II)Ljava/lang/String;
    //   91: invokespecial <init> : (Ljava/lang/Integer;Ljava/lang/String;)V
    //   94: athrow
    //   95: invokestatic a : (Lnet/portswigger/Zrme;)Lnet/portswigger/Zrme;
    //   98: athrow
    //   99: aload_0
    //   100: aload_1
    //   101: getfield ZZ : Lnet/portswigger/Zst;
    //   104: getfield Zc : Ljava/util/List;
    //   107: aload #4
    //   109: iconst_0
    //   110: invokevirtual ZH : (Ljava/util/List;Ljava/util/List;Z)Ljava/util/List;
    //   113: astore #5
    //   115: new burp/Ztf3
    //   118: dup
    //   119: new burp/Zzxj
    //   122: dup
    //   123: aload_0
    //   124: getfield ZK : Lburp/Zkl6;
    //   127: invokeinterface ZB : ()Lburp/Zbnt;
    //   132: aload_0
    //   133: getfield Zy : Lburp/Zr_4;
    //   136: invokespecial <init> : (Lburp/Zbnt;Lburp/Zr_4;)V
    //   139: aload_0
    //   140: aload_3
    //   141: aload #4
    //   143: aconst_null
    //   144: aload #5
    //   146: invokevirtual Zu : (Lburp/Zl66;Ljava/util/List;Lburp/Zlit;Ljava/util/List;)Ljava/util/List;
    //   149: iconst_1
    //   150: invokespecial <init> : (Lburp/Zzxj;Ljava/util/List;Z)V
    //   153: astore #6
    //   155: new burp/Zkv4
    //   158: dup
    //   159: aload #6
    //   161: getstatic burp/Zz5.ZO : Lburp/Zz5;
    //   164: aload_0
    //   165: aload_1
    //   166: getfield Zt : Ljava/util/List;
    //   169: invokevirtual Ze : (Ljava/util/List;)Lburp/Zgyw;
    //   172: getstatic burp/Zmpo.Zi : Lburp/Zmpo;
    //   175: aload_0
    //   176: getfield Zf : Lburp/Zzkr;
    //   179: invokevirtual ZD : ()Lburp/Zr5_;
    //   182: invokevirtual Z_ : ()I
    //   185: invokestatic Zs : (I)Lburp/Zb2y;
    //   188: getstatic burp/Zlj4.API : Lburp/Zlj4;
    //   191: iconst_0
    //   192: invokespecial <init> : (Lburp/Ztfs;Lburp/Zz5;Lburp/Zgyw;Lburp/Zmpo;Lburp/Zb2y;Lburp/Zlj4;Z)V
    //   195: areturn
    // Exception table:
    //   from	to	target	type
    //   62	95	95	net/portswigger/Zrme
  }
  
  private List<Zgi> ZH(List<Zlf> paramList, List<Zg7g> paramList1, boolean paramBoolean) {
    // Byte code:
    //   0: new burp/Zx_k
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #5
    //   9: invokestatic ZC : ()[I
    //   12: aload #5
    //   14: aload_2
    //   15: invokevirtual Zc : (Ljava/util/List;)V
    //   18: astore #4
    //   20: aload_1
    //   21: invokeinterface iterator : ()Ljava/util/Iterator;
    //   26: astore #6
    //   28: aload #6
    //   30: invokeinterface hasNext : ()Z
    //   35: ifeq -> 306
    //   38: aload #6
    //   40: invokeinterface next : ()Ljava/lang/Object;
    //   45: checkcast net/portswigger/Zlf
    //   48: astore #7
    //   50: aload #7
    //   52: dup
    //   53: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   56: pop
    //   57: astore #9
    //   59: iconst_0
    //   60: istore #10
    //   62: aload #9
    //   64: iload #10
    //   66: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   71: tableswitch default -> 96, 0 -> 110, 1 -> 146, 2 -> 189
    //   96: new java/lang/MatchException
    //   99: dup
    //   100: aconst_null
    //   101: aconst_null
    //   102: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   105: athrow
    //   106: invokestatic a : (Lnet/portswigger/Zrme;)Lnet/portswigger/Zrme;
    //   109: athrow
    //   110: aload #9
    //   112: checkcast net/portswigger/Zfr
    //   115: astore #11
    //   117: new burp/Zmi1
    //   120: dup
    //   121: aconst_null
    //   122: aload #11
    //   124: getfield Zb : Ljava/lang/String;
    //   127: aload #11
    //   129: getfield Zz : Z
    //   132: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Z)V
    //   135: aload #11
    //   137: getfield Zx : Ljava/lang/String;
    //   140: invokevirtual ZJ : (Ljava/lang/String;)Lburp/Zmi1;
    //   143: goto -> 234
    //   146: aload #9
    //   148: checkcast net/portswigger/Zfl
    //   151: astore #12
    //   153: new burp/Zmi3
    //   156: dup
    //   157: aload #12
    //   159: getfield Zb : Ljava/lang/String;
    //   162: aload #12
    //   164: getfield Zz : Z
    //   167: invokespecial <init> : (Ljava/lang/String;Z)V
    //   170: aload #12
    //   172: getfield ZO : Ljava/lang/String;
    //   175: invokevirtual Zu : (Ljava/lang/String;)Lburp/Zmi3;
    //   178: aload #12
    //   180: getfield ZB : Ljava/lang/String;
    //   183: invokevirtual ZO : (Ljava/lang/String;)Lburp/Zmi3;
    //   186: goto -> 234
    //   189: aload #9
    //   191: checkcast net/portswigger/Zf8
    //   194: astore #13
    //   196: new burp/Zmis
    //   199: dup
    //   200: aload #13
    //   202: getfield ZJ : Lnet/portswigger/Zde;
    //   205: invokestatic Zd : (Lnet/portswigger/Zde;)Lburp/Zi2;
    //   208: aload #13
    //   210: getfield ZP : Ljava/lang/String;
    //   213: aload #13
    //   215: getfield Zb : Ljava/lang/String;
    //   218: aload #13
    //   220: getfield Zz : Z
    //   223: invokespecial <init> : (Lburp/Zi2;Ljava/lang/String;Ljava/lang/String;Z)V
    //   226: aload #13
    //   228: getfield Zr : Ljava/lang/String;
    //   231: invokevirtual Zp : (Ljava/lang/String;)Lburp/Zmis;
    //   234: astore #8
    //   236: aload #5
    //   238: aload #8
    //   240: invokevirtual Zp : (Lburp/Zgi;)Ljava/util/Optional;
    //   243: astore #9
    //   245: iload_3
    //   246: ifeq -> 279
    //   249: aload #9
    //   251: invokevirtual isPresent : ()Z
    //   254: ifeq -> 279
    //   257: goto -> 264
    //   260: invokestatic a : (Lnet/portswigger/Zrme;)Lnet/portswigger/Zrme;
    //   263: athrow
    //   264: aload #8
    //   266: iconst_1
    //   267: invokeinterface Zi : (Z)V
    //   272: goto -> 279
    //   275: invokestatic a : (Lnet/portswigger/Zrme;)Lnet/portswigger/Zrme;
    //   278: athrow
    //   279: aload #9
    //   281: aload #8
    //   283: <illegal opcode> accept : (Lburp/Zgi;)Ljava/util/function/Consumer;
    //   288: aload_0
    //   289: aload #5
    //   291: aload #8
    //   293: <illegal opcode> run : (Lburp/Zbuh;Lburp/Zx_k;Lburp/Zgi;)Ljava/lang/Runnable;
    //   298: invokevirtual ifPresentOrElse : (Ljava/util/function/Consumer;Ljava/lang/Runnable;)V
    //   301: aload #4
    //   303: ifnonnull -> 28
    //   306: aload #5
    //   308: invokevirtual Zp : ()Ljavafx/collections/ObservableList;
    //   311: areturn
    // Exception table:
    //   from	to	target	type
    //   62	106	106	net/portswigger/Zrme
    //   245	257	260	net/portswigger/Zrme
    //   249	272	275	net/portswigger/Zrme
  }
  
  private boolean ZJ(Zg7g paramZg7g, List<? extends Zim> paramList) {
    return paramList.stream().anyMatch(paramZg7g::lambda$isEndpointEnabled$9);
  }
  
  private boolean ZV(String paramString, List<Zci> paramList) {
    return paramList.stream().anyMatch(paramString::lambda$isMethodEnabled$10);
  }
  
  private Zlit ZM(URL paramURL) {
    Zax zax;
    try {
      zax = new Zax(paramURL, this.ZK.ZB());
    } catch (Zxgy|Zxg5 zxgy) {
      Zah.Zl(zxgy, Zk_.UNEXPECTED);
      throw new RuntimeException(zxgy);
    } 
    return zax;
  }
  
  private static URL Zq(Zq0 paramZq0) {
    URL uRL;
    try {
      uRL = URI.create(paramZq0.Zj).toURL();
    } catch (MalformedURLException malformedURLException) {
      Zah.Zl(malformedURLException, Zk_.USER_ERROR);
      throw new Zrme(b(3425, 12055).formatted(new Object[] { paramZq0.Zj }));
    } 
    return uRL;
  }
  
  private Zl66 Zl() {
    Zsy zsy = new Zsy();
    Zg40 zg40 = new Zg40(this.Zp);
    Zlje zlje = new Zlje(this.ZK.ZB(), Zx8e.Zr, zsy.Z_(4), zg40);
    return new Zl66(zlje, this.ZK, zsy.Z_(4), this.Zy);
  }
  
  private List<Zll9> Zu(Zl66 paramZl66, List<Zg7g> paramList, Zlit paramZlit, List<Zgi> paramList1) {
    // Byte code:
    //   0: getstatic burp/Zv8r.SCANNER_API_ENDPOINTS_DISABLED : Lburp/Zv8r;
    //   3: aload_2
    //   4: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   9: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   14: invokestatic not : (Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    //   17: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   22: invokeinterface count : ()J
    //   27: invokestatic Zi : (Lnet/portswigger/Zzr;J)V
    //   30: aload_2
    //   31: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   36: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   41: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   46: aload_1
    //   47: aload_3
    //   48: aload #4
    //   50: <illegal opcode> apply : (Lburp/Zl66;Lburp/Zlit;Ljava/util/List;)Ljava/util/function/Function;
    //   55: invokeinterface flatMap : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   60: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   65: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   70: invokestatic toList : ()Ljava/util/stream/Collector;
    //   73: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   78: checkcast java/util/List
    //   81: areturn
  }
  
  private static Zetn lambda$buildItemsToAudit$12(Zefx paramZefx) {
    return new Zetn(paramZefx.ZF(), Zyf.Zy(paramZefx.ZD()), null);
  }
  
  private static Stream lambda$buildItemsToAudit$11(Zl66 paramZl66, Zlit paramZlit, List<Zgi> paramList, Zg7g paramZg7g) {
    return paramZl66.ZN(paramZg7g, paramZlit, paramList);
  }
  
  private static boolean lambda$isMethodEnabled$10(String paramString, Zci paramZci) {
    return paramZci.name().equalsIgnoreCase(paramString);
  }
  
  private static boolean lambda$isEndpointEnabled$9(Zg7g paramZg7g, Zim paramZim) {
    try {
      if (paramZim.ZO().equals(paramZg7g.Zd()))
        try {
          if (paramZim.Zy());
        } catch (Zrme zrme) {
          throw a(null);
        }  
    } catch (Zrme zrme) {
      throw a(null);
    } 
    return false;
  }
  
  private void lambda$getAuthenticationModels$8(Zx_k paramZx_k, Zgi paramZgi) {
    paramZx_k.ZX(paramZgi).ifPresent(this::lambda$getAuthenticationModels$7);
  }
  
  private void lambda$getAuthenticationModels$7(Ztb0 paramZtb0) {
    this.Zp.Zl(Zkqn.ERROR, paramZtb0.Z_(this.Zd).replace("\n", " "));
  }
  
  private static void lambda$getAuthenticationModels$6(Zgi paramZgi1, Zgi paramZgi2) {
    paramZgi2.ZL(paramZgi1);
  }
  
  private boolean lambda$getScanLaunchConfiguration$5(Zq7 paramZq7, Zg7g paramZg7g) {
    return ZJ(paramZg7g, paramZq7.ZZ.ZJ());
  }
  
  private boolean lambda$getScanLaunchConfiguration$4(Zq0 paramZq0, Zg7g paramZg7g) {
    return ZV(paramZg7g.ZA(), paramZq0.Zn.Zv);
  }
  
  private void lambda$launchScan$3(Zq7 paramZq7, Ztj1 paramZtj1, Zgna paramZgna, Zskh paramZskh, Zrbm paramZrbm, Zg09 paramZg09, Zkg9 paramZkg9, Supplier paramSupplier, Zlli paramZlli1, Zl2h paramZl2h, Zlli paramZlli2, boolean paramBoolean) {
    this.Zn.Z_(paramZtj1, paramZgna, paramZrbm, paramZq7.Zy);
  }
  
  private void lambda$launchScan$2(Zq0 paramZq0, Ztj1 paramZtj1, Zgna paramZgna, Zskh paramZskh, Zrbm paramZrbm, Zg09 paramZg09, Zkg9 paramZkg9, Supplier paramSupplier, Zlli paramZlli1, Zl2h paramZl2h, Zlli paramZlli2, boolean paramBoolean) {
    this.Zn.Z_(paramZtj1, paramZgna, paramZrbm, paramZq0.Zl);
  }
  
  private static Zrme lambda$resourcePoolSelectionConfig$1(Zf9 paramZf9) {
    return new Zrme(String.format(b(3436, -11087), new Object[] { paramZf9.Z_ }));
  }
  
  private static void lambda$applicationLoginConfig$0(Zme paramZme, Zkz paramZkz) {
    paramZkz.Zu(paramZme);
  }
  
  private static Zrme a(Zrme paramZrme) {
    return paramZrme;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'N8Óë:é½>/±1®$4vÏÜîr(ô'oe¼<bÍBÂNöi3`Îba\\tº¸nÇÊÑ1/³jdÔ f|Î7é´ÝLÙ÷¼·_r×8µÆR®ñU{?÷úøÝ* ·h4b{ÛtØ"àgk¹ÛQÊâ¨òâ~ÕóÊKåRë,ì,PìÕÌÖ¾¹HµFDTJ1¢õ\\b¢l}È#å¾»ç% tðtWFQ³H9ÈÚ`·R³ßîæ&{¹â¦&ÜZ /ÞàÖ[Ò5Û.¡xÓÅ\\n_;Ùl+~/JÿÖÈù,,õ¦3kFÿ.¸T¿\\t%±T?¢Õo¸ F/CãÝ^E¯ìÝ¹uÚØj\ *-®¡^Íµ7àY»®¥dî¿DÍ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #57
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #21
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
    //   68: ldc '}3]¿É\\fèõdC;%Â}×¿4Þm,+x'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_2
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #88
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
    //   128: putstatic burp/Zbuh.c : [Ljava/lang/String;
    //   131: bipush #10
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbuh.d : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #37
    //   214: goto -> 243
    //   217: bipush #17
    //   219: goto -> 243
    //   222: iconst_1
    //   223: goto -> 243
    //   226: bipush #71
    //   228: goto -> 243
    //   231: bipush #40
    //   233: goto -> 243
    //   236: bipush #100
    //   238: goto -> 243
    //   241: bipush #80
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xD65) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      byte b1 = 116;
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbuh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */