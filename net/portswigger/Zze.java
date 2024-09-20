package net.portswigger;

import burp.Zbqc;
import java.io.File;

public class Zze {
  private static String Ze;
  
  public static void Zd(File paramFile) {
    paramFile.setReadable(false, false);
    paramFile.setReadable(true, true);
    paramFile.setWritable(false, false);
    paramFile.setWritable(true, true);
    String str = Za();
    paramFile.setExecutable(false, false);
    if (paramFile.isDirectory())
      paramFile.setExecutable(true, true); 
    if (str == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public static void Zr(String paramString) {
    Ze = paramString;
  }
  
  public static String Za() {
    return Ze;
  }
  
  static {
    if (Za() == null)
      Zr("s0XZoc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zze.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */