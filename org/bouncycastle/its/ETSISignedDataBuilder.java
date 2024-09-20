package org.bouncycastle.its;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.its.operator.ECDSAEncoder;
import org.bouncycastle.its.operator.ITSContentSigner;
import org.bouncycastle.oer.Element;
import org.bouncycastle.oer.OEREncoder;
import org.bouncycastle.oer.its.ieee1609dot2.Certificate;
import org.bouncycastle.oer.its.ieee1609dot2.HashedData;
import org.bouncycastle.oer.its.ieee1609dot2.HeaderInfo;
import org.bouncycastle.oer.its.ieee1609dot2.Ieee1609Dot2Content;
import org.bouncycastle.oer.its.ieee1609dot2.Ieee1609Dot2Data;
import org.bouncycastle.oer.its.ieee1609dot2.Opaque;
import org.bouncycastle.oer.its.ieee1609dot2.SequenceOfCertificate;
import org.bouncycastle.oer.its.ieee1609dot2.SignedData;
import org.bouncycastle.oer.its.ieee1609dot2.SignedDataPayload;
import org.bouncycastle.oer.its.ieee1609dot2.SignerIdentifier;
import org.bouncycastle.oer.its.ieee1609dot2.ToBeSignedData;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Psid;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Signature;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Time64;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT8;
import org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2;

public class ETSISignedDataBuilder {
  private static final Element def = IEEE1609dot2.ToBeSignedData.build();
  
  private final HeaderInfo headerInfo;
  
  private Ieee1609Dot2Data data;
  
  private HashedData extDataHash;
  
  private ETSISignedDataBuilder(Psid paramPsid) {
    this(HeaderInfo.builder().setPsid(paramPsid).setGenerationTime(Time64.now()).createHeaderInfo());
  }
  
  private ETSISignedDataBuilder(HeaderInfo paramHeaderInfo) {
    this.headerInfo = paramHeaderInfo;
  }
  
  public static ETSISignedDataBuilder builder(Psid paramPsid) {
    return new ETSISignedDataBuilder(paramPsid);
  }
  
  public static ETSISignedDataBuilder builder(HeaderInfo paramHeaderInfo) {
    return new ETSISignedDataBuilder(paramHeaderInfo);
  }
  
  public ETSISignedDataBuilder setData(Ieee1609Dot2Content paramIeee1609Dot2Content) {
    this.data = Ieee1609Dot2Data.builder().setProtocolVersion(new UINT8(3)).setContent(paramIeee1609Dot2Content).createIeee1609Dot2Data();
    return this;
  }
  
  public ETSISignedDataBuilder setUnsecuredData(byte[] paramArrayOfbyte) {
    this.data = (Ieee1609Dot2Data)Ieee1609Dot2Data.builder().setProtocolVersion(new UINT8(3)).setContent(Ieee1609Dot2Content.unsecuredData(new Opaque(paramArrayOfbyte))).createEtsiTs103097Data();
    return this;
  }
  
  public ETSISignedDataBuilder setExtDataHash(HashedData paramHashedData) {
    this.extDataHash = paramHashedData;
    return this;
  }
  
  private ToBeSignedData getToBeSignedData() {
    SignedDataPayload signedDataPayload = new SignedDataPayload(this.data, this.extDataHash);
    return ToBeSignedData.builder().setPayload(signedDataPayload).setHeaderInfo(this.headerInfo).createToBeSignedData();
  }
  
  public ETSISignedData build(ITSContentSigner paramITSContentSigner) {
    ToBeSignedData toBeSignedData = getToBeSignedData();
    write(paramITSContentSigner.getOutputStream(), OEREncoder.toByteArray((ASN1Encodable)toBeSignedData, def));
    Signature signature = ECDSAEncoder.toITS(paramITSContentSigner.getCurveID(), paramITSContentSigner.getSignature());
    return new ETSISignedData(SignedData.builder().setHashId(ITSAlgorithmUtils.getHashAlgorithm(paramITSContentSigner.getDigestAlgorithm().getAlgorithm())).setTbsData(toBeSignedData).setSigner(SignerIdentifier.self()).setSignature(signature).createSignedData());
  }
  
  public ETSISignedData build(ITSContentSigner paramITSContentSigner, List<ITSCertificate> paramList) {
    ToBeSignedData toBeSignedData = getToBeSignedData();
    write(paramITSContentSigner.getOutputStream(), OEREncoder.toByteArray((ASN1Encodable)toBeSignedData, def));
    ArrayList<Certificate> arrayList = new ArrayList();
    for (ITSCertificate iTSCertificate : paramList)
      arrayList.add(Certificate.getInstance(iTSCertificate.toASN1Structure())); 
    Signature signature = ECDSAEncoder.toITS(paramITSContentSigner.getCurveID(), paramITSContentSigner.getSignature());
    return new ETSISignedData(SignedData.builder().setHashId(ITSAlgorithmUtils.getHashAlgorithm(paramITSContentSigner.getDigestAlgorithm().getAlgorithm())).setTbsData(toBeSignedData).setSigner(SignerIdentifier.certificate(new SequenceOfCertificate(arrayList))).setSignature(signature).createSignedData());
  }
  
  public ETSISignedData build(ITSContentSigner paramITSContentSigner, HashedId8 paramHashedId8) {
    ToBeSignedData toBeSignedData = getToBeSignedData();
    write(paramITSContentSigner.getOutputStream(), OEREncoder.toByteArray((ASN1Encodable)toBeSignedData, def));
    Signature signature = ECDSAEncoder.toITS(paramITSContentSigner.getCurveID(), paramITSContentSigner.getSignature());
    return new ETSISignedData(SignedData.builder().setHashId(ITSAlgorithmUtils.getHashAlgorithm(paramITSContentSigner.getDigestAlgorithm().getAlgorithm())).setTbsData(toBeSignedData).setSigner(SignerIdentifier.digest(paramHashedId8)).setSignature(signature).createSignedData());
  }
  
  private static void write(OutputStream paramOutputStream, byte[] paramArrayOfbyte) {
    try {
      paramOutputStream.write(paramArrayOfbyte);
      paramOutputStream.flush();
      paramOutputStream.close();
    } catch (Exception exception) {
      throw new RuntimeException(exception.getMessage(), exception);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\ETSISignedDataBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */