package org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.tls.crypto.DHGroup;
import org.bouncycastle.tls.crypto.DHStandardGroups;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

public class TlsDHUtils {
  public static TlsDHConfig createNamedDHConfig(TlsContext paramTlsContext, int paramInt) {
    if (paramInt < 0 || NamedGroup.getFiniteFieldBits(paramInt) < 1)
      return null; 
    boolean bool = TlsUtils.isTLSv13(paramTlsContext);
    return new TlsDHConfig(paramInt, bool);
  }
  
  public static DHGroup getDHGroup(TlsDHConfig paramTlsDHConfig) {
    int i = paramTlsDHConfig.getNamedGroup();
    return (i >= 0) ? getNamedDHGroup(i) : paramTlsDHConfig.getExplicitGroup();
  }
  
  public static DHGroup getNamedDHGroup(int paramInt) {
    switch (paramInt) {
      case 256:
        return DHStandardGroups.rfc7919_ffdhe2048;
      case 257:
        return DHStandardGroups.rfc7919_ffdhe3072;
      case 258:
        return DHStandardGroups.rfc7919_ffdhe4096;
      case 259:
        return DHStandardGroups.rfc7919_ffdhe6144;
      case 260:
        return DHStandardGroups.rfc7919_ffdhe8192;
    } 
    return null;
  }
  
  public static int getMinimumFiniteFieldBits(int paramInt) {
    return isDHCipherSuite(paramInt) ? 1 : 0;
  }
  
  public static boolean isDHCipherSuite(int paramInt) {
    switch (TlsUtils.getKeyExchangeAlgorithm(paramInt)) {
      case 3:
      case 5:
      case 7:
      case 9:
      case 11:
      case 14:
        return true;
    } 
    return false;
  }
  
  public static int getNamedGroupForDHParameters(BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    int[] arrayOfInt = { 256, 257, 258, 259, 260 };
    for (byte b = 0; b < arrayOfInt.length; b++) {
      int i = arrayOfInt[b];
      DHGroup dHGroup = getNamedDHGroup(i);
      if (dHGroup != null && dHGroup.getP().equals(paramBigInteger1) && dHGroup.getG().equals(paramBigInteger2))
        return i; 
    } 
    return -1;
  }
  
  public static DHGroup getStandardGroupForDHParameters(BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    DHGroup[] arrayOfDHGroup = { 
        DHStandardGroups.rfc7919_ffdhe2048, DHStandardGroups.rfc7919_ffdhe3072, DHStandardGroups.rfc7919_ffdhe4096, DHStandardGroups.rfc7919_ffdhe6144, DHStandardGroups.rfc7919_ffdhe8192, DHStandardGroups.rfc3526_1536, DHStandardGroups.rfc3526_2048, DHStandardGroups.rfc3526_3072, DHStandardGroups.rfc3526_4096, DHStandardGroups.rfc3526_6144, 
        DHStandardGroups.rfc3526_8192, DHStandardGroups.rfc5996_768, DHStandardGroups.rfc5996_1024 };
    for (byte b = 0; b < arrayOfDHGroup.length; b++) {
      DHGroup dHGroup = arrayOfDHGroup[b];
      if (dHGroup != null && dHGroup.getP().equals(paramBigInteger1) && dHGroup.getG().equals(paramBigInteger2))
        return dHGroup; 
    } 
    return null;
  }
  
  public static TlsDHConfig receiveDHConfig(TlsContext paramTlsContext, TlsDHGroupVerifier paramTlsDHGroupVerifier, InputStream paramInputStream) throws IOException {
    BigInteger bigInteger1 = readDHParameter(paramInputStream);
    BigInteger bigInteger2 = readDHParameter(paramInputStream);
    int i = getNamedGroupForDHParameters(bigInteger1, bigInteger2);
    if (i < 0) {
      DHGroup dHGroup = getStandardGroupForDHParameters(bigInteger1, bigInteger2);
      if (null == dHGroup)
        dHGroup = new DHGroup(bigInteger1, null, bigInteger2, 0); 
      if (!paramTlsDHGroupVerifier.accept(dHGroup))
        throw new TlsFatalAlert((short)71); 
      return new TlsDHConfig(dHGroup);
    } 
    int[] arrayOfInt = paramTlsContext.getSecurityParametersHandshake().getClientSupportedGroups();
    if (null == arrayOfInt || Arrays.contains(arrayOfInt, i))
      return new TlsDHConfig(i, false); 
    throw new TlsFatalAlert((short)47);
  }
  
  public static BigInteger readDHParameter(InputStream paramInputStream) throws IOException {
    return new BigInteger(1, TlsUtils.readOpaque16(paramInputStream, 1));
  }
  
  public static void writeDHConfig(TlsDHConfig paramTlsDHConfig, OutputStream paramOutputStream) throws IOException {
    DHGroup dHGroup = getDHGroup(paramTlsDHConfig);
    writeDHParameter(dHGroup.getP(), paramOutputStream);
    writeDHParameter(dHGroup.getG(), paramOutputStream);
  }
  
  public static void writeDHParameter(BigInteger paramBigInteger, OutputStream paramOutputStream) throws IOException {
    TlsUtils.writeOpaque16(BigIntegers.asUnsignedByteArray(paramBigInteger), paramOutputStream);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsDHUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */