package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.TlsUtils;

public class KeyShareEntry {
  protected final int namedGroup;
  
  protected final byte[] keyExchange;
  
  private static boolean checkKeyExchangeLength(int paramInt) {
    return (0 < paramInt && paramInt < 65536);
  }
  
  public KeyShareEntry(int paramInt, byte[] paramArrayOfbyte) {
    if (!TlsUtils.isValidUint16(paramInt))
      throw new IllegalArgumentException("'namedGroup' should be a uint16"); 
    if (null == paramArrayOfbyte)
      throw new NullPointerException("'keyExchange' cannot be null"); 
    if (!checkKeyExchangeLength(paramArrayOfbyte.length))
      throw new IllegalArgumentException("'keyExchange' must have length from 1 to (2^16 - 1)"); 
    this.namedGroup = paramInt;
    this.keyExchange = paramArrayOfbyte;
  }
  
  public int getNamedGroup() {
    return this.namedGroup;
  }
  
  public byte[] getKeyExchange() {
    return this.keyExchange;
  }
  
  public void encode(OutputStream paramOutputStream) throws IOException {
    TlsUtils.writeUint16(getNamedGroup(), paramOutputStream);
    TlsUtils.writeOpaque16(getKeyExchange(), paramOutputStream);
  }
  
  public static org.bouncycastle.tls.KeyShareEntry parse(InputStream paramInputStream) throws IOException {
    int i = TlsUtils.readUint16(paramInputStream);
    byte[] arrayOfByte = TlsUtils.readOpaque16(paramInputStream, 1);
    return new org.bouncycastle.tls.KeyShareEntry(i, arrayOfByte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\KeyShareEntry.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */