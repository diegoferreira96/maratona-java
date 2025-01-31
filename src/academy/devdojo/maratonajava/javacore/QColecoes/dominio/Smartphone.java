package academy.devdojo.maratonajava.javacore.QColecoes.dominio;

public class Smartphone {
    private String numberSerial;
    private String marca;    


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numberSerial == null) ? 0 : numberSerial.hashCode());
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        return result;
    }    


    @Override
    public String toString() {
        return "Smartphone [numberSerial=" + numberSerial + ", marca=" + marca + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Smartphone other = (Smartphone) obj;
        if (numberSerial == null) {
            if (other.numberSerial != null)
                return false;
        } else if (!numberSerial.equals(other.numberSerial))
            return false;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        return true;
    }


    public Smartphone(String numberSerial, String marca) {
        this.numberSerial = numberSerial;
        this.marca = marca;
    }


    public String getNumberSerial() {
        return numberSerial;
    }


    public void setNumberSerial(String numberSerial) {
        this.numberSerial = numberSerial;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    

}
