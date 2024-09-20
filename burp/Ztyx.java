package burp;

import java.util.List;

public class Ztyx {
  private final String ZS;
  
  private final Zb_j Zn;
  
  public Ztyx(String paramString, Zb_j paramZb_j) {
    this.ZS = paramString;
    this.Zn = paramZb_j;
  }
  
  public void ZS(List<String> paramList) {
    Zrvr<String> zrvr = Ztyx::lambda$saveList$0;
    (new Zkm6<>(zrvr)).Zs(paramList, this.ZS, this.Zn);
  }
  
  public List<String> Zb() {
    Zblo<?> zblo = Ztyx::lambda$saveList$0;
    Zsvj<String> zsvj = new Zsvj(zblo);
    return zsvj.ZT(this.ZS, this.Zn);
  }
  
  private static String lambda$saveList$0(String paramString) {
    return paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztyx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */