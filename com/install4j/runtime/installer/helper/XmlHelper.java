/*     */ package com.install4j.runtime.installer.helper;
/*     */ import java.awt.Color;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ import java.io.StringReader;
/*     */ import java.io.StringWriter;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import javax.xml.parsers.DocumentBuilder;
/*     */ import javax.xml.parsers.DocumentBuilderFactory;
/*     */ import javax.xml.parsers.ParserConfigurationException;
/*     */ import javax.xml.transform.Transformer;
/*     */ import javax.xml.transform.TransformerException;
/*     */ import javax.xml.transform.TransformerFactory;
/*     */ import javax.xml.transform.dom.DOMSource;
/*     */ import javax.xml.transform.stream.StreamResult;
/*     */ import javax.xml.xpath.XPathFactory;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.DocumentType;
/*     */ import org.w3c.dom.Element;
/*     */ import org.w3c.dom.Node;
/*     */ import org.w3c.dom.NodeList;
/*     */ import org.xml.sax.InputSource;
/*     */ import org.xml.sax.SAXException;
/*     */ import org.xml.sax.SAXParseException;
/*     */ 
/*     */ public class XmlHelper {
/*     */   public static Document createDocument() throws IOException {
/*     */     try {
/*  33 */       return createDocumentBuilderFactory().newDocumentBuilder().newDocument();
/*  34 */     } catch (ParserConfigurationException e) {
/*  35 */       throw createIoException(e);
/*     */     } 
/*     */   }
/*     */   private static Transformer stringTransformer;
/*     */   public static Document parseFile(File file) throws IOException {
/*  40 */     return parseFile(file, false, false);
/*     */   }
/*     */   
/*     */   public static Document parseFile(File file, boolean validating, boolean downloadExternalEntities) throws IOException {
/*  44 */     return parse(new InputSource(file.toURI().toASCIIString()), validating, downloadExternalEntities);
/*     */   }
/*     */   
/*     */   public static Document parse(byte[] data) throws IOException {
/*  48 */     return parse(new InputSource(new ByteArrayInputStream(data)), false, false);
/*     */   }
/*     */   private static Document parse(InputSource inputSource, boolean validating, boolean downloadExternalEntities) throws IOException {
/*     */     DocumentBuilder documentBuilder;
/*  52 */     DocumentBuilderFactory documentBuilderFactory = createDocumentBuilderFactory();
/*  53 */     documentBuilderFactory.setValidating(validating);
/*     */     
/*     */     try {
/*  56 */       documentBuilder = documentBuilderFactory.newDocumentBuilder();
/*  57 */     } catch (ParserConfigurationException e) {
/*  58 */       throw createIoException(e);
/*     */     } 
/*  60 */     if (validating) {
/*  61 */       documentBuilder.setErrorHandler(new ErrorHandler()
/*     */           {
/*     */             public void error(SAXParseException exception) throws SAXException {
/*  64 */               XmlHelper.log(exception);
/*     */             }
/*     */ 
/*     */             
/*     */             public void fatalError(SAXParseException exception) throws SAXException {
/*  69 */               XmlHelper.log(exception);
/*     */             }
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             public void warning(SAXParseException exception) throws SAXException {}
/*     */           });
/*     */     }
/*  78 */     if (!downloadExternalEntities) {
/*  79 */       documentBuilder.setEntityResolver((publicId, systemId) -> new InputSource(new StringReader("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")));
/*     */     }
/*     */     
/*     */     try {
/*  83 */       return documentBuilder.parse(inputSource);
/*  84 */     } catch (SAXException e) {
/*  85 */       throw createIoException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static Document parseString(String string, boolean validating, boolean downloadExternalEntities) throws IOException {
/*  90 */     return parse(new InputSource(new StringReader(string)), validating, downloadExternalEntities);
/*     */   }
/*     */   
/*     */   public static TransformerFactory createTransformerFactory() {
/*     */     try {
/*  95 */       return TransformerFactory.newInstance("com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl", null);
/*  96 */     } catch (Throwable t) {
/*  97 */       return TransformerFactory.newInstance();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static DocumentBuilderFactory createDocumentBuilderFactory() {
/*     */     try {
/* 103 */       return DocumentBuilderFactory.newInstance("com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl", null);
/* 104 */     } catch (Throwable t) {
/* 105 */       return DocumentBuilderFactory.newInstance();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void writeFile(File file, Document doc) throws IOException {
/*     */     try {
/* 111 */       writeFile(file, doc, createTransformerFactory().newTransformer(getWhitespaceFormattingStylesheet()));
/* 112 */     } catch (TransformerException e) {
/* 113 */       throw createIoException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void writeFile(File file, Document doc, Transformer transformer) throws IOException {
/* 118 */     FileOutputStream fos = new FileOutputStream(file);
/* 119 */     writeToStream(doc, transformer, fos);
/*     */   }
/*     */   
/*     */   public static byte[] getBytes(Document doc) throws IOException {
/*     */     try {
/* 124 */       ByteArrayOutputStream out = new ByteArrayOutputStream();
/* 125 */       writeToStream(doc, createTransformerFactory().newTransformer(getWhitespaceFormattingStylesheet()), out);
/* 126 */       return out.toByteArray();
/* 127 */     } catch (TransformerException e) {
/* 128 */       throw createIoException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void writeToStream(Document doc, Transformer transformer, OutputStream out) throws IOException {
/* 133 */     transformer.setErrorListener(new ErrorListener()
/*     */         {
/*     */           public void error(TransformerException exception) throws TransformerException {
/* 136 */             XmlHelper.log(exception);
/*     */           }
/*     */ 
/*     */           
/*     */           public void fatalError(TransformerException exception) throws TransformerException {
/* 141 */             XmlHelper.log(exception);
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           public void warning(TransformerException exception) throws TransformerException {}
/*     */         });
/* 149 */     transformer.setOutputProperty("doctype-public", "yes");
/* 150 */     DocumentType docType = doc.getDoctype();
/* 151 */     if (docType != null && docType.getSystemId() != null) {
/* 152 */       transformer.setOutputProperty("doctype-system", docType.getSystemId());
/* 153 */       String publicId = docType.getPublicId();
/* 154 */       if (publicId != null && publicId.trim().length() > 0) {
/* 155 */         transformer.setOutputProperty("doctype-public", publicId);
/*     */       }
/*     */     } 
/*     */     
/*     */     try {
/* 160 */       transformer.transform(new DOMSource(doc), new StreamResult(out));
/* 161 */     } catch (TransformerException e) {
/* 162 */       throw createIoException(e);
/*     */     } finally {
/*     */       try {
/* 165 */         out.close();
/* 166 */       } catch (IOException iOException) {}
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static String getString(Element element) throws IOException {
/* 172 */     StringWriter writer = new StringWriter();
/*     */     try {
/* 174 */       if (stringTransformer == null) {
/* 175 */         stringTransformer = createTransformerFactory().newTransformer();
/* 176 */         stringTransformer.setOutputProperty("indent", "no");
/* 177 */         stringTransformer.setOutputProperty("omit-xml-declaration", "yes");
/* 178 */         stringTransformer.setOutputProperty("encoding", "UTF-8");
/*     */       } 
/* 180 */       stringTransformer.transform(new DOMSource(element), new StreamResult(writer));
/* 181 */       return writer.toString();
/* 182 */     } catch (TransformerException e) {
/* 183 */       throw createIoException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static Element findChild(Element element, String elementName) {
/* 188 */     NodeList nodeList = element.getChildNodes();
/* 189 */     int nodeListLength = nodeList.getLength();
/* 190 */     if (nodeListLength != 0) {
/* 191 */       for (int i = 0; i < nodeListLength; i++) {
/* 192 */         Node node = nodeList.item(i);
/* 193 */         if (node instanceof Element) {
/* 194 */           Element childElement = (Element)node;
/* 195 */           if (elementName == null || childElement.getTagName().equals(elementName)) {
/* 196 */             return childElement;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 202 */     return null;
/*     */   }
/*     */   
/*     */   public static List<Element> childElements(Element parentElement) {
/* 206 */     if (parentElement == null) {
/* 207 */       return Collections.emptyList();
/*     */     }
/* 209 */     NodeList nodeList = parentElement.getChildNodes();
/* 210 */     int nodeListLength = nodeList.getLength();
/* 211 */     List<Element> childElements = new ArrayList<>(nodeListLength);
/* 212 */     for (int i = 0; i < nodeListLength; i++) {
/* 213 */       Node node = nodeList.item(i);
/* 214 */       if (node instanceof Element) {
/* 215 */         childElements.add((Element)node);
/*     */       }
/*     */     } 
/* 218 */     return childElements;
/*     */   }
/*     */   
/*     */   public static String readAttribute(Element element, String attributeName, String defaultValue) {
/* 222 */     if (!element.hasAttribute(attributeName)) {
/* 223 */       attributeName = attributeName.toUpperCase(Locale.ENGLISH);
/*     */     }
/* 225 */     if (element.hasAttribute(attributeName)) {
/* 226 */       return element.getAttribute(attributeName);
/*     */     }
/* 228 */     return defaultValue;
/*     */   }
/*     */ 
/*     */   
/*     */   public static String readFileAttribute(Element element, String attributeName, String defaultValue) {
/* 233 */     if (!element.hasAttribute(attributeName)) {
/* 234 */       attributeName = attributeName.toUpperCase(Locale.ENGLISH);
/*     */     }
/* 236 */     if (element.hasAttribute(attributeName)) {
/* 237 */       return element.getAttribute(attributeName).replace('\\', File.separatorChar).replace('/', File.separatorChar);
/*     */     }
/* 239 */     return defaultValue;
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean readAttribute(Element element, String attributeName, boolean defaultValue) {
/* 244 */     if (!element.hasAttribute(attributeName)) {
/* 245 */       attributeName = attributeName.toUpperCase(Locale.ENGLISH);
/*     */     }
/* 247 */     if (element.hasAttribute(attributeName)) {
/* 248 */       return Boolean.parseBoolean(element.getAttribute(attributeName));
/*     */     }
/* 250 */     return defaultValue;
/*     */   }
/*     */ 
/*     */   
/*     */   public static int readAttribute(Element element, String attributeName, int defaultValue) {
/* 255 */     if (!element.hasAttribute(attributeName)) {
/* 256 */       attributeName = attributeName.toUpperCase(Locale.ENGLISH);
/*     */     }
/* 258 */     if (element.hasAttribute(attributeName)) {
/* 259 */       return Integer.parseInt(element.getAttribute(attributeName));
/*     */     }
/* 261 */     return defaultValue;
/*     */   }
/*     */ 
/*     */   
/*     */   public static long readAttribute(Element element, String attributeName, long defaultValue) {
/* 266 */     if (!element.hasAttribute(attributeName)) {
/* 267 */       attributeName = attributeName.toUpperCase(Locale.ENGLISH);
/*     */     }
/* 269 */     if (element.hasAttribute(attributeName)) {
/* 270 */       return Long.parseLong(element.getAttribute(attributeName));
/*     */     }
/* 272 */     return defaultValue;
/*     */   }
/*     */ 
/*     */   
/*     */   public static Color readAttribute(Element element, String attributeName, Color defaultValue) {
/* 277 */     if (!element.hasAttribute(attributeName)) {
/* 278 */       attributeName = attributeName.toUpperCase(Locale.ENGLISH);
/*     */     }
/* 280 */     if (element.hasAttribute(attributeName)) {
/* 281 */       String value = element.getAttribute(attributeName);
/* 282 */       if (value.length() > 0) {
/* 283 */         return new Color(Integer.parseInt(value));
/*     */       }
/* 285 */       return null;
/*     */     } 
/*     */     
/* 288 */     return defaultValue;
/*     */   }
/*     */ 
/*     */   
/*     */   public static <E extends Enum & XMLEnum<E>> E readAttribute(Element element, String attributeName, E defaultValue) {
/* 293 */     String value = element.getAttribute(attributeName);
/* 294 */     if (value == null || value.trim().length() == 0) {
/* 295 */       return defaultValue;
/*     */     }
/* 297 */     for (Enum enum_ : ((XMLEnum)defaultValue).getXMLEnums()) {
/* 298 */       if (Objects.equals(((XMLEnum)enum_).getXMLValue(), value)) {
/* 299 */         return (E)enum_;
/*     */       }
/*     */     } 
/* 302 */     return defaultValue;
/*     */   }
/*     */   
/*     */   public static String getTextValue(Element childElement) {
/* 306 */     if (childElement == null) {
/* 307 */       return "";
/*     */     }
/* 309 */     Node textNode = childElement.getFirstChild();
/* 310 */     return (textNode == null) ? "" : textNode.getNodeValue();
/*     */   }
/*     */ 
/*     */   
/*     */   private static IOException createIoException(Exception e) {
/* 315 */     return new IOException(e);
/*     */   }
/*     */   
/*     */   private static void log(Exception exception) {
/* 319 */     Logger.getInstance().error(null, exception.getMessage());
/*     */   }
/*     */   
/*     */   public static NodeList getNodeList(Document doc, String xpathExpression) {
/* 323 */     XPathFactory factory = XPathFactory.newInstance();
/*     */     
/* 325 */     XPath xpath = factory.newXPath();
/*     */     try {
/* 327 */       XPathExpression expression = xpath.compile(xpathExpression);
/* 328 */       return (NodeList)expression.evaluate(doc, XPathConstants.NODESET);
/* 329 */     } catch (XPathExpressionException e) {
/* 330 */       Logger.getInstance().log(e);
/*     */       
/* 332 */       return null;
/*     */     } 
/*     */   }
/*     */   public static String escapeXmlText(String target) {
/* 336 */     if (target != null) {
/*     */       try {
/* 338 */         Document document = createDocument();
/* 339 */         Text text = document.createTextNode(target);
/* 340 */         Transformer transformer = createTransformerFactory().newTransformer();
/* 341 */         DOMSource source = new DOMSource(text);
/* 342 */         StringWriter writer = new StringWriter();
/* 343 */         StreamResult result = new StreamResult(writer);
/* 344 */         transformer.setOutputProperty("omit-xml-declaration", "yes");
/* 345 */         transformer.transform(source, result);
/* 346 */         return writer.toString();
/* 347 */       } catch (TransformerException|IOException e) {
/* 348 */         e.printStackTrace();
/*     */       } 
/*     */     }
/* 351 */     return target;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static StreamSource getWhitespaceFormattingStylesheet() {
/* 356 */     return new StreamSource(new StringReader("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<xsl:stylesheet version=\"1.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\" xmlns:xalan=\"http://xml.apache.org/xslt\" xmlns=\"\">\n  <xsl:strip-space elements=\"*\"/>\n  <xsl:output method=\"xml\" indent=\"yes\" xalan:indent-amount=\"2\"/>\n  <xsl:template match=\"@*|node()\">\n    <xsl:copy>\n      <xsl:apply-templates select=\"@*|node()\"/>\n    </xsl:copy>\n  </xsl:template>\n</xsl:stylesheet>"));
/*     */   }
/*     */   
/*     */   public static interface XmlElementVisitor {
/*     */     void visit(Element param1Element);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\XmlHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */