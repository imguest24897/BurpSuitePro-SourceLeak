package burp;

public class Zepz {
  public static boolean Zm(Throwable paramThrowable) {
    if (paramThrowable instanceof OutOfMemoryError)
      return true; 
    Throwable throwable = paramThrowable.getCause();
    return (throwable == null) ? false : Zm(throwable);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zepz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */