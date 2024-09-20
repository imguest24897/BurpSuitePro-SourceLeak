package org.bouncycastle.pqc.jcajce.provider;

import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyFactorySpi;

public class SPHINCSPlus {
  private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.sphincsplus.";
  
  public static class Mappings extends AsymmetricAlgorithmProvider {
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("KeyFactory.SPHINCSPLUS", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyFactorySpi");
      param1ConfigurableProvider.addAlgorithm("KeyPairGenerator.SPHINCSPLUS", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.KeyFactory.SPHINCS+", "SPHINCSPLUS");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.SPHINCS+", "SPHINCSPLUS");
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "SPHINCS+-SHA2-128S", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Sha2_128s", BCObjectIdentifiers.sphincsPlus_sha2_128s);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "SPHINCS+-SHA2-128F", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Sha2_128f", BCObjectIdentifiers.sphincsPlus_sha2_128f);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "SPHINCS+-SHA2-192S", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Sha2_192s", BCObjectIdentifiers.sphincsPlus_sha2_192s);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "SPHINCS+-SHA2-192F", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Sha2_192f", BCObjectIdentifiers.sphincsPlus_sha2_192f);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "SPHINCS+-SHA2-256S", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Sha2_256s", BCObjectIdentifiers.sphincsPlus_sha2_256s);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "SPHINCS+-SHA2-256F", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Sha2_256f", BCObjectIdentifiers.sphincsPlus_sha2_256f);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "SPHINCS+-SHAKE-128S", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Shake_128s", BCObjectIdentifiers.sphincsPlus_shake_128s);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "SPHINCS+-SHAKE-128F", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Shake_128f", BCObjectIdentifiers.sphincsPlus_shake_128f);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "SPHINCS+-SHAKE-192S", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Shake_192s", BCObjectIdentifiers.sphincsPlus_shake_192s);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "SPHINCS+-SHAKE-192F", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Shake_192f", BCObjectIdentifiers.sphincsPlus_shake_192f);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "SPHINCS+-SHAKE-256S", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Shake_256s", BCObjectIdentifiers.sphincsPlus_shake_256s);
      addKeyPairGeneratorAlgorithm(param1ConfigurableProvider, "SPHINCS+-SHAKE-256F", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi$Shake_256f", BCObjectIdentifiers.sphincsPlus_shake_256f);
      addSignatureAlgorithm(param1ConfigurableProvider, "SPHINCSPLUS", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SignatureSpi$Direct", BCObjectIdentifiers.sphincsPlus);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_sha2_128s_r3);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_sha2_128f_r3);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_shake_128s_r3);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_shake_128f_r3);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_haraka_128s_r3);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_haraka_128f_r3);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_sha2_192s_r3);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_sha2_192f_r3);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_shake_192s_r3);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_shake_192f_r3);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_haraka_192s_r3);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_haraka_192f_r3);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_sha2_256s_r3);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_sha2_256f_r3);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_shake_256s_r3);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_shake_256f_r3);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_haraka_256s_r3);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_haraka_256f_r3);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_sha2_128s_r3_simple);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_sha2_128f_r3_simple);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_shake_128s_r3_simple);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_shake_128f_r3_simple);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_haraka_128s_r3_simple);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_haraka_128f_r3_simple);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_sha2_192s_r3_simple);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_sha2_192f_r3_simple);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_shake_192s_r3_simple);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_shake_192f_r3_simple);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_haraka_192s_r3_simple);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_haraka_192f_r3_simple);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_sha2_256s_r3_simple);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_sha2_256f_r3_simple);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_shake_256s_r3_simple);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_shake_256f_r3_simple);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_haraka_256s_r3_simple);
      addSignatureAlias(param1ConfigurableProvider, "SPHINCSPLUS", BCObjectIdentifiers.sphincsPlus_haraka_256f_r3_simple);
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.Signature.SPHINCS+", "SPHINCSPLUS");
      SPHINCSPlusKeyFactorySpi sPHINCSPlusKeyFactorySpi = new SPHINCSPlusKeyFactorySpi();
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_sha2_128s_r3, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_sha2_128f_r3, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_shake_128s_r3, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_shake_128f_r3, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_haraka_128s_r3, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_haraka_128f_r3, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_sha2_192s_r3, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_sha2_192f_r3, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_shake_192s_r3, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_shake_192f_r3, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_haraka_192s_r3, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_haraka_192f_r3, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_sha2_256s_r3, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_sha2_256f_r3, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_shake_256s_r3, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_shake_256f_r3, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_haraka_256s_r3, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_haraka_256f_r3, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_sha2_128s_r3_simple, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_sha2_128f_r3_simple, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_shake_128s_r3_simple, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_shake_128f_r3_simple, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_haraka_128s_r3_simple, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_haraka_128f_r3_simple, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_sha2_192s_r3_simple, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_sha2_192f_r3_simple, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_shake_192s_r3_simple, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_shake_192f_r3_simple, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_haraka_192s_r3_simple, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_haraka_192f_r3_simple, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_sha2_256s_r3_simple, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_sha2_256f_r3_simple, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_shake_256s_r3_simple, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_shake_256f_r3_simple, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_haraka_256s_r3_simple, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
      registerKeyFactoryOid(param1ConfigurableProvider, BCObjectIdentifiers.sphincsPlus_haraka_256f_r3_simple, "SPHINCSPLUS", (AsymmetricKeyInfoConverter)sPHINCSPlusKeyFactorySpi);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\SPHINCSPlus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */