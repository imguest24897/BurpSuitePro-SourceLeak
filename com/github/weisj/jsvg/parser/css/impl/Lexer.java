/*     */ package com.github.weisj.jsvg.parser.css.impl;
/*     */ 
/*     */ import java.text.MessageFormat;
/*     */ import java.util.List;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.logging.Logger;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ public final class Lexer
/*     */ {
/*  33 */   private static final Logger LOGGER = Logger.getLogger(Lexer.class.getName());
/*     */   @NotNull
/*     */   private final List<char[]> input;
/*  36 */   private int listIndex = 0;
/*  37 */   private int index = 0;
/*     */   
/*     */   private boolean inRuleDefinition;
/*     */   
/*     */   private boolean parsingRaw;
/*     */   
/*     */   public Lexer(@NotNull List<char[]> input) {
/*  44 */     this.input = input;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Token nextToken() {
/*  49 */     consumeWhiteSpace();
/*     */     
/*  51 */     if (this.inRuleDefinition && this.parsingRaw) {
/*     */       
/*  53 */       this.parsingRaw = false;
/*  54 */       return new Token(TokenType.RAW_DATA, readWhile(c -> (c.charValue() != ';' && c.charValue() != '}')));
/*     */     } 
/*     */     
/*  57 */     if (isEof()) return new Token(TokenType.EOF); 
/*  58 */     char c = current();
/*  59 */     switch (c) {
/*     */       case '{':
/*  61 */         this.inRuleDefinition = true;
/*  62 */         this.parsingRaw = false;
/*  63 */         next();
/*  64 */         return new Token(TokenType.CURLY_OPEN);
/*     */       case '}':
/*  66 */         this.inRuleDefinition = false;
/*  67 */         this.parsingRaw = false;
/*  68 */         next();
/*  69 */         return new Token(TokenType.CURLY_CLOSE);
/*     */       case ':':
/*  71 */         this.parsingRaw = true;
/*  72 */         next();
/*  73 */         return new Token(TokenType.COLON);
/*     */       case ';':
/*  75 */         next();
/*  76 */         return new Token(TokenType.SEMICOLON);
/*     */       case ',':
/*  78 */         next();
/*  79 */         return new Token(TokenType.COMMA);
/*     */       case '.':
/*  81 */         next();
/*  82 */         return new Token(TokenType.CLASS_NAME, readIdentifier());
/*     */       case '#':
/*  84 */         next();
/*  85 */         return new Token(TokenType.ID_NAME, readIdentifier());
/*     */     } 
/*  87 */     return new Token(TokenType.IDENTIFIER, readIdentifier());
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean isEof() {
/*  92 */     return (this.listIndex >= this.input.size() || (this.listIndex == this.input
/*  93 */       .size() - 1 && this.index >= ((char[])this.input.get(this.listIndex)).length));
/*     */   }
/*     */   
/*     */   private void consumeWhiteSpace() {
/*  97 */     while (Character.isWhitespace(current())) {
/*  98 */       next();
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean isIdentifierCharStart(char c) {
/* 103 */     if ('A' <= c && c <= 'Z') return true; 
/* 104 */     if ('a' <= c && c <= 'z') return true; 
/* 105 */     if (c == '-') return true; 
/* 106 */     return (c == '_');
/*     */   }
/*     */   
/*     */   private boolean isIdentifierChar(char c) {
/* 110 */     if (isIdentifierCharStart(c)) return true; 
/* 111 */     return ('0' <= c && c <= '9');
/*     */   }
/*     */   @NotNull
/*     */   private String readIdentifier() {
/* 115 */     if (!isIdentifierCharStart(current()) || !isIdentifierChar(current())) {
/* 116 */       LOGGER.warning(() -> MessageFormat.format("Identifier starting with unexpected char ''{0}''", new Object[] { Character.valueOf(current()) }));
/* 117 */       if (readWhile(this::isIdentifierChar).isEmpty()) {
/* 118 */         next();
/*     */       }
/* 120 */       throw new ParserException();
/*     */     } 
/* 122 */     return readWhile(this::isIdentifierChar);
/*     */   }
/*     */   @NotNull
/*     */   private String readWhile(@NotNull Predicate<Character> filter) {
/* 126 */     if (isEof()) return "";
/*     */     
/* 128 */     int startListIndex = this.listIndex;
/* 129 */     int startIndex = this.index;
/* 130 */     while (!isEof() && filter.test(Character.valueOf(current()))) {
/* 131 */       next();
/*     */     }
/* 133 */     int endListIndex = isEof() ? (this.input.size() - 1) : this.listIndex;
/* 134 */     int endIndex = isEof() ? (((char[])this.input.get(endListIndex)).length - 1) : this.index;
/*     */     
/* 136 */     StringBuilder builder = new StringBuilder();
/* 137 */     int start = startIndex;
/* 138 */     for (int i = startListIndex; i <= endListIndex; i++) {
/* 139 */       char[] segment = this.input.get(i);
/* 140 */       int end = (i == endListIndex) ? endIndex : (segment.length - 1);
/*     */       
/* 142 */       builder.append(String.valueOf(segment, start, end - start));
/* 143 */       start = 0;
/*     */     } 
/* 145 */     return builder.toString();
/*     */   }
/*     */   
/*     */   private char current() {
/* 149 */     if (isEof()) return Character.MIN_VALUE; 
/* 150 */     return ((char[])this.input.get(this.listIndex))[this.index];
/*     */   }
/*     */   
/*     */   private void next() {
/* 154 */     this.index++;
/* 155 */     if (this.index >= ((char[])this.input.get(this.listIndex)).length && this.listIndex + 1 < this.input.size()) {
/* 156 */       this.index = 0;
/* 157 */       this.listIndex++;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\css\impl\Lexer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */