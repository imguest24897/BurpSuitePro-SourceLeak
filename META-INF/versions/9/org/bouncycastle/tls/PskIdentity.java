package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.util.Arrays;

public class PskIdentity {
  protected byte[] identity;
  
  protected long obfuscatedTicketAge;
  
  public PskIdentity(byte[] paramArrayOfbyte, long paramLong) {
    if (null == paramArrayOfbyte)
      throw new IllegalArgumentException("'identity' cannot be null"); 
    if (paramArrayOfbyte.length < 1 || !TlsUtils.isValidUint16(paramArrayOfbyte.length))
      throw new IllegalArgumentException("'identity' should have length from 1 to 65535"); 
    if (!TlsUtils.isValidUint32(paramLong))
      throw new IllegalArgumentException("'obfuscatedTicketAge' should be a uint32"); 
    this.identity = paramArrayOfbyte;
    this.obfuscatedTicketAge = paramLong;
  }
  
  public int getEncodedLength() {
    return 6 + this.identity.length;
  }
  
  public byte[] getIdentity() {
    return this.identity;
  }
  
  public long getObfuscatedTicketAge() {
    return this.obfuscatedTicketAge;
  }
  
  public void encode(OutputStream paramOutputStream) throws IOException {
    TlsUtils.writeOpaque16(this.identity, paramOutputStream);
    TlsUtils.writeUint32(this.obfuscatedTicketAge, paramOutputStream);
  }
  
  public static org.bouncycastle.tls.PskIdentity parse(InputStream paramInputStream) throws IOException {
    byte[] arrayOfByte = TlsUtils.readOpaque16(paramInputStream, 1);
    long l = TlsUtils.readUint32(paramInputStream);
    return new org.bouncycastle.tls.PskIdentity(arrayOfByte, l);
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof org.bouncycastle.tls.PskIdentity))
      return false; 
    org.bouncycastle.tls.PskIdentity pskIdentity = (org.bouncycastle.tls.PskIdentity)paramObject;
    return (this.obfuscatedTicketAge == pskIdentity.obfuscatedTicketAge && Arrays.constantTimeAreEqual(this.identity, pskIdentity.identity));
  }
  
  public int hashCode() {
    return Arrays.hashCode(this.identity) ^ (int)this.obfuscatedTicketAge ^ (int)(this.obfuscatedTicketAge >>> 32L);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\PskIdentity.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */