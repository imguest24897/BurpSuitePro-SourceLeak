package burp;

import burp.api.montoya.BurpExtension;
import java.lang.reflect.Modifier;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zeoo {
  private final Zskh ZX;
  
  private static String[] Zc;
  
  public Zeoo(Zskh paramZskh) {
    this.ZX = paramZskh;
  }
  
  public Zr9w Zv(String paramString, ClassLoader paramClassLoader, Zeu1 paramZeu1) {
    try {
      Class<?> clazz = Class.forName(paramString, false, paramClassLoader);
      try {
        if (!clazz.isInterface())
          try {
            if (!Modifier.isAbstract(clazz.getModifiers())) {
              try {
                if (BurpExtension.class.isAssignableFrom(clazz) && IBurpExtender.class.isAssignableFrom(clazz)) {
                  Object object = clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
                  return new Zsqs(paramZeu1, object, this.ZX);
                } 
              } catch (UnsupportedClassVersionError unsupportedClassVersionError) {
                throw a(null);
              } 
              if (BurpExtension.class.isAssignableFrom(clazz)) {
                BurpExtension burpExtension = clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
                return new Zz6g(paramZeu1, burpExtension, this.ZX);
              } 
              if (IBurpExtender.class.isAssignableFrom(clazz)) {
                IBurpExtender iBurpExtender = clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
                return new Zt9h(paramZeu1, iBurpExtender, this.ZX);
              } 
            } 
          } catch (UnsupportedClassVersionError unsupportedClassVersionError) {
            throw a(null);
          }  
      } catch (UnsupportedClassVersionError unsupportedClassVersionError) {
        throw a(null);
      } 
    } catch (UnsupportedClassVersionError unsupportedClassVersionError) {
      Zah.Zl(unsupportedClassVersionError, Zk_.RETHROWN);
      throw unsupportedClassVersionError;
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
    } 
    return null;
  }
  
  public static void Za(String[] paramArrayOfString) {
    Zc = paramArrayOfString;
  }
  
  public static String[] Zj() {
    return Zc;
  }
  
  private static UnsupportedClassVersionError a(UnsupportedClassVersionError paramUnsupportedClassVersionError) {
    return paramUnsupportedClassVersionError;
  }
  
  static {
    if (Zj() != null)
      Za(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeoo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */