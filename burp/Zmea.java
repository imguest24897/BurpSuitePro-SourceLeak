package burp;

import java.util.EnumSet;
import java.util.Map;
import java.util.function.Consumer;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmea extends Zmvg {
  private static final Map<Zg3n, String> ZA;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmea() {
    super(EnumSet.of(Zzqz.VARIANT, Zzqz.FLAGS));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    StringBuilder stringBuilder = new StringBuilder();
    Zv(paramZvs, paramByte1, paramInt, paramZtlj, paramZtub, paramZefg, paramArrayOfbyte).accept(stringBuilder);
    return stringBuilder.toString();
  }
  
  private Consumer<StringBuilder> Zv(Zvs paramZvs, byte paramByte, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: iload_2
    //   1: invokestatic ZM : (B)Z
    //   4: ifeq -> 18
    //   7: aload #4
    //   9: aload #6
    //   11: iload_2
    //   12: <illegal opcode> accept : (Lburp/Ztlj;Lburp/Zefg;B)Ljava/util/function/Consumer;
    //   17: areturn
    //   18: aload #5
    //   20: aload #6
    //   22: aload #4
    //   24: iload_2
    //   25: iload_3
    //   26: aload_1
    //   27: aload #7
    //   29: <illegal opcode> accept : (Lburp/Ztub;Lburp/Zefg;Lburp/Ztlj;BILburp/Zvs;[B)Ljava/util/function/Consumer;
    //   34: areturn
  }
  
  public String Zt(Zvs paramZvs, byte paramByte, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg) {
    if (!paramZtlj.Zn(Ztz3.LOCATION))
      return null; 
    Zr2s zr2s = new Zr2s(paramZtlj, paramZefg, paramInt, Zmey.ZS(paramZefg));
    paramZtub.ZT(zr2s);
    return zr2s.Zn;
  }
  
  private static void ZE(StringBuilder paramStringBuilder, int paramInt, Zefg<Zxtl> paramZefg) {
    if ((paramInt & 0x80) == 128 && Zf(paramZefg).ZTr() != Zs66.COOKIE)
      paramStringBuilder.append(a(31876, 7927)); 
  }
  
  private static boolean ZM(byte paramByte) {
    return (paramByte == 17 || paramByte == 18 || paramByte == 19);
  }
  
  private static Zxtl Zf(Zefg<Zxtl> paramZefg) {
    return paramZefg.get(0);
  }
  
  public static void Zi(StringBuilder paramStringBuilder, int paramInt, byte paramByte, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZQ : ()Ljava/lang/String;
    //   3: astore #4
    //   5: iload_1
    //   6: iconst_4
    //   7: iand
    //   8: iconst_4
    //   9: if_icmpne -> 81
    //   12: sipush #31898
    //   15: sipush #-25666
    //   18: invokestatic a : (II)Ljava/lang/String;
    //   21: astore #5
    //   23: iload_1
    //   24: sipush #16384
    //   27: iand
    //   28: sipush #16384
    //   31: if_icmpne -> 45
    //   34: sipush #31996
    //   37: sipush #-31786
    //   40: invokestatic a : (II)Ljava/lang/String;
    //   43: astore #5
    //   45: aload_0
    //   46: sipush #31986
    //   49: sipush #-26354
    //   52: invokestatic a : (II)Ljava/lang/String;
    //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: aload #5
    //   60: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: sipush #31889
    //   66: sipush #-13178
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: aload #4
    //   78: ifnull -> 150
    //   81: iload_2
    //   82: bipush #14
    //   84: if_icmpne -> 106
    //   87: aload_0
    //   88: sipush #31893
    //   91: sipush #14571
    //   94: invokestatic a : (II)Ljava/lang/String;
    //   97: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: aload #4
    //   103: ifnull -> 150
    //   106: iload_2
    //   107: invokestatic ZM : (B)Z
    //   110: ifne -> 150
    //   113: aload_0
    //   114: sipush #31942
    //   117: sipush #25500
    //   120: invokestatic a : (II)Ljava/lang/String;
    //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: pop
    //   127: aload_0
    //   128: iload_2
    //   129: invokestatic Zo : (B)Ljava/lang/String;
    //   132: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: pop
    //   136: aload_0
    //   137: sipush #31960
    //   140: sipush #5831
    //   143: invokestatic a : (II)Ljava/lang/String;
    //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: pop
    //   150: getstatic burp/Zmea.ZA : Ljava/util/Map;
    //   153: invokeinterface entrySet : ()Ljava/util/Set;
    //   158: invokeinterface iterator : ()Ljava/util/Iterator;
    //   163: astore #5
    //   165: aload #5
    //   167: invokeinterface hasNext : ()Z
    //   172: ifeq -> 291
    //   175: aload #5
    //   177: invokeinterface next : ()Ljava/lang/Object;
    //   182: checkcast java/util/Map$Entry
    //   185: astore #6
    //   187: aload #6
    //   189: invokeinterface getKey : ()Ljava/lang/Object;
    //   194: checkcast burp/Zg3n
    //   197: iload_1
    //   198: iload_2
    //   199: invokevirtual ZQ : (IB)Z
    //   202: ifeq -> 286
    //   205: aload #6
    //   207: invokeinterface getValue : ()Ljava/lang/Object;
    //   212: checkcast java/lang/String
    //   215: astore #7
    //   217: aload #7
    //   219: sipush #31970
    //   222: sipush #-22992
    //   225: invokestatic a : (II)Ljava/lang/String;
    //   228: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   231: ifeq -> 279
    //   234: iload_3
    //   235: ifeq -> 250
    //   238: sipush #31976
    //   241: sipush #15441
    //   244: invokestatic a : (II)Ljava/lang/String;
    //   247: goto -> 259
    //   250: sipush #31897
    //   253: sipush #6903
    //   256: invokestatic a : (II)Ljava/lang/String;
    //   259: astore #8
    //   261: aload #7
    //   263: sipush #31967
    //   266: sipush #-8568
    //   269: invokestatic a : (II)Ljava/lang/String;
    //   272: aload #8
    //   274: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   277: astore #7
    //   279: aload_0
    //   280: aload #7
    //   282: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: pop
    //   286: aload #4
    //   288: ifnull -> 165
    //   291: return
  }
  
  private static String Zo(byte paramByte) {
    switch (paramByte) {
      case 0:
        return a(31989, 4784);
      case 1:
        return a(31899, 15519);
      case 2:
        return a(31955, 7225);
      case 3:
        return a(31950, -8769);
      case 4:
        return a(31964, -25049);
      case 5:
        return a(31873, 266);
      case 6:
        return a(31937, 10538);
      case 10:
        return a(31895, 25296);
      case 7:
        return a(31890, 15142);
      case 8:
        return a(31961, 15518);
      case 9:
        return a(31983, 30859);
      case 11:
        return a(31991, -2704);
      case 12:
        return a(31965, -19002);
      case 13:
        return a(31891, -5457);
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte);
    return a(31966, -5983);
  }
  
  public static void Zb(StringBuilder paramStringBuilder, Zvs paramZvs, int paramInt, short paramShort, Zs66 paramZs66) {
    // Byte code:
    //   0: invokestatic ZQ : ()Ljava/lang/String;
    //   3: astore #5
    //   5: aload_1
    //   6: getstatic burp/Zzu2.XSS_REFLECTED : Lburp/Zzu2;
    //   9: if_acmpne -> 163
    //   12: iload_3
    //   13: sipush #300
    //   16: if_icmplt -> 40
    //   19: iload_3
    //   20: sipush #400
    //   23: if_icmpge -> 40
    //   26: aload_0
    //   27: sipush #31982
    //   30: sipush #-19943
    //   33: invokestatic a : (II)Ljava/lang/String;
    //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: aload #4
    //   42: getstatic burp/Zs66.HEADER : Lburp/Zs66;
    //   45: if_acmpne -> 62
    //   48: aload_0
    //   49: sipush #31958
    //   52: sipush #28059
    //   55: invokestatic a : (II)Ljava/lang/String;
    //   58: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload #4
    //   64: getstatic burp/Zs66.COOKIE : Lburp/Zs66;
    //   67: if_acmpne -> 84
    //   70: aload_0
    //   71: sipush #31945
    //   74: sipush #12536
    //   77: invokestatic a : (II)Ljava/lang/String;
    //   80: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: pop
    //   84: iload_2
    //   85: sipush #4096
    //   88: iand
    //   89: sipush #4096
    //   92: if_icmpne -> 133
    //   95: iload_2
    //   96: sipush #8192
    //   99: iand
    //   100: ifne -> 107
    //   103: iconst_1
    //   104: goto -> 108
    //   107: iconst_0
    //   108: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   111: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   114: aload_0
    //   115: sipush #31901
    //   118: sipush #3600
    //   121: invokestatic a : (II)Ljava/lang/String;
    //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: pop
    //   128: aload #5
    //   130: ifnull -> 210
    //   133: iload_2
    //   134: sipush #8192
    //   137: iand
    //   138: sipush #8192
    //   141: if_icmpne -> 210
    //   144: aload_0
    //   145: sipush #31994
    //   148: sipush #-10393
    //   151: invokestatic a : (II)Ljava/lang/String;
    //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: pop
    //   158: aload #5
    //   160: ifnull -> 210
    //   163: aload_1
    //   164: getstatic burp/Zzu2.XSS_STORED : Lburp/Zzu2;
    //   167: if_acmpne -> 203
    //   170: iload_3
    //   171: sipush #300
    //   174: if_icmplt -> 210
    //   177: iload_3
    //   178: sipush #400
    //   181: if_icmpge -> 210
    //   184: aload_0
    //   185: sipush #31954
    //   188: sipush #-17395
    //   191: invokestatic a : (II)Ljava/lang/String;
    //   194: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: pop
    //   198: aload #5
    //   200: ifnull -> 210
    //   203: iconst_0
    //   204: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   207: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   210: return
  }
  
  private static void Zz(StringBuilder paramStringBuilder, Zefg<Zxtl> paramZefg, byte paramByte1, byte paramByte2, int paramInt, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, String paramString1, String paramString2) {
    Zuh.Zv((paramByte1 != 1), Zqf.Zk, 1L);
    paramStringBuilder.append(a(31882, 4828));
    paramStringBuilder.append(Zg2x.ZM(paramZefg, true, true));
    paramStringBuilder.append(a(31959, 9734));
    paramStringBuilder.append(ZH(paramByte1, paramByte2));
    paramStringBuilder.append(a(31988, -1281));
    String str = Zkb.ZG(paramArrayOfbyte1);
    Zrlp.Zn(paramStringBuilder, Zmey.ZW(str));
    paramStringBuilder.append(a(31973, -17875));
    paramStringBuilder.append(Zg2x.Zt(paramZefg, true, false));
    paramStringBuilder.append(".");
    Zc(paramByte2, paramInt, paramStringBuilder, paramArrayOfbyte2, str, paramString2, paramString1);
  }
  
  private static void Zc(byte paramByte, int paramInt, StringBuilder paramStringBuilder, byte[] paramArrayOfbyte, String paramString1, String paramString2, String paramString3) {
    // Byte code:
    //   0: invokestatic ZQ : ()Ljava/lang/String;
    //   3: astore #7
    //   5: iload_0
    //   6: bipush #16
    //   8: if_icmpne -> 58
    //   11: iload_1
    //   12: ldc 1048576
    //   14: iand
    //   15: ldc 1048576
    //   17: if_icmpne -> 39
    //   20: aload_2
    //   21: sipush #31874
    //   24: sipush #1633
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: pop
    //   34: aload #7
    //   36: ifnull -> 287
    //   39: aload_2
    //   40: sipush #31949
    //   43: sipush #-16428
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: aload #7
    //   55: ifnull -> 287
    //   58: iload_0
    //   59: bipush #15
    //   61: if_icmpne -> 111
    //   64: iload_1
    //   65: ldc 1048576
    //   67: iand
    //   68: ldc 1048576
    //   70: if_icmpne -> 92
    //   73: aload_2
    //   74: sipush #31875
    //   77: sipush #-4756
    //   80: invokestatic a : (II)Ljava/lang/String;
    //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: aload #7
    //   89: ifnull -> 287
    //   92: aload_2
    //   93: sipush #31946
    //   96: sipush #-5956
    //   99: invokestatic a : (II)Ljava/lang/String;
    //   102: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: aload #7
    //   108: ifnull -> 287
    //   111: aload_2
    //   112: sipush #31888
    //   115: sipush #32055
    //   118: invokestatic a : (II)Ljava/lang/String;
    //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: pop
    //   125: aload_3
    //   126: invokestatic ZG : ([B)Ljava/lang/String;
    //   129: astore #8
    //   131: aload #4
    //   133: aload #8
    //   135: invokevirtual equals : (Ljava/lang/Object;)Z
    //   138: ifeq -> 160
    //   141: aload_2
    //   142: sipush #31953
    //   145: sipush #-4818
    //   148: invokestatic a : (II)Ljava/lang/String;
    //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: pop
    //   155: aload #7
    //   157: ifnull -> 194
    //   160: aload_2
    //   161: sipush #31892
    //   164: sipush #-14888
    //   167: invokestatic a : (II)Ljava/lang/String;
    //   170: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: pop
    //   174: aload_2
    //   175: aload #8
    //   177: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   180: aload_2
    //   181: sipush #31880
    //   184: sipush #30604
    //   187: invokestatic a : (II)Ljava/lang/String;
    //   190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: pop
    //   194: iload_0
    //   195: bipush #14
    //   197: if_icmpne -> 273
    //   200: aload_2
    //   201: sipush #31881
    //   204: sipush #-24701
    //   207: invokestatic a : (II)Ljava/lang/String;
    //   210: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: aload #5
    //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: sipush #31962
    //   221: sipush #7013
    //   224: invokestatic a : (II)Ljava/lang/String;
    //   227: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: aload #6
    //   232: invokestatic Zu : (Ljava/lang/String;)Ljava/lang/String;
    //   235: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: sipush #31902
    //   241: sipush #21601
    //   244: invokestatic a : (II)Ljava/lang/String;
    //   247: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   250: aload #6
    //   252: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: sipush #31936
    //   258: sipush #10393
    //   261: invokestatic a : (II)Ljava/lang/String;
    //   264: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: pop
    //   268: aload #7
    //   270: ifnull -> 287
    //   273: aload_2
    //   274: sipush #31998
    //   277: sipush #-22467
    //   280: invokestatic a : (II)Ljava/lang/String;
    //   283: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: pop
    //   287: return
  }
  
  public static String ZH(byte paramByte1, byte paramByte2) {
    if (paramByte2 == 11)
      return a(31974, 20858); 
    if (paramByte2 == 14)
      return a(31975, 11218); 
    String str = (paramByte2 == 12) ? a(31947, 30756) : a(31971, -19097);
    switch (paramByte1) {
      case 0:
        return a(31940, -31992);
      case 1:
        return a(31992, -9585);
      case 2:
        return a(31993, 32700) + a(31993, 32700) + str;
      case 3:
        return a(31941, 31932) + a(31941, 31932) + str;
      case 4:
      case 8:
        return a(31977, 11024) + a(31977, 11024) + str;
      case 5:
      case 9:
        return a(31979, 766) + a(31979, 766) + str;
      case 6:
      case 10:
        return a(31979, 766) + a(31979, 766) + str;
      case 7:
      case 11:
        return a(31979, 766) + a(31979, 766) + str;
      case 15:
        return a(31979, 766) + a(31979, 766) + str;
      case 12:
        return a(31979, 766) + a(31979, 766) + str;
      case 13:
        return a(31979, 766) + a(31979, 766) + str;
      case 14:
        return a(31979, 766) + a(31979, 766) + str;
      case 16:
        return a(31997, 237);
      case 17:
        return a(31978, 1240);
      case 18:
        return a(31956, -6327);
      case 19:
        return a(31943, 1160) + a(31943, 1160) + str;
      case 20:
        return a(31957, -19544);
      case 21:
        return a(31944, -12255);
      case 22:
        return a(31948, 10366);
      case 23:
        return a(31896, -30822) + a(31896, -30822) + str;
      case 24:
        return a(31903, -29070);
      case 25:
        return a(31987, 2454);
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte1);
    return a(31985, -10271);
  }
  
  public byte Zj(Ztlj paramZtlj, Ztub paramZtub, byte paramByte, int paramInt, Zs66 paramZs66, byte[] paramArrayOfbyte, Zrdb paramZrdb) {
    String str = Zr2s.ZQ();
    if (Zbqc.Zwu() == null)
      Zr2s.ZF("NhxEwb"); 
    return Zx_r.Zd(Zzu2.XSS_REFLECTED, paramZs66, paramZtlj.ZR(Ztz3.STATUS_CODE), paramInt, paramZtlj.ZJ(Ztz3.CONTENT_TYPE_STATED), paramZtlj.Zj(Ztz3.NO_SNIFF_HEADER), paramZtlj.Zj(Ztz3.CONTENT_DISPOSITION_ATTACHMENT_HEADER), Zkb.ZG(paramArrayOfbyte), paramZrdb.Za8(), Zrt0.Zg(paramZtlj.ZJ(Ztz3.BROWSERS)));
  }
  
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    String str = Zr2s.ZQ();
    if (str != null)
      Zbqc.Zr(new Zbqc[2]); 
    return (new Zt97(new Zxll(new Zxn2(new Zta3(new Zz9b(new Zrbk(), new Zzzs(new Zs7y()))))))).Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  private static Zg3n ZR(int paramInt) {
    return new Zg3n(paramInt, null);
  }
  
  private static Zg3n Zt(Byte paramByte) {
    return new Zg3n(0, paramByte);
  }
  
  private static void lambda$findBehaviour$1(Ztub paramZtub, Zefg<Zxtl> paramZefg, Ztlj paramZtlj, byte paramByte, int paramInt, Zvs paramZvs, byte[] paramArrayOfbyte, StringBuilder paramStringBuilder) {
    byte[] arrayOfByte = paramZtub.Zd().Zub().Zsf().ZiD();
    Zz(paramStringBuilder, paramZefg, paramZtlj.Zq(Ztz3.LOCATION), paramByte, paramInt, arrayOfByte, paramZtlj.Zm(Ztz3.MATCH), paramZtlj.ZJ(Ztz3.HTML_TAG), paramZtlj.ZJ(Ztz3.HTML_ATTRIBUTE));
    Zi(paramStringBuilder, paramInt, paramByte, Zmey.ZS(paramZefg));
    ZE(paramStringBuilder, paramInt, paramZefg);
    Zb(paramStringBuilder, paramZvs, paramInt, paramZtlj.ZR(Ztz3.STATUS_CODE), ((Zxtl)paramZefg.get(0)).ZTr());
    Zx_r.Zs(paramStringBuilder, paramArrayOfbyte, paramInt, paramZtlj);
  }
  
  private static void lambda$findBehaviour$0(Ztlj paramZtlj, Zefg paramZefg, byte paramByte, StringBuilder paramStringBuilder) {
    // Byte code:
    //   0: aload_0
    //   1: getstatic burp/Ztz3.BROWSERS : Lburp/Ztz3;
    //   4: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   7: invokestatic Zg : (Ljava/lang/String;)Ljava/util/EnumSet;
    //   10: astore #5
    //   12: invokestatic ZQ : ()Ljava/lang/String;
    //   15: aload_0
    //   16: getstatic burp/Ztz3.CONTENT_TYPE_STATED : Lburp/Ztz3;
    //   19: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   22: astore #6
    //   24: astore #4
    //   26: aload_3
    //   27: sipush #31939
    //   30: sipush #-21678
    //   33: invokestatic a : (II)Ljava/lang/String;
    //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: aload_3
    //   41: aload_1
    //   42: iconst_1
    //   43: iconst_1
    //   44: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: pop
    //   51: aload_3
    //   52: sipush #31951
    //   55: sipush #-30957
    //   58: invokestatic a : (II)Ljava/lang/String;
    //   61: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: pop
    //   65: aload_3
    //   66: sipush #31872
    //   69: sipush #-8584
    //   72: invokestatic a : (II)Ljava/lang/String;
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: pop
    //   79: iload_2
    //   80: bipush #18
    //   82: if_icmpne -> 150
    //   85: aload_3
    //   86: sipush #31952
    //   89: sipush #14408
    //   92: invokestatic a : (II)Ljava/lang/String;
    //   95: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: pop
    //   99: aload #6
    //   101: sipush #31980
    //   104: sipush #-9116
    //   107: invokestatic a : (II)Ljava/lang/String;
    //   110: invokevirtual equals : (Ljava/lang/Object;)Z
    //   113: ifeq -> 135
    //   116: aload_3
    //   117: sipush #31900
    //   120: sipush #-6595
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload #4
    //   132: ifnull -> 164
    //   135: aload_3
    //   136: aload #5
    //   138: invokestatic Zu : (Ljava/util/EnumSet;)Ljava/lang/String;
    //   141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: pop
    //   145: aload #4
    //   147: ifnull -> 164
    //   150: aload_3
    //   151: sipush #31972
    //   154: sipush #10634
    //   157: invokestatic a : (II)Ljava/lang/String;
    //   160: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: pop
    //   164: aload_3
    //   165: sipush #31894
    //   168: sipush #31444
    //   171: invokestatic a : (II)Ljava/lang/String;
    //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: pop
    //   178: return
  }
  
  static {
    // Byte code:
    //   0: bipush #91
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '»¦ÎtÉØÆ+}\\f]Â³t67âCx¿³ñ¢õ|¹±n£G2\\f8Ònr~Tm3#i=­²Ï\\bysÁx°5\\n£'î}aEöƽ÷þ/â)ñ­7ÆÔ6Ó2ÖõÁEåhUÃ- ÄcÿÄ½óøT(¦^z@Â\\f¾½³­¥±ºìJ#¬«ìÚÍç­q@5áÚ3d©6IëýIGstýæÆaÀèAí\\tïxS?«ß«dG¸ýTã&;\\f·ºPnöÅÈeÈ¹¦ñÀ_íQiÎ£ÍldgçøûÌ¢yÝX¸ÅÿKZ:QJ©:Ðïg5÷cQ>ÑäåÝ½NEé$Äóo2è5ÎÎwÿó70 `K}¡þX\\f!Teió]4 ´Y¼læñõ;m7>  {Þï¾\\n)øG@Î¢àóá®åádQª°ØE=CYLAülÕÊ¡Þ÷s%º@÷rV Ú\}e3z«òÀ¬Ç<¦ÿ%ÝÍ3jÍ_H'PW¤3 âfL%¤ýèæÕxýß\\nZ KZÇKet¬Å¸BL t¹Ô;ä|°sÆÎÈ:XQTZaÔ»µ<þ?Ã*´ÌÂ^)ÒOd»xó`5&z*çP:LpóüW/ÇÌ*ú6ysÁ¶-/ÃÏ³þ5ªªodÅI¿tçfG<n¼8`öYâ=:rn¬×Ý±ÌbìH¡6|½ 0£yxÔËXÑA×8VEßÙ\Y?y<.^¿@`6)nZ7:è&âÙ\\f Ý°Jýz¡¯Wø¡ö*Ñ@´Õþ°`Rüp(æ]\\rÓ¨/¨ü0]ÃÑE 3\\tGÎHǷVæá¼7NÆäºOCû°°ÓRöX&¿e+!ÃbqGiÿ[×äyÇ#¸pÊLÔ Ä|tªY¼#[õ2jQâFtQÿÏ\Gp=nAûÙÿ[cêt×Ã;4eUÛ+ZUdr_d>Í$æô7aGËÒÚ3u\\fz1ÙÀ¬Áþ¯qèg\¿£ùAûê°\\t' çcÆÊ|;8e N\\nI*2PÂ)B7 Vlð¼»øá>/¸é|ÛÝVÑ<Ó"|\\bðÔ§9JÄAH¾óea\\fê¯öMÂ6Ò§úÃÇñæ®×#.]ðMÖcÙÿëk\\nAw¬z5ô¥wíÞT8ùv\\r|ÞÝeSåî*¢dVsº\\tçÈ¤o¢\\fõåÌ²I.NFÚ!Jxv Ø`._ºÍvLèQµTeÀUW°ÈÙmmþÏÃ¡ýa ¯Ô¶ºèÓ±7ç d­lß¥ºX V\\f²ãÄÏGïÏ¡#»ÇØ¦cÚá8ÊÆ^ùùÁ*í²u#¶½ºbz/¢(´  KÕ¦rV¹&BHÅ«ª±yÔó"x>­Õnsb>\\t+Þ_gÒ$B]\.`ÙHÌx%ð¿ĕå2óÍ\\n,u$Jö1W/8ñ}i¬6CÑ-$c«1uûýãïÈúÉ÷Hv\ù¼n³ÖSÿn-ñV´/cÔ¾Ïô|¾3lDBvÿ.T0«MTDÝT¦»üßºÇ·T^k8ÈP<~6)ªÒV¯DÑûL/OÕÞ-\\nv©k(SN6RÊÄÕJ÷5nÐý5guÆ{láf¤KXrb`?¿I.N&)kgºf´öî/÷ñ4ÿ\\rHÁ'T\\bé4ñw¶d#\\f\\rHÓèÇú90®\\\f=pÊ}(¦À³3ß`$ÅGzþ=[#Q4óó;õ>:ëÀÕpBéå¹Ê]©7íÌ¸M8«Ö¡f Xí*Ú3níðhFOnôñ·)±¡HZèyÍ9v=\\bYÔ\\býøç#õTa}êåâÃ»Q?ùn£@Pû|àª`¥#ºw{oÝ;µ`Có**yÕà¥;?n3¯¿qD]yö\\bZ:úCÂL5ìÎdÃ@GtFÓ|êb5^XüÞ oæëõ»ü¨A¼ßÆ³oYÑí5¢Äk}ûJCßîÔ:\\n¹ 2ï6ô¿t¼­aÐaí÷³¼<½2À!°fe-ÔI¿ù0Rr.ÞHÏ9­Ë\!±ÑéÔ­1Ä%Á.T¢n¾³e¨7að?é\\r¹!Û¡[``ã#B/ßG?\\ffÊÅ\\f«Ja¯òü:{­Pÿ\\b¡´ER9Î$nÇ íuuÞ\\nÖö|È?'r½@|7fÚ²jô÷²Ú¥i1Ï]sYLôÎbuèí½NdÓ}LEV×\\tZ}Wã\\n¼Ms«DJóêlÜ0ì<?M0zíÂÁrtà0%Ôöüõà¢ÎþÜ?ÿ¸+ÁKÄÂ0êÅáò¯A½]ÔXÝ¯8VÛkZÖÇE%¨'j^½N`K¼A3ü?j¥70s7*"µÅ±\\nèt?Üñ°Ó9_ké¨/¿Ulé¢]z^:ko¼Ð[·ãå\\bÊ*j^öß\\fââçgúy;|îÞìLMÙmQ\\tCø/\\fÆ1»S\\rî/J3¶Úñ34ÙÂ±îÛô®Æ~òÆ¯â 8Ë"»\\r\\r;îrä³§ò¨]Ʌÿ.ü\\t2©CLÀ5Ù}H"«V­p*& Öün>JêÜ\í£2÷òã)!<ÙÉ×-A2ù®\\bí-<\\nëi¯ò:Ò¡f¢ótâÛòÚçV\\fX¹Â~eç}mAbL¡=/~ØÉI¹{\\rA,­63B4?üZ/]!U³2Ò6zÚæú<#`v<é3¤ bþ& ]ð¼PÛo CÞ# ¡ÕîfÅøý\\tp0xrÉz_\\bÙÇe. bÌ&Æ©w¿PÒ,`'¨LMB°Mù&\\rsÑÙÃ¿6YgÿPøöÛ~nÊÆûéþ+®­ô¨läÖ\Ý #ó­b (\\tVábòÑâa3>$[=$Üê6d±WÿE¯íBôVÊaKF?Í¶ø5@Öã¨ÔÏÓ·®aúÕÒ\\b­2Px¶' Ð\\r-={Æ(ÁÕØ0G·Fò.8\\tÓ/®n6 Ô[»X$ÈøhÛù^ó]ûOKÁ%Þ¿;CØæc¼ðÂ°øÍAåÆs»j3W3¨ÛPÇí,fªÑÍv[ðÀ$,0;qqUül:pU_ÉEòráñ¢Â#i´®¸X;Ö-ýº7Ç×Í%tOÎEö%\\bMpm|Qý@\IvÃ%ç#ÓæÃ¼½Ñ¾5á÷Ð^hP½ø»·>áÿ.¡åZ÷FÇç41¡\\fõ8ïÁ¢¸[}Ûn»SÞð°Ë½+\\nÔH3º®a£+ÛÉ¶Ì§$X`sý\Æ6& üÂìAV¢Of!m~ EE¨D'H¬YHºùL Qä>L>âíïÇV@XdÜµæií0G}£ÓÄTI,@©¶YÜßM£¯R FäÈèzm%bõ«ïÎn,<LÝQu«$k&!mRyÙòGî³Ôb 'uØjåâ'(À¸´ó\\fNùÆ\\b'Å£\\rÂgQòÔX_øJEÄ"ÙD×º:1RÚXÉqÏ*aØ Gs\\tÆHÈåëËð`/óÀ¶9õÛÍ<,ÙÍ5Êw+.¨ûf+ãK¦öpÂ\\b/Û®8ío©Ä.SÞòd×\\r%pe² b¿ß\\r>ê»¡SVòlõ,Mó6rË;WÎÛâ Îd¶ ×°¨41Ô\\fÖ/dÜ^É­yßçQ-\\r¢?AÅÆuz&a8©Nè)2|;AõT/d*ï¶ï C4xuF;Ë>ó«eA]uføÑÏòZ ¹,æ¸ºD%þìøSuÜ\\tã«KÇkX±-v°ü¿!££ôÌoSÆ6/+w;´K¬]ÌÝâÛsîäL"X6.öúô(ç§ 2Î²ûg½¡É»0<lÐo¥¨;£W÷góånbâ@ÆAÁ"\×a÷s|/RËlÈU­Ê/\\bexFDÄ²©~ÙèSÕ¶>v®9ò/¹DÝ¯;ü¼½µïø\\tp¡»×Ü48Ýâ©ùó ªðt×ÙÔÔÈ«1Ýïû»SH³´ýÔ##\\tMÊ¶w¢+WuáPßK©³µXXS÷öè¾(zÕÜÀñúÄÍÿ\\nĈ£%Xu6bkÄ~ìµåZô\\f÷Ë]¼ ¿E¤ÂGfûËÖ0dãcÆÏ4ROb1ùÈÁÈ0ejÂ}°_Û§¨NMCNÚì&Jð k{ÓKV>xÙÛµçóIÃ¶Â¡ñyeÙðã°eÄé\\f©_¢£`ÕèÈeàèmúD­î×ºE}Â$0M¶HÚ+Ê-Ú¤=¿WFS·×Û81¬×nZÅR>ø.ø8-ÿëÃ9ÈÆb\\nä«i^éÀ°SK°°8W"Òe:XÀþ¦þ.åv§9z8ÓÊÔ\\tª6ÄÅÁ;\9'Røôg¤ìÇGìO>#80º2öµ¨)(ùGúAn¶)B\\tÉNîo:¨©¥²vÈÑ}±ö¦ñÑ¥h>ñ(­µ³ùoý£ÁKq\\b*ûo×Ë[ÑCÉßÛ3é$\\r,íPY]PµÞ.N$Rßy,Oîõ-úwJ'Äý©>3±¬²ºfsµÑAéÄ*mïp4Í\\bbØã¾Ì)Dö9"\\bç=üfËÛÏ\\níå38CsÓö>^RO~H<ã¦Ù K·Ewß÷mN*\\tg³ýH8 ì\·¤\\n{tÇZþÆBrgîÆë1}ü±"å³ÊéU0pDË!Hr¨Ú9Ú,.#"!ªÒP\\fPåå¦î¾ssv\\bl¬.G7"Ã!eðJ|%¼©:¢åX@{ZÛ§Q>¶DçÔùmÚ2kNt¡¢åip¤ì¼­2Ü´Ø7ëc:|;¿9ü!KïAúWJ¬­ëæô1)*hÓ]Qß\\tNÙoõ¬DîÃ¡È¥ôåä[«ÍëÜçÓßOÈ08t²â·Ú¤!Ëð¯0\\tªi9if¯ÞE{WqQDò"ý¶%µ;ºjtH¿2\\re_Q÷/\diÕ$ýkÉ\#NnÃ·üp%­÷ÚzÙi5FB¨>TUaJ =å1ÉmÝñ0ò¾¿>-Õ·«Bå6+Ý1}Ð.õSY³^6A{#'åà:ÑÊ\\bÝ©Àç¬êòHC¤Ñv¾¬_#Ûçöñ×Ó2n0^7øò²e\¯${û5ì¬ÂÁMñ$'µe§ÜÐÜM¸Ýppuûo+úõÏw:`ìç~ÐºIeVYeùºû:§ÞG\\fj²É¹W¯Uú\k*3LjÒ7ó×Eã¤P·ÕÌSÔYæ° <H)·$Ñâz6|Ñ\Ìîl{j*£õó|2ÔUó·PZòÎ<! 2_6 Y\\nƽQîæpTùÒå×e.L1%¿I*éá³¸ScÑ¸[`\\f¤ÃÑr5k.AßÁÿoÀ\\br2T¼ß´4º³ëbð¹ÞÜÔ_±©JnEòÍÙÀ Yr\\ná_ð*&@b xËàÕ[ñ x;p`Qð~4}WJëØ>øð`ë¶©2<Îë7zæ³ó¤þ¹!@»65VõÐ³³<7/-h`¢^¯+dz"­ÛZZ²]v'7c_³o«×3)Ç2o`ðÄP^lüX¾;ø¿ÌÝLúj =ë8ï5 SàG\\t#nÄ^ì,ïú'ß\\fÎ8ý_C~®Üì<;ã¤­²/Û¶]=UÐÍ¸©Ãa¬)Ò>Ýoüê;¹ÇM±MÜÂ_ñ?µ*íÂÿ\\rKÀ¾`&.­õ?Àý`¯ÙÛHÈ§À@©Íæû&) çþ,j$\\fÛ>{ZrKDZOóÇØôeïLuû2Ð¥[¢4$m:L¾øØÖ¬Ï1ù %Ô|â±Iè¤ì£çða |9éûÓ×o<«°cTÜ§dÀå{ÏILÇQíP÷ z¸³Yòhöa³âOöcÙR«§£[O\<#b¤ß.E\\t(mØ[÷Fú¹¸wÕÝ@òmOpçÇÖëÆ\\f¤:Ì1¯´«o-dÂ%.öá\\fs²¥n3¿pjÑ&^ºY!W0E÷Ys¹ºÓ÷\\bi;0);aP÷×5ÜJÆ´tki8±ßJp!Ãõ¬l¹! Í²¶¬åD\\fáU~ùoc½ÑËù´Ôz·(ÄE\\rÂ[uûZ'Ý@§\\r4ÿ3_û x}åä;"\\nìdácx©9gå¡5`mA¿÷.ÍðÀsïÀ·ÒÃNÖ¤ÍYøù©R)fôñRÂa,Z®xÜÁñCñâ\\tî#}¸>\\fâ¤"@lõ3êáÝJZ ç¦¤«y=)ý\\tÖxÅy.vÿáj¶Üht¾ßùÌ>Ó¢²uR£­_ÝÑWeîÈ´n¬oQ+Ý,!.·>ANè¿wx<Z¤Î¡}úûïäöPô¦ù-»í\\f27veC¡aÃþgía><³ÅÞyhô\\r¢YÄñ³î¦|õ4[Í¢Gnêy!;÷®ü\\b\\bÇ<Üºa&Ëm#^Òçüüº Ý÷ß¬½zÁ~g+Ód¿*ùÍ.Ôæhl·ëvN%ú]\öýS:·A,¬¤û¡´K1äïmôyÔ; &aÑïêùc×ûXKéÇæZºr+w»~¡åØô%iC=R\\r2îH~Ã9µW%8ú²Î¾Ò61zú½Òõ¯£¸oáTR©ÛapÌ£|Ýû\\\bµx[è2âÞ½3Ç¿¾ t]+w º¬¨GËýOBöLÔBÞ9\ï,åWä³×¢M/V; ó½_²ýY4?R+Kí"`ôÉ&¨ÔM¿":¥ß0àGp\\bC\\nÕÉ*Ôã]>akçj§ûøE.)7MìÉF¡üÐ®Önõ®ún¯ª¸òñòÏÓk®uKÒvÞgÕ8a(?`N#A×ÕýiØu}ÞÚúhr©Äù34µL­D£¾AjWe·\\b+ÐËº²Æ¦ý\o~WÃ¯\\bdDÛÈÏN«éyMx]ÃðÓj 5ñM²ar4ÖÑËUsJû,;;û$Ñ ñÎ,µÒêcg¤ÝhEÐ*ÒZ,ÝÜ´¼Oøc/Êõ¾íy½¯«K\\bSÌµS3téªzNÞ($h¯ýD÷(ßòïÊxày¤øXpvÔïèë÷X@ì[3kæqbFvaª§w]¼¤M_áþ\\\n¸(D_@ìyuÐcWè½ô²MÅØµØo\\t@{Vw¢ ·ÄqN¢] «[O\\nëgÓÄD Ìæ$eüÙ½U¦é!i¤Ï±y¹°m¤MÅñIL¹ã×Âwz à>Ì2Ë -ÿ¤Î¨ã]E@\\f\\rÙüpRÜÚv·\\bäÔ){ÚæM§%RÇ_\\b4¶ÇËñ#\\r©óµ;Hå8¿úè[÷:6ç-Ó§« §(ú¤J4|ª#R8.E'ÃÞÕ¦6Bø"3Ã¾=ôA»\\n=àfuéµ¹>m»i@YèJä?(}ìb¸V3wÊ\\nÃ>·õÆ:ï¸9P¼Õn¨Ü¡ÿë¤fÀ¹ÚºÑ:.uÈµåla¤:à»Ý¥mÜàOÖÇôOßÃH¢øÆeT|ñx­T%cÌ[Dã${w\\b¨Ä>«Î¨¥ÑL8ù\\tÁØN¯¸ò¸òÚ{AKÅV"µA}'èQ«ì7aô=*7l­©ô5rôÄbBÙº#¬¥GbÄê¶sa/Vºaï¾[ óa§òHJ q?@\\t]¦jG§³EZ­{xþQ¬\\n]e³4ÕÇ$]E_,Qç¤ÊvØ¿µkt\\b¸²3ÜI+¢Qå&(©6Ü\\nëíçôÏÙÑxk¡Íý( Eo%O¶6ð¸åV\\tÜ¤þkHçsxÝ9$rLêüÁ]]ü %Ä.d>­åê!ªðZ;VºgÚÔ¤JË9¸Ç9Iß@{±Åª\\t üFÿ{hS$êKó#´QLOå³ÖLÓYF!¤$cÝ¶ØÑx»åeE\\n`ü¬ÃÅÅbUÓ¦wIp5®úâýcÉó5s|,J,x¾t¿ÂJ/sG¤?§J¶hE_§þJæÈòqy,Nëü°ÀÂÎv%tlx[\\bð¤"¡'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #66
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #39
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
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
    //   68: ldc 'Eá·ÕVÓçbè'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #13
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #26
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zmea.a : [Ljava/lang/String;
    //   132: bipush #91
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmea.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #89
    //   214: goto -> 244
    //   217: bipush #49
    //   219: goto -> 244
    //   222: bipush #13
    //   224: goto -> 244
    //   227: bipush #36
    //   229: goto -> 244
    //   232: bipush #95
    //   234: goto -> 244
    //   237: bipush #16
    //   239: goto -> 244
    //   242: bipush #76
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: new burp/Zr1r
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Zmea.ZA : Ljava/util/Map;
    //   310: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7CD0) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmea.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */