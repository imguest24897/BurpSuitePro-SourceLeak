package burp;

public interface Ztvr {
  void Zi(Zxgl paramZxgl, Zebs paramZebs);
  
  Zlze Zw();
  
  int Zn(Zlze paramZlze);
  
  default Zlze ZP(int paramInt) {
    // Byte code:
    //   0: invokestatic values : ()[Lburp/Zlze;
    //   3: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   6: aload_0
    //   7: iload_1
    //   8: <illegal opcode> test : (Lburp/Ztvr;I)Ljava/util/function/Predicate;
    //   13: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   18: invokeinterface findFirst : ()Ljava/util/Optional;
    //   23: aconst_null
    //   24: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   27: checkcast burp/Zlze
    //   30: areturn
  }
  
  default void ZF(Zgyw paramZgyw, Zb2y paramZb2y) {}
  
  default void Zm(Zlze paramZlze) {}
  
  private boolean lambda$panelWithIndex$0(int paramInt, Zlze paramZlze) {
    return (Zn(paramZlze) == paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztvr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */