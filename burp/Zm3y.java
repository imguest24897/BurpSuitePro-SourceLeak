package burp;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zzc;
import net.portswigger.browser.Ze7;
import net.portswigger.browser.Zel;
import net.portswigger.browser.Zh;
import net.portswigger.browser.Zjw;
import net.portswigger.browser.Zt1;
import net.portswigger.browser.Ztk;

public class Zm3y implements Ztiv {
  private final Zz3o Zy;
  
  private final String Zk;
  
  private final Map<String, String> ZI;
  
  private final Map<String, List<String>> ZZ;
  
  private final List<Zzjv> ZP;
  
  private final Zel ZG;
  
  private final List<Zrtj> ZD;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Zm3y(Zt4i<?> paramZt4i) {
    this.Zy = paramZt4i.ZT;
    this.Zk = paramZt4i.ZQ;
    this.ZI = paramZt4i.Zr;
    this.ZZ = paramZt4i.ZW;
    this.ZP = paramZt4i.Za;
    this.ZG = paramZt4i.ZN;
    this.ZD = paramZt4i.Zy;
  }
  
  public Zz3o ZM() {
    return this.Zy;
  }
  
  public String Zu() {
    return this.Zk;
  }
  
  public String Zv(String paramString) {
    return this.ZI.get(paramString);
  }
  
  protected String ZE() {
    return Zv(b(-959, -24044));
  }
  
  protected String ZB() {
    return Zv(b(-954, -10127));
  }
  
  private String ZQ() {
    return Zv(b(-957, -6887));
  }
  
  private String Zr() {
    return Zv(b(-958, -15549));
  }
  
  private List<String> Zk() {
    return this.ZZ.getOrDefault(b(-960, 16658), Collections.emptyList());
  }
  
  public List<Zzjv> ZC() {
    return this.ZP;
  }
  
  public boolean ZU() {
    return !this.ZP.isEmpty();
  }
  
  public List<Zrtj> Zh() {
    return this.ZD;
  }
  
  public final Ze7 Zc(Zkg3 paramZkg3, Zzmb paramZzmb) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZG : Lnet/portswigger/browser/Zel;
    //   4: sipush #-946
    //   7: sipush #8526
    //   10: invokestatic b : (II)Ljava/lang/String;
    //   13: invokestatic requireNonNull : (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   16: pop
    //   17: aload_0
    //   18: aload_1
    //   19: aload_2
    //   20: <illegal opcode> ZH : (Lburp/Zm3y;Lburp/Zkg3;Lburp/Zzmb;)Lnet/portswigger/browser/Zt_;
    //   25: invokestatic Zc : (Lnet/portswigger/browser/Zt_;)Lnet/portswigger/browser/Ze7;
    //   28: aload_2
    //   29: invokeinterface Zi : ()Ljava/time/Duration;
    //   34: invokestatic Zr : (Ljava/time/Duration;)Lnet/portswigger/browser/Zje;
    //   37: invokevirtual ZY : (Lnet/portswigger/browser/Zt;)Lnet/portswigger/browser/Ze7;
    //   40: areturn
  }
  
  private boolean Zo(boolean paramBoolean) throws Ztk {
    Zh zh = this.ZG.Zq();
    try {
      if (paramBoolean)
        zh.ZQ(); 
    } catch (Ztk ztk) {
      throw a(null);
    } 
    try {
    
    } catch (Ztk ztk) {
      throw a(null);
    } 
    return zh.Zm((this.Zy == Zz3o.FORM) ? b(-929, 13011) : b(-949, -15970));
  }
  
  private boolean Zg(Zkg3 paramZkg3, Zzmb paramZzmb) throws Ztk {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield ZD : Ljava/util/List;
    //   5: invokevirtual ZB : (Ljava/util/List;)Ljava/util/List;
    //   8: astore #4
    //   10: invokestatic Zu : ()[Lburp/Zbqc;
    //   13: aload #4
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore #5
    //   22: astore_3
    //   23: aload #5
    //   25: invokeinterface hasNext : ()Z
    //   30: ifeq -> 274
    //   33: aload #5
    //   35: invokeinterface next : ()Ljava/lang/Object;
    //   40: checkcast burp/Zrtj
    //   43: astore #6
    //   45: aload #6
    //   47: invokevirtual Zj : ()Lnet/portswigger/browser/Zel;
    //   50: astore #8
    //   52: aload #6
    //   54: invokevirtual ZN : ()Lburp/Zl2w;
    //   57: astore #9
    //   59: aload #9
    //   61: getstatic burp/Zl2w.SUBMIT : Lburp/Zl2w;
    //   64: if_acmpeq -> 23
    //   67: aload #9
    //   69: getstatic burp/Zl2w.IMAGE : Lburp/Zl2w;
    //   72: if_acmpne -> 82
    //   75: goto -> 23
    //   78: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   81: athrow
    //   82: aload #9
    //   84: getstatic burp/Zl2w.FILE : Lburp/Zl2w;
    //   87: if_acmpne -> 106
    //   90: aload #6
    //   92: invokestatic ZZ : (Lburp/Zrtj;)V
    //   95: aload_3
    //   96: ifnonnull -> 23
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   105: athrow
    //   106: aload #9
    //   108: getstatic burp/Zl2w.SELECT : Lburp/Zl2w;
    //   111: if_acmpeq -> 129
    //   114: aload #9
    //   116: getstatic burp/Zl2w.SELECT_MULTIPLE : Lburp/Zl2w;
    //   119: if_acmpne -> 144
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   128: athrow
    //   129: sipush #-945
    //   132: sipush #15597
    //   135: invokestatic b : (II)Ljava/lang/String;
    //   138: astore #7
    //   140: aload_3
    //   141: ifnonnull -> 216
    //   144: aload #9
    //   146: getstatic burp/Zl2w.RADIO : Lburp/Zl2w;
    //   149: if_acmpne -> 174
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   158: athrow
    //   159: sipush #-956
    //   162: sipush #-972
    //   165: invokestatic b : (II)Ljava/lang/String;
    //   168: astore #7
    //   170: aload_3
    //   171: ifnonnull -> 216
    //   174: aload #9
    //   176: getstatic burp/Zl2w.CHECKBOX : Lburp/Zl2w;
    //   179: if_acmpne -> 204
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   188: athrow
    //   189: sipush #-951
    //   192: sipush #-9265
    //   195: invokestatic b : (II)Ljava/lang/String;
    //   198: astore #7
    //   200: aload_3
    //   201: ifnonnull -> 216
    //   204: aload #6
    //   206: invokevirtual Ze : ()Ljava/lang/String;
    //   209: aload #9
    //   211: invokestatic Zj : (Ljava/lang/String;Lburp/Zl2w;)Ljava/lang/String;
    //   214: astore #7
    //   216: aload #8
    //   218: invokeinterface Zq : ()Lnet/portswigger/browser/Zh;
    //   223: astore #10
    //   225: aload_2
    //   226: invokeinterface Zd : ()Z
    //   231: ifeq -> 248
    //   234: aload #10
    //   236: invokeinterface ZQ : ()V
    //   241: goto -> 248
    //   244: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   247: athrow
    //   248: aload #10
    //   250: aload #7
    //   252: invokeinterface Zm : (Ljava/lang/String;)Z
    //   257: istore #11
    //   259: iload #11
    //   261: ifne -> 270
    //   264: iconst_0
    //   265: ireturn
    //   266: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   269: athrow
    //   270: aload_3
    //   271: ifnonnull -> 23
    //   274: iconst_1
    //   275: ireturn
    // Exception table:
    //   from	to	target	type
    //   67	78	78	net/portswigger/browser/Ztk
    //   82	99	102	net/portswigger/browser/Ztk
    //   106	122	125	net/portswigger/browser/Ztk
    //   140	152	155	net/portswigger/browser/Ztk
    //   170	182	185	net/portswigger/browser/Ztk
    //   225	241	244	net/portswigger/browser/Ztk
    //   259	266	266	net/portswigger/browser/Ztk
  }
  
  private static void ZZ(Zrtj paramZrtj) throws Ztk {
    try {
      if (Zsw8.ZP(paramZrtj.Ze()))
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      File file = Zs(paramZrtj);
      Files.write(file.toPath(), Zkb.Zy(paramZrtj.Ze()), new java.nio.file.OpenOption[0]);
      Zh zh = paramZrtj.Zj().Zq();
      zh.ZP(new Path[] { file.toPath() });
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.RETHROWN);
      throw new Zt1(iOException);
    } 
  }
  
  private static String Zj(String paramString, Zl2w paramZl2w) {
    String str = (paramZl2w == Zl2w.TEXTAREA) ? b(-953, -18486) : b(-930, 12981);
    return String.format(b(-955, 31852), new Object[] { str, (paramString == null) ? "" : Zzc.Zq(paramString) });
  }
  
  private static File Zs(Ze7n paramZe7n) throws IOException {
    String str = paramZe7n.Zu().<String>map(Zegu::ZB).orElse(b(-950, -29451));
    Path path = Files.createTempDirectory(b(-952, 20069), (FileAttribute<?>[])new FileAttribute[0]);
    return path.resolve(str).toFile();
  }
  
  public Zm6i Zw() {
    Zbqc[] arrayOfZbqc = Zres.Zu();
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[1]); 
    return (new Zkhp()).Zm(ZB()).Zl(ZM()).ZG(ZE()).ZM(Zu()).ZS(ZQ()).ZU(Zr()).Zg(Zk()).Zn(ZC()).Zy(Zh().stream().map(Ze7n::Zn).toList()).ZW();
  }
  
  public String toString() {
    return ZO();
  }
  
  public String ZO() {
    return String.format(b(-948, 30717), new Object[] { this.Zy, this.Zk, ZB(), ZE() });
  }
  
  public boolean Zp(Zg8y paramZg8y) {
    Zbqc[] arrayOfZbqc = Zres.Zu();
    if (paramZg8y instanceof Zm3y) {
      Zm3y zm3y = (Zm3y)paramZg8y;
      if (arrayOfZbqc != null)
        return (Objects.equals(this.Zk, zm3y.Zk) && Objects.equals(this.ZP, zm3y.ZP) && Objects.equals(this.ZD, zm3y.ZD) && ((Boolean)Zmxe.<Boolean>Za(Zr(), zm3y::lambda$matches$1, ZQ(), zm3y::lambda$matches$2, Zk(), zm3y::lambda$matches$3)).booleanValue()); 
    } 
    return false;
  }
  
  private static Boolean lambda$matches$3(Zm3y paramZm3y, List paramList) {
    return Boolean.valueOf(paramList.equals(paramZm3y.Zk()));
  }
  
  private static Boolean lambda$matches$2(Zm3y paramZm3y, String paramString) {
    return Boolean.valueOf(paramString.equals(paramZm3y.ZQ()));
  }
  
  private static Boolean lambda$matches$1(Zm3y paramZm3y, String paramString) {
    return Boolean.valueOf(paramString.equals(paramZm3y.Zr()));
  }
  
  private void lambda$findAndInteract$0(Zkg3 paramZkg3, Zzmb paramZzmb, Zjw paramZjw) throws Ztk, InterruptedException {
    // Byte code:
    //   0: aload_3
    //   1: invokeinterface Zx : ()Lnet/portswigger/browser/Zd0;
    //   6: invokeinterface ZG : ()V
    //   11: aload_0
    //   12: aload_1
    //   13: aload_2
    //   14: invokevirtual Zg : (Lburp/Zkg3;Lburp/Zzmb;)Z
    //   17: ifeq -> 48
    //   20: aload_0
    //   21: aload_2
    //   22: invokeinterface Zd : ()Z
    //   27: invokevirtual Zo : (Z)Z
    //   30: ifeq -> 48
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   39: athrow
    //   40: iconst_1
    //   41: goto -> 49
    //   44: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   47: athrow
    //   48: iconst_0
    //   49: istore #4
    //   51: iload #4
    //   53: ifne -> 77
    //   56: new net/portswigger/browser/Zt1
    //   59: dup
    //   60: sipush #-947
    //   63: sipush #-14542
    //   66: invokestatic b : (II)Ljava/lang/String;
    //   69: invokespecial <init> : (Ljava/lang/String;)V
    //   72: athrow
    //   73: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: return
    // Exception table:
    //   from	to	target	type
    //   0	33	36	net/portswigger/browser/Ztk
    //   20	44	44	net/portswigger/browser/Ztk
    //   51	73	73	net/portswigger/browser/Ztk
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'QmëÈP8a®¥âgvpË³÷ï\\bêè¿#1ö©*l.Ó³ßà?Y{g×(Lê,?hÜ1=¢ DÙ^§VMáÍ¯  qt«»&ë¾%c7±ú2öæª2Rï¹X8C¨´JÂsÁÞaÜ£ôÔ[ï}ï_>ýtÊ2\\b¤-ß+ØäØÅ¸Ð¬,Òïâ~¸È«e¨0Ò\\rÑµYü÷üÌÒ Ûn±]í¶(µêjÃyì¤d<&P£W:àä0áPG>"ät NÐó§Æ hO¡o&¦OW\\ríÞy÷R0\\n zÎ[%Kì©PÑw\\bÂboì=¨,JÏtñÇ,}ù»ÃW0*Ë¡¢ìþÂp)Éµ÷Ú¯ÀÞËf\lÅ{SÄâ.AE ÅdÈÇåÁ±¡9¨ 7Ø>§´ÏJ¤=½7iã¤ÈÓ§hîí@!aõQÖð{-\\n!\\f¯å'nÐu:/¨ nFºQ£aºgSJGÒi«YË úðX¢beþôá¿^õXs\\fÈÏìÕ·öq¥'àq­\\nØò o9RÂÄ$>­$ä¬x¶ô]ÜY|Ëâ,8[qv}Ãá&Ãèî¡o´l¥:iaÙþGNøW]ïiC£­SEø¸âôË·='ÕS¨op¢ä7^!S1¼%8²MTßK\\tw.¸-5se½ÖË°»(J¨%ÐdT¼Q¤WFx7ÈI-«ÈJÞy²VoºEæm!|¢¶fe²YÊ.ä.-È®G@ìlúþV4ìU0÷C¢ÀfÌpbÖ3äe.\\tc*zÌ9YæÁ«/ô%ÕCq *Okä>az¢mÐ¦Á\\nüxÐ$"vwµ¹ZÍ¡çÇæsa¨U°Ç%1ð<Hz{+è¦zõ¬r².GÏH0çOQâñýæ ´Ë¥PUÛÜàìa·°é¨ÛPì³z56V¬à eå2Çûv]O£Nvu0\\r°"ÏåÓ21ë9_Uúµéb³0ýuçËÑ}\\bm¨$"WnvÕ}¦ºßÎyô¸¦à¥³S×À¼wïùì Ñ&/ñÄðÜs¤Í*ÿ\\fbÕg®\\b3Ó¤ĬòÒÖ¿mó¼Z|¥»g\ÐØI°M)ñ\\f»T?*+2F\\bÍ°©·Ë}¯Qùî}s1X÷;!`©nJûÜô\\n¬f\\f²Hð;ÜÛ¸¦Õ Ý$Õ¥dýÖ6Qº[ÆÃKÁÈÈ?qÓºñPÁoÁT8õHðKjd#löÀ²ßá5eð/û.&Ìak¶/øórpñv)ß!À*ImÍBZ¶ÙjÿÖ"TO±ÕòùN2â¾\\rYéwnt{¼.`ú©ÓñÕp9ê ázèôwäÔ)63÷Ã@æJØÙà!Rf+ÏîNå[àGõ[GvK$§CRý6xX;ìôsñ¾Ê cw2ñ\\n05*'4ãDÕóâkïqèüMmP\\t-1)!ËK©BW^ÜC$²â)\\n ¨¦&RS<''
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #528
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #114
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 145
    //   41: aload #5
    //   43: swap
    //   44: iload_3
    //   45: iinc #3, 1
    //   48: swap
    //   49: aastore
    //   50: iload_0
    //   51: iload_1
    //   52: iadd
    //   53: dup
    //   54: istore_0
    //   55: iload #4
    //   57: if_icmpge -> 69
    //   60: aload_2
    //   61: iload_0
    //   62: invokevirtual charAt : (I)C
    //   65: istore_1
    //   66: goto -> 24
    //   69: ldc ',>@ï\\f{1/\\rî*ÂÎ1ÚL² )é\\tRd¿(Ióf"g¡jwx}ÑÄ,LÓÐ}Ìdßðaêz&ÆP]­C÷+õÊ{¦Q¯[UKçâèÌl·û}ü>êbåiÌjQp*\\nâÅ®îâ Db0Ub¶úÀV¦^½%9\\fÝ(ËCø~Ù .Y¿;£ñ¨²'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: sipush #146
    //   81: istore_1
    //   82: iconst_m1
    //   83: istore_0
    //   84: bipush #29
    //   86: iinc #0, 1
    //   89: aload_2
    //   90: iload_0
    //   91: dup
    //   92: iload_1
    //   93: iadd
    //   94: invokevirtual substring : (II)Ljava/lang/String;
    //   97: iconst_0
    //   98: goto -> 145
    //   101: aload #5
    //   103: swap
    //   104: iload_3
    //   105: iinc #3, 1
    //   108: swap
    //   109: aastore
    //   110: iload_0
    //   111: iload_1
    //   112: iadd
    //   113: dup
    //   114: istore_0
    //   115: iload #4
    //   117: if_icmpge -> 129
    //   120: aload_2
    //   121: iload_0
    //   122: invokevirtual charAt : (I)C
    //   125: istore_1
    //   126: goto -> 84
    //   129: aload #5
    //   131: putstatic burp/Zm3y.c : [Ljava/lang/String;
    //   134: bipush #18
    //   136: anewarray java/lang/String
    //   139: putstatic burp/Zm3y.d : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 264
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #88
    //   218: goto -> 248
    //   221: bipush #69
    //   223: goto -> 248
    //   226: bipush #127
    //   228: goto -> 248
    //   231: bipush #107
    //   233: goto -> 248
    //   236: bipush #92
    //   238: goto -> 248
    //   241: bipush #82
    //   243: goto -> 248
    //   246: bipush #15
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 168
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 164
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 41, 0 -> 101
    //   304: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFC4F) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      char c = 'å';
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm3y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */