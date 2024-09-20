package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zrzt;

public class Zks {
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zp(List<Ztpb> paramList, Zbnt paramZbnt, Zr_4 paramZr_4) {
    byte[] arrayOfByte1 = null;
    byte[] arrayOfByte2 = null;
    Zz1p zz1p = null;
    Zs68 zs68 = null;
    String[] arrayOfString = Zlil.Za();
    synchronized (paramList) {
      byte b = 0;
      while (b < paramList.size()) {
        Ztpb ztpb = paramList.get(b);
        Zstu zstu1 = ztpb.Zp();
        Zstu zstu2 = ztpb.ZD();
        Zz1p zz1p1 = Zghc.ZY(ztpb.ZP().Zdz(), zstu1, (byte)3, paramZbnt);
        Zs68 zs681 = (zstu2 == null) ? null : Zbwc.ZS(zz1p1, zstu2, Zt0k.HTML_ANALYSIS, paramZbnt);
        List<Zt8g> list1 = (List)zz1p1.ZV.stream().filter(Zks::lambda$analyseMacroItems$0).collect(Collectors.toList());
        zz1p1 = Ztvi.ZA(zz1p1).ZB(list1).Zi();
        Zd(zs681, ztpb);
        List<Zt8g> list2 = ZH(zz1p1, arrayOfByte1, arrayOfByte2, zz1p, zs68, paramZbnt, paramZr_4);
        Zp(zz1p1, list2, ztpb, b, paramZr_4);
        ztpb.ZI();
        arrayOfByte1 = zstu1.ZiD();
        arrayOfByte2 = (zstu2 == null) ? null : zstu2.ZiD();
        zz1p = zz1p1;
        zs68 = zs681;
        b++;
        if (arrayOfString == null)
          break; 
      } 
    } 
  }
  
  private static void Zd(Zs68 paramZs68, Ztpb paramZtpb) {
    if (paramZs68 != null && !paramZs68.ZN.isEmpty())
      paramZtpb.Za(paramZs68.ZN); 
  }
  
  private static List<Zt8g> ZH(Zz1p paramZz1p1, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zz1p paramZz1p2, Zs68 paramZs68, Zbnt paramZbnt, Zr_4 paramZr_4) {
    ArrayList<Zt8g> arrayList = null;
    if (paramArrayOfbyte2 != null) {
      arrayList = new ArrayList();
      ArrayList<Zt8g> arrayList1 = new ArrayList();
      ZQ(paramArrayOfbyte1, paramZz1p2, paramArrayOfbyte2, paramZs68, paramZz1p1, arrayList, arrayList1, paramZbnt);
      Zd(paramZs68, paramZz1p1, arrayList, arrayList1, paramZr_4);
      Zu(paramZz1p2, paramZs68, paramZz1p1, arrayList, arrayList1, paramZbnt);
      Zm(arrayList, arrayList1);
    } 
    return arrayList;
  }
  
  private static void Zp(Zz1p paramZz1p, List<Zt8g> paramList, Ztpb paramZtpb, int paramInt, Zr_4 paramZr_4) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual Zo : ()V
    //   4: invokestatic Za : ()[Ljava/lang/String;
    //   7: aload_0
    //   8: getfield ZV : Ljava/util/List;
    //   11: invokeinterface iterator : ()Ljava/util/Iterator;
    //   16: astore #6
    //   18: astore #5
    //   20: aload #6
    //   22: invokeinterface hasNext : ()Z
    //   27: ifeq -> 163
    //   30: aload #6
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast burp/Zt8g
    //   40: astore #7
    //   42: aload #4
    //   44: aload #7
    //   46: invokeinterface Zo : (Lburp/Zg35;)Lburp/Zg35;
    //   51: checkcast burp/Zt8g
    //   54: astore #8
    //   56: aload_1
    //   57: aload #7
    //   59: invokestatic ZH : (Ljava/util/List;Lburp/Zt8g;)Z
    //   62: ifeq -> 114
    //   65: aload #4
    //   67: new burp/Zg9w
    //   70: dup
    //   71: aload #8
    //   73: iconst_0
    //   74: invokespecial <init> : (Lburp/Zt8g;B)V
    //   77: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   82: checkcast burp/Zmfi
    //   85: astore #9
    //   87: aload #9
    //   89: iload_3
    //   90: iconst_1
    //   91: isub
    //   92: invokeinterface Zur : (I)V
    //   97: aload_2
    //   98: invokevirtual Zs : ()Lburp/Zefg;
    //   101: aload #9
    //   103: invokeinterface add : (Ljava/lang/Object;)Z
    //   108: pop
    //   109: aload #5
    //   111: ifnonnull -> 158
    //   114: aload #4
    //   116: new burp/Zg9w
    //   119: dup
    //   120: aload #8
    //   122: iconst_1
    //   123: invokespecial <init> : (Lburp/Zt8g;B)V
    //   126: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   131: checkcast burp/Zmfi
    //   134: astore #9
    //   136: aload #9
    //   138: iload_3
    //   139: iconst_1
    //   140: isub
    //   141: invokeinterface Zur : (I)V
    //   146: aload_2
    //   147: invokevirtual Zs : ()Lburp/Zefg;
    //   150: aload #9
    //   152: invokeinterface add : (Ljava/lang/Object;)Z
    //   157: pop
    //   158: aload #5
    //   160: ifnonnull -> 20
    //   163: return
  }
  
  private static void ZQ(byte[] paramArrayOfbyte1, Zz1p paramZz1p1, byte[] paramArrayOfbyte2, Zs68 paramZs68, Zz1p paramZz1p2, List<Zt8g> paramList1, List<Zt8g> paramList2, Zbnt paramZbnt) {
    if (a(5935, -25136).equalsIgnoreCase(paramZz1p2.Zb)) {
      Zs0d zs0d = Zb2q.ZO(paramZz1p1.Zo.Zdz(), paramArrayOfbyte1, paramArrayOfbyte2, paramZs68.ZP, paramZs68.Zk, paramZs68.Zb, 31, paramZbnt);
      Zlit zlit = (zs0d == null) ? null : zs0d.ZM();
      if (zlit != null && Zmg3.ZK(zlit, paramZz1p2.Zo)) {
        byte[] arrayOfByte = zlit.ZdC();
        if (arrayOfByte != null) {
          List<Zt8g> list = Zznx.Zm(Zrdu.URL_PARAM, arrayOfByte, 0, arrayOfByte.length, Zsba.URL_ENCODED, null);
          Zo(list, paramZz1p2.ZV, paramList1, paramList2);
        } 
      } 
    } 
  }
  
  private static void Zd(Zs68 paramZs68, Zz1p paramZz1p, List<Zt8g> paramList1, List<Zt8g> paramList2, Zr_4 paramZr_4) {
    String[] arrayOfString = Zlil.Za();
    if (paramZs68.ZQ != null)
      for (Zx8_ zx8_ : paramZs68.ZQ) {
        if ((zx8_.ZZT() == 0 && !a(5935, -25136).equalsIgnoreCase(paramZz1p.Zb)) || (zx8_.ZZT() == 1 && !a(5934, -25058).equalsIgnoreCase(paramZz1p.Zb)) || !Zmg3.ZK(zx8_.ZZa(), paramZz1p.Zo))
          continue; 
        if (zx8_.ZZT() == 1) {
          byte[] arrayOfByte = zx8_.ZZa().ZdC();
          if (arrayOfByte != null) {
            List<Zt8g> list1 = Zznx.Zm(Zrdu.URL_PARAM, arrayOfByte, 0, arrayOfByte.length, Zsba.URL_ENCODED, null);
            Zo(list1, paramZz1p.ZV, paramList1, paramList2);
          } 
        } 
        List<Zt8g> list = Zh(zx8_, paramZr_4);
        Zo(list, paramZz1p.ZV, paramList1, paramList2);
        if (arrayOfString == null)
          break; 
      }  
  }
  
  private static List<Zt8g> Zh(Zx8_ paramZx8_, Zr_4 paramZr_4) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic Za : ()[Ljava/lang/String;
    //   11: aload_0
    //   12: invokeinterface ZZp : ()Lburp/Zefg;
    //   17: invokeinterface iterator : ()Ljava/util/Iterator;
    //   22: astore #4
    //   24: astore_2
    //   25: aload #4
    //   27: invokeinterface hasNext : ()Z
    //   32: ifeq -> 140
    //   35: aload #4
    //   37: invokeinterface next : ()Ljava/lang/Object;
    //   42: checkcast burp/Zmwr
    //   45: astore #5
    //   47: aload_0
    //   48: invokeinterface ZZT : ()B
    //   53: ifne -> 65
    //   56: getstatic burp/Zrdu.URL_PARAM : Lburp/Zrdu;
    //   59: astore #6
    //   61: aload_2
    //   62: ifnonnull -> 89
    //   65: aload_0
    //   66: invokeinterface ZZ7 : ()B
    //   71: iconst_1
    //   72: if_icmpne -> 84
    //   75: getstatic burp/Zrdu.BODY_PARAM_MULTIPART : Lburp/Zrdu;
    //   78: astore #6
    //   80: aload_2
    //   81: ifnonnull -> 89
    //   84: getstatic burp/Zrdu.BODY_PARAM_URL_ENCODED : Lburp/Zrdu;
    //   87: astore #6
    //   89: aload_1
    //   90: new burp/Ztoe
    //   93: dup
    //   94: aload #6
    //   96: aload #5
    //   98: invokeinterface Zh4 : ()Ljava/lang/String;
    //   103: aload #5
    //   105: invokeinterface Zh1 : ()Ljava/lang/String;
    //   110: iconst_0
    //   111: iconst_0
    //   112: iconst_0
    //   113: iconst_0
    //   114: invokespecial <init> : (Lburp/Zrdu;Ljava/lang/String;Ljava/lang/String;IIII)V
    //   117: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   122: checkcast burp/Zt8g
    //   125: astore #7
    //   127: aload_3
    //   128: aload #7
    //   130: invokeinterface add : (Ljava/lang/Object;)Z
    //   135: pop
    //   136: aload_2
    //   137: ifnonnull -> 25
    //   140: aload_3
    //   141: areturn
  }
  
  private static void Zu(Zz1p paramZz1p1, Zs68 paramZs68, Zz1p paramZz1p2, List<Zt8g> paramList1, List<Zt8g> paramList2, Zbnt paramZbnt) {
    String[] arrayOfString = Zlil.Za();
    if (paramZs68.Zd != null)
      for (Zsq8 zsq8 : Zx6a.ZB(paramZz1p1, paramZs68, paramZbnt)) {
        if (!a(5935, -25136).equalsIgnoreCase(paramZz1p2.Zb) || !Zmg3.ZK(zsq8.ZZ, paramZz1p2.Zo))
          continue; 
        byte[] arrayOfByte = zsq8.ZZ.ZdC();
        if (arrayOfByte != null) {
          List<Zt8g> list = Zznx.Zm(Zrdu.URL_PARAM, arrayOfByte, 0, arrayOfByte.length, Zsba.URL_ENCODED, null);
          Zo(list, paramZz1p2.ZV, paramList1, paramList2);
        } 
        if (arrayOfString == null)
          break; 
      }  
  }
  
  private static void Zm(List<Zt8g> paramList1, List<Zt8g> paramList2) {
    ArrayList<Zt8g> arrayList = new ArrayList();
    Iterator<Zt8g> iterator = paramList1.iterator();
    String[] arrayOfString = Zlil.Za();
    label24: while (iterator.hasNext()) {
      Zt8g zt8g = iterator.next();
      for (Zt8g zt8g1 : paramList2) {
        if (zt8g1.Zns().equals(zt8g.Zns())) {
          iterator.remove();
          if (arrayOfString == null)
            continue; 
          continue label24;
        } 
        continue;
        if (arrayOfString == null)
          break; 
      } 
      for (Zt8g zt8g1 : arrayList) {
        if (zt8g1.Zns().equals(zt8g.Zns())) {
          iterator.remove();
          if (arrayOfString == null)
            continue; 
          continue label24;
        } 
        continue;
        if (arrayOfString == null)
          break; 
      } 
      arrayList.add(zt8g);
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private static boolean ZH(List<Zt8g> paramList, Zt8g paramZt8g) {
    String[] arrayOfString = Zlil.Za();
    if (paramList != null)
      for (Zt8g zt8g : paramList) {
        if (paramZt8g.Zns() != null && (paramZt8g.Zns().equals(zt8g.Zns()) || paramZt8g.Zns().equals(Zrzt.ZJ(zt8g.Zns())) || Zrzt.ZJ(paramZt8g.Zns()).equals(zt8g.Zns())))
          return true; 
        if (arrayOfString == null)
          break; 
      }  
    return false;
  }
  
  private static void Zo(List<Zt8g> paramList1, List<Zt8g> paramList2, List<Zt8g> paramList3, List<Zt8g> paramList4) {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: invokeinterface iterator : ()Ljava/util/Iterator;
    //   11: astore #5
    //   13: aload #5
    //   15: invokeinterface hasNext : ()Z
    //   20: ifeq -> 204
    //   23: aload #5
    //   25: invokeinterface next : ()Ljava/lang/Object;
    //   30: checkcast burp/Zt8g
    //   33: astore #6
    //   35: aload_1
    //   36: invokeinterface iterator : ()Ljava/util/Iterator;
    //   41: astore #7
    //   43: aload #7
    //   45: invokeinterface hasNext : ()Z
    //   50: ifeq -> 199
    //   53: aload #7
    //   55: invokeinterface next : ()Ljava/lang/Object;
    //   60: checkcast burp/Zt8g
    //   63: astore #8
    //   65: aload #6
    //   67: invokeinterface Zns : ()Ljava/lang/String;
    //   72: ifnull -> 194
    //   75: aload #6
    //   77: invokeinterface Zns : ()Ljava/lang/String;
    //   82: aload #8
    //   84: invokeinterface Zns : ()Ljava/lang/String;
    //   89: invokevirtual equals : (Ljava/lang/Object;)Z
    //   92: ifne -> 118
    //   95: aload #6
    //   97: invokeinterface Zns : ()Ljava/lang/String;
    //   102: aload #8
    //   104: invokeinterface Zns : ()Ljava/lang/String;
    //   109: invokestatic ZJ : (Ljava/lang/String;)Ljava/lang/String;
    //   112: invokevirtual equals : (Ljava/lang/Object;)Z
    //   115: ifeq -> 194
    //   118: aload #6
    //   120: invokeinterface Zbn : ()Ljava/lang/String;
    //   125: ifnull -> 185
    //   128: aload #6
    //   130: invokeinterface Zbn : ()Ljava/lang/String;
    //   135: aload #8
    //   137: invokeinterface Zbn : ()Ljava/lang/String;
    //   142: invokevirtual equals : (Ljava/lang/Object;)Z
    //   145: ifne -> 171
    //   148: aload #6
    //   150: invokeinterface Zbn : ()Ljava/lang/String;
    //   155: aload #8
    //   157: invokeinterface Zbn : ()Ljava/lang/String;
    //   162: invokestatic ZJ : (Ljava/lang/String;)Ljava/lang/String;
    //   165: invokevirtual equals : (Ljava/lang/Object;)Z
    //   168: ifeq -> 185
    //   171: aload_2
    //   172: aload #6
    //   174: invokeinterface add : (Ljava/lang/Object;)Z
    //   179: pop
    //   180: aload #4
    //   182: ifnonnull -> 194
    //   185: aload_3
    //   186: aload #6
    //   188: invokeinterface add : (Ljava/lang/Object;)Z
    //   193: pop
    //   194: aload #4
    //   196: ifnonnull -> 43
    //   199: aload #4
    //   201: ifnonnull -> 13
    //   204: return
  }
  
  public static String ZN(byte[] paramArrayOfbyte1, Zlit paramZlit1, byte[] paramArrayOfbyte2, Zs68 paramZs68, String paramString1, Zlit paramZlit2, Zefg<Zmo2> paramZefg, String paramString2, Zrdu paramZrdu, boolean paramBoolean, Zbnt paramZbnt, Zr_4 paramZr_4) {
    String str = Zw(paramString2, paramZefg, paramArrayOfbyte2, paramZs68, true);
    if (str != null)
      return str; 
    str = Zy(paramString2, paramZrdu, paramArrayOfbyte1, paramArrayOfbyte2, paramZs68, paramBoolean, paramZbnt, paramZlit1, paramString1, paramZlit2);
    if (str != null)
      return str; 
    str = ZJ(paramString2, paramZrdu, paramZs68, paramBoolean, paramZr_4, paramString1, paramZlit2);
    if (str != null)
      return str; 
    str = Zw(paramString2, paramZrdu, paramZs68, paramBoolean, paramZbnt, paramZlit1, paramString1, paramZlit2);
    return (str != null) ? str : null;
  }
  
  public static String Zw(String paramString, Zefg<Zmo2> paramZefg, byte[] paramArrayOfbyte, Zs68 paramZs68, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 8
    //   4: aconst_null
    //   5: goto -> 81
    //   8: aload_1
    //   9: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   14: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   19: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   24: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   29: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   34: iload #4
    //   36: aload_0
    //   37: <illegal opcode> test : (ZLjava/lang/String;)Ljava/util/function/Predicate;
    //   42: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   47: aload_2
    //   48: aload_3
    //   49: <illegal opcode> apply : ([BLburp/Zs68;)Ljava/util/function/Function;
    //   54: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   59: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   64: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   69: invokeinterface findFirst : ()Ljava/util/Optional;
    //   74: aconst_null
    //   75: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   78: checkcast java/lang/String
    //   81: areturn
  }
  
  private static String Ze(Zmo2 paramZmo2, byte[] paramArrayOfbyte, Zs68 paramZs68) {
    try {
      String str = paramZmo2.ZE(paramArrayOfbyte, paramZs68);
      try {
        if (str != null) {
          try {
          
          } catch (Exception exception) {
            throw a(null);
          } 
          String str1 = (paramZmo2.Zun() == null) ? "" : paramZmo2.Zun();
          try {
          
          } catch (Exception exception) {
            throw a(null);
          } 
          String str2 = (paramZmo2.Zu0() == null) ? "" : paramZmo2.Zu0();
          return str1 + str1 + str;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return null;
  }
  
  private static String Zy(String paramString1, Zrdu paramZrdu, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zs68 paramZs68, boolean paramBoolean, Zbnt paramZbnt, Zlit paramZlit1, String paramString2, Zlit paramZlit2) {
    if (paramBoolean || a(5935, -25136).equalsIgnoreCase(paramString2)) {
      Zs0d zs0d = Zb2q.ZO(paramZlit1.Zdz(), paramArrayOfbyte1, paramArrayOfbyte2, paramZs68.ZP, paramZs68.Zk, paramZs68.Zb, 31, paramZbnt);
      Zlit zlit = (zs0d == null) ? null : zs0d.ZM();
      if (zlit != null && (paramBoolean || Zmg3.ZK(zlit, paramZlit2))) {
        byte[] arrayOfByte = zlit.ZdC();
        if (arrayOfByte != null) {
          List<Zt8g> list = Zznx.Zm(Zrdu.URL_PARAM, arrayOfByte, 0, arrayOfByte.length, Zsba.URL_ENCODED, null);
          String str = Z_(paramString1, paramZrdu, list, paramBoolean);
          if (str != null)
            return Zrzt.ZJ(str); 
        } 
      } 
    } 
    return null;
  }
  
  private static String ZJ(String paramString1, Zrdu paramZrdu, Zs68 paramZs68, boolean paramBoolean, Zr_4 paramZr_4, String paramString2, Zlit paramZlit) {
    String[] arrayOfString = Zlil.Za();
    if (paramZs68.ZQ != null)
      for (Zx8_ zx8_ : paramZs68.ZQ) {
        if ((!paramBoolean && zx8_.ZZT() == 0 && !a(5935, -25136).equalsIgnoreCase(paramString2)) || (!paramBoolean && !Zmg3.ZK(zx8_.ZZa(), paramZlit)))
          continue; 
        byte[] arrayOfByte = zx8_.ZZa().ZdC();
        if (arrayOfByte != null) {
          List<Zt8g> list1 = Zznx.Zm(Zrdu.URL_PARAM, arrayOfByte, 0, arrayOfByte.length, Zsba.URL_ENCODED, null);
          String str1 = Z_(paramString1, paramZrdu, list1, paramBoolean);
          if (str1 != null)
            return Zrzt.ZJ(str1); 
        } 
        List<Zt8g> list = Zh(zx8_, paramZr_4);
        String str = Z_(paramString1, paramZrdu, list, paramBoolean);
        if (str != null)
          return str; 
        if (arrayOfString == null)
          break; 
      }  
    return null;
  }
  
  private static String Zw(String paramString1, Zrdu paramZrdu, Zs68 paramZs68, boolean paramBoolean, Zbnt paramZbnt, Zlit paramZlit1, String paramString2, Zlit paramZlit2) {
    String[] arrayOfString = Zlil.Za();
    if (paramZs68.Zd != null)
      for (Zsq8 zsq8 : Zx6a.Zf(paramZlit1, paramZs68, paramZbnt)) {
        if (!paramBoolean && (!a(5933, 2289).equalsIgnoreCase(paramString2) || !Zmg3.ZK(zsq8.ZZ, paramZlit2)))
          continue; 
        byte[] arrayOfByte = zsq8.ZZ.ZdC();
        if (arrayOfByte != null) {
          List<Zt8g> list = Zznx.Zm(Zrdu.URL_PARAM, arrayOfByte, 0, arrayOfByte.length, Zsba.URL_ENCODED, null);
          String str = Z_(paramString1, paramZrdu, list, paramBoolean);
          if (str != null)
            return Zrzt.ZJ(str); 
        } 
        if (arrayOfString == null)
          break; 
      }  
    return null;
  }
  
  private static String Z_(String paramString, Zrdu paramZrdu, List<Zt8g> paramList, boolean paramBoolean) {
    String[] arrayOfString = Zlil.Za();
    for (Zt8g zt8g : paramList) {
      if (!paramBoolean && zt8g.ZbQ() != paramZrdu)
        continue; 
      if (zt8g.Zns() != null && (zt8g.Zns().equals(paramString) || zt8g.Zns().equals(Zrzt.ZJ(paramString)) || Zrzt.ZJ(zt8g.Zns()).equals(paramString)))
        return zt8g.Zbn(); 
      if (arrayOfString == null)
        break; 
    } 
    return null;
  }
  
  private static String lambda$matchParameterInCustomParameterLocations$3(byte[] paramArrayOfbyte, Zs68 paramZs68, Zmo2 paramZmo2) {
    return Ze(paramZmo2, paramArrayOfbyte, paramZs68);
  }
  
  private static boolean lambda$matchParameterInCustomParameterLocations$2(boolean paramBoolean, String paramString, Zmo2 paramZmo2) {
    return paramBoolean ? paramZmo2.ZuR().equals(paramString) : paramZmo2.ZuR().equalsIgnoreCase(paramString);
  }
  
  private static boolean lambda$matchParameterInCustomParameterLocations$1(Zmo2 paramZmo2) {
    return Zsw8.ZS(paramZmo2.ZuR());
  }
  
  private static boolean lambda$analyseMacroItems$0(Zt8g paramZt8g) {
    return (paramZt8g.ZbQ() == Zrdu.URL_PARAM || paramZt8g.ZbQ() == Zrdu.BODY_PARAM_URL_ENCODED || paramZt8g.ZbQ() == Zrdu.BODY_PARAM_MULTIPART);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '.ç\\rx1î'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_3
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #72
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: aload #5
    //   68: putstatic burp/Zks.a : [Ljava/lang/String;
    //   71: iconst_3
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zks.b : [Ljava/lang/String;
    //   78: goto -> 227
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #19
    //   154: goto -> 184
    //   157: bipush #21
    //   159: goto -> 184
    //   162: bipush #20
    //   164: goto -> 184
    //   167: bipush #127
    //   169: goto -> 184
    //   172: bipush #82
    //   174: goto -> 184
    //   177: bipush #46
    //   179: goto -> 184
    //   182: bipush #65
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 38
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x172F) & 0xFFFF;
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
      byte b1 = 118;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zks.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */