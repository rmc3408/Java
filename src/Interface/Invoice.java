package Interface;

// Invoice class that implements Payable.

public class Invoice implements IPayable
{
   private final String partNumber; 
   private final String partDescription;
   private int quantity;
   private double pricePerItem;

   // constructor
   public Invoice(String partNumber, String partDescription, int quantity,
      double pricePerItem)
   {
      
      this.quantity = quantity;
      this.partNumber = partNumber;
      this.partDescription = partDescription;
      this.pricePerItem = pricePerItem;
   } // end constructor

   // get part number
   public String getPartNumber()
   {
      return partNumber; // should validate
   } 

   // get description
   public String getPartDescription()
   {
      return partDescription;
   } 

   // set quantity
   public void setQuantity(int quantity)
   {
      this.quantity = quantity;
   } 

   // get quantity
   public int getQuantity()
   {
      return quantity;
   }

   // set price per item
   public void setPricePerItem(double pricePerItem)
   {
      this.pricePerItem = pricePerItem;
   } 

   // get price per item
   public double getPricePerItem()
   {
      return pricePerItem;
   } 

   // return String representation of Invoice object
   @Override
   public String toString()
   {
      return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", 
         "invoice", "part number", getPartNumber(), getPartDescription(), 
         "quantity", getQuantity(), "price per item", getPricePerItem());
   } 

   // method required to carry out contract with interface Payable     
   @Override                                                           
   public double getPaymentAmount()                                    
   {                                                                   
      return getQuantity() * getPricePerItem(); // calculate total cost
   } 
} 