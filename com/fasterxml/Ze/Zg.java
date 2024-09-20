package com.fasterxml.Ze;

import com.fasterxml.Zo.Zv;
import java.util.HashMap;
import java.util.Locale;

class Zg extends HashMap<String, Zv> {
  private static final long serialVersionUID = 1L;
  
  protected final Locale ZP;
  
  @Deprecated
  public Zg() {
    this(Locale.getDefault());
  }
  
  public Zg(Locale paramLocale) {
    this.ZP = paramLocale;
  }
  
  public static Zg Zh(Locale paramLocale) {
    return new Zg(paramLocale);
  }
  
  public Zv ZP(Object paramObject) {
    return super.get(((String)paramObject).toLowerCase(this.ZP));
  }
  
  public Zv Za(String paramString, Zv paramZv) {
    paramString = paramString.toLowerCase(this.ZP);
    return super.put(paramString, paramZv);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */