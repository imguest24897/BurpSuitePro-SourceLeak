package org.bouncycastle.cms;

import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.operator.InputAEADDecryptor;
import org.bouncycastle.operator.InputDecryptor;
import org.bouncycastle.operator.MacCalculator;
import org.bouncycastle.util.io.TeeInputStream;

public class RecipientOperator {
  private final Object operator;
  
  public RecipientOperator(InputDecryptor paramInputDecryptor) {
    this.operator = paramInputDecryptor;
  }
  
  public RecipientOperator(MacCalculator paramMacCalculator) {
    this.operator = paramMacCalculator;
  }
  
  public InputStream getInputStream(InputStream paramInputStream) {
    return (InputStream)((this.operator instanceof InputDecryptor) ? ((InputDecryptor)this.operator).getInputStream(paramInputStream) : new TeeInputStream(paramInputStream, ((MacCalculator)this.operator).getOutputStream()));
  }
  
  public boolean isAEADBased() {
    return this.operator instanceof InputAEADDecryptor;
  }
  
  public OutputStream getAADStream() {
    return ((InputAEADDecryptor)this.operator).getAADStream();
  }
  
  public boolean isMacBased() {
    return this.operator instanceof MacCalculator;
  }
  
  public byte[] getMac() {
    return (this.operator instanceof MacCalculator) ? ((MacCalculator)this.operator).getMac() : ((this.operator instanceof InputAEADDecryptor) ? ((InputAEADDecryptor)this.operator).getMAC() : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\RecipientOperator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */