package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

public class ServerNameList {
  protected Vector serverNameList;
  
  public ServerNameList(Vector paramVector) {
    if (null == paramVector)
      throw new NullPointerException("'serverNameList' cannot be null"); 
    this.serverNameList = paramVector;
  }
  
  public Vector getServerNameList() {
    return this.serverNameList;
  }
  
  public void encode(OutputStream paramOutputStream) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    short[] arrayOfShort = TlsUtils.EMPTY_SHORTS;
    for (byte b = 0; b < this.serverNameList.size(); b++) {
      ServerName serverName = this.serverNameList.elementAt(b);
      arrayOfShort = checkNameType(arrayOfShort, serverName.getNameType());
      if (null == arrayOfShort)
        throw new TlsFatalAlert((short)80); 
      serverName.encode(byteArrayOutputStream);
    } 
    TlsUtils.checkUint16(byteArrayOutputStream.size());
    TlsUtils.writeUint16(byteArrayOutputStream.size(), paramOutputStream);
    Streams.writeBufTo(byteArrayOutputStream, paramOutputStream);
  }
  
  public static ServerNameList parse(InputStream paramInputStream) throws IOException {
    byte[] arrayOfByte = TlsUtils.readOpaque16(paramInputStream, 1);
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
    short[] arrayOfShort = TlsUtils.EMPTY_SHORTS;
    Vector<ServerName> vector = new Vector();
    while (byteArrayInputStream.available() > 0) {
      ServerName serverName = ServerName.parse(byteArrayInputStream);
      arrayOfShort = checkNameType(arrayOfShort, serverName.getNameType());
      if (null == arrayOfShort)
        throw new TlsFatalAlert((short)47); 
      vector.addElement(serverName);
    } 
    return new ServerNameList(vector);
  }
  
  private static short[] checkNameType(short[] paramArrayOfshort, short paramShort) {
    return Arrays.contains(paramArrayOfshort, paramShort) ? null : Arrays.append(paramArrayOfshort, paramShort);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\ServerNameList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */