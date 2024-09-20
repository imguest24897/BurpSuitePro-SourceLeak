package burp;

public interface Zxnt {
  void Zk(Zleo paramZleo, Zbj9 paramZbj9);
  
  Zzbb Zy();
  
  int ZV(Zzbb paramZzbb);
  
  default Zzbb ZK(int paramInt) {
    // Byte code:
    //   0: invokestatic values : ()[Lburp/Zzbb;
    //   3: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   6: aload_0
    //   7: iload_1
    //   8: <illegal opcode> test : (Lburp/Zxnt;I)Ljava/util/function/Predicate;
    //   13: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   18: invokeinterface findFirst : ()Ljava/util/Optional;
    //   23: aconst_null
    //   24: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   27: checkcast burp/Zzbb
    //   30: areturn
  }
  
  default void Zb(Zgyw paramZgyw, Zb2y paramZb2y) {}
  
  default void Z_(Zzbb paramZzbb) {}
  
  private boolean lambda$panelWithIndex$0(int paramInt, Zzbb paramZzbb) {
    return (ZV(paramZzbb) == paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxnt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */