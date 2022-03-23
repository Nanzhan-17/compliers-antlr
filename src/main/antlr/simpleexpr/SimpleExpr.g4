//只描述词法分析则改为 lexer grammer SimpleExprLexer
grammar SimpleExpr;

//Anltlr4中两大冲突解决规则
//最前优先匹配、最长优先匹配

prog : stat* EOF ; //程序主体由语句构成
stat : expr //一个表达式就是一个语句
     | ID '=' expr //赋值语句
     |'if' expr
     ;
expr : expr ('*' | '/') expr  //一个表达式可能有两个表达式*或/构成
     | expr ('+' | '-') expr
     |'(' expr ')'
     | ID
     | INTCONST //上面的表达式由递归定义完成的，INT是递归出口（？）
     ;

//以上是语法分析的描述-------------------------------------------

//把所有关键字都列在ID前面
Auto : 'auto';
Break : 'break';
Case : 'case';
Char : 'char';
Const : 'const';
Continue : 'continue';
Default : 'default';
Do : 'do';
Double : 'double';
Else : 'else';
Enum : 'enum';
Extern : 'extern';
Float : 'float';
For : 'for';
Goto : 'goto';
Inline : 'inline';
Int : 'int';
Long : 'long';
Register : 'register';
Restrict : 'restrict';
Return : 'return';
Short : 'short';
Signed : 'signed';
Sizeof : 'sizeof';
Static : 'static';
Struct : 'struct';
Switch : 'switch';
Typedef : 'typedef';
Union : 'union';
Unsigned : 'unsigned';
Void : 'void';
Volatile : 'volatile';
While : 'while';
IF : 'if' ; //if也符合ID的标准，把所有关键字写在ID前面，可以不把他识别为ID标识符


ID : (LETTER | '_') WORD* ; //等同[a-zA-Z_] [a-zA-Z0-9_]*，ID也是标识符
//INT : '0' | [1-9] [0-9]* ; //整数由0-9若干个数字组成, +表示大于等于1个数字, *表示大于等于0个
INTCONST : INT_CONSTANT ; //整型常量
FLOATCONST : FLOAT_CONSTANT ; //浮点型常量

WS : [ \t\r\n]+ -> skip ; //一个或多个空白符则忽略掉

//定义一下，在语法分析中有用
//ASSIGN : '=' ;
//LBRACE : '(' ;
//RBRACE : ')' ;
//ADD : '+' ;
//SUB : '-' ;
//MUL : '*' ;
//DIV : '/' ;
//运算符和界限符定义
LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';
Arrow : '->';
Dot : '.';
PlusPlus : '++';
MinusMinus : '--';
And : '&';
Plus : '+';
Minus : '-';
Star : '*';
Not : '!';
Tilde : '~';
Div : '/';
Mod : '%';
Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
LeftShift : '<<';
RightShift : '>>';
Equal : '==';
NotEqual : '!=';
Or : '|';
AndAnd : '&&';
OrOr : '||';
Caret : '^';
Question : '?';
Colon : ':';
Semi : ';';
Ellipsis : '...';
Assign : '=';
StarAssign : '*=';
DivAssign : '/=';
ModAssign : '%=';
PlusAssign : '+=';
MinusAssign : '-=';
LeftShiftAssign : '<<=';
RightShiftAssign : '>>=';
AndAssign : '&=';
XorAssign : '^=';
OrAssign : '|=';
Comma : ',';
Exegesis : '#' ;
ExegesisExegesis : '##' ;
LessColon : '<:' ;
ColonMore : ':>' ;
LessMod : '<%' ;
ModMore : '%>' ;
ModColon : '%:' ;
ModColonModColon : '%:%:' ;

LCOMMENT : '//' .*? '\n' -> skip ; //问号表示符合条件的最短的匹配，到第一个换行就停止
MLCOMMENT : '/*' .*? '*/' -> skip ; //.表示所有的

fragment //调节字，这个数字只会在词法分析器里面使用，语法分析器中不会用到
DIGIT : [0-9] ;
fragment //每一个都要fragment
LETTER : [a-zA-Z] ;
fragment
WORD : [a-zA-Z0-9_] ;

//整数型常量定义
fragment
INT_CONSTANT : DECIMAL_CONSTANT INT_SUFFIX?
             | OCTAL_CONSTANT INT_SUFFIX?
             | HEXADECIMAL_CONSTANT INT_SUFFIX?
             ;
fragment
DECIMAL_CONSTANT : NONZERO_DIGIT DIGIT* ;
fragment
OCTAL_CONSTANT : '0' [0-7]* ;
fragment
HEXADECIMAL_CONSTANT : ('0' [xX]) [0-9a-fA-F]+ ;
fragment
HEXADECIMAL_PREFIX : '0x' | '0X' ;
fragment
NONZERO_DIGIT : [1-9] ;
fragment
OCTAL_DIGIT : [0-7] ;
fragment
HEXADECIMAL_DIGIT : [0-9a-fA-F] ;
fragment
INT_SUFFIX : UNSIGNED_SUFFIX LONG_SUFFIX
           | UNSIGNED_SUFFIX LONG_LONG_SUFFIX
           | LONG_SUFFIX UNSIGNED_SUFFIX
           | LONG_LONG_SUFFIX UNSIGNED_SUFFIX
           ;
fragment
UNSIGNED_SUFFIX : 'u' | 'U' ;
fragment
LONG_SUFFIX : 'l' | 'L' ;
fragment
LONG_LONG_SUFFIX : 'll' | 'LL' ;

//浮点型常量定义
fragment
FLOAT_CONSTANT : DECIMAL_FLOAT_CONSTANT
               | HEXADECIMAL_FLOAT_CONSTANT
               ;
fragment
DECIMAL_FLOAT_CONSTANT : FRACTIONAL_CONSTANT EXPONENT_PART? FLOAT_SUFFIX?
                       | DIGIT_SEQUENCE EXPONENT_PART FLOAT_SUFFIX?
                       ;
fragment
HEXADECIMAL_FLOAT_CONSTANT : HEXADECIMAL_PREFIX HEXADECIMAL_FRACTIONAL_CONSTANT BINARY_EXPONENT_PART FLOAT_SUFFIX?
                           | HEXADECIMAL_PREFIX HEXADECIMAL_DIGIT_SEQUENCE BINARY_EXPONENT_PART FLOAT_SUFFIX?
                           ;
fragment
FRACTIONAL_CONSTANT : DIGIT_SEQUENCE? '.' DIGIT_SEQUENCE
                    | DIGIT_SEQUENCE '.'
                    ;
fragment
EXPONENT_PART : [eE] SIGN? DIGIT_SEQUENCE ;
fragment
SIGN : '+' | '-' ;
fragment
DIGIT_SEQUENCE : DIGIT+ ;
fragment
HEXADECIMAL_FRACTIONAL_CONSTANT : HEXADECIMAL_DIGIT_SEQUENCE? '.' HEXADECIMAL_DIGIT_SEQUENCE
                                | HEXADECIMAL_DIGIT_SEQUENCE '.'
                                ;
fragment
BINARY_EXPONENT_PART : [pP] SIGN? DIGIT_SEQUENCE ;
fragment
HEXADECIMAL_DIGIT_SEQUENCE : HEXADECIMAL_DIGIT+ ;
fragment
FLOAT_SUFFIX : 'f' | 'l' | 'F' | 'L' ;

//字符常量定义
fragment
CHARACTER_CONSTANT :  '\'' C_CHAR_SEQUENCE '\''
                   |   'L\'' C_CHAR_SEQUENCE '\''
                   |   'u\'' C_CHAR_SEQUENCE '\''
                   |   'U\'' C_CHAR_SEQUENCE '\''
                   ;
fragment
C_CHAR_SEQUENCE : C_CHAR+ ;
fragment
C_CHAR : ~['\\\r\n] | EXCAPE_SEQUENCE ;
fragment
EXCAPE_SEQUENCE : SIMPLE_ESCAPE_SEQUENCE
                | OCTAL_ESCAPE_SEQUENCE
                | HEXADECIMAL_ESCAPE_SEQUENCE
                | UNIVERSAL_CHARACTER_NAME
                ;
fragment
UNIVERSAL_CHARACTER_NAME : '\\u' HEX_QUAD
                         | '\\U' HEX_QUAD HEX_QUAD
                         ;
fragment
HEX_QUAD : HEXADECIMAL_DIGIT HEXADECIMAL_DIGIT HEXADECIMAL_DIGIT HEXADECIMAL_DIGIT ;
fragment
HEXADECIMAL_ESCAPE_SEQUENCE : '\\x' HEXADECIMAL_DIGIT+ ;
fragment
OCTAL_ESCAPE_SEQUENCE : '\\' OCTAL_DIGIT OCTAL_DIGIT? OCTAL_DIGIT? ;
fragment
SIMPLE_ESCAPE_SEQUENCE : '\\' ['"?abfnrtv\\] ;

//字符串字面量定义
fragment
STRING_LITERAL : ENCODING_PREFIX? '"' S_CHAR_SEQUENCE? '"' ;
fragment
ENCODING_PREFIX :  'u8' | 'u' | 'U' | 'L' ;
fragment
S_CHAR_SEQUENCE : S_CHAR+ ;
fragment
S_CHAR : ~["\\\r\n]
       | EXCAPE_SEQUENCE
       | '\\\n' //Added line
       | '\\\r\n' //Added line
       ;

