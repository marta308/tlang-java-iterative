// Generated from spec/TLangParser.parser
// this code is inlined before the generated parser
 package AST; 
import java.util.ArrayList;
import beaver.*;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "TLangParser.beaver".
 */
public class TLangParser extends Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short IDENTIFIER = 1;
		static public final short LPAREN = 2;
		static public final short RPAREN = 3;
		static public final short LBRACE = 4;
		static public final short RBRACE = 5;
		static public final short LSQUARE = 6;
		static public final short RSQUARE = 7;
		static public final short CLASS = 8;
		static public final short SEMI = 9;

		static public final String[] NAMES = {
			"EOF",
			"IDENTIFIER",
			"LPAREN",
			"RPAREN",
			"LBRACE",
			"RBRACE",
			"LSQUARE",
			"RSQUARE",
			"CLASS",
			"SEMI"
		};
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9njaBjE0p4KH6Ttio#JG0W42YGG4YqjWWOgAWeaQE03#0$#car2SZc#taWBnDAPEnw$BUd" +
		"3rhPM0S5TYQvifHCet5NeqfRq77I2TjRf46RkX6vieoCuTYTqOGkgq#ktMgf5rHH6Q8lELJ" +
		"EszNjgaYSJTQenUPjM3ERjww3VPQxSld2PWWhbAbNX6qzQak39g4$2lwGYoMB2tL9IazJ3X" +
		"5h0xoHfIjA9WTkNEtnScyvfOlKLV#Pv5lsOVKy$vUq6xf9bjdpi0HxzPyHRfITuXZcymZlC" +
		"uXvm3XTm2MTm1TVztczcraM$XNOBnQ1$3w7tB$7yuVnTzAtXfXblYUGW$$70dmRwqKz#0AK" +
		"HVb8=");
 // Generated from spec/TLangParser.parser
// this code is inlined in the generated parser class

	public TLangParser() {
		super(PARSING_TABLES);
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		switch(rule_num) {
			case 0: // goal = declaration_list.declaration_list
			{
					final Symbol _symbol_declaration_list = _symbols[offset + 1];
					final List declaration_list = (List) _symbol_declaration_list.value;
					 ASTNode _node_ = new CompilationUnit(declaration_list);
        _node_.setStart(Symbol.getLine(_symbol_declaration_list.getStart()), (short) Symbol.getColumn(_symbol_declaration_list.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_declaration_list.getEnd()), (short) Symbol.getColumn(_symbol_declaration_list.getEnd()));
        return new Symbol(_node_);
			}
			case 1: // declaration_list = declaration.declaration
			{
					final Symbol _symbol_declaration = _symbols[offset + 1];
					final Declaration declaration = (Declaration) _symbol_declaration.value;
					 ASTNode _node_ = new List().add(declaration);
        _node_.setStart(Symbol.getLine(_symbol_declaration.getStart()), (short) Symbol.getColumn(_symbol_declaration.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_declaration.getEnd()), (short) Symbol.getColumn(_symbol_declaration.getEnd()));
        return new Symbol(_node_);
			}
			case 2: // declaration_list = declaration_list.declaration_list declaration.declaration
			{
					final Symbol _symbol_declaration_list = _symbols[offset + 1];
					final List declaration_list = (List) _symbol_declaration_list.value;
					final Symbol _symbol_declaration = _symbols[offset + 2];
					final Declaration declaration = (Declaration) _symbol_declaration.value;
					 ASTNode _node_ = declaration_list.add(declaration);
        _node_.setStart(Symbol.getLine(_symbol_declaration_list.getStart()), (short) Symbol.getColumn(_symbol_declaration_list.getStart()));
        _node_.setEnd(Symbol.getLine(_symbol_declaration.getEnd()), (short) Symbol.getColumn(_symbol_declaration.getEnd()));
        return new Symbol(_node_);
			}
			case 3: // declaration_list = 
			{
					 return new Symbol(new List());
			}
			case 4: // declaration = CLASS.CLASS IDENTIFIER.IDENTIFIER LBRACE.LBRACE declaration_list.declaration_list RBRACE.RBRACE
			{
					final Symbol CLASS = _symbols[offset + 1];
					final Symbol IDENTIFIER = _symbols[offset + 2];
					final Symbol LBRACE = _symbols[offset + 3];
					final Symbol _symbol_declaration_list = _symbols[offset + 4];
					final List declaration_list = (List) _symbol_declaration_list.value;
					final Symbol RBRACE = _symbols[offset + 5];
					 ASTNode _node_ = new ClassDeclaration(((String)IDENTIFIER.value), declaration_list);
        _node_.setStart(Symbol.getLine(CLASS.getStart()), (short) Symbol.getColumn(CLASS.getStart()));
        _node_.setEnd(Symbol.getLine(RBRACE.getEnd()), (short) Symbol.getColumn(RBRACE.getEnd()));
        return new Symbol(_node_);
			}
			case 5: // declaration = IDENTIFIER.IDENTIFIER LPAREN.LPAREN declaration_list.params RPAREN.RPAREN LBRACE.LBRACE declaration_list.locals RBRACE.RBRACE
			{
					final Symbol IDENTIFIER = _symbols[offset + 1];
					final Symbol LPAREN = _symbols[offset + 2];
					final Symbol _symbol_params = _symbols[offset + 3];
					final List params = (List) _symbol_params.value;
					final Symbol RPAREN = _symbols[offset + 4];
					final Symbol LBRACE = _symbols[offset + 5];
					final Symbol _symbol_locals = _symbols[offset + 6];
					final List locals = (List) _symbol_locals.value;
					final Symbol RBRACE = _symbols[offset + 7];
					 ASTNode _node_ = new MethodDeclaration(((String)IDENTIFIER.value), params, locals);
        _node_.setStart(Symbol.getLine(IDENTIFIER.getStart()), (short) Symbol.getColumn(IDENTIFIER.getStart()));
        _node_.setEnd(Symbol.getLine(RBRACE.getEnd()), (short) Symbol.getColumn(RBRACE.getEnd()));
        return new Symbol(_node_);
			}
			case 6: // declaration = IDENTIFIER.IDENTIFIER SEMI.SEMI
			{
					final Symbol IDENTIFIER = _symbols[offset + 1];
					final Symbol SEMI = _symbols[offset + 2];
					 ASTNode _node_ = new FieldDeclaration(((String)IDENTIFIER.value));
        _node_.setStart(Symbol.getLine(IDENTIFIER.getStart()), (short) Symbol.getColumn(IDENTIFIER.getStart()));
        _node_.setEnd(Symbol.getLine(SEMI.getEnd()), (short) Symbol.getColumn(SEMI.getEnd()));
        return new Symbol(_node_);
			}
			case 7: // declaration = LSQUARE.LSQUARE LSQUARE.LSQUARE_ IDENTIFIER.IDENTIFIER RSQUARE.RSQUARE RSQUARE.RSQUARE_
			{
					final Symbol LSQUARE = _symbols[offset + 1];
					final Symbol LSQUARE_ = _symbols[offset + 2];
					final Symbol IDENTIFIER = _symbols[offset + 3];
					final Symbol RSQUARE = _symbols[offset + 4];
					final Symbol RSQUARE_ = _symbols[offset + 5];
					 ASTNode _node_ = new DeclarationHook(((String)IDENTIFIER.value));
        _node_.setStart(Symbol.getLine(LSQUARE.getStart()), (short) Symbol.getColumn(LSQUARE.getStart()));
        _node_.setEnd(Symbol.getLine(RSQUARE_.getEnd()), (short) Symbol.getColumn(RSQUARE_.getEnd()));
        return new Symbol(_node_);
			}
			default:
				throw new IllegalArgumentException("unknown production #" + rule_num);
		}
	}
}