package burp;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Zzsz extends Zzpg {
  public Zzsz(Zk5 paramZk5, Zb3t paramZb3t) {
    super(paramZk5, paramZb3t);
  }
  
  public List<Zb3t> ZH(List<Zb3t> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZC : Lburp/Zb3t;
    //   4: invokeinterface ZC : ()Ljava/util/List;
    //   9: iconst_1
    //   10: invokeinterface get : (I)Ljava/lang/Object;
    //   15: checkcast burp/Zb3t
    //   18: astore_3
    //   19: aload_3
    //   20: invokeinterface ZC : ()Ljava/util/List;
    //   25: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   30: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   35: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   40: invokestatic toList : ()Ljava/util/stream/Collector;
    //   43: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   48: checkcast java/util/List
    //   51: astore #4
    //   53: aload_3
    //   54: invokeinterface ZC : ()Ljava/util/List;
    //   59: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   64: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   69: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   74: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   79: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   84: invokestatic toList : ()Ljava/util/stream/Collector;
    //   87: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   92: checkcast java/util/List
    //   95: astore #5
    //   97: aload_0
    //   98: getfield ZC : Lburp/Zb3t;
    //   101: invokeinterface ZC : ()Ljava/util/List;
    //   106: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   111: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   116: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   121: invokeinterface findFirst : ()Ljava/util/Optional;
    //   126: astore #6
    //   128: aload #6
    //   130: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   135: invokevirtual flatMap : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   138: astore #7
    //   140: aload #7
    //   142: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   147: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   150: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   155: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   158: checkcast java/util/List
    //   161: astore #8
    //   163: invokestatic Zr : ()Ljava/lang/String;
    //   166: aload_0
    //   167: getfield ZC : Lburp/Zb3t;
    //   170: invokeinterface ZC : ()Ljava/util/List;
    //   175: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   180: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   185: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   190: invokeinterface findFirst : ()Ljava/util/Optional;
    //   195: astore #9
    //   197: astore_2
    //   198: aload #9
    //   200: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   205: invokevirtual flatMap : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   208: astore #10
    //   210: aload #10
    //   212: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   217: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   220: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   225: invokevirtual orElseGet : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   228: checkcast java/util/List
    //   231: astore #11
    //   233: aload_0
    //   234: getfield Zy : Lburp/Zk5;
    //   237: aload_1
    //   238: aload_3
    //   239: invokevirtual Zf : (Ljava/util/List;Lburp/Zb3t;)Ljava/util/List;
    //   242: astore #12
    //   244: aload #11
    //   246: invokeinterface isEmpty : ()Z
    //   251: ifeq -> 266
    //   254: aload_0
    //   255: getfield ZR : Ljava/util/List;
    //   258: aload #12
    //   260: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   265: pop
    //   266: aload #7
    //   268: aload_0
    //   269: aload #5
    //   271: aload #9
    //   273: aload #8
    //   275: <illegal opcode> accept : (Lburp/Zzsz;Ljava/util/List;Ljava/util/Optional;Ljava/util/List;)Ljava/util/function/Consumer;
    //   280: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   283: aload #10
    //   285: aload_0
    //   286: aload #11
    //   288: aload #4
    //   290: aload_1
    //   291: aload #8
    //   293: aload #5
    //   295: aload #12
    //   297: <illegal opcode> accept : (Lburp/Zzsz;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/function/Consumer;
    //   302: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   305: aload_0
    //   306: getfield ZR : Ljava/util/List;
    //   309: aload_2
    //   310: ifnull -> 320
    //   313: iconst_5
    //   314: anewarray burp/Zbqc
    //   317: invokestatic Zr : ([Lburp/Zbqc;)V
    //   320: areturn
  }
  
  private void lambda$addExecutionHops$6(List<Zb3t> paramList1, List paramList2, List<Zb3t> paramList3, List<Zb3t> paramList4, List<Zb3t> paramList5, List<Zb3t> paramList6, Zb3t paramZb3t) {
    String str = Zzpg.Zr();
    if (!paramList1.isEmpty() && paramList2.isEmpty())
      this.ZR.addAll(this.Zy.Zf(paramList3, paramZb3t)); 
    if (!paramList1.isEmpty() && paramList4.isEmpty()) {
      this.ZR.addAll(this.Zy.Zf(paramList5, paramZb3t));
      if (str != null) {
        if (!paramList1.isEmpty())
          this.Zy.Zf(paramList6, paramList1.get(0)); 
        this.ZR.addAll(this.Zy.Zf(paramList4, paramZb3t));
        return;
      } 
      return;
    } 
    if (!paramList1.isEmpty())
      this.Zy.Zf(paramList6, paramList1.get(0)); 
    this.ZR.addAll(this.Zy.Zf(paramList4, paramZb3t));
  }
  
  private void lambda$addExecutionHops$5(List<Zb3t> paramList1, Optional paramOptional, List paramList2, Zb3t paramZb3t) {
    List<Zb3t> list = this.Zy.Zf(paramList1, paramZb3t);
    if (!paramOptional.isPresent() && !paramList2.isEmpty())
      this.ZR.addAll(list); 
  }
  
  private static List lambda$addExecutionHops$2(Zb3t paramZb3t) {
    return (List)paramZb3t.ZC().stream().filter(Zl19::ZB).collect(Collectors.toList());
  }
  
  private static Optional lambda$addExecutionHops$1(Zb3t paramZb3t) {
    return paramZb3t.ZC().stream().filter(Zl19::ZI).findFirst();
  }
  
  private static boolean lambda$addExecutionHops$0(Zb3t paramZb3t) {
    return !Zl19.ZE(paramZb3t);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzsz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */