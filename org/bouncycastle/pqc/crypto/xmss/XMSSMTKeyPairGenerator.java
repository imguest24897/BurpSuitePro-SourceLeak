package org.bouncycastle.pqc.crypto.xmss;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;

public final class XMSSMTKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private XMSSMTParameters params;
  
  private XMSSParameters xmssParams;
  
  private SecureRandom prng;
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    XMSSMTKeyGenerationParameters xMSSMTKeyGenerationParameters = (XMSSMTKeyGenerationParameters)paramKeyGenerationParameters;
    this.prng = xMSSMTKeyGenerationParameters.getRandom();
    this.params = xMSSMTKeyGenerationParameters.getParameters();
    this.xmssParams = this.params.getXMSSParameters();
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters = generatePrivateKey((new XMSSMTPrivateKeyParameters.Builder(this.params)).build().getBDSState());
    this.xmssParams.getWOTSPlus().importKeys(new byte[this.params.getTreeDigestSize()], xMSSMTPrivateKeyParameters.getPublicSeed());
    int i = this.params.getLayers() - 1;
    OTSHashAddress oTSHashAddress = (OTSHashAddress)(new OTSHashAddress.Builder()).withLayerAddress(i).build();
    BDS bDS = new BDS(this.xmssParams, xMSSMTPrivateKeyParameters.getPublicSeed(), xMSSMTPrivateKeyParameters.getSecretKeySeed(), oTSHashAddress);
    XMSSNode xMSSNode = bDS.getRoot();
    xMSSMTPrivateKeyParameters.getBDSState().put(i, bDS);
    xMSSMTPrivateKeyParameters = (new XMSSMTPrivateKeyParameters.Builder(this.params)).withSecretKeySeed(xMSSMTPrivateKeyParameters.getSecretKeySeed()).withSecretKeyPRF(xMSSMTPrivateKeyParameters.getSecretKeyPRF()).withPublicSeed(xMSSMTPrivateKeyParameters.getPublicSeed()).withRoot(xMSSNode.getValue()).withBDSState(xMSSMTPrivateKeyParameters.getBDSState()).build();
    XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters = (new XMSSMTPublicKeyParameters.Builder(this.params)).withRoot(xMSSNode.getValue()).withPublicSeed(xMSSMTPrivateKeyParameters.getPublicSeed()).build();
    return new AsymmetricCipherKeyPair(xMSSMTPublicKeyParameters, xMSSMTPrivateKeyParameters);
  }
  
  private XMSSMTPrivateKeyParameters generatePrivateKey(BDSStateMap paramBDSStateMap) {
    int i = this.params.getTreeDigestSize();
    byte[] arrayOfByte1 = new byte[i];
    this.prng.nextBytes(arrayOfByte1);
    byte[] arrayOfByte2 = new byte[i];
    this.prng.nextBytes(arrayOfByte2);
    byte[] arrayOfByte3 = new byte[i];
    this.prng.nextBytes(arrayOfByte3);
    null = null;
    return (new XMSSMTPrivateKeyParameters.Builder(this.params)).withSecretKeySeed(arrayOfByte1).withSecretKeyPRF(arrayOfByte2).withPublicSeed(arrayOfByte3).withBDSState(paramBDSStateMap).build();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\xmss\XMSSMTKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */