package org.bouncycastle.pqc.crypto.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.internal.asn1.isara.IsaraObjectIdentifiers;
import org.bouncycastle.pqc.asn1.CMCEPublicKey;
import org.bouncycastle.pqc.asn1.KyberPublicKey;
import org.bouncycastle.pqc.asn1.McElieceCCA2PublicKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.asn1.XMSSKeyParams;
import org.bouncycastle.pqc.asn1.XMSSMTKeyParams;
import org.bouncycastle.pqc.asn1.XMSSPublicKey;
import org.bouncycastle.pqc.crypto.bike.BIKEParameters;
import org.bouncycastle.pqc.crypto.bike.BIKEPublicKeyParameters;
import org.bouncycastle.pqc.crypto.cmce.CMCEParameters;
import org.bouncycastle.pqc.crypto.cmce.CMCEPublicKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPublicKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPublicKeyParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconPublicKeyParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoPublicKeyParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUPublicKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimeParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimePublicKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimePublicKeyParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicPublicKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters;
import org.bouncycastle.pqc.crypto.saber.SABERParameters;
import org.bouncycastle.pqc.crypto.saber.SABERPublicKeyParameters;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPublicKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2PublicKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.qtesla.QTESLAPublicKeyParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

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
    converters.put(PQCObjectIdentifiers.qTESLA_p_I, new QTeslaConverter());
    converters.put(PQCObjectIdentifiers.qTESLA_p_III, new QTeslaConverter());
    converters.put(PQCObjectIdentifiers.sphincs256, new SPHINCSConverter());
    converters.put(PQCObjectIdentifiers.newHope, new NHConverter());
    converters.put(PQCObjectIdentifiers.xmss, new XMSSConverter());
    converters.put(PQCObjectIdentifiers.xmss_mt, new XMSSMTConverter());
    converters.put(IsaraObjectIdentifiers.id_alg_xmss, new XMSSConverter());
    converters.put(IsaraObjectIdentifiers.id_alg_xmssmt, new XMSSMTConverter());
    converters.put(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig, new LMSConverter());
    converters.put(PQCObjectIdentifiers.mcElieceCca2, new McElieceCCA2Converter());
    converters.put(BCObjectIdentifiers.sphincsPlus, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_128s_r3, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_128f_r3, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_128s_r3, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_128f_r3, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_128s_r3, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_128f_r3, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_192s_r3, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_192f_r3, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_192s_r3, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_192f_r3, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_192s_r3, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_192f_r3, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_256s_r3, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_256f_r3, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_256s_r3, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_256f_r3, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_256s_r3, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_256f_r3, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_128s_r3_simple, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_128f_r3_simple, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_128s_r3_simple, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_128f_r3_simple, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_128s_r3_simple, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_128f_r3_simple, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_192s_r3_simple, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_192f_r3_simple, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_192s_r3_simple, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_192f_r3_simple, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_192s_r3_simple, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_192f_r3_simple, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_256s_r3_simple, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_256f_r3_simple, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_256s_r3_simple, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_256f_r3_simple, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_256s_r3_simple, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_haraka_256f_r3_simple, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_128s, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_128f, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_128s, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_128f, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_192s, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_192f, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_192s, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_192f, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_256s, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_sha2_256f, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_256s, new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.sphincsPlus_shake_256f, new SPHINCSPlusConverter());
    converters.put(new ASN1ObjectIdentifier("1.3.9999.6.4.10"), new SPHINCSPlusConverter());
    converters.put(BCObjectIdentifiers.mceliece348864_r3, new CMCEConverter());
    converters.put(BCObjectIdentifiers.mceliece348864f_r3, new CMCEConverter());
    converters.put(BCObjectIdentifiers.mceliece460896_r3, new CMCEConverter());
    converters.put(BCObjectIdentifiers.mceliece460896f_r3, new CMCEConverter());
    converters.put(BCObjectIdentifiers.mceliece6688128_r3, new CMCEConverter());
    converters.put(BCObjectIdentifiers.mceliece6688128f_r3, new CMCEConverter());
    converters.put(BCObjectIdentifiers.mceliece6960119_r3, new CMCEConverter());
    converters.put(BCObjectIdentifiers.mceliece6960119f_r3, new CMCEConverter());
    converters.put(BCObjectIdentifiers.mceliece8192128_r3, new CMCEConverter());
    converters.put(BCObjectIdentifiers.mceliece8192128f_r3, new CMCEConverter());
    converters.put(BCObjectIdentifiers.frodokem640aes, new FrodoConverter());
    converters.put(BCObjectIdentifiers.frodokem640shake, new FrodoConverter());
    converters.put(BCObjectIdentifiers.frodokem976aes, new FrodoConverter());
    converters.put(BCObjectIdentifiers.frodokem976shake, new FrodoConverter());
    converters.put(BCObjectIdentifiers.frodokem1344aes, new FrodoConverter());
    converters.put(BCObjectIdentifiers.frodokem1344shake, new FrodoConverter());
    converters.put(BCObjectIdentifiers.lightsaberkem128r3, new SABERConverter());
    converters.put(BCObjectIdentifiers.saberkem128r3, new SABERConverter());
    converters.put(BCObjectIdentifiers.firesaberkem128r3, new SABERConverter());
    converters.put(BCObjectIdentifiers.lightsaberkem192r3, new SABERConverter());
    converters.put(BCObjectIdentifiers.saberkem192r3, new SABERConverter());
    converters.put(BCObjectIdentifiers.firesaberkem192r3, new SABERConverter());
    converters.put(BCObjectIdentifiers.lightsaberkem256r3, new SABERConverter());
    converters.put(BCObjectIdentifiers.saberkem256r3, new SABERConverter());
    converters.put(BCObjectIdentifiers.firesaberkem256r3, new SABERConverter());
    converters.put(BCObjectIdentifiers.ulightsaberkemr3, new SABERConverter());
    converters.put(BCObjectIdentifiers.usaberkemr3, new SABERConverter());
    converters.put(BCObjectIdentifiers.ufiresaberkemr3, new SABERConverter());
    converters.put(BCObjectIdentifiers.lightsaberkem90sr3, new SABERConverter());
    converters.put(BCObjectIdentifiers.saberkem90sr3, new SABERConverter());
    converters.put(BCObjectIdentifiers.firesaberkem90sr3, new SABERConverter());
    converters.put(BCObjectIdentifiers.ulightsaberkem90sr3, new SABERConverter());
    converters.put(BCObjectIdentifiers.usaberkem90sr3, new SABERConverter());
    converters.put(BCObjectIdentifiers.ufiresaberkem90sr3, new SABERConverter());
    converters.put(BCObjectIdentifiers.picnicl1fs, new PicnicConverter());
    converters.put(BCObjectIdentifiers.picnicl1ur, new PicnicConverter());
    converters.put(BCObjectIdentifiers.picnicl3fs, new PicnicConverter());
    converters.put(BCObjectIdentifiers.picnicl3ur, new PicnicConverter());
    converters.put(BCObjectIdentifiers.picnicl5fs, new PicnicConverter());
    converters.put(BCObjectIdentifiers.picnicl5ur, new PicnicConverter());
    converters.put(BCObjectIdentifiers.picnic3l1, new PicnicConverter());
    converters.put(BCObjectIdentifiers.picnic3l3, new PicnicConverter());
    converters.put(BCObjectIdentifiers.picnic3l5, new PicnicConverter());
    converters.put(BCObjectIdentifiers.picnicl1full, new PicnicConverter());
    converters.put(BCObjectIdentifiers.picnicl3full, new PicnicConverter());
    converters.put(BCObjectIdentifiers.picnicl5full, new PicnicConverter());
    converters.put(BCObjectIdentifiers.ntruhps2048509, new NtruConverter());
    converters.put(BCObjectIdentifiers.ntruhps2048677, new NtruConverter());
    converters.put(BCObjectIdentifiers.ntruhps4096821, new NtruConverter());
    converters.put(BCObjectIdentifiers.ntruhps40961229, new NtruConverter());
    converters.put(BCObjectIdentifiers.ntruhrss701, new NtruConverter());
    converters.put(BCObjectIdentifiers.ntruhrss1373, new NtruConverter());
    converters.put(BCObjectIdentifiers.falcon_512, new FalconConverter());
    converters.put(BCObjectIdentifiers.falcon_1024, new FalconConverter());
    converters.put(BCObjectIdentifiers.kyber512, new KyberConverter());
    converters.put(BCObjectIdentifiers.kyber768, new KyberConverter());
    converters.put(BCObjectIdentifiers.kyber1024, new KyberConverter());
    converters.put(BCObjectIdentifiers.kyber512_aes, new KyberConverter());
    converters.put(BCObjectIdentifiers.kyber768_aes, new KyberConverter());
    converters.put(BCObjectIdentifiers.kyber1024_aes, new KyberConverter());
    converters.put(BCObjectIdentifiers.ntrulpr653, new NTRULPrimeConverter());
    converters.put(BCObjectIdentifiers.ntrulpr761, new NTRULPrimeConverter());
    converters.put(BCObjectIdentifiers.ntrulpr857, new NTRULPrimeConverter());
    converters.put(BCObjectIdentifiers.ntrulpr953, new NTRULPrimeConverter());
    converters.put(BCObjectIdentifiers.ntrulpr1013, new NTRULPrimeConverter());
    converters.put(BCObjectIdentifiers.ntrulpr1277, new NTRULPrimeConverter());
    converters.put(BCObjectIdentifiers.sntrup653, new SNTRUPrimeConverter());
    converters.put(BCObjectIdentifiers.sntrup761, new SNTRUPrimeConverter());
    converters.put(BCObjectIdentifiers.sntrup857, new SNTRUPrimeConverter());
    converters.put(BCObjectIdentifiers.sntrup953, new SNTRUPrimeConverter());
    converters.put(BCObjectIdentifiers.sntrup1013, new SNTRUPrimeConverter());
    converters.put(BCObjectIdentifiers.sntrup1277, new SNTRUPrimeConverter());
    converters.put(BCObjectIdentifiers.dilithium2, new DilithiumConverter());
    converters.put(BCObjectIdentifiers.dilithium3, new DilithiumConverter());
    converters.put(BCObjectIdentifiers.dilithium5, new DilithiumConverter());
    converters.put(BCObjectIdentifiers.dilithium2_aes, new DilithiumConverter());
    converters.put(BCObjectIdentifiers.dilithium3_aes, new DilithiumConverter());
    converters.put(BCObjectIdentifiers.dilithium5_aes, new DilithiumConverter());
    converters.put(BCObjectIdentifiers.bike128, new BIKEConverter());
    converters.put(BCObjectIdentifiers.bike192, new BIKEConverter());
    converters.put(BCObjectIdentifiers.bike256, new BIKEConverter());
    converters.put(BCObjectIdentifiers.hqc128, new HQCConverter());
    converters.put(BCObjectIdentifiers.hqc192, new HQCConverter());
    converters.put(BCObjectIdentifiers.hqc256, new HQCConverter());
    converters.put(BCObjectIdentifiers.rainbow_III_classic, new RainbowConverter());
    converters.put(BCObjectIdentifiers.rainbow_III_circumzenithal, new RainbowConverter());
    converters.put(BCObjectIdentifiers.rainbow_III_compressed, new RainbowConverter());
    converters.put(BCObjectIdentifiers.rainbow_V_classic, new RainbowConverter());
    converters.put(BCObjectIdentifiers.rainbow_V_circumzenithal, new RainbowConverter());
    converters.put(BCObjectIdentifiers.rainbow_V_compressed, new RainbowConverter());
  }
  
  private static class BIKEConverter extends SubjectPublicKeyInfoConverter {
    private BIKEConverter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      try {
        byte[] arrayOfByte = ASN1OctetString.getInstance(param1SubjectPublicKeyInfo.parsePublicKey()).getOctets();
        BIKEParameters bIKEParameters = Utils.bikeParamsLookup(param1SubjectPublicKeyInfo.getAlgorithm().getAlgorithm());
        return (AsymmetricKeyParameter)new BIKEPublicKeyParameters(bIKEParameters, arrayOfByte);
      } catch (Exception exception) {
        byte[] arrayOfByte = param1SubjectPublicKeyInfo.getPublicKeyData().getOctets();
        BIKEParameters bIKEParameters = Utils.bikeParamsLookup(param1SubjectPublicKeyInfo.getAlgorithm().getAlgorithm());
        return (AsymmetricKeyParameter)new BIKEPublicKeyParameters(bIKEParameters, arrayOfByte);
      } 
    }
  }
  
  private static class CMCEConverter extends SubjectPublicKeyInfoConverter {
    private CMCEConverter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      try {
        byte[] arrayOfByte = CMCEPublicKey.getInstance(param1SubjectPublicKeyInfo.parsePublicKey()).getT();
        CMCEParameters cMCEParameters = Utils.mcElieceParamsLookup(param1SubjectPublicKeyInfo.getAlgorithm().getAlgorithm());
        return (AsymmetricKeyParameter)new CMCEPublicKeyParameters(cMCEParameters, arrayOfByte);
      } catch (Exception exception) {
        byte[] arrayOfByte = param1SubjectPublicKeyInfo.getPublicKeyData().getOctets();
        CMCEParameters cMCEParameters = Utils.mcElieceParamsLookup(param1SubjectPublicKeyInfo.getAlgorithm().getAlgorithm());
        return (AsymmetricKeyParameter)new CMCEPublicKeyParameters(cMCEParameters, arrayOfByte);
      } 
    }
  }
  
  static class DilithiumConverter extends SubjectPublicKeyInfoConverter {
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      DilithiumParameters dilithiumParameters = Utils.dilithiumParamsLookup(param1SubjectPublicKeyInfo.getAlgorithm().getAlgorithm());
      return (AsymmetricKeyParameter)getPublicKeyParams(dilithiumParameters, param1SubjectPublicKeyInfo.getPublicKeyData());
    }
    
    static DilithiumPublicKeyParameters getPublicKeyParams(DilithiumParameters param1DilithiumParameters, ASN1BitString param1ASN1BitString) {
      try {
        ASN1Primitive aSN1Primitive = ASN1Primitive.fromByteArray(param1ASN1BitString.getOctets());
        if (aSN1Primitive instanceof ASN1Sequence) {
          ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(aSN1Primitive);
          return new DilithiumPublicKeyParameters(param1DilithiumParameters, ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets(), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets());
        } 
        byte[] arrayOfByte = ASN1OctetString.getInstance(aSN1Primitive).getOctets();
        return new DilithiumPublicKeyParameters(param1DilithiumParameters, arrayOfByte);
      } catch (Exception exception) {
        return new DilithiumPublicKeyParameters(param1DilithiumParameters, param1ASN1BitString.getOctets());
      } 
    }
  }
  
  private static class FalconConverter extends SubjectPublicKeyInfoConverter {
    private FalconConverter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      byte[] arrayOfByte = param1SubjectPublicKeyInfo.getPublicKeyData().getOctets();
      FalconParameters falconParameters = Utils.falconParamsLookup(param1SubjectPublicKeyInfo.getAlgorithm().getAlgorithm());
      return (AsymmetricKeyParameter)new FalconPublicKeyParameters(falconParameters, Arrays.copyOfRange(arrayOfByte, 1, arrayOfByte.length));
    }
  }
  
  private static class FrodoConverter extends SubjectPublicKeyInfoConverter {
    private FrodoConverter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      byte[] arrayOfByte = ASN1OctetString.getInstance(param1SubjectPublicKeyInfo.parsePublicKey()).getOctets();
      FrodoParameters frodoParameters = Utils.frodoParamsLookup(param1SubjectPublicKeyInfo.getAlgorithm().getAlgorithm());
      return (AsymmetricKeyParameter)new FrodoPublicKeyParameters(frodoParameters, arrayOfByte);
    }
  }
  
  private static class HQCConverter extends SubjectPublicKeyInfoConverter {
    private HQCConverter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      try {
        byte[] arrayOfByte = ASN1OctetString.getInstance(param1SubjectPublicKeyInfo.parsePublicKey()).getOctets();
        HQCParameters hQCParameters = Utils.hqcParamsLookup(param1SubjectPublicKeyInfo.getAlgorithm().getAlgorithm());
        return (AsymmetricKeyParameter)new HQCPublicKeyParameters(hQCParameters, arrayOfByte);
      } catch (Exception exception) {
        byte[] arrayOfByte = param1SubjectPublicKeyInfo.getPublicKeyData().getOctets();
        HQCParameters hQCParameters = Utils.hqcParamsLookup(param1SubjectPublicKeyInfo.getAlgorithm().getAlgorithm());
        return (AsymmetricKeyParameter)new HQCPublicKeyParameters(hQCParameters, arrayOfByte);
      } 
    }
  }
  
  private static class KyberConverter extends SubjectPublicKeyInfoConverter {
    private KyberConverter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      KyberParameters kyberParameters = Utils.kyberParamsLookup(param1SubjectPublicKeyInfo.getAlgorithm().getAlgorithm());
      try {
        ASN1Primitive aSN1Primitive = param1SubjectPublicKeyInfo.parsePublicKey();
        KyberPublicKey kyberPublicKey = KyberPublicKey.getInstance(aSN1Primitive);
        return (AsymmetricKeyParameter)new KyberPublicKeyParameters(kyberParameters, kyberPublicKey.getT(), kyberPublicKey.getRho());
      } catch (Exception exception) {
        return (AsymmetricKeyParameter)new KyberPublicKeyParameters(kyberParameters, param1SubjectPublicKeyInfo.getPublicKeyData().getOctets());
      } 
    }
  }
  
  private static class LMSConverter extends SubjectPublicKeyInfoConverter {
    private LMSConverter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      byte[] arrayOfByte = ASN1OctetString.getInstance(param1SubjectPublicKeyInfo.parsePublicKey()).getOctets();
      if (Pack.bigEndianToInt(arrayOfByte, 0) == 1)
        return (AsymmetricKeyParameter)LMSPublicKeyParameters.getInstance(Arrays.copyOfRange(arrayOfByte, 4, arrayOfByte.length)); 
      if (arrayOfByte.length == 64)
        arrayOfByte = Arrays.copyOfRange(arrayOfByte, 4, arrayOfByte.length); 
      return (AsymmetricKeyParameter)HSSPublicKeyParameters.getInstance(arrayOfByte);
    }
  }
  
  private static class McElieceCCA2Converter extends SubjectPublicKeyInfoConverter {
    private McElieceCCA2Converter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      McElieceCCA2PublicKey mcElieceCCA2PublicKey = McElieceCCA2PublicKey.getInstance(param1SubjectPublicKeyInfo.parsePublicKey());
      return (AsymmetricKeyParameter)new McElieceCCA2PublicKeyParameters(mcElieceCCA2PublicKey.getN(), mcElieceCCA2PublicKey.getT(), mcElieceCCA2PublicKey.getG(), Utils.getDigestName(mcElieceCCA2PublicKey.getDigest().getAlgorithm()));
    }
  }
  
  private static class NHConverter extends SubjectPublicKeyInfoConverter {
    private NHConverter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      return (AsymmetricKeyParameter)new NHPublicKeyParameters(param1SubjectPublicKeyInfo.getPublicKeyData().getBytes());
    }
  }
  
  private static class NTRULPrimeConverter extends SubjectPublicKeyInfoConverter {
    private NTRULPrimeConverter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      byte[] arrayOfByte = ASN1OctetString.getInstance(param1SubjectPublicKeyInfo.parsePublicKey()).getOctets();
      NTRULPRimeParameters nTRULPRimeParameters = Utils.ntrulprimeParamsLookup(param1SubjectPublicKeyInfo.getAlgorithm().getAlgorithm());
      return (AsymmetricKeyParameter)new NTRULPRimePublicKeyParameters(nTRULPRimeParameters, arrayOfByte);
    }
  }
  
  private static class NtruConverter extends SubjectPublicKeyInfoConverter {
    private NtruConverter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      byte[] arrayOfByte = ASN1OctetString.getInstance(param1SubjectPublicKeyInfo.parsePublicKey()).getOctets();
      NTRUParameters nTRUParameters = Utils.ntruParamsLookup(param1SubjectPublicKeyInfo.getAlgorithm().getAlgorithm());
      return (AsymmetricKeyParameter)new NTRUPublicKeyParameters(nTRUParameters, arrayOfByte);
    }
  }
  
  private static class PicnicConverter extends SubjectPublicKeyInfoConverter {
    private PicnicConverter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      byte[] arrayOfByte = ASN1OctetString.getInstance(param1SubjectPublicKeyInfo.parsePublicKey()).getOctets();
      PicnicParameters picnicParameters = Utils.picnicParamsLookup(param1SubjectPublicKeyInfo.getAlgorithm().getAlgorithm());
      return (AsymmetricKeyParameter)new PicnicPublicKeyParameters(picnicParameters, arrayOfByte);
    }
  }
  
  private static class QTeslaConverter extends SubjectPublicKeyInfoConverter {
    private QTeslaConverter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      return (AsymmetricKeyParameter)new QTESLAPublicKeyParameters(Utils.qTeslaLookupSecurityCategory(param1SubjectPublicKeyInfo.getAlgorithm()), param1SubjectPublicKeyInfo.getPublicKeyData().getOctets());
    }
  }
  
  private static class RainbowConverter extends SubjectPublicKeyInfoConverter {
    private RainbowConverter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      byte[] arrayOfByte = ASN1OctetString.getInstance(param1SubjectPublicKeyInfo.parsePublicKey()).getOctets();
      RainbowParameters rainbowParameters = Utils.rainbowParamsLookup(param1SubjectPublicKeyInfo.getAlgorithm().getAlgorithm());
      return (AsymmetricKeyParameter)new RainbowPublicKeyParameters(rainbowParameters, arrayOfByte);
    }
  }
  
  private static class SABERConverter extends SubjectPublicKeyInfoConverter {
    private SABERConverter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      byte[] arrayOfByte = ASN1OctetString.getInstance(ASN1Sequence.getInstance(param1SubjectPublicKeyInfo.parsePublicKey()).getObjectAt(0)).getOctets();
      SABERParameters sABERParameters = Utils.saberParamsLookup(param1SubjectPublicKeyInfo.getAlgorithm().getAlgorithm());
      return (AsymmetricKeyParameter)new SABERPublicKeyParameters(sABERParameters, arrayOfByte);
    }
  }
  
  private static class SNTRUPrimeConverter extends SubjectPublicKeyInfoConverter {
    private SNTRUPrimeConverter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      byte[] arrayOfByte = ASN1OctetString.getInstance(param1SubjectPublicKeyInfo.parsePublicKey()).getOctets();
      SNTRUPrimeParameters sNTRUPrimeParameters = Utils.sntruprimeParamsLookup(param1SubjectPublicKeyInfo.getAlgorithm().getAlgorithm());
      return (AsymmetricKeyParameter)new SNTRUPrimePublicKeyParameters(sNTRUPrimeParameters, arrayOfByte);
    }
  }
  
  private static class SPHINCSConverter extends SubjectPublicKeyInfoConverter {
    private SPHINCSConverter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      return (AsymmetricKeyParameter)new SPHINCSPublicKeyParameters(param1SubjectPublicKeyInfo.getPublicKeyData().getBytes(), Utils.sphincs256LookupTreeAlgName(SPHINCS256KeyParams.getInstance(param1SubjectPublicKeyInfo.getAlgorithm().getParameters())));
    }
  }
  
  private static class SPHINCSPlusConverter extends SubjectPublicKeyInfoConverter {
    private SPHINCSPlusConverter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      try {
        byte[] arrayOfByte = ASN1OctetString.getInstance(param1SubjectPublicKeyInfo.parsePublicKey()).getOctets();
        SPHINCSPlusParameters sPHINCSPlusParameters = Utils.sphincsPlusParamsLookup(param1SubjectPublicKeyInfo.getAlgorithm().getAlgorithm());
        return (AsymmetricKeyParameter)new SPHINCSPlusPublicKeyParameters(sPHINCSPlusParameters, Arrays.copyOfRange(arrayOfByte, 4, arrayOfByte.length));
      } catch (Exception exception) {
        byte[] arrayOfByte = param1SubjectPublicKeyInfo.getPublicKeyData().getOctets();
        SPHINCSPlusParameters sPHINCSPlusParameters = Utils.sphincsPlusParamsLookup(param1SubjectPublicKeyInfo.getAlgorithm().getAlgorithm());
        return (AsymmetricKeyParameter)new SPHINCSPlusPublicKeyParameters(sPHINCSPlusParameters, arrayOfByte);
      } 
    }
  }
  
  private static abstract class SubjectPublicKeyInfoConverter {
    private SubjectPublicKeyInfoConverter() {}
    
    abstract AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException;
  }
  
  private static class XMSSConverter extends SubjectPublicKeyInfoConverter {
    private XMSSConverter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      XMSSKeyParams xMSSKeyParams = XMSSKeyParams.getInstance(param1SubjectPublicKeyInfo.getAlgorithm().getParameters());
      if (xMSSKeyParams != null) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = xMSSKeyParams.getTreeDigest().getAlgorithm();
        XMSSPublicKey xMSSPublicKey = XMSSPublicKey.getInstance(param1SubjectPublicKeyInfo.parsePublicKey());
        return (AsymmetricKeyParameter)(new XMSSPublicKeyParameters.Builder(new XMSSParameters(xMSSKeyParams.getHeight(), Utils.getDigest(aSN1ObjectIdentifier)))).withPublicSeed(xMSSPublicKey.getPublicSeed()).withRoot(xMSSPublicKey.getRoot()).build();
      } 
      byte[] arrayOfByte = ASN1OctetString.getInstance(param1SubjectPublicKeyInfo.parsePublicKey()).getOctets();
      return (AsymmetricKeyParameter)(new XMSSPublicKeyParameters.Builder(XMSSParameters.lookupByOID(Pack.bigEndianToInt(arrayOfByte, 0)))).withPublicKey(arrayOfByte).build();
    }
  }
  
  private static class XMSSMTConverter extends SubjectPublicKeyInfoConverter {
    private XMSSMTConverter() {}
    
    AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo param1SubjectPublicKeyInfo, Object param1Object) throws IOException {
      XMSSMTKeyParams xMSSMTKeyParams = XMSSMTKeyParams.getInstance(param1SubjectPublicKeyInfo.getAlgorithm().getParameters());
      if (xMSSMTKeyParams != null) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = xMSSMTKeyParams.getTreeDigest().getAlgorithm();
        XMSSPublicKey xMSSPublicKey = XMSSPublicKey.getInstance(param1SubjectPublicKeyInfo.parsePublicKey());
        return (AsymmetricKeyParameter)(new XMSSMTPublicKeyParameters.Builder(new XMSSMTParameters(xMSSMTKeyParams.getHeight(), xMSSMTKeyParams.getLayers(), Utils.getDigest(aSN1ObjectIdentifier)))).withPublicSeed(xMSSPublicKey.getPublicSeed()).withRoot(xMSSPublicKey.getRoot()).build();
      } 
      byte[] arrayOfByte = ASN1OctetString.getInstance(param1SubjectPublicKeyInfo.parsePublicKey()).getOctets();
      return (AsymmetricKeyParameter)(new XMSSMTPublicKeyParameters.Builder(XMSSMTParameters.lookupByOID(Pack.bigEndianToInt(arrayOfByte, 0)))).withPublicKey(arrayOfByte).build();
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypt\\util\PublicKeyFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */