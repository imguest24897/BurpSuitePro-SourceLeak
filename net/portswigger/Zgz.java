package net.portswigger;

import java.util.Optional;
import java.util.stream.Stream;

public class Zgz {
  private final Zid Zu;
  
  public Zgz(Zid paramZid) {
    this.Zu = paramZid;
  }
  
  public Stream<Zrmf> Zo(Zrmf paramZrmf) {
    Zqa zqa = (new Zqa(paramZrmf)).ZH(this.Zu.ZZ());
    return Stream.of(ZE(zqa, this.Zu).<Zrmf>map(Zqa::ZG).orElse(zqa.ZG()));
  }
  
  Optional<Zqa> ZE(Zqa paramZqa, Zid paramZid) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual ZE : ()Lnet/portswigger/Zav;
    //   4: astore_3
    //   5: new net/portswigger/Zsw
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore #4
    //   14: aload_3
    //   15: invokevirtual Zi : ()Ljava/util/Map;
    //   18: aload_2
    //   19: aload_3
    //   20: aload #4
    //   22: <illegal opcode> accept : (Lnet/portswigger/Zid;Lnet/portswigger/Zav;Lnet/portswigger/Zsw;)Ljava/util/function/BiConsumer;
    //   27: invokeinterface forEach : (Ljava/util/function/BiConsumer;)V
    //   32: aload #4
    //   34: aload_2
    //   35: invokestatic Z_ : (Lnet/portswigger/Zid;)Ljava/util/List;
    //   38: invokevirtual ZX : (Ljava/util/List;)Lnet/portswigger/Zsw;
    //   41: pop
    //   42: aload_1
    //   43: aload #4
    //   45: invokevirtual Zp : ()Lnet/portswigger/Zkm;
    //   48: invokevirtual ZR : (Lnet/portswigger/Zms;)Lnet/portswigger/Zqa;
    //   51: pop
    //   52: aload_1
    //   53: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   56: areturn
  }
  
  private static void lambda$getMultipartRequest$0(Zid paramZid, Zav paramZav, Zsw paramZsw, String paramString, Zoc paramZoc) {
    // Byte code:
    //   0: invokestatic Zl : ()[Ljava/lang/String;
    //   3: aload #4
    //   5: invokevirtual ZF : ()Lnet/portswigger/Zav;
    //   8: astore #6
    //   10: astore #5
    //   12: aload #6
    //   14: invokevirtual Zg : ()Lnet/portswigger/Ziq;
    //   17: astore #7
    //   19: aload_0
    //   20: aload #6
    //   22: aload_3
    //   23: invokestatic Zt : (Lnet/portswigger/Zid;Lnet/portswigger/Zav;Ljava/lang/String;)Ljava/lang/String;
    //   26: astore #8
    //   28: aload #8
    //   30: invokestatic ZJ : (Ljava/lang/String;)Lnet/portswigger/Zu1;
    //   33: astore #9
    //   35: aload_1
    //   36: invokevirtual Zm : ()Ljava/util/List;
    //   39: ifnull -> 70
    //   42: aload_1
    //   43: invokevirtual Zm : ()Ljava/util/List;
    //   46: aload_3
    //   47: invokeinterface contains : (Ljava/lang/Object;)Z
    //   52: ifeq -> 70
    //   55: goto -> 62
    //   58: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   61: athrow
    //   62: iconst_1
    //   63: goto -> 71
    //   66: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   69: athrow
    //   70: iconst_0
    //   71: istore #10
    //   73: getstatic net/portswigger/Zrzu.Zx : [I
    //   76: aload #9
    //   78: invokevirtual ordinal : ()I
    //   81: iaload
    //   82: tableswitch default -> 307, 1 -> 112, 2 -> 167, 3 -> 167, 4 -> 263
    //   112: aload #6
    //   114: aload #6
    //   116: invokevirtual Zj : ()Ljava/util/stream/Stream;
    //   119: aconst_null
    //   120: iload #10
    //   122: aconst_null
    //   123: aload #6
    //   125: invokevirtual Zh : ()Ljava/lang/String;
    //   128: invokestatic ZG : (Lnet/portswigger/Zav;Ljava/util/stream/Stream;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;)Lnet/portswigger/Zms;
    //   131: astore #11
    //   133: aload_2
    //   134: new net/portswigger/Zv9
    //   137: dup
    //   138: invokespecial <init> : ()V
    //   141: aload_3
    //   142: invokevirtual ZT : (Ljava/lang/String;)Lnet/portswigger/Zv9;
    //   145: aload #8
    //   147: invokevirtual Zk : (Ljava/lang/String;)Lnet/portswigger/Zv9;
    //   150: aload #11
    //   152: invokevirtual ZH : (Lnet/portswigger/Zms;)Lnet/portswigger/Zv9;
    //   155: invokevirtual Zo : ()Lnet/portswigger/Zhw;
    //   158: invokevirtual Z_ : (Lnet/portswigger/Zms;)Lnet/portswigger/Zsw;
    //   161: pop
    //   162: aload #5
    //   164: ifnonnull -> 307
    //   167: new net/portswigger/Zv9
    //   170: dup
    //   171: invokespecial <init> : ()V
    //   174: aload_3
    //   175: invokevirtual ZT : (Ljava/lang/String;)Lnet/portswigger/Zv9;
    //   178: aload #8
    //   180: invokevirtual Zk : (Ljava/lang/String;)Lnet/portswigger/Zv9;
    //   183: astore #11
    //   185: aload #7
    //   187: getstatic net/portswigger/Ziq.OBJECT : Lnet/portswigger/Ziq;
    //   190: if_acmpne -> 213
    //   193: aload #6
    //   195: invokestatic Zq : (Lnet/portswigger/Zav;)Lnet/portswigger/Zf6;
    //   198: astore #12
    //   200: aload #11
    //   202: aload #12
    //   204: invokevirtual ZH : (Lnet/portswigger/Zms;)Lnet/portswigger/Zv9;
    //   207: pop
    //   208: aload #5
    //   210: ifnonnull -> 248
    //   213: aload #7
    //   215: getstatic net/portswigger/Ziq.ARRAY : Lnet/portswigger/Ziq;
    //   218: if_acmpne -> 248
    //   221: goto -> 228
    //   224: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   227: athrow
    //   228: aload #11
    //   230: aload #6
    //   232: iload #10
    //   234: invokestatic ZX : (Lnet/portswigger/Zav;Z)Lnet/portswigger/Zh2;
    //   237: invokevirtual ZH : (Lnet/portswigger/Zms;)Lnet/portswigger/Zv9;
    //   240: pop
    //   241: goto -> 248
    //   244: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   247: athrow
    //   248: aload_2
    //   249: aload #11
    //   251: invokevirtual Zo : ()Lnet/portswigger/Zhw;
    //   254: invokevirtual Z_ : (Lnet/portswigger/Zms;)Lnet/portswigger/Zsw;
    //   257: pop
    //   258: aload #5
    //   260: ifnonnull -> 307
    //   263: aload_2
    //   264: new net/portswigger/Zls
    //   267: dup
    //   268: invokespecial <init> : ()V
    //   271: aload_3
    //   272: invokevirtual Zh : (Ljava/lang/String;)Lnet/portswigger/Zls;
    //   275: aload #8
    //   277: invokevirtual Zv : (Ljava/lang/String;)Lnet/portswigger/Zls;
    //   280: aload #6
    //   282: invokevirtual ZD : ()Lnet/portswigger/Zrms;
    //   285: invokevirtual ZY : (Lnet/portswigger/Zrms;)Lnet/portswigger/Zls;
    //   288: iload #10
    //   290: invokevirtual Zy : (Z)Lnet/portswigger/Zls;
    //   293: invokevirtual Zk : ()Lnet/portswigger/Zl2;
    //   296: invokevirtual Z_ : (Lnet/portswigger/Zms;)Lnet/portswigger/Zsw;
    //   299: pop
    //   300: goto -> 307
    //   303: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   306: athrow
    //   307: return
    // Exception table:
    //   from	to	target	type
    //   35	55	58	net/portswigger/Zki
    //   42	66	66	net/portswigger/Zki
    //   200	221	224	net/portswigger/Zki
    //   213	241	244	net/portswigger/Zki
    //   248	300	303	net/portswigger/Zki
  }
  
  private static Zki a(Zki paramZki) {
    return paramZki;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zgz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */