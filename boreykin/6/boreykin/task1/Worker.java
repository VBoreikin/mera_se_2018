/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

import java.util.Objects;

/**
 *
 * @author flyer
 */
public class Worker extends Employee
{
    private Manager reportsTo;
    
    public Worker(String firstName, String secondName, String lastName, Manager reportsTo) throws ForbiddenSymbols, NoManager
    {
        super(firstName, secondName, lastName);
        if(null != reportsTo)
        {
            this.reportsTo = reportsTo;
        }
        else
        {
            throw new NoManager();
        }
    }
    
    public Worker(String name, Manager reportsTo) throws WrongWordNumberInName, ForbiddenSymbols, NoManager
    {
        super(name);
        if(null != reportsTo)
        {
            this.reportsTo = reportsTo;
        }
        else
        {
            throw new NoManager();
        }
    }

    @Override
    public int hashCode() 
    {
        // Code of this method has been generated by IDE
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.reportsTo);
        return hash;
    }
    
    @Override
    public boolean equals(Object w)
    {
        return (w != null)
            && (w instanceof Worker)
            && (super.equals((Employee)w))
            && (((Worker)w).reportsTo.equals(this.reportsTo));
    }
    
    public Manager getManager()
    {
        return reportsTo;
    }
    
    public void setManager(Manager m)
    {
        this.reportsTo = m;
    }
}
