public class TerraMediaPersonagemFactory extends PersonagemFactory {
    @Override
    public Personagem createPersonagem(TipoPersonagem tipo, String nome) throws Exception {
        if(tipo==TipoPersonagem.MAGO) {
            try {
                return new Mago(nome,10,2,5,3,4);
            } catch (Exception ex ) {
                ex.getMessage();
                return null;
            }
        }
        if(tipo==TipoPersonagem.LADRAO) {
            try {
                return new Ladrao(nome,2,6,8,5,10);
            } catch (Exception ex ) {
                ex.getMessage();
                return null;
            }

        }
        if(tipo==TipoPersonagem.GUERREIRO) {
            try {
                return new Guerreiro(nome,1,8,5,10,6);
            } catch (Exception ex ) {
                ex.getMessage();
                return null;
            }
        }
        return null;
    }
}
