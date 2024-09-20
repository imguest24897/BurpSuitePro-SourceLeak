package org.bouncycastle.mime;

import java.io.IOException;
import java.io.InputStream;

public interface MimeParserProvider {
  MimeParser createParser(InputStream paramInputStream) throws IOException;
  
  MimeParser createParser(Headers paramHeaders, InputStream paramInputStream) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\mime\MimeParserProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */