
package jogodavelha;

public class Campo {   
    boolean estaVazio;//foi criado para informar se o campo esta fazio ou tem alguma informação.
    String simbolo;//È aonde esta sendo armazenado o caracter X ou O do jogo da velha.
    //Construtor: Esta atribuindo verdadeiro ao atributo 'EstaVazio'.
    //O atribuindo um espaço vazio ao atributo 'simbolo' que posteriormente 
    //Podera se tornar 'O' ou 'X'.
    public Campo (){
        this.estaVazio = true;
        this.simbolo = " ";
    }
    //getEstaVazio 
    public boolean getEstaVazio() {
        return this.estaVazio;
    }   
    public void setEstaVazio(boolean estaVazio) {
        this.estaVazio = estaVazio;
    }
    public String getSimbolo(){
        return this.simbolo;
    }    
    //O usuario so podera inserir um caracter se o espaço for vazio e se o caracter inserido for X ou 'O'
    public boolean setSimbolo(String simbolo){
        if (this.estaVazio){// essa função filtra se o usuario vai inserir um caracter aonde se tem caracter.
            if (simbolo.equals("X") || simbolo.equals("O")){//Esta filtrando se o usuario inseriou corretamente 'X' ou 'O'
                this.simbolo = simbolo;
                this.estaVazio = false;
                return true;
            }     
        }
        return false;
    }
    // função reset, limpa todos os campo e retorna o cadrão inicial.
    public void reset(){
        this.simbolo = " ";
        this.estaVazio = true;       
    }
    @Override
    public String toString(){
        if (this.estaVazio) return "-";
        else return this.simbolo;
    }
    public boolean simboloIgual(Campo c){
        if (this.simbolo.equals(c.getSimbolo()) && this.estaVazio == false){
            return true;
        }else{
            return false;   
        }
    }
}