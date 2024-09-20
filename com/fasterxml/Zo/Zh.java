package com.fasterxml.Zo;

import com.fasterxml.Ze.Zk;
import com.fasterxml.Ze.Zo8;
import com.fasterxml.Ze.Zv;
import com.fasterxml.Ze.Zz;
import com.fasterxml.Zgy;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zm.Z_;
import com.fasterxml.Zm.Zeg;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zy9;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyb;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zym;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zor.Zyv;
import com.fasterxml.Zoz.Ziq;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zw.Zg;
import com.fasterxml.Zye;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Zh {
  protected final Zyc ZA;
  
  protected final Zyg Zx;
  
  protected final Zyv Zb;
  
  protected final Map<String, Zv> Zf = new LinkedHashMap<>();
  
  protected List<Zv> Z_;
  
  protected HashMap<String, Zv> Zu;
  
  protected HashSet<String> Zd;
  
  protected HashSet<String> Zz;
  
  protected Zzp ZG;
  
  protected Zz Ze;
  
  protected Zl ZF;
  
  protected boolean ZU;
  
  protected Ziq Zv;
  
  protected Zg ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zh(Zyv paramZyv, Zyg paramZyg) {
    this.Zb = paramZyv;
    this.Zx = paramZyg;
    this.ZA = paramZyg.Za();
  }
  
  public void ZJ(Zv paramZv, boolean paramBoolean) {
    this.Zf.put(paramZv.ZT(), paramZv);
  }
  
  public void ZA(Zv paramZv) {
    Zv zv = this.Zf.put(paramZv.ZT(), paramZv);
    try {
      if (zv != null)
        try {
          if (zv != paramZv)
            throw new IllegalArgumentException(a(-18927, 23073) + paramZv.ZT() + a(-18921, 3525) + this.Zb.Zf()); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void ZC(String paramString, Zv paramZv) throws Zy_ {
    try {
      if (this.Zu == null)
        this.Zu = new HashMap<>(4); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.ZA.Zd())
        try {
          paramZv.ZL(this.ZA);
        } catch (IllegalArgumentException illegalArgumentException) {
          Zb(illegalArgumentException);
        }  
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    this.Zu.put(paramString, paramZv);
  }
  
  public void ZQ(Zr paramZr, Zk paramZk, Z_ paramZ_, Ziz paramZiz, Object paramObject) throws Zy_ {
    try {
      if (this.Z_ == null)
        this.Z_ = new ArrayList<>(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.ZA.Zd())
        try {
          paramZiz.Zh(this.ZA.ZB(Zy9.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        } catch (IllegalArgumentException illegalArgumentException) {
          Zb(illegalArgumentException);
        }  
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    this.Z_.add(new Zv(paramZr, paramZk, paramZiz, paramObject));
  }
  
  public void Ze(String paramString) {
    try {
      if (this.Zd == null)
        this.Zd = new HashSet<>(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zd.add(paramString);
  }
  
  public void Zv(String paramString) {
    try {
      if (this.Zz == null)
        this.Zz = new HashSet<>(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zz.add(paramString);
  }
  
  public void Zb(Zv paramZv) {
    ZA(paramZv);
  }
  
  public void Zt(Zl paramZl) {
    try {
      if (this.ZF != null)
        try {
          if (paramZl != null)
            throw new IllegalStateException(a(-18924, 4904)); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.ZF = paramZl;
  }
  
  public void ZA(boolean paramBoolean) {
    this.ZU = paramBoolean;
  }
  
  public void Zw(Zzp paramZzp) {
    this.ZG = paramZzp;
  }
  
  public void Zx(Zz paramZz) {
    this.Ze = paramZz;
  }
  
  public void ZM(Ziq paramZiq, Zg paramZg) {
    this.Zv = paramZiq;
    this.ZP = paramZg;
  }
  
  public Iterator<Zv> Zd() {
    return this.Zf.values().iterator();
  }
  
  public Zv ZD(Zr paramZr) {
    return this.Zf.get(paramZr.Zb());
  }
  
  public Zl Zp() {
    return this.ZF;
  }
  
  public Zzp Zf() {
    return this.ZG;
  }
  
  public List<Zv> ZS() {
    return this.Z_;
  }
  
  public Zz Zz() {
    return this.Ze;
  }
  
  public Ziq Zn() {
    return this.Zv;
  }
  
  public boolean ZN(String paramString) {
    return Zeg.Zv(paramString, this.Zd, this.Zz);
  }
  
  public Zyo<?> ZQ() throws Zy_ {
    Collection<Zv> collection = this.Zf.values();
    ZT(collection);
    Zo8 zo8 = Zo8.ZH((Zf)this.ZA, collection, ZF(collection), Zu());
    zo8.ZQ();
    String str = Zzp.ZP();
    try {
    
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    boolean bool = !this.ZA.ZB(Zy9.DEFAULT_VIEW_INCLUSION) ? true : false;
    if (!bool)
      for (Zv zv : collection) {
        if (zv.Zk()) {
          bool = true;
          try {
            if (str != null)
              continue; 
          } catch (Zy_ zy_) {
            throw a(null);
          } 
          break;
        } 
        continue;
        if (str != null)
          break; 
      }  
    if (this.Ze != null) {
      Zk zk = new Zk(this.Ze, Zyb.Zd);
      zo8 = zo8.ZP((Zv)zk);
    } 
    return (Zyo<?>)new Zt(this, this.Zb, zo8, this.Zu, this.Zd, this.ZU, this.Zz, bool);
  }
  
  public Zs Za() {
    return new Zs(this, this.Zb, this.Zu, this.Zf);
  }
  
  public Zyo<?> ZF(Zk paramZk, String paramString) throws Zy_ {
    // Byte code:
    //   0: invokestatic ZP : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield Zv : Lcom/fasterxml/Zoz/Ziq;
    //   8: ifnonnull -> 84
    //   11: aload_2
    //   12: invokevirtual isEmpty : ()Z
    //   15: ifne -> 203
    //   18: goto -> 25
    //   21: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: aload_0
    //   26: getfield Zx : Lcom/fasterxml/Zor/Zyg;
    //   29: aload_0
    //   30: getfield Zb : Lcom/fasterxml/Zor/Zyv;
    //   33: invokevirtual Zf : ()Lcom/fasterxml/Zor/Zk;
    //   36: sipush #-18922
    //   39: sipush #-10489
    //   42: invokestatic a : (II)Ljava/lang/String;
    //   45: iconst_2
    //   46: anewarray java/lang/Object
    //   49: dup
    //   50: iconst_0
    //   51: aload_0
    //   52: getfield Zb : Lcom/fasterxml/Zor/Zyv;
    //   55: invokevirtual Zf : ()Lcom/fasterxml/Zor/Zk;
    //   58: invokestatic ZN : (Lcom/fasterxml/Zor/Zk;)Ljava/lang/String;
    //   61: aastore
    //   62: dup
    //   63: iconst_1
    //   64: aload_2
    //   65: aastore
    //   66: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   69: invokevirtual Zm : (Lcom/fasterxml/Zor/Zk;Ljava/lang/String;)Ljava/lang/Object;
    //   72: pop
    //   73: aload_3
    //   74: ifnull -> 203
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: aload_0
    //   85: getfield Zv : Lcom/fasterxml/Zoz/Ziq;
    //   88: invokevirtual Zy : ()Ljava/lang/Class;
    //   91: astore #4
    //   93: aload_1
    //   94: invokevirtual Zf : ()Ljava/lang/Class;
    //   97: astore #5
    //   99: aload #4
    //   101: aload #5
    //   103: if_acmpeq -> 203
    //   106: aload #4
    //   108: aload #5
    //   110: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   113: ifne -> 203
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: aload #5
    //   125: aload #4
    //   127: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   130: ifne -> 203
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: aload_0
    //   141: getfield Zx : Lcom/fasterxml/Zor/Zyg;
    //   144: aload_0
    //   145: getfield Zb : Lcom/fasterxml/Zor/Zyv;
    //   148: invokevirtual Zf : ()Lcom/fasterxml/Zor/Zk;
    //   151: sipush #-18923
    //   154: sipush #-16965
    //   157: invokestatic a : (II)Ljava/lang/String;
    //   160: iconst_3
    //   161: anewarray java/lang/Object
    //   164: dup
    //   165: iconst_0
    //   166: aload_0
    //   167: getfield Zv : Lcom/fasterxml/Zoz/Ziq;
    //   170: invokevirtual Zo : ()Ljava/lang/String;
    //   173: aastore
    //   174: dup
    //   175: iconst_1
    //   176: aload #4
    //   178: invokestatic Zy : (Ljava/lang/Object;)Ljava/lang/String;
    //   181: aastore
    //   182: dup
    //   183: iconst_2
    //   184: aload_1
    //   185: invokestatic ZN : (Lcom/fasterxml/Zor/Zk;)Ljava/lang/String;
    //   188: aastore
    //   189: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   192: invokevirtual Zm : (Lcom/fasterxml/Zor/Zk;Ljava/lang/String;)Ljava/lang/Object;
    //   195: pop
    //   196: goto -> 203
    //   199: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   202: athrow
    //   203: aload_0
    //   204: getfield Zf : Ljava/util/Map;
    //   207: invokeinterface values : ()Ljava/util/Collection;
    //   212: astore #4
    //   214: aload_0
    //   215: aload #4
    //   217: invokevirtual ZT : (Ljava/util/Collection;)V
    //   220: aload_0
    //   221: getfield ZA : Lcom/fasterxml/Zor/Zyc;
    //   224: aload #4
    //   226: aload_0
    //   227: aload #4
    //   229: invokevirtual ZF : (Ljava/util/Collection;)Ljava/util/Map;
    //   232: aload_0
    //   233: invokevirtual Zu : ()Z
    //   236: invokestatic ZH : (Lcom/fasterxml/Zj/Zf;Ljava/util/Collection;Ljava/util/Map;Z)Lcom/fasterxml/Ze/Zo8;
    //   239: astore #5
    //   241: aload #5
    //   243: invokevirtual ZQ : ()Lcom/fasterxml/Ze/Zo8;
    //   246: pop
    //   247: aload_0
    //   248: getfield ZA : Lcom/fasterxml/Zor/Zyc;
    //   251: getstatic com/fasterxml/Zor/Zy9.DEFAULT_VIEW_INCLUSION : Lcom/fasterxml/Zor/Zy9;
    //   254: invokevirtual ZB : (Lcom/fasterxml/Zor/Zy9;)Z
    //   257: ifne -> 268
    //   260: iconst_1
    //   261: goto -> 269
    //   264: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   267: athrow
    //   268: iconst_0
    //   269: istore #6
    //   271: iload #6
    //   273: ifne -> 333
    //   276: aload #4
    //   278: invokeinterface iterator : ()Ljava/util/Iterator;
    //   283: astore #7
    //   285: aload #7
    //   287: invokeinterface hasNext : ()Z
    //   292: ifeq -> 333
    //   295: aload #7
    //   297: invokeinterface next : ()Ljava/lang/Object;
    //   302: checkcast com/fasterxml/Zo/Zv
    //   305: astore #8
    //   307: aload #8
    //   309: invokevirtual Zk : ()Z
    //   312: ifeq -> 322
    //   315: iconst_1
    //   316: istore #6
    //   318: aload_3
    //   319: ifnull -> 333
    //   322: aload_3
    //   323: ifnull -> 285
    //   326: goto -> 333
    //   329: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   332: athrow
    //   333: aload_0
    //   334: getfield Ze : Lcom/fasterxml/Ze/Zz;
    //   337: ifnull -> 365
    //   340: new com/fasterxml/Ze/Zk
    //   343: dup
    //   344: aload_0
    //   345: getfield Ze : Lcom/fasterxml/Ze/Zz;
    //   348: getstatic com/fasterxml/Zor/Zyb.Zd : Lcom/fasterxml/Zor/Zyb;
    //   351: invokespecial <init> : (Lcom/fasterxml/Ze/Zz;Lcom/fasterxml/Zor/Zyb;)V
    //   354: astore #7
    //   356: aload #5
    //   358: aload #7
    //   360: invokevirtual ZP : (Lcom/fasterxml/Zo/Zv;)Lcom/fasterxml/Ze/Zo8;
    //   363: astore #5
    //   365: aload_0
    //   366: aload_1
    //   367: aload #5
    //   369: iload #6
    //   371: invokevirtual ZD : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Ze/Zo8;Z)Lcom/fasterxml/Zor/Zyo;
    //   374: areturn
    // Exception table:
    //   from	to	target	type
    //   4	18	21	com/fasterxml/Zor/Zy_
    //   11	77	80	com/fasterxml/Zor/Zy_
    //   99	116	119	com/fasterxml/Zor/Zy_
    //   106	133	136	com/fasterxml/Zor/Zy_
    //   123	196	199	com/fasterxml/Zor/Zy_
    //   241	264	264	com/fasterxml/Zor/Zy_
    //   318	326	329	com/fasterxml/Zor/Zy_
  }
  
  protected Zyo<?> ZD(Zk paramZk, Zo8 paramZo8, boolean paramBoolean) {
    return (Zyo<?>)new Zd(this, this.Zb, paramZk, paramZo8, this.Zu, this.Zd, this.ZU, this.Zz, paramBoolean);
  }
  
  protected void ZT(Collection<Zv> paramCollection) throws Zy_ {
    String str = Zzp.ZP();
    if (this.ZA.Zd())
      for (Zv zv : paramCollection) {
        try {
          zv.ZL(this.ZA);
        } catch (IllegalArgumentException illegalArgumentException) {
          Zb(illegalArgumentException);
        } 
        if (str != null)
          break; 
      }  
    try {
      if (this.ZF != null)
        try {
          this.ZF.Zx(this.ZA);
        } catch (IllegalArgumentException illegalArgumentException) {
          Zb(illegalArgumentException);
        }  
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    try {
      if (this.Zv != null)
        try {
          this.Zv.Zh(this.ZA.ZB(Zy9.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        } catch (IllegalArgumentException illegalArgumentException) {
          Zb(illegalArgumentException);
        }  
    } catch (Zy_ zy_) {
      throw a(null);
    } 
  }
  
  protected Map<String, List<Zr>> ZF(Collection<Zv> paramCollection) {
    HashMap<Object, Object> hashMap = null;
    String str = Zzp.ZP();
    for (Zv zv : paramCollection) {
      List list = zv.ZR((Zf)this.ZA);
      if (list != null)
        try {
          if (!list.isEmpty() || str != null) {
            if (hashMap == null)
              hashMap = new HashMap<>(); 
            hashMap.put(zv.ZT(), list);
            if (str != null)
              break; 
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } 
    try {
      if (hashMap == null)
        return Collections.emptyMap(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (Map)hashMap;
  }
  
  protected boolean Zu() {
    Zgy zgy = this.Zb.ZX();
    Boolean bool = zgy.Zq(Zye.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (bool == null) ? this.ZA.ZB(Zy9.ACCEPT_CASE_INSENSITIVE_PROPERTIES) : bool.booleanValue();
  }
  
  protected void Zb(IllegalArgumentException paramIllegalArgumentException) throws Zy_ {
    try {
      this.Zx.ZI(this.Zb, paramIllegalArgumentException.getMessage(), new Object[0]);
    } catch (Zym zym) {
      try {
        if (zym.getCause() == null)
          zym.initCause(paramIllegalArgumentException); 
      } catch (Zym zym1) {
        throw a(null);
      } 
      throw zym;
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'õ¤(û^í §Y¹ú9é3Øn¯V\\fãT\|c2\\bµ\\tHÕvQëûß.ú«çlÌ3#ïõT»oäW ;Mw¤ï¯)g}ò"yX çÿMÅÔ¼I¢\\f^2Þ¤½ÔÌ\\t8ýï}ûZFÌ<×áY®'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #80
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #43
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
    //   67: ldc 'ízo©ä±Ç}ø¤K'Jn\\n$]\\t«Î.¾Æe¼³Ì×¥*zÒó"«QCãsÊævVüùb-(Ó.PÔáK3R¯vg|ÞÝ£$Tv'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #56
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #124
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
    //   128: putstatic com/fasterxml/Zo/Zh.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic com/fasterxml/Zo/Zh.b : [Ljava/lang/String;
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
    //   212: bipush #71
    //   214: goto -> 244
    //   217: bipush #39
    //   219: goto -> 244
    //   222: bipush #83
    //   224: goto -> 244
    //   227: bipush #114
    //   229: goto -> 244
    //   232: bipush #95
    //   234: goto -> 244
    //   237: bipush #48
    //   239: goto -> 244
    //   242: bipush #6
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
    int i = (paramInt1 ^ 0xFFFFB615) & 0xFFFF;
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
      char c = '¸';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo\Zh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */