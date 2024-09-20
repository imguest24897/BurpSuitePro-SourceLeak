package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.digests.ParallelHash;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.digests.TupleHash;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.KMAC;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

public class SHA3 {
  public static class Digest224 extends DigestSHA3 {
    public Digest224() {
      super(224);
    }
  }
  
  public static class Digest256 extends DigestSHA3 {
    public Digest256() {
      super(256);
    }
  }
  
  public static class Digest384 extends DigestSHA3 {
    public Digest384() {
      super(384);
    }
  }
  
  public static class Digest512 extends DigestSHA3 {
    public Digest512() {
      super(512);
    }
  }
  
  public static class DigestParallelHash extends BCMessageDigest implements Cloneable {
    public DigestParallelHash(int param1Int1, int param1Int2) {
      super((Digest)new ParallelHash(param1Int1, null, 128, param1Int2));
    }
    
    public Object clone() throws CloneNotSupportedException {
      BCMessageDigest bCMessageDigest = (BCMessageDigest)super.clone();
      bCMessageDigest.digest = (Digest)new ParallelHash((ParallelHash)this.digest);
      return bCMessageDigest;
    }
  }
  
  public static class DigestParallelHash128_256 extends DigestParallelHash {
    public DigestParallelHash128_256() {
      super(128, 256);
    }
  }
  
  public static class DigestParallelHash256_512 extends DigestParallelHash {
    public DigestParallelHash256_512() {
      super(256, 512);
    }
  }
  
  public static class DigestSHA3 extends BCMessageDigest implements Cloneable {
    public DigestSHA3(int param1Int) {
      super((Digest)new SHA3Digest(param1Int));
    }
    
    public Object clone() throws CloneNotSupportedException {
      BCMessageDigest bCMessageDigest = (BCMessageDigest)super.clone();
      bCMessageDigest.digest = (Digest)new SHA3Digest((SHA3Digest)this.digest);
      return bCMessageDigest;
    }
  }
  
  public static class DigestSHAKE extends BCMessageDigest implements Cloneable {
    public DigestSHAKE(int param1Int1, int param1Int2) {
      super((Digest)new SHAKEDigest(param1Int1));
    }
    
    public Object clone() throws CloneNotSupportedException {
      BCMessageDigest bCMessageDigest = (BCMessageDigest)super.clone();
      bCMessageDigest.digest = (Digest)new SHAKEDigest((SHAKEDigest)this.digest);
      return bCMessageDigest;
    }
  }
  
  public static class DigestShake128_256 extends DigestSHAKE {
    public DigestShake128_256() {
      super(128, 256);
    }
  }
  
  public static class DigestShake256_512 extends DigestSHAKE {
    public DigestShake256_512() {
      super(256, 512);
    }
  }
  
  public static class DigestTupleHash extends BCMessageDigest implements Cloneable {
    public DigestTupleHash(int param1Int1, int param1Int2) {
      super((Digest)new TupleHash(param1Int1, null, param1Int2));
    }
    
    public Object clone() throws CloneNotSupportedException {
      BCMessageDigest bCMessageDigest = (BCMessageDigest)super.clone();
      bCMessageDigest.digest = (Digest)new TupleHash((TupleHash)this.digest);
      return bCMessageDigest;
    }
  }
  
  public static class DigestTupleHash128_256 extends DigestTupleHash {
    public DigestTupleHash128_256() {
      super(128, 256);
    }
  }
  
  public static class DigestTupleHash256_512 extends DigestTupleHash {
    public DigestTupleHash256_512() {
      super(256, 512);
    }
  }
  
  public static class HashMac224 extends HashMacSHA3 {
    public HashMac224() {
      super(224);
    }
  }
  
  public static class HashMac256 extends HashMacSHA3 {
    public HashMac256() {
      super(256);
    }
  }
  
  public static class HashMac384 extends HashMacSHA3 {
    public HashMac384() {
      super(384);
    }
  }
  
  public static class HashMac512 extends HashMacSHA3 {
    public HashMac512() {
      super(512);
    }
  }
  
  public static class HashMacSHA3 extends BaseMac {
    public HashMacSHA3(int param1Int) {
      super((Mac)new HMac((Digest)new SHA3Digest(param1Int)));
    }
  }
  
  public static class KMac128 extends BaseMac {
    public KMac128() {
      super((Mac)new KMAC(128, new byte[0]));
    }
  }
  
  public static class KMac256 extends BaseMac {
    public KMac256() {
      super((Mac)new KMAC(256, new byte[0]));
    }
  }
  
  public static class KeyGenerator224 extends KeyGeneratorSHA3 {
    public KeyGenerator224() {
      super(224);
    }
  }
  
  public static class KeyGenerator256 extends KeyGeneratorSHA3 {
    public KeyGenerator256() {
      super(256);
    }
  }
  
  public static class KeyGenerator384 extends KeyGeneratorSHA3 {
    public KeyGenerator384() {
      super(384);
    }
  }
  
  public static class KeyGenerator512 extends KeyGeneratorSHA3 {
    public KeyGenerator512() {
      super(512);
    }
  }
  
  public static class KeyGeneratorSHA3 extends BaseKeyGenerator {
    public KeyGeneratorSHA3(int param1Int) {
      super("HMACSHA3-" + param1Int, param1Int, new CipherKeyGenerator());
    }
  }
  
  public static class Mappings extends DigestAlgorithmProvider {
    private static final String PREFIX = SHA3.class.getName();
    
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("MessageDigest.SHA3-224", PREFIX + "$Digest224");
      param1ConfigurableProvider.addAlgorithm("MessageDigest.SHA3-256", PREFIX + "$Digest256");
      param1ConfigurableProvider.addAlgorithm("MessageDigest.SHA3-384", PREFIX + "$Digest384");
      param1ConfigurableProvider.addAlgorithm("MessageDigest.SHA3-512", PREFIX + "$Digest512");
      param1ConfigurableProvider.addAlgorithm("MessageDigest", NISTObjectIdentifiers.id_sha3_224, PREFIX + "$Digest224");
      param1ConfigurableProvider.addAlgorithm("MessageDigest", NISTObjectIdentifiers.id_sha3_256, PREFIX + "$Digest256");
      param1ConfigurableProvider.addAlgorithm("MessageDigest", NISTObjectIdentifiers.id_sha3_384, PREFIX + "$Digest384");
      param1ConfigurableProvider.addAlgorithm("MessageDigest", NISTObjectIdentifiers.id_sha3_512, PREFIX + "$Digest512");
      param1ConfigurableProvider.addAlgorithm("MessageDigest.SHAKE256-512", PREFIX + "$DigestShake256_512");
      param1ConfigurableProvider.addAlgorithm("MessageDigest.SHAKE128-256", PREFIX + "$DigestShake128_256");
      param1ConfigurableProvider.addAlgorithm("MessageDigest", NISTObjectIdentifiers.id_shake256, PREFIX + "$DigestShake256_512");
      param1ConfigurableProvider.addAlgorithm("MessageDigest", NISTObjectIdentifiers.id_shake128, PREFIX + "$DigestShake128_256");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHAKE256", "SHAKE256-512");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHAKE128", "SHAKE128-256");
      addHMACAlgorithm(param1ConfigurableProvider, "SHA3-224", PREFIX + "$HashMac224", PREFIX + "$KeyGenerator224");
      addHMACAlias(param1ConfigurableProvider, "SHA3-224", NISTObjectIdentifiers.id_hmacWithSHA3_224);
      addHMACAlgorithm(param1ConfigurableProvider, "SHA3-256", PREFIX + "$HashMac256", PREFIX + "$KeyGenerator256");
      addHMACAlias(param1ConfigurableProvider, "SHA3-256", NISTObjectIdentifiers.id_hmacWithSHA3_256);
      addHMACAlgorithm(param1ConfigurableProvider, "SHA3-384", PREFIX + "$HashMac384", PREFIX + "$KeyGenerator384");
      addHMACAlias(param1ConfigurableProvider, "SHA3-384", NISTObjectIdentifiers.id_hmacWithSHA3_384);
      addHMACAlgorithm(param1ConfigurableProvider, "SHA3-512", PREFIX + "$HashMac512", PREFIX + "$KeyGenerator512");
      addHMACAlias(param1ConfigurableProvider, "SHA3-512", NISTObjectIdentifiers.id_hmacWithSHA3_512);
      addKMACAlgorithm(param1ConfigurableProvider, "128", PREFIX + "$KMac128", PREFIX + "$KeyGenerator256");
      addKMACAlgorithm(param1ConfigurableProvider, "256", PREFIX + "$KMac256", PREFIX + "$KeyGenerator512");
      param1ConfigurableProvider.addAlgorithm("MessageDigest.TUPLEHASH256-512", PREFIX + "$DigestTupleHash256_512");
      param1ConfigurableProvider.addAlgorithm("MessageDigest.TUPLEHASH128-256", PREFIX + "$DigestTupleHash128_256");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.MessageDigest.TUPLEHASH256", "TUPLEHASH256-512");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.MessageDigest.TUPLEHASH128", "TUPLEHASH128-256");
      param1ConfigurableProvider.addAlgorithm("MessageDigest.PARALLELHASH256-512", PREFIX + "$DigestParallelHash256_512");
      param1ConfigurableProvider.addAlgorithm("MessageDigest.PARALLELHASH128-256", PREFIX + "$DigestParallelHash128_256");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.MessageDigest.PARALLELHASH256", "PARALLELHASH256-512");
      param1ConfigurableProvider.addAlgorithm("Alg.Alias.MessageDigest.PARALLELHASH128", "PARALLELHASH128-256");
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\digest\SHA3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */