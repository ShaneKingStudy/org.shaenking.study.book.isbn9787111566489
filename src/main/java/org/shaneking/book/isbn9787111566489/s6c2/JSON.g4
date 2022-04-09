grammar JSON;

json : object | array ;
object : '{' pair (',' pair)* '}' | '{' '}' ;
pair : STRING ':' value ;

array : '[' value (',' value)* ']' | '[' ']' ;

value : STRING | NUMBER | object | array | 'true' | 'false' | 'null' ;

STRING : '"' (ESC | ~["\\])* '"' ;

fragment ESC : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-zA-Z] ;

NUMBER : '-'? INT '.' INT EXP? // 1.35 1.35E-9 0.3 -4.5
       | '-'? INT EXP //1E10 -1E10
       | '-'? INT // -3 45
       ;
fragment INT : '0' | [1-9] [0-9]* ;
fragment EXP : [Ee] [+\-]? INT ; //\- for escape

WS : [ \t\r\n]+ -> skip ;
