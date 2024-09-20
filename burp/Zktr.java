package burp;

import java.io.IOException;

public class Zktr extends Zkte {
  private final Zred Zv;
  
  public Zktr(Zr_4 paramZr_4, Zred paramZred) {
    super(paramZr_4, paramZred);
    this.Zv = paramZred;
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    this.Zv.ZS(paramZs4f);
  }
  
  public void Zy4() {
    this.Zv.Zy4();
  }
  
  protected byte[][] Zw(Zzlx paramZzlx, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: invokestatic Zs : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield Zv : Lburp/Zred;
    //   8: invokeinterface Znm : ()Lburp/Zefg;
    //   13: invokeinterface isEmpty : ()Z
    //   18: ifeq -> 496
    //   21: aload_0
    //   22: getfield Zv : Lburp/Zred;
    //   25: invokeinterface ZnW : ()Lburp/Zefg;
    //   30: astore #4
    //   32: aload_0
    //   33: getfield Zv : Lburp/Zred;
    //   36: invokeinterface Znl : ()I
    //   41: aload #4
    //   43: invokeinterface size : ()I
    //   48: if_icmpne -> 81
    //   51: aload_0
    //   52: getfield Zv : Lburp/Zred;
    //   55: aload_0
    //   56: getfield Zv : Lburp/Zred;
    //   59: invokeinterface ZnL : ()I
    //   64: invokeinterface ZvH : (I)V
    //   69: aload_0
    //   70: getfield Zv : Lburp/Zred;
    //   73: iconst_0
    //   74: invokeinterface ZcN : (Z)V
    //   79: aconst_null
    //   80: areturn
    //   81: aload_0
    //   82: getfield Zv : Lburp/Zred;
    //   85: invokeinterface Znj : ()Lburp/Zrte;
    //   90: astore #5
    //   92: aload #4
    //   94: aload_0
    //   95: getfield Zv : Lburp/Zred;
    //   98: invokeinterface Znl : ()I
    //   103: invokeinterface get : (I)Ljava/lang/Object;
    //   108: checkcast burp/Zstu
    //   111: invokeinterface ZiD : ()[B
    //   116: invokevirtual clone : ()Ljava/lang/Object;
    //   119: checkcast [B
    //   122: astore #6
    //   124: aload_0
    //   125: getfield Zv : Lburp/Zred;
    //   128: aload_0
    //   129: getfield Zv : Lburp/Zred;
    //   132: invokeinterface Znl : ()I
    //   137: iconst_1
    //   138: iadd
    //   139: invokeinterface ZeI : (I)V
    //   144: dconst_0
    //   145: dstore #7
    //   147: aload #6
    //   149: astore #9
    //   151: aload #9
    //   153: arraylength
    //   154: istore #10
    //   156: iconst_0
    //   157: istore #11
    //   159: iload #11
    //   161: iload #10
    //   163: if_icmpge -> 255
    //   166: aload #9
    //   168: iload #11
    //   170: baload
    //   171: istore #12
    //   173: iconst_0
    //   174: istore #13
    //   176: iconst_0
    //   177: istore #14
    //   179: iload #14
    //   181: aload #5
    //   183: iconst_0
    //   184: invokeinterface ZdF : (I)Lburp/Zgpi;
    //   189: checkcast burp/Zstu
    //   192: invokeinterface Zpu : ()I
    //   197: if_icmpge -> 237
    //   200: aload #5
    //   202: iconst_0
    //   203: invokeinterface ZdF : (I)Lburp/Zgpi;
    //   208: checkcast burp/Zstu
    //   211: iload #14
    //   213: invokeinterface Zp : (I)B
    //   218: iload #12
    //   220: if_icmpne -> 230
    //   223: iconst_1
    //   224: istore #13
    //   226: aload_3
    //   227: ifnonnull -> 237
    //   230: iinc #14, 1
    //   233: aload_3
    //   234: ifnonnull -> 179
    //   237: iload #13
    //   239: ifeq -> 248
    //   242: dload #7
    //   244: dconst_1
    //   245: dadd
    //   246: dstore #7
    //   248: iinc #11, 1
    //   251: aload_3
    //   252: ifnonnull -> 159
    //   255: ldc2_w 2.0
    //   258: dload #7
    //   260: invokestatic pow : (DD)D
    //   263: d2i
    //   264: istore #9
    //   266: iconst_0
    //   267: istore #10
    //   269: iload #10
    //   271: iload #9
    //   273: if_icmpge -> 496
    //   276: new java/io/ByteArrayOutputStream
    //   279: dup
    //   280: invokespecial <init> : ()V
    //   283: astore #11
    //   285: iconst_m1
    //   286: istore #12
    //   288: aload #6
    //   290: astore #13
    //   292: aload #13
    //   294: arraylength
    //   295: istore #14
    //   297: iconst_0
    //   298: istore #15
    //   300: iload #15
    //   302: iload #14
    //   304: if_icmpge -> 456
    //   307: aload #13
    //   309: iload #15
    //   311: baload
    //   312: istore #16
    //   314: iconst_m1
    //   315: istore #17
    //   317: iconst_0
    //   318: istore #18
    //   320: iload #18
    //   322: aload #5
    //   324: iconst_0
    //   325: invokeinterface ZdF : (I)Lburp/Zgpi;
    //   330: checkcast burp/Zstu
    //   333: invokeinterface Zpu : ()I
    //   338: if_icmpge -> 379
    //   341: aload #5
    //   343: iconst_0
    //   344: invokeinterface ZdF : (I)Lburp/Zgpi;
    //   349: checkcast burp/Zstu
    //   352: iload #18
    //   354: invokeinterface Zp : (I)B
    //   359: iload #16
    //   361: if_icmpne -> 372
    //   364: iload #18
    //   366: istore #17
    //   368: aload_3
    //   369: ifnonnull -> 379
    //   372: iinc #18, 1
    //   375: aload_3
    //   376: ifnonnull -> 320
    //   379: iload #17
    //   381: iconst_m1
    //   382: if_icmpne -> 396
    //   385: aload #11
    //   387: iload #16
    //   389: invokevirtual write : (I)V
    //   392: aload_3
    //   393: ifnonnull -> 449
    //   396: iinc #12, 1
    //   399: ldc2_w 2.0
    //   402: iload #12
    //   404: i2d
    //   405: invokestatic pow : (DD)D
    //   408: d2i
    //   409: iload #10
    //   411: iand
    //   412: ifne -> 426
    //   415: aload #11
    //   417: iload #16
    //   419: invokevirtual write : (I)V
    //   422: aload_3
    //   423: ifnonnull -> 449
    //   426: aload #11
    //   428: aload #5
    //   430: iconst_1
    //   431: invokeinterface ZdF : (I)Lburp/Zgpi;
    //   436: checkcast burp/Zstu
    //   439: iload #17
    //   441: invokeinterface Zp : (I)B
    //   446: invokevirtual write : (I)V
    //   449: iinc #15, 1
    //   452: aload_3
    //   453: ifnonnull -> 300
    //   456: aload_0
    //   457: getfield Zn : Lburp/Zr_4;
    //   460: aload #11
    //   462: invokevirtual toByteArray : ()[B
    //   465: invokeinterface ZZ : ([B)Lburp/Zstu;
    //   470: astore #13
    //   472: aload_0
    //   473: getfield Zv : Lburp/Zred;
    //   476: invokeinterface Znm : ()Lburp/Zefg;
    //   481: aload #13
    //   483: invokeinterface add : (Ljava/lang/Object;)Z
    //   488: pop
    //   489: iinc #10, 1
    //   492: aload_3
    //   493: ifnonnull -> 269
    //   496: aload_0
    //   497: getfield Zv : Lburp/Zred;
    //   500: invokeinterface Znm : ()Lburp/Zefg;
    //   505: iconst_0
    //   506: invokeinterface get : (I)Ljava/lang/Object;
    //   511: checkcast burp/Zstu
    //   514: invokeinterface ZiD : ()[B
    //   519: astore #4
    //   521: aload_0
    //   522: getfield Zv : Lburp/Zred;
    //   525: invokeinterface Znm : ()Lburp/Zefg;
    //   530: iconst_0
    //   531: invokeinterface remove : (I)Ljava/lang/Object;
    //   536: pop
    //   537: aload_0
    //   538: getfield Zv : Lburp/Zred;
    //   541: aload_0
    //   542: getfield Zv : Lburp/Zred;
    //   545: invokeinterface ZnL : ()I
    //   550: iconst_1
    //   551: iadd
    //   552: invokeinterface ZeE : (I)V
    //   557: aload_0
    //   558: getfield Zv : Lburp/Zred;
    //   561: invokeinterface Zyn : ()Lburp/Zm41;
    //   566: new burp/Zr1f
    //   569: dup
    //   570: aload_1
    //   571: invokespecial <init> : (Lburp/Zzlx;)V
    //   574: aload_2
    //   575: aload #4
    //   577: invokeinterface Zm : (Lburp/Zm42;[B[B)[[B
    //   582: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zktr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */