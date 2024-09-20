package org.bouncycastle.cms;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BERSequenceGenerator;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cms.AuthenticatedData;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.OutputAEADEncryptor;

public class CMSAuthEnvelopedDataStreamGenerator extends CMSAuthEnvelopedGenerator {
  private int _bufferSize;
  
  private boolean _berEncodeRecipientSet;
  
  public void setBufferSize(int paramInt) {
    this._bufferSize = paramInt;
  }
  
  public void setBEREncodeRecipients(boolean paramBoolean) {
    this._berEncodeRecipientSet = paramBoolean;
  }
  
  private OutputStream doOpen(ASN1ObjectIdentifier paramASN1ObjectIdentifier, OutputStream paramOutputStream, OutputAEADEncryptor paramOutputAEADEncryptor) throws IOException, CMSException {
    ASN1EncodableVector aSN1EncodableVector = CMSUtils.getRecipentInfos(paramOutputAEADEncryptor.getKey(), this.recipientInfoGenerators);
    return open(paramASN1ObjectIdentifier, paramOutputStream, aSN1EncodableVector, paramOutputAEADEncryptor);
  }
  
  protected OutputStream open(ASN1ObjectIdentifier paramASN1ObjectIdentifier, OutputStream paramOutputStream, ASN1EncodableVector paramASN1EncodableVector, OutputAEADEncryptor paramOutputAEADEncryptor) throws IOException {
    BERSequenceGenerator bERSequenceGenerator1 = new BERSequenceGenerator(paramOutputStream);
    bERSequenceGenerator1.addObject((ASN1Primitive)CMSObjectIdentifiers.authEnvelopedData);
    BERSequenceGenerator bERSequenceGenerator2 = new BERSequenceGenerator(bERSequenceGenerator1.getRawOutputStream(), 0, true);
    bERSequenceGenerator2.addObject((ASN1Primitive)new ASN1Integer(AuthenticatedData.calculateVersion(this.originatorInfo)));
    CMSUtils.addOriginatorInfoToGenerator(bERSequenceGenerator2, this.originatorInfo);
    CMSUtils.addRecipientInfosToGenerator(paramASN1EncodableVector, bERSequenceGenerator2, this._berEncodeRecipientSet);
    BERSequenceGenerator bERSequenceGenerator3 = new BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
    bERSequenceGenerator3.addObject((ASN1Primitive)paramASN1ObjectIdentifier);
    AlgorithmIdentifier algorithmIdentifier = paramOutputAEADEncryptor.getAlgorithmIdentifier();
    bERSequenceGenerator3.getRawOutputStream().write(algorithmIdentifier.getEncoded());
    OutputStream outputStream = CMSUtils.createBEROctetOutputStream(bERSequenceGenerator3.getRawOutputStream(), 0, true, this._bufferSize);
    return new CMSAuthEnvelopedDataOutputStream(paramOutputAEADEncryptor, outputStream, bERSequenceGenerator1, bERSequenceGenerator2, bERSequenceGenerator3);
  }
  
  protected OutputStream open(OutputStream paramOutputStream, ASN1EncodableVector paramASN1EncodableVector, OutputAEADEncryptor paramOutputAEADEncryptor) throws CMSException {
    try {
      return open(CMSObjectIdentifiers.data, paramOutputStream, paramASN1EncodableVector, paramOutputAEADEncryptor);
    } catch (IOException iOException) {
      throw new CMSException("exception decoding algorithm parameters.", iOException);
    } 
  }
  
  public OutputStream open(OutputStream paramOutputStream, OutputAEADEncryptor paramOutputAEADEncryptor) throws CMSException, IOException {
    return doOpen(new ASN1ObjectIdentifier(CMSObjectIdentifiers.data.getId()), paramOutputStream, paramOutputAEADEncryptor);
  }
  
  private class CMSAuthEnvelopedDataOutputStream extends OutputStream {
    private final OutputAEADEncryptor _encryptor;
    
    private final OutputStream _cOut;
    
    private final OutputStream _octetStream;
    
    private final BERSequenceGenerator _cGen;
    
    private final BERSequenceGenerator _envGen;
    
    private final BERSequenceGenerator _eiGen;
    
    public CMSAuthEnvelopedDataOutputStream(OutputAEADEncryptor param1OutputAEADEncryptor, OutputStream param1OutputStream, BERSequenceGenerator param1BERSequenceGenerator1, BERSequenceGenerator param1BERSequenceGenerator2, BERSequenceGenerator param1BERSequenceGenerator3) {
      this._encryptor = param1OutputAEADEncryptor;
      this._octetStream = param1OutputStream;
      this._cOut = param1OutputAEADEncryptor.getOutputStream(param1OutputStream);
      this._cGen = param1BERSequenceGenerator1;
      this._envGen = param1BERSequenceGenerator2;
      this._eiGen = param1BERSequenceGenerator3;
    }
    
    public void write(int param1Int) throws IOException {
      this._cOut.write(param1Int);
    }
    
    public void write(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) throws IOException {
      this._cOut.write(param1ArrayOfbyte, param1Int1, param1Int2);
    }
    
    public void write(byte[] param1ArrayOfbyte) throws IOException {
      this._cOut.write(param1ArrayOfbyte);
    }
    
    public void close() throws IOException {
      ASN1Set aSN1Set = CMSUtils.processAuthAttrSet(CMSAuthEnvelopedDataStreamGenerator.this.authAttrsGenerator, this._encryptor);
      this._cOut.close();
      this._octetStream.close();
      this._eiGen.close();
      if (aSN1Set != null)
        this._envGen.addObject((ASN1Primitive)new DERTaggedObject(false, 1, (ASN1Encodable)aSN1Set)); 
      this._envGen.addObject((ASN1Primitive)new DEROctetString(this._encryptor.getMAC()));
      CMSUtils.addAttriSetToGenerator(this._envGen, CMSAuthEnvelopedDataStreamGenerator.this.unauthAttrsGenerator, 2, Collections.EMPTY_MAP);
      this._envGen.close();
      this._cGen.close();
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSAuthEnvelopedDataStreamGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */