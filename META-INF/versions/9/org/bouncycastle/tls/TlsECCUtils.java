package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.NamedGroup;
import org.bouncycastle.tls.TlsContext;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsECConfig;
import org.bouncycastle.util.Arrays;

public class TlsECCUtils {
  public static TlsECConfig createNamedECConfig(TlsContext paramTlsContext, int paramInt) throws IOException {
    if (NamedGroup.getCurveBits(paramInt) < 1)
      throw new TlsFatalAlert((short)80); 
    return new TlsECConfig(paramInt);
  }
  
  public static int getMinimumCurveBits(int paramInt) {
    return isECCCipherSuite(paramInt) ? 1 : 0;
  }
  
  public static boolean isECCCipherSuite(int paramInt) {
    switch (TlsUtils.getKeyExchangeAlgorithm(paramInt)) {
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 24:
        return true;
    } 
    return false;
  }
  
  public static void checkPointEncoding(int paramInt, byte[] paramArrayOfbyte) throws IOException {
    if (TlsUtils.isNullOrEmpty(paramArrayOfbyte))
      throw new TlsFatalAlert((short)47); 
    switch (paramInt) {
      case 29:
      case 30:
        return;
    } 
    switch (paramArrayOfbyte[0]) {
      case 4:
        return;
    } 
    throw new TlsFatalAlert((short)47);
  }
  
  public static TlsECConfig receiveECDHConfig(TlsContext paramTlsContext, InputStream paramInputStream) throws IOException {
    short s = TlsUtils.readUint8(paramInputStream);
    if (s != 3)
      throw new TlsFatalAlert((short)40); 
    int i = TlsUtils.readUint16(paramInputStream);
    if (NamedGroup.refersToAnECDHCurve(i)) {
      int[] arrayOfInt = paramTlsContext.getSecurityParametersHandshake().getClientSupportedGroups();
      if (null == arrayOfInt || Arrays.contains(arrayOfInt, i))
        return new TlsECConfig(i); 
    } 
    throw new TlsFatalAlert((short)47);
  }
  
  public static void writeECConfig(TlsECConfig paramTlsECConfig, OutputStream paramOutputStream) throws IOException {
    writeNamedECParameters(paramTlsECConfig.getNamedGroup(), paramOutputStream);
  }
  
  public static void writeNamedECParameters(int paramInt, OutputStream paramOutputStream) throws IOException {
    if (!NamedGroup.refersToASpecificCurve(paramInt))
      throw new TlsFatalAlert((short)80); 
    TlsUtils.writeUint8((short)3, paramOutputStream);
    TlsUtils.checkUint16(paramInt);
    TlsUtils.writeUint16(paramInt, paramOutputStream);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsECCUtils.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */