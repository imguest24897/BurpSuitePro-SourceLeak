package burp;

import java.io.IOException;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzeb {
  static byte[] Za(Zsh8 paramZsh8, Zgxp paramZgxp, int paramInt, boolean paramBoolean) {
    int i = Zxw4.Zt();
    Zm8f zm8f = paramZgxp.Ze9().Zo(Integer.valueOf(paramInt));
    try {
    
    } catch (Ztku ztku) {
      throw a(null);
    } 
    byte[] arrayOfByte1 = paramBoolean ? zm8f.Zo5() : zm8f.ZoI();
    try {
      if (arrayOfByte1 != null)
        return arrayOfByte1; 
    } catch (Ztku ztku) {
      throw a(null);
    } 
    byte[] arrayOfByte2 = zm8f.Zom();
    try {
    
    } catch (Ztku ztku) {
      throw a(null);
    } 
    Zuh.Zb((arrayOfByte2 != null), Zqf.Zx);
    try {
      switch (Zru7.ZQ[paramZsh8.ZPa().ordinal()]) {
        case 1:
        case 2:
          arrayOfByte1 = ((Ze9k)paramZsh8.ZPq().ZdF(0)).ZiB().Zm(arrayOfByte2, paramBoolean);
          if (i != 0);
          return arrayOfByte1;
        case 3:
        case 4:
          arrayOfByte1 = ((Ze9k)paramZsh8.ZPq().ZdF(paramInt)).ZiB().Zm(arrayOfByte2, paramBoolean);
          try {
            if (i != 0)
              break; 
          } catch (Ztku ztku) {
            throw a(null);
          } 
          return arrayOfByte1;
      } 
      Zuh.ZT(false, Zqf.Zk, paramZsh8.ZPa().toString());
    } catch (Ztku ztku) {
      Zah.Zl(ztku, Zk_.UNEXPECTED);
    } 
    return arrayOfByte1;
  }
  
  static void Zq(Zsh8 paramZsh8, Zs4f paramZs4f) throws IOException {
    // Byte code:
    //   0: aload_1
    //   1: getstatic burp/Zou.ATTACK_NUMBER : Lburp/Zou;
    //   4: getfield key : Ljava/lang/String;
    //   7: iconst_0
    //   8: invokeinterface Zb : (Ljava/lang/String;I)V
    //   13: invokestatic Zt : ()I
    //   16: aload_0
    //   17: invokeinterface ZPE : ()Lburp/Zxpp;
    //   22: astore_3
    //   23: istore_2
    //   24: aload_3
    //   25: ifnull -> 65
    //   28: aload_3
    //   29: invokeinterface ZwZ : ()Lburp/Zstu;
    //   34: invokestatic Zd : (Lburp/Zstu;)Lburp/Zmzk;
    //   37: astore #4
    //   39: aload #4
    //   41: ifnull -> 65
    //   44: aload_1
    //   45: getstatic burp/Zou.HTTP_SERVICE : Lburp/Zou;
    //   48: getfield key : Ljava/lang/String;
    //   51: aload #4
    //   53: invokeinterface ZX : (Ljava/lang/String;Lburp/Zk5_;)V
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   64: athrow
    //   65: aload_0
    //   66: invokeinterface ZPJ : ()Lburp/Zstu;
    //   71: ifnull -> 162
    //   74: aload_1
    //   75: getstatic burp/Zou.REQUEST_TEMPLATE : Lburp/Zou;
    //   78: getfield key : Ljava/lang/String;
    //   81: aload_0
    //   82: invokeinterface ZPJ : ()Lburp/Zstu;
    //   87: invokeinterface Ze : (Ljava/lang/String;Lburp/Zstu;)V
    //   92: aload_0
    //   93: invokeinterface ZPJ : ()Lburp/Zstu;
    //   98: invokeinterface ZiD : ()[B
    //   103: invokestatic Zd : ([B)[[B
    //   106: astore #4
    //   108: aload #4
    //   110: astore #5
    //   112: aload #5
    //   114: arraylength
    //   115: istore #6
    //   117: iconst_0
    //   118: istore #7
    //   120: iload #7
    //   122: iload #6
    //   124: if_icmpge -> 162
    //   127: aload #5
    //   129: iload #7
    //   131: aaload
    //   132: astore #8
    //   134: aload_1
    //   135: getstatic burp/Zou.PAYLOAD_POSITION : Lburp/Zou;
    //   138: getfield key : Ljava/lang/String;
    //   141: aload #8
    //   143: invokeinterface ZY : (Ljava/lang/String;[B)V
    //   148: iinc #7, 1
    //   151: iload_2
    //   152: ifeq -> 120
    //   155: iconst_4
    //   156: anewarray burp/Zbqc
    //   159: invokestatic Zr : ([Lburp/Zbqc;)V
    //   162: aload_1
    //   163: getstatic burp/Zou.ATTACK_TYPE : Lburp/Zou;
    //   166: getfield key : Ljava/lang/String;
    //   169: aload_0
    //   170: invokeinterface ZPa : ()Lburp/Zejb;
    //   175: getfield persistedId : B
    //   178: invokeinterface Zb : (Ljava/lang/String;I)V
    //   183: aload_0
    //   184: invokeinterface ZPJ : ()Lburp/Zstu;
    //   189: aload_0
    //   190: invokeinterface ZPq : ()Lburp/Zrte;
    //   195: invokestatic Z_ : (Lburp/Zstu;Lburp/Zrte;)I
    //   198: istore #4
    //   200: aload_1
    //   201: getstatic burp/Zou.NUMBER_OF_POSITIONS : Lburp/Zou;
    //   204: getfield key : Ljava/lang/String;
    //   207: iload #4
    //   209: invokeinterface Zb : (Ljava/lang/String;I)V
    //   214: aload_0
    //   215: invokeinterface ZPq : ()Lburp/Zrte;
    //   220: invokeinterface iterator : ()Ljava/util/Iterator;
    //   225: astore #5
    //   227: aload #5
    //   229: invokeinterface hasNext : ()Z
    //   234: ifeq -> 306
    //   237: aload #5
    //   239: invokeinterface next : ()Ljava/lang/Object;
    //   244: checkcast burp/Ze9k
    //   247: astore #6
    //   249: aload #6
    //   251: ifnonnull -> 281
    //   254: aload_1
    //   255: getstatic burp/Zou.MISSING_PAYLOAD_SOURCE : Lburp/Zou;
    //   258: getfield key : Ljava/lang/String;
    //   261: aconst_null
    //   262: checkcast [B
    //   265: invokeinterface ZY : (Ljava/lang/String;[B)V
    //   270: iload_2
    //   271: ifeq -> 302
    //   274: goto -> 281
    //   277: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   280: athrow
    //   281: aload_1
    //   282: getstatic burp/Zou.PAYLOAD_SOURCE : Lburp/Zou;
    //   285: getfield key : Ljava/lang/String;
    //   288: aload #6
    //   290: invokeinterface ZX : (Ljava/lang/String;Lburp/Zk5_;)V
    //   295: goto -> 302
    //   298: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   301: athrow
    //   302: iload_2
    //   303: ifeq -> 227
    //   306: aload_1
    //   307: getstatic burp/Zou.USING_RECURSIVE_GREP_PAYLOAD_SOURCE : Lburp/Zou;
    //   310: getfield key : Ljava/lang/String;
    //   313: aload_0
    //   314: invokeinterface ZP0 : ()Z
    //   319: invokeinterface Zk : (Ljava/lang/String;Z)V
    //   324: aload_1
    //   325: getstatic burp/Zou.UPDATE_CONTENT_LENGTH : Lburp/Zou;
    //   328: getfield key : Ljava/lang/String;
    //   331: aload_0
    //   332: invokeinterface ZPx : ()Z
    //   337: invokeinterface Zk : (Ljava/lang/String;Z)V
    //   342: aload_1
    //   343: getstatic burp/Zou.SET_CONNECTION_CLOSE : Lburp/Zou;
    //   346: getfield key : Ljava/lang/String;
    //   349: iconst_0
    //   350: invokeinterface Zk : (Ljava/lang/String;Z)V
    //   355: aload_1
    //   356: getstatic burp/Zou.NUMBER_OF_THREADS : Lburp/Zou;
    //   359: getfield key : Ljava/lang/String;
    //   362: iconst_0
    //   363: invokeinterface Zb : (Ljava/lang/String;I)V
    //   368: aload_1
    //   369: getstatic burp/Zou.NUMBER_OF_RETRIES : Lburp/Zou;
    //   372: getfield key : Ljava/lang/String;
    //   375: aload_0
    //   376: invokeinterface ZPD : ()I
    //   381: invokeinterface Zb : (Ljava/lang/String;I)V
    //   386: aload_1
    //   387: getstatic burp/Zou.RETRY_PAUSE_DURATION : Lburp/Zou;
    //   390: getfield key : Ljava/lang/String;
    //   393: aload_0
    //   394: invokeinterface ZPP : ()I
    //   399: invokeinterface Zb : (Ljava/lang/String;I)V
    //   404: aload_1
    //   405: getstatic burp/Zou.THROTTLE_START_DURATION : Lburp/Zou;
    //   408: getfield key : Ljava/lang/String;
    //   411: lconst_0
    //   412: invokeinterface ZE : (Ljava/lang/String;J)V
    //   417: aload_1
    //   418: getstatic burp/Zou.THROTTLE_STEP_DURATION : Lburp/Zou;
    //   421: getfield key : Ljava/lang/String;
    //   424: lconst_0
    //   425: invokeinterface ZE : (Ljava/lang/String;J)V
    //   430: aload_1
    //   431: getstatic burp/Zou.START_PAUSED : Lburp/Zou;
    //   434: getfield key : Ljava/lang/String;
    //   437: iconst_0
    //   438: invokeinterface Zk : (Ljava/lang/String;Z)V
    //   443: aload_1
    //   444: getstatic burp/Zou.START_DELAY_DURATION : Lburp/Zou;
    //   447: getfield key : Ljava/lang/String;
    //   450: lconst_0
    //   451: invokeinterface ZE : (Ljava/lang/String;J)V
    //   456: aload_1
    //   457: getstatic burp/Zou.STORE_REQUESTS : Lburp/Zou;
    //   460: getfield key : Ljava/lang/String;
    //   463: aload_0
    //   464: invokeinterface ZPu : ()Z
    //   469: invokeinterface Zk : (Ljava/lang/String;Z)V
    //   474: aload_1
    //   475: getstatic burp/Zou.STORE_RESPONSES : Lburp/Zou;
    //   478: getfield key : Ljava/lang/String;
    //   481: aload_0
    //   482: invokeinterface ZP8 : ()Z
    //   487: invokeinterface Zk : (Ljava/lang/String;Z)V
    //   492: aload_1
    //   493: getstatic burp/Zou.DOS_MODE_ENABLED : Lburp/Zou;
    //   496: getfield key : Ljava/lang/String;
    //   499: aload_0
    //   500: invokeinterface ZPn : ()Z
    //   505: invokeinterface Zk : (Ljava/lang/String;Z)V
    //   510: aload_1
    //   511: getstatic burp/Zou.STORE_PAYLOADS : Lburp/Zou;
    //   514: getfield key : Ljava/lang/String;
    //   517: aload_0
    //   518: invokeinterface ZPh : ()Z
    //   523: invokeinterface Zk : (Ljava/lang/String;Z)V
    //   528: aload_1
    //   529: getstatic burp/Zou.MAKE_BASELINE_REQUEST : Lburp/Zou;
    //   532: getfield key : Ljava/lang/String;
    //   535: aload_0
    //   536: invokeinterface ZPs : ()Z
    //   541: invokeinterface Zk : (Ljava/lang/String;Z)V
    //   546: aload_0
    //   547: invokeinterface ZP_ : ()Lburp/Zz4g;
    //   552: ifnull -> 580
    //   555: aload_1
    //   556: getstatic burp/Zou.GREP_CONFIGURATION : Lburp/Zou;
    //   559: getfield key : Ljava/lang/String;
    //   562: aload_0
    //   563: invokeinterface ZP_ : ()Lburp/Zz4g;
    //   568: invokeinterface ZX : (Ljava/lang/String;Lburp/Zk5_;)V
    //   573: goto -> 580
    //   576: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   579: athrow
    //   580: aload_1
    //   581: getstatic burp/Zou.REDIRECTION_OPTION : Lburp/Zou;
    //   584: getfield key : Ljava/lang/String;
    //   587: aload_0
    //   588: invokeinterface ZPM : ()Lburp/Zmae;
    //   593: getfield id : B
    //   596: invokeinterface Zb : (Ljava/lang/String;I)V
    //   601: aload_1
    //   602: getstatic burp/Zou.PROCESS_COOKIES_IN_REDIRECTS : Lburp/Zou;
    //   605: getfield key : Ljava/lang/String;
    //   608: aload_0
    //   609: invokeinterface ZPj : ()Z
    //   614: invokeinterface Zk : (Ljava/lang/String;Z)V
    //   619: aload_0
    //   620: invokeinterface ZPR : ()Lburp/Zzwo;
    //   625: astore #5
    //   627: aload #5
    //   629: invokeinterface ZlW : ()Ljava/util/Set;
    //   634: invokeinterface iterator : ()Ljava/util/Iterator;
    //   639: astore #6
    //   641: aload #6
    //   643: invokeinterface hasNext : ()Z
    //   648: ifeq -> 715
    //   651: aload #6
    //   653: invokeinterface next : ()Ljava/lang/Object;
    //   658: checkcast burp/Zsdr
    //   661: astore #7
    //   663: aload_1
    //   664: getstatic burp/Zou.USER_INTERFACE_DETAIL_KEY : Lburp/Zou;
    //   667: getfield key : Ljava/lang/String;
    //   670: aload #7
    //   672: invokeinterface toString : ()Ljava/lang/String;
    //   677: invokeinterface ZL : (Ljava/lang/String;Ljava/lang/String;)V
    //   682: aload_1
    //   683: getstatic burp/Zou.USER_INTERFACE_DETAIL_VALUE : Lburp/Zou;
    //   686: getfield key : Ljava/lang/String;
    //   689: aload #5
    //   691: aload #7
    //   693: invokeinterface Zd : (Ljava/lang/Object;)Lburp/Zgpi;
    //   698: checkcast burp/Zsdr
    //   701: invokeinterface toString : ()Ljava/lang/String;
    //   706: invokeinterface ZL : (Ljava/lang/String;Ljava/lang/String;)V
    //   711: iload_2
    //   712: ifeq -> 641
    //   715: aload_1
    //   716: invokestatic Za : (Lburp/Zs4f;)V
    //   719: aload_1
    //   720: getstatic burp/Zou.SAVE_ATTACK_TO_PROJECT_FILE : Lburp/Zou;
    //   723: aload_0
    //   724: invokeinterface ZPQ : ()Z
    //   729: invokestatic ZJ : (Lburp/Zs4f;Lburp/Zou;Z)V
    //   732: aload_1
    //   733: getstatic burp/Zou.RAW_TARGET_TEMPLATE : Lburp/Zou;
    //   736: aload_0
    //   737: invokeinterface ZPE : ()Lburp/Zxpp;
    //   742: invokeinterface ZwZ : ()Lburp/Zstu;
    //   747: invokestatic Zy : (Lburp/Zs4f;Lburp/Zou;Lburp/Zstu;)V
    //   750: aload_1
    //   751: getstatic burp/Zou.UPDATE_HOST_HEADER_TO_MATCH_TARGET : Lburp/Zou;
    //   754: aload_0
    //   755: invokeinterface ZPE : ()Lburp/Zxpp;
    //   760: invokeinterface ZwB : ()Z
    //   765: invokestatic ZJ : (Lburp/Zs4f;Lburp/Zou;Z)V
    //   768: aload_1
    //   769: getstatic burp/Zou.SET_CONNECTION_HEADER : Lburp/Zou;
    //   772: aload_0
    //   773: invokeinterface ZP5 : ()Z
    //   778: invokestatic ZJ : (Lburp/Zs4f;Lburp/Zou;Z)V
    //   781: aload_1
    //   782: getstatic burp/Zou.OVERRIDE_HTTP_VERSION_SETTING : Lburp/Zou;
    //   785: aload_0
    //   786: invokeinterface ZPY : ()Lburp/Zsh0;
    //   791: invokeinterface Zjo : ()Z
    //   796: invokestatic ZJ : (Lburp/Zs4f;Lburp/Zou;Z)V
    //   799: aload_1
    //   800: getstatic burp/Zou.DEFAULT_HTTP2_IF_SUPPORTED : Lburp/Zou;
    //   803: aload_0
    //   804: invokeinterface ZPY : ()Lburp/Zsh0;
    //   809: invokeinterface Zj7 : ()Z
    //   814: invokestatic ZJ : (Lburp/Zs4f;Lburp/Zou;Z)V
    //   817: aload_1
    //   818: getstatic burp/Zou.OVERRIDE_HTTP1_KEEP_ALIVE_SETTING : Lburp/Zou;
    //   821: aload_0
    //   822: invokeinterface ZPH : ()Lburp/Zrp;
    //   827: invokeinterface ZJG : ()Z
    //   832: invokestatic ZJ : (Lburp/Zs4f;Lburp/Zou;Z)V
    //   835: aload_1
    //   836: getstatic burp/Zou.HTTP1_KEEP_ALIVE_IF_SUPPORTED : Lburp/Zou;
    //   839: aload_0
    //   840: invokeinterface ZPH : ()Lburp/Zrp;
    //   845: invokeinterface ZJ6 : ()Z
    //   850: invokestatic ZJ : (Lburp/Zs4f;Lburp/Zou;Z)V
    //   853: return
    // Exception table:
    //   from	to	target	type
    //   39	58	61	java/io/IOException
    //   249	274	277	java/io/IOException
    //   254	295	298	java/io/IOException
    //   306	573	576	java/io/IOException
  }
  
  private static void ZJ(Zs4f paramZs4f, Zou paramZou, boolean paramBoolean) throws IOException {
    ZU(paramZs4f, paramZou, String.valueOf(paramBoolean));
  }
  
  private static void Zy(Zs4f paramZs4f, Zou paramZou, Zstu paramZstu) throws IOException {
    try {
      if (paramZstu != null)
        ZU(paramZs4f, paramZou, paramZstu.Zis()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private static void ZU(Zs4f paramZs4f, Zou paramZou, String paramString) throws IOException {
    paramZs4f.ZL(Zou.USER_INTERFACE_DETAIL_KEY.key, paramZou.key);
    paramZs4f.ZL(Zou.USER_INTERFACE_DETAIL_VALUE.key, paramString);
  }
  
  private static void Za(Zs4f paramZs4f) throws IOException {
    Zxoe[] arrayOfZxoe = Zxoe.values();
    int j = arrayOfZxoe.length;
    int i = Zxw4.Zt();
    byte b = 0;
    while (b < j) {
      Zxoe zxoe = arrayOfZxoe[b];
      paramZs4f.ZL(Zou.USER_INTERFACE_DETAIL_KEY.key, zxoe.ZW);
      paramZs4f.ZL(Zou.USER_INTERFACE_DETAIL_VALUE.key, zxoe.Zo);
      b++;
      if (i != 0)
        break; 
    } 
  }
  
  static boolean ZQ(Zsh8 paramZsh8, Zr_4 paramZr_4, Zrdu paramZrdu, String paramString, Zgxp paramZgxp) {
    int i = Zxw4.Zt();
    byte[][] arrayOfByte = Zz96.Zd(paramZsh8.ZPJ().ZiD());
    if (arrayOfByte.length == 1)
      return true; 
    int j = Zz96.Z_(paramZsh8.ZPJ(), paramZsh8.ZPq());
    if (paramZsh8.ZPe() == null) {
      paramZsh8.Zc(paramZr_4.<Zrte<Zefg<Zt8g>>>Zv(new Zguz<>(new Zl_p<>(Zt8g.ZG)), j));
      byte[] arrayOfByte1 = Zz96.ZA(paramZsh8.ZPJ().ZiD());
      Zz1p zz1p = Zekx.Zu(null, arrayOfByte1, (byte)2, new Zbnt(paramZr_4));
      int k = 0;
      byte b = 0;
      while (b < j) {
        k += (arrayOfByte[b * 2]).length;
        int m = k;
        k += (arrayOfByte[b * 2 + 1]).length;
        int n = k;
        paramZsh8.ZPe().ZU(b, Zkk.Zx(paramZr_4, Zt8g.ZG, Zznj.ZP(zz1p.ZV, m, n)));
        b++;
        if (i != 0)
          break; 
      } 
    } 
    short s = paramZgxp.Zer();
    if (s != -1) {
      if (paramZsh8.ZPa() == Zejb.SNIPER)
        return !Zznj.ZY(paramZsh8.ZPe().ZdF(s), paramZrdu, paramString); 
      byte b = 0;
      while (b < j) {
        if (Zznj.ZY(paramZsh8.ZPe().ZdF(b), paramZrdu, paramString))
          return false; 
        b++;
        if (i != 0)
          break; 
      } 
    } 
    return true;
  }
  
  static void Zb(Zsh8 paramZsh8) throws Ztku {
    int i = Zxw4.Zt();
    for (Ze9k ze9k : paramZsh8.ZPq()) {
      try {
        if (ze9k != null)
          ze9k.ZiB().Zy4(); 
      } catch (Ztku ztku) {
        throw a(null);
      } 
      if (i != 0)
        break; 
    } 
  }
  
  static void ZG(Zsh8 paramZsh8) {
    Ztcg ztcg = new Ztcg(paramZsh8);
    ztcg.ZE();
  }
  
  static String Zw(Zzwo<Zsdr, Zsdr> paramZzwo, String paramString) {
    if (paramZzwo == null)
      return null; 
    Zsdr zsdr1 = paramZzwo.ZlW().stream().filter(paramString::lambda$getUiDetail$0).findFirst().orElse(null);
    if (zsdr1 == null)
      return null; 
    Zsdr zsdr2 = paramZzwo.Zd(zsdr1);
    return (zsdr2 == null) ? null : zsdr2.toString();
  }
  
  static boolean Zk(Zsh8 paramZsh8) {
    int i = Zxw4.Zt();
    for (Ze9k ze9k : paramZsh8.ZPq()) {
      if (ze9k.ZyP())
        return true; 
      if (i != 0)
        break; 
    } 
    return false;
  }
  
  private static boolean lambda$getUiDetail$0(String paramString, Zsdr paramZsdr) {
    return paramZsdr.toString().equals(paramString);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzeb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */