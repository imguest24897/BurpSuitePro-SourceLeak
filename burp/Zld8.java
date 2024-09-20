package burp;

public class Zld8 {
  private final Zbfi Zl;
  
  Zld8(Zbfi paramZbfi) {
    this.Zl = paramZbfi;
  }
  
  boolean ZO(Zbza paramZbza) {
    int i = paramZbza.Zgo();
    try {
      switch (Zrl4.Z_[this.Zl.ZqT().ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
          try {
          
          } catch (MatchException matchException) {
            throw a(null);
          } 
          return (i < 3);
        case 2:
          try {
          
          } catch (MatchException matchException) {
            throw a(null);
          } 
          return (i < 6);
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
    return (i < 10);
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zld8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */