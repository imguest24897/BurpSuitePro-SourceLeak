package META-INF.versions.9.org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.ASN1StreamParser;
import org.bouncycastle.asn1.BERSet;

public class BERSetParser implements ASN1SetParser {
  private ASN1StreamParser _parser;
  
  BERSetParser(ASN1StreamParser paramASN1StreamParser) {
    this._parser = paramASN1StreamParser;
  }
  
  public ASN1Encodable readObject() throws IOException {
    return this._parser.readObject();
  }
  
  public ASN1Primitive getLoadedObject() throws IOException {
    return (ASN1Primitive)parse(this._parser);
  }
  
  public ASN1Primitive toASN1Primitive() {
    try {
      return getLoadedObject();
    } catch (IOException iOException) {
      throw new ASN1ParsingException(iOException.getMessage(), iOException);
    } 
  }
  
  static BERSet parse(ASN1StreamParser paramASN1StreamParser) throws IOException {
    return new BERSet(paramASN1StreamParser.readVector());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\BERSetParser.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */