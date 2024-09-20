package com.fasterxml.Zn;

import burp.Zbqc;
import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zk.Za;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zqg;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.util.Map;

@Zl
public class Zb extends Za<Map.Entry<?, ?>> implements Zi {
  public static final Object Zs = Zqg.NON_EMPTY;
  
  protected final Zo ZX;
  
  protected final boolean Zl;
  
  protected final Zk Zm;
  
  protected final Zk Zq;
  
  protected final Zk Zf;
  
  protected Zyd<Object> Za;
  
  protected Zyd<Object> ZV;
  
  protected final Za Zc;
  
  protected Zj ZI;
  
  protected final Object Zz;
  
  protected final boolean Zu;
  
  public Zb(Zk paramZk1, Zk paramZk2, Zk paramZk3, boolean paramBoolean, Za paramZa, Zo paramZo) {
    super(paramZk1);
    this.Zm = paramZk1;
    this.Zq = paramZk2;
    this.Zf = paramZk3;
    this.Zl = paramBoolean;
    this.Zc = paramZa;
    this.ZX = paramZo;
    this.ZI = Zj.ZQ();
    this.Zz = null;
    this.Zu = false;
  }
  
  protected Zb(Zb paramZb, Zo paramZo, Za paramZa, Zyd<?> paramZyd1, Zyd<?> paramZyd2, Object paramObject, boolean paramBoolean) {
    super(Map.class, false);
    this.Zm = paramZb.Zm;
    this.Zq = paramZb.Zq;
    this.Zf = paramZb.Zf;
    this.Zl = paramZb.Zl;
    String str = Zj.Zl();
    this.Zc = paramZb.Zc;
    this.Za = (Zyd)paramZyd1;
    this.ZV = (Zyd)paramZyd2;
    this.ZI = Zj.ZQ();
    this.ZX = paramZb.ZX;
    this.Zz = paramObject;
    this.Zu = paramBoolean;
    if (Zbqc.Zwu() == null)
      Zj.Zz("LEUvDb"); 
  }
  
  public Za<?> ZS(Za paramZa) {
    return new Zb(this, this.ZX, paramZa, this.Za, this.ZV, this.Zz, this.Zu);
  }
  
  public Zb ZY(Zo paramZo, Zyd<?> paramZyd1, Zyd<?> paramZyd2, Object paramObject, boolean paramBoolean) {
    return new Zb(this, paramZo, this.Zc, paramZyd1, paramZyd2, paramObject, paramBoolean);
  }
  
  public Zb ZI(Object paramObject, boolean paramBoolean) {
    return (this.Zz == paramObject && this.Zu == paramBoolean) ? this : new Zb(this, this.ZX, this.Zc, this.Za, this.ZV, paramObject, paramBoolean);
  }
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    // Byte code:
    //   0: invokestatic Zl : ()Ljava/lang/String;
    //   3: aconst_null
    //   4: astore #4
    //   6: aconst_null
    //   7: astore #5
    //   9: astore_3
    //   10: aload_1
    //   11: invokevirtual Zv : ()Lcom/fasterxml/Zor/Zt;
    //   14: astore #6
    //   16: aload_2
    //   17: ifnonnull -> 28
    //   20: aconst_null
    //   21: goto -> 34
    //   24: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   27: athrow
    //   28: aload_2
    //   29: invokeinterface ZQ : ()Lcom/fasterxml/Zoz/Ziz;
    //   34: astore #7
    //   36: aload #7
    //   38: ifnull -> 101
    //   41: aload #6
    //   43: ifnull -> 101
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   52: athrow
    //   53: aload #6
    //   55: aload #7
    //   57: invokevirtual ZU : (Lcom/fasterxml/Zoz/Ziv;)Ljava/lang/Object;
    //   60: astore #8
    //   62: aload #8
    //   64: ifnull -> 77
    //   67: aload_1
    //   68: aload #7
    //   70: aload #8
    //   72: invokevirtual ZW : (Lcom/fasterxml/Zoz/Ziv;Ljava/lang/Object;)Lcom/fasterxml/Zor/Zyd;
    //   75: astore #5
    //   77: aload #6
    //   79: aload #7
    //   81: invokevirtual ZS : (Lcom/fasterxml/Zoz/Ziv;)Ljava/lang/Object;
    //   84: astore #8
    //   86: aload #8
    //   88: ifnull -> 101
    //   91: aload_1
    //   92: aload #7
    //   94: aload #8
    //   96: invokevirtual ZW : (Lcom/fasterxml/Zoz/Ziv;Ljava/lang/Object;)Lcom/fasterxml/Zor/Zyd;
    //   99: astore #4
    //   101: aload #4
    //   103: ifnonnull -> 112
    //   106: aload_0
    //   107: getfield ZV : Lcom/fasterxml/Zor/Zyd;
    //   110: astore #4
    //   112: aload_0
    //   113: aload_1
    //   114: aload_2
    //   115: aload #4
    //   117: invokevirtual Za : (Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zyd;)Lcom/fasterxml/Zor/Zyd;
    //   120: astore #4
    //   122: aload #4
    //   124: ifnonnull -> 169
    //   127: aload_0
    //   128: getfield Zl : Z
    //   131: ifeq -> 169
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   140: athrow
    //   141: aload_0
    //   142: getfield Zf : Lcom/fasterxml/Zor/Zk;
    //   145: invokevirtual Zr : ()Z
    //   148: ifne -> 169
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   157: athrow
    //   158: aload_1
    //   159: aload_0
    //   160: getfield Zf : Lcom/fasterxml/Zor/Zk;
    //   163: aload_2
    //   164: invokevirtual Zo : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyd;
    //   167: astore #4
    //   169: aload #5
    //   171: ifnonnull -> 180
    //   174: aload_0
    //   175: getfield Za : Lcom/fasterxml/Zor/Zyd;
    //   178: astore #5
    //   180: aload #5
    //   182: ifnonnull -> 214
    //   185: aload_1
    //   186: aload_0
    //   187: getfield Zq : Lcom/fasterxml/Zor/Zk;
    //   190: aload_2
    //   191: invokevirtual Zr : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyd;
    //   194: astore #5
    //   196: aload_3
    //   197: ifnull -> 223
    //   200: iconst_5
    //   201: anewarray burp/Zbqc
    //   204: invokestatic Zr : ([Lburp/Zbqc;)V
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   213: athrow
    //   214: aload_1
    //   215: aload #5
    //   217: aload_2
    //   218: invokevirtual ZR : (Lcom/fasterxml/Zor/Zyd;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyd;
    //   221: astore #5
    //   223: aload_0
    //   224: getfield Zz : Ljava/lang/Object;
    //   227: astore #8
    //   229: aload_0
    //   230: getfield Zu : Z
    //   233: istore #9
    //   235: aload_2
    //   236: ifnull -> 463
    //   239: aload_2
    //   240: aload_1
    //   241: invokevirtual ZH : ()Lcom/fasterxml/Zor/Zy7;
    //   244: aconst_null
    //   245: invokeinterface Zj : (Lcom/fasterxml/Zj/Zf;Ljava/lang/Class;)Lcom/fasterxml/Zz_;
    //   250: astore #10
    //   252: aload #10
    //   254: ifnull -> 463
    //   257: aload #10
    //   259: invokevirtual Zq : ()Lcom/fasterxml/Zqg;
    //   262: astore #11
    //   264: aload #11
    //   266: getstatic com/fasterxml/Zqg.USE_DEFAULTS : Lcom/fasterxml/Zqg;
    //   269: if_acmpeq -> 463
    //   272: getstatic com/fasterxml/Zn/Zq.Zk : [I
    //   275: aload #11
    //   277: invokevirtual ordinal : ()I
    //   280: iaload
    //   281: tableswitch default -> 457, 1 -> 324, 2 -> 370, 3 -> 400, 4 -> 412, 5 -> 448, 6 -> 457
    //   320: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   323: athrow
    //   324: aload_0
    //   325: getfield Zf : Lcom/fasterxml/Zor/Zk;
    //   328: invokestatic ZQ : (Lcom/fasterxml/Zor/Zk;)Ljava/lang/Object;
    //   331: astore #8
    //   333: iconst_1
    //   334: istore #9
    //   336: aload #8
    //   338: ifnull -> 463
    //   341: aload #8
    //   343: invokevirtual getClass : ()Ljava/lang/Class;
    //   346: invokevirtual isArray : ()Z
    //   349: ifeq -> 463
    //   352: goto -> 359
    //   355: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   358: athrow
    //   359: aload #8
    //   361: invokestatic Zp : (Ljava/lang/Object;)Ljava/lang/Object;
    //   364: astore #8
    //   366: aload_3
    //   367: ifnull -> 463
    //   370: iconst_1
    //   371: istore #9
    //   373: aload_0
    //   374: getfield Zf : Lcom/fasterxml/Zor/Zk;
    //   377: invokevirtual ZP : ()Z
    //   380: ifeq -> 393
    //   383: getstatic com/fasterxml/Zn/Zb.Zs : Ljava/lang/Object;
    //   386: goto -> 394
    //   389: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   392: athrow
    //   393: aconst_null
    //   394: astore #8
    //   396: aload_3
    //   397: ifnull -> 463
    //   400: iconst_1
    //   401: istore #9
    //   403: getstatic com/fasterxml/Zn/Zb.Zs : Ljava/lang/Object;
    //   406: astore #8
    //   408: aload_3
    //   409: ifnull -> 463
    //   412: aload_1
    //   413: aconst_null
    //   414: aload #10
    //   416: invokevirtual Zv : ()Ljava/lang/Class;
    //   419: invokevirtual ZQ : (Lcom/fasterxml/Zoz/Zp;Ljava/lang/Class;)Ljava/lang/Object;
    //   422: astore #8
    //   424: aload #8
    //   426: ifnonnull -> 436
    //   429: iconst_1
    //   430: istore #9
    //   432: aload_3
    //   433: ifnull -> 463
    //   436: aload_1
    //   437: aload #8
    //   439: invokevirtual Zz : (Ljava/lang/Object;)Z
    //   442: istore #9
    //   444: aload_3
    //   445: ifnull -> 463
    //   448: aconst_null
    //   449: astore #8
    //   451: iconst_1
    //   452: istore #9
    //   454: goto -> 463
    //   457: aconst_null
    //   458: astore #8
    //   460: iconst_0
    //   461: istore #9
    //   463: aload_0
    //   464: aload_2
    //   465: aload #5
    //   467: aload #4
    //   469: aload #8
    //   471: iload #9
    //   473: invokevirtual ZY : (Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zyd;Lcom/fasterxml/Zor/Zyd;Ljava/lang/Object;Z)Lcom/fasterxml/Zn/Zb;
    //   476: areturn
    // Exception table:
    //   from	to	target	type
    //   16	24	24	com/fasterxml/Zor/Zy_
    //   36	46	49	com/fasterxml/Zor/Zy_
    //   122	134	137	com/fasterxml/Zor/Zy_
    //   127	151	154	com/fasterxml/Zor/Zy_
    //   196	207	210	com/fasterxml/Zor/Zy_
    //   264	320	320	com/fasterxml/Zor/Zy_
    //   336	352	355	com/fasterxml/Zor/Zy_
    //   373	389	389	com/fasterxml/Zor/Zy_
  }
  
  public Zk Zq() {
    return this.Zf;
  }
  
  public boolean Zr(Map.Entry<?, ?> paramEntry) {
    return true;
  }
  
  public boolean ZK(Zyi paramZyi, Map.Entry<?, ?> paramEntry) {
    Object object = paramEntry.getValue();
    try {
      if (object == null)
        return this.Zu; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    try {
      if (this.Zz == null)
        return false; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    Zyd<Object> zyd = this.ZV;
    if (zyd == null) {
      Class<?> clazz = object.getClass();
      zyd = this.ZI.ZO(clazz);
      if (zyd == null)
        try {
          zyd = ZK(this.ZI, clazz, paramZyi);
        } catch (Zy_ zy_) {
          return false;
        }  
    } 
    try {
      if (this.Zz == Zs)
        return zyd.Zt(paramZyi, object); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return this.Zz.equals(object);
  }
  
  public void ZT(Map.Entry<?, ?> paramEntry, Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.ZB(paramEntry);
    ZX(paramEntry, paramZf, paramZyi);
    paramZf.Zh();
  }
  
  public void ZW(Map.Entry<?, ?> paramEntry, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    paramZf.Z_(paramEntry);
    Zn zn = paramZa.ZA(paramZf, paramZa.Zm(paramEntry, Zl.START_OBJECT));
    ZX(paramEntry, paramZf, paramZyi);
    paramZa.ZP(paramZf, zn);
  }
  
  protected void ZX(Map.Entry<?, ?> paramEntry, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic Zl : ()Ljava/lang/String;
    //   3: aload_0
    //   4: getfield Zc : Lcom/fasterxml/Zp/Za;
    //   7: astore #5
    //   9: astore #4
    //   11: aload_1
    //   12: invokeinterface getKey : ()Ljava/lang/Object;
    //   17: astore #6
    //   19: aload #6
    //   21: ifnonnull -> 43
    //   24: aload_3
    //   25: aload_0
    //   26: getfield Zq : Lcom/fasterxml/Zor/Zk;
    //   29: aload_0
    //   30: getfield ZX : Lcom/fasterxml/Zor/Zo;
    //   33: invokevirtual ZB : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyd;
    //   36: astore #7
    //   38: aload #4
    //   40: ifnull -> 49
    //   43: aload_0
    //   44: getfield Za : Lcom/fasterxml/Zor/Zyd;
    //   47: astore #7
    //   49: aload_1
    //   50: invokeinterface getValue : ()Ljava/lang/Object;
    //   55: astore #8
    //   57: aload #8
    //   59: ifnonnull -> 92
    //   62: aload_0
    //   63: getfield Zu : Z
    //   66: ifeq -> 81
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   75: athrow
    //   76: return
    //   77: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   80: athrow
    //   81: aload_3
    //   82: invokevirtual ZJ : ()Lcom/fasterxml/Zor/Zyd;
    //   85: astore #9
    //   87: aload #4
    //   89: ifnull -> 246
    //   92: aload_0
    //   93: getfield ZV : Lcom/fasterxml/Zor/Zyd;
    //   96: astore #9
    //   98: aload #9
    //   100: ifnonnull -> 182
    //   103: aload #8
    //   105: invokevirtual getClass : ()Ljava/lang/Class;
    //   108: astore #10
    //   110: aload_0
    //   111: getfield ZI : Lcom/fasterxml/Zn/Zj;
    //   114: aload #10
    //   116: invokevirtual ZO : (Ljava/lang/Class;)Lcom/fasterxml/Zor/Zyd;
    //   119: astore #9
    //   121: aload #9
    //   123: ifnonnull -> 182
    //   126: aload_0
    //   127: getfield Zf : Lcom/fasterxml/Zor/Zk;
    //   130: invokevirtual Zk : ()Z
    //   133: ifeq -> 169
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   142: athrow
    //   143: aload_0
    //   144: aload_0
    //   145: getfield ZI : Lcom/fasterxml/Zn/Zj;
    //   148: aload_3
    //   149: aload_0
    //   150: getfield Zf : Lcom/fasterxml/Zor/Zk;
    //   153: aload #10
    //   155: invokevirtual ZX : (Lcom/fasterxml/Zor/Zk;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   158: aload_3
    //   159: invokevirtual ZW : (Lcom/fasterxml/Zn/Zj;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zyi;)Lcom/fasterxml/Zor/Zyd;
    //   162: astore #9
    //   164: aload #4
    //   166: ifnull -> 182
    //   169: aload_0
    //   170: aload_0
    //   171: getfield ZI : Lcom/fasterxml/Zn/Zj;
    //   174: aload #10
    //   176: aload_3
    //   177: invokevirtual ZK : (Lcom/fasterxml/Zn/Zj;Ljava/lang/Class;Lcom/fasterxml/Zor/Zyi;)Lcom/fasterxml/Zor/Zyd;
    //   180: astore #9
    //   182: aload_0
    //   183: getfield Zz : Ljava/lang/Object;
    //   186: ifnull -> 246
    //   189: aload_0
    //   190: getfield Zz : Ljava/lang/Object;
    //   193: getstatic com/fasterxml/Zn/Zb.Zs : Ljava/lang/Object;
    //   196: if_acmpne -> 229
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   205: athrow
    //   206: aload #9
    //   208: aload_3
    //   209: aload #8
    //   211: invokevirtual Zt : (Lcom/fasterxml/Zor/Zyi;Ljava/lang/Object;)Z
    //   214: ifeq -> 229
    //   217: goto -> 224
    //   220: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   223: athrow
    //   224: return
    //   225: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   228: athrow
    //   229: aload_0
    //   230: getfield Zz : Ljava/lang/Object;
    //   233: aload #8
    //   235: invokevirtual equals : (Ljava/lang/Object;)Z
    //   238: ifeq -> 246
    //   241: return
    //   242: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   245: athrow
    //   246: aload #7
    //   248: aload #6
    //   250: aload_2
    //   251: aload_3
    //   252: invokevirtual serialize : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   255: aload #5
    //   257: ifnonnull -> 274
    //   260: aload #9
    //   262: aload #8
    //   264: aload_2
    //   265: aload_3
    //   266: invokevirtual serialize : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   269: aload #4
    //   271: ifnull -> 292
    //   274: aload #9
    //   276: aload #8
    //   278: aload_2
    //   279: aload_3
    //   280: aload #5
    //   282: invokevirtual Zo : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zp/Za;)V
    //   285: goto -> 292
    //   288: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   291: athrow
    //   292: goto -> 329
    //   295: astore #10
    //   297: new java/lang/StringBuilder
    //   300: dup
    //   301: invokespecial <init> : ()V
    //   304: ldc ''
    //   306: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: aload #6
    //   311: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   314: invokevirtual toString : ()Ljava/lang/String;
    //   317: astore #11
    //   319: aload_0
    //   320: aload_3
    //   321: aload #10
    //   323: aload_1
    //   324: aload #11
    //   326: invokevirtual ZO : (Lcom/fasterxml/Zor/Zyi;Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;)V
    //   329: return
    // Exception table:
    //   from	to	target	type
    //   57	69	72	java/lang/Exception
    //   62	77	77	java/lang/Exception
    //   121	136	139	java/lang/Exception
    //   182	199	202	java/lang/Exception
    //   189	217	220	java/lang/Exception
    //   206	225	225	java/lang/Exception
    //   229	242	242	java/lang/Exception
    //   255	292	295	java/lang/Exception
    //   260	285	288	java/lang/Exception
  }
  
  protected final Zyd<Object> ZK(Zj paramZj, Class<?> paramClass, Zyi paramZyi) throws Zy_ {
    Zm zm = paramZj.Zd(paramClass, paramZyi, this.ZX);
    try {
      if (paramZj != zm.Za)
        this.ZI = zm.Za; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return zm.Zm;
  }
  
  protected final Zyd<Object> ZW(Zj paramZj, Zk paramZk, Zyi paramZyi) throws Zy_ {
    Zm zm = paramZj.ZN(paramZk, paramZyi, this.ZX);
    try {
      if (paramZj != zm.Za)
        this.ZI = zm.Za; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return zm.Zm;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Zb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */