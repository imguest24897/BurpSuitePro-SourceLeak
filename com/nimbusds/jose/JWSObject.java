/*     */ package com.nimbusds.jose;
/*     */ 
/*     */ import com.nimbusds.jose.util.Base64URL;
/*     */ import com.nimbusds.jose.util.StandardCharset;
/*     */ import java.text.ParseException;
/*     */ import java.util.concurrent.atomic.AtomicReference;
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
/*     */ @ThreadSafe
/*     */ public class JWSObject
/*     */   extends JOSEObject
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private final JWSHeader header;
/*     */   private final String signingInputString;
/*     */   private Base64URL signature;
/*     */   
/*     */   public enum State
/*     */   {
/*  57 */     UNSIGNED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  64 */     SIGNED,
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  71 */     VERIFIED;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  96 */   private final AtomicReference<State> state = new AtomicReference<>();
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
/*     */   public JWSObject(JWSHeader header, Payload payload) {
/* 109 */     if (header == null) {
/* 110 */       throw new IllegalArgumentException("The JWS header must not be null");
/*     */     }
/* 112 */     this.header = header;
/*     */     
/* 114 */     if (payload == null) {
/* 115 */       throw new IllegalArgumentException("The payload must not be null");
/*     */     }
/* 117 */     setPayload(payload);
/*     */     
/* 119 */     this.signingInputString = composeSigningInput();
/* 120 */     this.signature = null;
/* 121 */     this.state.set(State.UNSIGNED);
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
/*     */ 
/*     */   
/*     */   public JWSObject(Base64URL firstPart, Base64URL secondPart, Base64URL thirdPart) throws ParseException {
/* 141 */     this(firstPart, new Payload(secondPart), thirdPart);
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
/*     */ 
/*     */   
/*     */   public JWSObject(Base64URL firstPart, Payload payload, Base64URL thirdPart) throws ParseException {
/* 161 */     if (firstPart == null) {
/* 162 */       throw new IllegalArgumentException("The first part must not be null");
/*     */     }
/*     */     try {
/* 165 */       this.header = JWSHeader.parse(firstPart);
/* 166 */     } catch (ParseException e) {
/* 167 */       throw new ParseException("Invalid JWS header: " + e.getMessage(), 0);
/*     */     } 
/*     */     
/* 170 */     if (payload == null) {
/* 171 */       throw new IllegalArgumentException("The payload (second part) must not be null");
/*     */     }
/* 173 */     setPayload(payload);
/*     */     
/* 175 */     this.signingInputString = composeSigningInput();
/*     */     
/* 177 */     if (thirdPart == null) {
/* 178 */       throw new IllegalArgumentException("The third part must not be null");
/*     */     }
/* 180 */     this.signature = thirdPart;
/* 181 */     this.state.set(State.SIGNED);
/*     */     
/* 183 */     if (getHeader().isBase64URLEncodePayload()) {
/* 184 */       setParsedParts(new Base64URL[] { firstPart, payload.toBase64URL(), thirdPart });
/*     */     } else {
/* 186 */       setParsedParts(new Base64URL[] { firstPart, new Base64URL(""), thirdPart });
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public JWSHeader getHeader() {
/* 193 */     return this.header;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String composeSigningInput() {
/* 204 */     if (this.header.isBase64URLEncodePayload()) {
/* 205 */       return getHeader().toBase64URL().toString() + '.' + getPayload().toBase64URL().toString();
/*     */     }
/* 207 */     return getHeader().toBase64URL().toString() + '.' + getPayload().toString();
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
/*     */   public byte[] getSigningInput() {
/* 219 */     return this.signingInputString.getBytes(StandardCharset.UTF_8);
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
/*     */   public Base64URL getSignature() {
/* 231 */     return this.signature;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public State getState() {
/* 242 */     return this.state.get();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void ensureUnsignedState() {
/* 253 */     if (this.state.get() != State.UNSIGNED)
/*     */     {
/* 255 */       throw new IllegalStateException("The JWS object must be in an unsigned state");
/*     */     }
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
/*     */   private void ensureSignedOrVerifiedState() {
/* 269 */     if (this.state.get() != State.SIGNED && this.state.get() != State.VERIFIED)
/*     */     {
/* 271 */       throw new IllegalStateException("The JWS object must be in a signed or verified state");
/*     */     }
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
/*     */   private void ensureJWSSignerSupport(JWSSigner signer) throws JOSEException {
/* 285 */     if (!signer.supportedJWSAlgorithms().contains(getHeader().getAlgorithm()))
/*     */     {
/* 287 */       throw new JOSEException("The " + getHeader().getAlgorithm() + " algorithm is not allowed or supported by the JWS signer: Supported algorithms: " + signer
/* 288 */           .supportedJWSAlgorithms());
/*     */     }
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
/*     */   public synchronized void sign(JWSSigner signer) throws JOSEException {
/* 306 */     ensureUnsignedState();
/*     */     
/* 308 */     ensureJWSSignerSupport(signer);
/*     */     
/*     */     try {
/* 311 */       this.signature = signer.sign(getHeader(), getSigningInput());
/*     */     }
/* 313 */     catch (ActionRequiredForJWSCompletionException e) {
/*     */       
/* 315 */       throw new ActionRequiredForJWSCompletionException(e
/* 316 */           .getMessage(), e
/* 317 */           .getTriggeringOption(), new CompletableJWSObjectSigning()
/*     */           {
/*     */             public Base64URL complete() throws JOSEException
/*     */             {
/* 321 */               JWSObject.this.signature = e.getCompletableJWSObjectSigning().complete();
/* 322 */               JWSObject.this.state.set(JWSObject.State.SIGNED);
/* 323 */               return JWSObject.this.signature;
/*     */             }
/*     */           });
/*     */     
/*     */     }
/* 328 */     catch (JOSEException e) {
/*     */       
/* 330 */       throw e;
/*     */     }
/* 332 */     catch (Exception e) {
/*     */ 
/*     */ 
/*     */       
/* 336 */       throw new JOSEException(e.getMessage(), e);
/*     */     } 
/*     */     
/* 339 */     this.state.set(State.SIGNED);
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
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized boolean verify(JWSVerifier verifier) throws JOSEException {
/*     */     boolean verified;
/* 361 */     ensureSignedOrVerifiedState();
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 366 */       verified = verifier.verify(getHeader(), getSigningInput(), getSignature());
/*     */     }
/* 368 */     catch (JOSEException e) {
/*     */       
/* 370 */       throw e;
/*     */     }
/* 372 */     catch (Exception e) {
/*     */ 
/*     */ 
/*     */       
/* 376 */       throw new JOSEException(e.getMessage(), e);
/*     */     } 
/*     */     
/* 379 */     if (verified)
/*     */     {
/* 381 */       this.state.set(State.VERIFIED);
/*     */     }
/*     */     
/* 384 */     return verified;
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String serialize() {
/* 406 */     return serialize(false);
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
/*     */ 
/*     */ 
/*     */   
/*     */   public String serialize(boolean detachedPayload) {
/* 427 */     ensureSignedOrVerifiedState();
/*     */     
/* 429 */     if (detachedPayload) {
/* 430 */       return this.header.toBase64URL().toString() + '.' + '.' + this.signature.toString();
/*     */     }
/*     */     
/* 433 */     return this.signingInputString + '.' + this.signature.toString();
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
/*     */   public static JWSObject parse(String s) throws ParseException {
/* 451 */     Base64URL[] parts = JOSEObject.split(s);
/*     */     
/* 453 */     if (parts.length != 3)
/*     */     {
/* 455 */       throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
/*     */     }
/*     */     
/* 458 */     return new JWSObject(parts[0], parts[1], parts[2]);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static JWSObject parse(String s, Payload detachedPayload) throws ParseException {
/* 480 */     Base64URL[] parts = JOSEObject.split(s);
/*     */     
/* 482 */     if (parts.length != 3) {
/* 483 */       throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
/*     */     }
/*     */     
/* 486 */     if (!parts[1].toString().isEmpty()) {
/* 487 */       throw new ParseException("The payload Base64URL part must be empty", 0);
/*     */     }
/*     */     
/* 490 */     return new JWSObject(parts[0], detachedPayload, parts[2]);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\JWSObject.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */