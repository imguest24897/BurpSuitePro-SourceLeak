package net.portswigger;

import java.util.ArrayList;
import java.util.List;

public abstract class Zln<T extends Number, R extends Zln<T, R>> {
  protected boolean ZK = true;
  
  protected Number Zq;
  
  protected Number ZC;
  
  protected Number ZZ;
  
  protected List<T> ZS = new ArrayList<>();
  
  protected String Zy = "";
  
  public R Zw(boolean paramBoolean) {
    this.ZK = paramBoolean;
    return Zy();
  }
  
  public R ZO(Number paramNumber) {
    this.Zq = paramNumber;
    return Zy();
  }
  
  public R Zu(Number paramNumber) {
    this.ZC = paramNumber;
    return Zy();
  }
  
  public R ZY(Number paramNumber) {
    this.ZZ = paramNumber;
    return Zy();
  }
  
  public R Zq(T paramT) {
    this.ZS.add(paramT);
    return Zy();
  }
  
  public R Zs(String paramString) {
    this.Zy = paramString;
    return Zy();
  }
  
  private R Zy() {
    return (R)this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zln.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */