package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.tls.IdentifierType;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.util.Arrays;

public class TrustedAuthority {
  protected short identifierType;
  
  protected Object identifier;
  
  public TrustedAuthority(short paramShort, Object paramObject) {
    if (!isCorrectType(paramShort, paramObject))
      throw new IllegalArgumentException("'identifier' is not an instance of the correct type"); 
    this.identifierType = paramShort;
    this.identifier = paramObject;
  }
  
  public short getIdentifierType() {
    return this.identifierType;
  }
  
  public Object getIdentifier() {
    return this.identifier;
  }
  
  public byte[] getCertSHA1Hash() {
    return Arrays.clone((byte[])this.identifier);
  }
  
  public byte[] getKeySHA1Hash() {
    return Arrays.clone((byte[])this.identifier);
  }
  
  public X500Name getX509Name() {
    checkCorrectType((short)2);
    return (X500Name)this.identifier;
  }
  
  public void encode(OutputStream paramOutputStream) throws IOException {
    byte[] arrayOfByte1;
    X500Name x500Name;
    byte[] arrayOfByte2;
    TlsUtils.writeUint8(this.identifierType, paramOutputStream);
    switch (this.identifierType) {
      case 1:
      case 3:
        arrayOfByte1 = (byte[])this.identifier;
        paramOutputStream.write(arrayOfByte1);
      case 0:
        return;
      case 2:
        x500Name = (X500Name)this.identifier;
        arrayOfByte2 = x500Name.getEncoded("DER");
        TlsUtils.writeOpaque16(arrayOfByte2, paramOutputStream);
    } 
    throw new TlsFatalAlert((short)80);
  }
  
  public static org.bouncycastle.tls.TrustedAuthority parse(InputStream paramInputStream) throws IOException {
    byte[] arrayOfByte1;
    X500Name x500Name1;
    byte[] arrayOfByte2;
    ASN1Primitive aSN1Primitive;
    X500Name x500Name2;
    short s = TlsUtils.readUint8(paramInputStream);
    switch (s) {
      case 1:
      case 3:
        arrayOfByte1 = TlsUtils.readFully(20, paramInputStream);
        return new org.bouncycastle.tls.TrustedAuthority(s, arrayOfByte1);
      case 0:
        arrayOfByte1 = null;
        return new org.bouncycastle.tls.TrustedAuthority(s, arrayOfByte1);
      case 2:
        arrayOfByte2 = TlsUtils.readOpaque16(paramInputStream, 1);
        aSN1Primitive = TlsUtils.readASN1Object(arrayOfByte2);
        x500Name2 = X500Name.getInstance(aSN1Primitive);
        TlsUtils.requireDEREncoding((ASN1Object)x500Name2, arrayOfByte2);
        x500Name1 = x500Name2;
        return new org.bouncycastle.tls.TrustedAuthority(s, x500Name1);
    } 
    throw new TlsFatalAlert((short)50);
  }
  
  protected void checkCorrectType(short paramShort) {
    if (this.identifierType != paramShort || !isCorrectType(paramShort, this.identifier))
      throw new IllegalStateException("TrustedAuthority is not of type " + IdentifierType.getName(paramShort)); 
  }
  
  protected static boolean isCorrectType(short paramShort, Object paramObject) {
    switch (paramShort) {
      case 1:
      case 3:
        return isSHA1Hash(paramObject);
      case 0:
        return (paramObject == null);
      case 2:
        return paramObject instanceof X500Name;
    } 
    throw new IllegalArgumentException("'identifierType' is an unsupported IdentifierType");
  }
  
  protected static boolean isSHA1Hash(Object paramObject) {
    return (paramObject instanceof byte[] && ((byte[])paramObject).length == 20);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TrustedAuthority.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */