package academy.devdojo.maratonajava.javacore.QColecoes.dominio;

public class TimesFutebol implements Comparable<TimesFutebol>{
    private Long id;
    private String nome;
    private double pontuacaoConmebol;
    private int quantidadeLibertadores;

    public TimesFutebol(Long id, String nome, double pontuacaoConmebol) {
        this.id = id;
        this.nome = nome;
        this.pontuacaoConmebol = pontuacaoConmebol;
    }   


    public TimesFutebol(Long id, String nome, double pontuacaoConmebol, int quantidadeLibertadores) {
        this(id, nome, pontuacaoConmebol);
        this.quantidadeLibertadores = quantidadeLibertadores;
    }     


    @Override
    public String toString() {
        return "TimesFutebol [id=" + id + ", nome=" + nome + ", pontuacaoConmebol=" + pontuacaoConmebol
                + ", quantidadeLibertadores=" + quantidadeLibertadores + "]";
    }
    


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TimesFutebol other = (TimesFutebol) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

//  O compareTo não pode ser usado em tipos primitivos como double, string, int...
//  Só assim para usar o tipo primitivo no compareTo Double.valueOf(time).compareTo.getId());
    public double getPontuacaoConmebol() {
        return pontuacaoConmebol;
    }


    public void setPontuacaoConmebol(double pontuacaoConmebol) {
        this.pontuacaoConmebol = pontuacaoConmebol;
    }


    public int getQuantidadeLibertadores() {
        return quantidadeLibertadores;
    }


    public void setQuantidadeLibertadores(int quantidadeLibertadores) {
        this.quantidadeLibertadores = quantidadeLibertadores;
    }     


    @Override
    public int compareTo(TimesFutebol time) {
//  return this.id.compareTo(time.getId()); // ordenando por id.
        return this.nome.compareTo(time.getNome()); // ordenando por nome.  

//  O compareTo não pode ser usado em tipos primitivos como double, string, int...
//  return Double.compare(pontuacaoConmebol, time.getPontuacaoConmebol()); // ordenando por pontuacaoConmebol (tipo primitivo)
    }


    public char[] reverse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reverse'");
    }    

}
