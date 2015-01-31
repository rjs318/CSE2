//Rachel Shields
//CSE02 Professor Chen
//1-29-15
// The Arithmetic program calculates the cost of the items bought
// at a Walmart based on the number of a type of item, the cost of each type of item,
// and the PA sales tax of 6%
    public class Arithmetic {
        public static void main(String[] args){
            int nSocks=3; //number of pairs of socks
            double sockCost$=2.58; //Cost per pair of socks
            int nGlasses=6;//Number of drinking glasses
            double glassCost$=2.29;//Cost per drinking glass 
            int nEnvelopes=1;//Number of boxes of envelopes
            double envelopeCost$=3.25;//Cost per box of envelopes
            double taxPercent=0.06;//PA 6% sales tax
            //variables used to store results of calculations
            double totalSockCost$, totalGlassCost$, totalEnvelopeCost$, socksSalesTax$, 
            glassSalesTax$, envelopeSalesTax$, totalTax$, totalPurchaseCost$, totalPaid$;
            // prints the items being bought, their quantity, and their individual cost
            System.out.println("The item being bought is a pair of socks.");
            System.out.println("The number of pairs being bought is: "+nSocks);
            System.out.println("The cost per pair of socks is: $"+sockCost$);
            System.out.println("");
            System.out.println("The item being bought is a drinking glass.");
            System.out.println("The number of glasses being bought is: "+nGlasses);
            System.out.println("The cost per glass is: $"+glassCost$);
            System.out.println("");
            System.out.println("The item being bought is a box of envelopes.");
            System.out.println("The number of boxes being bought is: "+nEnvelopes);
            System.out.println("The cost per box: $"+envelopeCost$);
            System.out.println("");
            //calculates total cost for each item as well as the total sales tax for each item
            totalSockCost$=nSocks*sockCost$;
            totalGlassCost$=nGlasses*glassCost$;
            totalEnvelopeCost$=nEnvelopes*envelopeCost$;
            socksSalesTax$=totalSockCost$*taxPercent;
                //eliminates digits more than two past the decimal
                socksSalesTax$=socksSalesTax$*100;
                socksSalesTax$=(int) socksSalesTax$;
                socksSalesTax$/=100;
            glassSalesTax$=totalGlassCost$*taxPercent;
                glassSalesTax$=glassSalesTax$*100;
                glassSalesTax$=(int) glassSalesTax$;
                glassSalesTax$/=100;
            envelopeSalesTax$=totalEnvelopeCost$*taxPercent;
                envelopeSalesTax$=envelopeSalesTax$*100;
                envelopeSalesTax$=(int) envelopeSalesTax$;
                envelopeSalesTax$/=100;
            //calculates the total sales tax on the purchase, the total price of the purchase without
            // tax, and total price of the purchase including tax (amount paid)
            totalTax$=socksSalesTax$+glassSalesTax$+envelopeSalesTax$;
            totalPurchaseCost$=totalSockCost$+totalEnvelopeCost$+totalGlassCost$;
            totalPaid$=totalPurchaseCost$+totalTax$;
            // prints the total cost for each item as well as the total sales tax for that item
            System.out.println("The total cost for the socks is: $"+totalSockCost$);
            System.out.println("The total sales tax for the socks is: $"+socksSalesTax$);
            System.out.println("");
            System.out.println("The total cost for the glass/glasses is: $"+totalGlassCost$);
            System.out.println("The total sales tax for glass/glasses is: $"+glassSalesTax$);
            System.out.println("");
            System.out.println("The total cost for the envelopes is: $"+totalEnvelopeCost$);
            System.out.println("The total sales tax for the envelopes is: $"+envelopeSalesTax$);
            System.out.println("");
            //prints the the total cost of the purchase before tax, the total sales tax, and
            //the total price of the purchase including tax (amount paid)
            System.out.println("The total sales tax for the entire purchase is: $"+totalTax$);
            System.out.println("The total cost of the purchase before tax is: $"+totalPurchaseCost$);
            System.out.println("The total cost of the purchase including tax is: $"+totalPaid$);
        }//end of main method
    }//end of class

