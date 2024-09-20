package burp;

class Ztu1 implements Zt7b {
  private final Iterable<Zt7b> ZK;
  
  private volatile boolean Zw;
  
  Ztu1(Iterable<Zt7b> paramIterable) {
    this.ZK = paramIterable;
  }
  
  void Zs() {
    this.Zw = true;
  }
  
  void ZY() {
    this.Zw = false;
  }
  
  public void Zj(Zgu3 paramZgu3) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZK : Ljava/lang/Iterable;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> accept : (Lburp/Ztu1;Lburp/Zgu3;)Ljava/util/function/Consumer;
    //   11: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   16: return
  }
  
  public void ZU() {
    this.ZK.forEach(this::lambda$messageCleared$1);
  }
  
  public void Zn() {
    this.ZK.forEach(this::lambda$messageModified$2);
  }
  
  private void lambda$messageModified$2(Zt7b paramZt7b) {
    if (!paramZt7b.Zy() || !this.Zw)
      paramZt7b.Zn(); 
  }
  
  private void lambda$messageCleared$1(Zt7b paramZt7b) {
    if (!paramZt7b.Zy() || !this.Zw)
      paramZt7b.ZU(); 
  }
  
  private void lambda$messageReplaced$0(Zgu3 paramZgu3, Zt7b paramZt7b) {
    if (!paramZt7b.Zy() || !this.Zw)
      paramZt7b.Zj(paramZgu3); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztu1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */