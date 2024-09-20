package burp;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import net.portswigger.Zdo;
import net.portswigger.Zkx;
import net.portswigger.Zmg;

public class Ztr7 {
  private final Zbnt Zt;
  
  public Ztr7(Zbnt paramZbnt) {
    this.Zt = paramZbnt;
  }
  
  public Zlit ZN(String paramString) throws MalformedURLException, Zxgy, Zxg5 {
    boolean bool = Zsba.Zt();
    try {
      if (paramString == null)
        throw new MalformedURLException(); 
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    Zmg.ZH(paramString, Zkx.LAX).Zp(MalformedURLException::new);
    URL uRL = new URL(paramString);
    byte[] arrayOfByte = Zc(uRL.getFile());
    Zmzk zmzk = this.Zt.ZY(Zmg3.ZA(uRL), Zmg3.Za(uRL), Zmg3.ZQ(uRL));
    if (Zbqc.Zwu() == null) {
      try {
      
      } catch (MalformedURLException malformedURLException) {
        throw a(null);
      } 
      Zsba.ZW(!bool);
    } 
    return new Zax(zmzk, arrayOfByte);
  }
  
  private static byte[] Zc(String paramString) throws MalformedURLException {
    boolean bool = Zsba.Zt();
    try {
      if (paramString != null)
        try {
          if (!paramString.isEmpty()) {
            char[] arrayOfChar = paramString.toCharArray();
            int i = arrayOfChar.length;
            byte b = 0;
            while (b < i) {
              char c = arrayOfChar[b];
              try {
                if (c <= ' ')
                  throw new MalformedURLException(); 
              } catch (MalformedURLException malformedURLException) {
                throw a(null);
              } 
              b++;
              if (!bool)
                break; 
            } 
            byte[] arrayOfByte = paramString.getBytes(StandardCharsets.UTF_8);
            return ZM(arrayOfByte);
          } 
          return Zdo.Za;
        } catch (MalformedURLException malformedURLException) {
          throw a(null);
        }  
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    return Zdo.Za;
  }
  
  private static byte[] ZM(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: new java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic Zu : ()Z
    //   11: aload_0
    //   12: astore_3
    //   13: istore_1
    //   14: aload_3
    //   15: arraylength
    //   16: istore #4
    //   18: iconst_0
    //   19: istore #5
    //   21: iload #5
    //   23: iload #4
    //   25: if_icmpge -> 68
    //   28: aload_3
    //   29: iload #5
    //   31: baload
    //   32: istore #6
    //   34: iload #6
    //   36: ifge -> 55
    //   39: aload_2
    //   40: bipush #37
    //   42: invokevirtual write : (I)V
    //   45: aload_2
    //   46: iload #6
    //   48: invokestatic Ze : (Ljava/io/ByteArrayOutputStream;B)V
    //   51: iload_1
    //   52: ifeq -> 61
    //   55: aload_2
    //   56: iload #6
    //   58: invokevirtual write : (I)V
    //   61: iinc #5, 1
    //   64: iload_1
    //   65: ifeq -> 21
    //   68: aload_2
    //   69: invokevirtual toByteArray : ()[B
    //   72: areturn
  }
  
  private static MalformedURLException a(MalformedURLException paramMalformedURLException) {
    return paramMalformedURLException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztr7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */