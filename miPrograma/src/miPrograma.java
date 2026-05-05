import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;
import java.nio.file.*;

public class miPrograma {
    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            System.err.println("ERROR: No se ha indicado el archivo de entrada.");
            System.err.println("Uso: java miPrograma <archivo.for>");
            return;
        }

        String rutaArchivo = args[0];

        try {
            CharStream input = CharStreams.fromFileName(rutaArchivo);

            gramaticaLexer lexer = new gramaticaLexer(input);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.println("ERROR LÉXICO en línea " + line + ":" + charPositionInLine);
                    System.err.println(msg);
                }
            });

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            gramaticaParser parser = new gramaticaParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.println("ERROR SINTÁCTICO en línea " + line + ":" + charPositionInLine);
                    System.err.println(msg);
                }
            });

            System.out.println("Analizando archivo: " + rutaArchivo + "...");

            // *** AQUÍ ESTÁ LA CLAVE ***
            String codigoC = parser.prg().codigo;

            // Guardar el archivo .c
            String salida = rutaArchivo.replace(".for", ".c");
            Files.writeString(Path.of(salida), codigoC);

            System.out.println("Análisis finalizado.");
            System.out.println("Archivo generado: " + salida);

        } catch (IOException e) {
            System.err.println("ERROR: No se pudo leer el archivo '" + rutaArchivo + "'.");
        }
    }
}
