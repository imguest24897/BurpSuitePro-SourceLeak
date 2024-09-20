package org.bouncycastle.mime;

import java.io.IOException;
import java.io.InputStream;

public interface MimeParserListener {
  MimeContext createContext(MimeParserContext paramMimeParserContext, Headers paramHeaders);
  
  void object(MimeParserContext paramMimeParserContext, Headers paramHeaders, InputStream paramInputStream) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\mime\MimeParserListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */