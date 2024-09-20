/*     */ package com.github.weisj.jsvg.parser;
/*     */ 
/*     */ import com.github.weisj.jsvg.SVGDocument;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.xml.namespace.QName;
/*     */ import javax.xml.stream.XMLEventReader;
/*     */ import javax.xml.stream.XMLInputFactory;
/*     */ import javax.xml.stream.XMLStreamException;
/*     */ import javax.xml.stream.events.Attribute;
/*     */ import javax.xml.stream.events.StartElement;
/*     */ import javax.xml.stream.events.XMLEvent;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class StaxSVGLoader
/*     */ {
/*  45 */   private static final Logger LOGGER = Logger.getLogger(StaxSVGLoader.class.getName()); @NotNull
/*     */   private final NodeSupplier nodeSupplier;
/*     */   @NotNull
/*     */   private final XMLInputFactory xmlInputFactory;
/*     */   
/*     */   public StaxSVGLoader(@NotNull NodeSupplier nodeSupplier) {
/*  51 */     this(nodeSupplier, createDefaultFactory());
/*     */   }
/*     */   @NotNull
/*     */   private static XMLInputFactory createDefaultFactory() {
/*  55 */     XMLInputFactory factory = XMLInputFactory.newFactory();
/*  56 */     factory.setProperty("javax.xml.stream.supportDTD", Boolean.valueOf(false));
/*  57 */     factory.setProperty("javax.xml.stream.isReplacingEntityReferences", Boolean.valueOf(false));
/*  58 */     factory.setProperty("javax.xml.stream.isSupportingExternalEntities", Boolean.valueOf(false));
/*  59 */     return factory;
/*     */   }
/*     */   
/*     */   public StaxSVGLoader(@NotNull NodeSupplier nodeSupplier, @NotNull XMLInputFactory factory) {
/*  63 */     this.nodeSupplier = nodeSupplier;
/*  64 */     this.xmlInputFactory = factory;
/*     */   }
/*     */   @Nullable
/*     */   private XMLEventReader createReader(@Nullable InputStream inputStream) {
/*     */     try {
/*  69 */       return this.xmlInputFactory.createXMLEventReader(inputStream);
/*  70 */     } catch (XMLStreamException e) {
/*  71 */       LOGGER.log(Level.SEVERE, "Error while creating XMLEventReader.", e);
/*  72 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public SVGDocument load(@Nullable InputStream inputStream, @NotNull ParserProvider parserProvider, @NotNull ResourceLoader resourceLoader) throws IOException, XMLStreamException {
/*  80 */     if (inputStream == null) return null; 
/*  81 */     XMLEventReader reader = createReader(inputStream);
/*  82 */     if (reader == null) return null; 
/*     */     try {
/*  84 */       SVGDocumentBuilder builder = new SVGDocumentBuilder(parserProvider, resourceLoader, this.nodeSupplier);
/*  85 */       while (reader.hasNext()) {
/*  86 */         StartElement element; Map<String, String> attributes; char[] data; XMLEvent event = reader.nextEvent();
/*  87 */         switch (event.getEventType()) {
/*     */           case 7:
/*  89 */             builder.startDocument();
/*     */           
/*     */           case 8:
/*  92 */             builder.endDocument();
/*     */ 
/*     */           
/*     */           case 1:
/*  96 */             element = event.asStartElement();
/*  97 */             attributes = new HashMap<>();
/*  98 */             element.getAttributes().forEachRemaining(attr -> attributes.put(qualifiedName(attr.getName()), attr.getValue().trim()));
/*     */             
/* 100 */             if (!builder.startElement(qualifiedName(element.getName()), attributes)) {
/* 101 */               skipElement(reader);
/*     */             }
/*     */ 
/*     */           
/*     */           case 2:
/* 106 */             builder.endElement(qualifiedName(event.asEndElement().getName()));
/*     */ 
/*     */           
/*     */           case 4:
/*     */           case 12:
/* 111 */             data = event.asCharacters().getData().toCharArray();
/* 112 */             builder.addTextContent(data, 0, data.length);
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       } 
/* 128 */       return builder.build();
/* 129 */     } catch (XMLStreamException e) {
/* 130 */       LOGGER.log(Level.SEVERE, "Error while parsing SVG.", e);
/*     */     } finally {
/* 132 */       reader.close();
/* 133 */       inputStream.close();
/*     */     } 
/* 135 */     return null;
/*     */   }
/*     */   
/*     */   private static void skipElement(@NotNull XMLEventReader reader) throws XMLStreamException {
/* 139 */     int elementCount = 1;
/* 140 */     while (reader.hasNext()) {
/* 141 */       XMLEvent event = reader.nextEvent();
/* 142 */       if (event.isStartElement()) {
/* 143 */         elementCount++;
/* 144 */       } else if (event.isEndElement()) {
/* 145 */         elementCount--;
/*     */       } 
/* 147 */       if (elementCount == 0)
/*     */         return; 
/*     */     } 
/*     */   }
/*     */   private static String qualifiedName(@NotNull QName name) {
/* 152 */     String prefix = name.getPrefix();
/* 153 */     String localName = name.getLocalPart();
/* 154 */     if (prefix == null) return localName; 
/* 155 */     if (prefix.isEmpty()) return localName; 
/* 156 */     return prefix + ":" + localName;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\StaxSVGLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */