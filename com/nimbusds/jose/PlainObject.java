/*     */ package com.nimbusds.jose;
/*     */ 
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import java.text.ParseException;
/*     */ import net.jcip.annotations.ThreadSafe;
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
/*     */ @ThreadSafe
/*     */ public class PlainObject
/*     */   extends JOSEObject
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private final PlainHeader header;
/*     */   
/*     */   public PlainObject(Payload payload) {
/*  55 */     if (payload == null) {
/*  56 */       throw new IllegalArgumentException("The payload must not be null");
/*     */     }
/*     */     
/*  59 */     setPayload(payload);
/*     */     
/*  61 */     this.header = new PlainHeader();
/*     */   }
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
/*     */   public PlainObject(PlainHeader header, Payload payload) {
/*  74 */     if (header == null)
/*     */     {
/*  76 */       throw new IllegalArgumentException("The unsecured header must not be null");
/*     */     }
/*     */     
/*  79 */     this.header = header;
/*     */     
/*  81 */     if (payload == null)
/*     */     {
/*  83 */       throw new IllegalArgumentException("The payload must not be null");
/*     */     }
/*     */     
/*  86 */     setPayload(payload);
/*     */   }
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
/*     */   public PlainObject(Base64URL firstPart, Base64URL secondPart) throws ParseException {
/* 104 */     if (firstPart == null)
/*     */     {
/* 106 */       throw new IllegalArgumentException("The first part must not be null");
/*     */     }
/*     */     
/*     */     try {
/* 110 */       this.header = PlainHeader.parse(firstPart);
/*     */     }
/* 112 */     catch (ParseException e) {
/*     */       
/* 114 */       throw new ParseException("Invalid unsecured header: " + e.getMessage(), 0);
/*     */     } 
/*     */     
/* 117 */     if (secondPart == null)
/*     */     {
/* 119 */       throw new IllegalArgumentException("The second part must not be null");
/*     */     }
/*     */     
/* 122 */     setPayload(new Payload(secondPart));
/*     */     
/* 124 */     setParsedParts(new Base64URL[] { firstPart, secondPart, null });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PlainHeader getHeader() {
/* 131 */     return this.header;
/*     */   }
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
/*     */   public String serialize() {
/* 149 */     return this.header.toBase64URL().toString() + '.' + getPayload().toBase64URL().toString() + '.';
/*     */   }
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
/*     */   public static PlainObject parse(String s) throws ParseException {
/* 167 */     Base64URL[] parts = JOSEObject.split(s);
/*     */     
/* 169 */     if (!parts[2].toString().isEmpty())
/*     */     {
/* 171 */       throw new ParseException("Unexpected third Base64URL part", 0);
/*     */     }
/*     */     
/* 174 */     return new PlainObject(parts[0], parts[1]);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\PlainObject.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */