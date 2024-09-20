package org.bouncycastle.asn1;

import java.io.IOException;

public interface InMemoryRepresentable {
  ASN1Primitive getLoadedObject() throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\InMemoryRepresentable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */