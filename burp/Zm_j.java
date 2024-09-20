package burp;

import java.util.Objects;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zm_j extends Zmn5 {
  public final Zkhr Zy;
  
  public Zm_j(String paramString, Zkhr paramZkhr) {
    super(paramString);
    this.Zy = paramZkhr;
  }
  
  public Zm_j(String paramString, Zkhr paramZkhr, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.Zy = paramZkhr;
  }
  
  public Zsc2 Zg() {
    boolean bool = Zmna.ZB();
    try {
      switch (this.Zy.ordinal()) {
        case 0:
          return new Zsd8(getCause().getMessage());
        case 1:
          return new Zsdo((Zs2o)getCause());
        case 2:
          return new Zsc5(Objects.<Throwable>requireNonNullElse(getCause(), this));
        case 3:
          return new Zscr(Objects.<Throwable>requireNonNullElse(getCause(), this));
        case 4:
          return new Zsct(Objects.<Throwable>requireNonNullElse(getCause(), this));
        case 5:
          return new Zscy(Objects.<Throwable>requireNonNullElse(getCause(), this));
      } 
    } catch (Zsd8 zsd8) {
      throw a(null);
    } 
    try {
      Zuh.ZT(false, Zqf.Zx, this.Zy.name());
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (Zsd8 zsd8) {
          throw a(null);
        } 
        Zmna.ZQ(!bool);
      } 
    } catch (Zsd8 zsd8) {
      throw a(null);
    } 
    return new Zsc5(Objects.<Throwable>requireNonNullElse(getCause(), this));
  }
  
  private static Zsd8 a(Zsd8 paramZsd8) {
    return paramZsd8;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm_j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */