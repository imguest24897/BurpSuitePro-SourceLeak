package burp;

final class Zej9 extends Record implements Ztz9 {
  private final Zbd0 ZZ;
  
  private final Zbd_ Zk;
  
  private final Ztp8 Zq;
  
  private final Runnable Zr;
  
  Zej9(Zbd0 paramZbd0, Zbd_ paramZbd_, Ztp8 paramZtp8, Runnable paramRunnable) {
    this.ZZ = paramZbd0;
    this.Zk = paramZbd_;
    this.Zq = paramZtp8;
    this.Zr = paramRunnable;
  }
  
  public void ZV() {
    this.ZZ.Zq();
    this.Zk.ZU();
  }
  
  public void ZO(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: iload_1
    //   3: <illegal opcode> run : (Lburp/Zej9;I)Ljava/lang/Runnable;
    //   8: invokevirtual Zq : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  public void ZL(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: iload_1
    //   3: <illegal opcode> run : (Lburp/Zej9;I)Ljava/lang/Runnable;
    //   8: invokevirtual Zq : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  public void ZP(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: iload_1
    //   3: <illegal opcode> run : (Lburp/Zej9;I)Ljava/lang/Runnable;
    //   8: invokevirtual Zq : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  public void Zi(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: iload_1
    //   3: <illegal opcode> run : (Lburp/Zej9;I)Ljava/lang/Runnable;
    //   8: invokevirtual Zq : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  public void ZG(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: iload_1
    //   3: <illegal opcode> run : (Lburp/Zej9;I)Ljava/lang/Runnable;
    //   8: invokevirtual Zq : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  public void ZX(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: iload_1
    //   3: <illegal opcode> run : (Lburp/Zej9;I)Ljava/lang/Runnable;
    //   8: invokevirtual Zq : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  public void ZS() {
    this.Zr.run();
  }
  
  public void Zu() {
    this.ZZ.ZG();
  }
  
  private void Zq(Runnable paramRunnable) {
    paramRunnable.run();
    this.Zk.ZY();
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zej9;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zej9;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zej9;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  private void lambda$showResponseHeaderDetails$5(int paramInt) {
    this.ZZ.Z_(paramInt, this.Zq.get().ZI());
  }
  
  private void lambda$showRequestHeaderDetails$4(int paramInt) {
    this.ZZ.ZX(paramInt, this.Zq.get().ZD());
  }
  
  private void lambda$showBodyParameterDetails$3(int paramInt) {
    this.ZZ.ZI(paramInt, this.Zq.get().ZD());
  }
  
  private void lambda$showCookieDetails$2(int paramInt) {
    this.ZZ.Zc(paramInt, this.Zq.get().ZD());
  }
  
  private void lambda$showQueryParameterDetails$1(int paramInt) {
    this.ZZ.Za(paramInt, this.Zq.get().ZD());
  }
  
  private void lambda$showRequestAttributeDetails$0(int paramInt) {
    this.ZZ.Zk(paramInt, this.Zq.get().ZD());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zej9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */