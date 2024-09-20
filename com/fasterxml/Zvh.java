package com.fasterxml;

import com.fasterxml.Zj.Zf;
import com.fasterxml.Zm.Ze;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zy7;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zoz.Zia;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public abstract class Zvh {
  protected static final Zyd<Object> ZP = new Zzw();
  
  protected static final Zyd<Object> Zf = new Zza();
  
  public static Zyd<Object> ZA(Zy7 paramZy7, Class<?> paramClass, boolean paramBoolean) {
    if (paramClass == null || paramClass == Object.class)
      return new Zzi(); 
    if (paramClass == String.class)
      return Zf; 
    if (paramClass.isPrimitive())
      paramClass = Zx.ZP(paramClass); 
    return (paramClass == Integer.class) ? new Zzu(5, paramClass) : ((paramClass == Long.class) ? new Zzu(6, paramClass) : ((paramClass.isPrimitive() || Number.class.isAssignableFrom(paramClass)) ? new Zzu(8, paramClass) : ((paramClass == Class.class) ? new Zzu(3, paramClass) : (Date.class.isAssignableFrom(paramClass) ? new Zzu(1, paramClass) : (Calendar.class.isAssignableFrom(paramClass) ? new Zzu(2, paramClass) : ((paramClass == UUID.class) ? new Zzu(8, paramClass) : ((paramClass == byte[].class) ? new Zzu(7, paramClass) : (paramBoolean ? new Zzu(8, paramClass) : null))))))));
  }
  
  public static Zyd<Object> Zs(Zy7 paramZy7, Class<?> paramClass, Zia paramZia) {
    if (paramClass != null) {
      if (paramClass == Enum.class)
        return new Zzi(); 
      if (Zx.Zb(paramClass))
        return Zzy.ZK(paramClass, Ze.Zk((Zf)paramZy7, paramZia), Zso.ZW(paramZy7, (Class)paramClass, paramZia)); 
    } 
    return new Zzu(8, paramClass);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zvh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */