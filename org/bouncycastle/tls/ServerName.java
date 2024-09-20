package org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class ServerName {
  private final short nameType;
  
  private final byte[] nameData;
  
  public ServerName(short paramShort, byte[] paramArrayOfbyte) {
    if (!TlsUtils.isValidUint8(paramShort))
      throw new IllegalArgumentException("'nameType' must be from 0 to 255"); 
    if (null == paramArrayOfbyte)
      throw new NullPointerException("'nameData' cannot be null"); 
    if (paramArrayOfbyte.length < 1 || !TlsUtils.isValidUint16(paramArrayOfbyte.length))
      throw new IllegalArgumentException("'nameData' must have length from 1 to 65535"); 
    this.nameType = paramShort;
    this.nameData = paramArrayOfbyte;
  }
  
  public short getNameType() {
    return this.nameType;
  }
  
  public byte[] getNameData() {
    return this.nameData;
  }
  
  public void encode(OutputStream paramOutputStream) throws IOException {
    TlsUtils.writeUint8(this.nameType, paramOutputStream);
    TlsUtils.writeOpaque16(this.nameData, paramOutputStream);
  }
  
  public static ServerName parse(InputStream paramInputStream) throws IOException {
    short s = TlsUtils.readUint8(paramInputStream);
    byte[] arrayOfByte = TlsUtils.readOpaque16(paramInputStream, 1);
    return new ServerName(s, arrayOfByte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\ServerName.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */