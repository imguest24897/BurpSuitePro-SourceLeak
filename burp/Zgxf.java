package burp;

import javax.swing.event.TreeSelectionListener;

public class Zgxf {
  private final Ztdi ZR;
  
  private final Zor ZP;
  
  private final Zg_q Zk;
  
  private final TreeSelectionListener ZM;
  
  private final Ztwv Zi;
  
  private final Zkl6 ZL;
  
  private final Ze47 ZD;
  
  private static int[] Zf;
  
  public Zgxf(Ztdi paramZtdi, Zor paramZor, Zg_q paramZg_q, Ztwv paramZtwv, Zkl6 paramZkl6, Ze47 paramZe47) {
    this.ZR = paramZtdi;
    this.ZP = paramZor;
    this.Zk = paramZg_q;
    this.ZM = paramZg_q;
    this.Zi = paramZtwv;
    this.ZL = paramZkl6;
    this.ZD = paramZe47;
  }
  
  Zstu ZU(Zz_1 paramZz_1) {
    Zxya zxya = (Zxya)paramZz_1.Z_();
    Zstu zstu = zxya.Zh();
    return (zstu != null) ? zstu : this.ZL.Zs().ZO().Zf(zxya.Zq()).Zr();
  }
  
  Zbr Zv(Zz_1 paramZz_1) {
    Zxya zxya = (Zxya)paramZz_1.Z_();
    Zbr zbr = zxya.ZY();
    return (zbr == null) ? ZX(paramZz_1) : zbr;
  }
  
  private Zbr ZX(Zz_1 paramZz_1) {
    Zstu zstu = ZU(paramZz_1);
    Zkyt zkyt = this.ZD.Zw(((Zxya)paramZz_1.Z_()).Zy());
    return Zbr.Zy(zstu, zkyt);
  }
  
  void ZG(Runnable paramRunnable) {
    this.Zi.Zx(paramRunnable);
  }
  
  void ZQ(Runnable paramRunnable, String paramString) {
    this.Zi.Zl(paramRunnable, paramString);
  }
  
  Zboe Ze() {
    return new Zboe(Zt2m.ZF(this.ZP), this.Zi);
  }
  
  void Zv(Zboe paramZboe) {
    paramZboe.Zd(true);
  }
  
  void ZJ(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: <illegal opcode> run : (Lburp/Zgxf;Z)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  void Zw() {
    this.Zk.Zt();
  }
  
  void Zc(Zz_1 paramZz_1) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> run : (Lburp/Zgxf;Lburp/Zz_1;)Ljava/lang/Runnable;
    //   8: invokevirtual ZG : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  void Zh(String paramString, Ze3h paramZe3h, Zt7u paramZt7u) {
    ZQ(new Zbnc(this, paramZt7u, paramZe3h), paramString);
  }
  
  private void lambda$nodeUpdated$1(Zz_1 paramZz_1) {
    this.ZR.ZR(((Zxya)paramZz_1.Z_()).ZX);
  }
  
  private void lambda$setSelectionListenerEnabled$0(boolean paramBoolean) {
    int[] arrayOfInt = ZV();
    if (paramBoolean) {
      this.ZP.addTreeSelectionListener(this.ZM);
      if (arrayOfInt != null) {
        this.ZP.removeTreeSelectionListener(this.ZM);
        return;
      } 
      return;
    } 
    this.ZP.removeTreeSelectionListener(this.ZM);
  }
  
  public static void ZJ(int[] paramArrayOfint) {
    Zf = paramArrayOfint;
  }
  
  public static int[] ZV() {
    return Zf;
  }
  
  static {
    if (ZV() != null)
      ZJ(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgxf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */