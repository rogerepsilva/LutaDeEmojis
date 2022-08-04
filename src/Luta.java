import java.util.Random;

// Curso Em Vídeo

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    private int damage;

    // Métodos punlivod
    public void marcarLuta(Lutador l1, Lutador l2){
        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }

        // Só mesma categoria
        // Desafiado e desafiante diferentes
        // Luta deve estar aprovada.
        // a vitória de um dos lutadores ou um empate.
    }
    public void lutar(){
        if (this.getAprovada()){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            
            Random dan = new Random();
            int v = 0;
            if (this.desafiado.getCategoria() == "Leve") {
                v = 4;
            } else if (this.desafiado.getCategoria() == "Médio") {
                v = 7;
            } else if (this.desafiado.getCategoria() == "Pesado") {
                v = 10;
            }
            Random i = new Random();
            int vida1 = 100;
            int vida2 = 100;
            while (this.desafiado.getLife() > 0 && this.desafiante.getLife() > 0) {
                
                switch (i.nextInt(v)) {
                    case 1:  // Desafiado bate e Desafiante apanha
                        this.desafiante.setLife(this.desafiante.getLife() - dan.nextInt(v));
                        if (dan.nextInt(v) == 0) {
                            System.out.println(this.desafiante.getNome() + " errou o golpe!"); 
                        } else {
                            vida1 = this.desafiante.getLife();
                            System.out.println("O " + this.desafiado.getNome() + " bate no " + this.desafiante.getNome() + " e machuca ele! Agora ele tem " + vida1 + " pontos de vida!");
                        }
                    break;
                    case 2: // Desafiante bate e Desafiado apanha
                        this.desafiado.setLife(this.desafiado.getLife() - dan.nextInt(v));
                        if (dan.nextInt(v) == 0) {
                            System.out.println(this.desafiado.getNome() + " errou o golpe!"); 
                        } else {
                            vida2 =  this.desafiado.getLife();
                            System.out.println("O " + this.desafiante.getNome() + " bate no " + this.desafiado.getNome() + " e machuca ele! Agora ele tem " + vida2 + " pontos de vida!");
                        }
                    break;
                    default:
                    break;
                }

                    if (this.desafiado.getLife() <= 0) {
                        System.out.println(this.desafiado.getNome() + " Perdeu a luta!");
                        System.out.println("A vitória é do " + this.desafiante.getNome());
                    } else if (this.desafiante.getLife() <= 0) {
                        System.out.println(this.desafiante.getNome() + " Perdeu a luta!");
                        System.out.println("A vitória é do " + this.desafiado.getNome());
                    }

                }

            
                


            

            /*switch(vencedor){
                case 0: // Empate
                System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                break;
                case 1: // Ganhou desafiado
                System.out.println(this.desafiado + " ganhou!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                break;
                case 2: // Ganhou desafiante
                    System.out.println(this.desafiante + " ganhou!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                break;

                default:
                break;
            }*/

        } else {
            System.out.println("Luta não pode acontecer.");
        }
    }
    
    // Métodos especiais
    public Lutador getDesafiado(){
        return this.desafiado;
    }
    public void setDesafiado(Lutador l1){
        this.desafiado = l1;
    }
    public Lutador getDesafiante(){
        return this.desafiante;
    }
    public void setDesafiante(Lutador l2){
        this.desafiante = l2;
    }
    public int getRounds(){
        return this.rounds;
    }
    public void setRouds(){

    }
    public boolean getAprovada(){
        return this.aprovada;
    }
    public void setAprovada(boolean a){
        this.aprovada = a;
    }
    public int getDamage(){
        return this.damage;
    }
    public void setDamage(int d){
        this.damage = d;
    }
    /* 
     * desafiado
     * desafiante
     * rounds
     * aprovada
     * 
     * marcarLuta()
     * lutar()
     */
}
