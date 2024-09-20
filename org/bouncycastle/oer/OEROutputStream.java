package org.bouncycastle.oer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.List;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

public class OEROutputStream extends OutputStream {
  private static final int[] bits = new int[] { 1, 2, 4, 8, 16, 32, 64, 128 };
  
  private final OutputStream out;
  
  protected PrintWriter debugOutput = null;
  
  public OEROutputStream(OutputStream paramOutputStream) {
    this.out = paramOutputStream;
  }
  
  public static int byteLength(long paramLong) {
    long l = -72057594037927936L;
    byte b;
    for (b = 8; b > 0 && (paramLong & l) == 0L; b--)
      paramLong <<= 8L; 
    return b;
  }
  
  public void write(ASN1Encodable paramASN1Encodable, Element paramElement) throws IOException {
    ASN1Sequence aSN1Sequence;
    Enumeration<int> enumeration;
    byte b1;
    Element element1;
    int i;
    ASN1Primitive aSN1Primitive2;
    BigInteger bigInteger;
    ASN1Integer aSN1Integer;
    ASN1OctetString aSN1OctetString2;
    ASN1IA5String aSN1IA5String;
    ASN1UTF8String aSN1UTF8String;
    ASN1BitString aSN1BitString;
    ASN1OctetString aSN1OctetString1;
    ASN1Boolean aSN1Boolean;
    boolean bool;
    BitBuilder bitBuilder;
    int j;
    byte[] arrayOfByte;
    byte b2;
    List<Element> list;
    int k;
    byte b3;
    ASN1Primitive aSN1Primitive3;
    Element element2;
    if (paramASN1Encodable == OEROptional.ABSENT)
      return; 
    if (paramASN1Encodable instanceof OEROptional) {
      write(((OEROptional)paramASN1Encodable).get(), paramElement);
      return;
    } 
    ASN1Primitive aSN1Primitive1 = paramASN1Encodable.toASN1Primitive();
    switch (paramElement.getBaseType()) {
      case Supplier:
        write((ASN1Encodable)aSN1Primitive1, paramElement.getElementSupplier().build());
        break;
      case SEQ:
        aSN1Sequence = ASN1Sequence.getInstance(aSN1Primitive1);
        b1 = 7;
        i = 0;
        bool = false;
        if (paramElement.isExtensionsInDefinition()) {
          for (k = 0; k < paramElement.getChildren().size(); k++) {
            Element element = paramElement.getChildren().get(k);
            if (element.getBaseType() == OERDefinition.BaseType.EXTENSION)
              break; 
            if (element.getBlock() > 0 && k < aSN1Sequence.size() && !OEROptional.ABSENT.equals(aSN1Sequence.getObjectAt(k))) {
              bool = true;
              break;
            } 
          } 
          if (bool)
            i |= bits[b1]; 
          b1--;
        } 
        for (b2 = 0; b2 < paramElement.getChildren().size(); b2++) {
          Element element = paramElement.getChildren().get(b2);
          if (element.getBaseType() != OERDefinition.BaseType.EXTENSION) {
            if (element.getBlock() > 0)
              break; 
            element = Element.expandDeferredDefinition(element, paramElement);
            if (paramElement.getaSwitch() != null) {
              element = paramElement.getaSwitch().result(new SwitchIndexer.Asn1SequenceIndexer(aSN1Sequence));
              element = Element.expandDeferredDefinition(element, paramElement);
            } 
            if (b1 < 0) {
              this.out.write(i);
              b1 = 7;
              i = 0;
            } 
            ASN1Encodable aSN1Encodable = aSN1Sequence.getObjectAt(b2);
            if (element.isExplicit() && aSN1Encodable instanceof OEROptional)
              throw new IllegalStateException("absent sequence element that is required by oer definition"); 
            if (!element.isExplicit()) {
              ASN1Encodable aSN1Encodable1 = aSN1Sequence.getObjectAt(b2);
              if (element.getDefaultValue() != null) {
                if (aSN1Encodable1 instanceof OEROptional) {
                  if (((OEROptional)aSN1Encodable1).isDefined() && !((OEROptional)aSN1Encodable1).get().equals(element.getDefaultValue()))
                    i |= bits[b1]; 
                } else if (!element.getDefaultValue().equals(aSN1Encodable1)) {
                  i |= bits[b1];
                } 
              } else if (aSN1Encodable != OEROptional.ABSENT) {
                i |= bits[b1];
              } 
              b1--;
            } 
          } 
        } 
        if (b1 != 7)
          this.out.write(i); 
        list = paramElement.getChildren();
        for (b3 = 0; b3 < list.size(); b3++) {
          Element element = paramElement.getChildren().get(b3);
          if (element.getBaseType() != OERDefinition.BaseType.EXTENSION) {
            if (element.getBlock() > 0)
              break; 
            ASN1Encodable aSN1Encodable = aSN1Sequence.getObjectAt(b3);
            if (element.getaSwitch() != null)
              element = element.getaSwitch().result(new SwitchIndexer.Asn1SequenceIndexer(aSN1Sequence)); 
            if (element.getDefaultValue() == null || !element.getDefaultValue().equals(aSN1Encodable))
              write(aSN1Encodable, element); 
          } 
        } 
        if (bool) {
          byte b4 = b3;
          ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
          b1 = 7;
          i = 0;
          for (byte b5 = b4; b5 < list.size(); b5++) {
            if (b1 < 0) {
              byteArrayOutputStream.write(i);
              b1 = 7;
              i = 0;
            } 
            if (b5 < aSN1Sequence.size() && !OEROptional.ABSENT.equals(aSN1Sequence.getObjectAt(b5)))
              i |= bits[b1]; 
            b1--;
          } 
          if (b1 != 7)
            byteArrayOutputStream.write(i); 
          encodeLength((byteArrayOutputStream.size() + 1));
          if (b1 == 7) {
            write(0);
          } else {
            write(b1 + 1);
          } 
          write(byteArrayOutputStream.toByteArray());
          while (b3 < list.size()) {
            if (b3 < aSN1Sequence.size() && !OEROptional.ABSENT.equals(aSN1Sequence.getObjectAt(b3)))
              writePlainType(aSN1Sequence.getObjectAt(b3), list.get(b3)); 
            b3++;
          } 
        } 
        this.out.flush();
        debugPrint(paramElement.appendLabel(""));
        break;
      case SEQ_OF:
        if (aSN1Primitive1 instanceof ASN1Set) {
          enumeration = ((ASN1Set)aSN1Primitive1).getObjects();
          encodeQuantity(((ASN1Set)aSN1Primitive1).size());
        } else if (aSN1Primitive1 instanceof ASN1Sequence) {
          enumeration = ((ASN1Sequence)aSN1Primitive1).getObjects();
          encodeQuantity(((ASN1Sequence)aSN1Primitive1).size());
        } else {
          throw new IllegalStateException("encodable at for SEQ_OF is not a container");
        } 
        element1 = Element.expandDeferredDefinition(paramElement.getFirstChid(), paramElement);
        while (enumeration.hasMoreElements()) {
          i = enumeration.nextElement();
          write((ASN1Encodable)i, element1);
        } 
        this.out.flush();
        debugPrint(paramElement.appendLabel(""));
        break;
      case CHOICE:
        aSN1Primitive2 = aSN1Primitive1.toASN1Primitive();
        bitBuilder = new BitBuilder();
        aSN1Primitive3 = null;
        if (aSN1Primitive2 instanceof ASN1TaggedObject) {
          ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject)aSN1Primitive2;
          int m = aSN1TaggedObject.getTagClass();
          bitBuilder.writeBit(m & 0x80).writeBit(m & 0x40);
          k = aSN1TaggedObject.getTagNo();
          aSN1Primitive3 = aSN1TaggedObject.getBaseObject().toASN1Primitive();
        } else {
          throw new IllegalStateException("only support tagged objects");
        } 
        if (k <= 63) {
          bitBuilder.writeBits(k, 6);
        } else {
          bitBuilder.writeBits(255L, 6);
          bitBuilder.write7BitBytes(k);
        } 
        if (this.debugOutput != null && aSN1Primitive2 instanceof ASN1TaggedObject) {
          ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject)aSN1Primitive2;
          switch (aSN1TaggedObject.getTagClass()) {
            case 64:
              debugPrint(paramElement.appendLabel("AS"));
              break;
            case 128:
              debugPrint(paramElement.appendLabel("CS"));
              break;
            case 192:
              debugPrint(paramElement.appendLabel("PR"));
              break;
          } 
        } 
        bitBuilder.writeAndClear(this.out);
        element2 = paramElement.getChildren().get(k);
        element2 = Element.expandDeferredDefinition(element2, paramElement);
        if (element2.getBlock() > 0) {
          writePlainType((ASN1Encodable)aSN1Primitive3, element2);
        } else {
          write((ASN1Encodable)aSN1Primitive3, element2);
        } 
        this.out.flush();
        break;
      case ENUM:
        if (aSN1Primitive1 instanceof ASN1Integer) {
          bigInteger = ASN1Integer.getInstance(aSN1Primitive1).getValue();
        } else {
          bigInteger = ASN1Enumerated.getInstance(aSN1Primitive1).getValue();
        } 
        for (Element element : paramElement.getChildren()) {
          element = Element.expandDeferredDefinition(element, paramElement);
          if (element.getEnumValue().equals(bigInteger)) {
            if (bigInteger.compareTo(BigInteger.valueOf(127L)) > 0) {
              byte[] arrayOfByte1 = bigInteger.toByteArray();
              int m = 0x80 | arrayOfByte1.length & 0xFF;
              this.out.write(m);
              this.out.write(arrayOfByte1);
            } else {
              this.out.write(bigInteger.intValue() & 0x7F);
            } 
            this.out.flush();
            debugPrint(paramElement.appendLabel(paramElement.rangeExpression()));
            return;
          } 
        } 
        throw new IllegalArgumentException("enum value " + bigInteger + " " + Hex.toHexString(bigInteger.toByteArray()) + " no in defined child list");
      case INT:
        aSN1Integer = ASN1Integer.getInstance(aSN1Primitive1);
        j = paramElement.intBytesForRange();
        if (j > 0) {
          byte[] arrayOfByte1 = BigIntegers.asUnsignedByteArray(j, aSN1Integer.getValue());
          switch (j) {
            case 1:
            case 2:
            case 4:
            case 8:
              this.out.write(arrayOfByte1);
              break;
            default:
              throw new IllegalStateException("unknown uint length " + j);
          } 
        } else if (j < 0) {
          byte[] arrayOfByte1;
          BigInteger bigInteger1 = aSN1Integer.getValue();
          switch (j) {
            case -1:
              arrayOfByte1 = new byte[] { BigIntegers.byteValueExact(bigInteger1) };
              break;
            case -2:
              arrayOfByte1 = Pack.shortToBigEndian(BigIntegers.shortValueExact(bigInteger1));
              break;
            case -4:
              arrayOfByte1 = Pack.intToBigEndian(BigIntegers.intValueExact(bigInteger1));
              break;
            case -8:
              arrayOfByte1 = Pack.longToBigEndian(BigIntegers.longValueExact(bigInteger1));
              break;
            default:
              throw new IllegalStateException("unknown twos compliment length");
          } 
          this.out.write(arrayOfByte1);
        } else {
          byte[] arrayOfByte1;
          if (paramElement.isLowerRangeZero()) {
            arrayOfByte1 = BigIntegers.asUnsignedByteArray(aSN1Integer.getValue());
          } else {
            arrayOfByte1 = aSN1Integer.getValue().toByteArray();
          } 
          encodeLength(arrayOfByte1.length);
          this.out.write(arrayOfByte1);
        } 
        debugPrint(paramElement.appendLabel(paramElement.rangeExpression()));
        this.out.flush();
        break;
      case OCTET_STRING:
        aSN1OctetString2 = ASN1OctetString.getInstance(aSN1Primitive1);
        arrayOfByte = aSN1OctetString2.getOctets();
        if (paramElement.isFixedLength()) {
          this.out.write(arrayOfByte);
        } else {
          encodeLength(arrayOfByte.length);
          this.out.write(arrayOfByte);
        } 
        debugPrint(paramElement.appendLabel(paramElement.rangeExpression()));
        this.out.flush();
        break;
      case IA5String:
        aSN1IA5String = ASN1IA5String.getInstance(aSN1Primitive1);
        arrayOfByte = aSN1IA5String.getOctets();
        if (paramElement.isFixedLength() && paramElement.getUpperBound().intValue() != arrayOfByte.length)
          throw new IOException("IA5String string length does not equal declared fixed length " + arrayOfByte.length + " " + paramElement.getUpperBound()); 
        if (paramElement.isFixedLength()) {
          this.out.write(arrayOfByte);
        } else {
          encodeLength(arrayOfByte.length);
          this.out.write(arrayOfByte);
        } 
        debugPrint(paramElement.appendLabel(""));
        this.out.flush();
        break;
      case UTF8_STRING:
        aSN1UTF8String = ASN1UTF8String.getInstance(aSN1Primitive1);
        arrayOfByte = Strings.toUTF8ByteArray(aSN1UTF8String.getString());
        encodeLength(arrayOfByte.length);
        this.out.write(arrayOfByte);
        debugPrint(paramElement.appendLabel(""));
        this.out.flush();
        break;
      case BIT_STRING:
        aSN1BitString = ASN1BitString.getInstance(aSN1Primitive1);
        arrayOfByte = aSN1BitString.getBytes();
        if (paramElement.isFixedLength()) {
          this.out.write(arrayOfByte);
          debugPrint(paramElement.appendLabel(paramElement.rangeExpression()));
        } else {
          k = aSN1BitString.getPadBits();
          encodeLength((arrayOfByte.length + 1));
          this.out.write(k);
          this.out.write(arrayOfByte);
          debugPrint(paramElement.appendLabel(paramElement.rangeExpression()));
        } 
        this.out.flush();
        break;
      case EXTENSION:
        aSN1OctetString1 = ASN1OctetString.getInstance(aSN1Primitive1);
        arrayOfByte = aSN1OctetString1.getOctets();
        if (paramElement.isFixedLength()) {
          this.out.write(arrayOfByte);
        } else {
          encodeLength(arrayOfByte.length);
          this.out.write(arrayOfByte);
        } 
        debugPrint(paramElement.appendLabel(paramElement.rangeExpression()));
        this.out.flush();
        break;
      case BOOLEAN:
        debugPrint(paramElement.getLabel());
        aSN1Boolean = ASN1Boolean.getInstance(aSN1Primitive1);
        if (aSN1Boolean.isTrue()) {
          this.out.write(255);
        } else {
          this.out.write(0);
        } 
        this.out.flush();
        break;
    } 
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
  
  private void encodeLength(long paramLong) throws IOException {
    if (paramLong <= 127L) {
      this.out.write((int)paramLong);
    } else {
      byte[] arrayOfByte = BigIntegers.asUnsignedByteArray(BigInteger.valueOf(paramLong));
      this.out.write(arrayOfByte.length | 0x80);
      this.out.write(arrayOfByte);
    } 
  }
  
  private void encodeQuantity(long paramLong) throws IOException {
    byte[] arrayOfByte = BigIntegers.asUnsignedByteArray(BigInteger.valueOf(paramLong));
    this.out.write(arrayOfByte.length);
    this.out.write(arrayOfByte);
  }
  
  public void write(int paramInt) throws IOException {
    this.out.write(paramInt);
  }
  
  public void writePlainType(ASN1Encodable paramASN1Encodable, Element paramElement) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    OEROutputStream oEROutputStream = new OEROutputStream(byteArrayOutputStream);
    oEROutputStream.write(paramASN1Encodable, paramElement);
    oEROutputStream.flush();
    oEROutputStream.close();
    encodeLength(byteArrayOutputStream.size());
    write(byteArrayOutputStream.toByteArray());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\OEROutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */