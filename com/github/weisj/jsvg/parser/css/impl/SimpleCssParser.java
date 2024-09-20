/*     */ package com.github.weisj.jsvg.parser.css.impl;
/*     */ 
/*     */ import com.github.weisj.jsvg.parser.css.CssParser;
/*     */ import com.github.weisj.jsvg.parser.css.StyleProperty;
/*     */ import com.github.weisj.jsvg.parser.css.StyleSheet;
/*     */ import java.text.MessageFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
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
/*     */ public final class SimpleCssParser
/*     */   implements CssParser
/*     */ {
/*  37 */   private static final Logger LOGGER = Logger.getLogger(SimpleCssParser.class.getName());
/*     */   
/*     */   @NotNull
/*     */   public SimpleStyleSheet parse(@NotNull List<char[]> input) {
/*  41 */     return (new Parser(input)).parse();
/*     */   }
/*     */   
/*     */   private static final class Parser {
/*     */     @NotNull
/*     */     private final Lexer lexer;
/*     */     @NotNull
/*  48 */     private final SimpleStyleSheet sheet = new SimpleStyleSheet(); @NotNull
/*  49 */     private Token current = new Token(TokenType.START);
/*     */ 
/*     */     
/*     */     private Parser(@NotNull List<char[]> input) {
/*  53 */       this.lexer = new Lexer(input);
/*     */     }
/*     */     
/*     */     private void next() {
/*  57 */       this.current = this.lexer.nextToken();
/*     */     }
/*     */     
/*     */     private void expected(@NotNull String type) {
/*  61 */       SimpleCssParser.LOGGER.warning(() -> MessageFormat.format("Expected ''{0}'' but got ''{1}''", new Object[] { type, this.current }));
/*     */     }
/*     */     
/*     */     private void consumeOrSkipAllowedToken(TokenType type, TokenType allowedTokeToSkip) {
/*  65 */       if (this.current.type() != type) {
/*  66 */         if (this.current.type() != allowedTokeToSkip) {
/*  67 */           expected(type.toString());
/*  68 */           throw new ParserException();
/*     */         } 
/*     */         return;
/*     */       } 
/*  72 */       next();
/*     */     }
/*     */     
/*     */     private void consume(TokenType type) {
/*  76 */       consumeOrSkipAllowedToken(type, null);
/*     */     }
/*     */     @NotNull
/*     */     private String consumeValue(TokenType type) {
/*  80 */       if (this.current.type() != type) {
/*  81 */         expected(type.toString());
/*  82 */         throw new ParserException();
/*     */       } 
/*  84 */       if (this.current.data() == null) {
/*  85 */         throw new ParserException();
/*     */       }
/*  87 */       String value = Objects.<String>requireNonNull(this.current.data());
/*  88 */       next();
/*  89 */       return value;
/*     */     }
/*     */     @NotNull
/*     */     private List<Token> readIdentifierList() {
/*  93 */       List<Token> list = new ArrayList<>();
/*     */       
/*  95 */       while (this.current.type() != TokenType.CURLY_OPEN && this.current.type() != TokenType.EOF) {
/*  96 */         TokenType type = this.current.type();
/*  97 */         if (type != TokenType.IDENTIFIER && type != TokenType.ID_NAME && type != TokenType.CLASS_NAME) {
/*     */ 
/*     */           
/* 100 */           expected("identifier");
/* 101 */           throw new ParserException();
/*     */         } 
/* 103 */         list.add(this.current);
/* 104 */         next();
/*     */         
/* 106 */         if (this.current.type() == TokenType.COMMA) {
/* 107 */           next();
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 112 */       return list;
/*     */     }
/*     */     @NotNull
/*     */     private List<StyleProperty> readProperties() {
/* 116 */       List<StyleProperty> list = new ArrayList<>();
/*     */       
/* 118 */       consume(TokenType.CURLY_OPEN);
/*     */       
/* 120 */       while (this.current.type() != TokenType.CURLY_CLOSE && this.current.type() != TokenType.EOF) {
/* 121 */         String name = consumeValue(TokenType.IDENTIFIER);
/* 122 */         consume(TokenType.COLON);
/* 123 */         String value = consumeValue(TokenType.RAW_DATA);
/* 124 */         consumeOrSkipAllowedToken(TokenType.SEMICOLON, TokenType.CURLY_CLOSE);
/* 125 */         list.add(new StyleProperty(name, value.trim()));
/*     */       } 
/*     */       
/* 128 */       consume(TokenType.CURLY_CLOSE);
/* 129 */       return list;
/*     */     }
/*     */     
/*     */     private void skipToNextDefinition() {
/* 133 */       while (this.current.type() != TokenType.CURLY_CLOSE && this.current.type() != TokenType.EOF) {
/*     */         try {
/* 135 */           next();
/* 136 */         } catch (ParserException parserException) {}
/*     */       } 
/*     */ 
/*     */       
/* 140 */       if (this.current.type() != TokenType.EOF)
/* 141 */         this.current = new Token(TokenType.START); 
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     SimpleStyleSheet parse() {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield current : Lcom/github/weisj/jsvg/parser/css/impl/Token;
/*     */       //   4: invokevirtual type : ()Lcom/github/weisj/jsvg/parser/css/impl/TokenType;
/*     */       //   7: getstatic com/github/weisj/jsvg/parser/css/impl/TokenType.START : Lcom/github/weisj/jsvg/parser/css/impl/TokenType;
/*     */       //   10: if_acmpne -> 17
/*     */       //   13: aload_0
/*     */       //   14: invokespecial next : ()V
/*     */       //   17: aload_0
/*     */       //   18: invokespecial readIdentifierList : ()Ljava/util/List;
/*     */       //   21: astore_1
/*     */       //   22: aload_0
/*     */       //   23: invokespecial readProperties : ()Ljava/util/List;
/*     */       //   26: astore_2
/*     */       //   27: aload_1
/*     */       //   28: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   33: astore_3
/*     */       //   34: aload_3
/*     */       //   35: invokeinterface hasNext : ()Z
/*     */       //   40: ifeq -> 189
/*     */       //   43: aload_3
/*     */       //   44: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   49: checkcast com/github/weisj/jsvg/parser/css/impl/Token
/*     */       //   52: astore #4
/*     */       //   54: getstatic com/github/weisj/jsvg/parser/css/impl/SimpleCssParser$1.$SwitchMap$com$github$weisj$jsvg$parser$css$impl$TokenType : [I
/*     */       //   57: aload #4
/*     */       //   59: invokevirtual type : ()Lcom/github/weisj/jsvg/parser/css/impl/TokenType;
/*     */       //   62: invokevirtual ordinal : ()I
/*     */       //   65: iaload
/*     */       //   66: tableswitch default -> 158, 1 -> 92, 2 -> 114, 3 -> 136
/*     */       //   92: aload_0
/*     */       //   93: getfield sheet : Lcom/github/weisj/jsvg/parser/css/impl/SimpleStyleSheet;
/*     */       //   96: aload #4
/*     */       //   98: invokevirtual data : ()Ljava/lang/String;
/*     */       //   101: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   104: checkcast java/lang/String
/*     */       //   107: aload_2
/*     */       //   108: invokevirtual addClassRules : (Ljava/lang/String;Ljava/util/List;)V
/*     */       //   111: goto -> 186
/*     */       //   114: aload_0
/*     */       //   115: getfield sheet : Lcom/github/weisj/jsvg/parser/css/impl/SimpleStyleSheet;
/*     */       //   118: aload #4
/*     */       //   120: invokevirtual data : ()Ljava/lang/String;
/*     */       //   123: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   126: checkcast java/lang/String
/*     */       //   129: aload_2
/*     */       //   130: invokevirtual addIdRules : (Ljava/lang/String;Ljava/util/List;)V
/*     */       //   133: goto -> 186
/*     */       //   136: aload_0
/*     */       //   137: getfield sheet : Lcom/github/weisj/jsvg/parser/css/impl/SimpleStyleSheet;
/*     */       //   140: aload #4
/*     */       //   142: invokevirtual data : ()Ljava/lang/String;
/*     */       //   145: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   148: checkcast java/lang/String
/*     */       //   151: aload_2
/*     */       //   152: invokevirtual addTagNameRules : (Ljava/lang/String;Ljava/util/List;)V
/*     */       //   155: goto -> 186
/*     */       //   158: new java/lang/IllegalStateException
/*     */       //   161: dup
/*     */       //   162: new java/lang/StringBuilder
/*     */       //   165: dup
/*     */       //   166: invokespecial <init> : ()V
/*     */       //   169: ldc 'Toke = '
/*     */       //   171: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   174: aload #4
/*     */       //   176: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */       //   179: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   182: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   185: athrow
/*     */       //   186: goto -> 34
/*     */       //   189: goto -> 197
/*     */       //   192: astore_1
/*     */       //   193: aload_0
/*     */       //   194: invokespecial skipToNextDefinition : ()V
/*     */       //   197: aload_0
/*     */       //   198: getfield current : Lcom/github/weisj/jsvg/parser/css/impl/Token;
/*     */       //   201: invokevirtual type : ()Lcom/github/weisj/jsvg/parser/css/impl/TokenType;
/*     */       //   204: getstatic com/github/weisj/jsvg/parser/css/impl/TokenType.EOF : Lcom/github/weisj/jsvg/parser/css/impl/TokenType;
/*     */       //   207: if_acmpne -> 0
/*     */       //   210: aload_0
/*     */       //   211: getfield sheet : Lcom/github/weisj/jsvg/parser/css/impl/SimpleStyleSheet;
/*     */       //   214: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #149	-> 0
/*     */       //   #150	-> 13
/*     */       //   #153	-> 17
/*     */       //   #154	-> 22
/*     */       //   #156	-> 27
/*     */       //   #157	-> 54
/*     */       //   #159	-> 92
/*     */       //   #160	-> 111
/*     */       //   #162	-> 114
/*     */       //   #163	-> 133
/*     */       //   #165	-> 136
/*     */       //   #166	-> 155
/*     */       //   #168	-> 158
/*     */       //   #170	-> 186
/*     */       //   #173	-> 189
/*     */       //   #171	-> 192
/*     */       //   #172	-> 193
/*     */       //   #174	-> 197
/*     */       //   #175	-> 210
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   54	132	4	token	Lcom/github/weisj/jsvg/parser/css/impl/Token;
/*     */       //   22	167	1	identifierList	Ljava/util/List;
/*     */       //   27	162	2	properties	Ljava/util/List;
/*     */       //   193	4	1	e	Lcom/github/weisj/jsvg/parser/css/impl/ParserException;
/*     */       //   0	215	0	this	Lcom/github/weisj/jsvg/parser/css/impl/SimpleCssParser$Parser;
/*     */       // Local variable type table:
/*     */       //   start	length	slot	name	signature
/*     */       //   22	167	1	identifierList	Ljava/util/List<Lcom/github/weisj/jsvg/parser/css/impl/Token;>;
/*     */       //   27	162	2	properties	Ljava/util/List<Lcom/github/weisj/jsvg/parser/css/StyleProperty;>;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   0	189	192	com/github/weisj/jsvg/parser/css/impl/ParserException
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\css\impl\SimpleCssParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */