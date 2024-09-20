package burp;

import java.util.Map;
import net.portswigger.Zqf;
import net.portswigger.Zrmq;
import net.portswigger.Zuh;

public class Zz0e {
  private final Zzkm ZS;
  
  private final Zl_y ZC;
  
  public Zz0e(String paramString) throws Ze0d {
    this();
    ZC(paramString);
  }
  
  public Zz0e() {
    this(new Zzkm());
  }
  
  public Zz0e(Zzkm paramZzkm) {
    this(paramZzkm, new Zl_y());
  }
  
  Zz0e(Zzkm paramZzkm, Zl_y paramZl_y) {
    this.ZS = paramZzkm;
    this.ZC = paramZl_y;
  }
  
  public void ZC(String paramString) throws Ze0d {
    ZX("", Zkkv.Zm(paramString));
    this.ZC.ZL(this.ZS);
  }
  
  public Zzkm ZO() {
    return this.ZS;
  }
  
  private void ZX(String paramString, Zrmq paramZrmq) throws Ze0d {
    // Byte code:
    //   0: invokestatic ZU : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: aload_2
    //   5: invokeinterface Za : ()Z
    //   10: ifne -> 28
    //   13: new burp/Ze0d
    //   16: dup
    //   17: getstatic burp/Zrgs.NOT_JSON : Lburp/Zrgs;
    //   20: invokespecial <init> : (Lburp/Zrgs;)V
    //   23: athrow
    //   24: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   27: athrow
    //   28: aload_2
    //   29: invokeinterface ZX : ()Ljava/lang/Iterable;
    //   34: invokeinterface iterator : ()Ljava/util/Iterator;
    //   39: astore #4
    //   41: aload #4
    //   43: invokeinterface hasNext : ()Z
    //   48: ifeq -> 460
    //   51: aload #4
    //   53: invokeinterface next : ()Ljava/lang/Object;
    //   58: checkcast java/util/Map$Entry
    //   61: astore #5
    //   63: aload #5
    //   65: invokeinterface getValue : ()Ljava/lang/Object;
    //   70: checkcast net/portswigger/Zrmq
    //   73: astore #6
    //   75: aload_1
    //   76: invokevirtual isEmpty : ()Z
    //   79: ifeq -> 99
    //   82: aload #5
    //   84: invokeinterface getKey : ()Ljava/lang/Object;
    //   89: checkcast java/lang/String
    //   92: goto -> 115
    //   95: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   98: athrow
    //   99: aload_1
    //   100: aload #5
    //   102: invokeinterface getKey : ()Ljava/lang/Object;
    //   107: checkcast java/lang/String
    //   110: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   115: astore #7
    //   117: aload #6
    //   119: invokeinterface Zb : ()Z
    //   124: ifeq -> 164
    //   127: aload_0
    //   128: getfield ZS : Lburp/Zzkm;
    //   131: aload #7
    //   133: new burp/Zzq0
    //   136: dup
    //   137: aload #6
    //   139: invokeinterface Zk : ()Ljava/lang/Number;
    //   144: invokevirtual longValue : ()J
    //   147: invokespecial <init> : (J)V
    //   150: invokevirtual Z_ : (Ljava/lang/String;Lburp/Zlwx;)V
    //   153: aload_3
    //   154: ifnonnull -> 456
    //   157: goto -> 164
    //   160: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   163: athrow
    //   164: aload #6
    //   166: invokeinterface Zr : ()Z
    //   171: ifeq -> 215
    //   174: goto -> 181
    //   177: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   180: athrow
    //   181: aload_0
    //   182: getfield ZS : Lburp/Zzkm;
    //   185: aload #7
    //   187: new burp/Zzqs
    //   190: dup
    //   191: aload #6
    //   193: invokeinterface ZW : ()Ljava/lang/String;
    //   198: invokespecial <init> : (Ljava/lang/String;)V
    //   201: invokevirtual Z_ : (Ljava/lang/String;Lburp/Zlwx;)V
    //   204: aload_3
    //   205: ifnonnull -> 456
    //   208: goto -> 215
    //   211: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   214: athrow
    //   215: aload #6
    //   217: invokeinterface Zh : ()Z
    //   222: ifeq -> 266
    //   225: goto -> 232
    //   228: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   231: athrow
    //   232: aload_0
    //   233: getfield ZS : Lburp/Zzkm;
    //   236: aload #7
    //   238: new burp/Zzqn
    //   241: dup
    //   242: aload #6
    //   244: invokeinterface Zm : ()Z
    //   249: invokespecial <init> : (Z)V
    //   252: invokevirtual Z_ : (Ljava/lang/String;Lburp/Zlwx;)V
    //   255: aload_3
    //   256: ifnonnull -> 456
    //   259: goto -> 266
    //   262: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   265: athrow
    //   266: aload #6
    //   268: invokeinterface Za : ()Z
    //   273: ifeq -> 302
    //   276: goto -> 283
    //   279: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   282: athrow
    //   283: aload_0
    //   284: aload #7
    //   286: aload #6
    //   288: invokevirtual ZX : (Ljava/lang/String;Lnet/portswigger/Zrmq;)V
    //   291: aload_3
    //   292: ifnonnull -> 456
    //   295: goto -> 302
    //   298: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   301: athrow
    //   302: aload #6
    //   304: invokeinterface Zw : ()Z
    //   309: ifeq -> 398
    //   312: goto -> 319
    //   315: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   318: athrow
    //   319: new burp/Zzqw
    //   322: dup
    //   323: invokespecial <init> : ()V
    //   326: astore #8
    //   328: aload #6
    //   330: invokeinterface ZO : ()Ljava/lang/Iterable;
    //   335: invokeinterface iterator : ()Ljava/util/Iterator;
    //   340: astore #9
    //   342: aload #9
    //   344: invokeinterface hasNext : ()Z
    //   349: ifeq -> 383
    //   352: aload #9
    //   354: invokeinterface next : ()Ljava/lang/Object;
    //   359: checkcast net/portswigger/Zrmq
    //   362: astore #10
    //   364: aload_0
    //   365: aload #10
    //   367: invokevirtual ZC : (Lnet/portswigger/Zrmq;)Lburp/Zlwx;
    //   370: astore #11
    //   372: aload #8
    //   374: aload #11
    //   376: invokevirtual Zx : (Lburp/Zlwx;)V
    //   379: aload_3
    //   380: ifnonnull -> 342
    //   383: aload_0
    //   384: getfield ZS : Lburp/Zzkm;
    //   387: aload #7
    //   389: aload #8
    //   391: invokevirtual Z_ : (Ljava/lang/String;Lburp/Zlwx;)V
    //   394: aload_3
    //   395: ifnonnull -> 456
    //   398: aload #6
    //   400: invokeinterface Zy : ()Z
    //   405: ifeq -> 442
    //   408: goto -> 415
    //   411: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   414: athrow
    //   415: aload_0
    //   416: getfield ZS : Lburp/Zzkm;
    //   419: aload #7
    //   421: new burp/Zxn
    //   424: dup
    //   425: invokespecial <init> : ()V
    //   428: invokevirtual Z_ : (Ljava/lang/String;Lburp/Zlwx;)V
    //   431: aload_3
    //   432: ifnonnull -> 456
    //   435: goto -> 442
    //   438: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   441: athrow
    //   442: iconst_0
    //   443: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   446: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   449: goto -> 456
    //   452: invokestatic a : (Lburp/Ze0d;)Lburp/Ze0d;
    //   455: athrow
    //   456: aload_3
    //   457: ifnonnull -> 41
    //   460: return
    // Exception table:
    //   from	to	target	type
    //   4	24	24	burp/Ze0d
    //   75	95	95	burp/Ze0d
    //   117	157	160	burp/Ze0d
    //   127	174	177	burp/Ze0d
    //   164	208	211	burp/Ze0d
    //   181	225	228	burp/Ze0d
    //   215	259	262	burp/Ze0d
    //   232	276	279	burp/Ze0d
    //   266	295	298	burp/Ze0d
    //   283	312	315	burp/Ze0d
    //   383	408	411	burp/Ze0d
    //   398	435	438	burp/Ze0d
    //   415	449	452	burp/Ze0d
  }
  
  private Zlwx ZC(Zrmq paramZrmq) {
    String[] arrayOfString = Ze0d.ZU();
    if (paramZrmq.Zb())
      return new Zzq0(paramZrmq.Zk().longValue()); 
    if (paramZrmq.Zr())
      return new Zzqs(paramZrmq.ZW()); 
    if (paramZrmq.Zh())
      return new Zzqn(paramZrmq.Zm()); 
    if (paramZrmq.Zy())
      return Zxn.Zd; 
    if (paramZrmq.Za()) {
      Zzqp zzqp = new Zzqp();
      for (Map.Entry entry : paramZrmq.ZX()) {
        zzqp.Zc((String)entry.getKey(), ZC((Zrmq)entry.getValue()));
        if (arrayOfString == null)
          break; 
      } 
      return zzqp;
    } 
    if (paramZrmq.Zw()) {
      Zzqw zzqw = new Zzqw();
      for (Zrmq zrmq : paramZrmq.ZO()) {
        zzqw.Zx(ZC(zrmq));
        if (arrayOfString == null)
          break; 
      } 
      return zzqw;
    } 
    Zuh.Zb(false, Zqf.Zk);
    return Zlwx.Zn;
  }
  
  private static Ze0d a(Ze0d paramZe0d) {
    return paramZe0d;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz0e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */