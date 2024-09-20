package net.portswigger;

import java.util.LinkedList;
import java.util.List;

public class Zym extends Z_y {
  private final List<Object> ZN = new LinkedList();
  
  public void Zs(List<Object> paramList) {
    this.ZN.addAll(paramList);
  }
  
  public List<Object> ZV() {
    return this.ZN;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    String[] arrayOfString = Zz.Za();
    for (Object object : this.ZN) {
      stringBuilder.append(object);
      if (arrayOfString == null)
        break; 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zym.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */