package burp;

import java.io.PrintWriter;
import java.io.StringWriter;

class Zgdl {
  static String Zl(Throwable paramThrowable) {
    StringWriter stringWriter = new StringWriter();
    PrintWriter printWriter = new PrintWriter(stringWriter);
    paramThrowable.printStackTrace(printWriter);
    return stringWriter.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgdl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */