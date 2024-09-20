package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.tls.AbstractTlsKeyExchange;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.DigestInputBuffer;
import org.bouncycastle.tls.ServerSRPParams;
import org.bouncycastle.tls.TlsCredentialedSigner;
import org.bouncycastle.tls.TlsCredentials;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsSRPConfigVerifier;
import org.bouncycastle.tls.TlsSRPIdentity;
import org.bouncycastle.tls.TlsSRPLoginParameters;
import org.bouncycastle.tls.TlsSRPUtils;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsSRP6Client;
import org.bouncycastle.tls.crypto.TlsSRP6Server;
import org.bouncycastle.tls.crypto.TlsSRPConfig;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.io.TeeInputStream;

public class TlsSRPKeyExchange extends AbstractTlsKeyExchange {
  protected TlsSRPIdentity srpIdentity;
  
  protected TlsSRPConfigVerifier srpConfigVerifier;
  
  protected TlsCertificate serverCertificate = null;
  
  protected byte[] srpSalt = null;
  
  protected TlsSRP6Client srpClient = null;
  
  protected TlsSRPLoginParameters srpLoginParameters;
  
  protected TlsCredentialedSigner serverCredentials = null;
  
  protected TlsSRP6Server srpServer = null;
  
  protected BigInteger srpPeerCredentials = null;
  
  private static int checkKeyExchange(int paramInt) {
    switch (paramInt) {
      case 21:
      case 22:
      case 23:
        return paramInt;
    } 
    throw new IllegalArgumentException("unsupported key exchange algorithm");
  }
  
  public TlsSRPKeyExchange(int paramInt, TlsSRPIdentity paramTlsSRPIdentity, TlsSRPConfigVerifier paramTlsSRPConfigVerifier) {
    super(checkKeyExchange(paramInt));
    this.srpIdentity = paramTlsSRPIdentity;
    this.srpConfigVerifier = paramTlsSRPConfigVerifier;
  }
  
  public TlsSRPKeyExchange(int paramInt, TlsSRPLoginParameters paramTlsSRPLoginParameters) {
    super(checkKeyExchange(paramInt));
    this.srpLoginParameters = paramTlsSRPLoginParameters;
  }
  
  public void skipServerCredentials() throws IOException {
    if (this.keyExchange != 21)
      throw new TlsFatalAlert((short)80); 
  }
  
  public void processServerCredentials(TlsCredentials paramTlsCredentials) throws IOException {
    if (this.keyExchange == 21)
      throw new TlsFatalAlert((short)80); 
    this.serverCredentials = TlsUtils.requireSignerCredentials(paramTlsCredentials);
  }
  
  public void processServerCertificate(Certificate paramCertificate) throws IOException {
    if (this.keyExchange == 21)
      throw new TlsFatalAlert((short)80); 
    this.serverCertificate = paramCertificate.getCertificateAt(0);
  }
  
  public boolean requiresServerKeyExchange() {
    return true;
  }
  
  public byte[] generateServerKeyExchange() throws IOException {
    TlsSRPConfig tlsSRPConfig = this.srpLoginParameters.getConfig();
    this.srpServer = this.context.getCrypto().createSRP6Server(tlsSRPConfig, this.srpLoginParameters.getVerifier());
    BigInteger bigInteger = this.srpServer.generateServerCredentials();
    BigInteger[] arrayOfBigInteger = tlsSRPConfig.getExplicitNG();
    ServerSRPParams serverSRPParams = new ServerSRPParams(arrayOfBigInteger[0], arrayOfBigInteger[1], this.srpLoginParameters.getSalt(), bigInteger);
    DigestInputBuffer digestInputBuffer = new DigestInputBuffer();
    serverSRPParams.encode((OutputStream)digestInputBuffer);
    if (this.serverCredentials != null)
      TlsUtils.generateServerKeyExchangeSignature(this.context, this.serverCredentials, null, digestInputBuffer); 
    return digestInputBuffer.toByteArray();
  }
  
  public void processServerKeyExchange(InputStream paramInputStream) throws IOException {
    TeeInputStream teeInputStream;
    DigestInputBuffer digestInputBuffer = null;
    InputStream inputStream = paramInputStream;
    if (this.keyExchange != 21) {
      digestInputBuffer = new DigestInputBuffer();
      teeInputStream = new TeeInputStream(paramInputStream, (OutputStream)digestInputBuffer);
    } 
    ServerSRPParams serverSRPParams = ServerSRPParams.parse((InputStream)teeInputStream);
    if (digestInputBuffer != null)
      TlsUtils.verifyServerKeyExchangeSignature(this.context, paramInputStream, this.serverCertificate, null, digestInputBuffer); 
    TlsSRPConfig tlsSRPConfig = new TlsSRPConfig();
    tlsSRPConfig.setExplicitNG(new BigInteger[] { serverSRPParams.getN(), serverSRPParams.getG() });
    if (!this.srpConfigVerifier.accept(tlsSRPConfig))
      throw new TlsFatalAlert((short)71); 
    this.srpSalt = serverSRPParams.getS();
    this.srpPeerCredentials = validatePublicValue(serverSRPParams.getN(), serverSRPParams.getB());
    this.srpClient = this.context.getCrypto().createSRP6Client(tlsSRPConfig);
  }
  
  public void processClientCredentials(TlsCredentials paramTlsCredentials) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public void generateClientKeyExchange(OutputStream paramOutputStream) throws IOException {
    byte[] arrayOfByte1 = this.srpIdentity.getSRPIdentity();
    byte[] arrayOfByte2 = this.srpIdentity.getSRPPassword();
    BigInteger bigInteger = this.srpClient.generateClientCredentials(this.srpSalt, arrayOfByte1, arrayOfByte2);
    TlsSRPUtils.writeSRPParameter(bigInteger, paramOutputStream);
    (this.context.getSecurityParametersHandshake()).srpIdentity = Arrays.clone(arrayOfByte1);
  }
  
  public void processClientKeyExchange(InputStream paramInputStream) throws IOException {
    this.srpPeerCredentials = validatePublicValue(this.srpLoginParameters.getConfig().getExplicitNG()[0], TlsSRPUtils.readSRPParameter(paramInputStream));
    (this.context.getSecurityParametersHandshake()).srpIdentity = Arrays.clone(this.srpLoginParameters.getIdentity());
  }
  
  public TlsSecret generatePreMasterSecret() throws IOException {
    BigInteger bigInteger = (this.srpServer != null) ? this.srpServer.calculateSecret(this.srpPeerCredentials) : this.srpClient.calculateSecret(this.srpPeerCredentials);
    return this.context.getCrypto().createSecret(BigIntegers.asUnsignedByteArray(bigInteger));
  }
  
  protected static BigInteger validatePublicValue(BigInteger paramBigInteger1, BigInteger paramBigInteger2) throws IOException {
    paramBigInteger2 = paramBigInteger2.mod(paramBigInteger1);
    if (paramBigInteger2.equals(BigInteger.ZERO))
      throw new TlsFatalAlert((short)47); 
    return paramBigInteger2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsSRPKeyExchange.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */