package burp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zt5 {
  private final List<Zeap> Zz;
  
  private final Object ZC;
  
  private final Map<String, Zrt_> ZE;
  
  public Zt5(List<Zeap> paramList, Object paramObject) {
    this.Zz = paramList;
    this.ZC = paramObject;
    this.ZE = new HashMap<>();
  }
  
  public void ZM(String paramString, Zkjm paramZkjm) {
    int i = Zkh7.ZP();
    synchronized (this.ZC) {
      for (Zeap zeap : this.Zz) {
        if (zeap.Zh() && Zsw8.Zc(paramString, zeap.ZO()))
          zeap.ZK().Zn(paramZkjm); 
        if (i == 0)
          break; 
      } 
    } 
  }
  
  public Zrt_ ZY(String paramString) {
    synchronized (this.ZC) {
      Zrt_ zrt_ = this.ZE.get(paramString);
      if (zrt_ != null)
        return zrt_; 
      Zeap zeap = null;
      for (Zeap zeap1 : this.Zz) {
        if (zeap1.Zh() && Zsw8.Zc(paramString, zeap1.ZO())) {
          zeap = zeap1;
          break;
        } 
      } 
      if (zeap == null)
        return null; 
      this.ZE.put(paramString, zeap.ZK());
      return zeap.ZK();
    } 
  }
  
  public void Zr() {
    synchronized (this.ZC) {
      this.ZE.clear();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */