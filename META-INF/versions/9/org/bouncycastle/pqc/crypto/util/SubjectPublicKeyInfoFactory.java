package META-INF.versions.9.org.bouncycastle.pqc.crypto.util;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.internal.asn1.isara.IsaraObjectIdentifiers;
import org.bouncycastle.pqc.asn1.McElieceCCA2PublicKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.asn1.XMSSKeyParams;
import org.bouncycastle.pqc.asn1.XMSSMTKeyParams;
import org.bouncycastle.pqc.asn1.XMSSMTPublicKey;
import org.bouncycastle.pqc.asn1.XMSSPublicKey;
import org.bouncycastle.pqc.crypto.bike.BIKEPublicKeyParameters;
import org.bouncycastle.pqc.crypto.cmce.CMCEPublicKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPublicKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPublicKeyParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconPublicKeyParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoPublicKeyParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.Composer;
import org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUPublicKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimePublicKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimePublicKeyParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicPublicKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters;
import org.bouncycastle.pqc.crypto.saber.SABERPublicKeyParameters;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPublicKeyParameters;
import org.bouncycastle.pqc.crypto.util.Utils;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2PublicKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.qtesla.QTESLAPublicKeyParameters;
import org.bouncycastle.util.Encodable;

public class SubjectPublicKeyInfoFactory {
  public static SubjectPublicKeyInfo createSubjectPublicKeyInfo(AsymmetricKeyParameter paramAsymmetricKeyParameter) throws IOException {
    if (paramAsymmetricKeyParameter instanceof QTESLAPublicKeyParameters) {
      QTESLAPublicKeyParameters qTESLAPublicKeyParameters = (QTESLAPublicKeyParameters)paramAsymmetricKeyParameter;
      AlgorithmIdentifier algorithmIdentifier = Utils.qTeslaLookupAlgID(qTESLAPublicKeyParameters.getSecurityCategory());
      return new SubjectPublicKeyInfo(algorithmIdentifier, qTESLAPublicKeyParameters.getPublicData());
    } 
    if (paramAsymmetricKeyParameter instanceof SPHINCSPublicKeyParameters) {
      SPHINCSPublicKeyParameters sPHINCSPublicKeyParameters = (SPHINCSPublicKeyParameters)paramAsymmetricKeyParameter;
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PQCObjectIdentifiers.sphincs256, (ASN1Encodable)new SPHINCS256KeyParams(Utils.sphincs256LookupTreeAlgID(sPHINCSPublicKeyParameters.getTreeDigest())));
      return new SubjectPublicKeyInfo(algorithmIdentifier, sPHINCSPublicKeyParameters.getKeyData());
    } 
    if (paramAsymmetricKeyParameter instanceof NHPublicKeyParameters) {
      NHPublicKeyParameters nHPublicKeyParameters = (NHPublicKeyParameters)paramAsymmetricKeyParameter;
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PQCObjectIdentifiers.newHope);
      return new SubjectPublicKeyInfo(algorithmIdentifier, nHPublicKeyParameters.getPubData());
    } 
    if (paramAsymmetricKeyParameter instanceof LMSPublicKeyParameters) {
      LMSPublicKeyParameters lMSPublicKeyParameters = (LMSPublicKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte = Composer.compose().u32str(1).bytes((Encodable)lMSPublicKeyParameters).build();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig);
      return new SubjectPublicKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(arrayOfByte));
    } 
    if (paramAsymmetricKeyParameter instanceof HSSPublicKeyParameters) {
      HSSPublicKeyParameters hSSPublicKeyParameters = (HSSPublicKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte = Composer.compose().u32str(hSSPublicKeyParameters.getL()).bytes((Encodable)hSSPublicKeyParameters.getLMSPublicKey()).build();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig);
      return new SubjectPublicKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(arrayOfByte));
    } 
    if (paramAsymmetricKeyParameter instanceof SPHINCSPlusPublicKeyParameters) {
      SPHINCSPlusPublicKeyParameters sPHINCSPlusPublicKeyParameters = (SPHINCSPlusPublicKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte = sPHINCSPlusPublicKeyParameters.getEncoded();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.sphincsPlusOidLookup(sPHINCSPlusPublicKeyParameters.getParameters()));
      return new SubjectPublicKeyInfo(algorithmIdentifier, arrayOfByte);
    } 
    if (paramAsymmetricKeyParameter instanceof CMCEPublicKeyParameters) {
      CMCEPublicKeyParameters cMCEPublicKeyParameters = (CMCEPublicKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte = cMCEPublicKeyParameters.getEncoded();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.mcElieceOidLookup(cMCEPublicKeyParameters.getParameters()));
      return new SubjectPublicKeyInfo(algorithmIdentifier, arrayOfByte);
    } 
    if (paramAsymmetricKeyParameter instanceof XMSSPublicKeyParameters) {
      XMSSPublicKeyParameters xMSSPublicKeyParameters = (XMSSPublicKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte1 = xMSSPublicKeyParameters.getPublicSeed();
      byte[] arrayOfByte2 = xMSSPublicKeyParameters.getRoot();
      byte[] arrayOfByte3 = xMSSPublicKeyParameters.getEncoded();
      if (arrayOfByte3.length > arrayOfByte1.length + arrayOfByte2.length) {
        AlgorithmIdentifier algorithmIdentifier1 = new AlgorithmIdentifier(IsaraObjectIdentifiers.id_alg_xmss);
        return new SubjectPublicKeyInfo(algorithmIdentifier1, (ASN1Encodable)new DEROctetString(arrayOfByte3));
      } 
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PQCObjectIdentifiers.xmss, (ASN1Encodable)new XMSSKeyParams(xMSSPublicKeyParameters.getParameters().getHeight(), Utils.xmssLookupTreeAlgID(xMSSPublicKeyParameters.getTreeDigest())));
      return new SubjectPublicKeyInfo(algorithmIdentifier, (ASN1Encodable)new XMSSPublicKey(arrayOfByte1, arrayOfByte2));
    } 
    if (paramAsymmetricKeyParameter instanceof XMSSMTPublicKeyParameters) {
      XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters = (XMSSMTPublicKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte1 = xMSSMTPublicKeyParameters.getPublicSeed();
      byte[] arrayOfByte2 = xMSSMTPublicKeyParameters.getRoot();
      byte[] arrayOfByte3 = xMSSMTPublicKeyParameters.getEncoded();
      if (arrayOfByte3.length > arrayOfByte1.length + arrayOfByte2.length) {
        AlgorithmIdentifier algorithmIdentifier1 = new AlgorithmIdentifier(IsaraObjectIdentifiers.id_alg_xmssmt);
        return new SubjectPublicKeyInfo(algorithmIdentifier1, (ASN1Encodable)new DEROctetString(arrayOfByte3));
      } 
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PQCObjectIdentifiers.xmss_mt, (ASN1Encodable)new XMSSMTKeyParams(xMSSMTPublicKeyParameters.getParameters().getHeight(), xMSSMTPublicKeyParameters.getParameters().getLayers(), Utils.xmssLookupTreeAlgID(xMSSMTPublicKeyParameters.getTreeDigest())));
      return new SubjectPublicKeyInfo(algorithmIdentifier, (ASN1Encodable)new XMSSMTPublicKey(xMSSMTPublicKeyParameters.getPublicSeed(), xMSSMTPublicKeyParameters.getRoot()));
    } 
    if (paramAsymmetricKeyParameter instanceof McElieceCCA2PublicKeyParameters) {
      McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = (McElieceCCA2PublicKeyParameters)paramAsymmetricKeyParameter;
      McElieceCCA2PublicKey mcElieceCCA2PublicKey = new McElieceCCA2PublicKey(mcElieceCCA2PublicKeyParameters.getN(), mcElieceCCA2PublicKeyParameters.getT(), mcElieceCCA2PublicKeyParameters.getG(), Utils.getAlgorithmIdentifier(mcElieceCCA2PublicKeyParameters.getDigest()));
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PQCObjectIdentifiers.mcElieceCca2);
      return new SubjectPublicKeyInfo(algorithmIdentifier, (ASN1Encodable)mcElieceCCA2PublicKey);
    } 
    if (paramAsymmetricKeyParameter instanceof FrodoPublicKeyParameters) {
      FrodoPublicKeyParameters frodoPublicKeyParameters = (FrodoPublicKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte = frodoPublicKeyParameters.getEncoded();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.frodoOidLookup(frodoPublicKeyParameters.getParameters()));
      return new SubjectPublicKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(arrayOfByte));
    } 
    if (paramAsymmetricKeyParameter instanceof SABERPublicKeyParameters) {
      SABERPublicKeyParameters sABERPublicKeyParameters = (SABERPublicKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte = sABERPublicKeyParameters.getEncoded();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.saberOidLookup(sABERPublicKeyParameters.getParameters()));
      return new SubjectPublicKeyInfo(algorithmIdentifier, (ASN1Encodable)new DERSequence((ASN1Encodable)new DEROctetString(arrayOfByte)));
    } 
    if (paramAsymmetricKeyParameter instanceof PicnicPublicKeyParameters) {
      PicnicPublicKeyParameters picnicPublicKeyParameters = (PicnicPublicKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte = picnicPublicKeyParameters.getEncoded();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.picnicOidLookup(picnicPublicKeyParameters.getParameters()));
      return new SubjectPublicKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(arrayOfByte));
    } 
    if (paramAsymmetricKeyParameter instanceof NTRUPublicKeyParameters) {
      NTRUPublicKeyParameters nTRUPublicKeyParameters = (NTRUPublicKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte = nTRUPublicKeyParameters.getEncoded();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.ntruOidLookup(nTRUPublicKeyParameters.getParameters()));
      return new SubjectPublicKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(arrayOfByte));
    } 
    if (paramAsymmetricKeyParameter instanceof FalconPublicKeyParameters) {
      FalconPublicKeyParameters falconPublicKeyParameters = (FalconPublicKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte1 = falconPublicKeyParameters.getH();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.falconOidLookup(falconPublicKeyParameters.getParameters()));
      byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 1];
      arrayOfByte2[0] = (byte)(0 + falconPublicKeyParameters.getParameters().getLogN());
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 1, arrayOfByte1.length);
      return new SubjectPublicKeyInfo(algorithmIdentifier, arrayOfByte2);
    } 
    if (paramAsymmetricKeyParameter instanceof KyberPublicKeyParameters) {
      KyberPublicKeyParameters kyberPublicKeyParameters = (KyberPublicKeyParameters)paramAsymmetricKeyParameter;
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.kyberOidLookup(kyberPublicKeyParameters.getParameters()));
      return new SubjectPublicKeyInfo(algorithmIdentifier, kyberPublicKeyParameters.getEncoded());
    } 
    if (paramAsymmetricKeyParameter instanceof NTRULPRimePublicKeyParameters) {
      NTRULPRimePublicKeyParameters nTRULPRimePublicKeyParameters = (NTRULPRimePublicKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte = nTRULPRimePublicKeyParameters.getEncoded();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.ntrulprimeOidLookup(nTRULPRimePublicKeyParameters.getParameters()));
      return new SubjectPublicKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(arrayOfByte));
    } 
    if (paramAsymmetricKeyParameter instanceof SNTRUPrimePublicKeyParameters) {
      SNTRUPrimePublicKeyParameters sNTRUPrimePublicKeyParameters = (SNTRUPrimePublicKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte = sNTRUPrimePublicKeyParameters.getEncoded();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.sntruprimeOidLookup(sNTRUPrimePublicKeyParameters.getParameters()));
      return new SubjectPublicKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(arrayOfByte));
    } 
    if (paramAsymmetricKeyParameter instanceof DilithiumPublicKeyParameters) {
      DilithiumPublicKeyParameters dilithiumPublicKeyParameters = (DilithiumPublicKeyParameters)paramAsymmetricKeyParameter;
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.dilithiumOidLookup(dilithiumPublicKeyParameters.getParameters()));
      return new SubjectPublicKeyInfo(algorithmIdentifier, dilithiumPublicKeyParameters.getEncoded());
    } 
    if (paramAsymmetricKeyParameter instanceof BIKEPublicKeyParameters) {
      BIKEPublicKeyParameters bIKEPublicKeyParameters = (BIKEPublicKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte = bIKEPublicKeyParameters.getEncoded();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.bikeOidLookup(bIKEPublicKeyParameters.getParameters()));
      return new SubjectPublicKeyInfo(algorithmIdentifier, arrayOfByte);
    } 
    if (paramAsymmetricKeyParameter instanceof HQCPublicKeyParameters) {
      HQCPublicKeyParameters hQCPublicKeyParameters = (HQCPublicKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte = hQCPublicKeyParameters.getEncoded();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.hqcOidLookup(hQCPublicKeyParameters.getParameters()));
      return new SubjectPublicKeyInfo(algorithmIdentifier, arrayOfByte);
    } 
    if (paramAsymmetricKeyParameter instanceof RainbowPublicKeyParameters) {
      RainbowPublicKeyParameters rainbowPublicKeyParameters = (RainbowPublicKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte = rainbowPublicKeyParameters.getEncoded();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.rainbowOidLookup(rainbowPublicKeyParameters.getParameters()));
      return new SubjectPublicKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(arrayOfByte));
    } 
    throw new IOException("key parameters not recognized");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypt\\util\SubjectPublicKeyInfoFactory.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */