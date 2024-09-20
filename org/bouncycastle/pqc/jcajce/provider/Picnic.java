package org.bouncycastle.pqc.jcajce.provider;

import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.jcajce.provider.picnic.PicnicKeyFactorySpi;

public class Picnic {
  private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.picnic.";
  
  public static class Mappings extends AsymmetricAlgorithmProvider {
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("KeyFactory.PICNIC", "org.bouncycastle.pqc.jcajce.provider.picnic.PicnicKeyFactorySpi");
      param1ConfigurableProvider.addAlgorithm("KeyPairGenerator.PICNIC", "org.bouncycastle.pqc.jcajce.provider.picnic.PicnicKeyPairGeneratorSpi");
      addSignatureAlgorithm(param1ConfigurableProvider, "PICNIC", "org.bouncycastle.pqc.jcajce.provider.picnic.SignatureSpi$Base", BCObjectIdentifiers.picnic_signature);
      addSignatureAlgorithm(param1ConfigurableProvider, "SHAKE256", "PICNIC", "org.bouncycastle.pqc.jcajce.provider.picnic.SignatureSpi$withShake256", BCObjectIdentifiers.picnic_with_shake256);
      addSignatureAlgorithm(param1ConfigurableProvider, "SHA512", "PICNIC", "org.bouncycastle.pqc.jcajce.provider.picnic.SignatureSpi$withSha512", BCObjectIdentifiers.picnic_with_sha512);
      addSignatureAlgorithm(param1ConfigurableProvider, "SHA3-512", "PICNIC", "org.bouncycastle.pqc.jcajce.provider.picnic.SignatureSpi$withSha3512", BCObjectIdentifiers.picnic_with_sha3_512);
      PicnicKeyFactorySpi picnicKeyFactorySpi = new PicnicKeyFactorySpi();
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.picnic_key, "Picnic", (AsymmetricKeyInfoConverter)picnicKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.picnicl1fs, "Picnic", (AsymmetricKeyInfoConverter)picnicKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.picnicl1ur, "Picnic", (AsymmetricKeyInfoConverter)picnicKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.picnicl3fs, "Picnic", (AsymmetricKeyInfoConverter)picnicKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.picnicl3ur, "Picnic", (AsymmetricKeyInfoConverter)picnicKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.picnicl5fs, "Picnic", (AsymmetricKeyInfoConverter)picnicKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.picnicl5ur, "Picnic", (AsymmetricKeyInfoConverter)picnicKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.picnic3l1, "Picnic", (AsymmetricKeyInfoConverter)picnicKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.picnic3l3, "Picnic", (AsymmetricKeyInfoConverter)picnicKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.picnic3l5, "Picnic", (AsymmetricKeyInfoConverter)picnicKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.picnicl1full, "Picnic", (AsymmetricKeyInfoConverter)picnicKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.picnicl3full, "Picnic", (AsymmetricKeyInfoConverter)picnicKeyFactorySpi);
      registerOid(param1ConfigurableProvider, BCObjectIdentifiers.picnicl5full, "Picnic", (AsymmetricKeyInfoConverter)picnicKeyFactorySpi);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\Picnic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */