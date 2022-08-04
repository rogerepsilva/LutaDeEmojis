public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria; 
    //Peso leve, peso médio e peso pesado
    private int vitorias, derrotas, empates, life;

    // Métodos
    public void apresentar(){
        System.out.println("Senhoras e senhores, apresento o grandioso " + this.getNome());
        System.out.println("Vindo diretamente do " + this.getNacionalidade() + " com seus " + this.getIdade() + " anos!!");
        System.out.println("Para disputar uma luta na categoria " + this.getCategoria());
        System.out.println("O nosso garanhão tem "+ this.getAltura() + " de altura e pesa " + this.getPeso() + "Kgs");
        System.out.println("Em toda a sua carreira trouxe sua carteira " + this.getVitorias() + " vitórias, " + this.getDerrotas() + " derrotas e " + this.getEmpates() + " empates");
    }
    public void status(){
        System.out.println("Nome: " + this.getNome()); 
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    // Métodos especiais

    public Lutador (
        String nome,
        String nacionalidade,
        int idade,
        float altura,
        float peso,
        int vitorias,
        int derrotas,
        int empates
    ){
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
        this.setLife(100);
        
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public void setNacionalidade(String n){
        this.nacionalidade = n;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float a){
        this.altura = a;
    }
    public float getPeso(){
        return this.peso;
    }
    public void setPeso(float p){
        this.peso = p;
        this.setCategoria();
    }

    public String getCategoria(){
        return this.categoria;

    }
    private void setCategoria(){
        if (this.getPeso() < 52.2) {
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3){
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    public int getVitorias(){
        return this.vitorias;
    }
    public void setVitorias(int v){
        this.vitorias = v;
    }
    public int getDerrotas(){
        return this.derrotas;
    }
    public void setDerrotas(int d){
        this.derrotas = d;
    }
    public int getEmpates(){
        return this.empates;
    }
    public void setEmpates(int e){
        this.empates = e;
    }
    public int getLife(){
        return this.life;
    }
    public void setLife(int life){
        this.life = life;
    }
}
