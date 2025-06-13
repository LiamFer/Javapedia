package fundamentals;

import java.util.Optional;

public class recordTest {
    public static void main (String[] args){
        Optional<Empregado> employee = findEmployee();
        if(employee.isPresent()){
            Empregado e = employee.get();
            System.out.println(e);
        }
    }

    public static Optional<Empregado> findEmployee(){
        Empregado e = new Empregado("William",19);
        return Optional.ofNullable(e);
    }
}
