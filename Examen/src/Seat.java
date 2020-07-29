
import java.util.Objects;


public class Seat {
    private int row;
    private String col;
    private Passenger passenger;
    
    public Seat(int row, String col){
        this.col=col;
        this.row=row;
    }
    
    public boolean isFree(){
        if(passenger.equals("null")){
            return true;
        }
        
        return false;
    }
    public String toString(){
        
        return "Aciento:"+this.row+this.row+","+ this.isFree()+"."+" Pasajero:"+this.passenger;
    }
    public int getRow() {
        return row;
    }

    public String getCol() {
        return col;
    }

    

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(String col) {
        this.col = col;
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Seat other = (Seat) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.col != other.col) {
            return false;
        }
        if (!Objects.equals(this.passenger, other.passenger)) {
            return false;
        }
        return true;
    }

    
    
    
}
