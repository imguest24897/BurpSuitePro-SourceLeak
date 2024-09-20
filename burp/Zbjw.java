package burp;

import java.util.List;
import net.portswigger.Zen;
import net.portswigger.Zkb;

abstract class Zbjw {
  private final Zt8g Zc;
  
  private final String Zi;
  
  private final byte Zn;
  
  private final List<String> ZV;
  
  private final Zen Zy;
  
  private final Zzud ZP;
  
  Zbjw(Zzud paramZzud, Zt8g paramZt8g, List<String> paramList, String paramString, Zen paramZen, byte paramByte) {
    this.Zc = paramZt8g;
    this.ZV = paramList;
    this.Zi = paramString;
    this.Zy = paramZen;
    this.Zn = paramByte;
    this.ZP = paramZzud;
  }
  
  abstract boolean ZB();
  
  Zt8g ZQ() {
    return this.Zc;
  }
  
  String Za() {
    return this.Zi;
  }
  
  byte ZR() {
    return this.Zn;
  }
  
  List<String> Zq() {
    return this.ZV;
  }
  
  Zen Zh() {
    return this.Zy;
  }
  
  Zzud ZF() {
    return this.ZP;
  }
  
  Zb6q Zr() {
    return this.ZP.ZT();
  }
  
  boolean Zo(String... paramVarArgs) {
    String[] arrayOfString = paramVarArgs;
    int i = arrayOfString.length;
    Zbqc[] arrayOfZbqc = Zmk.ZK();
    byte b = 0;
    while (b < i) {
      String str = arrayOfString[b];
      if (ZL(Zr().Za(), str))
        return true; 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return false;
  }
  
  boolean Zl(String... paramVarArgs) {
    Zbqc[] arrayOfZbqc = Zmk.ZK();
    for (String str : ZF().ZR()) {
      String[] arrayOfString = paramVarArgs;
      int i = arrayOfString.length;
      byte b = 0;
      while (b < i) {
        String str1 = arrayOfString[b];
        if (str.toLowerCase().startsWith(str1.toLowerCase() + ":"))
          return true; 
        b++;
        if (arrayOfZbqc != null)
          break; 
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
    return false;
  }
  
  boolean ZY(String... paramVarArgs) {
    Zbqc[] arrayOfZbqc = Zmk.ZK();
    for (String str : ZF().ZR()) {
      String[] arrayOfString = paramVarArgs;
      int i = arrayOfString.length;
      byte b = 0;
      while (b < i) {
        String str1 = arrayOfString[b];
        int j = str.indexOf(':');
        if (j >= 0 && str.substring(j + 1).trim().equalsIgnoreCase(str1))
          return true; 
        b++;
        if (arrayOfZbqc != null)
          break; 
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
    return false;
  }
  
  private static boolean ZL(Zstu paramZstu, String paramString) {
    return (Zlt_.Zf(paramZstu, Zkb.Zy(paramString), false) >= 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbjw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */