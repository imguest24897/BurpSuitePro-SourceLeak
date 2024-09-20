package org.bouncycastle.asn1;

import java.io.IOException;

public interface ASN1SequenceParser extends ASN1Encodable, InMemoryRepresentable {
  ASN1Encodable readObject() throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\ASN1SequenceParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */