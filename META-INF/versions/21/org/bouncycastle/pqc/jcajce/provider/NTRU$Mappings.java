package META-INF.versions.21.org.bouncycastle.pqc.jcajce.provider;

import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.jcajce.provider.NTRU;
import org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyFactorySpi;

public class Mappings extends AsymmetricAlgorithmProvider {
  public void configure(ConfigurableProvider paramConfigurableProvider) {
    paramConfigurableProvider.addAlgorithm("KeyFactory.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyFactorySpi");
    paramConfigurableProvider.addAlgorithm("KeyPairGenerator.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyPairGeneratorSpi");
    paramConfigurableProvider.addAlgorithm("KeyGenerator.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyGeneratorSpi");
    NTRUKeyFactorySpi nTRUKeyFactorySpi = new NTRUKeyFactorySpi();
    paramConfigurableProvider.addAlgorithm("Cipher.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUCipherSpi$Base");
    paramConfigurableProvider.addAlgorithm("Alg.Alias.Cipher." + String.valueOf(BCObjectIdentifiers.pqc_kem_ntru), "NTRU");
    registerOid(paramConfigurableProvider, BCObjectIdentifiers.ntruhps2048509, "NTRU", (AsymmetricKeyInfoConverter)nTRUKeyFactorySpi);
    registerOid(paramConfigurableProvider, BCObjectIdentifiers.ntruhps2048677, "NTRU", (AsymmetricKeyInfoConverter)nTRUKeyFactorySpi);
    registerOid(paramConfigurableProvider, BCObjectIdentifiers.ntruhps4096821, "NTRU", (AsymmetricKeyInfoConverter)nTRUKeyFactorySpi);
    registerOid(paramConfigurableProvider, BCObjectIdentifiers.ntruhps40961229, "NTRU", (AsymmetricKeyInfoConverter)nTRUKeyFactorySpi);
    registerOid(paramConfigurableProvider, BCObjectIdentifiers.ntruhrss701, "NTRU", (AsymmetricKeyInfoConverter)nTRUKeyFactorySpi);
    registerOid(paramConfigurableProvider, BCObjectIdentifiers.ntruhrss1373, "NTRU", (AsymmetricKeyInfoConverter)nTRUKeyFactorySpi);
    paramConfigurableProvider.addAlgorithm("Kem.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKEMSpi");
    paramConfigurableProvider.addAlgorithm("Alg.Alias.Kem." + String.valueOf(BCObjectIdentifiers.pqc_kem_ntru), "NTRU");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\21\org\bouncycastle\pqc\jcajce\provider\NTRU$Mappings.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */