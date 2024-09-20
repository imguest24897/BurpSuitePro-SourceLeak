package burp;

import java.util.function.Supplier;

class Zexf {
  private final Zs18 ZP;
  
  private final Zey9 Zn;
  
  private final Zbd8 ZA;
  
  private final Supplier<Zrri> Zk;
  
  private final Zth5 ZJ;
  
  private final Zzmn[] ZX;
  
  Zexf(Zs18 paramZs18, Zey9 paramZey9, Zbd8 paramZbd8, Supplier<Zrri> paramSupplier, Zth5 paramZth5, Zzmn... paramVarArgs) {
    this.ZP = paramZs18;
    this.Zn = paramZey9;
    this.ZA = paramZbd8;
    this.Zk = paramSupplier;
    this.ZJ = paramZth5;
    this.ZX = paramVarArgs;
  }
  
  Zbfr Zn(Zgu3 paramZgu3) {
    try {
      switch (Zmp8.Zw[paramZgu3.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return new Zbf5(this.ZJ, this.ZA, this.ZX);
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zexf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */