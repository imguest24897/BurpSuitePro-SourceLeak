package org.bouncycastle.pqc.crypto.util;

import java.io.IOException;
import java.security.SecureRandom;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.util.DEROtherInfo;
import org.bouncycastle.pqc.crypto.KEMParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKEMExtractor;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKEMGenerator;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKeyPairGenerator;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUKEMExtractor;
import org.bouncycastle.pqc.crypto.ntru.NTRUKEMGenerator;
import org.bouncycastle.pqc.crypto.ntru.NTRUKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUKeyPairGenerator;
import org.bouncycastle.pqc.crypto.ntru.NTRUParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUPrivateKeyParameters;

public class PQCOtherInfoGenerator {
  protected final DEROtherInfo.Builder otherInfoBuilder;
  
  protected final SecureRandom random;
  
  protected boolean used = false;
  
  public PQCOtherInfoGenerator(AlgorithmIdentifier paramAlgorithmIdentifier, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, SecureRandom paramSecureRandom) {
    this.otherInfoBuilder = new DEROtherInfo.Builder(paramAlgorithmIdentifier, paramArrayOfbyte1, paramArrayOfbyte2);
    this.random = paramSecureRandom;
  }
  
  private static byte[] getEncoded(AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    try {
      return SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(paramAsymmetricKeyParameter).getEncoded();
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  private static AsymmetricKeyParameter getPublicKey(byte[] paramArrayOfbyte) throws IOException {
    return PublicKeyFactory.createKey(paramArrayOfbyte);
  }
  
  public static class PartyU extends PQCOtherInfoGenerator {
    private AsymmetricCipherKeyPair aKp;
    
    private EncapsulatedSecretExtractor encSE;
    
    public PartyU(KEMParameters param1KEMParameters, AlgorithmIdentifier param1AlgorithmIdentifier, byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2, SecureRandom param1SecureRandom) {
      super(param1AlgorithmIdentifier, param1ArrayOfbyte1, param1ArrayOfbyte2, param1SecureRandom);
      if (param1KEMParameters instanceof KyberParameters) {
        KyberKeyPairGenerator kyberKeyPairGenerator = new KyberKeyPairGenerator();
        kyberKeyPairGenerator.init((KeyGenerationParameters)new KyberKeyGenerationParameters(param1SecureRandom, (KyberParameters)param1KEMParameters));
        this.aKp = kyberKeyPairGenerator.generateKeyPair();
        this.encSE = (EncapsulatedSecretExtractor)new KyberKEMExtractor((KyberPrivateKeyParameters)this.aKp.getPrivate());
      } else if (param1KEMParameters instanceof NTRUParameters) {
        NTRUKeyPairGenerator nTRUKeyPairGenerator = new NTRUKeyPairGenerator();
        nTRUKeyPairGenerator.init((KeyGenerationParameters)new NTRUKeyGenerationParameters(param1SecureRandom, (NTRUParameters)param1KEMParameters));
        this.aKp = nTRUKeyPairGenerator.generateKeyPair();
        this.encSE = (EncapsulatedSecretExtractor)new NTRUKEMExtractor((NTRUPrivateKeyParameters)this.aKp.getPrivate());
      } else {
        throw new IllegalArgumentException("unknown KEMParameters");
      } 
    }
    
    public PQCOtherInfoGenerator withSuppPubInfo(byte[] param1ArrayOfbyte) {
      this.otherInfoBuilder.withSuppPubInfo(param1ArrayOfbyte);
      return this;
    }
    
    public byte[] getSuppPrivInfoPartA() {
      return PQCOtherInfoGenerator.getEncoded(this.aKp.getPublic());
    }
    
    public DEROtherInfo generate(byte[] param1ArrayOfbyte) {
      this.otherInfoBuilder.withSuppPrivInfo(this.encSE.extractSecret(param1ArrayOfbyte));
      return this.otherInfoBuilder.build();
    }
  }
  
  public static class PartyV extends PQCOtherInfoGenerator {
    private EncapsulatedSecretGenerator encSG;
    
    public PartyV(KEMParameters param1KEMParameters, AlgorithmIdentifier param1AlgorithmIdentifier, byte[] param1ArrayOfbyte1, byte[] param1ArrayOfbyte2, SecureRandom param1SecureRandom) {
      super(param1AlgorithmIdentifier, param1ArrayOfbyte1, param1ArrayOfbyte2, param1SecureRandom);
      if (param1KEMParameters instanceof KyberParameters) {
        this.encSG = (EncapsulatedSecretGenerator)new KyberKEMGenerator(param1SecureRandom);
      } else if (param1KEMParameters instanceof NTRUParameters) {
        this.encSG = (EncapsulatedSecretGenerator)new NTRUKEMGenerator(param1SecureRandom);
      } else {
        throw new IllegalArgumentException("unknown KEMParameters");
      } 
    }
    
    public PQCOtherInfoGenerator withSuppPubInfo(byte[] param1ArrayOfbyte) {
      this.otherInfoBuilder.withSuppPubInfo(param1ArrayOfbyte);
      return this;
    }
    
    public byte[] getSuppPrivInfoPartB(byte[] param1ArrayOfbyte) {
      this.used = false;
      try {
        SecretWithEncapsulation secretWithEncapsulation = this.encSG.generateEncapsulated(PQCOtherInfoGenerator.getPublicKey(param1ArrayOfbyte));
        this.otherInfoBuilder.withSuppPrivInfo(secretWithEncapsulation.getSecret());
        return secretWithEncapsulation.getEncapsulation();
      } catch (IOException iOException) {
        throw new IllegalArgumentException("cannot decode public key");
      } 
    }
    
    public DEROtherInfo generate() {
      if (this.used)
        throw new IllegalStateException("builder already used"); 
      this.used = true;
      return this.otherInfoBuilder.build();
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypt\\util\PQCOtherInfoGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */