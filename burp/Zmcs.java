package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zmcs implements Zez2 {
  private static String Zf;
  
  public char Zx(Zzih paramZzih) {
    char c = paramZzih.Z_();
    try {
      if (c == '\\') {
        try {
          if (paramZzih.ZD + 1 >= paramZzih.Zp)
            return c; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        paramZzih.ZD++;
        char c1 = paramZzih.Z_();
        try {
          if (c1 != '\'') {
            try {
              if (c1 != '"') {
                try {
                  if (c1 == '\\')
                    return c1; 
                } catch (NumberFormatException numberFormatException) {
                  throw a(null);
                } 
              } else {
                return c1;
              } 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
          } else {
            return c1;
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        try {
          if (c1 == '0')
            return Character.MIN_VALUE; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        try {
          if (c1 == 'b')
            return '\b'; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        try {
          if (c1 == 'f')
            return '\f'; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        try {
          if (c1 == 'n')
            return '\n'; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        try {
          if (c1 == 'r')
            return '\r'; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        try {
          if (c1 == 't')
            return '\t'; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        try {
          if (c1 == 'v')
            return '\013'; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        try {
          if (c1 == 'u')
            return Zm(paramZzih, 4); 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        try {
          if (c1 == 'x')
            return Zm(paramZzih, 2); 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        try {
          if (c1 == '\r')
            return ZS(paramZzih, c1); 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        try {
          if (c1 != '\n')
            try {
              if (c1 != ' ')
                try {
                  return (c1 != ' ') ? c1 : ZN(paramZzih, c1);
                } catch (NumberFormatException numberFormatException) {
                  throw a(null);
                }  
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            }  
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return ZN(paramZzih, c1);
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return c;
  }
  
  private char Zm(Zzih paramZzih, int paramInt) {
    int i = paramZzih.ZD + 1;
    int j = i + paramInt;
    try {
      if (j > paramZzih.Zp)
        return ' '; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    paramZzih.ZD += paramInt;
    try {
      return (char)Integer.parseInt(paramZzih.Zn.substring(i, j), 16);
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
      return ' ';
    } 
  }
  
  private char ZS(Zzih paramZzih, char paramChar) {
    try {
      if (paramZzih.ZD + 1 >= paramZzih.Zp)
        return paramChar; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    paramZzih.ZD++;
    paramChar = paramZzih.Z_();
    try {
      if (paramChar == '\n')
        return ZN(paramZzih, paramChar); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return paramChar;
  }
  
  private char ZN(Zzih paramZzih, char paramChar) {
    try {
      if (paramZzih.ZD + 1 >= paramZzih.Zp)
        return paramChar; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    paramZzih.ZD++;
    return Zx(paramZzih);
  }
  
  public static void Zi(String paramString) {
    Zf = paramString;
  }
  
  public static String ZK() {
    return Zf;
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    if (ZK() == null)
      Zi("jPkwAb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmcs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */