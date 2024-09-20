package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.portswigger.Zkb;

public class Zxzx implements Zehc {
  private final Zmsh Zu;
  
  private static boolean ZK;
  
  public Zxzx(Zmsh paramZmsh) {
    this.Zu = paramZmsh;
  }
  
  public Zlcm ZP() {
    return Zlcm.PPR_ContentSecurityPolicy;
  }
  
  public Ztk8 Zb() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zu : Lburp/Zmsh;
    //   4: invokevirtual Zx : ()Lburp/Ze3n;
    //   7: astore_2
    //   8: invokestatic ZK : ()Z
    //   11: aload_0
    //   12: getfield Zu : Lburp/Zmsh;
    //   15: invokevirtual Zv : ()Lburp/Zz_9;
    //   18: astore_3
    //   19: aload_2
    //   20: invokevirtual Zp : ()Lburp/Zs68;
    //   23: astore #4
    //   25: istore_1
    //   26: new burp/Zgq
    //   29: dup
    //   30: invokespecial <init> : ()V
    //   33: astore #5
    //   35: aload #4
    //   37: getfield ZH : Lburp/Zk8m;
    //   40: astore #6
    //   42: aload #6
    //   44: invokestatic Zp : (Lburp/Zk8m;)Z
    //   47: ifne -> 66
    //   50: aload #6
    //   52: invokestatic ZV : (Lburp/Zk8m;)Z
    //   55: ifne -> 66
    //   58: aload #6
    //   60: getfield ZJ : S
    //   63: ifne -> 507
    //   66: new burp/Zd
    //   69: dup
    //   70: aload #4
    //   72: invokespecial <init> : (Lburp/Zs68;)V
    //   75: astore #7
    //   77: aload #7
    //   79: invokevirtual ZY : ()Z
    //   82: ifeq -> 138
    //   85: aload_3
    //   86: getstatic burp/Zzu2.CONTENT_SECURITY_POLICY_NOT_ENFORCED : Lburp/Zzu2;
    //   89: invokevirtual Zr : (Lburp/Zvs;)Z
    //   92: ifeq -> 507
    //   95: aload #7
    //   97: invokevirtual ZZ : ()Z
    //   100: ifne -> 111
    //   103: aload #7
    //   105: invokevirtual Zc : ()Z
    //   108: ifeq -> 507
    //   111: aload #5
    //   113: aload_0
    //   114: new burp/Zgsn
    //   117: dup
    //   118: getstatic burp/Zey.NOT_ENFORCED : Lburp/Zey;
    //   121: iconst_3
    //   122: invokespecial <init> : (Lburp/Zey;B)V
    //   125: aload_2
    //   126: aload #7
    //   128: invokevirtual ZJ : (Lburp/Zgsn;Lburp/Ze3n;Lburp/Zd;)Lburp/Zx_5;
    //   131: invokevirtual Zu : (Lburp/Zsqx;)V
    //   134: iload_1
    //   135: ifeq -> 507
    //   138: aload_3
    //   139: getstatic burp/Zzu2.CONTENT_SECURITY_POLICY_UNTRUSTED_SCRIPTS : Lburp/Zzu2;
    //   142: invokevirtual Zr : (Lburp/Zvs;)Z
    //   145: ifeq -> 211
    //   148: aload #7
    //   150: invokevirtual Zl : ()Z
    //   153: ifne -> 188
    //   156: aload #7
    //   158: invokevirtual ZM : ()Z
    //   161: ifne -> 188
    //   164: aload #7
    //   166: invokevirtual ZW : ()Z
    //   169: ifne -> 188
    //   172: aload #7
    //   174: invokevirtual Zb : ()Z
    //   177: ifne -> 188
    //   180: aload #7
    //   182: invokevirtual Zg : ()Z
    //   185: ifeq -> 211
    //   188: aload #5
    //   190: aload_0
    //   191: new burp/Zgsn
    //   194: dup
    //   195: getstatic burp/Zey.PERMITS_UNTRUSTED_SCRIPT_EXECUTION : Lburp/Zey;
    //   198: iconst_3
    //   199: invokespecial <init> : (Lburp/Zey;B)V
    //   202: aload_2
    //   203: aload #7
    //   205: invokevirtual ZJ : (Lburp/Zgsn;Lburp/Ze3n;Lburp/Zd;)Lburp/Zx_5;
    //   208: invokevirtual Zu : (Lburp/Zsqx;)V
    //   211: aload_3
    //   212: getstatic burp/Zzu2.CONTENT_SECURITY_POLICY_UNTRUSTED_STYLES : Lburp/Zzu2;
    //   215: invokevirtual Zr : (Lburp/Zvs;)Z
    //   218: ifeq -> 276
    //   221: aload #7
    //   223: invokevirtual ZT : ()Z
    //   226: ifne -> 253
    //   229: aload #7
    //   231: invokevirtual ZB : ()Z
    //   234: ifne -> 253
    //   237: aload #7
    //   239: invokevirtual Zi : ()Z
    //   242: ifne -> 253
    //   245: aload #7
    //   247: invokevirtual ZD : ()Z
    //   250: ifeq -> 276
    //   253: aload #5
    //   255: aload_0
    //   256: new burp/Zgsn
    //   259: dup
    //   260: getstatic burp/Zey.PERMITS_UNTRUSTED_STYLE_EXECUTION : Lburp/Zey;
    //   263: iconst_3
    //   264: invokespecial <init> : (Lburp/Zey;B)V
    //   267: aload_2
    //   268: aload #7
    //   270: invokevirtual ZJ : (Lburp/Zgsn;Lburp/Ze3n;Lburp/Zd;)Lburp/Zx_5;
    //   273: invokevirtual Zu : (Lburp/Zsqx;)V
    //   276: aload_3
    //   277: getstatic burp/Zzu2.CONTENT_SECURITY_POLICY_ALLOWLISTED_SCRIPTS : Lburp/Zzu2;
    //   280: invokevirtual Zr : (Lburp/Zvs;)Z
    //   283: ifeq -> 325
    //   286: aload #7
    //   288: invokevirtual ZW : ()Z
    //   291: ifne -> 325
    //   294: aload #7
    //   296: invokevirtual Zo : ()Z
    //   299: ifeq -> 325
    //   302: aload #5
    //   304: aload_0
    //   305: new burp/Zgsn
    //   308: dup
    //   309: getstatic burp/Zey.ALLOWLISTED_SCRIPT_RESOURCES : Lburp/Zey;
    //   312: iconst_3
    //   313: invokespecial <init> : (Lburp/Zey;B)V
    //   316: aload_2
    //   317: aload #7
    //   319: invokevirtual ZJ : (Lburp/Zgsn;Lburp/Ze3n;Lburp/Zd;)Lburp/Zx_5;
    //   322: invokevirtual Zu : (Lburp/Zsqx;)V
    //   325: aload_3
    //   326: getstatic burp/Zzu2.CONTENT_SECURITY_POLICY_ALLOW_CLICKJACKING : Lburp/Zzu2;
    //   329: invokevirtual Zr : (Lburp/Zvs;)Z
    //   332: ifeq -> 417
    //   335: aload #7
    //   337: invokevirtual ZL : ()Z
    //   340: ifne -> 417
    //   343: aload #7
    //   345: invokevirtual Zn : ()Z
    //   348: ifeq -> 359
    //   351: aload #7
    //   353: invokevirtual Zu : ()Z
    //   356: ifeq -> 386
    //   359: aload #5
    //   361: aload_0
    //   362: new burp/Zgsn
    //   365: dup
    //   366: getstatic burp/Zey.PERMITS_CLICKJACKING : Lburp/Zey;
    //   369: iconst_3
    //   370: invokespecial <init> : (Lburp/Zey;B)V
    //   373: aload_2
    //   374: aload #7
    //   376: invokevirtual ZJ : (Lburp/Zgsn;Lburp/Ze3n;Lburp/Zd;)Lburp/Zx_5;
    //   379: invokevirtual Zu : (Lburp/Zsqx;)V
    //   382: iload_1
    //   383: ifeq -> 417
    //   386: aload #7
    //   388: invokevirtual Zs : ()Z
    //   391: ifeq -> 417
    //   394: aload #5
    //   396: aload_0
    //   397: new burp/Zgsn
    //   400: dup
    //   401: getstatic burp/Zey.PERMITS_CLICKJACKING : Lburp/Zey;
    //   404: iconst_1
    //   405: invokespecial <init> : (Lburp/Zey;B)V
    //   408: aload_2
    //   409: aload #7
    //   411: invokevirtual ZJ : (Lburp/Zgsn;Lburp/Ze3n;Lburp/Zd;)Lburp/Zx_5;
    //   414: invokevirtual Zu : (Lburp/Zsqx;)V
    //   417: aload_3
    //   418: getstatic burp/Zzu2.CONTENT_SECURITY_POLICY_ALLOW_FORM_HIGHJACKING : Lburp/Zzu2;
    //   421: invokevirtual Zr : (Lburp/Zvs;)Z
    //   424: ifeq -> 466
    //   427: aload #7
    //   429: invokevirtual Zr : ()Z
    //   432: ifeq -> 443
    //   435: aload #7
    //   437: invokevirtual ZF : ()Z
    //   440: ifeq -> 466
    //   443: aload #5
    //   445: aload_0
    //   446: new burp/Zgsn
    //   449: dup
    //   450: getstatic burp/Zey.PERMITS_FORM_HIGHJACKING : Lburp/Zey;
    //   453: iconst_3
    //   454: invokespecial <init> : (Lburp/Zey;B)V
    //   457: aload_2
    //   458: aload #7
    //   460: invokevirtual ZJ : (Lburp/Zgsn;Lburp/Ze3n;Lburp/Zd;)Lburp/Zx_5;
    //   463: invokevirtual Zu : (Lburp/Zsqx;)V
    //   466: aload_3
    //   467: getstatic burp/Zzu2.CONTENT_SECURITY_POLICY_MALFORMED_SYNTAX : Lburp/Zzu2;
    //   470: invokevirtual Zr : (Lburp/Zvs;)Z
    //   473: ifeq -> 507
    //   476: aload #7
    //   478: invokevirtual Zx : ()Z
    //   481: ifeq -> 507
    //   484: aload #5
    //   486: aload_0
    //   487: new burp/Zgsn
    //   490: dup
    //   491: getstatic burp/Zey.MALFORMED_SYNTAX : Lburp/Zey;
    //   494: iconst_3
    //   495: invokespecial <init> : (Lburp/Zey;B)V
    //   498: aload_2
    //   499: aload #7
    //   501: invokevirtual ZJ : (Lburp/Zgsn;Lburp/Ze3n;Lburp/Zd;)Lburp/Zx_5;
    //   504: invokevirtual Zu : (Lburp/Zsqx;)V
    //   507: aload #5
    //   509: invokestatic Zy : (Lburp/Zgq;)Lburp/Ztk8;
    //   512: invokestatic Zwu : ()[Lburp/Zbqc;
    //   515: ifnonnull -> 530
    //   518: iload_1
    //   519: ifeq -> 526
    //   522: iconst_0
    //   523: goto -> 527
    //   526: iconst_1
    //   527: invokestatic Zy : (Z)V
    //   530: areturn
  }
  
  private Zx_5 ZJ(Zgsn paramZgsn, Ze3n paramZe3n, Zd paramZd) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    String str = paramZgsn.Ze(paramZd);
    hashMap.put(Long.valueOf(Ztz3.ISSUE_DETAILS_CACHE.permanentIndex), str);
    ArrayList<Zt2w> arrayList = new ArrayList();
    Zefx zefx = paramZe3n.ZA();
    Zb6q zb6q = paramZe3n.ZL();
    Zvow zvow = (new Zvow(zefx.ZT(), this.Zu.Zq())).ZC(zefx).ZK(Collections.emptyList()).Zo(zb6q).Z_(paramZd.ZP());
    arrayList.add(new Zt2w(null, zvow));
    return new Zx_5(paramZgsn.ZVk(), (byte)0, 0, (Map)hashMap, (List)arrayList, paramZgsn.ZVh(), (byte)1, paramZe3n.Za(), Zkb.Zy(paramZe3n.ZN()), null);
  }
  
  public static void Zy(boolean paramBoolean) {
    ZK = paramBoolean;
  }
  
  public static boolean Zk() {
    return ZK;
  }
  
  public static boolean ZK() {
    boolean bool = Zk();
    return !bool;
  }
  
  static {
    if (ZK())
      Zy(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxzx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */