package net.portswigger;

import java.util.LinkedList;
import java.util.List;

public class Zx_ extends Zbk {
  private final List<Object> ZX = new LinkedList();
  
  public void Zb(List<Object> paramList) {
    this.ZX.addAll(paramList);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    boolean bool = Ze7.ZN();
    for (Object object : this.ZX) {
      stringBuilder.append(object);
      if (!bool)
        break; 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zx_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */