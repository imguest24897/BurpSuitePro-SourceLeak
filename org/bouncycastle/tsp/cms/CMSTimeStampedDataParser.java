package org.bouncycastle.tsp.cms;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfoParser;
import org.bouncycastle.asn1.cms.TimeStampedDataParser;
import org.bouncycastle.cms.CMSContentInfoParser;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.tsp.TimeStampToken;
import org.bouncycastle.util.io.Streams;

public class CMSTimeStampedDataParser extends CMSContentInfoParser {
  private TimeStampedDataParser timeStampedData;
  
  private TimeStampDataUtil util;
  
  public CMSTimeStampedDataParser(InputStream paramInputStream) throws CMSException {
    super(paramInputStream);
    initialize(this._contentInfo);
  }
  
  public CMSTimeStampedDataParser(byte[] paramArrayOfbyte) throws CMSException {
    this(new ByteArrayInputStream(paramArrayOfbyte));
  }
  
  private void initialize(ContentInfoParser paramContentInfoParser) throws CMSException {
    try {
      if (CMSObjectIdentifiers.timestampedData.equals((ASN1Primitive)paramContentInfoParser.getContentType())) {
        this.timeStampedData = TimeStampedDataParser.getInstance(paramContentInfoParser.getContent(16));
      } else {
        throw new IllegalArgumentException("Malformed content - type must be " + CMSObjectIdentifiers.timestampedData.getId());
      } 
    } catch (IOException iOException) {
      throw new CMSException("parsing exception: " + iOException.getMessage(), iOException);
    } 
  }
  
  public byte[] calculateNextHash(DigestCalculator paramDigestCalculator) throws CMSException {
    return this.util.calculateNextHash(paramDigestCalculator);
  }
  
  public InputStream getContent() {
    return (this.timeStampedData.getContent() != null) ? this.timeStampedData.getContent().getOctetStream() : null;
  }
  
  public URI getDataUri() throws URISyntaxException {
    ASN1IA5String aSN1IA5String = this.timeStampedData.getDataUriIA5();
    return (aSN1IA5String != null) ? new URI(aSN1IA5String.getString()) : null;
  }
  
  public String getFileName() {
    return this.util.getFileName();
  }
  
  public String getMediaType() {
    return this.util.getMediaType();
  }
  
  public AttributeTable getOtherMetaData() {
    return this.util.getOtherMetaData();
  }
  
  public void initialiseMessageImprintDigestCalculator(DigestCalculator paramDigestCalculator) throws CMSException {
    this.util.initialiseMessageImprintDigestCalculator(paramDigestCalculator);
  }
  
  public DigestCalculator getMessageImprintDigestCalculator(DigestCalculatorProvider paramDigestCalculatorProvider) throws OperatorCreationException {
    try {
      parseTimeStamps();
    } catch (CMSException cMSException) {
      throw new OperatorCreationException("unable to extract algorithm ID: " + cMSException.getMessage(), cMSException);
    } 
    return this.util.getMessageImprintDigestCalculator(paramDigestCalculatorProvider);
  }
  
  public TimeStampToken[] getTimeStampTokens() throws CMSException {
    parseTimeStamps();
    return this.util.getTimeStampTokens();
  }
  
  public void validate(DigestCalculatorProvider paramDigestCalculatorProvider, byte[] paramArrayOfbyte) throws ImprintDigestInvalidException, CMSException {
    parseTimeStamps();
    this.util.validate(paramDigestCalculatorProvider, paramArrayOfbyte);
  }
  
  public void validate(DigestCalculatorProvider paramDigestCalculatorProvider, byte[] paramArrayOfbyte, TimeStampToken paramTimeStampToken) throws ImprintDigestInvalidException, CMSException {
    parseTimeStamps();
    this.util.validate(paramDigestCalculatorProvider, paramArrayOfbyte, paramTimeStampToken);
  }
  
  private void parseTimeStamps() throws CMSException {
    try {
      if (this.util == null) {
        InputStream inputStream = getContent();
        if (inputStream != null)
          Streams.drain(inputStream); 
        this.util = new TimeStampDataUtil(this.timeStampedData);
      } 
    } catch (IOException iOException) {
      throw new CMSException("unable to parse evidence block: " + iOException.getMessage(), iOException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\cms\CMSTimeStampedDataParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */