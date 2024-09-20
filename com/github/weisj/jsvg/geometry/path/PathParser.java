/*     */ package com.github.weisj.jsvg.geometry.path;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class PathParser
/*     */ {
/*     */   private final String input;
/*     */   private final int inputLength;
/*     */   private int index;
/*     */   private char currentCommand;
/*     */   
/*     */   public PathParser(@Nullable String input) {
/*  44 */     this.input = input;
/*  45 */     this.inputLength = (input != null) ? input.length() : 0;
/*     */   }
/*     */   @NotNull
/*     */   private String currentLocation() {
/*  49 */     return "(index=" + this.index + " in input=" + this.input + ")";
/*     */   }
/*     */   
/*     */   private boolean isCommandChar(char c) {
/*  53 */     return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
/*     */   }
/*     */   
/*     */   private boolean isWhiteSpaceOrSeparator(char c) {
/*  57 */     return (c == ',' || Character.isWhitespace(c));
/*     */   }
/*     */   
/*     */   private char peek() {
/*  61 */     return this.input.charAt(this.index);
/*     */   }
/*     */   
/*     */   private void consume() {
/*  65 */     this.index++;
/*     */   }
/*     */   
/*     */   private boolean hasNext() {
/*  69 */     return (this.index < this.inputLength);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isValidNumberChar(char c, NumberCharState state) {
/*  76 */     boolean valid = ('0' <= c && c <= '9');
/*  77 */     if (valid && state.iteration == 1 && this.input.charAt(this.index - 1) == '0')
/*     */     {
/*  79 */       return false;
/*     */     }
/*  81 */     state.signAllowed = (state.signAllowed && !valid);
/*  82 */     if (state.dotAllowed && !valid) {
/*  83 */       valid = (c == '.');
/*  84 */       state.dotAllowed = !valid;
/*     */     } 
/*  86 */     if (state.signAllowed && !valid) {
/*  87 */       valid = (c == '+' || c == '-');
/*  88 */       state.signAllowed = valid;
/*     */     } 
/*  90 */     if (state.exponentAllowed && !valid) {
/*     */       
/*  92 */       valid = (c == 'e' || c == 'E');
/*  93 */       state.exponentAllowed = !valid;
/*  94 */       state.signAllowed = valid;
/*  95 */       state.dotAllowed = !valid;
/*     */     } 
/*  97 */     state.iteration++;
/*  98 */     return valid;
/*     */   }
/*     */   
/*     */   private void consumeWhiteSpaceOrSeparator() {
/* 102 */     while (hasNext() && isWhiteSpaceOrSeparator(peek())) {
/* 103 */       consume();
/*     */     }
/*     */   }
/*     */   
/*     */   private float nextFloatOrUnspecified() {
/* 108 */     if (!hasNext()) return Float.NaN; 
/* 109 */     return nextFloat();
/*     */   }
/*     */   
/*     */   private float nextFloat() {
/* 113 */     int start = this.index;
/* 114 */     NumberCharState state = new NumberCharState();
/* 115 */     while (hasNext() && isValidNumberChar(peek(), state)) {
/* 116 */       consume();
/*     */     }
/* 118 */     int end = this.index;
/* 119 */     consumeWhiteSpaceOrSeparator();
/* 120 */     String token = this.input.substring(start, end);
/*     */     try {
/* 122 */       return Float.parseFloat(token);
/* 123 */     } catch (NumberFormatException e) {
/*     */ 
/*     */ 
/*     */       
/* 127 */       String msg = "Unexpected element while parsing cmd '" + this.currentCommand + "' encountered token '" + token + "' rest=" + this.input.substring(start, Math.min(this.input.length(), start + 10)) + currentLocation();
/* 128 */       throw new IllegalStateException(msg, e);
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean nextFlag() {
/* 133 */     char c = peek();
/* 134 */     consume();
/* 135 */     consumeWhiteSpaceOrSeparator();
/* 136 */     if (c == '1')
/* 137 */       return true; 
/* 138 */     if (c == '0') {
/* 139 */       return false;
/*     */     }
/* 141 */     throw new IllegalStateException("Invalid flag value '" + c + "' " + currentLocation());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public BezierPathCommand parseMeshCommand() {
/* 146 */     if (this.input == null) return null; 
/* 147 */     char peekChar = peek();
/* 148 */     this.currentCommand = 'z';
/* 149 */     if (isCommandChar(peekChar)) {
/* 150 */       consume();
/* 151 */       this.currentCommand = peekChar;
/*     */     } 
/* 153 */     consumeWhiteSpaceOrSeparator();
/* 154 */     switch (this.currentCommand) {
/*     */       case 'l':
/* 156 */         return new LineToBezier(true, nextFloatOrUnspecified(), nextFloatOrUnspecified());
/*     */       case 'L':
/* 158 */         return new LineToBezier(false, nextFloatOrUnspecified(), nextFloatOrUnspecified());
/*     */       case 'c':
/* 160 */         return new CubicBezierCommand(true, nextFloat(), nextFloat(), nextFloat(), nextFloat(), 
/* 161 */             nextFloatOrUnspecified(), nextFloatOrUnspecified());
/*     */       case 'C':
/* 163 */         return new CubicBezierCommand(false, nextFloat(), nextFloat(), nextFloat(), nextFloat(), 
/* 164 */             nextFloatOrUnspecified(), nextFloatOrUnspecified());
/*     */     } 
/* 166 */     throw new IllegalStateException("Only commands c C l L allowed");
/*     */   }
/*     */ 
/*     */   
/*     */   public PathCommand[] parsePathCommand() {
/* 171 */     if (this.input == null || "none".equals(this.input)) return new PathCommand[0]; 
/* 172 */     List<PathCommand> commands = new ArrayList<>();
/*     */     
/* 174 */     this.currentCommand = 'Z';
/* 175 */     while (hasNext()) {
/* 176 */       PathCommand cmd; char peekChar = peek();
/* 177 */       if (isCommandChar(peekChar)) {
/* 178 */         consume();
/* 179 */         this.currentCommand = peekChar;
/*     */       } 
/* 181 */       consumeWhiteSpaceOrSeparator();
/*     */ 
/*     */       
/* 184 */       switch (this.currentCommand) {
/*     */         case 'M':
/* 186 */           cmd = new MoveTo(false, nextFloat(), nextFloat());
/* 187 */           this.currentCommand = 'L';
/*     */           break;
/*     */         case 'm':
/* 190 */           cmd = new MoveTo(true, nextFloat(), nextFloat());
/* 191 */           this.currentCommand = 'l';
/*     */           break;
/*     */         case 'L':
/* 194 */           cmd = new LineTo(false, nextFloat(), nextFloat());
/*     */           break;
/*     */         case 'l':
/* 197 */           cmd = new LineTo(true, nextFloat(), nextFloat());
/*     */           break;
/*     */         case 'H':
/* 200 */           cmd = new Horizontal(false, nextFloat());
/*     */           break;
/*     */         case 'h':
/* 203 */           cmd = new Horizontal(true, nextFloat());
/*     */           break;
/*     */         case 'V':
/* 206 */           cmd = new Vertical(false, nextFloat());
/*     */           break;
/*     */         case 'v':
/* 209 */           cmd = new Vertical(true, nextFloat());
/*     */           break;
/*     */         
/*     */         case 'A':
/* 213 */           cmd = new Arc(false, nextFloat(), nextFloat(), nextFloat(), nextFlag(), nextFlag(), nextFloat(), nextFloat());
/*     */           break;
/*     */         
/*     */         case 'a':
/* 217 */           cmd = new Arc(true, nextFloat(), nextFloat(), nextFloat(), nextFlag(), nextFlag(), nextFloat(), nextFloat());
/*     */           break;
/*     */         
/*     */         case 'Q':
/* 221 */           cmd = new Quadratic(false, nextFloat(), nextFloat(), nextFloat(), nextFloat());
/*     */           break;
/*     */         
/*     */         case 'q':
/* 225 */           cmd = new Quadratic(true, nextFloat(), nextFloat(), nextFloat(), nextFloat());
/*     */           break;
/*     */         case 'T':
/* 228 */           cmd = new QuadraticSmooth(false, nextFloat(), nextFloat());
/*     */           break;
/*     */         case 't':
/* 231 */           cmd = new QuadraticSmooth(true, nextFloat(), nextFloat());
/*     */           break;
/*     */ 
/*     */         
/*     */         case 'C':
/* 236 */           cmd = new Cubic(false, nextFloat(), nextFloat(), nextFloat(), nextFloat(), nextFloat(), nextFloat());
/*     */           break;
/*     */ 
/*     */         
/*     */         case 'c':
/* 241 */           cmd = new Cubic(true, nextFloat(), nextFloat(), nextFloat(), nextFloat(), nextFloat(), nextFloat());
/*     */           break;
/*     */         
/*     */         case 'S':
/* 245 */           cmd = new CubicSmooth(false, nextFloat(), nextFloat(), nextFloat(), nextFloat());
/*     */           break;
/*     */         
/*     */         case 's':
/* 249 */           cmd = new CubicSmooth(true, nextFloat(), nextFloat(), nextFloat(), nextFloat());
/*     */           break;
/*     */         case 'Z':
/*     */         case 'z':
/* 253 */           cmd = new Terminal();
/*     */           break;
/*     */         default:
/* 256 */           throw new IllegalArgumentException("Invalid path element " + this.currentCommand + currentLocation());
/*     */       } 
/* 258 */       commands.add(cmd);
/*     */     } 
/* 260 */     return commands.<PathCommand>toArray(new PathCommand[0]);
/*     */   }
/*     */   
/*     */   private static final class NumberCharState {
/* 264 */     int iteration = 0;
/*     */     
/*     */     private NumberCharState() {}
/*     */     
/*     */     boolean dotAllowed = true;
/*     */     boolean signAllowed = true;
/*     */     boolean exponentAllowed = true;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\path\PathParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */