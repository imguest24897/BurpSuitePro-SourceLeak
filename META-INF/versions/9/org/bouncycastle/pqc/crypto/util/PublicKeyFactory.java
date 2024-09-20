package META-INF.versions.9.org.bouncycastle.pqc.crypto.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.internal.asn1.isara.IsaraObjectIdentifiers;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;

public class PublicKeyFactory {
  private static Map converters = new HashMap<>();
  
  public static AsymmetricKeyParameter createKey(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("keyInfoData array null"); 
    if (paramArrayOfbyte.length == 0)
      throw new IllegalArgumentException("keyInfoData array empty"); 
    return createKey(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(paramArrayOfbyte)));
  }
  
  public static AsymmetricKeyParameter createKey(InputStream paramInputStream) throws IOException {
    return createKey(SubjectPublicKeyInfo.getInstance((new ASN1InputStream(paramInputStream)).readObject()));
  }
  
  public static AsymmetricKeyParameter createKey(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) throws IOException {
    if (paramSubjectPublicKeyInfo == null)
      throw new IllegalArgumentException("keyInfo argument null"); 
    return createKey(paramSubjectPublicKeyInfo, null);
  }
  
  public static AsymmetricKeyParameter createKey(SubjectPublicKeyInfo paramSubjectPublicKeyInfo, Object paramObject) throws IOException {
    if (paramSubjectPublicKeyInfo == null)
      throw new IllegalArgumentException("keyInfo argument null"); 
    AlgorithmIdentifier algorithmIdentifier = paramSubjectPublicKeyInfo.getAlgorithm();
    SubjectPublicKeyInfoConverter subjectPublicKeyInfoConverter = (SubjectPublicKeyInfoConverter)converters.get(algorithmIdentifier.getAlgorithm());
    if (subjectPublicKeyInfoConverter != null)
      return subjectPublicKeyInfoConverter.getPublicKeyParameters(paramSubjectPublicKeyInfo, paramObject); 
    throw new IOException("algorithm identifier in public key not recognised: " + algorithmIdentifier.getAlgorithm());
  }
  
  static {
    converters.put(PQCObjectIdentifiers.qTESLA_p_I, new QTeslaConverter(null));
    converters.put(PQCObjectIdentifiers.qTESLA_p_III, new QTeslaConverter(null));
    converters.put(PQCObjectIdentifiers.sphincs256, new SPHINCSConverter(null));
    converters.put(PQCObjectIdentifiers.newHope, new NHConverter(null));
    converters.put(PQCObjectIdentifiers.xmss, new XMSSConverter(null));
    converters.put(PQCObjectIdentifiers.xmss_mt, new XMSSMTConverter(null));
    converters.put(IsaraObjectIdentifiers.id_alg_xmss, new XMSSConverter(null));
    converters.put(IsaraObjectIdentifiers.id_alg_xmssmt, new XMSSMTConverter(null));
    converters.put(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig, new LMSConverter(null));
    converters.put(PQCObjectIdentifiers.mcElieceCca2, new McElieceCCA2Converter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_128s_r3, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_128f_r3, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_128s_r3, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_128f_r3, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_128s_r3, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_128f_r3, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_192s_r3, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_192f_r3, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_192s_r3, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_192f_r3, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_192s_r3, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_192f_r3, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_256s_r3, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_256f_r3, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_256s_r3, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_256f_r3, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_256s_r3, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_256f_r3, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_128s_r3_simple, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_128f_r3_simple, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_128s_r3_simple, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_128f_r3_simple, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_128s_r3_simple, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_128f_r3_simple, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_192s_r3_simple, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_192f_r3_simple, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_192s_r3_simple, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_192f_r3_simple, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_192s_r3_simple, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_192f_r3_simple, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_256s_r3_simple, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_256f_r3_simple, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_256s_r3_simple, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_256f_r3_simple, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_256s_r3_simple, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_256f_r3_simple, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_128s, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_128f, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_128s, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_128f, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_192s, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_192f, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_192s, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_192f, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_256s, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_256f, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_256s, new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_256f, new SPHINCSPlusConverter(null));
    converters.put(new ASN1ObjectIdentifier("1.3.9999.6.4.10"), new SPHINCSPlusConverter(null));
    converters.put(BCObjectIdentifiers.mceliece348864_r3, new CMCEConverter(null));
    converters.put(BCObjectIdentifiers.mceliece348864f_r3, new CMCEConverter(null));
    converters.put(BCObjectIdentifiers.mceliece460896_r3, new CMCEConverter(null));
    converters.put(BCObjectIdentifiers.mceliece460896f_r3, new CMCEConverter(null));
    converters.put(BCObjectIdentifiers.mceliece6688128_r3, new CMCEConverter(null));
    converters.put(BCObjectIdentifiers.mceliece6688128f_r3, new CMCEConverter(null));
    converters.put(BCObjectIdentifiers.mceliece6960119_r3, new CMCEConverter(null));
    converters.put(BCObjectIdentifiers.mceliece6960119f_r3, new CMCEConverter(null));
    converters.put(BCObjectIdentifiers.mceliece8192128_r3, new CMCEConverter(null));
    converters.put(BCObjectIdentifiers.mceliece8192128f_r3, new CMCEConverter(null));
    converters.put(BCObjectIdentifiers.frodokem640aes, new FrodoConverter(null));
    converters.put(BCObjectIdentifiers.frodokem640shake, new FrodoConverter(null));
    converters.put(BCObjectIdentifiers.frodokem976aes, new FrodoConverter(null));
    converters.put(BCObjectIdentifiers.frodokem976shake, new FrodoConverter(null));
    converters.put(BCObjectIdentifiers.frodokem1344aes, new FrodoConverter(null));
    converters.put(BCObjectIdentifiers.frodokem1344shake, new FrodoConverter(null));
    converters.put(BCObjectIdentifiers.lightsaberkem128r3, new SABERConverter(null));
    converters.put(BCObjectIdentifiers.saberkem128r3, new SABERConverter(null));
    converters.put(BCObjectIdentifiers.firesaberkem128r3, new SABERConverter(null));
    converters.put(BCObjectIdentifiers.lightsaberkem192r3, new SABERConverter(null));
    converters.put(BCObjectIdentifiers.saberkem192r3, new SABERConverter(null));
    converters.put(BCObjectIdentifiers.firesaberkem192r3, new SABERConverter(null));
    converters.put(BCObjectIdentifiers.lightsaberkem256r3, new SABERConverter(null));
    converters.put(BCObjectIdentifiers.saberkem256r3, new SABERConverter(null));
    converters.put(BCObjectIdentifiers.firesaberkem256r3, new SABERConverter(null));
    converters.put(BCObjectIdentifiers.ulightsaberkemr3, new SABERConverter(null));
    converters.put(BCObjectIdentifiers.usaberkemr3, new SABERConverter(null));
    converters.put(BCObjectIdentifiers.ufiresaberkemr3, new SABERConverter(null));
    converters.put(BCObjectIdentifiers.lightsaberkem90sr3, new SABERConverter(null));
    converters.put(BCObjectIdentifiers.saberkem90sr3, new SABERConverter(null));
    converters.put(BCObjectIdentifiers.firesaberkem90sr3, new SABERConverter(null));
    converters.put(BCObjectIdentifiers.ulightsaberkem90sr3, new SABERConverter(null));
    converters.put(BCObjectIdentifiers.usaberkem90sr3, new SABERConverter(null));
    converters.put(BCObjectIdentifiers.ufiresaberkem90sr3, new SABERConverter(null));
    converters.put(BCObjectIdentifiers.picnicl1fs, new PicnicConverter(null));
    converters.put(BCObjectIdentifiers.picnicl1ur, new PicnicConverter(null));
    converters.put(BCObjectIdentifiers.picnicl3fs, new PicnicConverter(null));
    converters.put(BCObjectIdentifiers.picnicl3ur, new PicnicConverter(null));
    converters.put(BCObjectIdentifiers.picnicl5fs, new PicnicConverter(null));
    converters.put(BCObjectIdentifiers.picnicl5ur, new PicnicConverter(null));
    converters.put(BCObjectIdentifiers.picnic3l1, new PicnicConverter(null));
    converters.put(BCObjectIdentifiers.picnic3l3, new PicnicConverter(null));
    converters.put(BCObjectIdentifiers.picnic3l5, new PicnicConverter(null));
    converters.put(BCObjectIdentifiers.picnicl1full, new PicnicConverter(null));
    converters.put(BCObjectIdentifiers.picnicl3full, new PicnicConverter(null));
    converters.put(BCObjectIdentifiers.picnicl5full, new PicnicConverter(null));
    converters.put(BCObjectIdentifiers.ntruhps2048509, new NtruConverter(null));
    converters.put(BCObjectIdentifiers.ntruhps2048677, new NtruConverter(null));
    converters.put(BCObjectIdentifiers.ntruhps4096821, new NtruConverter(null));
    converters.put(BCObjectIdentifiers.ntruhps40961229, new NtruConverter(null));
    converters.put(BCObjectIdentifiers.ntruhrss701, new NtruConverter(null));
    converters.put(BCObjectIdentifiers.ntruhrss1373, new NtruConverter(null));
    converters.put(BCObjectIdentifiers.falcon_512, new FalconConverter(null));
    converters.put(BCObjectIdentifiers.falcon_1024, new FalconConverter(null));
    converters.put(BCObjectIdentifiers.kyber512, new KyberConverter(null));
    converters.put(BCObjectIdentifiers.kyber768, new KyberConverter(null));
    converters.put(BCObjectIdentifiers.kyber1024, new KyberConverter(null));
    converters.put(BCObjectIdentifiers.kyber512_aes, new KyberConverter(null));
    converters.put(BCObjectIdentifiers.kyber768_aes, new KyberConverter(null));
    converters.put(BCObjectIdentifiers.kyber1024_aes, new KyberConverter(null));
    converters.put(BCObjectIdentifiers.ntrulpr653, new NTRULPrimeConverter(null));
    converters.put(BCObjectIdentifiers.ntrulpr761, new NTRULPrimeConverter(null));
    converters.put(BCObjectIdentifiers.ntrulpr857, new NTRULPrimeConverter(null));
    converters.put(BCObjectIdentifiers.ntrulpr953, new NTRULPrimeConverter(null));
    converters.put(BCObjectIdentifiers.ntrulpr1013, new NTRULPrimeConverter(null));
    converters.put(BCObjectIdentifiers.ntrulpr1277, new NTRULPrimeConverter(null));
    converters.put(BCObjectIdentifiers.sntrup653, new SNTRUPrimeConverter(null));
    converters.put(BCObjectIdentifiers.sntrup761, new SNTRUPrimeConverter(null));
    converters.put(BCObjectIdentifiers.sntrup857, new SNTRUPrimeConverter(null));
    converters.put(BCObjectIdentifiers.sntrup953, new SNTRUPrimeConverter(null));
    converters.put(BCObjectIdentifiers.sntrup1013, new SNTRUPrimeConverter(null));
    converters.put(BCObjectIdentifiers.sntrup1277, new SNTRUPrimeConverter(null));
    converters.put(BCObjectIdentifiers.dilithium2, new DilithiumConverter());
    converters.put(BCObjectIdentifiers.dilithium3, new DilithiumConverter());
    converters.put(BCObjectIdentifiers.dilithium5, new DilithiumConverter());
    converters.put(BCObjectIdentifiers.dilithium2_aes, new DilithiumConverter());
    converters.put(BCObjectIdentifiers.dilithium3_aes, new DilithiumConverter());
    converters.put(BCObjectIdentifiers.dilithium5_aes, new DilithiumConverter());
    converters.put(BCObjectIdentifiers.bike128, new BIKEConverter(null));
    converters.put(BCObjectIdentifiers.bike192, new BIKEConverter(null));
    converters.put(BCObjectIdentifiers.bike256, new BIKEConverter(null));
    converters.put(BCObjectIdentifiers.hqc128, new HQCConverter(null));
    converters.put(BCObjectIdentifiers.hqc192, new HQCConverter(null));
    converters.put(BCObjectIdentifiers.hqc256, new HQCConverter(null));
    converters.put(BCObjectIdentifiers.rainbow_III_classic, new RainbowConverter(null));
    converters.put(BCObjectIdentifiers.rainbow_III_circumzenithal, new RainbowConverter(null));
    converters.put(BCObjectIdentifiers.rainbow_III_compressed, new RainbowConverter(null));
    converters.put(BCObjectIdentifiers.rainbow_V_classic, new RainbowConverter(null));
    converters.put(BCObjectIdentifiers.rainbow_V_circumzenithal, new RainbowConverter(null));
    converters.put(BCObjectIdentifiers.rainbow_V_compressed, new RainbowConverter(null));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypt\\util\PublicKeyFactory.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */