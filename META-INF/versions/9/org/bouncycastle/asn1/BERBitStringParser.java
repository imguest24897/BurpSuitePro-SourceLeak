package META-INF.versions.9.org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1BitStringParser;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1StreamParser;
import org.bouncycastle.asn1.BERBitString;
import org.bouncycastle.asn1.ConstructedBitStream;
import org.bouncycastle.util.io.Streams;

public class BERBitStringParser implements ASN1BitStringParser {
  private ASN1StreamParser _parser;
  
  private ConstructedBitStream _bitStream;
  
  BERBitStringParser(ASN1StreamParser paramASN1StreamParser) {
    this._parser = paramASN1StreamParser;
  }
  
  public InputStream getOctetStream() throws IOException {
    return (InputStream)(this._bitStream = new ConstructedBitStream(this._parser, true));
  }
  
  public InputStream getBitStream() throws IOException {
    return (InputStream)(this._bitStream = new ConstructedBitStream(this._parser, false));
  }
  
  public int getPadBits() {
    return this._bitStream.getPadBits();
  }
  
  public ASN1Primitive getLoadedObject() throws IOException {
    return (ASN1Primitive)parse(this._parser);
  }
  
  public ASN1Primitive toASN1Primitive() {
    try {
      return getLoadedObject();
    } catch (IOException iOException) {
      throw new ASN1ParsingException("IOException converting stream to byte array: " + iOException.getMessage(), iOException);
    } 
  }
  
  static BERBitString parse(ASN1StreamParser paramASN1StreamParser) throws IOException {
    ConstructedBitStream constructedBitStream = new ConstructedBitStream(paramASN1StreamParser, false);
    byte[] arrayOfByte = Streams.readAll((InputStream)constructedBitStream);
    int i = constructedBitStream.getPadBits();
    return new BERBitString(arrayOfByte, i);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\BERBitStringParser.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */