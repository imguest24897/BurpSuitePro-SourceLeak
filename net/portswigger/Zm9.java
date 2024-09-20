package net.portswigger;

import java.util.Base64;

public class Zm9 implements Za1 {
  private final StringBuilder ZJ;
  
  public Zm9() {
    this(new StringBuilder());
  }
  
  public Zm9(StringBuilder paramStringBuilder) {
    this.ZJ = paramStringBuilder;
  }
  
  public Za1 Zz(char paramChar) {
    this.ZJ.append(paramChar);
    return this;
  }
  
  public Za1 Zk(long paramLong) {
    this.ZJ.append(paramLong);
    return this;
  }
  
  public Za1 Zr(boolean paramBoolean) {
    this.ZJ.append(paramBoolean);
    return this;
  }
  
  public Za1 Z_(String paramString) {
    this.ZJ.append(paramString);
    return this;
  }
  
  public Za1 ZF(String paramString, int paramInt1, int paramInt2) {
    this.ZJ.append(paramString, paramInt1, paramInt2);
    return this;
  }
  
  public Za1 ZD(Zij paramZij) {
    return Z_(Base64.getEncoder().encodeToString(paramZij.ZiH()));
  }
  
  public void Zr() {}
  
  public String toString() {
    return this.ZJ.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zm9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */