
import java.util.Objects;


public class Passenger {
    private String name;
    private String lastname;
    
    public Passenger(){
        this.name=name;
        this.lastname=lastname;
    }
    
    public String toString(){
        return this.name +" "+this.lastname;
    }

    

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Passenger other = (Passenger) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        return true;
    }
    
    
}
