package net.portswigger.browser;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import net.portswigger.Zlz;

abstract class Zjy implements Zeo {
  protected abstract List<Zs> Zz(Zjp paramZjp);
  
  public boolean Zj(Zjp paramZjp) {
    List<Zs> list = Zz(paramZjp);
    return (paramZjp != null && !paramZjp.Zi() && !list.isEmpty() && list.stream().allMatch(Zjy::lambda$handles$0));
  }
  
  public List<Zh> Zn(Zjp paramZjp, Zdr paramZdr, Zdm paramZdm, Zd0 paramZd0) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual Zz : (Lnet/portswigger/browser/Zjp;)Ljava/util/List;
    //   5: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   10: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   15: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   20: invokeinterface toList : ()Ljava/util/List;
    //   25: astore #5
    //   27: aload #4
    //   29: invokestatic Ze : ()Lnet/portswigger/browser/Ze6;
    //   32: iconst_0
    //   33: invokevirtual Zq : (Z)Lnet/portswigger/browser/Ze6;
    //   36: iconst_0
    //   37: invokevirtual ZW : (Z)Lnet/portswigger/browser/Ze6;
    //   40: invokeinterface Zi : (Lnet/portswigger/browser/Ze6;)Lnet/portswigger/browser/Zdb;
    //   45: astore #6
    //   47: aload #6
    //   49: invokeinterface Zz : ()Ljava/util/Optional;
    //   54: astore #7
    //   56: aload #7
    //   58: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   63: invokevirtual flatMap : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   66: aload #7
    //   68: aload #5
    //   70: <illegal opcode> apply : (Ljava/util/Optional;Ljava/util/List;)Ljava/util/function/Function;
    //   75: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   78: invokestatic emptyList : ()Ljava/util/List;
    //   81: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   84: checkcast java/util/List
    //   87: areturn
    //   88: astore #5
    //   90: aload #5
    //   92: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   95: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   98: invokestatic emptyList : ()Ljava/util/List;
    //   101: areturn
    // Exception table:
    //   from	to	target	type
    //   0	87	88	net/portswigger/browser/Ztk
  }
  
  private static List<Zh> Zq(Zt3 paramZt3, Zel paramZel, List<String> paramList) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: aload_0
    //   9: aload_1
    //   10: aload_0
    //   11: aload_2
    //   12: aload_3
    //   13: <illegal opcode> accept : (Lnet/portswigger/browser/Zt3;Ljava/util/List;Ljava/util/List;)Ljava/util/function/Consumer;
    //   18: invokeinterface ZA : (Lnet/portswigger/browser/Zel;Ljava/util/function/Consumer;)V
    //   23: aload_3
    //   24: areturn
  }
  
  private static boolean Zt(Zel paramZel, Zt3 paramZt3, List<String> paramList) {
    List<?> list = paramZel.ZH(paramZt3).stream().map(Zjn::ZaS).toList();
    return (list.size() == paramList.size() && (new HashSet(list)).containsAll(paramList));
  }
  
  private static void lambda$findTargetElements$3(Zt3 paramZt3, List<String> paramList1, List paramList2, Zel paramZel) {
    // Byte code:
    //   0: aload_3
    //   1: aload_0
    //   2: aload_1
    //   3: invokestatic Zt : (Lnet/portswigger/browser/Zel;Lnet/portswigger/browser/Zt3;Ljava/util/List;)Z
    //   6: ifeq -> 88
    //   9: aload_3
    //   10: invokeinterface Zb : ()Ljava/util/List;
    //   15: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   20: aload_0
    //   21: dup
    //   22: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   25: pop
    //   26: <illegal opcode> apply : (Lnet/portswigger/browser/Zt3;)Ljava/util/function/Function;
    //   31: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   36: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   41: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   46: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   51: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   56: aload_0
    //   57: aload_1
    //   58: <illegal opcode> test : (Lnet/portswigger/browser/Zt3;Ljava/util/List;)Ljava/util/function/Predicate;
    //   63: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   68: istore #4
    //   70: iload #4
    //   72: ifne -> 88
    //   75: aload_2
    //   76: aload_3
    //   77: invokeinterface Zq : ()Lnet/portswigger/browser/Zh;
    //   82: invokeinterface add : (Ljava/lang/Object;)Z
    //   87: pop
    //   88: return
  }
  
  private static boolean lambda$findTargetElements$2(Zt3 paramZt3, List<String> paramList, Zel paramZel) {
    return Zt(paramZel, paramZt3, paramList);
  }
  
  private static List lambda$locate$1(Optional<Zt3> paramOptional, List<String> paramList, Zel paramZel) {
    return Zq(paramOptional.get(), paramZel, paramList);
  }
  
  private static boolean lambda$handles$0(Zs paramZs) {
    return Zlz.Zu(paramZs.ZU());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zjy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */