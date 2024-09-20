package burp;

import java.util.Objects;

public class Zm_o extends Zmn5 {
  public Zm_o(String paramString) {
    super(paramString);
  }
  
  public Zm_o(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public Zm_o(Throwable paramThrowable) {
    super(paramThrowable);
  }
  
  public Zsc2 Zg() {
    return new Zsce(Objects.<Throwable>requireNonNullElse(getCause(), this));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm_o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */