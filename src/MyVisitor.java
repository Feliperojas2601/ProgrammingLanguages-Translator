import java.util.HashMap;

public class MyVisitor<T> extends GrammarBaseVisitor<T> {

    HashMap<String, Object> table = new HashMap<>();

    @Override
    public T visitPrograma(GrammarParser.ProgramaContext ctx){
        System.out.print("hola");
        return null;
    }

}