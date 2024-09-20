package META-INF.versions.9.org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.InMemoryRepresentable;

public interface ASN1BitStringParser extends ASN1Encodable, InMemoryRepresentable {
  InputStream getBitStream() throws IOException;
  
  InputStream getOctetStream() throws IOException;
  
  int getPadBits();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\ASN1BitStringParser.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */