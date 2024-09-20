package burp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Zmjf implements Zg_ {
  private final Map<String, Zgho> Zl;
  
  private final List<Zb8d> Zb;
  
  public Zmjf(Map<String, Zgho> paramMap, Zb8d... paramVarArgs) {
    ZK(paramMap);
    this.Zl = Collections.unmodifiableMap(paramMap);
    this.Zb = Collections.unmodifiableList(Arrays.asList(paramVarArgs));
  }
  
  private void ZK(Map<String, Zgho> paramMap) {
    for (String str : paramMap.keySet()) {
      try {
        if (str.length() > 4)
          throw new IllegalArgumentException(); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
  }
  
  public boolean ZS(Zzih paramZzih) {
    char c = paramZzih.Z_();
    try {
      if (ZG(c))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zw(paramZzih);
  }
  
  private boolean Zw(Zzih paramZzih) {
    int i = Math.min(4, paramZzih.Zp - paramZzih.ZD);
    String str = paramZzih.Zn.substring(paramZzih.ZD, paramZzih.ZD + i);
    int j = str.length();
    int[] arrayOfInt = Ztw7.Zz();
    while (j > 0) {
      String str1 = str.substring(0, j);
      Zgho zgho = this.Zl.get(str1);
      try {
        if (zgho != null) {
          try {
            if (ZC(paramZzih))
              return true; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          paramZzih.Zm(new Zsvc(zgho, null, paramZzih.Za, paramZzih.ZD, paramZzih.ZD + j));
          paramZzih.ZD += j;
          return true;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      j--;
      if (arrayOfInt == null)
        break; 
    } 
    return false;
  }
  
  private boolean ZC(Zzih paramZzih) {
    int[] arrayOfInt = Ztw7.Zz();
    for (Zb8d zb8d : this.Zb) {
      try {
        if (zb8d.Zo().ZS(paramZzih))
          return true; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      if (arrayOfInt == null)
        break; 
    } 
    return false;
  }
  
  private boolean ZG(char paramChar) {
    try {
      if (!Character.isLetterOrDigit(paramChar)) {
        try {
          if (Character.isWhitespace(paramChar));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmjf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */