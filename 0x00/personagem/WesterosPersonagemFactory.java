public class WesterosPersonagemFactory extends PersonagemFactory {
    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nome) throws Exception {
        if(tipo==TipoPersonagem.MAGO) {
            try {
                return new Mago(nome,8,3,3,3,4);
            } catch (Exception ex ) {
                ex.getMessage();
                return null;
            }
        }
        if(tipo==TipoPersonagem.LADRAO) {
            try {
                return new Ladrao(nome,1,8,7,7,10);
            } catch (Exception ex ) {
                ex.getMessage();
                return null;
            }

        }
        if(tipo==TipoPersonagem.GUERREIRO) {
            try {
                return new Guerreiro(nome,0,9,7,10,7);
            } catch (Exception ex ) {
                ex.getMessage();
                return null;
            }
        }
        return null;
    }
}
