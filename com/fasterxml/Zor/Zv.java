package com.fasterxml.Zor;

@Deprecated
public class Zv extends Zx {
  public Zv() {}
  
  protected Zv(boolean paramBoolean) {
    super(paramBoolean);
  }
  
  public String Zh(String paramString) {
    if (paramString == null || paramString.isEmpty())
      return paramString; 
    char c1 = paramString.charAt(0);
    char c2 = Character.toUpperCase(c1);
    if (c1 == c2)
      return paramString; 
    StringBuilder stringBuilder = new StringBuilder(paramString);
    stringBuilder.setCharAt(0, c2);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */