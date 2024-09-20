package org.bouncycastle.tls;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.tls.crypto.SRP6Group;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsHMAC;
import org.bouncycastle.tls.crypto.TlsMAC;
import org.bouncycastle.tls.crypto.TlsSRP6VerifierGenerator;
import org.bouncycastle.tls.crypto.TlsSRPConfig;
import org.bouncycastle.util.Strings;

public class SimulatedTlsSRPIdentityManager implements TlsSRPIdentityManager {
  private static final byte[] PREFIX_PASSWORD = Strings.toByteArray("password");
  
  private static final byte[] PREFIX_SALT = Strings.toByteArray("salt");
  
  protected SRP6Group group;
  
  protected TlsSRP6VerifierGenerator verifierGenerator;
  
  protected TlsMAC mac;
  
  public static SimulatedTlsSRPIdentityManager getRFC5054Default(TlsCrypto paramTlsCrypto, SRP6Group paramSRP6Group, byte[] paramArrayOfbyte) throws IOException {
    TlsHMAC tlsHMAC = paramTlsCrypto.createHMAC(2);
    tlsHMAC.setKey(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    TlsSRPConfig tlsSRPConfig = new TlsSRPConfig();
    tlsSRPConfig.setExplicitNG(new BigInteger[] { paramSRP6Group.getN(), paramSRP6Group.getG() });
    return new SimulatedTlsSRPIdentityManager(paramSRP6Group, paramTlsCrypto.createSRP6VerifierGenerator(tlsSRPConfig), (TlsMAC)tlsHMAC);
  }
  
  public SimulatedTlsSRPIdentityManager(SRP6Group paramSRP6Group, TlsSRP6VerifierGenerator paramTlsSRP6VerifierGenerator, TlsMAC paramTlsMAC) {
    this.group = paramSRP6Group;
    this.verifierGenerator = paramTlsSRP6VerifierGenerator;
    this.mac = paramTlsMAC;
  }
  
  public TlsSRPLoginParameters getLoginParameters(byte[] paramArrayOfbyte) {
    this.mac.update(PREFIX_SALT, 0, PREFIX_SALT.length);
    this.mac.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    byte[] arrayOfByte1 = this.mac.calculateMAC();
    this.mac.update(PREFIX_PASSWORD, 0, PREFIX_PASSWORD.length);
    this.mac.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    byte[] arrayOfByte2 = this.mac.calculateMAC();
    BigInteger bigInteger = this.verifierGenerator.generateVerifier(arrayOfByte1, paramArrayOfbyte, arrayOfByte2);
    TlsSRPConfig tlsSRPConfig = new TlsSRPConfig();
    tlsSRPConfig.setExplicitNG(new BigInteger[] { this.group.getN(), this.group.getG() });
    return new TlsSRPLoginParameters(paramArrayOfbyte, tlsSRPConfig, bigInteger, arrayOfByte1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\SimulatedTlsSRPIdentityManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */