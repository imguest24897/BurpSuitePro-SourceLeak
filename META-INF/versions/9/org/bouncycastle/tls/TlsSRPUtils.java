package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Hashtable;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;

public class TlsSRPUtils {
  public static final Integer EXT_SRP = Integers.valueOf(12);
  
  public static void addSRPExtension(Hashtable<Integer, byte[]> paramHashtable, byte[] paramArrayOfbyte) throws IOException {
    paramHashtable.put(EXT_SRP, createSRPExtension(paramArrayOfbyte));
  }
  
  public static byte[] getSRPExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_SRP);
    return (arrayOfByte == null) ? null : readSRPExtension(arrayOfByte);
  }
  
  public static byte[] createSRPExtension(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new TlsFatalAlert((short)80); 
    return TlsUtils.encodeOpaque8(paramArrayOfbyte);
  }
  
  public static byte[] readSRPExtension(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'extensionData' cannot be null"); 
    return TlsUtils.decodeOpaque8(paramArrayOfbyte, 1);
  }
  
  public static BigInteger readSRPParameter(InputStream paramInputStream) throws IOException {
    return new BigInteger(1, TlsUtils.readOpaque16(paramInputStream, 1));
  }
  
  public static void writeSRPParameter(BigInteger paramBigInteger, OutputStream paramOutputStream) throws IOException {
    TlsUtils.writeOpaque16(BigIntegers.asUnsignedByteArray(paramBigInteger), paramOutputStream);
  }
  
  public static boolean isSRPCipherSuite(int paramInt) {
    switch (TlsUtils.getKeyExchangeAlgorithm(paramInt)) {
      case 21:
      case 22:
      case 23:
        return true;
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsSRPUtils.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */