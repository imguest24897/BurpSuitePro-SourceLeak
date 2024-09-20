package burp;

import java.util.function.BooleanSupplier;

class Zz5a implements Zggu {
  private final Zgg[] ZC;
  
  Zz5a(Zgg[] paramArrayOfZgg) {
    this.ZC = paramArrayOfZgg;
  }
  
  public void Zd(Zlbu paramZlbu, BooleanSupplier paramBooleanSupplier, Runnable paramRunnable) {
    Zbqc[] arrayOfZbqc = Zzlr.Zp();
    try {
      Zgg[] arrayOfZgg = this.ZC;
      int i = arrayOfZgg.length;
      byte b = 0;
      while (b < i) {
        Zgg zgg = arrayOfZgg[b];
        zgg.Zd(paramZlbu, paramBooleanSupplier, Zz5a::lambda$filterModified$0);
        b++;
        if (arrayOfZbqc != null)
          break; 
      } 
      arrayOfZgg = this.ZC;
      i = arrayOfZgg.length;
      b = 0;
      while (b < i) {
        Zgg zgg = arrayOfZgg[b];
        zgg.ZH();
        b++;
        if (arrayOfZbqc != null)
          break; 
      } 
    } finally {
      paramRunnable.run();
    } 
  }
  
  private static void lambda$filterModified$0() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz5a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */