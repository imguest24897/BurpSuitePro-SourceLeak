package net.portswigger;

import com.fasterxml.Zg.Zr;
import com.fasterxml.Zor.Zb;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class Zue {
  public static List<Zkm> Z_(Zid paramZid) {
    return Zoz.ZK(paramZid, paramZid::lambda$getExamples$0);
  }
  
  static Zkm Ze(Zid paramZid, Zr paramZr) {
    // Byte code:
    //   0: new net/portswigger/Zsw
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_1
    //   9: invokevirtual Zj : ()Ljava/util/Iterator;
    //   12: aload_0
    //   13: aload_2
    //   14: <illegal opcode> accept : (Lnet/portswigger/Zid;Lnet/portswigger/Zsw;)Ljava/util/function/Consumer;
    //   19: invokeinterface forEachRemaining : (Ljava/util/function/Consumer;)V
    //   24: aload_2
    //   25: invokevirtual Zp : ()Lnet/portswigger/Zkm;
    //   28: areturn
  }
  
  private static Optional<Zms> Zo(String paramString, Zoc paramZoc, Zb paramZb) {
    // Byte code:
    //   0: invokestatic Zl : ()[Ljava/lang/String;
    //   3: aload_1
    //   4: invokevirtual Zn : ()Ljava/lang/String;
    //   7: astore #4
    //   9: aload_1
    //   10: invokevirtual ZF : ()Lnet/portswigger/Zav;
    //   13: astore #5
    //   15: aload_0
    //   16: invokestatic ZJ : (Ljava/lang/String;)Lnet/portswigger/Zu1;
    //   19: astore #6
    //   21: astore_3
    //   22: aload #5
    //   24: invokevirtual Zg : ()Lnet/portswigger/Ziq;
    //   27: astore #7
    //   29: getstatic net/portswigger/Zho.ZN : [I
    //   32: aload #6
    //   34: invokevirtual ordinal : ()I
    //   37: iaload
    //   38: tableswitch default -> 216, 1 -> 68, 2 -> 90, 3 -> 90, 4 -> 183
    //   68: aload_2
    //   69: invokestatic ZB : (Lcom/fasterxml/Zor/Zb;)Ljava/util/Optional;
    //   72: aload #4
    //   74: aload_0
    //   75: <illegal opcode> apply : (Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Function;
    //   80: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   83: goto -> 219
    //   86: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   89: athrow
    //   90: new net/portswigger/Zv9
    //   93: dup
    //   94: invokespecial <init> : ()V
    //   97: aload #4
    //   99: invokevirtual ZT : (Ljava/lang/String;)Lnet/portswigger/Zv9;
    //   102: aload_0
    //   103: invokevirtual Zk : (Ljava/lang/String;)Lnet/portswigger/Zv9;
    //   106: astore #8
    //   108: aload #7
    //   110: getstatic net/portswigger/Ziq.OBJECT : Lnet/portswigger/Ziq;
    //   113: if_acmpne -> 137
    //   116: aload_2
    //   117: checkcast com/fasterxml/Zg/Zr
    //   120: invokestatic ZW : (Lcom/fasterxml/Zg/Zr;)Lnet/portswigger/Zf6;
    //   123: astore #9
    //   125: aload #8
    //   127: aload #9
    //   129: invokevirtual ZH : (Lnet/portswigger/Zms;)Lnet/portswigger/Zv9;
    //   132: pop
    //   133: aload_3
    //   134: ifnonnull -> 172
    //   137: aload #7
    //   139: getstatic net/portswigger/Ziq.ARRAY : Lnet/portswigger/Ziq;
    //   142: if_acmpne -> 172
    //   145: goto -> 152
    //   148: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   151: athrow
    //   152: aload #8
    //   154: aload_2
    //   155: checkcast com/fasterxml/Zg/Zh
    //   158: invokestatic Zd : (Lcom/fasterxml/Zg/Zh;)Lnet/portswigger/Zh2;
    //   161: invokevirtual ZH : (Lnet/portswigger/Zms;)Lnet/portswigger/Zv9;
    //   164: pop
    //   165: goto -> 172
    //   168: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   171: athrow
    //   172: aload #8
    //   174: invokevirtual Zo : ()Lnet/portswigger/Zhw;
    //   177: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   180: goto -> 219
    //   183: new net/portswigger/Zls
    //   186: dup
    //   187: invokespecial <init> : ()V
    //   190: aload #4
    //   192: invokevirtual Zh : (Ljava/lang/String;)Lnet/portswigger/Zls;
    //   195: aload_0
    //   196: invokevirtual Zv : (Ljava/lang/String;)Lnet/portswigger/Zls;
    //   199: aload #5
    //   201: invokevirtual ZD : ()Lnet/portswigger/Zrms;
    //   204: invokevirtual ZY : (Lnet/portswigger/Zrms;)Lnet/portswigger/Zls;
    //   207: invokevirtual Zk : ()Lnet/portswigger/Zl2;
    //   210: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   213: goto -> 219
    //   216: invokestatic empty : ()Ljava/util/Optional;
    //   219: areturn
    // Exception table:
    //   from	to	target	type
    //   29	86	86	net/portswigger/Zki
    //   125	145	148	net/portswigger/Zki
    //   137	165	168	net/portswigger/Zki
  }
  
  static Optional<Zoc> Zu(Zid paramZid, String paramString) {
    Zav zav = paramZid.ZE();
    return zav.Zi().entrySet().stream().filter(paramString::lambda$findSchemaForProperty$4).map(Map.Entry::getValue).findFirst();
  }
  
  private static boolean lambda$findSchemaForProperty$4(String paramString, Map.Entry paramEntry) {
    return paramString.equals(paramEntry.getKey());
  }
  
  private static Zms lambda$buildMultipartPartFragmentFromObjectNode$3(String paramString1, String paramString2, Zms paramZms) {
    return (new Zv9()).ZT(paramString1).Zk(paramString2).ZH(paramZms).Zo();
  }
  
  private static void lambda$buildMultipartFragmentFromObjectNode$2(Zid paramZid, Zsw paramZsw, Map.Entry paramEntry) {
    // Byte code:
    //   0: aload_2
    //   1: invokeinterface getKey : ()Ljava/lang/Object;
    //   6: checkcast java/lang/String
    //   9: astore_3
    //   10: aload_0
    //   11: aload_3
    //   12: invokestatic Zu : (Lnet/portswigger/Zid;Ljava/lang/String;)Ljava/util/Optional;
    //   15: aload_2
    //   16: aload_0
    //   17: aload_3
    //   18: aload_1
    //   19: <illegal opcode> accept : (Ljava/util/Map$Entry;Lnet/portswigger/Zid;Ljava/lang/String;Lnet/portswigger/Zsw;)Ljava/util/function/Consumer;
    //   24: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   27: return
  }
  
  private static void lambda$buildMultipartFragmentFromObjectNode$1(Map.Entry paramEntry, Zid paramZid, String paramString, Zsw paramZsw, Zoc paramZoc) {
    Zb zb = (Zb)paramEntry.getValue();
    String str = Zrmi.Zt(paramZid, paramZoc.ZF(), paramString);
    Objects.requireNonNull(paramZsw);
    Zo(str, paramZoc, zb).ifPresent(paramZsw::Z_);
  }
  
  private static Zkm lambda$getExamples$0(Zid paramZid, Zr paramZr) {
    return Ze(paramZid, paramZr);
  }
  
  private static Zki a(Zki paramZki) {
    return paramZki;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zue.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */