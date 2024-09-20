package org.bouncycastle.asn1;

import java.io.IOException;

public interface ASN1TaggedObjectParser extends ASN1Encodable, InMemoryRepresentable {
  int getTagClass();
  
  int getTagNo();
  
  boolean hasContextTag();
  
  boolean hasContextTag(int paramInt);
  
  boolean hasTag(int paramInt1, int paramInt2);
  
  boolean hasTagClass(int paramInt);
  
  ASN1Encodable parseBaseUniversal(boolean paramBoolean, int paramInt) throws IOException;
  
  ASN1Encodable parseExplicitBaseObject() throws IOException;
  
  ASN1TaggedObjectParser parseExplicitBaseTagged() throws IOException;
  
  ASN1TaggedObjectParser parseImplicitBaseTagged(int paramInt1, int paramInt2) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\ASN1TaggedObjectParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */