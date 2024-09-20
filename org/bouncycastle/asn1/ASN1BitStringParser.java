package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

public interface ASN1BitStringParser extends ASN1Encodable, InMemoryRepresentable {
  InputStream getBitStream() throws IOException;
  
  InputStream getOctetStream() throws IOException;
  
  int getPadBits();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\ASN1BitStringParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */