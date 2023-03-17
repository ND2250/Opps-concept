package tatagroup;

public class Runtesttata {
// Method overloading concept - Polymorphism
    static int Electricityexps(int X ,int Y ) {
        return X * Y;

    }

    public static void main(String [] args){

            int obj1 = Electricityexps(12, 56000);
            System.out.println("Expence :" + obj1);


            System.out.println("Technologyf is going to be in a good progress");
            Techologyf TC = new Techologyf();
            TC.Designation();
            TC.Growth();
            TC.Utilities();
            TC.Companyrevenue();
            TC.Electricityexps();
            TC.Salarydate();
            TC.Numbersofemployee();

            System.out.println("Voltasc Produced good profit ");
            Voltasc VC = new Voltasc();
            VC.Companyrevenue();
            VC.Designation();
            VC.Growth();
            VC.Electricityexps();
            VC.Salarydate();
            VC.Numbersofemployee();
            VC.Utilities();

            System.out.println("TCSc making more business from abroad in BPO");
            Tcsc BPO = new Tcsc();
            BPO.Companyrevenue();
            BPO.Designation();
            BPO.Growth();
            BPO.Electricityexps();
            BPO.Salarydate();
            BPO.Numbersofemployee();
            BPO.Utilities();

            System.out.println("As per sales data prediction need to open more sales outlet");
            Cromac EC = new Cromac();
            EC.Companyrevenue();
            EC.Designation();
            EC.Electricityexps();
            EC.Growth();
            EC.Salarydate();
            EC.Numbersofemployee();
            EC.Utilities();

            System.out.println("Income from Hospitality Business");
            Tajhotel HS = new Tajhotel();
            HS.Numbersofemployee();
            HS.Salarydate();
            HS.Companyrevenue();


        }




    }

