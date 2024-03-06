package parserManual;

import generated.ElScanner;
import org.antlr.v4.runtime.Token;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;


public class ParserManual {
    private ElScanner elScanner;
    private Token tokenActual;

    public ParserManual(ElScanner elScanner) {
        this.elScanner = elScanner;
        this.tokenActual = this.elScanner.nextToken();
    }

    private void unexpectedToken(Token got, int... expected) {
        String result = Arrays.stream(expected).mapToObj(ElScanner.VOCABULARY::getDisplayName).collect(Collectors.joining(", "));
        throw new RuntimeException(String.format("Unexpected token %s at %d:%d expected %s", ElScanner.VOCABULARY.getDisplayName(got.getType()), got.getLine(), got.getCharPositionInLine(), result));
    }

    private void acceptIt() {
        this.tokenActual = this.elScanner.nextToken();
    }

    private void accept(int expectedToken) {
        if (this.tokenActual.getType() != expectedToken)
            unexpectedToken(this.tokenActual, expectedToken);
        this.tokenActual = this.elScanner.nextToken();
    }

    public void parseProgram() {
        parseSingleCommand();
    }

    public void parseCommand() {
        parseSingleCommand();
        while (this.tokenActual.getType() == ElScanner.PyCOMA) {
            acceptIt();
            parseSingleCommand();
        }
    }

    public void parseSingleCommand() {
        if (this.tokenActual.getType() == ElScanner.ID) {
            acceptIt();
            if (this.tokenActual.getType() == ElScanner.ASSIGN) {
                acceptIt();
                parseExpression();
            } else if (this.tokenActual.getType() == ElScanner.PIZQ) {
                acceptIt();
                parseExpression();
                accept(ElScanner.PDER);
            } else
                unexpectedToken(this.tokenActual, ElScanner.ASSIGN, ElScanner.PIZQ);
        } else if (this.tokenActual.getType() == ElScanner.IF) {
            acceptIt();
            parseExpression();
            accept(ElScanner.THEN);
            parseSingleCommand();
            accept(ElScanner.ELSE);
            parseSingleCommand();
        } else if (this.tokenActual.getType() == ElScanner.WHILE) {
            acceptIt();
            parseExpression();
            accept(ElScanner.DO);
            parseSingleCommand();
        } else if (this.tokenActual.getType() == ElScanner.LET) {
            acceptIt();
            parseDeclaration();
            accept(ElScanner.IN);
            parseSingleCommand();

        } else if (this.tokenActual.getType() == ElScanner.BEGIN) {
            acceptIt();
            parseCommand();
            accept(ElScanner.END);

        } else {
            unexpectedToken(this.tokenActual, ElScanner.BEGIN, ElScanner.LET, ElScanner.WHILE, ElScanner.ID, ElScanner.IF);
        }

    }

    public void parseDeclaration() {
        parseSingleDeclaration();
        while (this.tokenActual.getType() == ElScanner.PyCOMA) {
            parseSingleDeclaration();
        }
    }

    public void parseSingleDeclaration() {
        if (this.tokenActual.getType() == ElScanner.CONST) {
            acceptIt();
            accept(ElScanner.ID);
            accept(ElScanner.VIR);
            parseExpression();
        } else if (this.tokenActual.getType() == ElScanner.VAR) {
            acceptIt();
            accept(ElScanner.ID);
            accept(ElScanner.DOSPUN);
            parseTypeDenoter();
        } else {
            unexpectedToken(this.tokenActual,ElScanner.CONST, ElScanner.VAR);
        }
    }

    public void parseTypeDenoter() {
        if (this.tokenActual.getType() == ElScanner.ID)
            acceptIt();
    }

    public void parseExpression() {
        parsePrimaryExpression();
        while (isOperator(this.tokenActual)) {
            parsePrimaryExpression();
        }
    }

    public void parsePrimaryExpression() {
        if (this.tokenActual.getType() == ElScanner.ID) {
            acceptIt();
        } else if (this.tokenActual.getType() == ElScanner.NUM) {
            acceptIt();
        } else if (this.tokenActual.getType() == ElScanner.PIZQ) {
            acceptIt();
            parseExpression();
            accept(ElScanner.PDER);
        } else {
            unexpectedToken(this.tokenActual,ElScanner.NUM,ElScanner.PIZQ,ElScanner.ID);
        }
    }

    public boolean isOperator(Token token) {
        return token.getType() == ElScanner.SUM || token.getType() == ElScanner.SUB || token.getType() == ElScanner.DIV || token.getType() == ElScanner.MUL;
    }

}
