

package com.cbfacademy.accounts;

public class CurrentAccount extends Account{
    protected double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit){
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit(){
        return this.overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit){
        if (overdraftLimit >= 0){
        this.overdraftLimit = overdraftLimit;
        }
    }


    @Override 
    public double withdraw(double requested){
        if ((this.balance + this.overdraftLimit) < requested) {
             return 0;
        } else {
            this.balance -= requested;
            return requested;
        }
    }
    // @Override
    // public double withdraw(double requested){
    //     double grant = 0;
    //     if ((this.balance + this.overdraftLimit) >= requested){
    //         // return super.withdraw(requested);
    //         grant = Math.abs(requested);
    //         balance -= grant;
    //     }
    //         return grant;
    //     } 
        
    }

    
