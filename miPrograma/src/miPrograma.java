import org.antlr.v4.runtime.*;
import java.io.IOException;
import java.nio.file.*;

public class miPrograma {

    // Flags para controlar errores
    static boolean huboErrorLexico = false;
    static boolean huboErrorSintactico = false;

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            System.err.println("ERROR: No se ha indicado el archivo de entrada.");
            System.err.println("Uso: java miPrograma <archivo.for>");
            return;
        }

        String rutaArchivo = args[0];

        try {
            CharStream input = CharStreams.fromFileName(rutaArchivo);

            // ============================
            // LÉXICO
            // ============================
            gramaticaLexer lexer = new gramaticaLexer(input);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.println("ERROR LÉXICO en línea " + line + ":" + charPositionInLine);
                    System.err.println(msg);
                    huboErrorLexico = true;
                }
            });

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // ============================
            // SINTÁCTICO
            // ============================
            gramaticaParser parser = new gramaticaParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.println("ERROR SINTÁCTICO en línea " + line + ":" + charPositionInLine);
                    System.err.println(msg);
                    huboErrorSintactico = true;
                }
            });

            System.out.println("Analizando archivo: " + rutaArchivo + "...");

            // ============================
            // EJECUTAR PARSER
            // ============================
            gramaticaParser.PrgContext resultado = parser.prg();

            // ============================
            // COMPROBAR ERRORES
            // ============================
            if (huboErrorLexico || huboErrorSintactico || parser.trad.hayErrores()) {
                System.err.println("Se detectaron errores. No se generará el archivo C.");
                return;
            }

            // ============================
            // OBTENER CÓDIGO C
            // ============================
            String codigoC = resultado.codigo;

            // ============================
            // GUARDAR ARCHIVO C
            // ============================
            Path carpeta = Path.of("TRADUCCIONES");
            if (!Files.exists(carpeta)) {
                Files.createDirectory(carpeta);
            }

            String nombreSalida = Path.of(rutaArchivo)
                    .getFileName()
                    .toString()
                    .replace(".for", ".c");

            Path rutaSalida = carpeta.resolve(nombreSalida);

            Files.writeString(rutaSalida, codigoC);

            System.out.println("Análisis finalizado.");
            System.out.println("Archivo generado: " + rutaSalida);

        } catch (IOException e) {
            System.err.println("ERROR: No se pudo leer el archivo '" + rutaArchivo + "'.");
        }
    }
}
