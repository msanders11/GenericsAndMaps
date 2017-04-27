package common;

import java.util.Comparator;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * This Comparator implementation offers an alternate way to sort
 * Employee entities -- by LastName
 * 
 * @author jlombardo
 */
public class EmployeeByLastName implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        return e1.getLastName().compareTo(e2.getLastName());
        
//        return new CompareToBuilder()
//                .append(e1.getLastName().compareTo(e2.getLastName())
//                .toComparison();
        
    }
}
