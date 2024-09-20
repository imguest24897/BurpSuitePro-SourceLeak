package org.bouncycastle.oer;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.List;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;
import org.bouncycastle.util.io.Streams;

public class OERInputStream extends FilterInputStream {
  private static final int[] bits = new int[] { 1, 2, 4, 8, 16, 32, 64, 128 };
  
  private static final int[] bitsR = new int[] { 128, 64, 32, 16, 8, 4, 2, 1 };
  
  protected PrintWriter debugOutput = null;
  
  private int maxByteAllocation = 1048576;
  
  protected PrintWriter debugStream = null;
  
  public OERInputStream(InputStream paramInputStream) {
    super(paramInputStream);
  }
  
  public OERInputStream(InputStream paramInputStream, int paramInt) {
    super(paramInputStream);
    this.maxByteAllocation = paramInt;
  }
  
  public static ASN1Encodable parse(byte[] paramArrayOfbyte, Element paramElement) throws IOException {
    OERInputStream oERInputStream = new OERInputStream(new ByteArrayInputStream(paramArrayOfbyte));
    return (ASN1Encodable)oERInputStream.parse(paramElement);
  }
  
  private int countOptionalChildTypes(Element paramElement) {
    int i = 0;
    for (Element element : paramElement.getChildren())
      i += element.isExplicit() ? 0 : 1; 
    return i;
  }
  
  public ASN1Object parse(Element paramElement) throws IOException {
    ElementSupplier elementSupplier;
    int i;
    Sequence sequence;
    Choice choice;
    BigInteger bigInteger1;
    byte[] arrayOfByte1;
    LengthInfo lengthInfo;
    byte[] arrayOfByte3;
    ASN1EncodableVector aSN1EncodableVector1;
    BigInteger bigInteger2;
    int j;
    String str;
    byte[] arrayOfByte2;
    int m;
    List<Element> list;
    int k;
    ASN1EncodableVector aSN1EncodableVector2;
    byte b;
    byte b1;
    switch (paramElement.getBaseType()) {
      case OPAQUE:
        elementSupplier = paramElement.resolveSupplier();
        return parse(new Element(elementSupplier.build(), paramElement));
      case Switch:
        throw new IllegalStateException("A switch element should only be found within a sequence.");
      case Supplier:
        return parse(new Element(paramElement.getElementSupplier().build(), paramElement));
      case SEQ_OF:
        i = readLength().intLength();
        arrayOfByte3 = allocateArray(i);
        if (Streams.readFully(this, arrayOfByte3) != arrayOfByte3.length)
          throw new IOException("could not read all of count of seq-of values"); 
        m = BigIntegers.fromUnsignedByteArray(arrayOfByte3).intValue();
        debugPrint(paramElement + "(len = " + m + ")");
        aSN1EncodableVector2 = new ASN1EncodableVector();
        if (((Element)paramElement.getChildren().get(0)).getaSwitch() != null)
          throw new IllegalStateException("element def for item in SEQ OF has a switch, switches only supported in sequences"); 
        for (b1 = 0; b1 < m; b1++) {
          Element element = Element.expandDeferredDefinition(paramElement.getChildren().get(0), paramElement);
          aSN1EncodableVector2.add((ASN1Encodable)parse(element));
        } 
        return (ASN1Object)new DERSequence(aSN1EncodableVector2);
      case SEQ:
        sequence = new Sequence(this.in, paramElement);
        debugPrint(paramElement + sequence.toString());
        aSN1EncodableVector1 = new ASN1EncodableVector();
        list = paramElement.getChildren();
        b = 0;
        b1 = 0;
        for (b = 0; b < list.size(); b++) {
          Element element = list.get(b);
          if (element.getBaseType() != OERDefinition.BaseType.EXTENSION) {
            Element element1;
            if (element.getBlock() > 0)
              break; 
            element = Element.expandDeferredDefinition(element, paramElement);
            if (element.getaSwitch() != null) {
              element1 = element.getaSwitch().result(new SwitchIndexer.Asn1EncodableVectorIndexer(aSN1EncodableVector1));
              if (element1.getParent() != paramElement)
                element1 = new Element(element1, paramElement); 
            } else {
              element1 = element;
            } 
            if (sequence.valuePresent == null) {
              aSN1EncodableVector1.add((ASN1Encodable)parse(element1));
            } else if (sequence.valuePresent[b]) {
              if (element1.isExplicit()) {
                aSN1EncodableVector1.add((ASN1Encodable)parse(element1));
              } else {
                aSN1EncodableVector1.add((ASN1Encodable)OEROptional.getInstance(parse(element1)));
              } 
            } else if (element1.getDefaultValue() != null) {
              aSN1EncodableVector1.add(element.getDefaultValue());
            } else {
              aSN1EncodableVector1.add(absent(element));
            } 
          } 
        } 
        if (sequence.extensionFlagSet) {
          int n = readLength().intLength();
          byte[] arrayOfByte = allocateArray(n);
          if (Streams.readFully(this.in, arrayOfByte) != arrayOfByte.length)
            throw new IOException("did not fully read presence list."); 
          byte b2 = 8;
          int i1 = arrayOfByte.length * 8 - arrayOfByte[0];
          while (b < list.size() || b2 < i1) {
            Element element = (b < list.size()) ? list.get(b) : null;
            if (element == null) {
              if ((arrayOfByte[b2 / 8] & bitsR[b2 % 8]) != 0) {
                int i2 = readLength().intLength();
                while (--i2 >= 0)
                  this.in.read(); 
              } 
            } else if (b2 < i1 && (arrayOfByte[b2 / 8] & bitsR[b2 % 8]) != 0) {
              aSN1EncodableVector1.add(parseOpenType(element));
            } else {
              if (element.isExplicit())
                throw new IOException("extension is marked as explicit but is not defined in presence list"); 
              aSN1EncodableVector1.add((ASN1Encodable)OEROptional.ABSENT);
            } 
            b2++;
            b++;
          } 
        } 
        return (ASN1Object)new DERSequence(aSN1EncodableVector1);
      case CHOICE:
        choice = choice();
        debugPrint(choice.toString() + " " + choice.tag);
        if (choice.isContextSpecific()) {
          Element element = Element.expandDeferredDefinition(paramElement.getChildren().get(choice.getTag()), paramElement);
          if (element.getBlock() > 0) {
            debugPrint("Chosen (Ext): " + element);
            return (ASN1Object)new DERTaggedObject(choice.tag, parseOpenType(element));
          } 
          debugPrint("Chosen: " + element);
          return (ASN1Object)new DERTaggedObject(choice.tag, (ASN1Encodable)parse(element));
        } 
        if (choice.isApplicationTagClass())
          throw new IllegalStateException("Unimplemented tag type"); 
        if (choice.isPrivateTagClass())
          throw new IllegalStateException("Unimplemented tag type"); 
        if (choice.isUniversalTagClass())
          throw new IllegalStateException("Unimplemented tag type"); 
        throw new IllegalStateException("Unimplemented tag type");
      case ENUM:
        bigInteger1 = enumeration();
        debugPrint(paramElement + "ENUM(" + bigInteger1 + ") = " + ((Element)paramElement.getChildren().get(bigInteger1.intValue())).getLabel());
        return (ASN1Object)new ASN1Enumerated(bigInteger1);
      case INT:
        k = paramElement.intBytesForRange();
        if (k != 0) {
          arrayOfByte1 = allocateArray(Math.abs(k));
          Streams.readFully(this, arrayOfByte1);
          if (k < 0) {
            bigInteger2 = new BigInteger(arrayOfByte1);
          } else {
            bigInteger2 = BigIntegers.fromUnsignedByteArray(arrayOfByte1);
          } 
        } else if (paramElement.isLowerRangeZero()) {
          LengthInfo lengthInfo1 = readLength();
          arrayOfByte1 = allocateArray(lengthInfo1.intLength());
          Streams.readFully(this, arrayOfByte1);
          if (arrayOfByte1.length == 0) {
            bigInteger2 = BigInteger.ZERO;
          } else {
            bigInteger2 = new BigInteger(1, arrayOfByte1);
          } 
        } else {
          LengthInfo lengthInfo1 = readLength();
          arrayOfByte1 = allocateArray(lengthInfo1.intLength());
          Streams.readFully(this, arrayOfByte1);
          if (arrayOfByte1.length == 0) {
            bigInteger2 = BigInteger.ZERO;
          } else {
            bigInteger2 = new BigInteger(arrayOfByte1);
          } 
        } 
        if (this.debugOutput != null)
          debugPrint(paramElement + "INTEGER byteLen= " + arrayOfByte1.length + " hex= " + bigInteger2.toString(16) + ")"); 
        return (ASN1Object)new ASN1Integer(bigInteger2);
      case OCTET_STRING:
        j = 0;
        if (paramElement.getUpperBound() != null && paramElement.getUpperBound().equals(paramElement.getLowerBound())) {
          j = paramElement.getUpperBound().intValue();
        } else {
          j = readLength().intLength();
        } 
        arrayOfByte1 = allocateArray(j);
        if (Streams.readFully(this, arrayOfByte1) != j)
          throw new IOException("did not read all of " + paramElement.getLabel()); 
        if (this.debugOutput != null) {
          k = Math.min(arrayOfByte1.length, 32);
          debugPrint(paramElement + "OCTET STRING (" + arrayOfByte1.length + ") = " + Hex.toHexString(arrayOfByte1, 0, k) + " " + ((arrayOfByte1.length > 32) ? "..." : ""));
        } 
        return (ASN1Object)new DEROctetString(arrayOfByte1);
      case IA5String:
        if (paramElement.isFixedLength()) {
          arrayOfByte1 = allocateArray(paramElement.getUpperBound().intValue());
        } else {
          arrayOfByte1 = allocateArray(readLength().intLength());
        } 
        if (Streams.readFully(this, arrayOfByte1) != arrayOfByte1.length)
          throw new IOException("could not read all of IA5 string"); 
        str = Strings.fromByteArray(arrayOfByte1);
        if (this.debugOutput != null)
          debugPrint(paramElement.appendLabel("IA5 String (" + arrayOfByte1.length + ") = " + str)); 
        return (ASN1Object)new DERIA5String(str);
      case UTF8_STRING:
        arrayOfByte1 = allocateArray(readLength().intLength());
        if (Streams.readFully(this, arrayOfByte1) != arrayOfByte1.length)
          throw new IOException("could not read all of utf 8 string"); 
        str = Strings.fromUTF8ByteArray(arrayOfByte1);
        if (this.debugOutput != null)
          debugPrint(paramElement + "UTF8 String (" + arrayOfByte1.length + ") = " + str); 
        return (ASN1Object)new DERUTF8String(str);
      case BIT_STRING:
        if (paramElement.isFixedLength()) {
          arrayOfByte1 = new byte[paramElement.getLowerBound().intValue() / 8];
        } else if (BigInteger.ZERO.compareTo(paramElement.getUpperBound()) > 0) {
          arrayOfByte1 = allocateArray(paramElement.getUpperBound().intValue() / 8);
        } else {
          arrayOfByte1 = allocateArray(readLength().intLength() / 8);
        } 
        Streams.readFully(this, arrayOfByte1);
        if (this.debugOutput != null) {
          StringBuffer stringBuffer = new StringBuffer();
          stringBuffer.append("BIT STRING(" + (arrayOfByte1.length * 8) + ") = ");
          for (k = 0; k != arrayOfByte1.length; k++) {
            b = arrayOfByte1[k];
            for (b1 = 0; b1 < 8; b1++) {
              stringBuffer.append(((b & 0x80) > 0) ? "1" : "0");
              b = (byte)(b << 1);
            } 
          } 
          debugPrint(paramElement + stringBuffer.toString());
        } 
        return (ASN1Object)new DERBitString(arrayOfByte1);
      case NULL:
        debugPrint(paramElement + "NULL");
        return (ASN1Object)DERNull.INSTANCE;
      case EXTENSION:
        lengthInfo = readLength();
        arrayOfByte2 = new byte[lengthInfo.intLength()];
        if (Streams.readFully(this, arrayOfByte2) != lengthInfo.intLength())
          throw new IOException("could not read all of count of open value in choice (...) "); 
        debugPrint("ext " + lengthInfo.intLength() + " " + Hex.toHexString(arrayOfByte2));
        return (ASN1Object)new DEROctetString(arrayOfByte2);
      case BOOLEAN:
        return (ASN1Object)((read() == 0) ? ASN1Boolean.FALSE : ASN1Boolean.TRUE);
    } 
    throw new IllegalStateException("Unhandled type " + paramElement.getBaseType());
  }
  
  private ASN1Encodable absent(Element paramElement) {
    debugPrint(paramElement + "Absent");
    return (ASN1Encodable)OEROptional.ABSENT;
  }
  
  private byte[] allocateArray(int paramInt) {
    if (paramInt > this.maxByteAllocation)
      throw new IllegalArgumentException("required byte array size " + paramInt + " was greater than " + this.maxByteAllocation); 
    return new byte[paramInt];
  }
  
  public BigInteger parseInt(boolean paramBoolean, int paramInt) throws Exception {
    byte[] arrayOfByte = new byte[paramInt];
    int i = Streams.readFully(this, arrayOfByte);
    if (i != arrayOfByte.length)
      throw new IllegalStateException("integer not fully read"); 
    return paramBoolean ? new BigInteger(1, arrayOfByte) : new BigInteger(arrayOfByte);
  }
  
  public BigInteger uint8() throws Exception {
    return parseInt(true, 1);
  }
  
  public BigInteger uint16() throws Exception {
    return parseInt(true, 2);
  }
  
  public BigInteger uint32() throws Exception {
    return parseInt(true, 4);
  }
  
  public BigInteger uint64() throws Exception {
    return parseInt(false, 8);
  }
  
  public BigInteger int8() throws Exception {
    return parseInt(false, 1);
  }
  
  public BigInteger int16() throws Exception {
    return parseInt(false, 2);
  }
  
  public BigInteger int32() throws Exception {
    return parseInt(false, 4);
  }
  
  public BigInteger int64() throws Exception {
    return parseInt(false, 8);
  }
  
  public LengthInfo readLength() throws IOException {
    boolean bool = false;
    int i = read();
    if (i == -1)
      throw new EOFException("expecting length"); 
    if ((i & 0x80) == 0) {
      debugPrint("Len (Short form): " + (i & 0x7F));
      return new LengthInfo(BigInteger.valueOf((i & 0x7F)), true);
    } 
    byte[] arrayOfByte = new byte[i & 0x7F];
    if (Streams.readFully(this, arrayOfByte) != arrayOfByte.length)
      throw new EOFException("did not read all bytes of length definition"); 
    debugPrint("Len (Long Form): " + (i & 0x7F) + " actual len: " + Hex.toHexString(arrayOfByte));
    return new LengthInfo(BigIntegers.fromUnsignedByteArray(arrayOfByte), false);
  }
  
  public BigInteger enumeration() throws IOException {
    int i = read();
    if (i == -1)
      throw new EOFException("expecting prefix of enumeration"); 
    if ((i & 0x80) == 128) {
      int j = i & 0x7F;
      if (j == 0)
        return BigInteger.ZERO; 
      byte[] arrayOfByte = new byte[j];
      int k = Streams.readFully(this, arrayOfByte);
      if (k != arrayOfByte.length)
        throw new EOFException("unable to fully read integer component of enumeration"); 
      return new BigInteger(1, arrayOfByte);
    } 
    return BigInteger.valueOf(i);
  }
  
  protected ASN1Encodable parseOpenType(Element paramElement) throws IOException {
    int i = readLength().intLength();
    byte[] arrayOfByte = allocateArray(i);
    if (Streams.readFully(this.in, arrayOfByte) != arrayOfByte.length)
      throw new IOException("did not fully read open type as raw bytes"); 
    OERInputStream oERInputStream = null;
    try {
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      oERInputStream = new OERInputStream(byteArrayInputStream);
      return (ASN1Encodable)oERInputStream.parse(paramElement);
    } finally {
      if (oERInputStream != null)
        oERInputStream.close(); 
    } 
  }
  
  public Choice choice() throws IOException {
    return new Choice(this);
  }
  
  protected void debugPrint(String paramString) {
    if (this.debugOutput != null) {
      StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
      byte b = -1;
      for (byte b1 = 0; b1 != arrayOfStackTraceElement.length; b1++) {
        StackTraceElement stackTraceElement = arrayOfStackTraceElement[b1];
        if (stackTraceElement.getMethodName().equals("debugPrint")) {
          b = 0;
        } else if (stackTraceElement.getClassName().contains("OERInput")) {
          b++;
        } 
      } 
      while (b > 0) {
        this.debugOutput.append("    ");
        b--;
      } 
      this.debugOutput.append(paramString).append("\n");
      this.debugOutput.flush();
    } 
  }
  
  public static class Choice extends OERInputStream {
    final int preamble = read();
    
    final int tag;
    
    final int tagClass;
    
    public Choice(InputStream param1InputStream) throws IOException {
      super(param1InputStream);
      if (this.preamble < 0)
        throw new EOFException("expecting preamble byte of choice"); 
      this.tagClass = this.preamble & 0xC0;
      int i = this.preamble & 0x3F;
      if (i >= 63) {
        i = 0;
        int j = 0;
        do {
          j = param1InputStream.read();
          if (j < 0)
            throw new EOFException("expecting further tag bytes"); 
          i <<= 7;
          i |= j & 0x7F;
        } while ((j & 0x80) != 0);
      } 
      this.tag = i;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("CHOICE(");
      switch (this.tagClass) {
        case 0:
          stringBuilder.append("Universal ");
          break;
        case 64:
          stringBuilder.append("Application ");
          break;
        case 192:
          stringBuilder.append("Private ");
          break;
        case 128:
          stringBuilder.append("ContextSpecific ");
          break;
      } 
      stringBuilder.append("Tag = " + this.tag);
      stringBuilder.append(")");
      return stringBuilder.toString();
    }
    
    public int getTagClass() {
      return this.tagClass;
    }
    
    public int getTag() {
      return this.tag;
    }
    
    public boolean isContextSpecific() {
      return (this.tagClass == 128);
    }
    
    public boolean isUniversalTagClass() {
      return (this.tagClass == 0);
    }
    
    public boolean isApplicationTagClass() {
      return (this.tagClass == 64);
    }
    
    public boolean isPrivateTagClass() {
      return (this.tagClass == 192);
    }
  }
  
  private static final class LengthInfo {
    private final BigInteger length;
    
    private final boolean shortForm;
    
    public LengthInfo(BigInteger param1BigInteger, boolean param1Boolean) {
      this.length = param1BigInteger;
      this.shortForm = param1Boolean;
    }
    
    private int intLength() {
      return BigIntegers.intValueExact(this.length);
    }
  }
  
  public static class Sequence extends OERInputStream {
    private final int preamble;
    
    private final boolean[] valuePresent;
    
    private final boolean extensionFlagSet;
    
    public Sequence(InputStream param1InputStream, Element param1Element) throws IOException {
      super(param1InputStream);
      if (param1Element.hasPopulatedExtension() || param1Element.getOptionals() > 0 || param1Element.hasDefaultChildren()) {
        this.preamble = this.in.read();
        if (this.preamble < 0)
          throw new EOFException("expecting preamble byte of sequence"); 
        this.extensionFlagSet = (param1Element.hasPopulatedExtension() && (this.preamble & 0x80) == 128);
      } else {
        this.preamble = 0;
        this.extensionFlagSet = false;
        this.valuePresent = null;
        return;
      } 
      this.valuePresent = new boolean[param1Element.getChildren().size()];
      boolean bool = false;
      byte b1 = param1Element.hasPopulatedExtension() ? 6 : 7;
      int i = this.preamble;
      byte b2 = 0;
      for (Element element : param1Element.getChildren()) {
        if (element.getBaseType() == OERDefinition.BaseType.EXTENSION)
          continue; 
        if (element.getBlock() != bool)
          break; 
        if (element.isExplicit()) {
          this.valuePresent[b2++] = true;
          continue;
        } 
        if (b1 < 0) {
          i = param1InputStream.read();
          if (i < 0)
            throw new EOFException("expecting mask byte sequence"); 
          b1 = 7;
        } 
        this.valuePresent[b2++] = ((i & OERInputStream.bits[b1]) > 0);
        b1--;
      } 
    }
    
    public boolean hasOptional(int param1Int) {
      return this.valuePresent[param1Int];
    }
    
    public boolean hasExtension() {
      return this.extensionFlagSet;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("SEQ(");
      stringBuilder.append(hasExtension() ? "Ext " : "");
      if (this.valuePresent == null) {
        stringBuilder.append("*");
      } else {
        for (byte b = 0; b < this.valuePresent.length; b++) {
          if (this.valuePresent[b]) {
            stringBuilder.append("1");
          } else {
            stringBuilder.append("0");
          } 
        } 
      } 
      stringBuilder.append(")");
      return stringBuilder.toString();
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\OERInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */