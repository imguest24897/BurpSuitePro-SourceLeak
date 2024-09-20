package net.portswigger;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Zvg implements Zfg {
  static final Zo Ze;
  
  private final Zvv ZT;
  
  private final Zzw Zo;
  
  private final Zaa Zp;
  
  private final ByteArrayOutputStream ZW = new ByteArrayOutputStream();
  
  private Zo Zr = new Zo();
  
  private Zc_ ZJ = null;
  
  private final List<Zhb> Zb;
  
  private static final String a;
  
  public Zvg(Zvv paramZvv, Zzw paramZzw, Zaa paramZaa, List<Zhb> paramList) {
    this.ZT = paramZvv;
    this.Zo = paramZzw;
    this.Zp = paramZaa;
    this.Zb = paramList;
    paramZzw.ZX();
  }
  
  public void Zo(Zrz_ paramZrz_) {
    // Byte code:
    //   0: invokestatic Zk : ()[I
    //   3: astore_2
    //   4: getstatic net/portswigger/Zmj.Zw : [I
    //   7: aload_1
    //   8: invokevirtual Zh : ()Lnet/portswigger/Zc_;
    //   11: invokevirtual ordinal : ()I
    //   14: iaload
    //   15: tableswitch default -> 485, 1 -> 52, 2 -> 237, 3 -> 323, 4 -> 406, 5 -> 434, 6 -> 467
    //   52: aload_0
    //   53: getfield ZW : Ljava/io/ByteArrayOutputStream;
    //   56: aload_1
    //   57: invokevirtual ZK : ()[B
    //   60: invokevirtual write : ([B)V
    //   63: aload_1
    //   64: invokevirtual ZP : ()Z
    //   67: ifeq -> 485
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   76: athrow
    //   77: getstatic net/portswigger/Zmj.Zw : [I
    //   80: aload_0
    //   81: getfield ZJ : Lnet/portswigger/Zc_;
    //   84: invokevirtual ordinal : ()I
    //   87: iaload
    //   88: lookupswitch default -> 193, 2 -> 120, 3 -> 158
    //   116: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   119: athrow
    //   120: aload_0
    //   121: getfield Zo : Lnet/portswigger/Zzw;
    //   124: aload_0
    //   125: aload_0
    //   126: getfield ZW : Ljava/io/ByteArrayOutputStream;
    //   129: invokevirtual toByteArray : ()[B
    //   132: aload_0
    //   133: getfield Zr : Lnet/portswigger/Zo;
    //   136: invokevirtual Zz : ([BLnet/portswigger/Zo;)[B
    //   139: invokestatic ZL : ([B)Ljava/lang/String;
    //   142: invokeinterface ZQ : (Ljava/lang/String;)V
    //   147: aload_2
    //   148: ifnull -> 221
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   157: athrow
    //   158: aload_0
    //   159: getfield Zo : Lnet/portswigger/Zzw;
    //   162: aload_0
    //   163: aload_0
    //   164: getfield ZW : Ljava/io/ByteArrayOutputStream;
    //   167: invokevirtual toByteArray : ()[B
    //   170: aload_0
    //   171: getfield Zr : Lnet/portswigger/Zo;
    //   174: invokevirtual Zz : ([BLnet/portswigger/Zo;)[B
    //   177: invokeinterface ZM : ([B)V
    //   182: aload_2
    //   183: ifnull -> 221
    //   186: goto -> 193
    //   189: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   192: athrow
    //   193: new java/lang/IllegalStateException
    //   196: dup
    //   197: aload_0
    //   198: getfield ZJ : Lnet/portswigger/Zc_;
    //   201: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   204: getstatic net/portswigger/Zvg.a : Ljava/lang/String;
    //   207: swap
    //   208: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   213: invokespecial <init> : (Ljava/lang/String;)V
    //   216: athrow
    //   217: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   220: athrow
    //   221: aload_0
    //   222: aconst_null
    //   223: putfield ZJ : Lnet/portswigger/Zc_;
    //   226: aload_0
    //   227: getfield ZW : Ljava/io/ByteArrayOutputStream;
    //   230: invokevirtual reset : ()V
    //   233: aload_2
    //   234: ifnull -> 485
    //   237: aload_0
    //   238: aload_1
    //   239: invokevirtual ZS : ()Lnet/portswigger/Zo;
    //   242: putfield Zr : Lnet/portswigger/Zo;
    //   245: aload_1
    //   246: invokevirtual ZP : ()Z
    //   249: ifeq -> 294
    //   252: goto -> 259
    //   255: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   258: athrow
    //   259: aload_0
    //   260: getfield Zo : Lnet/portswigger/Zzw;
    //   263: aload_0
    //   264: aload_1
    //   265: invokevirtual ZK : ()[B
    //   268: aload_0
    //   269: getfield Zr : Lnet/portswigger/Zo;
    //   272: invokevirtual Zz : ([BLnet/portswigger/Zo;)[B
    //   275: invokestatic ZL : ([B)Ljava/lang/String;
    //   278: invokeinterface ZQ : (Ljava/lang/String;)V
    //   283: aload_2
    //   284: ifnull -> 485
    //   287: goto -> 294
    //   290: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   293: athrow
    //   294: aload_0
    //   295: getstatic net/portswigger/Zc_.TEXT : Lnet/portswigger/Zc_;
    //   298: putfield ZJ : Lnet/portswigger/Zc_;
    //   301: aload_0
    //   302: getfield ZW : Ljava/io/ByteArrayOutputStream;
    //   305: aload_1
    //   306: invokevirtual ZK : ()[B
    //   309: invokevirtual write : ([B)V
    //   312: aload_2
    //   313: ifnull -> 485
    //   316: goto -> 323
    //   319: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   322: athrow
    //   323: aload_0
    //   324: aload_1
    //   325: invokevirtual ZS : ()Lnet/portswigger/Zo;
    //   328: putfield Zr : Lnet/portswigger/Zo;
    //   331: aload_1
    //   332: invokevirtual ZP : ()Z
    //   335: ifeq -> 377
    //   338: goto -> 345
    //   341: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   344: athrow
    //   345: aload_0
    //   346: getfield Zo : Lnet/portswigger/Zzw;
    //   349: aload_0
    //   350: aload_1
    //   351: invokevirtual ZK : ()[B
    //   354: aload_0
    //   355: getfield Zr : Lnet/portswigger/Zo;
    //   358: invokevirtual Zz : ([BLnet/portswigger/Zo;)[B
    //   361: invokeinterface ZM : ([B)V
    //   366: aload_2
    //   367: ifnull -> 485
    //   370: goto -> 377
    //   373: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   376: athrow
    //   377: aload_0
    //   378: getstatic net/portswigger/Zc_.BINARY : Lnet/portswigger/Zc_;
    //   381: putfield ZJ : Lnet/portswigger/Zc_;
    //   384: aload_0
    //   385: getfield ZW : Ljava/io/ByteArrayOutputStream;
    //   388: aload_1
    //   389: invokevirtual ZK : ()[B
    //   392: invokevirtual write : ([B)V
    //   395: aload_2
    //   396: ifnull -> 485
    //   399: goto -> 406
    //   402: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   405: athrow
    //   406: aload_0
    //   407: getfield Zp : Lnet/portswigger/Zaa;
    //   410: invokevirtual Zn : ()V
    //   413: aload_0
    //   414: getfield Zo : Lnet/portswigger/Zzw;
    //   417: aconst_null
    //   418: invokeinterface Za : (Ljava/lang/Throwable;)V
    //   423: aload_2
    //   424: ifnull -> 485
    //   427: goto -> 434
    //   430: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   433: athrow
    //   434: aload_0
    //   435: getfield Zp : Lnet/portswigger/Zaa;
    //   438: getstatic net/portswigger/Zc_.PONG : Lnet/portswigger/Zc_;
    //   441: aload_1
    //   442: invokevirtual ZK : ()[B
    //   445: aload_1
    //   446: invokevirtual Zp : ()I
    //   449: getstatic net/portswigger/Zvg.Ze : Lnet/portswigger/Zo;
    //   452: iconst_1
    //   453: invokevirtual ZY : (Lnet/portswigger/Zc_;[BILnet/portswigger/Zo;Z)V
    //   456: aload_2
    //   457: ifnull -> 485
    //   460: goto -> 467
    //   463: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   466: athrow
    //   467: aload_0
    //   468: getfield ZT : Lnet/portswigger/Zvv;
    //   471: aload_1
    //   472: invokevirtual ZK : ()[B
    //   475: invokevirtual Zl : ([B)V
    //   478: goto -> 485
    //   481: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   484: athrow
    //   485: goto -> 513
    //   488: astore_3
    //   489: aload_3
    //   490: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   493: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   496: aload_0
    //   497: getfield Zo : Lnet/portswigger/Zzw;
    //   500: aconst_null
    //   501: invokeinterface Za : (Ljava/lang/Throwable;)V
    //   506: aload_0
    //   507: getfield Zp : Lnet/portswigger/Zaa;
    //   510: invokevirtual Zn : ()V
    //   513: return
    // Exception table:
    //   from	to	target	type
    //   4	70	73	java/io/IOException
    //   4	485	488	java/io/IOException
    //   52	116	116	java/io/IOException
    //   77	151	154	java/io/IOException
    //   120	186	189	java/io/IOException
    //   158	217	217	java/io/IOException
    //   221	252	255	java/io/IOException
    //   237	287	290	java/io/IOException
    //   259	316	319	java/io/IOException
    //   294	338	341	java/io/IOException
    //   323	370	373	java/io/IOException
    //   345	399	402	java/io/IOException
    //   377	427	430	java/io/IOException
    //   406	460	463	java/io/IOException
    //   434	478	481	java/io/IOException
  }
  
  public void Zy(Throwable paramThrowable) {
    this.Zo.Za(paramThrowable);
    this.Zp.Zn();
  }
  
  private byte[] Zz(byte[] paramArrayOfbyte, Zo paramZo) {
    Collections.reverse(this.Zb);
    Zo zo = paramZo;
    int[] arrayOfInt = Zus.Zk();
    for (Zhb zhb : this.Zb) {
      Zto<byte[], Zo> zto = zhb.ZE(paramArrayOfbyte, zo);
      paramArrayOfbyte = (byte[])zto.Zq;
      zo = (Zo)zto.Zo;
      if (arrayOfInt != null)
        break; 
    } 
    return paramArrayOfbyte;
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: ldc 'Z;POm{0QJ_hi0GJS~jo'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Zvg.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #29
    //   82: goto -> 112
    //   85: bipush #71
    //   87: goto -> 112
    //   90: bipush #39
    //   92: goto -> 112
    //   95: bipush #120
    //   97: goto -> 112
    //   100: bipush #115
    //   102: goto -> 112
    //   105: bipush #56
    //   107: goto -> 112
    //   110: bipush #28
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: new net/portswigger/Zo
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic net/portswigger/Zvg.Ze : Lnet/portswigger/Zo;
    //   164: return
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zvg.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */