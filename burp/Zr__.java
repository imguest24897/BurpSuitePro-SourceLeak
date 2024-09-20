package burp;

import java.util.function.Supplier;

class Zr__ implements Ztrk {
  private final Ztrk ZI;
  
  private final Supplier<Boolean> ZD;
  
  public Zr__(Ztrk paramZtrk, Supplier<Boolean> paramSupplier) {
    this.ZI = paramZtrk;
    this.ZD = paramSupplier;
  }
  
  public boolean ZB0() {
    return (((Boolean)this.ZD.get()).booleanValue() && this.ZI.ZB0());
  }
  
  public boolean ZJ() {
    return (((Boolean)this.ZD.get()).booleanValue() && this.ZI.ZJ());
  }
  
  public void Z_(int paramInt, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: iload_1
    //   3: aload_2
    //   4: <illegal opcode> run : (Lburp/Zr__;I[B)Ljava/lang/Runnable;
    //   9: invokevirtual Zq : (Ljava/lang/Runnable;)V
    //   12: return
  }
  
  public void ZI(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: iload_1
    //   3: iload_2
    //   4: aload_3
    //   5: <illegal opcode> run : (Lburp/Zr__;II[B)Ljava/lang/Runnable;
    //   10: invokevirtual Zq : (Ljava/lang/Runnable;)V
    //   13: return
  }
  
  public void Ze(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: iload_1
    //   3: iload_2
    //   4: <illegal opcode> run : (Lburp/Zr__;II)Ljava/lang/Runnable;
    //   9: invokevirtual Zq : (Ljava/lang/Runnable;)V
    //   12: return
  }
  
  public void Zx(int paramInt1, int paramInt2, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: iload_1
    //   3: iload_2
    //   4: aload_3
    //   5: <illegal opcode> run : (Lburp/Zr__;IILjava/lang/String;)Ljava/lang/Runnable;
    //   10: invokevirtual Zq : (Ljava/lang/Runnable;)V
    //   13: return
  }
  
  public void Z_(Zsmh paramZsmh) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> run : (Lburp/Zr__;Lburp/Zsmh;)Ljava/lang/Runnable;
    //   8: invokevirtual Zq : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  public void ZF(Zsmh paramZsmh) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> run : (Lburp/Zr__;Lburp/Zsmh;)Ljava/lang/Runnable;
    //   8: invokevirtual Zq : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  private void Zq(Runnable paramRunnable) {
    if (((Boolean)this.ZD.get()).booleanValue())
      paramRunnable.run(); 
  }
  
  private void lambda$replaceMessageAndNotify$5(Zsmh paramZsmh) {
    this.ZI.ZF(paramZsmh);
  }
  
  private void lambda$replaceMessage$4(Zsmh paramZsmh) {
    this.ZI.Z_(paramZsmh);
  }
  
  private void lambda$replaceText$3(int paramInt1, int paramInt2, String paramString) {
    this.ZI.Zx(paramInt1, paramInt2, paramString);
  }
  
  private void lambda$removeRawBytes$2(int paramInt1, int paramInt2) {
    this.ZI.Ze(paramInt1, paramInt2);
  }
  
  private void lambda$replaceRawBytes$1(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {
    this.ZI.ZI(paramInt1, paramInt2, paramArrayOfbyte);
  }
  
  private void lambda$addRawBytes$0(int paramInt, byte[] paramArrayOfbyte) {
    this.ZI.Z_(paramInt, paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr__.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */