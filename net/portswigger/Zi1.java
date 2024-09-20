package net.portswigger;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class Zi1 {
  private final Zid ZH;
  
  public Zi1(Zid paramZid) {
    this.ZH = paramZid;
  }
  
  public Stream<Zrmf> Zt(Zrmf paramZrmf) {
    Zqa zqa = (new Zqa(paramZrmf)).ZH(this.ZH.ZZ());
    return Stream.of(ZE(zqa, this.ZH).<Zrmf>map(Zqa::ZG).orElse(zqa.ZG()));
  }
  
  Optional<Zqa> ZE(Zqa paramZqa, Zid paramZid) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual ZE : ()Lnet/portswigger/Zav;
    //   4: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   7: aload_0
    //   8: aload_2
    //   9: aload_1
    //   10: <illegal opcode> apply : (Lnet/portswigger/Zi1;Lnet/portswigger/Zid;Lnet/portswigger/Zqa;)Ljava/util/function/Function;
    //   15: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   18: invokestatic empty : ()Ljava/util/Optional;
    //   21: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   24: checkcast java/util/Optional
    //   27: areturn
  }
  
  private Zu3 ZS(Zav paramZav, Zid paramZid) {
    // Byte code:
    //   0: new net/portswigger/Ztz
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: aload_1
    //   9: invokevirtual Zi : ()Ljava/util/Map;
    //   12: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   15: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   20: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   23: invokestatic emptySet : ()Ljava/util/Set;
    //   26: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   29: checkcast java/util/Set
    //   32: aload_1
    //   33: aload_2
    //   34: aload_3
    //   35: <illegal opcode> accept : (Lnet/portswigger/Zav;Lnet/portswigger/Zid;Lnet/portswigger/Ztz;)Ljava/util/function/Consumer;
    //   40: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   45: aload_3
    //   46: aload_2
    //   47: invokestatic ZN : (Lnet/portswigger/Zid;)Ljava/util/List;
    //   50: invokevirtual Za : (Ljava/util/List;)Lnet/portswigger/Ztz;
    //   53: pop
    //   54: aload_3
    //   55: invokevirtual ZX : ()Lnet/portswigger/Zu3;
    //   58: areturn
  }
  
  private static void lambda$buildFormObjectFragment$2(Zav paramZav, Zid paramZid, Ztz paramZtz, Map.Entry paramEntry) {
    // Byte code:
    //   0: invokestatic Zl : ()[Ljava/lang/String;
    //   3: aload_3
    //   4: invokeinterface getKey : ()Ljava/lang/Object;
    //   9: checkcast java/lang/String
    //   12: astore #5
    //   14: astore #4
    //   16: aload_0
    //   17: invokevirtual Zm : ()Ljava/util/List;
    //   20: ifnull -> 52
    //   23: aload_0
    //   24: invokevirtual Zm : ()Ljava/util/List;
    //   27: aload #5
    //   29: invokeinterface contains : (Ljava/lang/Object;)Z
    //   34: ifeq -> 52
    //   37: goto -> 44
    //   40: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   43: athrow
    //   44: iconst_1
    //   45: goto -> 53
    //   48: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   51: athrow
    //   52: iconst_0
    //   53: istore #6
    //   55: aload_3
    //   56: invokeinterface getValue : ()Ljava/lang/Object;
    //   61: checkcast net/portswigger/Zoc
    //   64: astore #7
    //   66: aload #7
    //   68: invokevirtual ZF : ()Lnet/portswigger/Zav;
    //   71: astore #8
    //   73: aload #8
    //   75: invokevirtual Zg : ()Lnet/portswigger/Ziq;
    //   78: astore #9
    //   80: aload_1
    //   81: aload #5
    //   83: invokevirtual ZU : (Ljava/lang/String;)Lnet/portswigger/Zrzn;
    //   86: invokevirtual Zb : ()Z
    //   89: ifeq -> 165
    //   92: aconst_null
    //   93: astore #10
    //   95: aload #9
    //   97: getstatic net/portswigger/Ziq.OBJECT : Lnet/portswigger/Ziq;
    //   100: if_acmpne -> 127
    //   103: aload #8
    //   105: invokestatic Zq : (Lnet/portswigger/Zav;)Lnet/portswigger/Zf6;
    //   108: astore #11
    //   110: new net/portswigger/Ziz
    //   113: dup
    //   114: aload #11
    //   116: invokespecial <init> : (Lnet/portswigger/Zf6;)V
    //   119: invokevirtual ZI : ()Lnet/portswigger/Zf6;
    //   122: astore #10
    //   124: goto -> 144
    //   127: aload #9
    //   129: getstatic net/portswigger/Ziq.ARRAY : Lnet/portswigger/Ziq;
    //   132: if_acmpne -> 144
    //   135: aload #8
    //   137: iload #6
    //   139: invokestatic ZX : (Lnet/portswigger/Zav;Z)Lnet/portswigger/Zh2;
    //   142: astore #10
    //   144: aload #10
    //   146: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   149: aload_2
    //   150: aload #5
    //   152: <illegal opcode> accept : (Lnet/portswigger/Ztz;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   157: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   160: aload #4
    //   162: ifnonnull -> 198
    //   165: aload_2
    //   166: aload #5
    //   168: aload #8
    //   170: aload #8
    //   172: invokevirtual Zj : ()Ljava/util/stream/Stream;
    //   175: aconst_null
    //   176: iload #6
    //   178: aconst_null
    //   179: aload #8
    //   181: invokevirtual Zh : ()Ljava/lang/String;
    //   184: invokestatic ZG : (Lnet/portswigger/Zav;Ljava/util/stream/Stream;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;)Lnet/portswigger/Zms;
    //   187: invokevirtual ZK : (Ljava/lang/String;Lnet/portswigger/Zms;)Lnet/portswigger/Ztz;
    //   190: pop
    //   191: goto -> 198
    //   194: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   197: athrow
    //   198: return
    // Exception table:
    //   from	to	target	type
    //   16	37	40	net/portswigger/Zki
    //   23	48	48	net/portswigger/Zki
    //   144	191	194	net/portswigger/Zki
  }
  
  private static void lambda$buildFormObjectFragment$1(Ztz paramZtz, String paramString, Zms paramZms) {
    paramZtz.ZK(paramString, paramZms);
  }
  
  private Optional lambda$getFormBodyRequest$0(Zid paramZid, Zqa paramZqa, Zav paramZav) {
    Ziq ziq = paramZav.Zg();
    if (ziq == Ziq.OBJECT) {
      Zu3 zu3 = ZS(paramZav, paramZid);
      return Optional.of(paramZqa.ZR(zu3));
    } 
    return Optional.of(paramZqa);
  }
  
  private static Zki a(Zki paramZki) {
    return paramZki;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zi1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */