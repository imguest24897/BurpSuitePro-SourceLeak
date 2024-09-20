package burp;

public class Zle8 {
  private final Zbfi Zp;
  
  Zle8(Zbfi paramZbfi) {
    this.Zp = paramZbfi;
  }
  
  boolean ZB(Zbza paramZbza, Zro0 paramZro0) {
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    byte b = paramZbza.ZgD() ? paramZbza.Zgh().Zp(paramZro0) : 0;
    try {
      switch (Zrl4.Z_[this.Zp.ZqT().ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
          try {
          
          } catch (MatchException matchException) {
            throw a(null);
          } 
          return (b < 3);
        case 2:
          try {
          
          } catch (MatchException matchException) {
            throw a(null);
          } 
          return (b < 6);
        case 3:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return (b < 10);
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zle8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */