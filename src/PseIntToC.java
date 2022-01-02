public class PseIntToC extends GrammarBaseListener {

    @Override
    public void enterPrograma(GrammarParser.ProgramaContext ctx) {
        System.out.print('"');
    }

    @Override
    public void exitPrograma(GrammarParser.ProgramaContext ctx) {
        System.out.print('"');
    }
}
