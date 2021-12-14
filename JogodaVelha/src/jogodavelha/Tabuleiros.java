
package jogodavelha;

public class Tabuleiros {
    private Campo[][] matriz;
    
    //Método que é chamado na construção do objeto.
    public Tabuleiros(){
        matriz = new Campo[3][3];
        for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                matriz[i][j] = new Campo();   
            }
            
        }
        
    }
    public boolean setSimbolo(int i, int c, String simbolo){
        if (c < 0 || c > 2) return false;
        if (i < 0 || i > 2) return false;
        
        return matriz[i][c].setSimbolo(simbolo);
    }
    public String getSimbolo(int i, int c){
           return matriz[i][c].getSimbolo();
    }
    
    public boolean getEstaVazio(int i, int c){
        return matriz[i][c].getEstaVazio();
    }
    public void reset(){
        for (int i = 0; i < 3; i++) {
            for (int c = 0; c < 3; c++) {
                matriz[i][c].reset();
            }
        }
    }
    
    @Override
    public String toString(){
        String retorno;
        retorno = matriz[0][0].toString() + "|" + matriz[0][1].toString() + "|" + matriz[0][2].toString() + "\n";
        retorno += matriz[1][0].toString() + "|" + matriz[1][1].toString() + "|" + matriz[1][2].toString() + "\n";
        retorno += matriz[2][0].toString() + "|" + matriz[2][1].toString() + "|" + matriz[2][2].toString();
        return retorno;
    }
    //Se X ganha, retorna x.
    //se O ganha, retorna O.
    //se emparata, retorna E.
    //se ninguem ganhou ainda retorna N.
    public String verificarGanhador(){
        for (int i = 0; i < 3; i++) {
            if (matriz[i][0].simboloIgual(matriz[i][1])
                    && matriz[i][0].simboloIgual(matriz[i][2])){
                return matriz[i][0].getSimbolo(); 
            }
        }
        for (int i = 0; i < 3; i++) {
            if (matriz[0][i].simboloIgual(matriz[1][i])
                 && matriz[0][i].simboloIgual(matriz[2][i])){
             return matriz[0][i].getSimbolo();   
                
            }
        }
        if (matriz[0][0].simboloIgual(matriz[1][1])
                && matriz[0][0].simboloIgual(matriz[2][2])){
             return matriz[0][0].getSimbolo();   
                
            }
        if (matriz[0][0].simboloIgual(matriz[1][1])
                && matriz[0][0].simboloIgual(matriz[2][2])){
             return matriz[0][0].getSimbolo();   
                
            }
         if (matriz[0][2].simboloIgual(matriz[1][1])
                 && matriz[0][2].simboloIgual(matriz[2][0])){
             return matriz[0][2].getSimbolo();       
         }
         if (this.haCamposVazios()){
             return "N";
         }
             return "E";
    }
    public boolean haCamposVazios(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j].getEstaVazio()) {
                    return true;
                }
            }
        }
    return false;
    }
}
