grammar MIDL;

//语法规则
specification :
    definition+;
definition :
    type_decl';'| module';' ;
module :
    'module' ID '{' definition+'}';
type_decl :
    struct_type | 'struct' ID;
struct_type :
    'struct' ID '{'member_list '}';
member_list :
    (type_spec declarators';')*;
type_spec :
    scoped_name | base_type_spec | struct_type;
scoped_name :
    ('::'?ID)+ ;
base_type_spec :
    floating_pt_type|integer_type|'char'|'string'|'boolean';
floating_pt_type :
    'float' | 'double' | 'long double';
integer_type :
    signed_int | unsigned_int;
signed_int:
    ('short'
    |'int16')
    |('long'
    |'int32')
    |('long' 'long'
    |'int64')
    |'int8';
unsigned_int :
    ('unsigned''short'
    | 'uint16 ')
    | ('unsigned''long'
    | 'uint32 ')
    | ('unsigned' 'long' 'long'
    | 'uint64')
    | 'uint8';
declarators :
    declarator (',' declarator )*;
declarator :
    simple_declarator | array_declarator;
simple_declarator :
    ID ('=' or_expr)?;
array_declarator :
    ID'['or_expr']'('='exp_list)?;
exp_list :
    '[' or_expr ( ','or_expr )* ']';
or_expr :
    xor_expr ('|' xor_expr )*;
xor_expr :
    and_expr ('^' and_expr )*;
and_expr :
    shift_expr ('&'shift_expr )*;
shift_expr :
    add_expr ( ('>>' | '<<') add_expr )*;
add_expr :
    mult_expr ( ('+' | '-') mult_expr )*;
mult_expr :
    unary_expr ( ('*' |'/'|'%') unary_expr )*;
unary_expr :
    ('-'| '+' | '~')? literal;
literal :
    INTEGER | FLOATING_PT | CHAR | STRING | BOOLEAN;
WS : [ \n\r\t] + -> skip;


/* 关键字 */
KW_MODULE : 'module';
KW_STRUCT : 'struct';
KW_BOOLEAN : 'boolean';
KW_SHORT : 'short';
KW_LONG : 'long';
KW_UNSIGNED : 'unsigned';
KW_INT8 : 'int8';
KW_INT16 : 'int16';
KW_INT32 : 'int32';
KW_INT64 : 'int64';
KW_UINT8 : 'uint8';
KW_UINT16 : 'uint16';
KW_UINT32 : 'uint32';
KW_UINT64 : 'uint64';
KW_CHAR : 'char';
KW_STRING : 'string';
KW_FLOAT : 'float';
KW_DOUBLE : 'double';
KW_TRUE : 'true';
KW_FALSE : 'false';

/* 符号 */
LEFT_BRACE : '{';
RIGHT_BRACE : '}';
LEFT_SQUARE_BRACKET : '[';
RIGHT_SQUARE_BRACKET : ']';
SEMICOLON : ';';
COMMA : ',';
PLUS : '+';
MINUS : '-';
SLASH : '/';
STAR : '*';
PERCENT : '%';
RIGHT_SHIFT : '>>';
LEFT_SHIFT : '<<';
EQUAL : '=';
AMPERSAND : '&';
PIPE : '|';
TILDE : '~';
CARET : '^';
COLON : ':';
DOUBLE_COLON : '::';

/* 正则表达式 */

ID :  LETTER (UNDERLINE?( LETTER | DIGIT))*;

LETTER : [a-z]|[A-Z];

UNDERLINE : '_';

INTEGER_TYPE_SUFFIX : 'l' | 'L';

FLOATING_PT : [0-9]+'.'[0-9]*  EXPONENT?  FLOAT_TYPE_SUFFIX?
   				|  '.' [0-9]+  EXPONENT?  FLOAT_TYPE_SUFFIX?
   				|  [0-9]+  EXPONENT FLOAT_TYPE_SUFFIX?
   				|  [0-9]+  EXPONENT?  FLOAT_TYPE_SUFFIX;

INTEGER : ('0' | [1-9] [0-9]*) INTEGER_TYPE_SUFFIX?;

DIGIT : [0-9];

EXPONENT : ( 'e' | 'E') ( '+' | '-' )? [0-9]+;

FLOAT_TYPE_SUFFIX : 'f' | 'F' | 'd' | 'D';

ESCAPE_SEQUENCE :  '\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '"' | '\'' | '\\' );

CHAR : '\''(ESCAPE_SEQUENCE |  (~'\\' | ~'\'') )'\'';

STRING :  '"' (ESCAPE_SEQUENCE |  (~'\\' | ~'"') )* '"';

BOOLEAN :  'TRUE' | KW_TRUE | 'FALSE' | KW_FALSE;

