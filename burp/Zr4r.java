package burp;

import java.util.List;
import java.util.stream.Collectors;
import net.portswigger.Ztx;
import net.portswigger.Zuf;

class Zr4r {
  private final Zx46 Zp;
  
  private final Zra1 Zm;
  
  Zr4r(Zx46 paramZx46, Zra1 paramZra1) {
    this.Zp = paramZx46;
    this.Zm = paramZra1;
  }
  
  List<Ztx> ZS() {
    try {
      if (!Zn())
        return null; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    List<Ztx> list = (List)this.Zp.ZN().ZM().stream().map(Zr4r::lambda$convertEventLogs$0).collect(Collectors.toList());
    this.Zp.Zo();
    return list;
  }
  
  private boolean Zn() {
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return (this.Zm == Zra1.EXECUTION_MODE_ENTERPRISE_AGENT);
  }
  
  private static Zuf Zk(Zkqn paramZkqn) {
    try {
      switch (Zlaw.Zo[paramZkqn.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return Zuf.ERROR;
  }
  
  private static Ztx lambda$convertEventLogs$0(Zbpn paramZbpn) {
    return new Ztx(Zk(paramZbpn.ZX()), paramZbpn.Zd(), paramZbpn.Ze(), paramZbpn.ZN(), null, Zkoy.ZI(paramZbpn.ZA()), paramZbpn.Za());
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr4r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */