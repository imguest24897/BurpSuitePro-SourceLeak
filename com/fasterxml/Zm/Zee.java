package com.fasterxml.Zm;

public abstract class Zee {
  public static final Zee ZE = new Ze1();
  
  public static Zee Zg(String paramString1, String paramString2) {
    boolean bool1 = (paramString1 != null && !paramString1.isEmpty()) ? true : false;
    boolean bool2 = (paramString2 != null && !paramString2.isEmpty()) ? true : false;
    return (Zee)(bool1 ? (bool2 ? new Zen(paramString1, paramString2) : new Zel(paramString1)) : (bool2 ? new Zem(paramString2) : ZE));
  }
  
  public static Zee ZN(Zee paramZee1, Zee paramZee2) {
    return new Ze_(paramZee1, paramZee2);
  }
  
  public abstract String Zt(String paramString);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zee.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */