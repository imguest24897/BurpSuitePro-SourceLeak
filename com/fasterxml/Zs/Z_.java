package com.fasterxml.Zs;

import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zw.Zl;
import java.io.IOException;

@Zl
final class Z_ extends Zc {
  private static final long serialVersionUID = 1L;
  
  private static final Z_ ZS = new Z_(String.class);
  
  private static final Z_ ZX = new Z_(Object.class);
  
  private Z_(Class<?> paramClass) {
    super(-1, paramClass);
  }
  
  public static Z_ Zx(Class<?> paramClass) {
    return (paramClass == String.class) ? ZS : ((paramClass == Object.class) ? ZX : new Z_(paramClass));
  }
  
  public Object Z_(String paramString, Zyg paramZyg) throws IOException {
    return paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Z_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */