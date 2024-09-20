package org.bouncycastle.mime;

import java.io.IOException;
import java.io.InputStream;

public class ConstantMimeContext implements MimeContext, MimeMultipartContext {
  public static final ConstantMimeContext Instance = new ConstantMimeContext();
  
  public InputStream applyContext(Headers paramHeaders, InputStream paramInputStream) throws IOException {
    return paramInputStream;
  }
  
  public MimeContext createContext(int paramInt) throws IOException {
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\mime\ConstantMimeContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */