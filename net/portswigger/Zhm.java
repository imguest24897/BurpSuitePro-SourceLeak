package net.portswigger;

import java.util.LinkedList;
import java.util.List;

public class Zhm extends Zbk {
  private final List<Object> Zo = new LinkedList();
  
  private boolean Zg = true;
  
  public void Zk(boolean paramBoolean) {
    this.Zg = paramBoolean;
  }
  
  public boolean ZS() {
    return this.Zg;
  }
  
  public void ZJ(List<Object> paramList) {
    this.Zo.addAll(paramList);
  }
  
  public List<Object> ZW() {
    return this.Zo;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    boolean bool = Ze7.Zy();
    for (Object object : this.Zo) {
      stringBuilder.append(object);
      if (bool)
        break; 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zhm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */