package META-INF.versions.9.org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1BMPString;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Exception;
import org.bouncycastle.asn1.ASN1GeneralString;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1GraphicString;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1NumericString;
import org.bouncycastle.asn1.ASN1ObjectDescriptor;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.asn1.ASN1StreamParser;
import org.bouncycastle.asn1.ASN1T61String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.ASN1UniversalString;
import org.bouncycastle.asn1.ASN1VideotexString;
import org.bouncycastle.asn1.ASN1VisibleString;
import org.bouncycastle.asn1.BERBitString;
import org.bouncycastle.asn1.BERBitStringParser;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BEROctetStringParser;
import org.bouncycastle.asn1.BERSequenceParser;
import org.bouncycastle.asn1.BERSetParser;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.DERExternalParser;
import org.bouncycastle.asn1.DLFactory;
import org.bouncycastle.asn1.DefiniteLengthInputStream;
import org.bouncycastle.asn1.IndefiniteLengthInputStream;
import org.bouncycastle.asn1.LazyEncodedSequence;
import org.bouncycastle.asn1.StreamUtil;
import org.bouncycastle.util.io.Streams;

public class ASN1InputStream extends FilterInputStream implements BERTags {
  private final int limit;
  
  private final boolean lazyEvaluate;
  
  private final byte[][] tmpBuffers;
  
  public ASN1InputStream(InputStream paramInputStream) {
    this(paramInputStream, StreamUtil.findLimit(paramInputStream));
  }
  
  public ASN1InputStream(byte[] paramArrayOfbyte) {
    this(new ByteArrayInputStream(paramArrayOfbyte), paramArrayOfbyte.length);
  }
  
  public ASN1InputStream(byte[] paramArrayOfbyte, boolean paramBoolean) {
    this(new ByteArrayInputStream(paramArrayOfbyte), paramArrayOfbyte.length, paramBoolean);
  }
  
  public ASN1InputStream(InputStream paramInputStream, int paramInt) {
    this(paramInputStream, paramInt, false);
  }
  
  public ASN1InputStream(InputStream paramInputStream, boolean paramBoolean) {
    this(paramInputStream, StreamUtil.findLimit(paramInputStream), paramBoolean);
  }
  
  public ASN1InputStream(InputStream paramInputStream, int paramInt, boolean paramBoolean) {
    this(paramInputStream, paramInt, paramBoolean, new byte[11][]);
  }
  
  private ASN1InputStream(InputStream paramInputStream, int paramInt, boolean paramBoolean, byte[][] paramArrayOfbyte) {
    super(paramInputStream);
    this.limit = paramInt;
    this.lazyEvaluate = paramBoolean;
    this.tmpBuffers = paramArrayOfbyte;
  }
  
  int getLimit() {
    return this.limit;
  }
  
  protected int readLength() throws IOException {
    return readLength(this, this.limit, false);
  }
  
  protected void readFully(byte[] paramArrayOfbyte) throws IOException {
    if (Streams.readFully(this, paramArrayOfbyte, 0, paramArrayOfbyte.length) != paramArrayOfbyte.length)
      throw new EOFException("EOF encountered in middle of object"); 
  }
  
  protected ASN1Primitive buildObject(int paramInt1, int paramInt2, int paramInt3) throws IOException {
    DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(this, paramInt3, this.limit);
    if (0 == (paramInt1 & 0xE0))
      return createPrimitiveDERObject(paramInt2, definiteLengthInputStream, this.tmpBuffers); 
    int i = paramInt1 & 0xC0;
    if (0 != i) {
      boolean bool = ((paramInt1 & 0x20) != 0) ? true : false;
      return readTaggedObjectDL(i, paramInt2, bool, definiteLengthInputStream);
    } 
    switch (paramInt2) {
      case 3:
        return (ASN1Primitive)buildConstructedBitString(readVector(definiteLengthInputStream));
      case 4:
        return (ASN1Primitive)buildConstructedOctetString(readVector(definiteLengthInputStream));
      case 16:
        return (ASN1Primitive)((definiteLengthInputStream.getRemaining() < 1) ? DLFactory.EMPTY_SEQUENCE : (this.lazyEvaluate ? new LazyEncodedSequence(definiteLengthInputStream.toByteArray()) : DLFactory.createSequence(readVector(definiteLengthInputStream))));
      case 17:
        return (ASN1Primitive)DLFactory.createSet(readVector(definiteLengthInputStream));
      case 8:
        return (ASN1Primitive)DLFactory.createSequence(readVector(definiteLengthInputStream)).toASN1External();
    } 
    throw new IOException("unknown tag " + paramInt2 + " encountered");
  }
  
  public ASN1Primitive readObject() throws IOException {
    int i = read();
    if (i <= 0) {
      if (i == 0)
        throw new IOException("unexpected end-of-contents marker"); 
      return null;
    } 
    int j = readTagNumber(this, i);
    int k = readLength();
    if (k >= 0)
      try {
        return buildObject(i, j, k);
      } catch (IllegalArgumentException illegalArgumentException) {
        throw new ASN1Exception("corrupted stream detected", illegalArgumentException);
      }  
    if (0 == (i & 0x20))
      throw new IOException("indefinite-length primitive encoding encountered"); 
    IndefiniteLengthInputStream indefiniteLengthInputStream = new IndefiniteLengthInputStream(this, this.limit);
    ASN1StreamParser aSN1StreamParser = new ASN1StreamParser((InputStream)indefiniteLengthInputStream, this.limit, this.tmpBuffers);
    int m = i & 0xC0;
    if (0 != m)
      return aSN1StreamParser.loadTaggedIL(m, j); 
    switch (j) {
      case 3:
        return (ASN1Primitive)BERBitStringParser.parse(aSN1StreamParser);
      case 4:
        return (ASN1Primitive)BEROctetStringParser.parse(aSN1StreamParser);
      case 8:
        return (ASN1Primitive)DERExternalParser.parse(aSN1StreamParser);
      case 16:
        return (ASN1Primitive)BERSequenceParser.parse(aSN1StreamParser);
      case 17:
        return (ASN1Primitive)BERSetParser.parse(aSN1StreamParser);
    } 
    throw new IOException("unknown BER object encountered");
  }
  
  ASN1BitString buildConstructedBitString(ASN1EncodableVector paramASN1EncodableVector) throws IOException {
    ASN1BitString[] arrayOfASN1BitString = new ASN1BitString[paramASN1EncodableVector.size()];
    for (byte b = 0; b != arrayOfASN1BitString.length; b++) {
      ASN1Encodable aSN1Encodable = paramASN1EncodableVector.get(b);
      if (aSN1Encodable instanceof ASN1BitString) {
        arrayOfASN1BitString[b] = (ASN1BitString)aSN1Encodable;
      } else {
        throw new ASN1Exception("unknown object encountered in constructed BIT STRING: " + aSN1Encodable.getClass());
      } 
    } 
    return (ASN1BitString)new BERBitString(arrayOfASN1BitString);
  }
  
  ASN1OctetString buildConstructedOctetString(ASN1EncodableVector paramASN1EncodableVector) throws IOException {
    ASN1OctetString[] arrayOfASN1OctetString = new ASN1OctetString[paramASN1EncodableVector.size()];
    for (byte b = 0; b != arrayOfASN1OctetString.length; b++) {
      ASN1Encodable aSN1Encodable = paramASN1EncodableVector.get(b);
      if (aSN1Encodable instanceof ASN1OctetString) {
        arrayOfASN1OctetString[b] = (ASN1OctetString)aSN1Encodable;
      } else {
        throw new ASN1Exception("unknown object encountered in constructed OCTET STRING: " + aSN1Encodable.getClass());
      } 
    } 
    return (ASN1OctetString)new BEROctetString(arrayOfASN1OctetString);
  }
  
  ASN1Primitive readTaggedObjectDL(int paramInt1, int paramInt2, boolean paramBoolean, DefiniteLengthInputStream paramDefiniteLengthInputStream) throws IOException {
    if (!paramBoolean) {
      byte[] arrayOfByte = paramDefiniteLengthInputStream.toByteArray();
      return ASN1TaggedObject.createPrimitive(paramInt1, paramInt2, arrayOfByte);
    } 
    ASN1EncodableVector aSN1EncodableVector = readVector(paramDefiniteLengthInputStream);
    return ASN1TaggedObject.createConstructedDL(paramInt1, paramInt2, aSN1EncodableVector);
  }
  
  ASN1EncodableVector readVector() throws IOException {
    ASN1Primitive aSN1Primitive = readObject();
    if (null == aSN1Primitive)
      return new ASN1EncodableVector(0); 
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    do {
      aSN1EncodableVector.add((ASN1Encodable)aSN1Primitive);
    } while ((aSN1Primitive = readObject()) != null);
    return aSN1EncodableVector;
  }
  
  ASN1EncodableVector readVector(DefiniteLengthInputStream paramDefiniteLengthInputStream) throws IOException {
    int i = paramDefiniteLengthInputStream.getRemaining();
    return (i < 1) ? new ASN1EncodableVector(0) : (new org.bouncycastle.asn1.ASN1InputStream((InputStream)paramDefiniteLengthInputStream, i, this.lazyEvaluate, this.tmpBuffers)).readVector();
  }
  
  static int readTagNumber(InputStream paramInputStream, int paramInt) throws IOException {
    int i = paramInt & 0x1F;
    if (i == 31) {
      int j = paramInputStream.read();
      if (j < 31) {
        if (j < 0)
          throw new EOFException("EOF found inside tag value."); 
        throw new IOException("corrupted stream - high tag number < 31 found");
      } 
      i = j & 0x7F;
      if (0 == i)
        throw new IOException("corrupted stream - invalid high tag number found"); 
      while ((j & 0x80) != 0) {
        if (i >>> 24 != 0)
          throw new IOException("Tag number more than 31 bits"); 
        i <<= 7;
        j = paramInputStream.read();
        if (j < 0)
          throw new EOFException("EOF found inside tag value."); 
        i |= j & 0x7F;
      } 
    } 
    return i;
  }
  
  static int readLength(InputStream paramInputStream, int paramInt, boolean paramBoolean) throws IOException {
    int i = paramInputStream.read();
    if (0 == i >>> 7)
      return i; 
    if (128 == i)
      return -1; 
    if (i < 0)
      throw new EOFException("EOF found when length expected"); 
    if (255 == i)
      throw new IOException("invalid long form definite-length 0xFF"); 
    int j = i & 0x7F;
    byte b = 0;
    i = 0;
    while (true) {
      int k = paramInputStream.read();
      if (k < 0)
        throw new EOFException("EOF found reading length"); 
      if (i >>> 23 != 0)
        throw new IOException("long form definite-length more than 31 bits"); 
      i = (i << 8) + k;
      if (++b >= j) {
        if (i >= paramInt && !paramBoolean)
          throw new IOException("corrupted stream - out of bounds length found: " + i + " >= " + paramInt); 
        return i;
      } 
    } 
  }
  
  private static byte[] getBuffer(DefiniteLengthInputStream paramDefiniteLengthInputStream, byte[][] paramArrayOfbyte) throws IOException {
    int i = paramDefiniteLengthInputStream.getRemaining();
    if (i >= paramArrayOfbyte.length)
      return paramDefiniteLengthInputStream.toByteArray(); 
    byte[] arrayOfByte = paramArrayOfbyte[i];
    if (arrayOfByte == null)
      arrayOfByte = paramArrayOfbyte[i] = new byte[i]; 
    paramDefiniteLengthInputStream.readAllIntoByteArray(arrayOfByte);
    return arrayOfByte;
  }
  
  private static char[] getBMPCharBuffer(DefiniteLengthInputStream paramDefiniteLengthInputStream) throws IOException {
    int i = paramDefiniteLengthInputStream.getRemaining();
    if (0 != (i & 0x1))
      throw new IOException("malformed BMPString encoding encountered"); 
    char[] arrayOfChar = new char[i / 2];
    byte b = 0;
    byte[] arrayOfByte = new byte[8];
    while (i >= 8) {
      if (Streams.readFully((InputStream)paramDefiniteLengthInputStream, arrayOfByte, 0, 8) != 8)
        throw new EOFException("EOF encountered in middle of BMPString"); 
      arrayOfChar[b] = (char)(arrayOfByte[0] << 8 | arrayOfByte[1] & 0xFF);
      arrayOfChar[b + 1] = (char)(arrayOfByte[2] << 8 | arrayOfByte[3] & 0xFF);
      arrayOfChar[b + 2] = (char)(arrayOfByte[4] << 8 | arrayOfByte[5] & 0xFF);
      arrayOfChar[b + 3] = (char)(arrayOfByte[6] << 8 | arrayOfByte[7] & 0xFF);
      b += 4;
      i -= 8;
    } 
    if (i > 0) {
      if (Streams.readFully((InputStream)paramDefiniteLengthInputStream, arrayOfByte, 0, i) != i)
        throw new EOFException("EOF encountered in middle of BMPString"); 
      byte b1 = 0;
      do {
        int j = arrayOfByte[b1++] << 8;
        int k = arrayOfByte[b1++] & 0xFF;
        arrayOfChar[b++] = (char)(j | k);
      } while (b1 < i);
    } 
    if (0 != paramDefiniteLengthInputStream.getRemaining() || arrayOfChar.length != b)
      throw new IllegalStateException(); 
    return arrayOfChar;
  }
  
  static ASN1Primitive createPrimitiveDERObject(int paramInt, DefiniteLengthInputStream paramDefiniteLengthInputStream, byte[][] paramArrayOfbyte) throws IOException {
    try {
      switch (paramInt) {
        case 3:
          return (ASN1Primitive)ASN1BitString.createPrimitive(paramDefiniteLengthInputStream.toByteArray());
        case 30:
          return (ASN1Primitive)ASN1BMPString.createPrimitive(getBMPCharBuffer(paramDefiniteLengthInputStream));
        case 1:
          return (ASN1Primitive)ASN1Boolean.createPrimitive(getBuffer(paramDefiniteLengthInputStream, paramArrayOfbyte));
        case 10:
          return (ASN1Primitive)ASN1Enumerated.createPrimitive(getBuffer(paramDefiniteLengthInputStream, paramArrayOfbyte), true);
        case 27:
          return (ASN1Primitive)ASN1GeneralString.createPrimitive(paramDefiniteLengthInputStream.toByteArray());
        case 24:
          return (ASN1Primitive)ASN1GeneralizedTime.createPrimitive(paramDefiniteLengthInputStream.toByteArray());
        case 25:
          return (ASN1Primitive)ASN1GraphicString.createPrimitive(paramDefiniteLengthInputStream.toByteArray());
        case 22:
          return (ASN1Primitive)ASN1IA5String.createPrimitive(paramDefiniteLengthInputStream.toByteArray());
        case 2:
          return (ASN1Primitive)ASN1Integer.createPrimitive(paramDefiniteLengthInputStream.toByteArray());
        case 5:
          return (ASN1Primitive)ASN1Null.createPrimitive(paramDefiniteLengthInputStream.toByteArray());
        case 18:
          return (ASN1Primitive)ASN1NumericString.createPrimitive(paramDefiniteLengthInputStream.toByteArray());
        case 7:
          return (ASN1Primitive)ASN1ObjectDescriptor.createPrimitive(paramDefiniteLengthInputStream.toByteArray());
        case 6:
          ASN1ObjectIdentifier.checkContentsLength(paramDefiniteLengthInputStream.getRemaining());
          return (ASN1Primitive)ASN1ObjectIdentifier.createPrimitive(getBuffer(paramDefiniteLengthInputStream, paramArrayOfbyte), true);
        case 4:
          return (ASN1Primitive)ASN1OctetString.createPrimitive(paramDefiniteLengthInputStream.toByteArray());
        case 19:
          return (ASN1Primitive)ASN1PrintableString.createPrimitive(paramDefiniteLengthInputStream.toByteArray());
        case 13:
          ASN1RelativeOID.checkContentsLength(paramDefiniteLengthInputStream.getRemaining());
          return (ASN1Primitive)ASN1RelativeOID.createPrimitive(getBuffer(paramDefiniteLengthInputStream, paramArrayOfbyte), true);
        case 20:
          return (ASN1Primitive)ASN1T61String.createPrimitive(paramDefiniteLengthInputStream.toByteArray());
        case 28:
          return (ASN1Primitive)ASN1UniversalString.createPrimitive(paramDefiniteLengthInputStream.toByteArray());
        case 23:
          return (ASN1Primitive)ASN1UTCTime.createPrimitive(paramDefiniteLengthInputStream.toByteArray());
        case 12:
          return (ASN1Primitive)ASN1UTF8String.createPrimitive(paramDefiniteLengthInputStream.toByteArray());
        case 21:
          return (ASN1Primitive)ASN1VideotexString.createPrimitive(paramDefiniteLengthInputStream.toByteArray());
        case 26:
          return (ASN1Primitive)ASN1VisibleString.createPrimitive(paramDefiniteLengthInputStream.toByteArray());
        case 14:
        case 31:
        case 32:
        case 33:
        case 34:
        case 35:
        case 36:
          throw new IOException("unsupported tag " + paramInt + " encountered");
      } 
      throw new IOException("unknown tag " + paramInt + " encountered");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new ASN1Exception(illegalArgumentException.getMessage(), illegalArgumentException);
    } catch (IllegalStateException illegalStateException) {
      throw new ASN1Exception(illegalStateException.getMessage(), illegalStateException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\ASN1InputStream.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */