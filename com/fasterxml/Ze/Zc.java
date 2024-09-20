package com.fasterxml.Ze;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zo.Zv;
import com.fasterxml.Zo.Zzp;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import java.io.IOException;
import java.util.HashMap;

public final class Zc {
  protected final int Zl;
  
  protected final Zzp ZG;
  
  protected final HashMap<String, Zv> ZW;
  
  protected final Zv[] Zm;
  
  protected Zc(Zyg paramZyg, Zzp paramZzp, Zv[] paramArrayOfZv, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: invokespecial <init> : ()V
    //   7: aload_0
    //   8: aload_2
    //   9: putfield ZG : Lcom/fasterxml/Zo/Zzp;
    //   12: astore #6
    //   14: iload #4
    //   16: ifeq -> 38
    //   19: aload_0
    //   20: aload_1
    //   21: invokevirtual Za : ()Lcom/fasterxml/Zor/Zyc;
    //   24: invokevirtual ZL : ()Ljava/util/Locale;
    //   27: invokestatic Zh : (Ljava/util/Locale;)Lcom/fasterxml/Ze/Zg;
    //   30: putfield ZW : Ljava/util/HashMap;
    //   33: aload #6
    //   35: ifnull -> 49
    //   38: aload_0
    //   39: new java/util/HashMap
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: putfield ZW : Ljava/util/HashMap;
    //   49: aload_3
    //   50: arraylength
    //   51: istore #7
    //   53: aload_0
    //   54: iload #7
    //   56: putfield Zl : I
    //   59: aload_0
    //   60: iload #7
    //   62: anewarray com/fasterxml/Zo/Zv
    //   65: putfield Zm : [Lcom/fasterxml/Zo/Zv;
    //   68: iload #5
    //   70: ifeq -> 190
    //   73: aload_1
    //   74: invokevirtual Za : ()Lcom/fasterxml/Zor/Zyc;
    //   77: astore #8
    //   79: aload_3
    //   80: astore #9
    //   82: aload #9
    //   84: arraylength
    //   85: istore #10
    //   87: iconst_0
    //   88: istore #11
    //   90: iload #11
    //   92: iload #10
    //   94: if_icmpge -> 190
    //   97: aload #9
    //   99: iload #11
    //   101: aaload
    //   102: astore #12
    //   104: aload #12
    //   106: invokevirtual ZV : ()Z
    //   109: ifne -> 182
    //   112: aload #12
    //   114: aload #8
    //   116: invokevirtual ZR : (Lcom/fasterxml/Zj/Zf;)Ljava/util/List;
    //   119: astore #13
    //   121: aload #13
    //   123: invokeinterface isEmpty : ()Z
    //   128: ifne -> 182
    //   131: aload #13
    //   133: invokeinterface iterator : ()Ljava/util/Iterator;
    //   138: astore #14
    //   140: aload #14
    //   142: invokeinterface hasNext : ()Z
    //   147: ifeq -> 182
    //   150: aload #14
    //   152: invokeinterface next : ()Ljava/lang/Object;
    //   157: checkcast com/fasterxml/Zor/Zr
    //   160: astore #15
    //   162: aload_0
    //   163: getfield ZW : Ljava/util/HashMap;
    //   166: aload #15
    //   168: invokevirtual Zb : ()Ljava/lang/String;
    //   171: aload #12
    //   173: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   176: pop
    //   177: aload #6
    //   179: ifnull -> 140
    //   182: iinc #11, 1
    //   185: aload #6
    //   187: ifnull -> 90
    //   190: iconst_0
    //   191: istore #8
    //   193: iload #8
    //   195: iload #7
    //   197: if_icmpge -> 246
    //   200: aload_3
    //   201: iload #8
    //   203: aaload
    //   204: astore #9
    //   206: aload_0
    //   207: getfield Zm : [Lcom/fasterxml/Zo/Zv;
    //   210: iload #8
    //   212: aload #9
    //   214: aastore
    //   215: aload #9
    //   217: invokevirtual ZV : ()Z
    //   220: ifne -> 238
    //   223: aload_0
    //   224: getfield ZW : Ljava/util/HashMap;
    //   227: aload #9
    //   229: invokevirtual ZT : ()Ljava/lang/String;
    //   232: aload #9
    //   234: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   237: pop
    //   238: iinc #8, 1
    //   241: aload #6
    //   243: ifnull -> 193
    //   246: return
  }
  
  public static Zc Zh(Zyg paramZyg, Zzp paramZzp, Zv[] paramArrayOfZv, Zo8 paramZo8) throws Zy_ {
    int i = paramArrayOfZv.length;
    Zv[] arrayOfZv = new Zv[i];
    String[] arrayOfString = Z_.ZI();
    byte b = 0;
    while (b < i) {
      Zv zv = paramArrayOfZv[b];
      try {
        if (!zv.ZN() && !zv.Zv())
          zv = zv.Zt(paramZyg.ZC(zv.Zp(), (Zo)zv)); 
      } catch (Zy_ zy_) {
        throw a(null);
      } 
      arrayOfZv[b] = zv;
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return new Zc(paramZyg, paramZzp, arrayOfZv, paramZo8.ZV(), true);
  }
  
  public static Zc ZV(Zyg paramZyg, Zzp paramZzp, Zv[] paramArrayOfZv, boolean paramBoolean) throws Zy_ {
    int i = paramArrayOfZv.length;
    String[] arrayOfString = Z_.ZI();
    Zv[] arrayOfZv = new Zv[i];
    byte b = 0;
    while (b < i) {
      Zv zv = paramArrayOfZv[b];
      if (!zv.ZN())
        zv = zv.Zt(paramZyg.ZC(zv.Zp(), (Zo)zv)); 
      arrayOfZv[b] = zv;
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return new Zc(paramZyg, paramZzp, arrayOfZv, paramBoolean, false);
  }
  
  public Zv ZO(String paramString) {
    return this.ZW.get(paramString);
  }
  
  public Zok Zn(Zg paramZg, Zyg paramZyg, Zz paramZz) {
    return new Zok(paramZg, paramZyg, this.Zl, paramZz);
  }
  
  public Object ZP(Zyg paramZyg, Zok paramZok) throws IOException {
    Object object = this.ZG.ZY(paramZyg, this.Zm, paramZok);
    String[] arrayOfString = Z_.ZI();
    if (object != null) {
      object = paramZok.ZS(paramZyg, object);
      Zu zu = paramZok.ZD();
      while (zu != null) {
        zu.ZL(object);
        zu = zu.ZH;
        if (arrayOfString != null)
          break; 
      } 
    } 
    return object;
  }
  
  private static Zy_ a(Zy_ paramZy_) {
    return paramZy_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */