
import java.util.ArrayList;


public class Plane {
    private int rowls;
    private int cols;
    private ArrayList<Seat>seats;
    
    public Plane(){
          this.cols=cols;
          this.rowls=rowls;
          ArrayList<Seat> seats=new ArrayList<>();
      } 

    
    public String  toString(){
        
        
        int i, j = 0;
        

        int[][] A = new int[rowls][cols]; 

       
       
        for (i = 0; i < rowls; i++) {
            for (j = 0; j < cols; j++) {
                
               
      
    }
  }
        return "A[" + i + "][" + j + "]= ";
 }
    public int getRowls() {
        return rowls;
    }

    public int getCols() {
        
        return cols;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setRowls(int rowls) {
        this.rowls = rowls;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }
    
    
}
