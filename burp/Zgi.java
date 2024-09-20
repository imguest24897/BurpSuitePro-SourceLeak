package burp;

import net.portswigger.Zfe;

public interface Zgi {
  Ztbo ZF();
  
  String Zo();
  
  void ZF(String paramString);
  
  String ZR();
  
  boolean ZS();
  
  void Zi(boolean paramBoolean);
  
  String Zy();
  
  default boolean Ze() {
    return !Zy().isEmpty();
  }
  
  boolean ZY();
  
  boolean ZK(Zgi paramZgi);
  
  void ZL(Zgi paramZgi);
  
  Ztcx ZE(Zgi paramZgi);
  
  static Zgi Zn(Zfe paramZfe, String paramString1, String paramString2, String paramString3) {
    return ZR(paramZfe, paramString1, paramString2, paramString3, true);
  }
  
  static Zgi Za(Zfe paramZfe, String paramString1, String paramString2, String paramString3) {
    return ZR(paramZfe, paramString1, paramString2, paramString3, false);
  }
  
  private static Zgi ZR(Zfe paramZfe, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    switch (Zki5.Zd[paramZfe.ordinal()]) {
      case 1:
      
      case 2:
      
      case 3:
      
      case 4:
      
      case 5:
      
    } 
    return new Zmiu(paramZfe, paramString3, paramBoolean);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */