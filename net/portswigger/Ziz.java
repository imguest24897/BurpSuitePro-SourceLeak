package net.portswigger;

import burp.Zbqc;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Ziz {
  private final Map<String, Zms> ZW = new LinkedHashMap<>();
  
  private final List<Zf6> ZY;
  
  public Ziz() {
    this.ZY = new ArrayList<>();
  }
  
  public Ziz(Zf6 paramZf6) {
    boolean bool = Zrmr.ZmZ();
    this.ZY = new ArrayList<>();
    this.ZW.putAll(paramZf6.znW);
    this.ZY.addAll(paramZf6.zn1);
    if (Zbqc.Zwu() == null)
      Zrmr.Zl(!bool); 
  }
  
  public Ziz ZG(String paramString, Zms paramZms) {
    this.ZW.put(paramString, paramZms);
    return this;
  }
  
  public Ziz Zu(Map<String, Zms> paramMap) {
    this.ZW.putAll(paramMap);
    return this;
  }
  
  public Ziz ZM(List<Zf6> paramList) {
    this.ZY.addAll(paramList);
    return this;
  }
  
  public Zf6 ZI() {
    return (this.ZW.isEmpty() && this.ZY.isEmpty()) ? Zf6.Zv : new Zf6(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Ziz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */