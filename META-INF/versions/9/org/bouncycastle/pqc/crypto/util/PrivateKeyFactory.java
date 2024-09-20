package META-INF.versions.9.org.bouncycastle.pqc.crypto.util;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.asn1.CMCEPrivateKey;
import org.bouncycastle.pqc.asn1.FalconPrivateKey;
import org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.asn1.SPHINCSPLUSPrivateKey;
import org.bouncycastle.pqc.asn1.SPHINCSPLUSPublicKey;
import org.bouncycastle.pqc.asn1.XMSSKeyParams;
import org.bouncycastle.pqc.asn1.XMSSMTKeyParams;
import org.bouncycastle.pqc.asn1.XMSSMTPrivateKey;
import org.bouncycastle.pqc.asn1.XMSSPrivateKey;
import org.bouncycastle.pqc.crypto.bike.BIKEParameters;
import org.bouncycastle.pqc.crypto.bike.BIKEPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.cmce.CMCEParameters;
import org.bouncycastle.pqc.crypto.cmce.CMCEPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPublicKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimeParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimePrivateKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimePrivateKeyParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.saber.SABERParameters;
import org.bouncycastle.pqc.crypto.saber.SABERPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;
import org.bouncycastle.pqc.crypto.util.Utils;
import org.bouncycastle.pqc.crypto.xmss.BDS;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSUtil;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2PrivateKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.qtesla.QTESLAPrivateKeyParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

public class PrivateKeyFactory {
  public static AsymmetricKeyParameter createKey(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("privateKeyInfoData array null"); 
    if (paramArrayOfbyte.length == 0)
      throw new IllegalArgumentException("privateKeyInfoData array empty"); 
    return createKey(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(paramArrayOfbyte)));
  }
  
  public static AsymmetricKeyParameter createKey(InputStream paramInputStream) throws IOException {
    return createKey(PrivateKeyInfo.getInstance((new ASN1InputStream(paramInputStream)).readObject()));
  }
  
  public static AsymmetricKeyParameter createKey(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    if (paramPrivateKeyInfo == null)
      throw new IllegalArgumentException("keyInfo array null"); 
    AlgorithmIdentifier algorithmIdentifier = paramPrivateKeyInfo.getPrivateKeyAlgorithm();
    ASN1ObjectIdentifier aSN1ObjectIdentifier = algorithmIdentifier.getAlgorithm();
    if (aSN1ObjectIdentifier.on(PQCObjectIdentifiers.qTESLA)) {
      ASN1OctetString aSN1OctetString = ASN1OctetString.getInstance(paramPrivateKeyInfo.parsePrivateKey());
      return (AsymmetricKeyParameter)new QTESLAPrivateKeyParameters(Utils.qTeslaLookupSecurityCategory(algorithmIdentifier), aSN1OctetString.getOctets());
    } 
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)PQCObjectIdentifiers.sphincs256))
      return (AsymmetricKeyParameter)new SPHINCSPrivateKeyParameters(ASN1OctetString.getInstance(paramPrivateKeyInfo.parsePrivateKey()).getOctets(), Utils.sphincs256LookupTreeAlgName(SPHINCS256KeyParams.getInstance(algorithmIdentifier.getParameters()))); 
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)PQCObjectIdentifiers.newHope))
      return (AsymmetricKeyParameter)new NHPrivateKeyParameters(convert(ASN1OctetString.getInstance(paramPrivateKeyInfo.parsePrivateKey()).getOctets())); 
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)PKCSObjectIdentifiers.id_alg_hss_lms_hashsig)) {
      byte[] arrayOfByte = ASN1OctetString.getInstance(paramPrivateKeyInfo.parsePrivateKey()).getOctets();
      ASN1BitString aSN1BitString = paramPrivateKeyInfo.getPublicKeyData();
      if (Pack.bigEndianToInt(arrayOfByte, 0) == 1) {
        if (aSN1BitString != null) {
          byte[] arrayOfByte1 = aSN1BitString.getOctets();
          return (AsymmetricKeyParameter)LMSPrivateKeyParameters.getInstance(Arrays.copyOfRange(arrayOfByte, 4, arrayOfByte.length), Arrays.copyOfRange(arrayOfByte1, 4, arrayOfByte1.length));
        } 
        return (AsymmetricKeyParameter)LMSPrivateKeyParameters.getInstance(Arrays.copyOfRange(arrayOfByte, 4, arrayOfByte.length));
      } 
      if (aSN1BitString != null) {
        byte[] arrayOfByte1 = aSN1BitString.getOctets();
        return (AsymmetricKeyParameter)HSSPrivateKeyParameters.getInstance(Arrays.copyOfRange(arrayOfByte, 4, arrayOfByte.length), arrayOfByte1);
      } 
      return (AsymmetricKeyParameter)HSSPrivateKeyParameters.getInstance(Arrays.copyOfRange(arrayOfByte, 4, arrayOfByte.length));
    } 
    if (aSN1ObjectIdentifier.on(BCObjectIdentifiers.sphincsPlus) || aSN1ObjectIdentifier.on(BCObjectIdentifiers.sphincsPlus_interop)) {
      SPHINCSPlusParameters sPHINCSPlusParameters = Utils.sphincsPlusParamsLookup(aSN1ObjectIdentifier);
      ASN1Encodable aSN1Encodable = paramPrivateKeyInfo.parsePrivateKey();
      if (aSN1Encodable instanceof ASN1Sequence) {
        SPHINCSPLUSPrivateKey sPHINCSPLUSPrivateKey = SPHINCSPLUSPrivateKey.getInstance(aSN1Encodable);
        SPHINCSPLUSPublicKey sPHINCSPLUSPublicKey = sPHINCSPLUSPrivateKey.getPublicKey();
        return (AsymmetricKeyParameter)new SPHINCSPlusPrivateKeyParameters(sPHINCSPlusParameters, sPHINCSPLUSPrivateKey.getSkseed(), sPHINCSPLUSPrivateKey.getSkprf(), sPHINCSPLUSPublicKey.getPkseed(), sPHINCSPLUSPublicKey.getPkroot());
      } 
      return (AsymmetricKeyParameter)new SPHINCSPlusPrivateKeyParameters(sPHINCSPlusParameters, ASN1OctetString.getInstance(aSN1Encodable).getOctets());
    } 
    if (aSN1ObjectIdentifier.on(BCObjectIdentifiers.picnic)) {
      byte[] arrayOfByte = ASN1OctetString.getInstance(paramPrivateKeyInfo.parsePrivateKey()).getOctets();
      PicnicParameters picnicParameters = Utils.picnicParamsLookup(aSN1ObjectIdentifier);
      return (AsymmetricKeyParameter)new PicnicPrivateKeyParameters(picnicParameters, arrayOfByte);
    } 
    if (aSN1ObjectIdentifier.on(BCObjectIdentifiers.pqc_kem_mceliece)) {
      CMCEPrivateKey cMCEPrivateKey = CMCEPrivateKey.getInstance(paramPrivateKeyInfo.parsePrivateKey());
      CMCEParameters cMCEParameters = Utils.mcElieceParamsLookup(aSN1ObjectIdentifier);
      return (AsymmetricKeyParameter)new CMCEPrivateKeyParameters(cMCEParameters, cMCEPrivateKey.getDelta(), cMCEPrivateKey.getC(), cMCEPrivateKey.getG(), cMCEPrivateKey.getAlpha(), cMCEPrivateKey.getS());
    } 
    if (aSN1ObjectIdentifier.on(BCObjectIdentifiers.pqc_kem_frodo)) {
      byte[] arrayOfByte = ASN1OctetString.getInstance(paramPrivateKeyInfo.parsePrivateKey()).getOctets();
      FrodoParameters frodoParameters = Utils.frodoParamsLookup(aSN1ObjectIdentifier);
      return (AsymmetricKeyParameter)new FrodoPrivateKeyParameters(frodoParameters, arrayOfByte);
    } 
    if (aSN1ObjectIdentifier.on(BCObjectIdentifiers.pqc_kem_saber)) {
      byte[] arrayOfByte = ASN1OctetString.getInstance(paramPrivateKeyInfo.parsePrivateKey()).getOctets();
      SABERParameters sABERParameters = Utils.saberParamsLookup(aSN1ObjectIdentifier);
      return (AsymmetricKeyParameter)new SABERPrivateKeyParameters(sABERParameters, arrayOfByte);
    } 
    if (aSN1ObjectIdentifier.on(BCObjectIdentifiers.pqc_kem_ntru)) {
      byte[] arrayOfByte = ASN1OctetString.getInstance(paramPrivateKeyInfo.parsePrivateKey()).getOctets();
      NTRUParameters nTRUParameters = Utils.ntruParamsLookup(aSN1ObjectIdentifier);
      return (AsymmetricKeyParameter)new NTRUPrivateKeyParameters(nTRUParameters, arrayOfByte);
    } 
    if (aSN1ObjectIdentifier.on(BCObjectIdentifiers.pqc_kem_kyber)) {
      ASN1OctetString aSN1OctetString = ASN1OctetString.getInstance(paramPrivateKeyInfo.parsePrivateKey());
      KyberParameters kyberParameters = Utils.kyberParamsLookup(aSN1ObjectIdentifier);
      return (AsymmetricKeyParameter)new KyberPrivateKeyParameters(kyberParameters, aSN1OctetString.getOctets());
    } 
    if (aSN1ObjectIdentifier.on(BCObjectIdentifiers.pqc_kem_ntrulprime)) {
      ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(paramPrivateKeyInfo.parsePrivateKey());
      NTRULPRimeParameters nTRULPRimeParameters = Utils.ntrulprimeParamsLookup(aSN1ObjectIdentifier);
      return (AsymmetricKeyParameter)new NTRULPRimePrivateKeyParameters(nTRULPRimeParameters, ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets(), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets(), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2)).getOctets(), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(3)).getOctets());
    } 
    if (aSN1ObjectIdentifier.on(BCObjectIdentifiers.pqc_kem_sntruprime)) {
      ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(paramPrivateKeyInfo.parsePrivateKey());
      SNTRUPrimeParameters sNTRUPrimeParameters = Utils.sntruprimeParamsLookup(aSN1ObjectIdentifier);
      return (AsymmetricKeyParameter)new SNTRUPrimePrivateKeyParameters(sNTRUPrimeParameters, ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets(), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets(), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2)).getOctets(), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(3)).getOctets(), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(4)).getOctets());
    } 
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)BCObjectIdentifiers.dilithium2) || aSN1ObjectIdentifier.equals((ASN1Primitive)BCObjectIdentifiers.dilithium3) || aSN1ObjectIdentifier.equals((ASN1Primitive)BCObjectIdentifiers.dilithium5)) {
      ASN1Encodable aSN1Encodable = paramPrivateKeyInfo.parsePrivateKey();
      DilithiumParameters dilithiumParameters = Utils.dilithiumParamsLookup(aSN1ObjectIdentifier);
      if (aSN1Encodable instanceof ASN1Sequence) {
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(aSN1Encodable);
        int i = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).intValueExact();
        if (i != 0)
          throw new IOException("unknown private key version: " + i); 
        if (paramPrivateKeyInfo.getPublicKeyData() != null) {
          DilithiumPublicKeyParameters dilithiumPublicKeyParameters = PublicKeyFactory.DilithiumConverter.getPublicKeyParams(dilithiumParameters, paramPrivateKeyInfo.getPublicKeyData());
          return (AsymmetricKeyParameter)new DilithiumPrivateKeyParameters(dilithiumParameters, ASN1BitString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets(), ASN1BitString.getInstance(aSN1Sequence.getObjectAt(2)).getOctets(), ASN1BitString.getInstance(aSN1Sequence.getObjectAt(3)).getOctets(), ASN1BitString.getInstance(aSN1Sequence.getObjectAt(4)).getOctets(), ASN1BitString.getInstance(aSN1Sequence.getObjectAt(5)).getOctets(), ASN1BitString.getInstance(aSN1Sequence.getObjectAt(6)).getOctets(), dilithiumPublicKeyParameters.getT1());
        } 
        return (AsymmetricKeyParameter)new DilithiumPrivateKeyParameters(dilithiumParameters, ASN1BitString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets(), ASN1BitString.getInstance(aSN1Sequence.getObjectAt(2)).getOctets(), ASN1BitString.getInstance(aSN1Sequence.getObjectAt(3)).getOctets(), ASN1BitString.getInstance(aSN1Sequence.getObjectAt(4)).getOctets(), ASN1BitString.getInstance(aSN1Sequence.getObjectAt(5)).getOctets(), ASN1BitString.getInstance(aSN1Sequence.getObjectAt(6)).getOctets(), null);
      } 
      if (aSN1Encodable instanceof org.bouncycastle.asn1.DEROctetString) {
        byte[] arrayOfByte = ASN1OctetString.getInstance(aSN1Encodable).getOctets();
        if (paramPrivateKeyInfo.getPublicKeyData() != null) {
          DilithiumPublicKeyParameters dilithiumPublicKeyParameters = PublicKeyFactory.DilithiumConverter.getPublicKeyParams(dilithiumParameters, paramPrivateKeyInfo.getPublicKeyData());
          return (AsymmetricKeyParameter)new DilithiumPrivateKeyParameters(dilithiumParameters, arrayOfByte, dilithiumPublicKeyParameters);
        } 
        return (AsymmetricKeyParameter)new DilithiumPrivateKeyParameters(dilithiumParameters, arrayOfByte, null);
      } 
      throw new IOException("not supported");
    } 
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)BCObjectIdentifiers.falcon_512) || aSN1ObjectIdentifier.equals((ASN1Primitive)BCObjectIdentifiers.falcon_1024)) {
      FalconPrivateKey falconPrivateKey = FalconPrivateKey.getInstance(paramPrivateKeyInfo.parsePrivateKey());
      FalconParameters falconParameters = Utils.falconParamsLookup(aSN1ObjectIdentifier);
      return (AsymmetricKeyParameter)new FalconPrivateKeyParameters(falconParameters, falconPrivateKey.getf(), falconPrivateKey.getG(), falconPrivateKey.getF(), falconPrivateKey.getPublicKey().getH());
    } 
    if (aSN1ObjectIdentifier.on(BCObjectIdentifiers.pqc_kem_bike)) {
      byte[] arrayOfByte1 = ASN1OctetString.getInstance(paramPrivateKeyInfo.parsePrivateKey()).getOctets();
      BIKEParameters bIKEParameters = Utils.bikeParamsLookup(aSN1ObjectIdentifier);
      byte[] arrayOfByte2 = Arrays.copyOfRange(arrayOfByte1, 0, bIKEParameters.getRByte());
      byte[] arrayOfByte3 = Arrays.copyOfRange(arrayOfByte1, bIKEParameters.getRByte(), 2 * bIKEParameters.getRByte());
      byte[] arrayOfByte4 = Arrays.copyOfRange(arrayOfByte1, 2 * bIKEParameters.getRByte(), arrayOfByte1.length);
      return (AsymmetricKeyParameter)new BIKEPrivateKeyParameters(bIKEParameters, arrayOfByte2, arrayOfByte3, arrayOfByte4);
    } 
    if (aSN1ObjectIdentifier.on(BCObjectIdentifiers.pqc_kem_hqc)) {
      byte[] arrayOfByte = ASN1OctetString.getInstance(paramPrivateKeyInfo.parsePrivateKey()).getOctets();
      HQCParameters hQCParameters = Utils.hqcParamsLookup(aSN1ObjectIdentifier);
      return (AsymmetricKeyParameter)new HQCPrivateKeyParameters(hQCParameters, arrayOfByte);
    } 
    if (aSN1ObjectIdentifier.on(BCObjectIdentifiers.rainbow)) {
      byte[] arrayOfByte = ASN1OctetString.getInstance(paramPrivateKeyInfo.parsePrivateKey()).getOctets();
      RainbowParameters rainbowParameters = Utils.rainbowParamsLookup(aSN1ObjectIdentifier);
      return (AsymmetricKeyParameter)new RainbowPrivateKeyParameters(rainbowParameters, arrayOfByte);
    } 
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)PQCObjectIdentifiers.xmss)) {
      XMSSKeyParams xMSSKeyParams = XMSSKeyParams.getInstance(algorithmIdentifier.getParameters());
      ASN1ObjectIdentifier aSN1ObjectIdentifier1 = xMSSKeyParams.getTreeDigest().getAlgorithm();
      XMSSPrivateKey xMSSPrivateKey = XMSSPrivateKey.getInstance(paramPrivateKeyInfo.parsePrivateKey());
      try {
        XMSSPrivateKeyParameters.Builder builder = (new XMSSPrivateKeyParameters.Builder(new XMSSParameters(xMSSKeyParams.getHeight(), Utils.getDigest(aSN1ObjectIdentifier1)))).withIndex(xMSSPrivateKey.getIndex()).withSecretKeySeed(xMSSPrivateKey.getSecretKeySeed()).withSecretKeyPRF(xMSSPrivateKey.getSecretKeyPRF()).withPublicSeed(xMSSPrivateKey.getPublicSeed()).withRoot(xMSSPrivateKey.getRoot());
        if (xMSSPrivateKey.getVersion() != 0)
          builder.withMaxIndex(xMSSPrivateKey.getMaxIndex()); 
        if (xMSSPrivateKey.getBdsState() != null) {
          BDS bDS = (BDS)XMSSUtil.deserialize(xMSSPrivateKey.getBdsState(), BDS.class);
          builder.withBDSState(bDS.withWOTSDigest(aSN1ObjectIdentifier1));
        } 
        return (AsymmetricKeyParameter)builder.build();
      } catch (ClassNotFoundException classNotFoundException) {
        throw new IOException("ClassNotFoundException processing BDS state: " + classNotFoundException.getMessage());
      } 
    } 
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)PQCObjectIdentifiers.xmss_mt)) {
      XMSSMTKeyParams xMSSMTKeyParams = XMSSMTKeyParams.getInstance(algorithmIdentifier.getParameters());
      ASN1ObjectIdentifier aSN1ObjectIdentifier1 = xMSSMTKeyParams.getTreeDigest().getAlgorithm();
      try {
        XMSSMTPrivateKey xMSSMTPrivateKey = XMSSMTPrivateKey.getInstance(paramPrivateKeyInfo.parsePrivateKey());
        XMSSMTPrivateKeyParameters.Builder builder = (new XMSSMTPrivateKeyParameters.Builder(new XMSSMTParameters(xMSSMTKeyParams.getHeight(), xMSSMTKeyParams.getLayers(), Utils.getDigest(aSN1ObjectIdentifier1)))).withIndex(xMSSMTPrivateKey.getIndex()).withSecretKeySeed(xMSSMTPrivateKey.getSecretKeySeed()).withSecretKeyPRF(xMSSMTPrivateKey.getSecretKeyPRF()).withPublicSeed(xMSSMTPrivateKey.getPublicSeed()).withRoot(xMSSMTPrivateKey.getRoot());
        if (xMSSMTPrivateKey.getVersion() != 0)
          builder.withMaxIndex(xMSSMTPrivateKey.getMaxIndex()); 
        if (xMSSMTPrivateKey.getBdsState() != null) {
          BDSStateMap bDSStateMap = (BDSStateMap)XMSSUtil.deserialize(xMSSMTPrivateKey.getBdsState(), BDSStateMap.class);
          builder.withBDSState(bDSStateMap.withWOTSDigest(aSN1ObjectIdentifier1));
        } 
        return (AsymmetricKeyParameter)builder.build();
      } catch (ClassNotFoundException classNotFoundException) {
        throw new IOException("ClassNotFoundException processing BDS state: " + classNotFoundException.getMessage());
      } 
    } 
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)PQCObjectIdentifiers.mcElieceCca2)) {
      McElieceCCA2PrivateKey mcElieceCCA2PrivateKey = McElieceCCA2PrivateKey.getInstance(paramPrivateKeyInfo.parsePrivateKey());
      return (AsymmetricKeyParameter)new McElieceCCA2PrivateKeyParameters(mcElieceCCA2PrivateKey.getN(), mcElieceCCA2PrivateKey.getK(), mcElieceCCA2PrivateKey.getField(), mcElieceCCA2PrivateKey.getGoppaPoly(), mcElieceCCA2PrivateKey.getP(), Utils.getDigestName(mcElieceCCA2PrivateKey.getDigest().getAlgorithm()));
    } 
    throw new RuntimeException("algorithm identifier in private key not recognised");
  }
  
  private static short[] convert(byte[] paramArrayOfbyte) {
    short[] arrayOfShort = new short[paramArrayOfbyte.length / 2];
    for (byte b = 0; b != arrayOfShort.length; b++)
      arrayOfShort[b] = Pack.littleEndianToShort(paramArrayOfbyte, b * 2); 
    return arrayOfShort;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypt\\util\PrivateKeyFactory.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */