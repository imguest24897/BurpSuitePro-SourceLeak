package burp;

import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

class Zbjm implements Zzwf {
  private final Supplier<Boolean> Zg;
  
  private final Supplier<Zzwf> Zi;
  
  public Zbjm(Supplier<Boolean> paramSupplier, Supplier<Zzwf> paramSupplier1) {
    this.Zg = paramSupplier;
    this.Zi = paramSupplier1;
  }
  
  public void ZI() {
    Objects.requireNonNull(ZS());
    Zo(ZS()::ZI);
  }
  
  public void Zr() {
    Objects.requireNonNull(ZS());
    Zo(ZS()::Zr);
  }
  
  public void Za() {
    Objects.requireNonNull(ZS());
    Zo(ZS()::Za);
  }
  
  public void Zx() {
    Objects.requireNonNull(ZS());
    Zo(ZS()::Zx);
  }
  
  public void Z_() {
    Objects.requireNonNull(ZS());
    Zo(ZS()::Z_);
  }
  
  public void ZZ(int paramInt1, int paramInt2, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: iload_1
    //   3: iload_2
    //   4: aload_3
    //   5: <illegal opcode> run : (Lburp/Zbjm;IILjava/lang/String;)Ljava/lang/Runnable;
    //   10: invokevirtual Zo : (Ljava/lang/Runnable;)V
    //   13: return
  }
  
  public void Zf(int paramInt1, int paramInt2, String paramString, List<Ztkm> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: iload_1
    //   3: iload_2
    //   4: aload_3
    //   5: aload #4
    //   7: <illegal opcode> run : (Lburp/Zbjm;IILjava/lang/String;Ljava/util/List;)Ljava/lang/Runnable;
    //   12: invokevirtual Zo : (Ljava/lang/Runnable;)V
    //   15: return
  }
  
  public void ZP() {
    Objects.requireNonNull(ZS());
    Zo(ZS()::ZP);
  }
  
  public void Zi(int paramInt1, int paramInt2, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: iload_1
    //   3: iload_2
    //   4: aload_3
    //   5: <illegal opcode> run : (Lburp/Zbjm;IILjava/lang/String;)Ljava/lang/Runnable;
    //   10: invokevirtual Zo : (Ljava/lang/Runnable;)V
    //   13: return
  }
  
  public void ZY(int paramInt1, int paramInt2, String paramString, List<Ztkm> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: iload_1
    //   3: iload_2
    //   4: aload_3
    //   5: aload #4
    //   7: <illegal opcode> run : (Lburp/Zbjm;IILjava/lang/String;Ljava/util/List;)Ljava/lang/Runnable;
    //   12: invokevirtual Zo : (Ljava/lang/Runnable;)V
    //   15: return
  }
  
  public void ZL(int paramInt1, int paramInt2, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: iload_1
    //   3: iload_2
    //   4: aload_3
    //   5: <illegal opcode> run : (Lburp/Zbjm;IILjava/lang/String;)Ljava/lang/Runnable;
    //   10: invokevirtual Zo : (Ljava/lang/Runnable;)V
    //   13: return
  }
  
  public void ZE(int paramInt1, int paramInt2, String paramString, List<Ztkm> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: iload_1
    //   3: iload_2
    //   4: aload_3
    //   5: aload #4
    //   7: <illegal opcode> run : (Lburp/Zbjm;IILjava/lang/String;Ljava/util/List;)Ljava/lang/Runnable;
    //   12: invokevirtual Zo : (Ljava/lang/Runnable;)V
    //   15: return
  }
  
  private Zzwf ZS() {
    return this.Zi.get();
  }
  
  private void Zo(Runnable paramRunnable) {
    if (((Boolean)this.Zg.get()).booleanValue())
      paramRunnable.run(); 
  }
  
  private void lambda$showWebSocketSelectionSection$5(int paramInt1, int paramInt2, String paramString, List<Ztkm> paramList) {
    ZS().ZE(paramInt1, paramInt2, paramString, paramList);
  }
  
  private void lambda$showWebSocketCharacterSection$4(int paramInt1, int paramInt2, String paramString) {
    ZS().ZL(paramInt1, paramInt2, paramString);
  }
  
  private void lambda$showResponseSelectionSection$3(int paramInt1, int paramInt2, String paramString, List<Ztkm> paramList) {
    ZS().ZY(paramInt1, paramInt2, paramString, paramList);
  }
  
  private void lambda$showResponseCharacterSection$2(int paramInt1, int paramInt2, String paramString) {
    ZS().Zi(paramInt1, paramInt2, paramString);
  }
  
  private void lambda$showRequestSelectionSection$1(int paramInt1, int paramInt2, String paramString, List<Ztkm> paramList) {
    ZS().Zf(paramInt1, paramInt2, paramString, paramList);
  }
  
  private void lambda$showRequestCharacterSection$0(int paramInt1, int paramInt2, String paramString) {
    ZS().ZZ(paramInt1, paramInt2, paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbjm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */