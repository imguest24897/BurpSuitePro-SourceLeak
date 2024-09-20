package burp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zdo;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmvc {
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zstu ZY(List<String> paramList, Zstu paramZstu, int paramInt) {
    boolean bool = Zsba.Zu();
    try {
      if (paramZstu == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramList == null)
        return paramZstu; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      for (String str : paramList) {
        byteArrayOutputStream.write(Zkb.Zy(str));
        byteArrayOutputStream.write(Zdo.Zn);
        if (bool)
          break; 
      } 
      paramZstu.Zo(byteArrayOutputStream, paramInt, paramZstu.Zpu() - paramInt);
      return Zyf.Zy(byteArrayOutputStream.toByteArray());
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IMPOSSIBLE);
      return null;
    } 
  }
  
  public static Zstu Zv(List<String> paramList, Zstu paramZstu) {
    boolean bool = Zsba.Zu();
    try {
      if (paramList == null)
        return paramZstu; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      for (String str : paramList) {
        byteArrayOutputStream.write(Zkb.Zy(str));
        byteArrayOutputStream.write(Zdo.Zn);
        if (bool)
          break; 
      } 
      try {
        byteArrayOutputStream.write(Zdo.Zn);
        if (paramZstu != null)
          paramZstu.Zo(byteArrayOutputStream, 0, paramZstu.Zpu()); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return Zyf.Zy(byteArrayOutputStream.toByteArray());
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IMPOSSIBLE);
      return null;
    } 
  }
  
  public static String Zb(List<String> paramList, String paramString) {
    boolean bool = Zsba.Zt();
    if (paramString == null)
      paramString = ""; 
    try {
      if (paramList == null)
        return paramString; 
    } catch (Exception exception) {
      throw a(null);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    try {
      for (String str : paramList) {
        stringBuilder.append(str);
        stringBuilder.append(a(19102, 23510));
        if (!bool)
          break; 
      } 
      stringBuilder.append(a(19092, 19810));
      stringBuilder.append(paramString);
      return stringBuilder.toString();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  public static Zstu Zw(Zz1p paramZz1p) {
    return Zt(paramZz1p, new ArrayList<>(paramZz1p.ZG()), paramZz1p.Zo.Zd4());
  }
  
  public static Zstu Zt(Zz1p paramZz1p, List<String> paramList, byte[] paramArrayOfbyte) {
    return Z_(paramZz1p, paramList, paramZz1p.ZV, paramArrayOfbyte);
  }
  
  public static Zstu Z_(Zz1p paramZz1p, List<String> paramList, List<Zt8g> paramList1, byte[] paramArrayOfbyte) {
    boolean bool = Zsba.Zu();
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      Zstu zstu = ZR(a(19074, -9213).equalsIgnoreCase(paramZz1p.Zb) ? 1 : 0, paramZz1p.ZY, paramList1, paramList);
      try {
        byteArrayOutputStream.write(Zkb.Zy(paramZz1p.Zb));
        byteArrayOutputStream.write(32);
        if (paramZz1p.ZJ)
          byteArrayOutputStream.write(Zkb.Zy(paramZz1p.Zo.Zdz().toString())); 
      } catch (Exception exception) {
        throw a(null);
      } 
      byteArrayOutputStream.write(paramArrayOfbyte);
      StringBuilder stringBuilder = new StringBuilder();
      for (Zt8g zt8g : paramList1) {
        try {
          if (zt8g.ZbQ() != Zrdu.URL_PARAM)
            continue; 
        } catch (Exception exception) {
          throw a(null);
        } 
        try {
          if (stringBuilder.length() > 0)
            stringBuilder.append("&"); 
        } catch (Exception exception) {
          throw a(null);
        } 
        try {
        
        } catch (Exception exception) {
          throw a(null);
        } 
        try {
          stringBuilder.append((zt8g.Zns() == null) ? "" : zt8g.Zns());
          stringBuilder.append("=");
        } catch (Exception exception) {
          throw a(null);
        } 
        stringBuilder.append((zt8g.Zbn() == null) ? "" : zt8g.Zbn());
        if (bool)
          break; 
      } 
      try {
        if (stringBuilder.length() > 0) {
          byteArrayOutputStream.write(63);
          byteArrayOutputStream.write(Zkb.Zy(stringBuilder.toString()));
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        byteArrayOutputStream.write(32);
        if (paramZz1p.Zh != null)
          byteArrayOutputStream.write(Zkb.Zy(paramZz1p.Zh)); 
      } catch (Exception exception) {
        throw a(null);
      } 
      byteArrayOutputStream.write(Zdo.Zn);
      Iterator<String> iterator = paramList.iterator();
      try {
        if (iterator.hasNext())
          iterator.next(); 
      } catch (Exception exception) {
        throw a(null);
      } 
      while (iterator.hasNext()) {
        byteArrayOutputStream.write(Zkb.Zy(iterator.next()));
        byteArrayOutputStream.write(Zdo.Zn);
        if (bool)
          break; 
      } 
      byteArrayOutputStream.write(Zdo.Zn);
      byteArrayOutputStream.write(zstu.ZiD());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return Zyf.Zy(byteArrayOutputStream.toByteArray());
  }
  
  static Zstu ZR(byte paramByte, Zsba paramZsba, List<Zt8g> paramList, List<String> paramList1) {
    // Byte code:
    //   0: invokestatic Zu : ()Z
    //   3: istore #4
    //   5: new java/io/ByteArrayOutputStream
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore #5
    //   14: aconst_null
    //   15: astore #6
    //   17: getstatic burp/Zz5j.Zi : [I
    //   20: aload_1
    //   21: invokevirtual ordinal : ()I
    //   24: iaload
    //   25: tableswitch default -> 276, 1 -> 64, 2 -> 64, 3 -> 64, 4 -> 64, 5 -> 64, 6 -> 265
    //   64: new burp/Ztnz
    //   67: dup
    //   68: sipush #19103
    //   71: sipush #30165
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: sipush #19096
    //   80: sipush #11186
    //   83: invokestatic a : (II)Ljava/lang/String;
    //   86: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   89: astore #6
    //   91: iconst_0
    //   92: istore #7
    //   94: aload_2
    //   95: invokeinterface iterator : ()Ljava/util/Iterator;
    //   100: astore #8
    //   102: aload #8
    //   104: invokeinterface hasNext : ()Z
    //   109: ifeq -> 262
    //   112: aload #8
    //   114: invokeinterface next : ()Ljava/lang/Object;
    //   119: checkcast burp/Zt8g
    //   122: astore #9
    //   124: aload #9
    //   126: invokeinterface ZbQ : ()Lburp/Zrdu;
    //   131: getstatic burp/Zrdu.BODY_PARAM_URL_ENCODED : Lburp/Zrdu;
    //   134: if_acmpeq -> 164
    //   137: aload #9
    //   139: invokeinterface ZbQ : ()Lburp/Zrdu;
    //   144: getstatic burp/Zrdu.BODY_PARAM_MULTIPART : Lburp/Zrdu;
    //   147: if_acmpeq -> 164
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   156: athrow
    //   157: goto -> 102
    //   160: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   163: athrow
    //   164: iload #7
    //   166: ifeq -> 183
    //   169: aload #5
    //   171: bipush #38
    //   173: invokevirtual write : (I)V
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   182: athrow
    //   183: aload #9
    //   185: invokeinterface Zns : ()Ljava/lang/String;
    //   190: ifnull -> 215
    //   193: aload #5
    //   195: aload #9
    //   197: invokeinterface Zns : ()Ljava/lang/String;
    //   202: invokestatic Zy : (Ljava/lang/String;)[B
    //   205: invokevirtual write : ([B)V
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   214: athrow
    //   215: aload #5
    //   217: bipush #61
    //   219: invokevirtual write : (I)V
    //   222: aload #9
    //   224: invokeinterface Zbn : ()Ljava/lang/String;
    //   229: ifnull -> 254
    //   232: aload #5
    //   234: aload #9
    //   236: invokeinterface Zbn : ()Ljava/lang/String;
    //   241: invokestatic Zy : (Ljava/lang/String;)[B
    //   244: invokevirtual write : ([B)V
    //   247: goto -> 254
    //   250: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   253: athrow
    //   254: iconst_1
    //   255: istore #7
    //   257: iload #4
    //   259: ifeq -> 102
    //   262: goto -> 288
    //   265: aload_2
    //   266: aload #5
    //   268: invokestatic Ze : (Ljava/util/List;Ljava/io/ByteArrayOutputStream;)Lburp/Ztnz;
    //   271: astore #6
    //   273: goto -> 288
    //   276: iconst_0
    //   277: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   280: aload_1
    //   281: invokevirtual Zi : ()B
    //   284: i2l
    //   285: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   288: aload #5
    //   290: invokevirtual size : ()I
    //   293: ifne -> 353
    //   296: iload_0
    //   297: ifne -> 353
    //   300: goto -> 307
    //   303: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   306: athrow
    //   307: aload_3
    //   308: sipush #19076
    //   311: sipush #-23441
    //   314: invokestatic a : (II)Ljava/lang/String;
    //   317: iconst_0
    //   318: aconst_null
    //   319: iconst_0
    //   320: iconst_0
    //   321: invokestatic ZF : (Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ZZ)V
    //   324: aload_3
    //   325: sipush #19100
    //   328: sipush #-3454
    //   331: invokestatic a : (II)Ljava/lang/String;
    //   334: iconst_0
    //   335: aconst_null
    //   336: iconst_0
    //   337: iconst_0
    //   338: invokestatic ZF : (Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ZZ)V
    //   341: iload #4
    //   343: ifeq -> 430
    //   346: goto -> 353
    //   349: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   352: athrow
    //   353: aload_3
    //   354: sipush #19090
    //   357: sipush #10110
    //   360: invokestatic a : (II)Ljava/lang/String;
    //   363: iconst_0
    //   364: aload #6
    //   366: ifnonnull -> 384
    //   369: goto -> 376
    //   372: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   375: athrow
    //   376: aconst_null
    //   377: goto -> 389
    //   380: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   383: athrow
    //   384: aload #6
    //   386: invokevirtual ZK : ()Ljava/lang/String;
    //   389: iconst_1
    //   390: iconst_0
    //   391: invokestatic ZF : (Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ZZ)V
    //   394: aload_3
    //   395: sipush #19091
    //   398: sipush #-30334
    //   401: invokestatic a : (II)Ljava/lang/String;
    //   404: iconst_0
    //   405: aload #5
    //   407: invokevirtual size : ()I
    //   410: sipush #19101
    //   413: sipush #27780
    //   416: invokestatic a : (II)Ljava/lang/String;
    //   419: swap
    //   420: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   425: iconst_1
    //   426: iconst_0
    //   427: invokestatic ZF : (Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ZZ)V
    //   430: goto -> 443
    //   433: astore #6
    //   435: aload #6
    //   437: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   440: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   443: aload #5
    //   445: invokevirtual toByteArray : ()[B
    //   448: invokestatic Zy : ([B)Lburp/Zyf;
    //   451: areturn
    // Exception table:
    //   from	to	target	type
    //   14	430	433	java/lang/Exception
    //   124	150	153	java/lang/Exception
    //   137	160	160	java/lang/Exception
    //   164	176	179	java/lang/Exception
    //   183	208	211	java/lang/Exception
    //   215	247	250	java/lang/Exception
    //   288	300	303	java/lang/Exception
    //   296	346	349	java/lang/Exception
    //   307	369	372	java/lang/Exception
    //   353	380	380	java/lang/Exception
  }
  
  public static Ztnz Ze(List<Zt8g> paramList, ByteArrayOutputStream paramByteArrayOutputStream) {
    return Zm(paramList, paramByteArrayOutputStream, a(19079, -16870) + a(19079, -16870));
  }
  
  public static Ztnz Zm(List<Zt8g> paramList, ByteArrayOutputStream paramByteArrayOutputStream, String paramString) {
    Ztnz ztnz = new Ztnz(a(19095, 31912), a(19099, 28807) + a(19099, 28807));
    byte[] arrayOfByte1 = Zkb.Zy(paramString);
    byte[] arrayOfByte2 = Zkb.Zy(a(19097, -15394));
    boolean bool1 = false;
    Iterator<Zt8g> iterator = paramList.iterator();
    boolean bool = Zsba.Zu();
    while (iterator.hasNext()) {
      Zt8g zt8g = iterator.next();
      if (zt8g.ZbQ() != Zrdu.BODY_PARAM_URL_ENCODED && zt8g.ZbQ() != Zrdu.BODY_PARAM_MULTIPART)
        continue; 
      paramByteArrayOutputStream.write(45);
      paramByteArrayOutputStream.write(45);
      paramByteArrayOutputStream.write(arrayOfByte1, 0, arrayOfByte1.length);
      paramByteArrayOutputStream.write(Zdo.Zn, 0, Zdo.Zn.length);
      paramByteArrayOutputStream.write(arrayOfByte2, 0, arrayOfByte2.length);
      if (zt8g.Zns() != null) {
        byte[] arrayOfByte = Zkb.Zy(zt8g.Zns());
        paramByteArrayOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
      } 
      paramByteArrayOutputStream.write(34);
      if (zt8g.Zbb() != null) {
        byte[] arrayOfByte = Zkb.Zy(zt8g.Zbb());
        paramByteArrayOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
      } 
      paramByteArrayOutputStream.write(Zdo.Zn, 0, Zdo.Zn.length);
      paramByteArrayOutputStream.write(Zdo.Zn, 0, Zdo.Zn.length);
      if (zt8g.Zbn() != null) {
        byte[] arrayOfByte = Zkb.Zy(zt8g.Zbn());
        paramByteArrayOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
      } 
      paramByteArrayOutputStream.write(Zdo.Zn, 0, Zdo.Zn.length);
      bool1 = true;
      if (bool)
        break; 
    } 
    if (bool1) {
      paramByteArrayOutputStream.write(45);
      paramByteArrayOutputStream.write(45);
      paramByteArrayOutputStream.write(arrayOfByte1, 0, arrayOfByte1.length);
      paramByteArrayOutputStream.write(45);
      paramByteArrayOutputStream.write(45);
      paramByteArrayOutputStream.write(Zdo.Zn, 0, Zdo.Zn.length);
    } 
    return ztnz;
  }
  
  public static Zstu ZC(Zstu paramZstu, Zz1p paramZz1p, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, Zrdu paramZrdu, int[] paramArrayOfint) {
    return ZX(paramZstu, paramZz1p, paramString1, paramString2, paramBoolean1, paramBoolean2, paramZrdu, false, paramArrayOfint);
  }
  
  public static Zstu ZX(Zstu paramZstu, Zz1p paramZz1p, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, Zrdu paramZrdu, boolean paramBoolean3, int[] paramArrayOfint) {
    boolean bool = Zsba.Zt();
    if (paramString2 == null)
      paramString2 = ""; 
    boolean bool1 = false;
    boolean bool2 = false;
    List<Zt8g> list = paramZz1p.ZV;
    for (Zt8g zt8g : list) {
      if (ZS(paramString1, paramBoolean1, paramZrdu, zt8g))
        continue; 
      bool2 = true;
      if (zt8g.Zbn().equals(paramString2)) {
        if (paramBoolean3)
          continue; 
        break;
      } 
      zt8g.ZxS(paramString2);
      bool1 = true;
      byte[] arrayOfByte = Zkb.Zy(paramString2);
      ZK(paramArrayOfint, zt8g, arrayOfByte.length);
      if (!paramBoolean3 || !bool)
        break; 
    } 
    return bool1 ? Zg(paramZstu, paramArrayOfint, list) : ((paramBoolean2 && !bool2) ? Ze(paramZstu, paramZz1p, paramString1, paramString2, paramZrdu, paramArrayOfint) : paramZstu);
  }
  
  private static Zstu Zg(Zstu paramZstu, int[] paramArrayOfint, List<Zt8g> paramList) {
    ArrayList<Zt8g> arrayList = new ArrayList<>(paramList);
    arrayList.sort(Zmvc::lambda$rebuildRequest$0);
    int i = 0;
    boolean bool = Zsba.Zu();
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      for (Zt8g zt8g : arrayList) {
        int j = zt8g.Zbl() - i;
        paramZstu.Zo(byteArrayOutputStream, i, j);
        byteArrayOutputStream.write(Zkb.Zy(zt8g.Zbn()));
        i = zt8g.Zb2();
        if (bool)
          break; 
      } 
      paramZstu.Zo(byteArrayOutputStream, i, paramZstu.Zpu() - i);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IMPOSSIBLE);
    } 
    Zyf zyf = Zyf.Zy(byteArrayOutputStream.toByteArray());
    return Zm(paramArrayOfint, zyf);
  }
  
  public static Zstu Ze(Zstu paramZstu, Zz1p paramZz1p, String paramString1, String paramString2, Zrdu paramZrdu, int[] paramArrayOfint) {
    // Byte code:
    //   0: invokestatic Zt : ()Z
    //   3: istore #6
    //   5: aload_3
    //   6: ifnonnull -> 12
    //   9: ldc ''
    //   11: astore_3
    //   12: aload_2
    //   13: invokestatic Zy : (Ljava/lang/String;)[B
    //   16: astore #7
    //   18: aload_3
    //   19: invokestatic Zy : (Ljava/lang/String;)[B
    //   22: astore #8
    //   24: getstatic burp/Zz5j.Zx : [I
    //   27: aload #4
    //   29: invokevirtual ordinal : ()I
    //   32: iaload
    //   33: tableswitch default -> 1366, 1 -> 64, 2 -> 98, 3 -> 98, 4 -> 762
    //   64: aload_1
    //   65: ifnonnull -> 83
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   74: athrow
    //   75: aload_0
    //   76: goto -> 97
    //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: aload_0
    //   84: aload_1
    //   85: getfield Zo : Lburp/Zlit;
    //   88: aload #7
    //   90: aload #8
    //   92: aload #5
    //   94: invokestatic Zo : (Lburp/Zstu;Lburp/Zlit;[B[B[I)Lburp/Zstu;
    //   97: areturn
    //   98: new java/io/ByteArrayOutputStream
    //   101: dup
    //   102: invokespecial <init> : ()V
    //   105: astore #9
    //   107: getstatic burp/Zz5j.Zi : [I
    //   110: aload_1
    //   111: getfield ZY : Lburp/Zsba;
    //   114: invokevirtual ordinal : ()I
    //   117: iaload
    //   118: lookupswitch default -> 645, 1 -> 152, 2 -> 152, 6 -> 356
    //   152: aload_0
    //   153: invokeinterface Zpu : ()I
    //   158: aload_1
    //   159: invokevirtual ZO : ()I
    //   162: if_icmple -> 180
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   171: athrow
    //   172: iconst_1
    //   173: goto -> 181
    //   176: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   179: athrow
    //   180: iconst_0
    //   181: istore #10
    //   183: iload #10
    //   185: ifne -> 214
    //   188: aload_0
    //   189: sipush #19090
    //   192: sipush #10110
    //   195: invokestatic a : (II)Ljava/lang/String;
    //   198: iconst_0
    //   199: sipush #19073
    //   202: sipush #-1824
    //   205: invokestatic a : (II)Ljava/lang/String;
    //   208: iconst_1
    //   209: iconst_1
    //   210: invokestatic Zh : (Lburp/Zstu;Ljava/lang/String;ZLjava/lang/String;ZZ)Lburp/Zstu;
    //   213: astore_0
    //   214: aload_0
    //   215: invokeinterface Zpu : ()I
    //   220: istore #11
    //   222: iload #10
    //   224: ifeq -> 238
    //   227: iload #11
    //   229: iconst_1
    //   230: iadd
    //   231: goto -> 240
    //   234: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   237: athrow
    //   238: iload #11
    //   240: istore #12
    //   242: iload #12
    //   244: aload #7
    //   246: arraylength
    //   247: iadd
    //   248: istore #13
    //   250: iload #13
    //   252: iconst_1
    //   253: iadd
    //   254: istore #14
    //   256: iload #14
    //   258: aload #8
    //   260: arraylength
    //   261: iadd
    //   262: istore #15
    //   264: aload_0
    //   265: aload #9
    //   267: iconst_0
    //   268: iload #11
    //   270: invokeinterface Zo : (Ljava/io/OutputStream;II)V
    //   275: iload #10
    //   277: ifeq -> 294
    //   280: aload #9
    //   282: bipush #38
    //   284: invokevirtual write : (I)V
    //   287: goto -> 294
    //   290: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   293: athrow
    //   294: aload #9
    //   296: aload #7
    //   298: invokevirtual write : ([B)V
    //   301: aload #9
    //   303: bipush #61
    //   305: invokevirtual write : (I)V
    //   308: aload #9
    //   310: aload #8
    //   312: invokevirtual write : ([B)V
    //   315: aload #5
    //   317: ifnull -> 672
    //   320: aload #5
    //   322: iconst_0
    //   323: iload #12
    //   325: iastore
    //   326: aload #5
    //   328: iconst_1
    //   329: iload #13
    //   331: iastore
    //   332: aload #5
    //   334: iconst_2
    //   335: iload #14
    //   337: iastore
    //   338: aload #5
    //   340: iconst_3
    //   341: iload #15
    //   343: iastore
    //   344: iload #6
    //   346: ifne -> 672
    //   349: goto -> 356
    //   352: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   355: athrow
    //   356: aload_1
    //   357: invokevirtual ZG : ()Ljava/util/List;
    //   360: sipush #19090
    //   363: sipush #10110
    //   366: invokestatic a : (II)Ljava/lang/String;
    //   369: iconst_0
    //   370: invokestatic ZZ : (Ljava/util/List;Ljava/lang/String;Z)Ljava/lang/String;
    //   373: astore #10
    //   375: aload #10
    //   377: sipush #19094
    //   380: sipush #5657
    //   383: invokestatic a : (II)Ljava/lang/String;
    //   386: invokevirtual indexOf : (Ljava/lang/String;)I
    //   389: istore #11
    //   391: iload #11
    //   393: iconst_m1
    //   394: if_icmpne -> 399
    //   397: aload_0
    //   398: areturn
    //   399: iinc #11, 9
    //   402: aload #10
    //   404: iload #11
    //   406: invokevirtual substring : (I)Ljava/lang/String;
    //   409: invokevirtual trim : ()Ljava/lang/String;
    //   412: invokestatic Zy : (Ljava/lang/String;)[B
    //   415: astore #12
    //   417: aload_0
    //   418: aload #12
    //   420: aload_1
    //   421: invokevirtual ZO : ()I
    //   424: aload_0
    //   425: invokeinterface Zpu : ()I
    //   430: invokestatic ZN : (Lburp/Zstu;[BII)I
    //   433: istore #13
    //   435: iload #13
    //   437: iconst_m1
    //   438: if_icmpne -> 443
    //   441: aload_0
    //   442: areturn
    //   443: iload #13
    //   445: aload #12
    //   447: arraylength
    //   448: iadd
    //   449: istore #13
    //   451: sipush #19072
    //   454: sipush #-23835
    //   457: invokestatic a : (II)Ljava/lang/String;
    //   460: invokestatic Zy : (Ljava/lang/String;)[B
    //   463: astore #14
    //   465: sipush #19077
    //   468: sipush #-32382
    //   471: invokestatic a : (II)Ljava/lang/String;
    //   474: invokestatic Zy : (Ljava/lang/String;)[B
    //   477: astore #15
    //   479: iload #13
    //   481: aload #14
    //   483: arraylength
    //   484: iadd
    //   485: istore #16
    //   487: iload #16
    //   489: aload #7
    //   491: arraylength
    //   492: iadd
    //   493: istore #17
    //   495: iload #17
    //   497: aload #15
    //   499: arraylength
    //   500: iadd
    //   501: istore #18
    //   503: iload #18
    //   505: aload #8
    //   507: arraylength
    //   508: iadd
    //   509: istore #19
    //   511: aload_0
    //   512: aload #9
    //   514: iconst_0
    //   515: iload #13
    //   517: invokeinterface Zo : (Ljava/io/OutputStream;II)V
    //   522: aload #9
    //   524: aload #14
    //   526: invokevirtual write : ([B)V
    //   529: aload #9
    //   531: aload #7
    //   533: invokevirtual write : ([B)V
    //   536: aload #9
    //   538: aload #15
    //   540: invokevirtual write : ([B)V
    //   543: aload #9
    //   545: aload #8
    //   547: invokevirtual write : ([B)V
    //   550: aload #9
    //   552: bipush #13
    //   554: invokevirtual write : (I)V
    //   557: aload #9
    //   559: bipush #10
    //   561: invokevirtual write : (I)V
    //   564: aload #9
    //   566: bipush #45
    //   568: invokevirtual write : (I)V
    //   571: aload #9
    //   573: bipush #45
    //   575: invokevirtual write : (I)V
    //   578: aload #9
    //   580: aload #12
    //   582: invokevirtual write : ([B)V
    //   585: aload_0
    //   586: aload #9
    //   588: iload #13
    //   590: aload_0
    //   591: invokeinterface Zpu : ()I
    //   596: iload #13
    //   598: isub
    //   599: invokeinterface Zo : (Ljava/io/OutputStream;II)V
    //   604: aload #5
    //   606: ifnull -> 672
    //   609: aload #5
    //   611: iconst_0
    //   612: iload #16
    //   614: iastore
    //   615: aload #5
    //   617: iconst_1
    //   618: iload #17
    //   620: iastore
    //   621: aload #5
    //   623: iconst_2
    //   624: iload #18
    //   626: iastore
    //   627: aload #5
    //   629: iconst_3
    //   630: iload #19
    //   632: iastore
    //   633: iload #6
    //   635: ifne -> 672
    //   638: goto -> 645
    //   641: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   644: athrow
    //   645: aload #5
    //   647: ifnull -> 670
    //   650: goto -> 657
    //   653: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   656: athrow
    //   657: aload #5
    //   659: iconst_m1
    //   660: invokestatic fill : ([II)V
    //   663: goto -> 670
    //   666: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   669: athrow
    //   670: aload_0
    //   671: areturn
    //   672: aload #9
    //   674: invokevirtual toByteArray : ()[B
    //   677: invokestatic Zy : ([B)Lburp/Zyf;
    //   680: astore #10
    //   682: aload #10
    //   684: invokeinterface Zpu : ()I
    //   689: istore #11
    //   691: aload #10
    //   693: invokestatic Ze : (Lburp/Zstu;)Lburp/Zstu;
    //   696: astore #10
    //   698: aload #5
    //   700: ifnull -> 759
    //   703: iload #11
    //   705: aload #10
    //   707: invokeinterface Zpu : ()I
    //   712: if_icmpeq -> 759
    //   715: goto -> 722
    //   718: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   721: athrow
    //   722: iconst_0
    //   723: istore #12
    //   725: iload #12
    //   727: aload #5
    //   729: arraylength
    //   730: if_icmpge -> 759
    //   733: aload #5
    //   735: iload #12
    //   737: dup2
    //   738: iaload
    //   739: aload #10
    //   741: invokeinterface Zpu : ()I
    //   746: iload #11
    //   748: isub
    //   749: iadd
    //   750: iastore
    //   751: iinc #12, 1
    //   754: iload #6
    //   756: ifne -> 725
    //   759: aload #10
    //   761: areturn
    //   762: aload_1
    //   763: invokevirtual ZG : ()Ljava/util/List;
    //   766: sipush #19089
    //   769: sipush #8291
    //   772: invokestatic a : (II)Ljava/lang/String;
    //   775: iconst_0
    //   776: invokestatic ZZ : (Ljava/util/List;Ljava/lang/String;Z)Ljava/lang/String;
    //   779: astore #9
    //   781: aconst_null
    //   782: aload #9
    //   784: if_acmpne -> 1006
    //   787: sipush #19088
    //   790: sipush #-6786
    //   793: invokestatic a : (II)Ljava/lang/String;
    //   796: invokestatic Zy : (Ljava/lang/String;)[B
    //   799: astore #10
    //   801: aload_1
    //   802: getfield ZP : I
    //   805: istore #11
    //   807: iload #11
    //   809: aload #10
    //   811: arraylength
    //   812: iadd
    //   813: istore #12
    //   815: iload #12
    //   817: aload #7
    //   819: arraylength
    //   820: iadd
    //   821: istore #13
    //   823: iload #13
    //   825: iconst_1
    //   826: iadd
    //   827: istore #14
    //   829: iload #14
    //   831: aload #8
    //   833: arraylength
    //   834: iadd
    //   835: istore #15
    //   837: aload_0
    //   838: invokeinterface Zpu : ()I
    //   843: aload #10
    //   845: arraylength
    //   846: iadd
    //   847: aload #7
    //   849: arraylength
    //   850: iadd
    //   851: aload #8
    //   853: arraylength
    //   854: iadd
    //   855: iconst_3
    //   856: iadd
    //   857: newarray byte
    //   859: astore #16
    //   861: aload_0
    //   862: invokeinterface ZiD : ()[B
    //   867: iconst_0
    //   868: aload #16
    //   870: iconst_0
    //   871: iload #11
    //   873: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   876: aload #10
    //   878: iconst_0
    //   879: aload #16
    //   881: iload #11
    //   883: aload #10
    //   885: arraylength
    //   886: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   889: aload #7
    //   891: iconst_0
    //   892: aload #16
    //   894: iload #12
    //   896: aload #7
    //   898: arraylength
    //   899: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   902: aload #16
    //   904: iload #13
    //   906: bipush #61
    //   908: bastore
    //   909: aload #8
    //   911: iconst_0
    //   912: aload #16
    //   914: iload #14
    //   916: aload #8
    //   918: arraylength
    //   919: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   922: aload #16
    //   924: iload #15
    //   926: bipush #13
    //   928: bastore
    //   929: aload #16
    //   931: iload #15
    //   933: iconst_1
    //   934: iadd
    //   935: bipush #10
    //   937: bastore
    //   938: aload_0
    //   939: invokeinterface ZiD : ()[B
    //   944: iload #11
    //   946: aload #16
    //   948: iload #15
    //   950: iconst_2
    //   951: iadd
    //   952: aload_0
    //   953: invokeinterface Zpu : ()I
    //   958: iload #11
    //   960: isub
    //   961: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   964: aload #5
    //   966: ifnull -> 1000
    //   969: aload #5
    //   971: iconst_0
    //   972: iload #12
    //   974: iastore
    //   975: aload #5
    //   977: iconst_1
    //   978: iload #13
    //   980: iastore
    //   981: aload #5
    //   983: iconst_2
    //   984: iload #14
    //   986: iastore
    //   987: aload #5
    //   989: iconst_3
    //   990: iload #15
    //   992: iastore
    //   993: goto -> 1000
    //   996: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   999: athrow
    //   1000: aload #16
    //   1002: invokestatic Zy : ([B)Lburp/Zyf;
    //   1005: areturn
    //   1006: iconst_0
    //   1007: istore #10
    //   1009: new java/util/ArrayList
    //   1012: dup
    //   1013: invokespecial <init> : ()V
    //   1016: astore #11
    //   1018: aload_0
    //   1019: iconst_0
    //   1020: aload_1
    //   1021: getfield ZP : I
    //   1024: aload #11
    //   1026: invokestatic ZZ : (Lburp/Zstu;IILjava/util/List;)Ljava/util/List;
    //   1029: astore #12
    //   1031: iconst_m1
    //   1032: istore #13
    //   1034: iconst_0
    //   1035: istore #14
    //   1037: iload #14
    //   1039: aload #12
    //   1041: invokeinterface size : ()I
    //   1046: if_icmpge -> 1149
    //   1049: aload #12
    //   1051: iload #14
    //   1053: invokeinterface get : (I)Ljava/lang/Object;
    //   1058: checkcast java/lang/String
    //   1061: astore #15
    //   1063: aload #15
    //   1065: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1068: sipush #19078
    //   1071: sipush #-31077
    //   1074: invokestatic a : (II)Ljava/lang/String;
    //   1077: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1080: ifne -> 1090
    //   1083: goto -> 1134
    //   1086: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1089: athrow
    //   1090: aload #15
    //   1092: invokevirtual trim : ()Ljava/lang/String;
    //   1095: invokevirtual length : ()I
    //   1098: bipush #7
    //   1100: if_icmpne -> 1106
    //   1103: iconst_1
    //   1104: istore #10
    //   1106: aload #11
    //   1108: iload #14
    //   1110: invokeinterface get : (I)Ljava/lang/Object;
    //   1115: checkcast java/lang/Integer
    //   1118: invokevirtual intValue : ()I
    //   1121: aload #15
    //   1123: invokevirtual length : ()I
    //   1126: iadd
    //   1127: istore #13
    //   1129: iload #6
    //   1131: ifne -> 1149
    //   1134: iinc #14, 1
    //   1137: iload #6
    //   1139: ifne -> 1037
    //   1142: goto -> 1149
    //   1145: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1148: athrow
    //   1149: iload #10
    //   1151: ifeq -> 1163
    //   1154: iload #13
    //   1156: goto -> 1167
    //   1159: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1162: athrow
    //   1163: iload #13
    //   1165: iconst_2
    //   1166: iadd
    //   1167: istore #14
    //   1169: iload #14
    //   1171: aload #7
    //   1173: arraylength
    //   1174: iadd
    //   1175: istore #15
    //   1177: iload #15
    //   1179: iconst_1
    //   1180: iadd
    //   1181: istore #16
    //   1183: iload #16
    //   1185: aload #8
    //   1187: arraylength
    //   1188: iadd
    //   1189: istore #17
    //   1191: aload_0
    //   1192: invokeinterface Zpu : ()I
    //   1197: aload #7
    //   1199: arraylength
    //   1200: iadd
    //   1201: aload #8
    //   1203: arraylength
    //   1204: iadd
    //   1205: iload #10
    //   1207: ifeq -> 1218
    //   1210: iconst_1
    //   1211: goto -> 1219
    //   1214: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1217: athrow
    //   1218: iconst_3
    //   1219: iadd
    //   1220: newarray byte
    //   1222: astore #18
    //   1224: aload_0
    //   1225: invokeinterface ZiD : ()[B
    //   1230: iconst_0
    //   1231: aload #18
    //   1233: iconst_0
    //   1234: iload #13
    //   1236: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1239: iload #10
    //   1241: ifne -> 1267
    //   1244: aload #18
    //   1246: iload #13
    //   1248: bipush #59
    //   1250: bastore
    //   1251: aload #18
    //   1253: iload #13
    //   1255: iconst_1
    //   1256: iadd
    //   1257: bipush #32
    //   1259: bastore
    //   1260: goto -> 1267
    //   1263: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1266: athrow
    //   1267: aload #7
    //   1269: iconst_0
    //   1270: aload #18
    //   1272: iload #14
    //   1274: aload #7
    //   1276: arraylength
    //   1277: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1280: aload #18
    //   1282: iload #15
    //   1284: bipush #61
    //   1286: bastore
    //   1287: aload #8
    //   1289: iconst_0
    //   1290: aload #18
    //   1292: iload #16
    //   1294: aload #8
    //   1296: arraylength
    //   1297: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1300: aload_0
    //   1301: invokeinterface ZiD : ()[B
    //   1306: iload #13
    //   1308: aload #18
    //   1310: iload #17
    //   1312: aload_0
    //   1313: invokeinterface Zpu : ()I
    //   1318: iload #13
    //   1320: isub
    //   1321: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1324: aload #5
    //   1326: ifnull -> 1360
    //   1329: aload #5
    //   1331: iconst_0
    //   1332: iload #14
    //   1334: iastore
    //   1335: aload #5
    //   1337: iconst_1
    //   1338: iload #15
    //   1340: iastore
    //   1341: aload #5
    //   1343: iconst_2
    //   1344: iload #16
    //   1346: iastore
    //   1347: aload #5
    //   1349: iconst_3
    //   1350: iload #17
    //   1352: iastore
    //   1353: goto -> 1360
    //   1356: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1359: athrow
    //   1360: aload #18
    //   1362: invokestatic Zy : ([B)Lburp/Zyf;
    //   1365: areturn
    //   1366: goto -> 1379
    //   1369: astore #7
    //   1371: aload #7
    //   1373: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   1376: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1379: aload_0
    //   1380: areturn
    // Exception table:
    //   from	to	target	type
    //   5	97	1369	java/lang/Exception
    //   24	68	71	java/lang/Exception
    //   64	79	79	java/lang/Exception
    //   98	398	1369	java/lang/Exception
    //   107	165	168	java/lang/Exception
    //   152	176	176	java/lang/Exception
    //   222	234	234	java/lang/Exception
    //   264	287	290	java/lang/Exception
    //   294	349	352	java/lang/Exception
    //   399	442	1369	java/lang/Exception
    //   443	671	1369	java/lang/Exception
    //   511	638	641	java/lang/Exception
    //   609	650	653	java/lang/Exception
    //   645	663	666	java/lang/Exception
    //   672	761	1369	java/lang/Exception
    //   698	715	718	java/lang/Exception
    //   762	1005	1369	java/lang/Exception
    //   861	993	996	java/lang/Exception
    //   1006	1365	1369	java/lang/Exception
    //   1063	1086	1086	java/lang/Exception
    //   1129	1142	1145	java/lang/Exception
    //   1149	1159	1159	java/lang/Exception
    //   1191	1214	1214	java/lang/Exception
    //   1224	1260	1263	java/lang/Exception
    //   1267	1353	1356	java/lang/Exception
  }
  
  public static Zstu Z_(Zstu paramZstu, Zlit paramZlit, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return Zo(paramZstu, paramZlit, paramArrayOfbyte1, paramArrayOfbyte2, null);
  }
  
  private static Zstu Zo(Zstu paramZstu, Zlit paramZlit, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int[] paramArrayOfint) {
    // Byte code:
    //   0: invokestatic Zu : ()Z
    //   3: istore #5
    //   5: aload_0
    //   6: invokestatic ZV : (Lburp/Zstu;)I
    //   9: istore #6
    //   11: iload #6
    //   13: iconst_m1
    //   14: if_icmpne -> 19
    //   17: aload_0
    //   18: areturn
    //   19: iload #6
    //   21: iconst_1
    //   22: iadd
    //   23: istore #7
    //   25: iload #7
    //   27: aload_2
    //   28: arraylength
    //   29: iadd
    //   30: istore #8
    //   32: iload #8
    //   34: iconst_1
    //   35: iadd
    //   36: istore #9
    //   38: iload #9
    //   40: aload_3
    //   41: arraylength
    //   42: iadd
    //   43: istore #10
    //   45: new java/io/ByteArrayOutputStream
    //   48: dup
    //   49: invokespecial <init> : ()V
    //   52: astore #11
    //   54: aload_0
    //   55: aload #11
    //   57: iconst_0
    //   58: iload #6
    //   60: invokeinterface Zo : (Ljava/io/OutputStream;II)V
    //   65: aload_1
    //   66: invokeinterface Zds : ()Z
    //   71: ifeq -> 126
    //   74: aload_0
    //   75: iload #6
    //   77: iconst_1
    //   78: isub
    //   79: invokeinterface Zp : (I)B
    //   84: istore #12
    //   86: bipush #38
    //   88: iload #12
    //   90: if_icmpeq -> 121
    //   93: bipush #63
    //   95: iload #12
    //   97: if_icmpeq -> 121
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   106: athrow
    //   107: aload #11
    //   109: bipush #38
    //   111: invokevirtual write : (I)V
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: iload #5
    //   123: ifeq -> 140
    //   126: aload #11
    //   128: bipush #63
    //   130: invokevirtual write : (I)V
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: aload #11
    //   142: aload_2
    //   143: invokevirtual write : ([B)V
    //   146: aload #11
    //   148: bipush #61
    //   150: invokevirtual write : (I)V
    //   153: aload #11
    //   155: aload_3
    //   156: invokevirtual write : ([B)V
    //   159: aload_0
    //   160: aload #11
    //   162: iload #6
    //   164: aload_0
    //   165: invokeinterface Zpu : ()I
    //   170: iload #6
    //   172: isub
    //   173: invokeinterface Zo : (Ljava/io/OutputStream;II)V
    //   178: aload #4
    //   180: ifnull -> 214
    //   183: aload #4
    //   185: iconst_0
    //   186: iload #7
    //   188: iastore
    //   189: aload #4
    //   191: iconst_1
    //   192: iload #8
    //   194: iastore
    //   195: aload #4
    //   197: iconst_2
    //   198: iload #9
    //   200: iastore
    //   201: aload #4
    //   203: iconst_3
    //   204: iload #10
    //   206: iastore
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   213: athrow
    //   214: aload #11
    //   216: invokevirtual toByteArray : ()[B
    //   219: invokestatic Zy : ([B)Lburp/Zyf;
    //   222: areturn
    //   223: astore #6
    //   225: aload #6
    //   227: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   230: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   233: aload_0
    //   234: areturn
    // Exception table:
    //   from	to	target	type
    //   5	18	223	java/io/IOException
    //   19	222	223	java/io/IOException
    //   86	100	103	java/io/IOException
    //   93	114	117	java/io/IOException
    //   121	133	136	java/io/IOException
    //   140	207	210	java/io/IOException
  }
  
  public static Zstu Zp(Zstu paramZstu, Zz1p paramZz1p, String paramString, Zrdu paramZrdu) {
    return ZI(paramZstu, paramZz1p, paramString, null, paramZrdu);
  }
  
  public static Zstu ZI(Zstu paramZstu, Zz1p paramZz1p, String paramString1, String paramString2, Zrdu paramZrdu) {
    // Byte code:
    //   0: invokestatic Zt : ()Z
    //   3: istore #5
    //   5: aload_1
    //   6: getfield ZV : Ljava/util/List;
    //   9: invokeinterface iterator : ()Ljava/util/Iterator;
    //   14: astore #6
    //   16: aload #6
    //   18: invokeinterface hasNext : ()Z
    //   23: ifeq -> 752
    //   26: aload #6
    //   28: invokeinterface next : ()Ljava/lang/Object;
    //   33: checkcast burp/Zt8g
    //   36: astore #7
    //   38: aload #7
    //   40: invokeinterface ZbQ : ()Lburp/Zrdu;
    //   45: aload #4
    //   47: if_acmpeq -> 57
    //   50: goto -> 16
    //   53: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload_2
    //   58: aload #7
    //   60: invokeinterface Zns : ()Ljava/lang/String;
    //   65: invokevirtual equals : (Ljava/lang/Object;)Z
    //   68: ifne -> 78
    //   71: goto -> 16
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: aload_3
    //   79: ifnull -> 110
    //   82: aload_3
    //   83: aload #7
    //   85: invokeinterface Zbn : ()Ljava/lang/String;
    //   90: invokevirtual equals : (Ljava/lang/Object;)Z
    //   93: ifne -> 110
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   102: athrow
    //   103: goto -> 16
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: aload #7
    //   112: invokeinterface Zba : ()I
    //   117: istore #8
    //   119: aload #7
    //   121: invokeinterface Zb2 : ()I
    //   126: istore #9
    //   128: getstatic burp/Zz5j.Zx : [I
    //   131: aload #4
    //   133: invokevirtual ordinal : ()I
    //   136: iaload
    //   137: tableswitch default -> 677, 1 -> 168, 2 -> 330, 3 -> 330, 4 -> 590
    //   168: aload_0
    //   169: invokeinterface Zpu : ()I
    //   174: iload #9
    //   176: if_icmple -> 221
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   185: athrow
    //   186: aload_0
    //   187: iload #9
    //   189: invokeinterface Zp : (I)B
    //   194: bipush #38
    //   196: if_icmpne -> 221
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   205: athrow
    //   206: iinc #9, 1
    //   209: iload #5
    //   211: ifne -> 691
    //   214: goto -> 221
    //   217: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   220: athrow
    //   221: aload_0
    //   222: invokeinterface Zpu : ()I
    //   227: iload #9
    //   229: if_icmple -> 691
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   238: athrow
    //   239: aload_0
    //   240: iload #9
    //   242: invokeinterface Zp : (I)B
    //   247: bipush #32
    //   249: if_icmpne -> 691
    //   252: goto -> 259
    //   255: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   258: athrow
    //   259: iload #8
    //   261: ifle -> 691
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   270: athrow
    //   271: aload_0
    //   272: iload #8
    //   274: iconst_1
    //   275: isub
    //   276: invokeinterface Zp : (I)B
    //   281: bipush #38
    //   283: if_icmpeq -> 315
    //   286: goto -> 293
    //   289: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   292: athrow
    //   293: aload_0
    //   294: iload #8
    //   296: iconst_1
    //   297: isub
    //   298: invokeinterface Zp : (I)B
    //   303: bipush #63
    //   305: if_icmpne -> 691
    //   308: goto -> 315
    //   311: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   314: athrow
    //   315: iinc #8, -1
    //   318: iload #5
    //   320: ifne -> 691
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   329: athrow
    //   330: getstatic burp/Zz5j.Zi : [I
    //   333: aload_1
    //   334: getfield ZY : Lburp/Zsba;
    //   337: invokevirtual ordinal : ()I
    //   340: iaload
    //   341: lookupswitch default -> 566, 1 -> 372, 6 -> 492
    //   368: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   371: athrow
    //   372: aload_0
    //   373: invokeinterface Zpu : ()I
    //   378: iload #9
    //   380: if_icmple -> 425
    //   383: goto -> 390
    //   386: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   389: athrow
    //   390: aload_0
    //   391: iload #9
    //   393: invokeinterface Zp : (I)B
    //   398: bipush #38
    //   400: if_icmpne -> 425
    //   403: goto -> 410
    //   406: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   409: athrow
    //   410: iinc #9, 1
    //   413: iload #5
    //   415: ifne -> 691
    //   418: goto -> 425
    //   421: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   424: athrow
    //   425: aload_0
    //   426: invokeinterface Zpu : ()I
    //   431: iload #9
    //   433: if_icmpne -> 691
    //   436: goto -> 443
    //   439: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   442: athrow
    //   443: iload #8
    //   445: ifle -> 691
    //   448: goto -> 455
    //   451: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   454: athrow
    //   455: aload_0
    //   456: iload #8
    //   458: iconst_1
    //   459: isub
    //   460: invokeinterface Zp : (I)B
    //   465: bipush #38
    //   467: if_icmpne -> 691
    //   470: goto -> 477
    //   473: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   476: athrow
    //   477: iinc #8, -1
    //   480: iload #5
    //   482: ifne -> 691
    //   485: goto -> 492
    //   488: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   491: athrow
    //   492: aload_0
    //   493: bipush #10
    //   495: iconst_0
    //   496: iload #8
    //   498: invokestatic Zc : (Lburp/Zstu;BII)I
    //   501: istore #10
    //   503: iload #10
    //   505: iconst_m1
    //   506: if_icmpeq -> 691
    //   509: aload_0
    //   510: bipush #10
    //   512: iconst_0
    //   513: iload #10
    //   515: invokestatic Zc : (Lburp/Zstu;BII)I
    //   518: istore #10
    //   520: iload #10
    //   522: ifle -> 557
    //   525: aload_0
    //   526: iload #10
    //   528: iconst_1
    //   529: isub
    //   530: invokeinterface Zp : (I)B
    //   535: bipush #13
    //   537: if_icmpne -> 557
    //   540: goto -> 547
    //   543: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   546: athrow
    //   547: iinc #10, -1
    //   550: goto -> 557
    //   553: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   556: athrow
    //   557: iload #10
    //   559: istore #8
    //   561: iload #5
    //   563: ifne -> 691
    //   566: iconst_0
    //   567: getstatic net/portswigger/Zqf.ZH : Lnet/portswigger/Zqf;
    //   570: aload #4
    //   572: invokevirtual toString : ()Ljava/lang/String;
    //   575: aload_1
    //   576: getfield ZY : Lburp/Zsba;
    //   579: invokevirtual Zi : ()B
    //   582: invokestatic toString : (B)Ljava/lang/String;
    //   585: invokestatic Zb : (ZLnet/portswigger/Zqf;Ljava/lang/String;Ljava/lang/String;)V
    //   588: aload_0
    //   589: areturn
    //   590: aload_0
    //   591: invokeinterface Zpu : ()I
    //   596: iload #9
    //   598: if_icmple -> 691
    //   601: aload_0
    //   602: iload #9
    //   604: invokeinterface Zp : (I)B
    //   609: bipush #59
    //   611: if_icmpne -> 691
    //   614: goto -> 621
    //   617: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   620: athrow
    //   621: iinc #9, 1
    //   624: aload_0
    //   625: invokeinterface Zpu : ()I
    //   630: iload #9
    //   632: if_icmple -> 691
    //   635: goto -> 642
    //   638: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   641: athrow
    //   642: aload_0
    //   643: iload #9
    //   645: invokeinterface Zp : (I)B
    //   650: bipush #32
    //   652: if_icmpne -> 691
    //   655: goto -> 662
    //   658: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   661: athrow
    //   662: iinc #9, 1
    //   665: iload #5
    //   667: ifne -> 691
    //   670: goto -> 677
    //   673: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   676: athrow
    //   677: iconst_0
    //   678: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   681: aload #4
    //   683: invokestatic Zk : (Lburp/Zrdu;)Ljava/lang/String;
    //   686: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   689: aload_0
    //   690: areturn
    //   691: aload_0
    //   692: invokeinterface Zpu : ()I
    //   697: iload #9
    //   699: iload #8
    //   701: isub
    //   702: isub
    //   703: newarray byte
    //   705: astore #10
    //   707: aload_0
    //   708: invokeinterface ZiD : ()[B
    //   713: iconst_0
    //   714: aload #10
    //   716: iconst_0
    //   717: iload #8
    //   719: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   722: aload_0
    //   723: invokeinterface ZiD : ()[B
    //   728: iload #9
    //   730: aload #10
    //   732: iload #8
    //   734: aload_0
    //   735: invokeinterface Zpu : ()I
    //   740: iload #9
    //   742: isub
    //   743: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   746: aload #10
    //   748: invokestatic Zy : ([B)Lburp/Zyf;
    //   751: areturn
    //   752: goto -> 765
    //   755: astore #6
    //   757: aload #6
    //   759: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   762: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   765: aload_0
    //   766: areturn
    // Exception table:
    //   from	to	target	type
    //   5	589	755	java/lang/Exception
    //   38	53	53	java/lang/Exception
    //   57	74	74	java/lang/Exception
    //   78	96	99	java/lang/Exception
    //   82	106	106	java/lang/Exception
    //   128	179	182	java/lang/Exception
    //   168	199	202	java/lang/Exception
    //   186	214	217	java/lang/Exception
    //   206	232	235	java/lang/Exception
    //   221	252	255	java/lang/Exception
    //   239	264	267	java/lang/Exception
    //   259	286	289	java/lang/Exception
    //   271	308	311	java/lang/Exception
    //   293	323	326	java/lang/Exception
    //   315	368	368	java/lang/Exception
    //   330	383	386	java/lang/Exception
    //   372	403	406	java/lang/Exception
    //   390	418	421	java/lang/Exception
    //   410	436	439	java/lang/Exception
    //   425	448	451	java/lang/Exception
    //   443	470	473	java/lang/Exception
    //   455	485	488	java/lang/Exception
    //   520	540	543	java/lang/Exception
    //   525	550	553	java/lang/Exception
    //   590	614	617	java/lang/Exception
    //   590	690	755	java/lang/Exception
    //   601	635	638	java/lang/Exception
    //   621	655	658	java/lang/Exception
    //   642	670	673	java/lang/Exception
    //   691	751	755	java/lang/Exception
  }
  
  static Zstu Zg(Zstu paramZstu, Zz1p paramZz1p, String paramString1, String paramString2, Zrdu paramZrdu1, Zrdu paramZrdu2, int[] paramArrayOfint, Zbnt paramZbnt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: aload #4
    //   5: invokestatic Zp : (Lburp/Zstu;Lburp/Zz1p;Ljava/lang/String;Lburp/Zrdu;)Lburp/Zstu;
    //   8: astore_0
    //   9: invokestatic Zt : ()Z
    //   12: aconst_null
    //   13: aload_0
    //   14: iconst_2
    //   15: aload #7
    //   17: invokestatic ZY : (Lburp/Zmzk;Lburp/Zstu;BLburp/Zbnt;)Lburp/Zz1p;
    //   20: astore #9
    //   22: istore #8
    //   24: aload_2
    //   25: astore #10
    //   27: aload_3
    //   28: astore #11
    //   30: aload #9
    //   32: getfield ZY : Lburp/Zsba;
    //   35: getstatic burp/Zsba.MULTIPART : Lburp/Zsba;
    //   38: if_acmpne -> 106
    //   41: aload #4
    //   43: getstatic burp/Zrdu.BODY_PARAM_URL_ENCODED : Lburp/Zrdu;
    //   46: if_acmpeq -> 57
    //   49: aload #4
    //   51: getstatic burp/Zrdu.BODY_PARAM_MULTIPART : Lburp/Zrdu;
    //   54: if_acmpne -> 83
    //   57: aload #10
    //   59: invokestatic Zk : (Ljava/lang/String;)Ljava/lang/String;
    //   62: astore #10
    //   64: aload #11
    //   66: invokestatic Zk : (Ljava/lang/String;)Ljava/lang/String;
    //   69: astore #11
    //   71: iload #8
    //   73: ifne -> 106
    //   76: iconst_1
    //   77: anewarray burp/Zbqc
    //   80: invokestatic Zr : ([Lburp/Zbqc;)V
    //   83: aload #5
    //   85: getstatic burp/Zrdu.BODY_PARAM_URL_ENCODED : Lburp/Zrdu;
    //   88: if_acmpeq -> 99
    //   91: aload #5
    //   93: getstatic burp/Zrdu.BODY_PARAM_MULTIPART : Lburp/Zrdu;
    //   96: if_acmpne -> 106
    //   99: aload #11
    //   101: invokestatic ZJ : (Ljava/lang/String;)Ljava/lang/String;
    //   104: astore #11
    //   106: aload_0
    //   107: aload #9
    //   109: aload #10
    //   111: aload #11
    //   113: aload #5
    //   115: aload #6
    //   117: invokestatic Ze : (Lburp/Zstu;Lburp/Zz1p;Ljava/lang/String;Ljava/lang/String;Lburp/Zrdu;[I)Lburp/Zstu;
    //   120: astore_0
    //   121: aload #5
    //   123: getstatic burp/Zrdu.BODY_PARAM_URL_ENCODED : Lburp/Zrdu;
    //   126: if_acmpeq -> 137
    //   129: aload #5
    //   131: getstatic burp/Zrdu.BODY_PARAM_MULTIPART : Lburp/Zrdu;
    //   134: if_acmpne -> 219
    //   137: sipush #19098
    //   140: sipush #-10774
    //   143: invokestatic a : (II)Ljava/lang/String;
    //   146: aload #9
    //   148: getfield Zb : Ljava/lang/String;
    //   151: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   154: ifeq -> 219
    //   157: aconst_null
    //   158: aload_0
    //   159: iconst_2
    //   160: aload #7
    //   162: invokestatic ZY : (Lburp/Zmzk;Lburp/Zstu;BLburp/Zbnt;)Lburp/Zz1p;
    //   165: astore #9
    //   167: aload #5
    //   169: getstatic burp/Zrdu.BODY_PARAM_URL_ENCODED : Lburp/Zrdu;
    //   172: if_acmpne -> 181
    //   175: getstatic burp/Zsba.URL_ENCODED : Lburp/Zsba;
    //   178: goto -> 184
    //   181: getstatic burp/Zsba.MULTIPART : Lburp/Zsba;
    //   184: astore #12
    //   186: aload #9
    //   188: invokestatic ZA : (Lburp/Zz1p;)Lburp/Ztvi;
    //   191: sipush #19093
    //   194: sipush #3954
    //   197: invokestatic a : (II)Ljava/lang/String;
    //   200: invokevirtual ZX : (Ljava/lang/String;)Lburp/Ztvi;
    //   203: aload #12
    //   205: invokevirtual ZQ : (Lburp/Zsba;)Lburp/Ztvi;
    //   208: invokevirtual Zi : ()Lburp/Zz1p;
    //   211: astore #13
    //   213: aload #13
    //   215: invokestatic Zw : (Lburp/Zz1p;)Lburp/Zstu;
    //   218: astore_0
    //   219: aconst_null
    //   220: aload_0
    //   221: iconst_2
    //   222: aload #7
    //   224: invokestatic ZY : (Lburp/Zmzk;Lburp/Zstu;BLburp/Zbnt;)Lburp/Zz1p;
    //   227: getfield ZV : Ljava/util/List;
    //   230: invokeinterface iterator : ()Ljava/util/Iterator;
    //   235: astore #12
    //   237: aload #12
    //   239: invokeinterface hasNext : ()Z
    //   244: ifeq -> 334
    //   247: aload #12
    //   249: invokeinterface next : ()Ljava/lang/Object;
    //   254: checkcast burp/Zt8g
    //   257: astore #13
    //   259: aload #13
    //   261: invokeinterface ZbQ : ()Lburp/Zrdu;
    //   266: aload #5
    //   268: if_acmpne -> 329
    //   271: aload #13
    //   273: invokeinterface Zns : ()Ljava/lang/String;
    //   278: aload_2
    //   279: invokevirtual equals : (Ljava/lang/Object;)Z
    //   282: ifeq -> 329
    //   285: aload #6
    //   287: iconst_0
    //   288: aload #13
    //   290: invokeinterface Zba : ()I
    //   295: iastore
    //   296: aload #6
    //   298: iconst_1
    //   299: aload #13
    //   301: invokeinterface ZbZ : ()I
    //   306: iastore
    //   307: aload #6
    //   309: iconst_2
    //   310: aload #13
    //   312: invokeinterface Zbl : ()I
    //   317: iastore
    //   318: aload #6
    //   320: iconst_3
    //   321: aload #13
    //   323: invokeinterface Zb2 : ()I
    //   328: iastore
    //   329: iload #8
    //   331: ifne -> 237
    //   334: aload_0
    //   335: areturn
  }
  
  private static boolean ZI(Zrdu paramZrdu) {
    switch (Zz5j.Zx[paramZrdu.ordinal()]) {
      case 1:
      case 2:
      case 3:
      case 4:
        return false;
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
        return true;
    } 
    Zuh.ZT(false, Zqf.Zk, paramZrdu.toString());
    return true;
  }
  
  private static boolean ZS(String paramString, boolean paramBoolean, Zrdu paramZrdu, Zt8g paramZt8g) {
    return ZI(paramZt8g.ZbQ()) ? true : ((paramBoolean && paramZt8g.ZbQ() != paramZrdu) ? true : (!paramString.equals(paramZt8g.Zns())));
  }
  
  private static Zstu Zm(int[] paramArrayOfint, Zstu paramZstu) {
    int i = paramZstu.Zpu();
    paramZstu = Zgyj.Ze(paramZstu);
    boolean bool = Zsba.Zt();
    if (paramArrayOfint != null && i != paramZstu.Zpu()) {
      byte b = 0;
      while (b < paramArrayOfint.length) {
        paramArrayOfint[b] = paramArrayOfint[b] + paramZstu.Zpu() - i;
        b++;
        if (!bool)
          break; 
      } 
    } 
    return paramZstu;
  }
  
  private static void ZK(int[] paramArrayOfint, Zt8g paramZt8g, int paramInt) {
    if (paramArrayOfint != null) {
      paramArrayOfint[0] = paramZt8g.Zba();
      paramArrayOfint[1] = paramZt8g.ZbZ();
      paramArrayOfint[2] = paramZt8g.Zbl();
      paramArrayOfint[3] = paramZt8g.Zbl() + paramInt;
    } 
  }
  
  private static int lambda$rebuildRequest$0(Zt8g paramZt8g1, Zt8g paramZt8g2) {
    return Integer.compare(paramZt8g1.Zbl(), paramZt8g2.Zb2());
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #23
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'K-w~\\t\\tmfiÝßü\\f ßÿ¼*í¶:\\bp¯]5;q°Qçêlí\\rÊð£¡çÛê)Æ÷hUõ!åv°É.~Ú²¡Ôá·P·#ÔJ»@\Æ\\fóe,s8)Ò0òàÙT!xø%$ÈÕTZ¨ÉïÊrÂ·¡k°Y¦_ÃI«åÿ[Î¡¥úC&ØÕIeëGhPû02c6üÜÎð2§é¼w½8óNèo®)ÀÍð0\\t½§D­Å"@EÖ£]þ\\t!skµ úÁ)7\\r½O\\n®À:þÀ2ûÎEÒ©-õ5°ßaI *\Ê·Lqlå5x·ýY(`ºôZ nºÂìÁ\\n¢-\\bL\\nuøf]ï.ñ§ÈÊ&¶OÓSÄ0FÎ÷\\rn'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #50
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc 'Ô\\nv ÍýÒLÚ°­?Þ½O2;©kQ|B9yh.ÚOU#x\\r}ö=ªe%åØ»µ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #47
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #47
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
    //   128: putstatic burp/Zmvc.a : [Ljava/lang/String;
    //   131: bipush #23
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zmvc.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #66
    //   214: goto -> 244
    //   217: bipush #88
    //   219: goto -> 244
    //   222: bipush #43
    //   224: goto -> 244
    //   227: bipush #86
    //   229: goto -> 244
    //   232: bipush #106
    //   234: goto -> 244
    //   237: bipush #109
    //   239: goto -> 244
    //   242: bipush #81
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
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
    int i = (paramInt1 ^ 0x4A94) & 0xFFFF;
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
      byte b1 = 111;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmvc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */