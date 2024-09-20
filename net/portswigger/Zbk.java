package net.portswigger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zbk implements Zld {
  private Z_z ZU;
  
  private static Class Zt = ArrayList.class;
  
  protected Zld ZS;
  
  protected List<Zld> Zc = ZA();
  
  private int Zr;
  
  private int ZD;
  
  private boolean ZP;
  
  private static String[] Zx;
  
  public Z_z ZE() {
    boolean bool = Ze7.ZN();
    if (this.ZU == null)
      for (Zld zld : ZK()) {
        try {
          this.ZU = zld.ZE();
          if (this.ZU != null || !bool)
            break; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      }  
    return this.ZU;
  }
  
  public void Zh(Z_z paramZ_z) {
    this.ZU = paramZ_z;
  }
  
  private List<Zld> ZA() {
    try {
      return Zt.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    } catch (Exception exception) {
      throw new RuntimeException(exception);
    } 
  }
  
  public boolean Zq() {
    return this.ZP;
  }
  
  public void Zx(boolean paramBoolean) {
    this.ZP = paramBoolean;
  }
  
  public void ZP(Zld paramZld) {
    this.ZS = paramZld;
  }
  
  public Zld Zo() {
    return this.ZS;
  }
  
  public void ZO(Zld paramZld) {
    this.Zc.add(paramZld);
    paramZld.ZP(this);
  }
  
  public void Zo(int paramInt, Zld paramZld) {
    this.Zc.add(paramInt, paramZld);
    paramZld.ZP(this);
  }
  
  public Zld Zu(int paramInt) {
    return this.Zc.get(paramInt);
  }
  
  public void ZL(int paramInt, Zld paramZld) {
    this.Zc.set(paramInt, paramZld);
    paramZld.ZP(this);
  }
  
  public Zld ZN(int paramInt) {
    return this.Zc.remove(paramInt);
  }
  
  public int Zd() {
    return this.Zc.size();
  }
  
  public List<Zld> ZK() {
    return Collections.unmodifiableList(this.Zc);
  }
  
  public int Zg() {
    return this.Zr;
  }
  
  public void Zc(int paramInt) {
    this.Zr = paramInt;
  }
  
  public int Zu() {
    return this.ZD;
  }
  
  public void Zf(int paramInt) {
    this.ZD = paramInt;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    boolean bool = Ze7.ZN();
    for (Ze7 ze7 : ZZ()) {
      stringBuilder.append(ze7);
      if (!bool)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  static {
    Zg(null);
  }
  
  public static void Zg(String[] paramArrayOfString) {
    Zx = paramArrayOfString;
  }
  
  public static String[] Zy() {
    return Zx;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zbk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */