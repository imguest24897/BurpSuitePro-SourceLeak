package burp;

import java.io.Writer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzmy {
  private static Zbqc[] ZV;
  
  private static final String a;
  
  private static boolean ZT(Zegg paramZegg1, Zegg paramZegg2) {
    return (paramZegg2.ZSF() == null) ? ((paramZegg2.ZSC() == paramZegg1.ZSC() && paramZegg2.ZS5() == paramZegg1.ZS5() && paramZegg1.ZSF() == null)) : ((paramZegg2.ZSC() == paramZegg1.ZSC() && paramZegg2.ZS5() == paramZegg1.ZS5() && paramZegg2.ZSF().equals(paramZegg1.ZSF())));
  }
  
  public static void ZT(Zvon paramZvon, Zsh9 paramZsh9, Zbnt paramZbnt, Zrkg paramZrkg, Zey9 paramZey9) {
    Zxyc zxyc = new Zxyc(paramZvon, paramZsh9, paramZbnt, paramZey9);
    Iterator<Zglw> iterator = paramZrkg.Zcy().iterator();
    Zbqc[] arrayOfZbqc = Zj();
    while (iterator.hasNext()) {
      Zglw zglw = iterator.next();
      zglw.ZC(zxyc);
      if (arrayOfZbqc != null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zo(new Zbqc[1]); 
  }
  
  public static Zx_5 Zi(Zmzk paramZmzk, String paramString, Zxs7 paramZxs7, List<Zr3k> paramList, Zvs paramZvs) {
    Zbqc[] arrayOfZbqc = Zj();
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[2]); 
    return new Zx_5(paramZvs, ZQ(paramZvs), 0, ZP(paramZvs, paramList), Collections.singletonList(new Ze5w(paramList)), (byte)2, (byte)1, paramZmzk, Zkb.Zy(paramString), paramZxs7);
  }
  
  static void Zr(Writer paramWriter, Zsh9 paramZsh9, Zrkg paramZrkg, Zey9 paramZey9) {
    Zlkn zlkn = new Zlkn(paramWriter, paramZsh9, paramZey9);
    Iterator<Zglw> iterator = paramZrkg.Zcy().iterator();
    Zbqc[] arrayOfZbqc = Zj();
    while (iterator.hasNext()) {
      Zglw zglw = iterator.next();
      zglw.ZC(zlkn);
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private static Map<Long, String> ZP(Zvs paramZvs, List<Zr3k> paramList) {
    return (paramZvs == Zzu2.XPATH_INJECTION) ? Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.XPATH_TYPE, Byte.toString(Zc(paramList))) }) : Collections.<Long, String>emptyMap();
  }
  
  private static byte Zc(List<Zr3k> paramList) {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_2
    //   2: invokestatic Zj : ()[Lburp/Zbqc;
    //   5: aload_0
    //   6: invokeinterface iterator : ()Ljava/util/Iterator;
    //   11: astore_3
    //   12: astore_1
    //   13: aload_3
    //   14: invokeinterface hasNext : ()Z
    //   19: ifeq -> 73
    //   22: aload_3
    //   23: invokeinterface next : ()Ljava/lang/Object;
    //   28: checkcast burp/Zr3k
    //   31: astore #4
    //   33: aload #4
    //   35: invokevirtual ZE : ()I
    //   38: istore #5
    //   40: iload #5
    //   42: iconst_m1
    //   43: if_icmpne -> 49
    //   46: goto -> 13
    //   49: iload_2
    //   50: iconst_m1
    //   51: if_icmpne -> 61
    //   54: iload #5
    //   56: istore_2
    //   57: aload_1
    //   58: ifnull -> 69
    //   61: iload #5
    //   63: iload_2
    //   64: if_icmpeq -> 69
    //   67: iconst_0
    //   68: ireturn
    //   69: aload_1
    //   70: ifnull -> 13
    //   73: iload_2
    //   74: ifne -> 79
    //   77: iconst_2
    //   78: ireturn
    //   79: iconst_0
    //   80: ireturn
  }
  
  private static byte ZQ(Zvs paramZvs) {
    if (paramZvs == Zzu2.OS_COMMAND_INJECTION)
      return 1; 
    if (paramZvs == Zzu2.SQL_INJECTION)
      return -1; 
    if (paramZvs == Zzu2.FILE_PATH_TRAVERSAL)
      return 3; 
    if (paramZvs == Zzu2.XML_INJECTION)
      return 0; 
    if (paramZvs == Zzu2.XPATH_INJECTION)
      return 2; 
    if (paramZvs == Zzu2.LDAP_INJECTION)
      return 2; 
    if (paramZvs == Zzu2.EXTERNAL_SERVICE_INTERACTION_HTTP || paramZvs == Zzu2.EXTERNAL_SERVICE_INTERACTION_DNS)
      return 6; 
    Zuh.Zb(false, Zqf.Zk);
    return 0;
  }
  
  public static Zzk5 ZA(Zgkc paramZgkc, Zrkg paramZrkg) {
    // Byte code:
    //   0: invokestatic Zj : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: instanceof burp/Zrkg
    //   8: ifne -> 15
    //   11: getstatic burp/Zzk5.CONTINUE : Lburp/Zzk5;
    //   14: areturn
    //   15: getstatic burp/Zzk5.EVIDENCE_EXISTS : Lburp/Zzk5;
    //   18: astore_3
    //   19: aload_0
    //   20: checkcast burp/Zrkg
    //   23: astore #4
    //   25: aload #4
    //   27: invokeinterface Zcy : ()Lburp/Zefg;
    //   32: invokeinterface iterator : ()Ljava/util/Iterator;
    //   37: astore #5
    //   39: aload #5
    //   41: invokeinterface hasNext : ()Z
    //   46: ifeq -> 104
    //   49: aload #5
    //   51: invokeinterface next : ()Ljava/lang/Object;
    //   56: checkcast burp/Zglw
    //   59: astore #6
    //   61: aload_1
    //   62: aload #6
    //   64: invokestatic ZN : (Lburp/Zrkg;Lburp/Zglw;)Z
    //   67: ifeq -> 86
    //   70: aload_1
    //   71: aload #6
    //   73: aload #4
    //   75: invokestatic ZC : (Lburp/Zrkg;Lburp/Zglw;Lburp/Zrkg;)V
    //   78: getstatic burp/Zzk5.ADD_INFILTRATOR_EVIDENCE : Lburp/Zzk5;
    //   81: astore_3
    //   82: aload_2
    //   83: ifnull -> 100
    //   86: aload_1
    //   87: aload #6
    //   89: aload #4
    //   91: invokeinterface Zcy : ()Lburp/Zefg;
    //   96: invokestatic Zw : (Lburp/Zrkg;Lburp/Zglw;Lburp/Zefg;)Lburp/Zzk5;
    //   99: astore_3
    //   100: aload_2
    //   101: ifnull -> 39
    //   104: aload_3
    //   105: areturn
  }
  
  private static Zzk5 Zw(Zrkg paramZrkg, Zglw paramZglw, Zefg<Zglw> paramZefg) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #4
    //   3: invokestatic Zj : ()[Lburp/Zbqc;
    //   6: aload_0
    //   7: invokeinterface Zcy : ()Lburp/Zefg;
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore #5
    //   19: astore_3
    //   20: aload #5
    //   22: invokeinterface hasNext : ()Z
    //   27: ifeq -> 100
    //   30: aload #5
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast burp/Zglw
    //   40: astore #6
    //   42: aload #6
    //   44: invokeinterface ZDM : ()Lburp/Zegg;
    //   49: aload_1
    //   50: invokeinterface ZDM : ()Lburp/Zegg;
    //   55: invokestatic ZT : (Lburp/Zegg;Lburp/Zegg;)Z
    //   58: ifeq -> 97
    //   61: aload #6
    //   63: invokeinterface ZDt : ()Lburp/Zzq1;
    //   68: invokeinterface ZRL : ()Lburp/Zb0p;
    //   73: ifnull -> 97
    //   76: aload_1
    //   77: invokeinterface ZDt : ()Lburp/Zzq1;
    //   82: invokeinterface ZRs : ()Lburp/Zsnv;
    //   87: ifnull -> 97
    //   90: aload #6
    //   92: astore #4
    //   94: goto -> 100
    //   97: goto -> 20
    //   100: aload #4
    //   102: ifnonnull -> 109
    //   105: getstatic burp/Zzk5.EVIDENCE_EXISTS : Lburp/Zzk5;
    //   108: areturn
    //   109: aload_1
    //   110: invokeinterface ZDZ : ()I
    //   115: aload #4
    //   117: invokeinterface ZDZ : ()I
    //   122: if_icmpne -> 189
    //   125: aload #4
    //   127: invokestatic ZG : (Lburp/Zglw;)Z
    //   130: ifeq -> 158
    //   133: aload_1
    //   134: invokestatic ZG : (Lburp/Zglw;)Z
    //   137: ifne -> 158
    //   140: aload_1
    //   141: invokeinterface ZDt : ()Lburp/Zzq1;
    //   146: aload #4
    //   148: invokeinterface ZDa : ()Lburp/Zzi8;
    //   153: invokeinterface Zi : (Lburp/Zzi8;)V
    //   158: aload #4
    //   160: invokestatic ZG : (Lburp/Zglw;)Z
    //   163: ifne -> 280
    //   166: aload_1
    //   167: invokestatic ZG : (Lburp/Zglw;)Z
    //   170: ifeq -> 280
    //   173: aload_1
    //   174: invokeinterface ZDt : ()Lburp/Zzq1;
    //   179: aconst_null
    //   180: invokeinterface Zi : (Lburp/Zzi8;)V
    //   185: aload_3
    //   186: ifnull -> 280
    //   189: aload_1
    //   190: invokeinterface ZDa : ()Lburp/Zzi8;
    //   195: ifnonnull -> 280
    //   198: aload_2
    //   199: invokeinterface iterator : ()Ljava/util/Iterator;
    //   204: astore #5
    //   206: aload #5
    //   208: invokeinterface hasNext : ()Z
    //   213: ifeq -> 280
    //   216: aload #5
    //   218: invokeinterface next : ()Ljava/lang/Object;
    //   223: checkcast burp/Zglw
    //   226: astore #6
    //   228: aload #6
    //   230: invokeinterface ZDZ : ()I
    //   235: aload_1
    //   236: invokeinterface ZDZ : ()I
    //   241: if_icmpne -> 276
    //   244: aload #6
    //   246: invokeinterface ZDa : ()Lburp/Zzi8;
    //   251: ifnull -> 276
    //   254: aload_1
    //   255: invokeinterface ZDt : ()Lburp/Zzq1;
    //   260: aload #6
    //   262: invokeinterface ZDa : ()Lburp/Zzi8;
    //   267: invokeinterface Zi : (Lburp/Zzi8;)V
    //   272: aload_3
    //   273: ifnull -> 280
    //   276: aload_3
    //   277: ifnull -> 206
    //   280: aload_0
    //   281: invokeinterface Zcy : ()Lburp/Zefg;
    //   286: aload #4
    //   288: invokeinterface indexOf : (Ljava/lang/Object;)I
    //   293: iconst_m1
    //   294: if_icmpne -> 301
    //   297: iconst_0
    //   298: goto -> 314
    //   301: aload_0
    //   302: invokeinterface Zcy : ()Lburp/Zefg;
    //   307: aload #4
    //   309: invokeinterface indexOf : (Ljava/lang/Object;)I
    //   314: istore #5
    //   316: aload_0
    //   317: invokeinterface Zcy : ()Lburp/Zefg;
    //   322: iload #5
    //   324: aload_1
    //   325: invokeinterface add : (ILjava/lang/Object;)V
    //   330: aload_0
    //   331: invokeinterface Zcy : ()Lburp/Zefg;
    //   336: aload #4
    //   338: invokeinterface remove : (Ljava/lang/Object;)Z
    //   343: pop
    //   344: getstatic burp/Zzk5.ADD_INFILTRATOR_EVIDENCE : Lburp/Zzk5;
    //   347: areturn
  }
  
  private static boolean ZG(Zglw paramZglw) {
    return (paramZglw.ZDt().ZRm() != null);
  }
  
  private static void ZC(Zrkg paramZrkg1, Zglw paramZglw, Zrkg paramZrkg2) {
    // Byte code:
    //   0: invokestatic Zj : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_0
    //   5: aload_1
    //   6: invokestatic Zq : (Lburp/Zrkg;Lburp/Zglw;)Z
    //   9: ifeq -> 98
    //   12: aload_1
    //   13: invokeinterface ZDa : ()Lburp/Zzi8;
    //   18: ifnonnull -> 110
    //   21: aload_2
    //   22: invokeinterface Zcy : ()Lburp/Zefg;
    //   27: invokeinterface iterator : ()Ljava/util/Iterator;
    //   32: astore #4
    //   34: aload #4
    //   36: invokeinterface hasNext : ()Z
    //   41: ifeq -> 94
    //   44: aload #4
    //   46: invokeinterface next : ()Ljava/lang/Object;
    //   51: checkcast burp/Zglw
    //   54: astore #5
    //   56: aload #5
    //   58: invokeinterface ZDZ : ()I
    //   63: aload_1
    //   64: invokeinterface ZDZ : ()I
    //   69: if_icmpne -> 90
    //   72: aload_1
    //   73: invokeinterface ZDt : ()Lburp/Zzq1;
    //   78: aload #5
    //   80: invokeinterface ZDa : ()Lburp/Zzi8;
    //   85: invokeinterface Zi : (Lburp/Zzi8;)V
    //   90: aload_3
    //   91: ifnull -> 34
    //   94: aload_3
    //   95: ifnull -> 110
    //   98: aload_1
    //   99: invokeinterface ZDt : ()Lburp/Zzq1;
    //   104: aconst_null
    //   105: invokeinterface Zi : (Lburp/Zzi8;)V
    //   110: aload_0
    //   111: invokeinterface Zcy : ()Lburp/Zefg;
    //   116: aload_1
    //   117: invokeinterface add : (Ljava/lang/Object;)Z
    //   122: pop
    //   123: return
  }
  
  private static boolean Zq(Zrkg paramZrkg, Zglw paramZglw) {
    Zbqc[] arrayOfZbqc = Zj();
    for (Zglw zglw : paramZrkg.Zcy()) {
      if (zglw.ZDZ() == paramZglw.ZDZ() && ZG(zglw))
        return false; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return true;
  }
  
  private static boolean ZN(Zrkg paramZrkg, Zglw paramZglw) {
    Zbqc[] arrayOfZbqc = Zj();
    for (Zglw zglw : paramZrkg.Zcy()) {
      if (ZT(zglw.ZDM(), paramZglw.ZDM()))
        return false; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return true;
  }
  
  static boolean Zh(Zbx0 paramZbx0, Zrkg paramZrkg) {
    boolean bool = false;
    Iterator<Zglw> iterator = paramZrkg.Zcy().iterator();
    Zbqc[] arrayOfZbqc = Zj();
    while (iterator.hasNext()) {
      Zglw zglw = iterator.next();
      bool |= zglw.ZDt().ZR(paramZbx0);
      if (arrayOfZbqc != null)
        break; 
    } 
    return bool;
  }
  
  static void Zu(Zz_r paramZz_r, Zrkg paramZrkg) {
    Zbqc[] arrayOfZbqc = Zj();
    for (Zglw zglw : paramZrkg.Zcy()) {
      zglw.ZDt().Zi(paramZz_r);
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  static void Zt(Zb03 paramZb03, Zrkg paramZrkg) {
    Zbqc[] arrayOfZbqc = Zj();
    for (Zglw zglw : paramZrkg.Zcy()) {
      zglw.ZDt().Zg(paramZb03);
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  public static void ZO(StringBuilder paramStringBuilder) {
    paramStringBuilder.append(a);
  }
  
  public static void Zo(Zbqc[] paramArrayOfZbqc) {
    ZV = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zj() {
    return ZV;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zj : ()[Lburp/Zbqc;
    //   3: ifnull -> 13
    //   6: iconst_3
    //   7: anewarray burp/Zbqc
    //   10: invokestatic Zo : ([Lburp/Zbqc;)V
    //   13: bipush #34
    //   15: ldc 'W%\\nzg=w"F6%CS>X2w.YZ%"`;HV#Q"%;ET#/k?XAw]5%-H\9Sfu.^F2Pfq \\rTwD)q*CA>U*i6\\r@9G'c*\\rt}h'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zzmy.a : Ljava/lang/String;
    //   24: goto -> 166
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 140
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #15
    //   94: goto -> 124
    //   97: bipush #23
    //   99: goto -> 124
    //   102: bipush #117
    //   104: goto -> 124
    //   107: bipush #22
    //   109: goto -> 124
    //   112: bipush #100
    //   114: goto -> 124
    //   117: bipush #39
    //   119: goto -> 124
    //   122: bipush #109
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 48
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 45
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 21
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzmy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */