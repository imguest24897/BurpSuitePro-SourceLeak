package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.portswigger.Zkb;
import net.portswigger.Zli;

public class Zeez implements Zehc {
  private static final List<String> Zt;
  
  private final Zbnt ZI;
  
  private final Zz1i ZW;
  
  private final Zz_9 Zi;
  
  private final Ze3n ZJ;
  
  private static int[] ZY;
  
  public Zeez(Zbnt paramZbnt, Zz1i paramZz1i, Zz_9 paramZz_9, Ze3n paramZe3n) {
    this.ZI = paramZbnt;
    int[] arrayOfInt = Zj();
    this.ZW = paramZz1i;
    this.Zi = paramZz_9;
    this.ZJ = paramZe3n;
    if (Zbqc.Zwu() == null)
      Zm(new int[2]); 
  }
  
  public Ztk8 Zb() {
    Zf();
    Zzuq zzuq = this.ZW.ZDT(this.ZJ.ZA().ZF().Zd1());
    List<Zmpm> list = Zc(zzuq);
    int[] arrayOfInt = Zj();
    Zs68 zs68 = this.ZJ.Zp();
    List<Zsq8> list1 = (List<Zsq8>)((zs68 != null && zs68.Zd != null) ? Zx6a.Zf(this.ZJ.ZA().ZF(), zs68, this.ZI) : Collections.emptyList());
    if (Zepo.ZE(list))
      return Ztk8.Zy(ZM(list1, list)); 
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[3]); 
    return Ztk8.Zy(ZR(zzuq, list1));
  }
  
  public Zlcm ZP() {
    return Zlcm.PPR_PasswordReturnedInResponse;
  }
  
  private void Zf() {
    if ((this.ZJ.Zp()).ZQ != null)
      ZQ(); 
  }
  
  private void ZQ() {
    int[] arrayOfInt = Zj();
    for (Zx8_ zx8_ : (this.ZJ.Zp()).ZQ) {
      for (Zmwr zmwr : zx8_.ZZp()) {
        if (zmwr.ZhK() == Zl2w.PASSWORD) {
          Zzuq zzuq = this.ZW.ZDT(zx8_.ZZa().Zd1());
          String str = Zkb.ZG(zx8_.ZZa().Zd4());
          ZL(zzuq, str, zmwr);
        } 
        if (arrayOfInt != null)
          break; 
      } 
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  private void ZL(Zzuq paramZzuq, String paramString, Zmwr paramZmwr) {
    synchronized (paramZzuq.Zh) {
      Map map = paramZzuq.Zh.computeIfAbsent(paramString, Zeez::lambda$storePasswordFieldName$0);
      if (!map.containsKey(paramZmwr.Zh4()))
        map.put(paramZmwr.Zh4(), null); 
    } 
  }
  
  private List<Zmpm> Zc(Zzuq paramZzuq) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic Zj : ()[I
    //   11: aload_1
    //   12: getfield Zh : Ljava/util/Map;
    //   15: dup
    //   16: astore #4
    //   18: monitorenter
    //   19: astore_2
    //   20: aload_0
    //   21: aload_1
    //   22: invokevirtual Zs : (Lburp/Zzuq;)Ljava/util/Map;
    //   25: astore #5
    //   27: aload #5
    //   29: ifnull -> 110
    //   32: aload_0
    //   33: getfield ZJ : Lburp/Ze3n;
    //   36: invokevirtual ZA : ()Lburp/Zefx;
    //   39: invokeinterface Zc : ()Ljava/util/List;
    //   44: invokeinterface iterator : ()Ljava/util/Iterator;
    //   49: astore #6
    //   51: aload #6
    //   53: invokeinterface hasNext : ()Z
    //   58: ifeq -> 110
    //   61: aload #6
    //   63: invokeinterface next : ()Ljava/lang/Object;
    //   68: checkcast burp/Zlou
    //   71: astore #7
    //   73: aload #7
    //   75: getfield Zx : Lburp/Zrdu;
    //   78: getstatic burp/Zrdu.COOKIE : Lburp/Zrdu;
    //   81: if_acmpne -> 87
    //   84: goto -> 51
    //   87: aload #7
    //   89: aload #5
    //   91: invokestatic Zy : (Lburp/Zlou;Ljava/util/Map;)Z
    //   94: ifeq -> 106
    //   97: aload_0
    //   98: aload #7
    //   100: aload #5
    //   102: aload_3
    //   103: invokevirtual Zp : (Lburp/Zlou;Ljava/util/Map;Ljava/util/List;)V
    //   106: aload_2
    //   107: ifnull -> 51
    //   110: aload #4
    //   112: monitorexit
    //   113: goto -> 124
    //   116: astore #8
    //   118: aload #4
    //   120: monitorexit
    //   121: aload #8
    //   123: athrow
    //   124: aload_3
    //   125: areturn
    // Exception table:
    //   from	to	target	type
    //   20	113	116	finally
    //   116	121	116	finally
  }
  
  private Map<String, Zmpm> Zs(Zzuq paramZzuq) {
    String str = Zkb.ZG(this.ZJ.ZA().ZF().Zd4());
    return paramZzuq.Zh.get(str);
  }
  
  private static boolean Zy(Zlou paramZlou, Map<String, Zmpm> paramMap) {
    return (paramZlou.ZA != null && paramMap.containsKey(paramZlou.ZA));
  }
  
  private void Zp(Zlou paramZlou, Map<String, Zmpm> paramMap, List<Zmpm> paramList) {
    int[] arrayOfInt = Zj();
    if (Zx(paramZlou.Zr)) {
      Zmpm zmpm = ZM(paramZlou);
      paramMap.put(paramZlou.ZA, zmpm);
      paramList.add(zmpm);
      if (arrayOfInt != null) {
        paramMap.put(paramZlou.ZA, null);
        return;
      } 
      return;
    } 
    paramMap.put(paramZlou.ZA, null);
  }
  
  private Zmpm ZM(Zlou paramZlou) {
    ArrayList<Zl1r> arrayList = new ArrayList();
    arrayList.add(Zrlp.Zj(paramZlou.ZE, paramZlou.ZV));
    Zvow zvow = this.ZJ.Zt().ZK(arrayList);
    return new Zmpm(paramZlou.Zr, zvow);
  }
  
  private Zgq<Zrdb> ZM(List<Zsq8> paramList, List<Zmpm> paramList1) {
    Zgq<Zgpi> zgq = new Zgq<>();
    Iterator<Zmpm> iterator = paramList1.iterator();
    int[] arrayOfInt = Zj();
    while (iterator.hasNext()) {
      Zmpm zmpm = iterator.next();
      zgq.ZM((Zsqx)ZM(zmpm, true, this.ZJ.ZN(), paramList));
      if (arrayOfInt != null)
        break; 
    } 
    return (Zgq)zgq;
  }
  
  private Zgq<Zrdb> ZR(Zzuq paramZzuq, List<Zsq8> paramList) {
    // Byte code:
    //   0: new burp/Zgq
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: invokestatic Zj : ()[I
    //   12: aload_1
    //   13: getfield Zh : Ljava/util/Map;
    //   16: dup
    //   17: astore #5
    //   19: monitorenter
    //   20: astore_3
    //   21: aload_1
    //   22: getfield Zh : Ljava/util/Map;
    //   25: invokeinterface keySet : ()Ljava/util/Set;
    //   30: invokeinterface iterator : ()Ljava/util/Iterator;
    //   35: astore #6
    //   37: aload #6
    //   39: invokeinterface hasNext : ()Z
    //   44: ifeq -> 158
    //   47: aload #6
    //   49: invokeinterface next : ()Ljava/lang/Object;
    //   54: checkcast java/lang/String
    //   57: astore #7
    //   59: aload_1
    //   60: getfield Zh : Ljava/util/Map;
    //   63: aload #7
    //   65: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   70: checkcast java/util/Map
    //   73: astore #8
    //   75: aload #8
    //   77: ifnull -> 154
    //   80: aload #8
    //   82: invokeinterface keySet : ()Ljava/util/Set;
    //   87: invokeinterface iterator : ()Ljava/util/Iterator;
    //   92: astore #9
    //   94: aload #9
    //   96: invokeinterface hasNext : ()Z
    //   101: ifeq -> 154
    //   104: aload #9
    //   106: invokeinterface next : ()Ljava/lang/Object;
    //   111: checkcast java/lang/String
    //   114: astore #10
    //   116: aload #8
    //   118: aload #10
    //   120: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   125: checkcast burp/Zmpm
    //   128: astore #11
    //   130: aload #11
    //   132: ifnull -> 150
    //   135: aload #4
    //   137: aload_0
    //   138: aload #11
    //   140: iconst_0
    //   141: aload #7
    //   143: aload_2
    //   144: invokevirtual ZM : (Lburp/Zmpm;ZLjava/lang/String;Ljava/util/List;)Lburp/Zsqx;
    //   147: invokevirtual ZM : (Lburp/Zsqx;)V
    //   150: aload_3
    //   151: ifnull -> 94
    //   154: aload_3
    //   155: ifnull -> 37
    //   158: aload #5
    //   160: monitorexit
    //   161: goto -> 172
    //   164: astore #12
    //   166: aload #5
    //   168: monitorexit
    //   169: aload #12
    //   171: athrow
    //   172: aload #4
    //   174: areturn
    // Exception table:
    //   from	to	target	type
    //   21	161	164	finally
    //   164	169	164	finally
  }
  
  private static boolean Zx(String paramString) {
    return (paramString != null && paramString.length() >= 6 && !Zt.contains(paramString));
  }
  
  private Zsqx<Zrdb> ZM(Zmpm paramZmpm, boolean paramBoolean, String paramString, List<Zsq8> paramList) {
    ArrayList<int[]> arrayList = new ArrayList();
    byte[] arrayOfByte = Zkb.Zy(paramZmpm.ZQ);
    Zstu zstu = this.ZJ.ZL().Za();
    Zu(zstu, arrayOfByte, (List<int[]>)arrayList);
    if (arrayList.isEmpty())
      return null; 
    Zr83 zr83 = ZW(paramString, paramZmpm, (List<int[]>)arrayList, paramBoolean);
    boolean bool = zr83.Za;
    if (zr83.Zj != null)
      return zr83.Zj; 
    zr83 = Z_(paramString, paramList, paramZmpm, arrayOfByte, (List<int[]>)arrayList, paramBoolean);
    bool |= zr83.Za;
    if (zr83.Zj != null)
      return zr83.Zj; 
    if (paramBoolean)
      return null; 
    zr83 = ZH(paramString, paramZmpm, arrayOfByte, (List<int[]>)arrayList, zstu);
    bool |= zr83.Za;
    return (zr83.Zj != null) ? zr83.Zj : (Zk(zstu, (List<int[]>)arrayList) ? null : ((this.Zi.Zr(Zzu2.PASSWORD_RETURNED_IN_LATER_RESPONSE) && !bool) ? Zsth.ZU(this.ZJ.Za(), paramString, this.ZJ.ZN(), paramZmpm.ZY, this.ZJ.Zt().Z_(Zrlp.Zc((List<int[]>)arrayList)), (byte)1) : null));
  }
  
  private void Zu(Zstu paramZstu, byte[] paramArrayOfbyte, List<int[]> paramList) {
    int[] arrayOfInt = Zj();
    int i = 0;
    while (i < paramZstu.Zpu()) {
      i = Zlt_.Zr(paramZstu, paramArrayOfbyte, true, i);
      if (i == -1)
        break; 
      paramList.add(new int[] { i, i + paramArrayOfbyte.length });
      i += paramArrayOfbyte.length;
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  private Zr83 ZW(String paramString, Zmpm paramZmpm, List<int[]> paramList, boolean paramBoolean) {
    int[] arrayOfInt = Zj();
    for (Ztbr ztbr : (this.ZJ.Zp()).ZN) {
      if (ztbr.Zq0().contains(paramZmpm.ZQ))
        return !this.Zi.Zr(Zzu2.PASSWORD_VALUE_SET_IN_COOKIE) ? Zr83.ZJ() : (!paramBoolean ? Zr83.Zp(Zkq0.ZL(this.ZJ.Za(), paramString, this.ZJ.ZN(), paramZmpm.ZY, this.ZJ.Zt().Z_(Zrlp.Zc(paramList)))) : Zr83.Zp(Zkq0.Zw(this.ZJ.Za(), this.ZJ.ZN(), ZJ(paramZmpm, paramList)))); 
      if (arrayOfInt != null)
        break; 
    } 
    return Zr83.Zn();
  }
  
  private Zr83 Z_(String paramString, List<Zsq8> paramList, Zmpm paramZmpm, byte[] paramArrayOfbyte, List<int[]> paramList1, boolean paramBoolean) {
    int[] arrayOfInt = Zj();
    for (Zsq8 zsq8 : paramList) {
      if (!zsq8.ZZ.Zds())
        continue; 
      byte[] arrayOfByte = zsq8.ZZ.ZdC();
      if (-1 == Zli.ZL(arrayOfByte, paramArrayOfbyte, true))
        continue; 
      List<Zt8g> list = Zznx.Zm(Zrdu.URL_PARAM, arrayOfByte, 0, arrayOfByte.length, Zsba.URL_ENCODED, null);
      for (Zt8g zt8g : list) {
        if (paramZmpm.ZQ.equals(zt8g.Zbn()))
          return !paramBoolean ? (this.Zi.Zr(Zzu2.PASSWORD_RETURNED_IN_LATER_RESPONSE) ? Zr83.Zp(Zsth.ZU(this.ZJ.Za(), paramString, this.ZJ.ZN(), paramZmpm.ZY, this.ZJ.Zt().Z_(Zrlp.Zc(paramList1)), (byte)2)) : Zr83.ZJ()) : (this.Zi.Zr(Zzu2.PASSWORD_RETURNED_IN_URL_QUERY_STRING) ? Zr83.Zp(Zgvg.ZB(this.ZJ.Za(), this.ZJ.ZN(), ZJ(paramZmpm, paramList1))) : Zr83.ZJ()); 
        if (arrayOfInt != null)
          break; 
      } 
      if (arrayOfInt != null)
        break; 
    } 
    return Zr83.Zn();
  }
  
  private Zr83 ZH(String paramString, Zmpm paramZmpm, byte[] paramArrayOfbyte, List<int[]> paramList, Zstu paramZstu) {
    int[] arrayOfInt = Zj();
    if ((this.ZJ.Zp()).Zd != null) {
      Zzrd zzrd = Zzrd.ZJ(paramArrayOfbyte, true, true);
      for (Ztu8 ztu8 : (this.ZJ.Zp()).Zd) {
        if ((ztu8.ZlD() != 0 && ztu8.ZlD() != 4) || !zzrd.Zi(paramZstu, ztu8.ZlK(), ztu8.Zli()).ZP())
          continue; 
        for (Zs5n zs5n : ztu8.ZlP().ZJo()) {
          if (paramZmpm.ZQ.equals(zs5n.ZQG()))
            return this.Zi.Zr(Zzu2.PASSWORD_RETURNED_IN_LATER_RESPONSE) ? Zr83.Zp(Zsth.ZU(this.ZJ.Za(), paramString, this.ZJ.ZN(), paramZmpm.ZY, this.ZJ.Zt().Z_(Zrlp.Zc(paramList)), (byte)2)) : Zr83.ZJ(); 
          if (arrayOfInt != null)
            break; 
        } 
        if (arrayOfInt != null)
          break; 
      } 
    } 
    return Zr83.Zn();
  }
  
  private static boolean Zk(Zstu paramZstu, List<int[]> paramList) {
    for (int[] arrayOfInt : paramList) {
      if ((arrayOfInt[0] > 0 && Character.isLetterOrDigit((char)paramZstu.Zp(arrayOfInt[0] - 1))) || (arrayOfInt[1] < paramZstu.Zpu() && Character.isLetterOrDigit((char)paramZstu.Zp(arrayOfInt[1]))))
        continue; 
      return false;
    } 
    return true;
  }
  
  private static Zvow ZJ(Zmpm paramZmpm, List<int[]> paramList) {
    return (new Zvow(paramZmpm.ZY)).ZK(paramZmpm.ZY.ZB()).Z_(Zrlp.Zc(paramList));
  }
  
  private static Map lambda$storePasswordFieldName$0(String paramString) {
    return new HashMap<>();
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: aconst_null
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'EMEvBp\\bFODlEkR\\n\OA~Ag_^C'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #6
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: invokestatic Zm : ([I)V
    //   26: bipush #83
    //   28: iinc #1, 1
    //   31: aload_3
    //   32: iload_1
    //   33: dup
    //   34: iload_2
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 74
    //   43: aload_0
    //   44: swap
    //   45: iload #4
    //   47: iinc #4, 1
    //   50: swap
    //   51: aastore
    //   52: iload_1
    //   53: iload_2
    //   54: iadd
    //   55: dup
    //   56: istore_1
    //   57: iload #5
    //   59: if_icmpge -> 71
    //   62: aload_3
    //   63: iload_1
    //   64: invokevirtual charAt : (I)C
    //   67: istore_2
    //   68: goto -> 26
    //   71: goto -> 219
    //   74: dup_x2
    //   75: pop
    //   76: invokevirtual toCharArray : ()[C
    //   79: dup_x1
    //   80: arraylength
    //   81: dup_x2
    //   82: pop
    //   83: iconst_0
    //   84: istore #6
    //   86: dup2_x1
    //   87: pop2
    //   88: dup_x2
    //   89: iconst_1
    //   90: if_icmpgt -> 192
    //   93: dup2
    //   94: swap
    //   95: iload #6
    //   97: dup2_x1
    //   98: caload
    //   99: swap
    //   100: iload #6
    //   102: bipush #7
    //   104: irem
    //   105: tableswitch default -> 174, 0 -> 144, 1 -> 149, 2 -> 154, 3 -> 159, 4 -> 164, 5 -> 169
    //   144: bipush #101
    //   146: goto -> 176
    //   149: bipush #125
    //   151: goto -> 176
    //   154: bipush #100
    //   156: goto -> 176
    //   159: bipush #76
    //   161: goto -> 176
    //   164: bipush #97
    //   166: goto -> 176
    //   169: bipush #87
    //   171: goto -> 176
    //   174: bipush #61
    //   176: ixor
    //   177: ixor
    //   178: i2c
    //   179: castore
    //   180: iinc #6, 1
    //   183: dup
    //   184: ifne -> 192
    //   187: dup2
    //   188: dup_x1
    //   189: goto -> 97
    //   192: dup2_x1
    //   193: pop2
    //   194: dup_x2
    //   195: iload #6
    //   197: if_icmpgt -> 93
    //   200: pop
    //   201: new java/lang/String
    //   204: dup_x1
    //   205: swap
    //   206: invokespecial <init> : ([C)V
    //   209: invokevirtual intern : ()Ljava/lang/String;
    //   212: swap
    //   213: pop
    //   214: swap
    //   215: pop
    //   216: goto -> 43
    //   219: iconst_3
    //   220: anewarray java/lang/String
    //   223: dup
    //   224: iconst_0
    //   225: aload_0
    //   226: iconst_1
    //   227: aaload
    //   228: aastore
    //   229: dup
    //   230: iconst_1
    //   231: aload_0
    //   232: iconst_0
    //   233: aaload
    //   234: aastore
    //   235: dup
    //   236: iconst_2
    //   237: aload_0
    //   238: iconst_2
    //   239: aaload
    //   240: aastore
    //   241: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   244: putstatic burp/Zeez.Zt : Ljava/util/List;
    //   247: return
  }
  
  public static void Zm(int[] paramArrayOfint) {
    ZY = paramArrayOfint;
  }
  
  public static int[] Zj() {
    return ZY;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeez.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */