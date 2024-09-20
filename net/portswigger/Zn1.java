package net.portswigger;

class Zn1 {
  private final String Zc;
  
  private final boolean ZI;
  
  private final boolean Zs;
  
  private Zn1(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    this.Zc = paramString;
    this.ZI = paramBoolean1;
    this.Zs = paramBoolean2;
  }
  
  private String Zp() {
    return this.Zc;
  }
  
  private boolean Zk() {
    return this.ZI;
  }
  
  private boolean Zw() {
    return this.Zs;
  }
  
  private static Zn1 ZI(String paramString) {
    return new Zn1(paramString, true, false);
  }
  
  private static Zn1 ZC(String paramString) {
    return new Zn1(paramString, true, true);
  }
  
  private static Zn1 Zu(int paramInt) {
    return new Zn1("[" + paramInt + "]", false, false);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zn1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */