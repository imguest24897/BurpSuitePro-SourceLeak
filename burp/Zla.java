package burp;

import java.util.Comparator;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zla implements Comparator<Object> {
  public int compare(Object paramObject1, Object paramObject2) {
    Zbqc[] arrayOfZbqc = Zlkk.Zw();
    if (paramObject1 instanceof String) {
      String str = (String)paramObject1;
      if (paramObject2 instanceof String) {
        String str1 = (String)paramObject2;
        try {
          if (arrayOfZbqc != null) {
            boolean bool1 = Zh(str);
            boolean bool2 = Zh(str1);
            try {
              if (bool1 && bool2) {
                Float float_1 = Float.valueOf(Float.parseFloat(str));
                Float float_2 = Float.valueOf(Float.parseFloat(str1));
                return float_1.compareTo(float_2);
              } 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
            try {
              if (bool1)
                return 1; 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
            try {
              if (bool2)
                return -1; 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
            return str.compareTo(str1);
          } 
          Zuh.Zb(false, Zqf.Zk, paramObject1.getClass().getName(), paramObject2.getClass().getName());
          return 0;
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } 
    Zuh.Zb(false, Zqf.Zk, paramObject1.getClass().getName(), paramObject2.getClass().getName());
    return 0;
  }
  
  private static boolean Zh(String paramString) {
    try {
      Float.parseFloat(paramString);
      return true;
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
      return false;
    } 
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zla.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */