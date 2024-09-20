package burp;

import java.awt.geom.Rectangle2D;
import java.util.Iterator;
import javax.swing.text.TabExpander;

public class Ztoh {
  public static int ZE(Ze7g paramZe7g, Zmgn paramZmgn, TabExpander paramTabExpander, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: fload #4
    //   2: fload_3
    //   3: invokestatic max : (FF)F
    //   6: fstore #4
    //   8: fload_3
    //   9: fstore #7
    //   11: fload_3
    //   12: fstore #8
    //   14: invokestatic ZW : ()[I
    //   17: aload_1
    //   18: invokevirtual Zi : ()Lburp/Zzkh;
    //   21: astore #9
    //   23: astore #5
    //   25: aload_0
    //   26: invokevirtual Zs : ()Lburp/Zska;
    //   29: ifnonnull -> 36
    //   32: iconst_m1
    //   33: goto -> 43
    //   36: aload_0
    //   37: invokevirtual Zs : ()Lburp/Zska;
    //   40: invokevirtual ZJ : ()I
    //   43: istore #10
    //   45: aload_0
    //   46: invokevirtual iterator : ()Ljava/util/Iterator;
    //   49: astore #11
    //   51: aload #11
    //   53: invokeinterface hasNext : ()Z
    //   58: ifeq -> 487
    //   61: aload #11
    //   63: invokeinterface next : ()Ljava/lang/Object;
    //   68: checkcast burp/Zska
    //   71: astore #12
    //   73: aload #12
    //   75: invokevirtual ZG : ()Z
    //   78: ifeq -> 51
    //   81: aload_1
    //   82: invokevirtual ZE : ()Z
    //   85: ifne -> 101
    //   88: aload #12
    //   90: invokevirtual ZX : ()I
    //   93: bipush #49
    //   95: if_icmpne -> 101
    //   98: goto -> 51
    //   101: aload #12
    //   103: getfield ZG : [C
    //   106: astore #13
    //   108: aload #12
    //   110: getfield Zd : I
    //   113: istore #14
    //   115: iload #14
    //   117: aload #12
    //   119: getfield ZA : I
    //   122: iadd
    //   123: istore #15
    //   125: iload #14
    //   127: istore #16
    //   129: iload #16
    //   131: iload #15
    //   133: if_icmpge -> 471
    //   136: fload #7
    //   138: fstore #6
    //   140: aload #13
    //   142: iload #16
    //   144: caload
    //   145: istore #17
    //   147: aload_1
    //   148: invokevirtual ZE : ()Z
    //   151: ifeq -> 246
    //   154: iload #17
    //   156: invokestatic ZN : (C)Z
    //   159: ifeq -> 192
    //   162: fload #7
    //   164: iload #17
    //   166: aload #9
    //   168: invokestatic ZI : (CLburp/Zzkh;)Lburp/Zs5o;
    //   171: invokevirtual Zq : ()F
    //   174: fadd
    //   175: fstore #7
    //   177: fload #7
    //   179: fstore #8
    //   181: iload #16
    //   183: iconst_1
    //   184: iadd
    //   185: istore #14
    //   187: aload #5
    //   189: ifnonnull -> 386
    //   192: aload_1
    //   193: invokevirtual Zb : ()Z
    //   196: ifeq -> 218
    //   199: aload #12
    //   201: invokevirtual Zj : ()Z
    //   204: ifeq -> 218
    //   207: iload #16
    //   209: iconst_1
    //   210: iadd
    //   211: istore #14
    //   213: aload #5
    //   215: ifnonnull -> 386
    //   218: fload #8
    //   220: aload #9
    //   222: aload #13
    //   224: iload #14
    //   226: iload #16
    //   228: iload #14
    //   230: isub
    //   231: iconst_1
    //   232: iadd
    //   233: invokeinterface Zo : ([CII)F
    //   238: fadd
    //   239: fstore #7
    //   241: aload #5
    //   243: ifnonnull -> 386
    //   246: aload_1
    //   247: invokevirtual Zb : ()Z
    //   250: ifeq -> 272
    //   253: aload #12
    //   255: invokevirtual Zj : ()Z
    //   258: ifeq -> 272
    //   261: iload #16
    //   263: iconst_1
    //   264: iadd
    //   265: istore #14
    //   267: aload #5
    //   269: ifnonnull -> 386
    //   272: iload #17
    //   274: bipush #9
    //   276: if_icmpne -> 305
    //   279: aload_2
    //   280: fload #7
    //   282: iconst_0
    //   283: invokeinterface nextTabStop : (FI)F
    //   288: fstore #7
    //   290: fload #7
    //   292: fstore #8
    //   294: iload #16
    //   296: iconst_1
    //   297: iadd
    //   298: istore #14
    //   300: aload #5
    //   302: ifnonnull -> 386
    //   305: iload #17
    //   307: invokestatic ZR : (C)Z
    //   310: ifeq -> 328
    //   313: fload #7
    //   315: fstore #8
    //   317: iload #16
    //   319: iconst_1
    //   320: iadd
    //   321: istore #14
    //   323: aload #5
    //   325: ifnonnull -> 386
    //   328: iload #14
    //   330: istore #18
    //   332: iload #16
    //   334: iload #14
    //   336: isub
    //   337: iconst_1
    //   338: iadd
    //   339: istore #19
    //   341: iload #19
    //   343: newarray char
    //   345: astore #20
    //   347: iconst_0
    //   348: iload #19
    //   350: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   353: aload #20
    //   355: aload #13
    //   357: iload #18
    //   359: <illegal opcode> accept : ([C[CI)Ljava/util/function/IntConsumer;
    //   364: invokeinterface forEach : (Ljava/util/function/IntConsumer;)V
    //   369: fload #8
    //   371: aload #9
    //   373: aload #20
    //   375: iconst_0
    //   376: iload #19
    //   378: invokeinterface Zo : ([CII)F
    //   383: fadd
    //   384: fstore #7
    //   386: fload #4
    //   388: fload #6
    //   390: fcmpl
    //   391: iflt -> 406
    //   394: fload #4
    //   396: fload #7
    //   398: fcmpg
    //   399: ifgt -> 406
    //   402: iconst_1
    //   403: goto -> 407
    //   406: iconst_0
    //   407: istore #18
    //   409: iload #18
    //   411: ifeq -> 463
    //   414: iload #10
    //   416: iload #16
    //   418: iadd
    //   419: aload #12
    //   421: getfield Zd : I
    //   424: isub
    //   425: istore #19
    //   427: fload #4
    //   429: fload #6
    //   431: fsub
    //   432: fload #7
    //   434: fload #4
    //   436: fsub
    //   437: fcmpg
    //   438: ifge -> 445
    //   441: iconst_1
    //   442: goto -> 446
    //   445: iconst_0
    //   446: istore #20
    //   448: iload #20
    //   450: ifeq -> 458
    //   453: iload #19
    //   455: goto -> 462
    //   458: iload #19
    //   460: iconst_1
    //   461: iadd
    //   462: ireturn
    //   463: iinc #16, 1
    //   466: aload #5
    //   468: ifnonnull -> 129
    //   471: fload #7
    //   473: fstore #8
    //   475: aload #12
    //   477: invokevirtual ZF : ()I
    //   480: istore #10
    //   482: aload #5
    //   484: ifnonnull -> 51
    //   487: iload #10
    //   489: ireturn
  }
  
  public static Rectangle2D ZD(Ze7g paramZe7g, Zmgn paramZmgn, TabExpander paramTabExpander, int paramInt, float paramFloat, Rectangle2D paramRectangle2D) {
    float f = paramFloat;
    Zzkh zzkh = paramZmgn.Zi();
    Iterator<Zska> iterator = paramZe7g.iterator();
    int[] arrayOfInt = Zgpw.ZW();
    while (iterator.hasNext()) {
      Zska zska = iterator.next();
      if (!zska.ZG())
        continue; 
      if (zska.Zc(paramInt))
        return ZK(paramTabExpander, paramInt, f, zska, zzkh, paramRectangle2D, paramZmgn); 
      f += zska.ZB(paramZmgn, paramTabExpander, f, paramZmgn.Zi());
      if (arrayOfInt == null)
        break; 
    } 
    return new Rectangle2D.Double(f, paramRectangle2D.getY(), 1.0D, paramRectangle2D.getHeight());
  }
  
  private static Rectangle2D ZK(TabExpander paramTabExpander, int paramInt, float paramFloat, Zska paramZska, Zzkh paramZzkh, Rectangle2D paramRectangle2D, Zmgn paramZmgn) {
    char[] arrayOfChar = paramZska.ZG;
    Zska zska = paramZska.ZC(paramInt - paramZska.ZJ());
    float f = paramFloat + zska.ZB(paramZmgn, paramTabExpander, paramFloat, paramZmgn.Zi());
    int i = paramZska.Zo(paramInt);
    return (arrayOfChar[i] == '\t') ? new Rectangle2D.Double(f, paramRectangle2D.getY(), paramZzkh.Zm(' '), paramRectangle2D.getHeight()) : (Zs5o.Zc(arrayOfChar[i]) ? new Rectangle2D.Double(f, paramRectangle2D.getY(), paramZzkh.Zm('?'), paramRectangle2D.getHeight()) : new Rectangle2D.Double(f, paramRectangle2D.getY(), paramZzkh.Zm(arrayOfChar[i]), paramRectangle2D.getHeight()));
  }
  
  private static void lambda$getListOffset$0(char[] paramArrayOfchar1, char[] paramArrayOfchar2, int paramInt1, int paramInt2) {
    paramArrayOfchar1[paramInt2] = Zs5o.Zc(paramArrayOfchar2[paramInt2 + paramInt1]) ? '?' : paramArrayOfchar2[paramInt2 + paramInt1];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztoh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */