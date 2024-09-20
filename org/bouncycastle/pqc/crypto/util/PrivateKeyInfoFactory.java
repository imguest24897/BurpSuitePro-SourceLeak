package org.bouncycastle.pqc.crypto.util;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.asn1.CMCEPrivateKey;
import org.bouncycastle.pqc.asn1.CMCEPublicKey;
import org.bouncycastle.pqc.asn1.FalconPrivateKey;
import org.bouncycastle.pqc.asn1.FalconPublicKey;
import org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.asn1.XMSSKeyParams;
import org.bouncycastle.pqc.asn1.XMSSMTKeyParams;
import org.bouncycastle.pqc.asn1.XMSSMTPrivateKey;
import org.bouncycastle.pqc.asn1.XMSSPrivateKey;
import org.bouncycastle.pqc.crypto.bike.BIKEPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.cmce.CMCEPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPublicKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.Composer;
import org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimePrivateKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimePrivateKeyParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.saber.SABERPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.BDS;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSUtil;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2PrivateKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.qtesla.QTESLAPrivateKeyParameters;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Pack;

public class PrivateKeyInfoFactory {
  public static PrivateKeyInfo createPrivateKeyInfo(AsymmetricKeyParameter paramAsymmetricKeyParameter) throws IOException {
    return createPrivateKeyInfo(paramAsymmetricKeyParameter, null);
  }
  
  public static PrivateKeyInfo createPrivateKeyInfo(AsymmetricKeyParameter paramAsymmetricKeyParameter, ASN1Set paramASN1Set) throws IOException {
    if (paramAsymmetricKeyParameter instanceof QTESLAPrivateKeyParameters) {
      QTESLAPrivateKeyParameters qTESLAPrivateKeyParameters = (QTESLAPrivateKeyParameters)paramAsymmetricKeyParameter;
      AlgorithmIdentifier algorithmIdentifier = Utils.qTeslaLookupAlgID(qTESLAPrivateKeyParameters.getSecurityCategory());
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(qTESLAPrivateKeyParameters.getSecret()), paramASN1Set);
    } 
    if (paramAsymmetricKeyParameter instanceof SPHINCSPrivateKeyParameters) {
      SPHINCSPrivateKeyParameters sPHINCSPrivateKeyParameters = (SPHINCSPrivateKeyParameters)paramAsymmetricKeyParameter;
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PQCObjectIdentifiers.sphincs256, (ASN1Encodable)new SPHINCS256KeyParams(Utils.sphincs256LookupTreeAlgID(sPHINCSPrivateKeyParameters.getTreeDigest())));
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(sPHINCSPrivateKeyParameters.getKeyData()));
    } 
    if (paramAsymmetricKeyParameter instanceof NHPrivateKeyParameters) {
      NHPrivateKeyParameters nHPrivateKeyParameters = (NHPrivateKeyParameters)paramAsymmetricKeyParameter;
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PQCObjectIdentifiers.newHope);
      short[] arrayOfShort = nHPrivateKeyParameters.getSecData();
      byte[] arrayOfByte = new byte[arrayOfShort.length * 2];
      for (byte b = 0; b != arrayOfShort.length; b++)
        Pack.shortToLittleEndian(arrayOfShort[b], arrayOfByte, b * 2); 
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(arrayOfByte));
    } 
    if (paramAsymmetricKeyParameter instanceof LMSPrivateKeyParameters) {
      LMSPrivateKeyParameters lMSPrivateKeyParameters = (LMSPrivateKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte1 = Composer.compose().u32str(1).bytes((Encodable)lMSPrivateKeyParameters).build();
      byte[] arrayOfByte2 = Composer.compose().u32str(1).bytes((Encodable)lMSPrivateKeyParameters.getPublicKey()).build();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig);
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(arrayOfByte1), paramASN1Set, arrayOfByte2);
    } 
    if (paramAsymmetricKeyParameter instanceof HSSPrivateKeyParameters) {
      HSSPrivateKeyParameters hSSPrivateKeyParameters = (HSSPrivateKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte1 = Composer.compose().u32str(hSSPrivateKeyParameters.getL()).bytes((Encodable)hSSPrivateKeyParameters).build();
      byte[] arrayOfByte2 = Composer.compose().u32str(hSSPrivateKeyParameters.getL()).bytes((Encodable)hSSPrivateKeyParameters.getPublicKey().getLMSPublicKey()).build();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig);
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(arrayOfByte1), paramASN1Set, arrayOfByte2);
    } 
    if (paramAsymmetricKeyParameter instanceof SPHINCSPlusPrivateKeyParameters) {
      SPHINCSPlusPrivateKeyParameters sPHINCSPlusPrivateKeyParameters = (SPHINCSPlusPrivateKeyParameters)paramAsymmetricKeyParameter;
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.sphincsPlusOidLookup(sPHINCSPlusPrivateKeyParameters.getParameters()));
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(sPHINCSPlusPrivateKeyParameters.getEncoded()), paramASN1Set, sPHINCSPlusPrivateKeyParameters.getPublicKey());
    } 
    if (paramAsymmetricKeyParameter instanceof PicnicPrivateKeyParameters) {
      PicnicPrivateKeyParameters picnicPrivateKeyParameters = (PicnicPrivateKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte = picnicPrivateKeyParameters.getEncoded();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.picnicOidLookup(picnicPrivateKeyParameters.getParameters()));
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(arrayOfByte), paramASN1Set);
    } 
    if (paramAsymmetricKeyParameter instanceof CMCEPrivateKeyParameters) {
      CMCEPrivateKeyParameters cMCEPrivateKeyParameters = (CMCEPrivateKeyParameters)paramAsymmetricKeyParameter;
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.mcElieceOidLookup(cMCEPrivateKeyParameters.getParameters()));
      CMCEPublicKey cMCEPublicKey = new CMCEPublicKey(cMCEPrivateKeyParameters.reconstructPublicKey());
      CMCEPrivateKey cMCEPrivateKey = new CMCEPrivateKey(0, cMCEPrivateKeyParameters.getDelta(), cMCEPrivateKeyParameters.getC(), cMCEPrivateKeyParameters.getG(), cMCEPrivateKeyParameters.getAlpha(), cMCEPrivateKeyParameters.getS(), cMCEPublicKey);
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)cMCEPrivateKey, paramASN1Set);
    } 
    if (paramAsymmetricKeyParameter instanceof XMSSPrivateKeyParameters) {
      XMSSPrivateKeyParameters xMSSPrivateKeyParameters = (XMSSPrivateKeyParameters)paramAsymmetricKeyParameter;
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PQCObjectIdentifiers.xmss, (ASN1Encodable)new XMSSKeyParams(xMSSPrivateKeyParameters.getParameters().getHeight(), Utils.xmssLookupTreeAlgID(xMSSPrivateKeyParameters.getTreeDigest())));
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)xmssCreateKeyStructure(xMSSPrivateKeyParameters), paramASN1Set);
    } 
    if (paramAsymmetricKeyParameter instanceof XMSSMTPrivateKeyParameters) {
      XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters = (XMSSMTPrivateKeyParameters)paramAsymmetricKeyParameter;
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PQCObjectIdentifiers.xmss_mt, (ASN1Encodable)new XMSSMTKeyParams(xMSSMTPrivateKeyParameters.getParameters().getHeight(), xMSSMTPrivateKeyParameters.getParameters().getLayers(), Utils.xmssLookupTreeAlgID(xMSSMTPrivateKeyParameters.getTreeDigest())));
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)xmssmtCreateKeyStructure(xMSSMTPrivateKeyParameters), paramASN1Set);
    } 
    if (paramAsymmetricKeyParameter instanceof McElieceCCA2PrivateKeyParameters) {
      McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters = (McElieceCCA2PrivateKeyParameters)paramAsymmetricKeyParameter;
      McElieceCCA2PrivateKey mcElieceCCA2PrivateKey = new McElieceCCA2PrivateKey(mcElieceCCA2PrivateKeyParameters.getN(), mcElieceCCA2PrivateKeyParameters.getK(), mcElieceCCA2PrivateKeyParameters.getField(), mcElieceCCA2PrivateKeyParameters.getGoppaPoly(), mcElieceCCA2PrivateKeyParameters.getP(), Utils.getAlgorithmIdentifier(mcElieceCCA2PrivateKeyParameters.getDigest()));
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PQCObjectIdentifiers.mcElieceCca2);
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)mcElieceCCA2PrivateKey);
    } 
    if (paramAsymmetricKeyParameter instanceof FrodoPrivateKeyParameters) {
      FrodoPrivateKeyParameters frodoPrivateKeyParameters = (FrodoPrivateKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte = frodoPrivateKeyParameters.getEncoded();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.frodoOidLookup(frodoPrivateKeyParameters.getParameters()));
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(arrayOfByte), paramASN1Set);
    } 
    if (paramAsymmetricKeyParameter instanceof SABERPrivateKeyParameters) {
      SABERPrivateKeyParameters sABERPrivateKeyParameters = (SABERPrivateKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte = sABERPrivateKeyParameters.getEncoded();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.saberOidLookup(sABERPrivateKeyParameters.getParameters()));
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(arrayOfByte), paramASN1Set);
    } 
    if (paramAsymmetricKeyParameter instanceof NTRUPrivateKeyParameters) {
      NTRUPrivateKeyParameters nTRUPrivateKeyParameters = (NTRUPrivateKeyParameters)paramAsymmetricKeyParameter;
      byte[] arrayOfByte = nTRUPrivateKeyParameters.getEncoded();
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.ntruOidLookup(nTRUPrivateKeyParameters.getParameters()));
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(arrayOfByte), paramASN1Set);
    } 
    if (paramAsymmetricKeyParameter instanceof FalconPrivateKeyParameters) {
      FalconPrivateKeyParameters falconPrivateKeyParameters = (FalconPrivateKeyParameters)paramAsymmetricKeyParameter;
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.falconOidLookup(falconPrivateKeyParameters.getParameters()));
      FalconPublicKey falconPublicKey = new FalconPublicKey(falconPrivateKeyParameters.getPublicKey());
      FalconPrivateKey falconPrivateKey = new FalconPrivateKey(0, falconPrivateKeyParameters.getSpolyf(), falconPrivateKeyParameters.getG(), falconPrivateKeyParameters.getSpolyF(), falconPublicKey);
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)falconPrivateKey, paramASN1Set);
    } 
    if (paramAsymmetricKeyParameter instanceof KyberPrivateKeyParameters) {
      KyberPrivateKeyParameters kyberPrivateKeyParameters = (KyberPrivateKeyParameters)paramAsymmetricKeyParameter;
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.kyberOidLookup(kyberPrivateKeyParameters.getParameters()));
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(kyberPrivateKeyParameters.getEncoded()), paramASN1Set);
    } 
    if (paramAsymmetricKeyParameter instanceof NTRULPRimePrivateKeyParameters) {
      NTRULPRimePrivateKeyParameters nTRULPRimePrivateKeyParameters = (NTRULPRimePrivateKeyParameters)paramAsymmetricKeyParameter;
      ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
      aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(nTRULPRimePrivateKeyParameters.getEnca()));
      aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(nTRULPRimePrivateKeyParameters.getPk()));
      aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(nTRULPRimePrivateKeyParameters.getRho()));
      aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(nTRULPRimePrivateKeyParameters.getHash()));
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.ntrulprimeOidLookup(nTRULPRimePrivateKeyParameters.getParameters()));
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)new DERSequence(aSN1EncodableVector), paramASN1Set);
    } 
    if (paramAsymmetricKeyParameter instanceof SNTRUPrimePrivateKeyParameters) {
      SNTRUPrimePrivateKeyParameters sNTRUPrimePrivateKeyParameters = (SNTRUPrimePrivateKeyParameters)paramAsymmetricKeyParameter;
      ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
      aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(sNTRUPrimePrivateKeyParameters.getF()));
      aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(sNTRUPrimePrivateKeyParameters.getGinv()));
      aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(sNTRUPrimePrivateKeyParameters.getPk()));
      aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(sNTRUPrimePrivateKeyParameters.getRho()));
      aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(sNTRUPrimePrivateKeyParameters.getHash()));
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.sntruprimeOidLookup(sNTRUPrimePrivateKeyParameters.getParameters()));
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)new DERSequence(aSN1EncodableVector), paramASN1Set);
    } 
    if (paramAsymmetricKeyParameter instanceof DilithiumPrivateKeyParameters) {
      DilithiumPrivateKeyParameters dilithiumPrivateKeyParameters = (DilithiumPrivateKeyParameters)paramAsymmetricKeyParameter;
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.dilithiumOidLookup(dilithiumPrivateKeyParameters.getParameters()));
      DilithiumPublicKeyParameters dilithiumPublicKeyParameters = dilithiumPrivateKeyParameters.getPublicKeyParameters();
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(dilithiumPrivateKeyParameters.getEncoded()), paramASN1Set, dilithiumPublicKeyParameters.getEncoded());
    } 
    if (paramAsymmetricKeyParameter instanceof BIKEPrivateKeyParameters) {
      BIKEPrivateKeyParameters bIKEPrivateKeyParameters = (BIKEPrivateKeyParameters)paramAsymmetricKeyParameter;
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.bikeOidLookup(bIKEPrivateKeyParameters.getParameters()));
      byte[] arrayOfByte = bIKEPrivateKeyParameters.getEncoded();
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(arrayOfByte), paramASN1Set);
    } 
    if (paramAsymmetricKeyParameter instanceof HQCPrivateKeyParameters) {
      HQCPrivateKeyParameters hQCPrivateKeyParameters = (HQCPrivateKeyParameters)paramAsymmetricKeyParameter;
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.hqcOidLookup(hQCPrivateKeyParameters.getParameters()));
      byte[] arrayOfByte = hQCPrivateKeyParameters.getEncoded();
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(arrayOfByte), paramASN1Set);
    } 
    if (paramAsymmetricKeyParameter instanceof RainbowPrivateKeyParameters) {
      RainbowPrivateKeyParameters rainbowPrivateKeyParameters = (RainbowPrivateKeyParameters)paramAsymmetricKeyParameter;
      AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.rainbowOidLookup(rainbowPrivateKeyParameters.getParameters()));
      byte[] arrayOfByte = rainbowPrivateKeyParameters.getEncoded();
      return new PrivateKeyInfo(algorithmIdentifier, (ASN1Encodable)new DEROctetString(arrayOfByte), paramASN1Set);
    } 
    throw new IOException("key parameters not recognized");
  }
  
  private static XMSSPrivateKey xmssCreateKeyStructure(XMSSPrivateKeyParameters paramXMSSPrivateKeyParameters) throws IOException {
    byte[] arrayOfByte1 = paramXMSSPrivateKeyParameters.getEncoded();
    int i = paramXMSSPrivateKeyParameters.getParameters().getTreeDigestSize();
    int j = paramXMSSPrivateKeyParameters.getParameters().getHeight();
    byte b = 4;
    int k = i;
    int m = i;
    int n = i;
    int i1 = i;
    int i2 = 0;
    int i3 = (int)XMSSUtil.bytesToXBigEndian(arrayOfByte1, i2, b);
    if (!XMSSUtil.isIndexValid(j, i3))
      throw new IllegalArgumentException("index out of bounds"); 
    i2 += b;
    byte[] arrayOfByte2 = XMSSUtil.extractBytesAtOffset(arrayOfByte1, i2, k);
    i2 += k;
    byte[] arrayOfByte3 = XMSSUtil.extractBytesAtOffset(arrayOfByte1, i2, m);
    i2 += m;
    byte[] arrayOfByte4 = XMSSUtil.extractBytesAtOffset(arrayOfByte1, i2, n);
    i2 += n;
    byte[] arrayOfByte5 = XMSSUtil.extractBytesAtOffset(arrayOfByte1, i2, i1);
    i2 += i1;
    byte[] arrayOfByte6 = XMSSUtil.extractBytesAtOffset(arrayOfByte1, i2, arrayOfByte1.length - i2);
    BDS bDS = null;
    try {
      bDS = (BDS)XMSSUtil.deserialize(arrayOfByte6, BDS.class);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new IOException("cannot parse BDS: " + classNotFoundException.getMessage());
    } 
    return (bDS.getMaxIndex() != (1 << j) - 1) ? new XMSSPrivateKey(i3, arrayOfByte2, arrayOfByte3, arrayOfByte4, arrayOfByte5, arrayOfByte6, bDS.getMaxIndex()) : new XMSSPrivateKey(i3, arrayOfByte2, arrayOfByte3, arrayOfByte4, arrayOfByte5, arrayOfByte6);
  }
  
  private static XMSSMTPrivateKey xmssmtCreateKeyStructure(XMSSMTPrivateKeyParameters paramXMSSMTPrivateKeyParameters) throws IOException {
    byte[] arrayOfByte1 = paramXMSSMTPrivateKeyParameters.getEncoded();
    int i = paramXMSSMTPrivateKeyParameters.getParameters().getTreeDigestSize();
    int j = paramXMSSMTPrivateKeyParameters.getParameters().getHeight();
    int k = (j + 7) / 8;
    int m = i;
    int n = i;
    int i1 = i;
    int i2 = i;
    int i3 = 0;
    int i4 = (int)XMSSUtil.bytesToXBigEndian(arrayOfByte1, i3, k);
    if (!XMSSUtil.isIndexValid(j, i4))
      throw new IllegalArgumentException("index out of bounds"); 
    i3 += k;
    byte[] arrayOfByte2 = XMSSUtil.extractBytesAtOffset(arrayOfByte1, i3, m);
    i3 += m;
    byte[] arrayOfByte3 = XMSSUtil.extractBytesAtOffset(arrayOfByte1, i3, n);
    i3 += n;
    byte[] arrayOfByte4 = XMSSUtil.extractBytesAtOffset(arrayOfByte1, i3, i1);
    i3 += i1;
    byte[] arrayOfByte5 = XMSSUtil.extractBytesAtOffset(arrayOfByte1, i3, i2);
    i3 += i2;
    byte[] arrayOfByte6 = XMSSUtil.extractBytesAtOffset(arrayOfByte1, i3, arrayOfByte1.length - i3);
    BDSStateMap bDSStateMap = null;
    try {
      bDSStateMap = (BDSStateMap)XMSSUtil.deserialize(arrayOfByte6, BDSStateMap.class);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new IOException("cannot parse BDSStateMap: " + classNotFoundException.getMessage());
    } 
    return (bDSStateMap.getMaxIndex() != (1L << j) - 1L) ? new XMSSMTPrivateKey(i4, arrayOfByte2, arrayOfByte3, arrayOfByte4, arrayOfByte5, arrayOfByte6, bDSStateMap.getMaxIndex()) : new XMSSMTPrivateKey(i4, arrayOfByte2, arrayOfByte3, arrayOfByte4, arrayOfByte5, arrayOfByte6);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypt\\util\PrivateKeyInfoFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */