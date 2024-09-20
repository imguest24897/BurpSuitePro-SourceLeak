package burp;

import java.util.stream.StreamSupport;

public class Zsui {
  public boolean Za(Zglo paramZglo) {
    return (paramZglo != null && paramZglo.Zb() && StreamSupport.<Zzml>stream(paramZglo.spliterator(), false).noneMatch(Zsui::lambda$isValid$0));
  }
  
  private static boolean ZJ(Zzml paramZzml) {
    return (paramZzml.ZkR().length() > 300);
  }
  
  private static boolean ZK(Zzml paramZzml) {
    return (paramZzml.Zkp() == Ze9r.DEFINED_OPTIONS && (paramZzml.Zkv().size() < 2 || paramZzml.Zkv().size() > 11 || paramZzml.Zk_().size() > 5));
  }
  
  private static boolean lambda$isValid$0(Zzml paramZzml) {
    return (ZJ(paramZzml) || ZK(paramZzml));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsui.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */