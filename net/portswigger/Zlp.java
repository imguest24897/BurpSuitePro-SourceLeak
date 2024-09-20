package net.portswigger;

import burp.Zbqc;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Zlp {
  private final Zqf Zl;
  
  private final String ZA;
  
  private final Throwable ZP;
  
  public Zlp(Zqf paramZqf, String paramString, Throwable paramThrowable) {
    this.Zl = paramZqf;
    this.ZA = paramString;
    this.ZP = paramThrowable;
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof Zlp && ((Zlp)paramObject).Zl.equals(this.Zl) && ((Zlp)paramObject).ZA.equals(this.ZA));
  }
  
  public int hashCode() {
    int[] arrayOfInt = Zuh.ZB();
    if (Zbqc.Zwu() == null)
      Zuh.ZJ(new int[2]); 
    return this.Zl.toString().hashCode() + this.ZA.hashCode();
  }
  
  public String toString() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(byteArrayOutputStream);
    (new Zdp()).ZH(printStream, Zk_.FAILED_ASSERTION, this.ZA, this.ZP);
    printStream.flush();
    int[] arrayOfInt = Zuh.ZB();
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[1]); 
    return byteArrayOutputStream.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zlp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */