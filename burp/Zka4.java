package burp;

class Zka4 implements Zmxf {
  private final Zefx Zw;
  
  private final String ZL;
  
  private final String Za;
  
  private final Zmxf Zg;
  
  Zka4(Zbnt paramZbnt, Zey9 paramZey9, Zefx paramZefx, String paramString1, Zrdu paramZrdu, String paramString2) {
    this.Zw = paramZefx;
    this.ZL = paramString1;
    this.Za = paramString2;
    this.Zg = new Zs9o(paramZbnt, paramZey9, paramZefx, paramString1, paramZrdu, paramString2);
  }
  
  public Zefx ZF(Zr6h paramZr6h) {
    boolean bool = this.Zw.Zc().stream().anyMatch(this::lambda$modify$0);
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return bool ? this.Zg.ZF(paramZr6h) : this.Zw;
  }
  
  private static boolean Zh(Zlou paramZlou) {
    try {
      switch (Zglb.ZA[paramZlou.Zx.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        case 2:
        case 3:
        case 4:
        
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  private boolean lambda$modify$0(Zlou paramZlou) {
    try {
      if (Zh(paramZlou))
        try {
          if (paramZlou.ZA.equals(this.ZL))
            try {
              if (!paramZlou.Zr.equals(this.Za));
            } catch (MatchException matchException) {
              throw a(null);
            }  
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zka4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */