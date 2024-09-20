package org.bouncycastle.tls;

import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.tls.crypto.TlsCrypto;

public class SRPTlsClient extends AbstractTlsClient {
  private static final int[] DEFAULT_CIPHER_SUITES = new int[] { 49182 };
  
  protected TlsSRPIdentity srpIdentity;
  
  public SRPTlsClient(TlsCrypto paramTlsCrypto, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this(paramTlsCrypto, new BasicTlsSRPIdentity(paramArrayOfbyte1, paramArrayOfbyte2));
  }
  
  public SRPTlsClient(TlsCrypto paramTlsCrypto, TlsSRPIdentity paramTlsSRPIdentity) {
    super(paramTlsCrypto);
    this.srpIdentity = paramTlsSRPIdentity;
  }
  
  protected int[] getSupportedCipherSuites() {
    return TlsUtils.getSupportedCipherSuites(getCrypto(), DEFAULT_CIPHER_SUITES);
  }
  
  protected ProtocolVersion[] getSupportedVersions() {
    return ProtocolVersion.TLSv12.only();
  }
  
  protected boolean requireSRPServerExtension() {
    return false;
  }
  
  public Hashtable getClientExtensions() throws IOException {
    Hashtable hashtable = TlsExtensionsUtils.ensureExtensionsInitialised(super.getClientExtensions());
    TlsSRPUtils.addSRPExtension(hashtable, this.srpIdentity.getSRPIdentity());
    return hashtable;
  }
  
  public void processServerExtensions(Hashtable paramHashtable) throws IOException {
    if (!TlsUtils.hasExpectedEmptyExtensionData(paramHashtable, TlsSRPUtils.EXT_SRP, (short)47) && requireSRPServerExtension())
      throw new TlsFatalAlert((short)47); 
    super.processServerExtensions(paramHashtable);
  }
  
  public TlsSRPIdentity getSRPIdentity() {
    return this.srpIdentity;
  }
  
  public TlsAuthentication getAuthentication() throws IOException {
    throw new TlsFatalAlert((short)80);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\SRPTlsClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */