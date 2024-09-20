package org.bouncycastle.cms;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BERSequenceGenerator;
import org.bouncycastle.asn1.DLSet;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.EnvelopedData;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.OutputAEADEncryptor;
import org.bouncycastle.operator.OutputEncryptor;

public class CMSEnvelopedDataStreamGenerator extends CMSEnvelopedGenerator {
  private int _bufferSize;
  
  private boolean _berEncodeRecipientSet;
  
  public void setBufferSize(int paramInt) {
    this._bufferSize = paramInt;
  }
  
  public void setBEREncodeRecipients(boolean paramBoolean) {
    this._berEncodeRecipientSet = paramBoolean;
  }
  
  private ASN1Integer getVersion(ASN1EncodableVector paramASN1EncodableVector) {
    return (this.unprotectedAttributeGenerator != null) ? new ASN1Integer(EnvelopedData.calculateVersion(this.originatorInfo, (ASN1Set)new DLSet(paramASN1EncodableVector), (ASN1Set)new DLSet())) : new ASN1Integer(EnvelopedData.calculateVersion(this.originatorInfo, (ASN1Set)new DLSet(paramASN1EncodableVector), null));
  }
  
  private OutputStream doOpen(ASN1ObjectIdentifier paramASN1ObjectIdentifier, OutputStream paramOutputStream, OutputEncryptor paramOutputEncryptor) throws IOException, CMSException {
    ASN1EncodableVector aSN1EncodableVector = CMSUtils.getRecipentInfos(paramOutputEncryptor.getKey(), this.recipientInfoGenerators);
    return open(paramASN1ObjectIdentifier, paramOutputStream, aSN1EncodableVector, paramOutputEncryptor);
  }
  
  protected OutputStream open(ASN1ObjectIdentifier paramASN1ObjectIdentifier, OutputStream paramOutputStream, ASN1EncodableVector paramASN1EncodableVector, OutputEncryptor paramOutputEncryptor) throws IOException {
    BERSequenceGenerator bERSequenceGenerator1 = new BERSequenceGenerator(paramOutputStream);
    bERSequenceGenerator1.addObject((ASN1Primitive)CMSObjectIdentifiers.envelopedData);
    BERSequenceGenerator bERSequenceGenerator2 = new BERSequenceGenerator(bERSequenceGenerator1.getRawOutputStream(), 0, true);
    bERSequenceGenerator2.addObject((ASN1Primitive)getVersion(paramASN1EncodableVector));
    CMSUtils.addOriginatorInfoToGenerator(bERSequenceGenerator2, this.originatorInfo);
    CMSUtils.addRecipientInfosToGenerator(paramASN1EncodableVector, bERSequenceGenerator2, this._berEncodeRecipientSet);
    BERSequenceGenerator bERSequenceGenerator3 = new BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
    bERSequenceGenerator3.addObject((ASN1Primitive)paramASN1ObjectIdentifier);
    AlgorithmIdentifier algorithmIdentifier = paramOutputEncryptor.getAlgorithmIdentifier();
    bERSequenceGenerator3.getRawOutputStream().write(algorithmIdentifier.getEncoded());
    OutputStream outputStream = CMSUtils.createBEROctetOutputStream(bERSequenceGenerator3.getRawOutputStream(), 0, false, this._bufferSize);
    return new CmsEnvelopedDataOutputStream(paramOutputEncryptor, outputStream, bERSequenceGenerator1, bERSequenceGenerator2, bERSequenceGenerator3);
  }
  
  protected OutputStream open(OutputStream paramOutputStream, ASN1EncodableVector paramASN1EncodableVector, OutputEncryptor paramOutputEncryptor) throws CMSException {
    try {
      return open(CMSObjectIdentifiers.data, paramOutputStream, paramASN1EncodableVector, paramOutputEncryptor);
    } catch (IOException iOException) {
      throw new CMSException("exception decoding algorithm parameters.", iOException);
    } 
  }
  
  public OutputStream open(OutputStream paramOutputStream, OutputEncryptor paramOutputEncryptor) throws CMSException, IOException {
    return doOpen(new ASN1ObjectIdentifier(CMSObjectIdentifiers.data.getId()), paramOutputStream, paramOutputEncryptor);
  }
  
  public OutputStream open(ASN1ObjectIdentifier paramASN1ObjectIdentifier, OutputStream paramOutputStream, OutputEncryptor paramOutputEncryptor) throws CMSException, IOException {
    return doOpen(paramASN1ObjectIdentifier, paramOutputStream, paramOutputEncryptor);
  }
  
  private class CmsEnvelopedDataOutputStream extends OutputStream {
    private final OutputEncryptor _encryptor;
    
    private final OutputStream _cOut;
    
    private OutputStream _octetStream;
    
    private BERSequenceGenerator _cGen;
    
    private BERSequenceGenerator _envGen;
    
    private BERSequenceGenerator _eiGen;
    
    public CmsEnvelopedDataOutputStream(OutputEncryptor param1OutputEncryptor, OutputStream param1OutputStream, BERSequenceGenerator param1BERSequenceGenerator1, BERSequenceGenerator param1BERSequenceGenerator2, BERSequenceGenerator param1BERSequenceGenerator3) {
      this._encryptor = param1OutputEncryptor;
      this._octetStream = param1OutputStream;
      this._cOut = param1OutputEncryptor.getOutputStream(param1OutputStream);
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
      this._cOut.close();
      if (this._encryptor instanceof OutputAEADEncryptor) {
        this._octetStream.write(((OutputAEADEncryptor)this._encryptor).getMAC());
        this._octetStream.close();
      } 
      this._eiGen.close();
      CMSUtils.addAttriSetToGenerator(this._envGen, CMSEnvelopedDataStreamGenerator.this.unprotectedAttributeGenerator, 1, Collections.EMPTY_MAP);
      this._envGen.close();
      this._cGen.close();
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSEnvelopedDataStreamGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */