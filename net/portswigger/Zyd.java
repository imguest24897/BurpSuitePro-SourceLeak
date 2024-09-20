package net.portswigger;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Zyd extends Z_y {
  private final List<Object> ZT = new LinkedList();
  
  private boolean Zd = true;
  
  public void ZM(boolean paramBoolean) {
    this.Zd = paramBoolean;
  }
  
  public boolean ZM() {
    return this.Zd;
  }
  
  public void ZQ(List<Object> paramList) {
    this.ZT.addAll(paramList);
  }
  
  public List<Object> ZB() {
    return this.ZT;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<Object> iterator = this.ZT.iterator();
    String[] arrayOfString = Zz.Za();
    while (iterator.hasNext()) {
      Object object = iterator.next();
      stringBuilder.append(object);
      if (arrayOfString == null)
        break; 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zyd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */