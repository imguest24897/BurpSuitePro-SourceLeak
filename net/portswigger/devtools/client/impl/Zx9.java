package net.portswigger.devtools.client.impl;

import java.util.concurrent.CompletableFuture;

public class Zx9<T> extends CompletableFuture<T> {
  private static String[] Zr;
  
  public static void Zn(String[] paramArrayOfString) {
    Zr = paramArrayOfString;
  }
  
  public static String[] Zc() {
    return Zr;
  }
  
  static {
    if (Zc() == null)
      Zn(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zx9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */