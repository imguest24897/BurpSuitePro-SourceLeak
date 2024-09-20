package META-INF.versions.9.org.bouncycastle.util;

import java.io.IOException;

public class Exceptions {
  public static IllegalArgumentException illegalArgumentException(String paramString, Throwable paramThrowable) {
    return new IllegalArgumentException(paramString, paramThrowable);
  }
  
  public static IllegalStateException illegalStateException(String paramString, Throwable paramThrowable) {
    return new IllegalStateException(paramString, paramThrowable);
  }
  
  public static IOException ioException(String paramString, Throwable paramThrowable) {
    return new IOException(paramString, paramThrowable);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastl\\util\Exceptions.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */