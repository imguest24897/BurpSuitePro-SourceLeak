package net.portswigger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Z_y implements Zot {
  private Zgp ZW;
  
  private static Class ZM = ArrayList.class;
  
  protected Zot ZQ;
  
  protected List<Zot> ZR = ZE();
  
  private int Za;
  
  private int Zu;
  
  private boolean ZH;
  
  private static String[] Zm;
  
  public Zgp ZL() {
    String[] arrayOfString = Zz.Za();
    if (this.ZW == null)
      for (Zot zot : ZU()) {
        try {
          this.ZW = zot.ZL();
          if (this.ZW != null || arrayOfString == null)
            break; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      }  
    return this.ZW;
  }
  
  public void ZA(Zgp paramZgp) {
    this.ZW = paramZgp;
  }
  
  private List<Zot> ZE() {
    try {
      return ZM.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    } catch (Exception exception) {
      throw new RuntimeException(exception);
    } 
  }
  
  public boolean ZD() {
    return this.ZH;
  }
  
  public void ZD(boolean paramBoolean) {
    this.ZH = paramBoolean;
  }
  
  public void ZS(Zot paramZot) {
    this.ZQ = paramZot;
  }
  
  public Zot Zi() {
    return this.ZQ;
  }
  
  public void Zs(Zot paramZot) {
    this.ZR.add(paramZot);
    paramZot.ZS(this);
  }
  
  public void Zl(int paramInt, Zot paramZot) {
    this.ZR.add(paramInt, paramZot);
    paramZot.ZS(this);
  }
  
  public Zot ZO(int paramInt) {
    return this.ZR.get(paramInt);
  }
  
  public void ZD(int paramInt, Zot paramZot) {
    this.ZR.set(paramInt, paramZot);
    paramZot.ZS(this);
  }
  
  public Zot ZR(int paramInt) {
    return this.ZR.remove(paramInt);
  }
  
  public int ZO() {
    return this.ZR.size();
  }
  
  public List<Zot> ZU() {
    return Collections.unmodifiableList(this.ZR);
  }
  
  public int ZZ() {
    return this.Za;
  }
  
  public void ZG(int paramInt) {
    this.Za = paramInt;
  }
  
  public int Z_() {
    return this.Zu;
  }
  
  public void Zn(int paramInt) {
    this.Zu = paramInt;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<Zz> iterator = Zx().iterator();
    String[] arrayOfString = Zz.Za();
    while (iterator.hasNext()) {
      Zz zz = iterator.next();
      stringBuilder.append(zz);
      if (arrayOfString == null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  static {
    Zm(new String[4]);
  }
  
  public static void Zm(String[] paramArrayOfString) {
    Zm = paramArrayOfString;
  }
  
  public static String[] Zc() {
    return Zm;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Z_y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */