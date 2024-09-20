package burp;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.concurrent.atomic.AtomicReference;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

public class Zg5d {
  private final Zkbz ZN;
  
  private final Zerg ZD;
  
  private final Zr_4 ZM;
  
  private final Ztwv Zq;
  
  private final Zeew Zx;
  
  private static int[] ZC;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zg5d(Zerg paramZerg, Zr_4 paramZr_4, Ztwv paramZtwv, Zeew paramZeew) {
    this.ZD = paramZerg;
    this.ZM = paramZr_4;
    this.Zq = paramZtwv;
    this.Zx = paramZeew;
    this.ZN = new Zkbz();
  }
  
  public Component ZR(Zmgv paramZmgv, Zlbp paramZlbp, boolean paramBoolean, Zgu3 paramZgu3, Zey9 paramZey9) {
    // Byte code:
    //   0: invokestatic Zn : ()[I
    //   3: astore #6
    //   5: aload_1
    //   6: invokeinterface ZoO : ()Lburp/Zstu;
    //   11: astore #7
    //   13: aload #7
    //   15: ifnull -> 26
    //   18: aload #7
    //   20: invokestatic ZY : (Lburp/Zstu;)Ljava/util/Optional;
    //   23: goto -> 29
    //   26: invokestatic empty : ()Ljava/util/Optional;
    //   29: astore #8
    //   31: new burp/Zztv
    //   34: dup
    //   35: sipush #18880
    //   38: sipush #26992
    //   41: invokestatic a : (II)Ljava/lang/String;
    //   44: invokespecial <init> : (Ljava/lang/String;)V
    //   47: astore #9
    //   49: aload #9
    //   51: aload_0
    //   52: sipush #18882
    //   55: sipush #23908
    //   58: invokestatic a : (II)Ljava/lang/String;
    //   61: sipush #18887
    //   64: sipush #-27097
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: aload_2
    //   71: iload_3
    //   72: aload #4
    //   74: aload #5
    //   76: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_GRAPHQL_SET_INTROSPECTION_QUERY : Lburp/Zrrh;
    //   79: invokevirtual ZY : (Ljava/lang/String;Ljava/lang/String;Lburp/Zlbp;ZLburp/Zgu3;Lburp/Zey9;Lburp/Zrrh;)Lburp/Zepe;
    //   82: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   85: pop
    //   86: aload #9
    //   88: aload_0
    //   89: sipush #18884
    //   92: sipush #24524
    //   95: invokestatic a : (II)Ljava/lang/String;
    //   98: sipush #18885
    //   101: sipush #-30960
    //   104: invokestatic a : (II)Ljava/lang/String;
    //   107: aload_2
    //   108: iload_3
    //   109: aload #4
    //   111: aload #5
    //   113: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_GRAPHQL_SET_LEGACY_INTROSPECTION_QUERY : Lburp/Zrrh;
    //   116: invokevirtual ZY : (Ljava/lang/String;Ljava/lang/String;Lburp/Zlbp;ZLburp/Zgu3;Lburp/Zey9;Lburp/Zrrh;)Lburp/Zepe;
    //   119: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   122: pop
    //   123: aload #9
    //   125: new javax/swing/JSeparator
    //   128: dup
    //   129: invokespecial <init> : ()V
    //   132: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   135: pop
    //   136: new burp/Zepe
    //   139: dup
    //   140: sipush #18886
    //   143: sipush #-17334
    //   146: invokestatic a : (II)Ljava/lang/String;
    //   149: invokespecial <init> : (Ljava/lang/String;)V
    //   152: astore #10
    //   154: aload #10
    //   156: aload #8
    //   158: invokevirtual isPresent : ()Z
    //   161: invokevirtual setEnabled : (Z)V
    //   164: aload #8
    //   166: aload_0
    //   167: aload #10
    //   169: aload_1
    //   170: aload #5
    //   172: <illegal opcode> accept : (Lburp/Zg5d;Lburp/Zepe;Lburp/Zmgv;Lburp/Zey9;)Ljava/util/function/Consumer;
    //   177: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   180: aload #9
    //   182: aload #10
    //   184: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   187: pop
    //   188: aload #9
    //   190: invokestatic Zwu : ()[Lburp/Zbqc;
    //   193: ifnonnull -> 202
    //   196: iconst_5
    //   197: newarray int
    //   199: invokestatic ZG : ([I)V
    //   202: areturn
  }
  
  private Zepe ZY(String paramString1, String paramString2, Zlbp paramZlbp, boolean paramBoolean, Zgu3 paramZgu3, Zey9 paramZey9, Zrrh paramZrrh) {
    // Byte code:
    //   0: aload #5
    //   2: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   5: if_acmpne -> 17
    //   8: iload #4
    //   10: ifeq -> 17
    //   13: iconst_1
    //   14: goto -> 18
    //   17: iconst_0
    //   18: istore #8
    //   20: new burp/Zepe
    //   23: dup
    //   24: aload_1
    //   25: aload #5
    //   27: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   30: if_acmpeq -> 45
    //   33: sipush #18881
    //   36: sipush #-24129
    //   39: invokestatic a : (II)Ljava/lang/String;
    //   42: goto -> 47
    //   45: ldc ''
    //   47: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   52: invokespecial <init> : (Ljava/lang/String;)V
    //   55: astore #9
    //   57: aload #9
    //   59: iload #8
    //   61: invokevirtual setEnabled : (Z)V
    //   64: iload #8
    //   66: ifeq -> 86
    //   69: aload #9
    //   71: aload_0
    //   72: aload #7
    //   74: aload_3
    //   75: aload_2
    //   76: aload #6
    //   78: <illegal opcode> actionPerformed : (Lburp/Zg5d;Lburp/Zrrh;Lburp/Zlbp;Ljava/lang/String;Lburp/Zey9;)Ljava/awt/event/ActionListener;
    //   83: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   86: aload #9
    //   88: areturn
  }
  
  private void Zo(Zlbp paramZlbp, String paramString, Zey9 paramZey9) {
    AtomicReference<Zsmh> atomicReference = new AtomicReference();
    paramZlbp.Zh(new Zgf_(this, atomicReference));
    Zsmh zsmh = atomicReference.get();
    Zefx zefx = this.ZN.Ze(paramZey9.Zy(zsmh), paramString, "", true);
    paramZlbp.Zj(zefx.Zb().ZD());
  }
  
  private void ZH(Zmzk paramZmzk, Zey9 paramZey9, Zk_ paramZk_, Zsmh paramZsmh) {
    // Byte code:
    //   0: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_GRAPHQL_ADD_INTROSPECTION_ITEMS_TO_SITE_MAP : Lburp/Zrrh;
    //   3: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   6: aload_3
    //   7: invokevirtual Zq : ()Ljava/util/Optional;
    //   10: aconst_null
    //   11: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   14: checkcast burp/Zsvv
    //   17: astore #5
    //   19: aload #5
    //   21: ifnonnull -> 58
    //   24: getstatic burp/Zze0.SUITE_MESSAGE_EDITOR_GRAPHQL_INTROSPECTION_PARSE_FAILED : Lburp/Zze0;
    //   27: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   30: getstatic burp/Zmgc.GRAPHQL_INTROSPECTION_PARSE_FAILED : Lburp/Zmgc;
    //   33: aload_0
    //   34: getfield ZD : Lburp/Zerg;
    //   37: aload_0
    //   38: getfield Zx : Lburp/Zeew;
    //   41: invokevirtual ZI : (Lburp/Zeew;)Lburp/Zx8n;
    //   44: invokeinterface ZY4 : ()Lburp/Zskh;
    //   49: iconst_0
    //   50: anewarray java/lang/Object
    //   53: invokevirtual ZV : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   56: pop
    //   57: return
    //   58: aload_0
    //   59: getfield Zq : Lburp/Ztwv;
    //   62: aload_0
    //   63: aload #5
    //   65: aload_1
    //   66: aload_2
    //   67: aload #4
    //   69: <illegal opcode> run : (Lburp/Zg5d;Lburp/Zsvv;Lburp/Zmzk;Lburp/Zey9;Lburp/Zsmh;)Ljava/lang/Runnable;
    //   74: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   79: pop
    //   80: return
  }
  
  private void Zr(Zmzk paramZmzk, Zey9 paramZey9, Zsvv paramZsvv, Zggo paramZggo, Zsmh paramZsmh) {
    try {
      this.ZD.ZA().Zj(paramZmzk, Zp(paramZsvv, paramZey9, paramZggo, this.ZM, paramZsmh), null, "", null);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private Zstu Zp(Zsvv paramZsvv, Zey9 paramZey9, Zggo paramZggo, Zr_4 paramZr_4, Zsmh paramZsmh) {
    Zsda zsda = Zsda.ZF();
    Zzx2 zzx2 = Zxxq.ZZ(paramZsvv, paramZggo, zsda, new Zr90());
    Zefx zefx = paramZey9.Zy(paramZsmh);
    Zrdu zrdu = zefx.ZZ(Zg5d::lambda$buildRequestFor$5).stream().map(Zg5d::lambda$buildRequestFor$6).findFirst().orElse(Zrdu.URL_PARAM);
    zefx = zefx.ZN(new Zrtz(zzx2.Zj(), zefx.Zr(), zrdu, zsda.Zv()));
    return paramZr_4.ZZ(zefx.Zt().ZD());
  }
  
  private static Zrdu lambda$buildRequestFor$6(Zlou paramZlou) {
    return paramZlou.Zx;
  }
  
  private static boolean lambda$buildRequestFor$5(Zlou paramZlou) {
    return paramZlou.ZA.equals(a(18883, -29886));
  }
  
  private void lambda$addIntrospectionTypesToSiteMap$4(Zsvv paramZsvv, Zmzk paramZmzk, Zey9 paramZey9, Zsmh paramZsmh) {
    // Byte code:
    //   0: aload_1
    //   1: iconst_2
    //   2: anewarray burp/Zmfl
    //   5: dup
    //   6: iconst_0
    //   7: getstatic burp/Zmfl.QUERY : Lburp/Zmfl;
    //   10: aastore
    //   11: dup
    //   12: iconst_1
    //   13: getstatic burp/Zmfl.MUTATION : Lburp/Zmfl;
    //   16: aastore
    //   17: invokevirtual ZO : ([Lburp/Zmfl;)Ljava/util/List;
    //   20: aload_0
    //   21: aload_2
    //   22: aload_3
    //   23: aload_1
    //   24: aload #4
    //   26: <illegal opcode> accept : (Lburp/Zg5d;Lburp/Zmzk;Lburp/Zey9;Lburp/Zsvv;Lburp/Zsmh;)Ljava/util/function/Consumer;
    //   31: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   36: return
  }
  
  private void lambda$addIntrospectionTypesToSiteMap$3(Zmzk paramZmzk, Zey9 paramZey9, Zsvv paramZsvv, Zsmh paramZsmh, Zggo paramZggo) {
    Zr(paramZmzk, paramZey9, paramZsvv, paramZggo, paramZsmh);
  }
  
  private void lambda$createIntrospectionMenuItem$2(Zrrh paramZrrh, Zlbp paramZlbp, String paramString, Zey9 paramZey9, ActionEvent paramActionEvent) {
    Zm2.ZC(paramZrrh);
    Zo(paramZlbp, paramString, paramZey9);
  }
  
  private void lambda$getGraphQLMenu$1(Zepe paramZepe, Zmgv paramZmgv, Zey9 paramZey9, Zk_ paramZk_) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: aload_2
    //   3: aload_3
    //   4: aload #4
    //   6: <illegal opcode> actionPerformed : (Lburp/Zg5d;Lburp/Zmgv;Lburp/Zey9;Lburp/Zk_;)Ljava/awt/event/ActionListener;
    //   11: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   14: return
  }
  
  private void lambda$getGraphQLMenu$0(Zmgv paramZmgv, Zey9 paramZey9, Zk_ paramZk_, ActionEvent paramActionEvent) {
    ZH(paramZmgv.Zod(), paramZey9, paramZk_, paramZmgv.Zo3().ZP(paramZmgv.Zod(), paramZey9));
  }
  
  public static void ZG(int[] paramArrayOfint) {
    ZC = paramArrayOfint;
  }
  
  public static int[] Zn() {
    return ZC;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic ZG : ([I)V
    //   13: ldc '¶ÄB¶\\bÊÌìl`«îzr#÷µrÆcõWÝP3k"Ã¢lEåÝÅ´å©ÇåcԞÒZóÑ¿¹u¥¿¹=ããEÌ8É$V÷xÁò¯VÐòâ|ÇTFCT%tþuic®y"`êý½Sfìn`Z{_o|éÜÒáBf³z»²à|lTw$ÞÈ IÔYð³Uê£èÿhW+\¨v¹\\n¶W³zC´Þ[&ü³§SV]ñK÷¹ìQ\\rþ$ $t­æÒ«¸ÌîJ&ÿ\\t¶yÍ#ÀtàùFÄ~U2` ÷¢3©ñBdçc¿¦iN$¡y£X.ðsÓíéUJÎ.¨þGÃõ8¦]/(^á"1ëNê¾,!\\b±\\bû3sÐ¥Ãy¸ÇM­"ú_nqÎ>!°~íypÒ-i^ßCQ/VÀt;uº:áÁÆOæ!*ú3zä¸^Î$Wó° }é8´ô#ÄQc¡n£º.¬sXÉU¦kÂÐ4%Ô­1B©^ì`W{° _é|ÿï&09PhñæÙ×Ã"Ø£Û*qjÇZÅeóOU§a/À«`ú)@Zo ñtõWs²Ü`Dp¦yÀdS¿ïXùH]0·>EEvÄwc3øÐÒ¡æCüaüGöÌ¾|3bÎ[4Æ±c©ÿÂHÐç ks7P¹9Qdq.ÓR\\rZ´Â.P;ºÝQâü FÉ5®ÑÁ§(º=!rÙÙLar®ç¢¨¡b_0h£Yù(²Æàá5KüÏÂòÏ)£ÞÂñ\\fÇìYÌ~a¸vìxPò)éÞ/pÂ<= ÷ùËÄÏU=÷ /TGwµÈ ® ÞæueÿD¤H¨s·av[xâ·W>¯gï^ Í]7-!~Ä4EcLí¼F!L.W3³Xk/wêÈëÔg1ÍÕ§RZ}©¿Íã¶àí*¦VaH#xX!ó]^4vÁûÃÉµÄ!ïp\\bywDÓÈ\\bJÍCÊ.HcW }s°Û|w½mÑÖ òe@)?R²uK×È¯´Â-ÇÓ2ûñ÷¢Æ÷¯¤"\\f÷WC]È\\tä¶ë'Y\#RUÓTdvÕÆÚ¦5£ü`oõq%ÊI8«¼\\n$Iî¾ª®C]\\tIq~ç"ý±'°ìý¤¡¹§èèæû^©v{_&Öå7qYÐ×McÐ÷ZÞ,:ýgÔÒgÍÆÉÊ ª\\tPþV¸ôÍúz+Gæ§ BmqÅ÷g\\f)¯÷²£<à1ÑìëÔ&89\\ræ¹z¨V[ óUR÷Qíiwà/l.T\\bwÈ©Ú\\twÀÔ]ÿ,¯|Àt®¢Xð3éBMb çãs7÷gTTU­Íñ©ã6-G@½å-'ô7=Bk¤Cepöõ#:õôd\\b·ÎE©PÈ!¯\\rÆXÊÒdÆÖ#'àu¯tcÚ¦F£Á¥?e¾6â=êj ÚcNÑ­ â¤qxÿ]Ì<îÝ&\\r\\t\¶üÇ-"LÒ ¨¶Ø+Ë¹Ï´EËóíhdÀqY«ÐÃ×m±8W` ÁÅHsÐ£çã&r³ÚÛíý\\tDry6â;Ë#ùÒò§ÉcÚòç§ôâG¥ÕîAkå+8\\n{%_¸\\fyôu82a ÊK2v7*áðB&ìÂ TÜÑ;.ÖäIt'M'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: iconst_5
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #59
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 147
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: ldc 'ÙR)dáòMû½ûYäÇ8ï]pºH54ñNÛ1ÞZ\\n|HÓ4(Ñ² mb  õ>¤á\§ ²vkÚ©`CUw:ÙûùI¥ÂOe¾Fgõ­âÇÆÃã ñíÊ¸ô-eNðôLÉ>£ü}:vp\\t¸¹â\\f*xÆ¸c¢Qú)HAÐ¨Ã%_©Óàkj`p[¹ñ\\fF4®«©ýò.É¥þÃ|üØ(clß¥L.²³[uÈyí@\\bzy8v[ó9)¿)(\\rRÐ·-1´¿Ì¢6Yû|È"ÔIã;TSÚ~ÆþDhyoºõÍÏ½Äà/Ç ×ÏMSý²¾`º7!ë*ß©67§hu'\\fG\\nò¯Å¥.Û³vKÞôÊ;þ0h6åË.½jM²Mu;ª\#Yj¨;W}àÞxè¦óÎ:1¼ÀÔ¡&9ù?Æ½-.Q(Qðh/0²±'²k@`;ÝsÑÿÝcèS¥qOqB·p]Ë*#Ô%Í/ÄbmwÛ¨.rò¹G:Õ^LË3+1Òø$ö'Ñîõuc;ö\îÏ+{\X¯<éãeùDIe £µKA¢âE.È!?Óä4ê`&»^\\bøNDlÓVJ?rC?V<£ß2is°ÄBîEàÿ«eNÚÄfÁuc3¶­Óz0ÂîâÆ®~è÷£3mk:¥Ý¥Ôý¶®·/¡R®q£#I3òæéj°R¤Ùñ £ZO=äÎ¾¡¼\\tÀ uïLõ\\fÞ[©zø?I³_{Ö8mÒË1¾Tî^F,MÕÓª¹Ï\\fÒ¦ìÂØeôõ°³Â,ü.0\\t,ÞÒlÀ¶`ÕðK(çì2Í\\nWÚfF&x\\t,ÿÝ9ALª·âµQKÞÚb Ìà>¸Ý÷GýUpgáß.ç±©¸!"Z¯îÑå¢]\\fÐú6LBh½®^èª\\tnÔKã(µ\\bVÆP§9f´ðCÌgüpÕ¡OìÎÊn¥#ÅáPËp© NáòJSt=9yYÅ?H§a¹i0cÖÈmË,×M*Ý:C\\nDÚ]Ñi'í¾EÆîºà «N%ÊÏþõNÿìj°=ó6s¦È½þèïïõnÎ\H9ªo`¸FrQv/GÊLZ=äÖ'S_}wÕYöÜ¥âÃ\\b\\f¸?F·Ü³2tò9¯EÈÿú<êÆ\\nS<ír8Ý:ìð\\t+Óy¯BfD;øÐ|ìtÏÙNå·@WîÁ:Å¢Ö§ÿR\\rB28×Èp Ì­k&½RNv\\nÇ¨\\fèÝ­ç®Fb>9î·F.Rþr¹\\tNV¼¾åÆÙªóõ=9R<ºàn:ä×"z9âºº¦\\rqÚÁ\\bN\\fôo{³¢¿þ£©y\\bx¶íÄ°¥\\nJ·V-÷6I\ýO¾çMöÂG{ÕbGùÓIw[ÿ²P]iÖª/nÀOO^sð>5p<~¸®/ºlt³GÁr8m:úðÅkªàÌFlóûsB9ÿ½ÄÁXÏJ\\fr÷CÃ?Ï è­¸_§{âÎÑ¾Îv\\b©ÆÐ ¶eÐcuÀ×\\t¶OIZ'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: sipush #1301
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #86
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zg5d.a : [Ljava/lang/String;
    //   136: bipush #8
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zg5d.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #125
    //   218: goto -> 248
    //   221: bipush #64
    //   223: goto -> 248
    //   226: bipush #96
    //   228: goto -> 248
    //   231: bipush #39
    //   233: goto -> 248
    //   236: bipush #14
    //   238: goto -> 248
    //   241: bipush #71
    //   243: goto -> 248
    //   246: bipush #47
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 43, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x49C3) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg5d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */