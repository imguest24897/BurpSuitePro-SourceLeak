package org.bouncycastle.asn1;

import java.io.IOException;

class DLTaggedObjectParser extends BERTaggedObjectParser {
  private final boolean _constructed;
  
  DLTaggedObjectParser(int paramInt1, int paramInt2, boolean paramBoolean, ASN1StreamParser paramASN1StreamParser) {
    super(paramInt1, paramInt2, paramASN1StreamParser);
    this._constructed = paramBoolean;
  }
  
  public ASN1Primitive getLoadedObject() throws IOException {
    return this._parser.loadTaggedDL(this._tagClass, this._tagNo, this._constructed);
  }
  
  public ASN1Encodable parseBaseUniversal(boolean paramBoolean, int paramInt) throws IOException {
    return paramBoolean ? checkConstructed().parseObject(paramInt) : (this._constructed ? this._parser.parseImplicitConstructedDL(paramInt) : this._parser.parseImplicitPrimitive(paramInt));
  }
  
  public ASN1Encodable parseExplicitBaseObject() throws IOException {
    return checkConstructed().readObject();
  }
  
  public ASN1TaggedObjectParser parseExplicitBaseTagged() throws IOException {
    return checkConstructed().parseTaggedObject();
  }
  
  public ASN1TaggedObjectParser parseImplicitBaseTagged(int paramInt1, int paramInt2) throws IOException {
    return new DLTaggedObjectParser(paramInt1, paramInt2, this._constructed, this._parser);
  }
  
  private ASN1StreamParser checkConstructed() throws IOException {
    if (!this._constructed)
      throw new IOException("Explicit tags must be constructed (see X.690 8.14.2)"); 
    return this._parser;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\DLTaggedObjectParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */