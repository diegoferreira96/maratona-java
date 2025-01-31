package academy.devdojo.maratonajava.javacore.QColecoes.dominio;

import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {
    private Long id;
    private String nome;


    public Consumidor(Long id, String nome) {
        this.id = ThreadLocalRandom.current().nextLong(); // aGera id automaticamente
        this.nome = nome;
    }   
    


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Consumidor other = (Consumidor) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }





    @Override
    public String toString() {
        return "Consumidor [id=" + id + ", nome=" + nome + "]";
    }



    public String getNome() {
        return nome;
    }

    

    

    

}
