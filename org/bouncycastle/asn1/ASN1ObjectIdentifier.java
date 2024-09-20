package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.bouncycastle.util.Arrays;

public class ASN1ObjectIdentifier extends ASN1Primitive {
  static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1ObjectIdentifier.class, 6) {
      ASN1Primitive fromImplicitPrimitive(DEROctetString param1DEROctetString) {
        return ASN1ObjectIdentifier.createPrimitive(param1DEROctetString.getOctets(), false);
      }
    };
  
  private static final int MAX_CONTENTS_LENGTH = 4096;
  
  private static final int MAX_IDENTIFIER_LENGTH = 16385;
  
  private static final long LONG_LIMIT = 72057594037927808L;
  
  private static final ConcurrentMap<OidHandle, ASN1ObjectIdentifier> pool = new ConcurrentHashMap<>();
  
  private final byte[] contents;
  
  private String identifier;
  
  public static ASN1ObjectIdentifier fromContents(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null)
      throw new NullPointerException("'contents' cannot be null"); 
    return createPrimitive(paramArrayOfbyte, true);
  }
  
  public static ASN1ObjectIdentifier getInstance(Object paramObject) {
    if (paramObject == null || paramObject instanceof ASN1ObjectIdentifier)
      return (ASN1ObjectIdentifier)paramObject; 
    if (paramObject instanceof ASN1Encodable) {
      ASN1Primitive aSN1Primitive = ((ASN1Encodable)paramObject).toASN1Primitive();
      if (aSN1Primitive instanceof ASN1ObjectIdentifier)
        return (ASN1ObjectIdentifier)aSN1Primitive; 
    } else if (paramObject instanceof byte[]) {
      try {
        return (ASN1ObjectIdentifier)TYPE.fromByteArray((byte[])paramObject);
      } catch (IOException iOException) {
        throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + iOException.getMessage());
      } 
    } 
    throw new IllegalArgumentException("illegal object in getInstance: " + paramObject.getClass().getName());
  }
  
  public static ASN1ObjectIdentifier getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    if (!paramBoolean && !paramASN1TaggedObject.isParsed() && paramASN1TaggedObject.hasContextTag()) {
      ASN1Primitive aSN1Primitive = paramASN1TaggedObject.getBaseObject().toASN1Primitive();
      if (!(aSN1Primitive instanceof ASN1ObjectIdentifier))
        return fromContents(ASN1OctetString.getInstance(aSN1Primitive).getOctets()); 
    } 
    return (ASN1ObjectIdentifier)TYPE.getContextInstance(paramASN1TaggedObject, paramBoolean);
  }
  
  public static ASN1ObjectIdentifier tryFromID(String paramString) {
    if (paramString == null)
      throw new NullPointerException("'identifier' cannot be null"); 
    if (paramString.length() <= 16385 && isValidIdentifier(paramString)) {
      byte[] arrayOfByte = parseIdentifier(paramString);
      if (arrayOfByte.length <= 4096)
        return new ASN1ObjectIdentifier(arrayOfByte, paramString); 
    } 
    return null;
  }
  
  public ASN1ObjectIdentifier(String paramString) {
    checkIdentifier(paramString);
    byte[] arrayOfByte = parseIdentifier(paramString);
    checkContentsLength(arrayOfByte.length);
    this.contents = arrayOfByte;
    this.identifier = paramString;
  }
  
  private ASN1ObjectIdentifier(byte[] paramArrayOfbyte, String paramString) {
    this.contents = paramArrayOfbyte;
    this.identifier = paramString;
  }
  
  public ASN1ObjectIdentifier branch(String paramString) {
    ASN1RelativeOID.checkIdentifier(paramString);
    byte[] arrayOfByte1 = ASN1RelativeOID.parseIdentifier(paramString);
    checkContentsLength(this.contents.length + arrayOfByte1.length);
    byte[] arrayOfByte2 = Arrays.concatenate(this.contents, arrayOfByte1);
    String str = getId() + "." + paramString;
    return new ASN1ObjectIdentifier(arrayOfByte2, str);
  }
  
  public synchronized String getId() {
    if (this.identifier == null)
      this.identifier = parseContents(this.contents); 
    return this.identifier;
  }
  
  public boolean on(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    byte[] arrayOfByte1 = this.contents;
    byte[] arrayOfByte2 = paramASN1ObjectIdentifier.contents;
    int i = arrayOfByte2.length;
    return (arrayOfByte1.length > i && Arrays.areEqual(arrayOfByte1, 0, i, arrayOfByte2, 0, i));
  }
  
  boolean encodeConstructed() {
    return false;
  }
  
  int encodedLength(boolean paramBoolean) {
    return ASN1OutputStream.getLengthOfEncodingDL(paramBoolean, this.contents.length);
  }
  
  void encode(ASN1OutputStream paramASN1OutputStream, boolean paramBoolean) throws IOException {
    paramASN1OutputStream.writeEncodingDL(paramBoolean, 6, this.contents);
  }
  
  public int hashCode() {
    return Arrays.hashCode(this.contents);
  }
  
  boolean asn1Equals(ASN1Primitive paramASN1Primitive) {
    if (this == paramASN1Primitive)
      return true; 
    if (!(paramASN1Primitive instanceof ASN1ObjectIdentifier))
      return false; 
    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier)paramASN1Primitive;
    return Arrays.areEqual(this.contents, aSN1ObjectIdentifier.contents);
  }
  
  public String toString() {
    return getId();
  }
  
  static void checkContentsLength(int paramInt) {
    if (paramInt > 4096)
      throw new IllegalArgumentException("exceeded OID contents length limit"); 
  }
  
  static void checkIdentifier(String paramString) {
    if (paramString == null)
      throw new NullPointerException("'identifier' cannot be null"); 
    if (paramString.length() > 16385)
      throw new IllegalArgumentException("exceeded OID contents length limit"); 
    if (!isValidIdentifier(paramString))
      throw new IllegalArgumentException("string " + paramString + " not a valid OID"); 
  }
  
  static ASN1ObjectIdentifier createPrimitive(byte[] paramArrayOfbyte, boolean paramBoolean) {
    checkContentsLength(paramArrayOfbyte.length);
    OidHandle oidHandle = new OidHandle(paramArrayOfbyte);
    ASN1ObjectIdentifier aSN1ObjectIdentifier = pool.get(oidHandle);
    if (aSN1ObjectIdentifier != null)
      return aSN1ObjectIdentifier; 
    if (!ASN1RelativeOID.isValidContents(paramArrayOfbyte))
      throw new IllegalArgumentException("invalid OID contents"); 
    return new ASN1ObjectIdentifier(paramBoolean ? Arrays.clone(paramArrayOfbyte) : paramArrayOfbyte, null);
  }
  
  private static boolean isValidIdentifier(String paramString) {
    if (paramString.length() < 3 || paramString.charAt(1) != '.')
      return false; 
    char c = paramString.charAt(0);
    return (c < '0' || c > '2') ? false : (!ASN1RelativeOID.isValidIdentifier(paramString, 2) ? false : ((c == '2') ? true : ((paramString.length() == 3 || paramString.charAt(3) == '.') ? true : ((paramString.length() == 4 || paramString.charAt(4) == '.') ? ((paramString.charAt(2) < '4')) : false))));
  }
  
  private static String parseContents(byte[] paramArrayOfbyte) {
    StringBuilder stringBuilder = new StringBuilder();
    long l = 0L;
    BigInteger bigInteger = null;
    boolean bool = true;
    for (byte b = 0; b != paramArrayOfbyte.length; b++) {
      int i = paramArrayOfbyte[b] & 0xFF;
      if (l <= 72057594037927808L) {
        l += (i & 0x7F);
        if ((i & 0x80) == 0) {
          if (bool) {
            if (l < 40L) {
              stringBuilder.append('0');
            } else if (l < 80L) {
              stringBuilder.append('1');
              l -= 40L;
            } else {
              stringBuilder.append('2');
              l -= 80L;
            } 
            bool = false;
          } 
          stringBuilder.append('.');
          stringBuilder.append(l);
          l = 0L;
        } else {
          l <<= 7L;
        } 
      } else {
        if (bigInteger == null)
          bigInteger = BigInteger.valueOf(l); 
        bigInteger = bigInteger.or(BigInteger.valueOf((i & 0x7F)));
        if ((i & 0x80) == 0) {
          if (bool) {
            stringBuilder.append('2');
            bigInteger = bigInteger.subtract(BigInteger.valueOf(80L));
            bool = false;
          } 
          stringBuilder.append('.');
          stringBuilder.append(bigInteger);
          bigInteger = null;
          l = 0L;
        } else {
          bigInteger = bigInteger.shiftLeft(7);
        } 
      } 
    } 
    return stringBuilder.toString();
  }
  
  private static byte[] parseIdentifier(String paramString) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    OIDTokenizer oIDTokenizer = new OIDTokenizer(paramString);
    int i = Integer.parseInt(oIDTokenizer.nextToken()) * 40;
    String str = oIDTokenizer.nextToken();
    if (str.length() <= 18) {
      ASN1RelativeOID.writeField(byteArrayOutputStream, i + Long.parseLong(str));
    } else {
      ASN1RelativeOID.writeField(byteArrayOutputStream, (new BigInteger(str)).add(BigInteger.valueOf(i)));
    } 
    while (oIDTokenizer.hasMoreTokens()) {
      String str1 = oIDTokenizer.nextToken();
      if (str1.length() <= 18) {
        ASN1RelativeOID.writeField(byteArrayOutputStream, Long.parseLong(str1));
        continue;
      } 
      ASN1RelativeOID.writeField(byteArrayOutputStream, new BigInteger(str1));
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  public ASN1ObjectIdentifier intern() {
    OidHandle oidHandle = new OidHandle(this.contents);
    ASN1ObjectIdentifier aSN1ObjectIdentifier = pool.get(oidHandle);
    if (aSN1ObjectIdentifier == null)
      synchronized (pool) {
        if (!pool.containsKey(oidHandle)) {
          pool.put(oidHandle, this);
          return this;
        } 
        return pool.get(oidHandle);
      }  
    return aSN1ObjectIdentifier;
  }
  
  static class OidHandle {
    private final int key;
    
    private final byte[] contents;
    
    OidHandle(byte[] param1ArrayOfbyte) {
      this.key = Arrays.hashCode(param1ArrayOfbyte);
      this.contents = param1ArrayOfbyte;
    }
    
    public int hashCode() {
      return this.key;
    }
    
    public boolean equals(Object param1Object) {
      return (param1Object instanceof OidHandle) ? Arrays.areEqual(this.contents, ((OidHandle)param1Object).contents) : false;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\ASN1ObjectIdentifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */