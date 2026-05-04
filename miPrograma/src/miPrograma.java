import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

public class miPrograma {
    public static void main(String[] args) throws Exception {

        // COMPROBAR
        if (args.length == 0) {
            System.err.println("ERROR: No se ha indicado el archivo de entrada.");
            System.err.println("Uso: java -jar miPrograma.jar <nombre_archivo.txt>");
            return;
        }

        //USAR EL PRIMER ARGUMENTO COMO RUTA DEL ARCHIVO
        String rutaArchivo = args[0];

        try {
            // Cargar el fichero indicado en el argumento
            CharStream input = CharStreams.fromFileName(rutaArchivo);

            // Configurar el Lexer
            gramaticaLexer lexer = new gramaticaLexer(input);

            // Personalización de notificación de error léxico
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.println("\n--------------------------------------------------");
                    System.err.println(" ERROR LÉXICO (Símbolo no reconocido)");
                    System.err.println(" Línea " + line + ":" + charPositionInLine + " -> " + msg);
                    System.err.println("-------------------------------------------------");
                }
            });

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Ejecutar el Parser
            gramaticaParser parser = new gramaticaParser(tokens);

            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg, RecognitionException e) {

                    // Personalización de notificación de error sintáctico
                    System.err.println("\n###########################################################");
                    System.err.println(">> ERROR SINTÁCTICO DETECTADO");
                    System.err.println(">> Línea: " + line + " | Posición: " + charPositionInLine);
                    System.err.println(">> Detalle: " + msg);

                    if (offendingSymbol instanceof Token) {
                        System.err.println(">> Token que falló: '" + ((Token) offendingSymbol).getText() + "'");
                    }
                    System.err.println("#############################################################\n");
                }
            });

            // Lanzar el análisis
            System.out.println("Iniciando análisis del archivo: " + rutaArchivo + "...");
            parser.prg(); // Llama a la regla inicial
            System.out.println("Análisis finalizado.");

        } catch (IOException e) {
            System.err.println("ERROR: No se pudo leer el archivo '" + rutaArchivo + "'. Asegúrate de que existe.");
        }
    }
}